
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.nimbus.State;
import javax.swing.text.html.ImageView;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;
import org.dreambot.api.*;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
public class StaffGUI extends JFrame {
    private BufferedImage image;
    private Main ctx;
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    public String tempVarStore;
    private String sellPriceAsInt;
    public Image itemImage;

    public Image getPaintImage(String url){
    	try{
    		return ImageIO.read(new URL("http://i.imgur.com/JB24nNU.png"));
    	} catch (Exception e){
    		System.out.println("Can't load URL");
    	}
    	return null;
    }
    public StaffGUI (final Main ctx) {
        setTitle("Xak's Staff Flipper");
        setAlwaysOnTop(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 317, 275);
        
        
        
        setVisible(true);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.window);
        panel.setBounds(0, 0, 314, 246);
        contentPane.add(panel);
        panel.setLayout(null);
       
        JButton btnNewButton = new JButton("Start!");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	ctx.setStartScript(true);

            	ctx.GESellPrice = Integer.parseInt(textField.getText());
            	
            	setVisible(false);
        	}
        });
        btnNewButton.setBounds(33, 200, 237, 34);
        panel.add(btnNewButton);
        btnNewButton.setBackground(SystemColor.menu);
       
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(SystemColor.menu);
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.YELLOW, null, null));
        panel_1.setBounds(33, 16, 237, 160);
        panel_1.setLayout(null);
        panel.add(panel_1);
       
        JLabel lblNewLabel = new JLabel("Sell Price:");
        lblNewLabel.setLocation(18, 38);
        lblNewLabel.setSize(66, 16);
        panel_1.add(lblNewLabel);
       
        textField = new JTextField();
        textField.setLocation(87, 36);
        textField.setSize(114, 20);
        panel_1.add(textField);
        textField.setColumns(10);
       
     /*   textField_1 = new JTextField();
        textField_1.setLocation(87, 59);
        textField_1.setSize(114, 20);
        textField_1.setColumns(10);
        panel_1.add(textField_1); */
       
        JLabel lblMuleWord = new JLabel("Suggested Sell Price is between");
        lblMuleWord.setLocation(18, 61);
        lblMuleWord.setSize(213, 39);
        panel_1.add(lblMuleWord);
       
        JLabel lblSellPrice = new JLabel("8400 and 8700");
        lblSellPrice.setLocation(18, 95);
        lblSellPrice.setSize(106, 16);
        panel_1.add(lblSellPrice);
        
      
    }

        /* JCheckBox chckbxNewCheckBox = new JCheckBox("Buy/Sell in GE");
        chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox.setLocation(18, 87);
        chckbxNewCheckBox.setSize(101, 24);
        panel_1.add(chckbxNewCheckBox);*/
       
      /*  JLabel lblBuyPrice = new JLabel("Buy Price:");
        lblBuyPrice.setBounds(18, 132, 57, 16);
        panel_1.add(lblBuyPrice); */
       
       /* JSlider slider = new JSlider();
       
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setBounds(197, 112, 28, 16);
        lblNewLabel_1.setText(String.valueOf(slider.getValue()));
        panel_1.add(lblNewLabel_1);
        slider.addChangeListener(new ChangeListener() { 
        

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        slider.setValue(100);
        slider.setSnapToTicks(true);
        slider.setPaintLabels(true);
        slider.setMaximum(300);
        slider.setBounds(76, 112, 114, 16);
        panel_1.add(slider);
       */
       /*
       
        JSlider slider_1 = new JSlider();
        JLabel label = new JLabel("");
        label.setBounds(197, 132, 28, 16);
        panel_1.add(label);
        label.setText(String.valueOf(slider_1.getValue()));
        slider_1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent arg0) {
                label.setText(String.valueOf(slider_1.getValue()));
            }
        });
        slider_1.setSnapToTicks(true);
        slider_1.setPaintLabels(true);
        slider_1.setValue(100);
        slider_1.setMaximum(300);
        slider_1.setBounds(76, 132, 114, 16);
        panel_1.add(slider_1);
       
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Use Mule?");
        chckbxNewCheckBox_1.setBounds(18, 8, 112, 24);
        panel_1.add(chckbxNewCheckBox_1);
       */
       
   
    public String getGESellPrice(){
		
		return textField.getText();
		
	}
    public void onPaint(Graphics g)  {
    	super.paint(g);
    	g.fillRect(50, 50, 75, 75);
    }

}
