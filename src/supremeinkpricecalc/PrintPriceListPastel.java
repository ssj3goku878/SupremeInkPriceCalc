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
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author BlackAngel
 */
public class PrintPriceListPastel {

    static int Pounds = 1; // pounds orderd
    static double Yellow0131 = 12.50;
    static double RED0331 = 13.50;
    static double Magenta0521 = 14.60;
    static double Violet0631 = 16.50;
    static double Blue0821 = 11.25;
    static double Green0921 = 13.50;
    static double Black0961 = 7.50;
    static double Extender = 7.50;
    static double EightZeroOne = 0;
    static double EightZeroTwo = 0;
    static double EightZeroThree = 0;
    static double EightZeroFour = 0;
    static double EightZeroFive = 0;
    static double EightZeroSix = 0;

    public static void main(String args[]) throws Exception {
        DocumentBuilderFactory buildFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dBuilder = buildFactory.newDocumentBuilder();
            Document document = dBuilder.parse(ReadXML.class.getResourceAsStream("PastelColors.xml"));
            document.normalize();

            //get main node
            NodeList rootNodes = document.getElementsByTagName("inventory");
            Node rootNode = rootNodes.item(0);
            Element rootElement = (Element) rootNode;

            //print all with specific tag
            NodeList inventoryList = rootElement.getElementsByTagName("product");
            for (int i = 0; i < inventoryList.getLength(); i++) {
                Node pantone = inventoryList.item(i);
                Element pantoneElement = (Element) pantone;

                //Convert all String nodes into double  
                String SYellow = pantoneElement.getAttribute("yellow");
                double DYellow = Double.parseDouble(SYellow);
                String SMagenta = pantoneElement.getAttribute("magenta");
                double DMagenta = Double.parseDouble(SMagenta);
                String SViolet = pantoneElement.getAttribute("violet");
                double DViolet = Double.parseDouble(SViolet);
                String SBlue = pantoneElement.getAttribute("blue");
                double DBlue = Double.parseDouble(SBlue);
                String SGreen = pantoneElement.getAttribute("green");
                double DGreen = Double.parseDouble(SGreen);
                String SRed = pantoneElement.getAttribute("red");
                double DRed = Double.parseDouble(SRed);
                String SBlack = pantoneElement.getAttribute("black");
                double DBlack = Double.parseDouble(SBlack);
                String SExtender = pantoneElement.getAttribute("extender");
                double DExtender = Double.parseDouble(SExtender);

                double y = Yellow0131 / 100 * DYellow;
                double mg = Magenta0521 / 100 * DMagenta;
                double vi = Violet0631 / 100 * DViolet;
                double bl = Blue0821 / 100 * DBlue;
                double blk = Black0961 / 100 * DBlack;
                double rd = RED0331 / 100 * DRed;
                double gr = Green0921 / 100 * DGreen;
                double ext = Extender / 100 * DExtender;

                double RawMatnumDouble = y + mg + vi + bl + blk + rd + gr + ext;

                double FinalTotalDouble = RawMatnumDouble * Pounds;
                //System.out.println(pantoneElement.getAttribute("pantone"));
                System.out.println("$" + FinalTotalDouble); 
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {

        }
    }

}
