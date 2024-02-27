package serviceClasses.Saving;

import dataClasses.Enemies.Player;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.IOException;

public class Save {
    static String xml = "C:\\Users\\everyone codes\\IdeaProjects\\Save\\";

    public static void saveToXML() {
        Player.getInstance();
        Document dom;
        Element e = null;

        // instance of a DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use factory to get an instance of document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // create instance of DOM
            dom = db.newDocument();

            // create the root element
            Element rootEle = dom.createElement("Entity");

            // create data elements and place them under root
            e = dom.createElement("Name");
            e.appendChild(dom.createTextNode(Player.getPlayerName()));
            rootEle.appendChild(e);

            e = dom.createElement("health");
            e.appendChild(dom.createTextNode(String.valueOf(Player.getPlayerEntity().getCurrentHealth())));
            rootEle.appendChild(e);

            e = dom.createElement("level");
            e.appendChild(dom.createTextNode(String.valueOf(Player.getPlayerEntity().getLevel())));
            rootEle.appendChild(e);

            e = dom.createElement("attack");
            e.appendChild(dom.createTextNode(String.valueOf(Player.getPlayerEntity().getAttack())));
            rootEle.appendChild(e);

            dom.appendChild(rootEle);

            try {
                Transformer tr = TransformerFactory.newInstance().newTransformer();
                tr.setOutputProperty(OutputKeys.INDENT, "yes");
                tr.setOutputProperty(OutputKeys.METHOD, "xml");
                tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                tr.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "roles.dtd");
                tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

                // send DOM to file
                tr.transform(new DOMSource(dom),
                        new StreamResult(new FileOutputStream(xml + Player.getPlayerName() + ".xml")));

            } catch (TransformerException | IOException te) {
                System.out.println(te.getMessage());
            }
        } catch (ParserConfigurationException pce) {
            System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
        }
    }
}
