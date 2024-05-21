
package codingdsa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TemperatureConverterGui {
    
    public static double celsius_farenheit(double celsius){
        return(celsius * 9/5) + 52;
    }
    
    public static double farenheit_celsius(double farenheit){
        return(farenheit - 32) * 5/9;
    }
    
    public static void main(String[] args){
        
        SwingUtilities.invokeLater(()-> createAndShowGui());
    }
    
    private static void createAndShowGui(){
        JFrame frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
                
        JPanel inputPanel = new JPanel();
        JLabel label = new JLabel("Enter Temperature");
        JTextField textField = new JTextField(10);
        String[] scales = {"celsius" ,  "farenheit"};
        JComboBox <String> ScaleComboBox = new JComboBox<>(scales);
        
        inputPanel.add(label);
        inputPanel.add(textField);
        inputPanel.add(ScaleComboBox);
        
        JPanel outputPanel = new JPanel();
        JTextArea outputArea = new JTextArea(3,20);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        outputPanel.add(scrollPane);
        JButton convertButton = new JButton("Convert");
        
        convertButton.addActionListener(new ActionListener() {
        
            @Override
            
            public void actionPerformed(ActionEvent E ){
                try {
                    double temperature = Double.parseDouble(textField.getText());
                    String selectedScale = (String)ScaleComboBox.getSelectedItem();
                    String output = "";
                    
                    
                    switch(selectedScale){
                    
                        case "celsius":
                        output = "farenheit: " + celsius_farenheit(temperature);    
                        break;
                        
                        case "farenheit":
                        output = "celsius: " + farenheit_celsius(temperature);    
                        break;
                        
                               
                }
                    outputArea.setText(output);
                    
                    
                }
               catch(NumberFormatException NFE){
                   outputArea.setText("invalid input, please enter a valid number");
                   
               }
            }
        
        });
        
        frame.add(inputPanel,BorderLayout.NORTH);
                frame.add(convertButton,BorderLayout.CENTER);
                frame.add(outputPanel,BorderLayout.SOUTH);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
       
        
        
    }
}
