package serviceClasses.Initializers.Data;

import dataClasses.Enemies.Entity;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

import static serviceClasses.XML.XMLReader.readXMLDocument;

public class EntityInitializer {
    public static Entity initializeEntity(String filepath) {
        Entity player = null;
        org.w3c.dom.Document doc = readXMLDocument(filepath);
        NodeList nList = doc.getElementsByTagName("Entity");

        Node nNode = nList.item(0);
        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            Element eElement = (Element) nNode;

            String name = eElement.getElementsByTagName("name").item(0).getTextContent();
            String health = eElement.getElementsByTagName("health").item(0).getTextContent();
            String attack = eElement.getElementsByTagName("attack").item(0).getTextContent();
            String level = eElement.getElementsByTagName("level").item(0).getTextContent();

            player = new Entity(true, name, Double.parseDouble(level), Double.parseDouble(health), Double.parseDouble(attack));
        }
        return player;
    }
}
