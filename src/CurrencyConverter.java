import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class CurrencyConverter extends JFrame implements ActionListener {
    
	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1;
	
	public CurrencyConverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));

		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(123, 243, 207, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		String[] choices = {"","Dollars to Soles","Pounds to Soles","Yuan to Soles","Yen to Soles","Euro to Soles"};
		comboBox = new JComboBox(choices);
		
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 12));
		comboBox.setBounds(346, 243, 111, 39);
		contentPane.add(comboBox);
		
		
		JLabel lblNewLabel = new JLabel("Enter a Number to Convert");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel.setBounds(147, 199, 283, 44);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(177, 292, 177, 63);
		contentPane.add(lblNewLabel_1);
		comboBox.addActionListener(this);
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);	 	
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
	  String text = textField.getText();
	  double x = Double.parseDouble(text);
	  if(e.getSource()==comboBox);
	     String selected = comboBox.getSelectedItem().toString();
		 if(selected.equalsIgnoreCase("Dollars to Soles")) {
		    x = x*3.628871;
		    String s = Double.toString(x);
		    int result = s.indexOf(".");
			String output = s.substring(0,result+3);
		    lblNewLabel_1.setText(output+" Soles");		   
		 
		 }
		 else if(selected.equalsIgnoreCase("Pounds to Soles")) {
		    x = x*4.6589512;
		    String s = Double.toString(x);
		    int result = s.indexOf(".");
		    String output = s.substring(0,result+3);
		    lblNewLabel_1.setText(output+" Soles");
		       
		  }
	      else if(selected.equalsIgnoreCase("Yuan to Soles")) {
			 x = x*0.50256467;
		     String s = Double.toString(x);
		     int result = s.indexOf(".");
		     String output = s.substring(0,result+3);
		     lblNewLabel_1.setText(output+" Soles");
				
		  }
		  else if(selected.equalsIgnoreCase("Yen to Soles")) {
			 x = x*0.025536907;
			 String s = Double.toString(x);
			 int result = s.indexOf(".");
			 String output = s.substring(0,result+3);
			 lblNewLabel_1.setText(output+" Soles");
			   
		  }
		  else if(selected.equalsIgnoreCase("Euro to Soles")) {
			 x = x*3.9769686;
			 String s = Double.toString(x);
			 int result = s.indexOf(".");
			 String output = s.substring(0,result+3);
			 lblNewLabel_1.setText(output+" Soles");
		  }
			   
		}
	
	}
	