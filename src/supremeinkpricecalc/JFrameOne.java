/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supremeinkpricecalc;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Archa
 */
public class JFrameOne extends javax.swing.JFrame {

    static double YellowPrice = 9.35;
    static double Yellow02Price = 10.30;
    static double OrangePrice = 13.75;
    static double WarmRedPrice = 9.35;
    static double othirtytwoPrice = 10.50;
    static double RubinePrice = 7.50;
    static double RhodaminPrice = 16.50;
    static double PurplePrice = 16.50;
    static double VioletPrice = 18.75;
    static double oseventytwoPrice = 16.50;
    static double ReflexPrice = 7.50;
    static double Reflex02Price = 14.50;
    static double BluePrice = 7.50;
    static double GreenPrice = 10.60;
    static double BlackPrice = 7.50;
    static double WhitePrice = 7.50;

    /**
     * Creates new form JFrameOne
     */
    public JFrameOne() {
        initComponents();
//        DisplayColumnTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PoundsTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PantoneNumTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFormula = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTablePriceData = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        CalculatePriceButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supreme Ink Price Check");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_supremeinklogo.png"))); // NOI18N

        jLabel1.setText("Enter Pounds");

        PoundsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoundsTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Pantone #");

        PantoneNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantoneNumTextFieldActionPerformed(evt);
            }
        });

        JTableFormula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pantone", "Yellow", "4F02 Yellow", "4F02 Orange", "Warm Red", "4F 032", "Rubine", "4F Rhodamine", "4F Purple", "4F Violet", "4F 072", "Reflex", "4F Reflex", "Blue", "Green", "Black", "White"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableFormula);
        if (JTableFormula.getColumnModel().getColumnCount() > 0) {
            JTableFormula.getColumnModel().getColumn(0).setResizable(false);
            JTableFormula.getColumnModel().getColumn(1).setResizable(false);
            JTableFormula.getColumnModel().getColumn(2).setResizable(false);
            JTableFormula.getColumnModel().getColumn(3).setResizable(false);
            JTableFormula.getColumnModel().getColumn(4).setResizable(false);
            JTableFormula.getColumnModel().getColumn(5).setResizable(false);
            JTableFormula.getColumnModel().getColumn(6).setResizable(false);
            JTableFormula.getColumnModel().getColumn(7).setResizable(false);
            JTableFormula.getColumnModel().getColumn(8).setResizable(false);
            JTableFormula.getColumnModel().getColumn(9).setResizable(false);
            JTableFormula.getColumnModel().getColumn(10).setResizable(false);
            JTableFormula.getColumnModel().getColumn(11).setResizable(false);
            JTableFormula.getColumnModel().getColumn(12).setResizable(false);
            JTableFormula.getColumnModel().getColumn(13).setResizable(false);
            JTableFormula.getColumnModel().getColumn(14).setResizable(false);
        }

        jButton1.setText("Get Formula");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Formula Display Table");

        JTablePriceData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Title 17"
            }
        ));
        jScrollPane2.setViewportView(JTablePriceData);

        jLabel5.setText("Price Data");

        CalculatePriceButton.setText("Calculate Price");
        CalculatePriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculatePriceButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Price = ");

        jLabel7.setText("0000");

        jLabel8.setText("Raw Material Total = ");

        jLabel9.setText("0000");

        jLabel10.setText("$");

        jLabel11.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PoundsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PantoneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(50, 50, 50)
                        .addComponent(CalculatePriceButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(626, 626, 626)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(653, 653, 653)
                        .addComponent(jLabel5)))
                .addContainerGap(561, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(677, 677, 677))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PantoneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PoundsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(CalculatePriceButton))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PoundsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoundsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoundsTextFieldActionPerformed

    private void PantoneNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantoneNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PantoneNumTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            //define PantomNum from the PantoneNumTextField
            int PantoneNum = Integer.parseInt(this.PantoneNumTextField.getText()); //get number from textfield

            //begin reading xml data
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            domFactory.setNamespaceAware(true);
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            Document doc = builder.parse("data.xml");
            XPath xpath = XPathFactory.newInstance().newXPath();

            //search for specific number
            // XPath Query for showing all nodes value
            XPathExpression expr = xpath.compile("/inventory/Product[@pantone='" + PantoneNum + "']"); // add PantoneNum from textbox into the xpath search 

            Object result = expr.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes = (NodeList) result;

            //table model to display data onto the Jtable
            DefaultTableModel model = new DefaultTableModel();

//          column names
            String[] columnNames = {"Pantone",
                "Yellow",
                "L/F02 Yellow",
                "L/F02 Orange",
                "Warm Red",
                "L/F 032",
                "Rubine",
                "L/F Rhodamin",
                "L/F Purple",
                "L/F Violet",
                "L/F 072",
                "Reflex",
                "L/F Reflex",
                "Blue",
                "Green",
                "Black",
                "White",};
//           
//            //display column names onto the jtable
            model.setColumnIdentifiers(columnNames);
            //loop through all the data inside the xml file to find the specific number searched for
            for (int i = 0; i < nodes.getLength(); i++) {
                NamedNodeMap a = nodes.item(i).getAttributes();
                Node pantone = nodes.item(i);
                Element pantoneElement = (Element) pantone;
                System.out.println("Pantone: " + pantoneElement.getAttribute("pantone"));
                System.out.println("Blue: " + pantoneElement.getAttribute("Yellow"));
                System.out.println("Red: " + pantoneElement.getAttribute("Yellow02"));
                System.out.println("Orange: " + pantoneElement.getAttribute("orange"));
                System.out.println("White: " + pantoneElement.getAttribute("white"));
                System.out.println("Purple: " + pantoneElement.getAttribute("purple"));
                System.out.println("Green: " + pantoneElement.getAttribute("green"));
                System.out.println("Black: " + pantoneElement.getAttribute("black"));
                System.out.println("Rubine: " + pantoneElement.getAttribute("rubine"));

                Object[] RowData = {
                    pantoneElement.getAttribute("pantone"),
                    pantoneElement.getAttribute("Yellow"),
                    pantoneElement.getAttribute("Yellow02"),
                    pantoneElement.getAttribute("Orange"),
                    pantoneElement.getAttribute("wred"),
                    pantoneElement.getAttribute("othirtytwo"),
                    pantoneElement.getAttribute("Rubine"),
                    pantoneElement.getAttribute("Rhodamin"),
                    pantoneElement.getAttribute("Purple"),
                    pantoneElement.getAttribute("Violet"),
                    pantoneElement.getAttribute("oseventytwo"),
                    pantoneElement.getAttribute("Reflex"),
                    pantoneElement.getAttribute("Reflex02"),
                    pantoneElement.getAttribute("Blue"),
                    pantoneElement.getAttribute("Green"),
                    pantoneElement.getAttribute("Black"),
                    pantoneElement.getAttribute("White")
                };
                //Display RowData inside JTable
                model.addRow(RowData);

            }

            JTableFormula.setModel(model);

        } catch (NumberFormatException | ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
            JOptionPane.showMessageDialog(this, "Problem with input", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CalculatePriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculatePriceButtonActionPerformed
        // TODO add your handling code here:

        try {
            int PoundsNum = Integer.parseInt(this.PoundsTextField.getText()); //get number from textfield
            int PantoneNum = Integer.parseInt(this.PantoneNumTextField.getText()); //get number from textfield
            //table model to display data onto the Jtable
            DefaultTableModel model = new DefaultTableModel();

            //begin reading xml data
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            domFactory.setNamespaceAware(true);
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            Document doc = builder.parse("data.xml");
            XPath xpath = XPathFactory.newInstance().newXPath();

            //search for specific number
            // XPath Query for showing all nodes value
            XPathExpression expr = xpath.compile("/inventory/Product[@pantone='" + PantoneNum + "']"); // add PantoneNum from textbox into the xpath search 

            Object result = expr.evaluate(doc, XPathConstants.NODESET);
            NodeList nodes = (NodeList) result;

            //column names
            String[] columnNames = {"Pantone",
                "Yellow",
                "L/F02 Yellow",
                "L/F02 Orange",
                "Warm Red",
                "L/F 032",
                "Rubine",
                "L/F Rhodamin",
                "L/F Purple",
                "L/F Violet",
                "L/F 072",
                "Reflex",
                "L/F Reflex",
                "Blue",
                "Green",
                "Black",
                "White",};
//           
//            //display column names onto the jtable
            model.setColumnIdentifiers(columnNames);

            //loop through all the data inside the xml file to find the specific number searched for
            for (int i = 0; i < nodes.getLength(); i++) {
                NamedNodeMap a = nodes.item(i).getAttributes();
                Node pantone = nodes.item(i);
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

                double y = YellowPrice / 100 * DYellow;
                double ytwo = Yellow02Price / 100 * DYellow02;
                double or = OrangePrice / 100 * DOrange;
                double wr = WarmRedPrice / 100 * Dwred;
                double othtwo = othirtytwoPrice / 100 * Dothirtytwo;
                double ru = RubinePrice / 100 * DRubine;
                double rh = RhodaminPrice / 100 * DRhodamin;
                double pur = PurplePrice / 100 * DPurple;
                double vio = VioletPrice / 100 * DViolet;
                double osevtwo = oseventytwoPrice / 100 * DOseventytwo;
                double ref = ReflexPrice / 100 * DReflex;
                double reftwo = Reflex02Price / 100 * DReflex02;
                double blu = BluePrice / 100 * DBlue;
                double gre = GreenPrice / 100 * DGreen;
                double Blk = BlackPrice / 100 * DBlack;
                double wh = WhitePrice / 100 * DWhite;
                //divide raw material price by 100 then multiply by raw material amount in formula
                //take above answer and add up all numbers for the raw material price
                //multiply final raw material price by pounds

                Object[] RowData = {
                    pantoneElement.getAttribute("pantone"),
                    y, ytwo, or, wr, othtwo, ru, rh, pur,
                    vio, osevtwo, ref, reftwo, blu, gre,
                    Blk, wh
                };

                double RawMatnumDouble = y + ytwo + or + wr + othtwo + ru + rh + pur
                        + vio + osevtwo + ref + reftwo + blu + gre
                        + Blk + wh;
                
                double FinalTotalDouble = RawMatnumDouble * PoundsNum;

                String RawMatNumString = String.valueOf(RawMatnumDouble);
                String FinalTotalString = String.valueOf(FinalTotalDouble);
                
                jLabel9.setText(RawMatNumString);
                jLabel7.setText(FinalTotalString);
                //Display RowData inside JTable
                model.addRow(RowData);

                //add up 
                //System.out.println(YellowPrice / DYellow +);
//                System.out.println("Pantone: " + pantoneElement.getAttribute("pantone"));
//                System.out.println("Blue: " + pantoneElement.getAttribute("Yellow"));
//                System.out.println("Red: " + pantoneElement.getAttribute("Yellow02"));
//                System.out.println("Orange: " + pantoneElement.getAttribute("orange"));
//                System.out.println("White: " + pantoneElement.getAttribute("white"));
//                System.out.println("Purple: " + pantoneElement.getAttribute("purple"));
//                System.out.println("Green: " + pantoneElement.getAttribute("green"));
//                System.out.println("Black: " + pantoneElement.getAttribute("black"));
//                System.out.println("Rubine: " + pantoneElement.getAttribute("rubine"));
//                Object[] RowData = {
//                    pantoneElement.getAttribute("pantone"),
//                    pantoneElement.getAttribute("Yellow"),
//                    pantoneElement.getAttribute("Yellow02"),
//                    pantoneElement.getAttribute("Orange"),
//                    pantoneElement.getAttribute("wred"),
//                    pantoneElement.getAttribute("othirtytwo"),
//                    pantoneElement.getAttribute("Rubine"),
//                    pantoneElement.getAttribute("Rhodamin"),
//                    pantoneElement.getAttribute("Purple"),
//                    pantoneElement.getAttribute("Violet"),
//                    pantoneElement.getAttribute("oseventytwo"),
//                    pantoneElement.getAttribute("Reflex"),
//                    pantoneElement.getAttribute("Reflex02"),
//                    pantoneElement.getAttribute("Blue"),
//                    pantoneElement.getAttribute("Green"),
//                    pantoneElement.getAttribute("Black"),
//                    pantoneElement.getAttribute("White")
//                };
            }
            JTablePriceData.setModel(model);

        } catch (NumberFormatException | ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
            JOptionPane.showMessageDialog(this, "Problem with input", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        }

    }//GEN-LAST:event_CalculatePriceButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameOne.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameOne.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameOne.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameOne.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameOne().setVisible(true);
            }
        });
    }

//    public static void DisplayColumnTable() {
//        DefaultTableModel model = new DefaultTableModel();
//        //column names
//        String[] columnNames = {"Pantone",
//            "Yellow",
//            "4F02 Yellow",
//            "4F02 Orange",
//            "w.red",
//            "4F 032",
//            "Rubine",
//            "4F Rhodamin",
//            "4F Purple",
//            "4F Violet",
//            "4F 072",
//            "Reflex",
//            "Blue",
//            "Green",
//            "Black",
//            "White",};
//        //display column names onto the jtable
//        model.setColumnIdentifiers(columnNames);
//        JTable.setModel(model);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculatePriceButton;
    private javax.swing.JTable JTableFormula;
    private javax.swing.JTable JTablePriceData;
    private javax.swing.JTextField PantoneNumTextField;
    private javax.swing.JTextField PoundsTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
