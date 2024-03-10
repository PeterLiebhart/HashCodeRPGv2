package Tests;

import dataClasses.Entity;
import dataClasses.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import serviceClasses.Combat;

import java.util.stream.Stream;

public class CombatTests {

    private static Player player = Player.getInstance("TestPlayer", 100, 10, 5);
    private Combat.CombatCallback callback = new Combat.CombatCallback() {
        @Override
        public void onDamageApplied(int damage, Entity entity) {
        }

        @Override
        public void onHealApplied(int amount, Entity entity) {
        }

        @Override
        public void onEntityDeath(Entity entity) {
        }

        @Override
        public void onHealthAlreadyFull(Entity entity) {
        }
    };
    Combat combat = new Combat(callback);

    @BeforeEach
    void setUp() {
        player = Player.getInstance("Test", 50, 10, 5);
        player.reset("Test", 50, 10, 5);
    }


    @ParameterizedTest
    @CsvSource({
            "10, 5, 5",
            "10, 10, 0",
            "10, 15, -5",
            "10, 0, 10",
            "0, 10, -10",
            "0, 0, 0"
    })
    void testCalculateDamage(int AP, int armor, int expected) {
        int result = combat.calculateDamage(AP, armor);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("applyHealProvider")
    void testApplyHeal(int amountOfHeal, Entity entity , int expected) {
        combat.applyHeal(amountOfHeal, entity);
        Assertions.assertEquals(expected, entity.getHP());
    }
    static Stream<Arguments> applyHealProvider() {
        return Stream.of(
                Arguments.of(10, new Entity("Test", 50, 10, 5), 60),
                Arguments.of(10, new Entity("Test", 100, 10, 5), 100),
                Arguments.of(10, new Entity("Test", 90, 10, 5), 100),
                Arguments.of(10, new Entity("Test", 0, 10, 5), 10),
                Arguments.of(10, new Entity("Test", 0, 10, 5), 10),
                Arguments.of(20, player, 70)
        );
    }

    @ParameterizedTest
    @MethodSource("applyDamageProvider")
    void testApplyDamage(int damage, Entity entity, int expected) {
        combat.applyDamage(damage, entity);
        Assertions.assertEquals(expected, entity.getHP());
    }
    static Stream<Arguments> applyDamageProvider() {
        return Stream.of(
                Arguments.of(10, new Entity("Test", 50, 10, 5), 40),
                Arguments.of(10, new Entity("Test", 10, 10, 5), 0),
                Arguments.of(10, new Entity("Test", 10, 10, 5), 0),
                Arguments.of(10, new Entity("Test", 0, 10, 5), 0),
                Arguments.of(10, new Entity("Test", 0, 10, 5), 0),
                Arguments.of(20, player, 30)
        );
    }
}
