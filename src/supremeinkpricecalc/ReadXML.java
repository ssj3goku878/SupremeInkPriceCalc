/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supremeinkpricecalc;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author Archa
 */
public class ReadXML {

    public static void main(String args[]) throws Exception {
        DocumentBuilderFactory buildFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dBuilder = buildFactory.newDocumentBuilder();
            Document document = dBuilder.parse(ReadXML.class.getResourceAsStream("data.xml"));
            document.normalize();

            //get main node
            NodeList rootNodes = document.getElementsByTagName("inventory");
            Node rootNode = rootNodes.item(0);
            Element rootElement = (Element) rootNode;

            //print all with specific tag
            NodeList inventoryList = rootElement.getElementsByTagName("Product");
            for (int i = 0; i < inventoryList.getLength(); i++) {
                Node pantone = inventoryList.item(i);
                Element pantoneElement = (Element) pantone;

            //if element is blank, do not print
                System.out.println("Pantone: " + pantoneElement.getAttribute("pantone")); // print attribute
                System.out.println("Yellow: " + pantoneElement.getAttribute("Yellow"));
                System.out.println("L/F Yellow: " + pantoneElement.getAttribute("Yellow02"));
                System.out.println("021 Orange: " + pantoneElement.getAttribute("Orange"));
                System.out.println("Warm Red: " + pantoneElement.getAttribute("wred"));
                System.out.println("032: " + pantoneElement.getAttribute("othirtytwo"));
                System.out.println("Rubine: " + pantoneElement.getAttribute("Rubine"));
                System.out.println("Rhodamin: " + pantoneElement.getAttribute("Rhodamin"));
                System.out.println("Purple: " + pantoneElement.getAttribute("Purple"));
                System.out.println("Violet: " + pantoneElement.getAttribute("Violet"));
                System.out.println("072: " + pantoneElement.getAttribute("oseventytwo"));
                System.out.println("L/F Reflex: " + pantoneElement.getAttribute("Reflex02"));
                System.out.println("Blue: " + pantoneElement.getAttribute("Blue"));
                System.out.println("Green: " + pantoneElement.getAttribute("Green"));
                System.out.println("Black: " + pantoneElement.getAttribute("Black"));
                System.out.println("White: " + pantoneElement.getAttribute("White"));
                
//                <Product  pantone = "100" Yellow = "3.10" Yellow02 = "0" Orange = "0" wred = "0" othirtytwo = "0" Rubine = "0" Rhodamin = "0" Purple = "0" 
//                Violet = "0" oseventytwo = "0" Reflex = "0" Reflex02 = "0" Blue = "0" Green = "0" 
//                Black = "0" White = "96.90" > 

            
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
        }

    }
}
