import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class BagelGUI6 extends javax.swing.JFrame implements java.awt.event.ActionListener
{
  private final double whiteBagelPrice = 1.25D;
  private final double wheatBagelPrice = 1.5D;
  private final double creamCheesePrice = 0.5D;
  private final double butterPrice = 0.25D;
  private final double blueberryJamPrice = 0.75D;
  private final double raspberryJamPrice = 0.75D;
  private final double peachJellyPrice = 0.75D;
  private final double regularCoffeePrice = 1.25D;
  private final double cappuccinoPrice = 2.0D;
  private final double cafeAuLaitPrice = 1.75D;
  private double pretaxOrderPrice = 0.0D;
  private double salesTax = 0.0D;
  private double totalOrderPrice = 0.0D;
  private int bagelQuantity = 0;
  


  DecimalFormat df = new DecimalFormat("$#,##0.00");
  


  java.util.Date date = new java.util.Date();
  


  javax.swing.border.Border red = BorderFactory.createLineBorder(java.awt.Color.red);
  javax.swing.border.Border padding = BorderFactory.createEmptyBorder(0, 45, 0, 0);
  javax.swing.border.Border paddingRight = BorderFactory.createEmptyBorder(0, 0, 0, 45);
  



  private javax.swing.JMenuBar mb = new javax.swing.JMenuBar();
  private javax.swing.JMenu menu = new javax.swing.JMenu("Print Receipt");
  private JMenuItem printFile = new JMenuItem("Print to File");
  private JMenuItem printPrinter = new JMenuItem("Print to Printer");
  


  private JLabel priceSubtotalLabel = new JLabel("Subtotal");
  private JLabel priceSubtotal = new JLabel("$0.00");
  private JLabel priceSalesTaxLabel = new JLabel("SalesTax 13%");
  private JLabel priceSalesTax = new JLabel("$0.00");
  private JLabel priceTotalLabel = new JLabel("Total Sale");
  private JLabel priceTotal = new JLabel("$0.00");
  private JPanel price = new JPanel(new GridLayout(3, 2));
  


  private JRadioButton noneBagel = new JRadioButton("None");
  private JRadioButton whiteBagel = new JRadioButton("White ($1.25)");
  private JRadioButton wheatBagel = new JRadioButton("Whole Wheat ($1.50)");
  private JTextField whiteBagelQuantity = new JTextField(5);
  private JTextField wheatBagelQuantity = new JTextField(5);
  private JLabel qty = new JLabel("Qty:");
  private JPanel bagelP1 = new JPanel(new GridLayout(3, 1));
  private JPanel bagelP2 = new JPanel(new GridLayout(3, 1, 0, 5));
  private JPanel bagelP3 = new JPanel();
  



  private JCheckBox creamCheese = new JCheckBox("Cream Cheese ($.50)");
  private JCheckBox butter = new JCheckBox("Butter ($.25)");
  private JCheckBox blueberryJam = new JCheckBox("Blueberry Jam ($.75)");
  private JCheckBox raspberryJam = new JCheckBox("Raspberry Jam ($.75)");
  private JCheckBox peachJelly = new JCheckBox("Peach Jelly ($.75)");
  
  private JPanel topping = new JPanel(new GridLayout(5, 1));
  



  private JRadioButton none = new JRadioButton("None");
  private JRadioButton regular = new JRadioButton("Regular ($1.25)");
  private JRadioButton cappuccino = new JRadioButton("Cappaccino ($2.00)");
  private JRadioButton cafeAuLait = new JRadioButton("Cafe Au Lait ($1.75)");
  private JLabel coffeeQty = new JLabel("Qty:");
  private JTextField regularQuantity = new JTextField(5);
  private JTextField cappuccinoQuantity = new JTextField(5);
  private JTextField cafeAuLaitQuantity = new JTextField(5);
  private JPanel coffeeP1 = new JPanel(new GridLayout(4, 1));
  private JPanel coffeeP2 = new JPanel(new GridLayout(4, 1, 0, 5));
  private JPanel coffeeP3 = new JPanel();
  


  private JButton calculateTotalButton = new JButton("Calculate Total");
  private JButton resetFormButton = new JButton("Reset Form");
  private JButton exitButton = new JButton("Exit System");
  private JPanel buttonRow = new JPanel(new java.awt.FlowLayout());
  


  private JPanel top = new JPanel(new GridLayout(1, 2));
  private JPanel bottom = new JPanel(new GridLayout(1, 2));
  

  public BagelGUI6(String paramString)
  {
    super(paramString);
    setDefaultCloseOperation(3);
    setSize(600, 350);
    setLocationRelativeTo(null);
    setVisible(true);
    calculateTotalButton.setMnemonic('C');
    resetFormButton.setMnemonic('R');
    exitButton.setMnemonic('x');
    



    mb.add(menu);
    menu.add(printFile);
    menu.add(printPrinter);
    setJMenuBar(mb);
    mb.setBackground(java.awt.Color.red);
    


    bagelP1.add(noneBagel);
    bagelP2.add(qty);
    bagelP1.add(whiteBagel);
    bagelP2.add(whiteBagelQuantity);
    bagelP1.add(wheatBagel);
    bagelP2.add(wheatBagelQuantity);
    bagelP3.setBorder(BorderFactory.createTitledBorder(red, "Pick a Bagel"));
    whiteBagelQuantity.setEditable(false);
    wheatBagelQuantity.setEditable(false);
    bagelP3.add(bagelP1);
    bagelP3.add(bagelP2);
    top.add(bagelP3);
    


    ButtonGroup localButtonGroup1 = new ButtonGroup();
    localButtonGroup1.add(noneBagel);
    localButtonGroup1.add(whiteBagel);
    localButtonGroup1.add(wheatBagel);
    



    topping.add(creamCheese);
    creamCheese.setMargin(new Insets(0, 40, 0, 0));
    topping.add(butter);
    butter.setMargin(new Insets(0, 40, 0, 0));
    topping.add(blueberryJam);
    blueberryJam.setMargin(new Insets(0, 40, 0, 0));
    topping.add(raspberryJam);
    raspberryJam.setMargin(new Insets(0, 40, 0, 0));
    topping.add(peachJelly);
    peachJelly.setMargin(new Insets(0, 40, 0, 0));
    topping.setBorder(BorderFactory.createTitledBorder(red, "Pick Your Toppings"));
    creamCheese.setEnabled(false);
    butter.setEnabled(false);
    blueberryJam.setEnabled(false);
    raspberryJam.setEnabled(false);
    peachJelly.setEnabled(false);
    
    bottom.add(topping);
    




    coffeeP1.add(none);
    coffeeP2.add(coffeeQty);
    coffeeP1.add(regular);
    coffeeP2.add(regularQuantity);
    coffeeP1.add(cappuccino);
    coffeeP2.add(cappuccinoQuantity);
    coffeeP1.add(cafeAuLait);
    coffeeP2.add(cafeAuLaitQuantity);
    coffeeP3.setBorder(BorderFactory.createTitledBorder(red, "Want Coffee with That?"));
    regularQuantity.setEditable(false);
    cappuccinoQuantity.setEditable(false);
    cafeAuLaitQuantity.setEditable(false);
    coffeeP3.add(coffeeP1);
    coffeeP3.add(coffeeP2);
    top.add(coffeeP3);
    


    ButtonGroup localButtonGroup2 = new ButtonGroup();
    localButtonGroup2.add(none);
    localButtonGroup2.add(regular);
    localButtonGroup2.add(cappuccino);
    localButtonGroup2.add(cafeAuLait);
    


    price.add(priceSubtotalLabel);
    priceSubtotalLabel.setBorder(padding);
    price.add(priceSubtotal);
    priceSubtotal.setBorder(paddingRight);
    priceSubtotal.setHorizontalAlignment(4);
    price.add(priceSalesTaxLabel);
    priceSalesTaxLabel.setBorder(padding);
    price.add(priceSalesTax);
    priceSalesTax.setBorder(paddingRight);
    priceSalesTax.setHorizontalAlignment(4);
    price.add(priceTotalLabel);
    priceTotalLabel.setBorder(padding);
    price.add(priceTotal);
    priceTotal.setBorder(paddingRight);
    priceTotal.setHorizontalAlignment(4);
    price.setBorder(BorderFactory.createTitledBorder(red, "Price Summary"));
    bottom.add(price);
    


    buttonRow.add(calculateTotalButton);
    calculateTotalButton.setToolTipText("Click here to complete order!");
    buttonRow.add(resetFormButton);
    resetFormButton.setToolTipText("Click here to start over!");
    buttonRow.add(exitButton);
    exitButton.setToolTipText("Click here to exit system!");
    buttonRow.setBackground(java.awt.Color.red);
    



    add(top, "North");
    add(bottom, "Center");
    add(buttonRow, "South");
    


    noneBagel.addActionListener(this);
    whiteBagel.addActionListener(this);
    wheatBagel.addActionListener(this);
    none.addActionListener(this);
    regular.addActionListener(this);
    cappuccino.addActionListener(this);
    cafeAuLait.addActionListener(this);
    calculateTotalButton.addActionListener(this);
    resetFormButton.addActionListener(this);
    exitButton.addActionListener(this);
    printFile.addActionListener(this);
    printPrinter.addActionListener(this);
  }
  





  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (noneBagel == paramActionEvent.getSource()) {
      whiteBagelQuantity.setEditable(false);
      whiteBagelQuantity.setText(" ");
      wheatBagelQuantity.setEditable(false);
      wheatBagelQuantity.setText(" ");
      
      deselectToppings();
      

      disableToppings();
    }
    


    if (whiteBagel == paramActionEvent.getSource()) {
      whiteBagelQuantity.setEditable(true);
      whiteBagelQuantity.setText(String.valueOf(1));
      
      wheatBagelQuantity.setText(" ");
      wheatBagelQuantity.setEditable(false);
      

      deselectToppings();
      

      enableToppings();
    }
    


    if (wheatBagel == paramActionEvent.getSource()) {
      wheatBagelQuantity.setEditable(true);
      wheatBagelQuantity.setText(String.valueOf(1));
      whiteBagelQuantity.setText(" ");
      whiteBagelQuantity.setEditable(false);
      
      deselectToppings();
      

      enableToppings();
    }
    


    if (none == paramActionEvent.getSource()) {
      regularQuantity.setEditable(false);
      regularQuantity.setText(" ");
      cappuccinoQuantity.setEditable(false);
      cappuccinoQuantity.setText(" ");
      cafeAuLaitQuantity.setEditable(false);
      cafeAuLaitQuantity.setText(" ");
    }
    

    if (regular == paramActionEvent.getSource()) {
      regularQuantity.setEditable(true);
      regularQuantity.setText(String.valueOf(1));
      cappuccinoQuantity.setText(" ");
      cappuccinoQuantity.setEditable(false);
      cafeAuLaitQuantity.setText(" ");
      cafeAuLaitQuantity.setEditable(false);
    }
    

    if (cappuccino == paramActionEvent.getSource()) {
      cappuccinoQuantity.setEditable(true);
      cappuccinoQuantity.setText(String.valueOf(1));
      regularQuantity.setText(" ");
      regularQuantity.setEditable(false);
      cafeAuLaitQuantity.setText(" ");
      cafeAuLaitQuantity.setEditable(false);
    }
    

    if (cafeAuLait == paramActionEvent.getSource()) {
      cafeAuLaitQuantity.setEditable(true);
      cafeAuLaitQuantity.setText(String.valueOf(1));
      cappuccinoQuantity.setText(" ");
      cappuccinoQuantity.setEditable(false);
      regularQuantity.setText(" ");
      regularQuantity.setEditable(false);
    }
    


    if (calculateTotalButton == paramActionEvent.getSource()) {
      System.out.println("Calculating order total.... Done!");
      calculateOrder();
    }
    

    if (resetFormButton == paramActionEvent.getSource()) {
      dispose();
      BagelGUI6 localBagelGUI6 = new BagelGUI6("Sheridan Bagel Shop");
      System.out.println("Resetting... Done!");
    }
    

    if (exitButton == paramActionEvent.getSource()) {
      System.exit(0);
    }
    


    if (printFile == paramActionEvent.getSource()) {
      printToFile();
    }
    


    if (printPrinter == paramActionEvent.getSource()) {
      printToPrinter();
    }
  }
  

  public void enableToppings()
  {
    creamCheese.setEnabled(true);
    butter.setEnabled(true);
    blueberryJam.setEnabled(true);
    raspberryJam.setEnabled(true);
    peachJelly.setEnabled(true);
  }
  
  public void disableToppings()
  {
    creamCheese.setEnabled(false);
    butter.setEnabled(false);
    blueberryJam.setEnabled(false);
    raspberryJam.setEnabled(false);
    peachJelly.setEnabled(false);
  }
  
  public void deselectToppings()
  {
    creamCheese.setSelected(false);
    butter.setSelected(false);
    blueberryJam.setSelected(false);
    raspberryJam.setSelected(false);
    peachJelly.setSelected(false);
  }
  
  public void calculateOrder()
  {
    try
    {
      pretaxOrderPrice = 0.0D;
      bagelQuantity = 0;
      if (whiteBagel.isSelected()) {
        pretaxOrderPrice += 1.25D * Integer.parseInt(whiteBagelQuantity.getText());
        bagelQuantity = Integer.parseInt(whiteBagelQuantity.getText());
      }
      if (wheatBagel.isSelected()) {
        pretaxOrderPrice += 1.5D * Integer.parseInt(wheatBagelQuantity.getText());
        bagelQuantity = Integer.parseInt(wheatBagelQuantity.getText());
      }
      

      if (creamCheese.isSelected()) {
        pretaxOrderPrice += 0.5D * bagelQuantity;
      }
      if (butter.isSelected()) {
        pretaxOrderPrice += 0.25D * bagelQuantity;
      }
      if (blueberryJam.isSelected()) {
        pretaxOrderPrice += 0.75D * bagelQuantity;
      }
      if (raspberryJam.isSelected()) {
        pretaxOrderPrice += 0.75D * bagelQuantity;
      }
      if (peachJelly.isSelected()) {
        pretaxOrderPrice += 0.75D * bagelQuantity;
      }
      if (regular.isSelected()) {
        pretaxOrderPrice += 1.25D * Integer.parseInt(regularQuantity.getText());
      }
      if (cappuccino.isSelected()) {
        pretaxOrderPrice += 2.0D * Integer.parseInt(cappuccinoQuantity.getText());
      }
      if (cafeAuLait.isSelected()) {
        pretaxOrderPrice += 1.75D * Integer.parseInt(cafeAuLaitQuantity.getText());
      }
      salesTax = (pretaxOrderPrice * 0.13D);
      totalOrderPrice = (pretaxOrderPrice + salesTax);
      System.out.println(totalOrderPrice + " " + pretaxOrderPrice + " " + salesTax);
      


      priceSubtotal.setText(String.valueOf(df.format(pretaxOrderPrice)));
      priceSalesTax.setText(String.valueOf(df.format(salesTax)));
      priceTotal.setText(String.valueOf(df.format(totalOrderPrice)));
    } catch (Exception localException) {
      javax.swing.JOptionPane.showMessageDialog(null, "Please Enter Numbers!", "Error Warning!!", 2);
    }
  }
  

  public void printToFile()
  {
    try
    {
      System.out.println("Printing to file...Done!");
      java.io.File localFile = new java.io.File("receipt.txt");
      PrintWriter localPrintWriter = new PrintWriter(localFile);
      
      localPrintWriter.println("*************SHERIDAN BAGEL SHOP*************");
      localPrintWriter.println(date.toString());
      localPrintWriter.println("Item:\t\t\tQty\tAmount");
      if (whiteBagel.isSelected()) {
        localPrintWriter.print("White Bagel\t\t");
        localPrintWriter.print(bagelQuantity + "\t");
        localPrintWriter.println(df.format(1.25D * bagelQuantity));
        localPrintWriter.println("Toppings:");
      }
      
      if (wheatBagel.isSelected()) {
        localPrintWriter.print("Wheat Bagel\t\t");
        localPrintWriter.print(bagelQuantity + "\t");
        localPrintWriter.println(df.format(1.5D * bagelQuantity));
        localPrintWriter.println("Toppings:");
      }
      
      if (creamCheese.isSelected()) {
        localPrintWriter.print("  Cream Cheese\t\t");
        localPrintWriter.print(bagelQuantity);
        localPrintWriter.println("\t" + df.format(0.5D * bagelQuantity));
      }
      
      if (butter.isSelected()) {
        localPrintWriter.print("  Butter\t\t\t");
        localPrintWriter.print(bagelQuantity);
        localPrintWriter.println("\t" + df.format(0.25D * bagelQuantity));
      }
      
      if (blueberryJam.isSelected()) {
        localPrintWriter.print("  Blueberry Jam\t\t");
        localPrintWriter.print(bagelQuantity);
        localPrintWriter.println("\t" + df.format(0.75D * bagelQuantity));
      }
      
      if (raspberryJam.isSelected()) {
        localPrintWriter.print("  Raspberry Jam\t\t");
        localPrintWriter.print(bagelQuantity);
        localPrintWriter.println("\t" + df.format(0.75D * bagelQuantity));
      }
      
      if (peachJelly.isSelected()) {
        localPrintWriter.print("  Peach Jelly\t\t");
        localPrintWriter.print(bagelQuantity);
        localPrintWriter.println("\t" + df.format(0.75D * bagelQuantity));
        localPrintWriter.println();
      }
      
      if (regular.isSelected()) {
        localPrintWriter.print("Regular Coffee\t\t");
        localPrintWriter.print(Integer.parseInt(regularQuantity.getText()));
        localPrintWriter.println("\t" + df.format(1.25D * Integer.parseInt(regularQuantity.getText())));
      }
      
      if (cappuccino.isSelected()) {
        localPrintWriter.print("Cappuccino\t\t");
        localPrintWriter.print(Integer.parseInt(cappuccinoQuantity.getText()));
        localPrintWriter.println("\t" + df.format(2.0D * Integer.parseInt(cappuccinoQuantity.getText())));
      }
      
      if (cafeAuLait.isSelected()) {
        localPrintWriter.print("Cafe Au Lait\t\t");
        localPrintWriter.print(Integer.parseInt(cafeAuLaitQuantity.getText()));
        localPrintWriter.println("\t" + df.format(1.75D * Integer.parseInt(cafeAuLaitQuantity.getText())));
      }
      localPrintWriter.println("\t\t\t\t-----------");
      localPrintWriter.println("Pretax Total\t\t\t" + df.format(pretaxOrderPrice));
      localPrintWriter.println("Sales Tax 13%\t\t\t" + df.format(salesTax));
      localPrintWriter.println("Total Sale   \t\t\t" + df.format(totalOrderPrice));
      localPrintWriter.println("*********THANK YOU FOR YOUR ORDER*********");
      
      localPrintWriter.close();
    }
    catch (Exception localException) {
      System.out.println("Error writing to file");
    }
  }
  





  public void printToPrinter()
  {
    printToFile();
    javax.print.attribute.HashPrintRequestAttributeSet localHashPrintRequestAttributeSet = new javax.print.attribute.HashPrintRequestAttributeSet();
    javax.print.DocFlavor.INPUT_STREAM localINPUT_STREAM = javax.print.DocFlavor.INPUT_STREAM.AUTOSENSE;
    javax.print.PrintService[] arrayOfPrintService = javax.print.PrintServiceLookup.lookupPrintServices(localINPUT_STREAM, localHashPrintRequestAttributeSet);
    javax.print.PrintService localPrintService1 = javax.print.PrintServiceLookup.lookupDefaultPrintService();
    javax.print.PrintService localPrintService2 = javax.print.ServiceUI.printDialog(null, 200, 200, arrayOfPrintService, localPrintService1, localINPUT_STREAM, localHashPrintRequestAttributeSet);
    
    if (localPrintService2 != null) {
      try {
        javax.print.DocPrintJob localDocPrintJob = localPrintService2.createPrintJob();
        javax.print.attribute.HashDocAttributeSet localHashDocAttributeSet = new javax.print.attribute.HashDocAttributeSet();
        java.io.FileInputStream localFileInputStream = new java.io.FileInputStream("receipt.txt");
        javax.print.SimpleDoc localSimpleDoc = new javax.print.SimpleDoc(localFileInputStream, localINPUT_STREAM, localHashDocAttributeSet);
        try
        {
          localDocPrintJob.print(localSimpleDoc, localHashPrintRequestAttributeSet);
          System.out.println("Job sent to printer.");
        }
        catch (javax.print.PrintException localPrintException) {
          System.out.println("Print error!" + localPrintException.getMessage());
        }
      }
      catch (java.io.FileNotFoundException localFileNotFoundException)
      {
        System.out.println("File not found!" + localFileNotFoundException.getMessage());
      }
    }
  }
}
 
 
   

