package org.iuea.oop.thegiant;
/* GROUP MEMBERS(" LAWAL BILAL  18/1192/BSSE-S"
                 "ADAMU ABDULRAHMAN  18/446/BSSE-S"
                 " IBRAHIM MATO DANGADA  "19/928/BIT-S"
                 " SADIQ NASIDI SALISU    19/789/BSCS-S"*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.ref.Reference;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class mainView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField fname;
	private JTextField lname;
	private JTextField registration;
	private JTextField reference;
	private JTextField course;

	/**
	 * 
	 */
	
	/**
	 * 
	 */
	public mainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 437);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAction = new JMenu("Action");
		menuBar.add(mnAction);
		
		JMenuItem mntmLogout = new JMenuItem("logout");
		mnAction.add(mntmLogout);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.blue);
		panel_1.setBounds(90, 0, 476, 341);
		contentPane.add(panel_1);
		panel_1.setVisible(false);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				
                                
				
			}
		});
		btnStudents.setBounds(0, 0, 92, 41);
		contentPane.add(btnStudents);
		
		JButton btnNewButton = new JButton("Course");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(0, 40, 92, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Lecture");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(0, 125, 92, 41);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
	
		panel.setBounds(0, 0, 92, 377);
		contentPane.add(panel);
		panel.setLayout(null);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 476, 341);
		panel_1.add(panel_4);
		
		panel_4.setLayout(null);
		panel_4.setVisible(false);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setForeground(Color.white);
		lblFirstName.setBounds(23, 56, 75, 14);
		panel_4.add(lblFirstName);
		
		fname = new JTextField();
		
		fname.setBounds(168, 53, 237, 20);
		panel_4.add(fname);
		fname.setColumns(10);
		
		lname = new JTextField();
		lname.setBounds(168, 90, 237, 20);
		panel_4.add(lname);
		lname.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.GREY);
		lblLastName.setBackground(Color.WHITE);
		lblLastName.setBounds(23, 93, 75, 14);
		panel_4.add(lblLastName);
		
		JLabel lblSex = new JLabel("Sex:");
		
		lblSex.setBounds(23, 140, 60, 14);
		panel_4.add(lblSex);
		
		JComboBox sex = new JComboBox();
		sex.setModel(new DefaultComboBoxModel(new String[] {"male", "female"}));
		sex.setBounds(168, 137, 237, 20);
		panel_4.add(sex);
		
		JLabel lblRegistraton = new JLabel("Registration");
		lblRegistraton.setForeground(Color.BLACK);
		lblRegistraton.setBounds(23, 229, 86, 14);
		panel_4.add(lblRegistration);
		
		registration = new JTextField();
		registration.setBounds(168, 226, 237, 20);
		panel_4.add(registration);
		registration.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new Object[]  {
						//reference.getText(),
						fname.getText(),
						lname.getText(),
						sex.getSelectedItem(),
						course.getText(),
						registration.getText(),
				});
				
				if(table.getSelectedRow()==1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "Added Success","error",JOptionPane.OK_OPTION);
					}
				}
				
				panel_4.setVisible(false);
				
			}
		});
		btnSubmit.setBackground(Color.RED);
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBounds(42, 285, 100, 34);
		panel_4.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBounds(288, 285, 93, 34);
		panel_4.add(btnCancel);
		
		/*JLabel lblReference = new JLabel("Id:");
		lblReference.setBounds(23, 22, 62, 14);
		panel_4.add(lblReference);
		
		reference = new JTextField();
		reference.setBounds(168, 19, 237, 20);
		panel_4.add(reference);
		reference.setColumns(10);*/
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(23, 184, 60, 14);
		panel_4.add(lblCourse);
		
		course = new JTextField();
		course.setBounds(165, 181, 240, 20);
		panel_4.add(course);
		course.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 51, 476, 290);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{1, "Ibrahim", "Mato Dangada", "male", "web design", "19/928/BIT-s"},
				{2, "Abdulrahman", "Adamu", "male", "OOAD", "18/446/BSSE-S"},
				{3, "Lawal", "Bilal", "male", "computer", "18/1192/BSSE-S"},
				{4, "Sadiq", "Nasidi", "male", "oop", "19/789/BCSE-S"},
				{5, "Salisu", "Sani Salisu", "male", "numerical", "19/235/BSSE-S"}
			},
			new String[] {
				"S/N", "First Name", "Last Name", "Sex", "Course", "Registration"
			}
		));
		scrollPane.setViewportView(table);
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 476, 52);
		
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(170, 18, 89, 23);
		panel_3.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(351, 18, 89, 23);
		panel_3.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "Field can't be empty","error",JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "You must select row to delete","error",JOptionPane.OK_OPTION);
					}
				}else {
				 model.removeRow(table.getSelectedRow());
				}
				
			}
		});
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_4.setVisible(true);
			//btnEdit.setVisible(false);
			//btnAdd.setVisible(false);
                        //btnDelete.setVisible(false);
			}
		});
		btnAdd.setBounds(29, 18, 73, 23);
		panel_3.add(btnAdd);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.gray);
		panel_2.setBounds(90, 343, 476, 34);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCopyRight_The_Giant= new JLabel("Copy Right The_Giant");
		lblCopyRight_The_Giant.setForeground(Color.black);
		lblCopyRight_The_Giant.setBounds(148, 11, 146, 14);
		panel_2.add(lblCopyRight_The_Giant);
	}
}
