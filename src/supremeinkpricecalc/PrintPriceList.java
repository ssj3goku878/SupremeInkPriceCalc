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
 * @author Archa
 */
public class PrintPriceList {
    static int Pounds = 100; // pounds orderd
    static double YellowPrice = 9.35; //Yellow
    static double Yellow02Price = 10.30; //012 Yellow
    static double OrangePrice = 13.75; //021 Orange
    static double WarmRedPrice = 9.35; //Warm Red
    static double othirtytwoPrice = 10.50; //032
    static double RubinePrice = 7.50; //Rubine Red
    static double RhodaminPrice = 16.50; //Rhodamin Red
    static double PurplePrice = 16.50; //Purple
    static double VioletPrice = 18.75; //Violet
    static double oseventytwoPrice = 16.50; //072
    static double ReflexPrice = 14.50; //Regular Reflex. original 7.50. changed to 14.50
    static double Reflex02Price = 14.50; //AQ Reflex
    static double BluePrice = 7.50; //Proc Blue
    static double GreenPrice = 10.60; //Proc Green
    static double BlackPrice = 7.50; //Proc Black
    static double WhitePrice = 7.50; //Trans White

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

                
                
                //Convert all String nodes into double  
                String SYellow = pantoneElement.getAttribute("Yellow");
                double DYellow = Double.parseDouble(SYellow);

                String SYellow02 = pantoneElement.getAttribute("Yellow02");
                double DYellow02 = Double.parseDouble(SYellow02);

                String SOrange = pantoneElement.getAttribute("Orange");
                double DOrange = Double.parseDouble(SOrange);

                String Swred = pantoneElement.getAttribute("wred");
                double Dwred = Double.parseDouble(Swred);

                String Sothirtytwo = pantoneElement.getAttribute("othirtytwo");
                double Dothirtytwo = Double.parseDouble(Sothirtytwo);

                String SRubine = pantoneElement.getAttribute("Rubine");
                double DRubine = Double.parseDouble(SRubine);

                String SRhodamin = pantoneElement.getAttribute("Rhodamin");
                double DRhodamin = Double.parseDouble(SRhodamin);

                String SPurple = pantoneElement.getAttribute("Purple");
                double DPurple = Double.parseDouble(SPurple);

                String SViolet = pantoneElement.getAttribute("Violet");
                double DViolet = Double.parseDouble(SViolet);

                String SOseventytwo = pantoneElement.getAttribute("oseventytwo");
                double DOseventytwo = Double.parseDouble(SOseventytwo);

                String SReflex = pantoneElement.getAttribute("Reflex");
                double DReflex = Double.parseDouble(SReflex);

                String SReflex02 = pantoneElement.getAttribute("Reflex02");
                double DReflex02 = Double.parseDouble(SReflex02);

                String SBlue = pantoneElement.getAttribute("Blue");
                double DBlue = Double.parseDouble(SBlue);

                String SGreen = pantoneElement.getAttribute("Green");
                double DGreen = Double.parseDouble(SGreen);

                String SBlack = pantoneElement.getAttribute("Black");
                double DBlack = Double.parseDouble(SBlack);

                String SWhite = pantoneElement.getAttribute("White");
                double DWhite = Double.parseDouble(SWhite);

                double y = YellowPrice /  100 * DYellow;
                double ytwo = Yellow02Price / 100 * DYellow02;
                double or = OrangePrice /  100 * DOrange;
                double wr = WarmRedPrice / 100 * Dwred;
                double othtwo = othirtytwoPrice / 100 * Dothirtytwo;
                double ru = RubinePrice /  100 * DRubine;
                double rh = RhodaminPrice / 100 * DRhodamin;
                double pur = PurplePrice /  100 * DPurple;
                double vio = VioletPrice /  100 * DViolet;
                double osevtwo = oseventytwoPrice / (float) 100 * DOseventytwo;
                double ref = ReflexPrice / 100 * DReflex;
                double reftwo = Reflex02Price /  100 * DReflex02;
                double blu = BluePrice /  100 * DBlue;
                double gre = GreenPrice /  100 * DGreen;
                double Blk = BlackPrice / 100 * DBlack;
                double wh = WhitePrice /  100 * DWhite;
                
                double RawMatnumDouble = y + ytwo + or + wr + othtwo + ru + rh + pur
                        + vio + osevtwo + ref + reftwo + blu + gre
                        + Blk + wh;
                
                
                double FinalTotalDouble = RawMatnumDouble * Pounds;
            //if element is blank, do not print
//                System.out.println(pantoneElement.getAttribute("pantone")); // pantone number print
              System.out.println("$" + FinalTotalDouble); // round math.round() math.floor()
                
//                System.out.printf( "%-15s %15s %n", pantoneElement.getAttribute("pantone"), (double) FinalTotalDouble);
                
//                System.out.println("Yellow: " + pantoneElement.getAttribute("Yellow"));
//                System.out.println("L/F Yellow: " + pantoneElement.getAttribute("Yellow02"));
//                System.out.println("021 Orange: " + pantoneElement.getAttribute("Orange"));
//                System.out.println("Warm Red: " + pantoneElement.getAttribute("wred"));
//                System.out.println("032: " + pantoneElement.getAttribute("othirtytwo"));
//                System.out.println("Rubine: " + pantoneElement.getAttribute("Rubine"));
//                System.out.println("Rhodamin: " + pantoneElement.getAttribute("Rhodamin"));
//                System.out.println("Purple: " + pantoneElement.getAttribute("Purple"));
//                System.out.println("Violet: " + pantoneElement.getAttribute("Violet"));
//                System.out.println("072: " + pantoneElement.getAttribute("oseventytwo"));
//                System.out.println("L/F Reflex: " + pantoneElement.getAttribute("Reflex02"));
//                System.out.println("Blue: " + pantoneElement.getAttribute("Blue"));
//                System.out.println("Green: " + pantoneElement.getAttribute("Green"));
//                System.out.println("Black: " + pantoneElement.getAttribute("Black"));
//                System.out.println("White: " + pantoneElement.getAttribute("White"));
                
                
                
            
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
        }

    }

}
