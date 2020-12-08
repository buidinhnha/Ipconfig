package Ipconfig;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Ipconfig extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ipconfig frame = new Ipconfig();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ipconfig() throws BadLocationException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100, 619, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 414, 395);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		textPane.setForeground(new Color(255, 255, 255));
		textPane.setBackground(new Color(0, 0, 0));
		textPane.setText("Nhập gì đó: ");
		StyledDocument doc = textPane.getStyledDocument();
		SimpleAttributeSet keyWord = new SimpleAttributeSet();
		StyleConstants.setBold(keyWord, true);
		
		int condition = JComponent.WHEN_FOCUSED;
		InputMap iMap = textPane.getInputMap(condition);
		ActionMap aMap = textPane.getActionMap();
		String enter = "enter";
		String strCut;
		
		ArrayList<String> strList = new ArrayList<>();
		  iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter);
		  aMap.put(enter, (Action) new AbstractAction() {

		     @Override
		     public void actionPerformed(ActionEvent arg0) {
		    	 
		    	 if (textPane.getText().length() == 12) {
		    		 strList.add(textPane.getText().substring(12));
		    	 }
		    	 if (textPane.getText().length() > 12) {
		    		 strList.add(textPane.getText().substring(textPane.getText().length()-1));
		    	 }
						System.out.println(strList);	
						try {
							for (String a : strList) {
								if(a.equals("ipconfig")) {
									doc.insertString(doc.getLength(), "\nBạn vừa nhập:"+a, keyWord );	
								}
								if(a.equals("2")) {
									doc.insertString(doc.getLength(), "\nBạn vừa nhập:"+a, keyWord );
								}
								if(a.equals("3")) {
									doc.insertString(doc.getLength(), "\nBạn vừa nhập:"+a, keyWord );
								}
								if(a.equals("4")) {
									doc.insertString(doc.getLength(), "\nBạn vừa nhập:"+a, keyWord );
								}
								if(a.equals("0")) {
									doc.insertString(doc.getLength(), "\nBạn vừa nhập:"+a, keyWord );
								}
							}
							doc.insertString(doc.getLength(), "\n\n\nNhập gì đó: ", keyWord );
						} catch (BadLocationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						strList.clear();
						System.out.println(strList+"/"+textPane.getText().length());
						
		     }		     
		  });
	
		
		scrollPane.setViewportView(textPane);
		
		JButton btnAll = new JButton("Ipconfig/all");
		btnAll.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAll.setBounds(434, 417, 159, 23);
		contentPane.add(btnAll);
		btnAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				allTxt();
				
				
			}
		});
		
		JButton btnHelp = new JButton("Ipconfig/?");
		btnHelp.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnHelp.setBounds(434, 45, 159, 23);
		contentPane.add(btnHelp);
		
		JButton btnRelease = new JButton("Ipconfig/release");
		btnRelease.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnRelease.setBounds(434, 77, 159, 23);
		contentPane.add(btnRelease);
		
		JButton btnRelease6 = new JButton("Ipconfig/release6");
		btnRelease6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRelease6.setBounds(434, 111, 159, 23);
		contentPane.add(btnRelease6);
		
		JButton btnRenew = new JButton("Ipconfig/renew");
		btnRenew.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRenew.setBounds(434, 145, 159, 23);
		contentPane.add(btnRenew);
		
		JButton btnRenew6 = new JButton("Ipconfig/renew6");
		btnRenew6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRenew6.setBounds(434, 179, 159, 23);
		contentPane.add(btnRenew6);
		
		JButton btnFlushdns = new JButton("Ipconfig/flushdns");
		btnFlushdns.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnFlushdns.setBounds(434, 213, 159, 23);
		contentPane.add(btnFlushdns);
		
		JButton btnRegisterdns = new JButton("Ipconfig/registerdns");
		btnRegisterdns.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnRegisterdns.setBounds(434, 247, 159, 23);
		contentPane.add(btnRegisterdns);
		
		JButton btnDisplaydns = new JButton("Ipconfig/displaydns");
		btnDisplaydns.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnDisplaydns.setBounds(434, 281, 159, 23);
		contentPane.add(btnDisplaydns);
		
		JButton btnShowclassid = new JButton("Ipconfig/showclassid");
		btnShowclassid.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnShowclassid.setBounds(434, 315, 159, 23);
		contentPane.add(btnShowclassid);
		
		JButton btnSetclassid = new JButton("Ipconfig/setclassid");
		btnSetclassid.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSetclassid.setBounds(434, 349, 159, 23);
		contentPane.add(btnSetclassid);
		
		JButton btnAllcom = new JButton("Ipconfig/allcompartments");
		btnAllcom.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnAllcom.setBounds(434, 383, 159, 23);
		contentPane.add(btnAllcom);
		
		JLabel lblNewLabel = new JLabel("Command Promt Java");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(189, 10, 239, 24);
		contentPane.add(lblNewLabel);
	}
	
	private void allTxt() {
		
	}
}