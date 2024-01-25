package pk;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Fr implements ActionListener{
	String[] arr1 = {"1","2","3","4","5","6"};
	String[] arr2 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
	String[] arr3 = {};
	String[] arr4 = {"1","2","3","4","5","6","7","8","9","10"};
	JComboBox<?> jc1;
	JComboBox<?> jc2;
	JComboBox<?> jc3;
	JComboBox<?> jc4;
	JComboBox<?> jc5;
	JComboBox<?> jc11;
	JComboBox<?> jc12;
	JComboBox<?> jc13;
	JComboBox<?> jc14;
	JComboBox<?> jc15;
	JLabel lbl;
	JLabel lbl1;
	public void WS() {
		int a = JOptionPane.showConfirmDialog(null,"Abitur?");
		if (a == 1) {
			arr3 = arr1;
		}else {
			arr3 = arr2;
		}
		System.out.println(a);
			
	JFrame frame = new JFrame();
	frame.setSize(600,600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new GridLayout(10, 2, 0, 0));
	frame.setResizable(true);
	frame.setTitle("Calc");
	lbl = new JLabel("Note");
	frame.add(lbl);
	lbl1 = new JLabel("Gewichtung");
	frame.add(lbl1);
	
	
	
	
	
	 jc1 = new JComboBox<Object>(arr3);
	frame.add(jc1);
	jc11 = new JComboBox<Object>(arr4);
	frame.add(jc11);
	
	 jc2 = new JComboBox<Object>(arr3);
	frame.add(jc2);
	jc12 = new JComboBox<Object>(arr4);
	frame.add(jc12);
	
	 jc3 = new JComboBox<Object>(arr3);
	frame.add(jc3);
	jc13 = new JComboBox<Object>(arr4);
	frame.add(jc13);
	
	jc4 = new JComboBox<Object>(arr3);
	frame.add(jc4);
	jc14 = new JComboBox<Object>(arr4);
	frame.add(jc14);
	
	jc5 = new JComboBox<Object>(arr3);
	frame.add(jc5);
	jc15 = new JComboBox<Object>(arr4);
	frame.add(jc15);
	
	
	
	JButton btn = new JButton("Berechnen");
	frame.add(btn);
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	btn.addActionListener(this);
	frame.setVisible(true);
	
	
	
	
	
	
	
	
	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
			String tmpInput =  (String) jc1.getSelectedItem();
			int grade1 = Integer.parseInt(tmpInput);
			 tmpInput =  (String) jc2.getSelectedItem();
			int grade2 = Integer.parseInt(tmpInput);
			 tmpInput =  (String) jc3.getSelectedItem();
			int grade3 = Integer.parseInt(tmpInput);
			 tmpInput =  (String) jc4.getSelectedItem();
			int grade4 = Integer.parseInt(tmpInput);
			 tmpInput =  (String) jc5.getSelectedItem();
			int grade5 = Integer.parseInt(tmpInput);
			
			
			 tmpInput =  (String) jc11.getSelectedItem();
			int gewichtung1 = Integer.parseInt(tmpInput);
			 tmpInput =  (String) jc12.getSelectedItem();
			int gewichtung2 = Integer.parseInt(tmpInput);
			 tmpInput =  (String) jc13.getSelectedItem();
			int gewichtung3 = Integer.parseInt(tmpInput);
			 tmpInput =  (String) jc14.getSelectedItem();
			int gewichtung4 = Integer.parseInt(tmpInput);
			 tmpInput =  (String) jc15.getSelectedItem();
			int gewichtung5 = Integer.parseInt(tmpInput);
			
			int gewichtungen = gewichtung1 + gewichtung2 + gewichtung3 + gewichtung4 + gewichtung5;
			System.out.println(gewichtungen);
			double out = ((grade1 * gewichtung1) + (grade2 * gewichtung2) +  (grade3 * gewichtung3) + (grade4* gewichtung4) + (grade5*gewichtung5)) / gewichtungen;
			System.out.println(out);
			
			JOptionPane.showMessageDialog(null, out);
		
		
	}
	
}
