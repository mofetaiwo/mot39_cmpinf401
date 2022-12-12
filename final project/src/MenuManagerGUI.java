package edu.pitt.menumanagergui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.ArrayList;


public class MenuManagerGUI {
	private JFrame frmMainWindow, frmChildWindow;
	private JLabel lblBuildMenu, lblEntree, lblSide, lblSalad, lblDessert, lblGenerateMenu, lblCreatedMenus, lblEntreeChild, lblSideChild, lblSaladChild, lblDessertChild, lblTotalCal, lblTotalPrice;
	private JComboBox<String> cboEntree, cboSide, cboSalad, cboDessert;
	private JButton btnCreateMenu, btnRandomMenu, btnMinCalMenu, btnMaxCalMenu, btnDetails, btnDeleteAll, btnSaveToFile;
	private JList<Menu> lstMenusList;
	private DefaultListModel<Menu> list;
	private JTextArea txtEntree, txtSide, txtSalad, txtDessert;
	private JTextField txfTotalCal, txtTotalPrice;
	private MenuManager menuManager;
	
	/**
	 * creates menuManager object and loads file
	 * calls main window
	 */
	public MenuManagerGUI() {
		menuManager = new MenuManager("data/dishes.txt");
		buildMainWindow();
	}
	
	/**
	 * builds main window
	 * initializes and places graphic components
	 */
	private void buildMainWindow() {
		frmMainWindow = new JFrame("Menu Manager");
		frmMainWindow.setBounds(0, 0, 520, 520);
		frmMainWindow.setLayout(null);
		
		
		lblBuildMenu = new JLabel("Build your own Menu");
		lblBuildMenu.setBounds(10, 10, 140, 20);
		frmMainWindow.getContentPane().add(lblBuildMenu);
		
		lblEntree = new JLabel("Entree");
		lblEntree.setBounds(lblBuildMenu.getX(), lblBuildMenu.getY(), lblBuildMenu.getWidth(), lblBuildMenu.getHeight() + 60);
		frmMainWindow.getContentPane().add(lblEntree);
		
		lblSide = new JLabel("Side");
		lblSide.setBounds(lblBuildMenu.getX(), lblBuildMenu.getY(), lblBuildMenu.getWidth(), lblBuildMenu.getHeight() + 110);
		frmMainWindow.getContentPane().add(lblSide);
		
		lblSalad = new JLabel("Salad");
		lblSalad.setBounds(lblBuildMenu.getX(), lblBuildMenu.getY(), lblBuildMenu.getWidth(), lblBuildMenu.getHeight() + 160);
		frmMainWindow.getContentPane().add(lblSalad);
		
		lblDessert = new JLabel("Dessert");
		lblDessert.setBounds(lblBuildMenu.getX(), lblBuildMenu.getY(), lblBuildMenu.getWidth(), lblBuildMenu.getHeight() + 210);
		frmMainWindow.getContentPane().add(lblDessert);

		lblGenerateMenu = new JLabel("Or generate a Menu");
		lblGenerateMenu.setBounds(10, 250, 140, 20);
		frmMainWindow.getContentPane().add(lblGenerateMenu);
		
		lblCreatedMenus = new JLabel("Created Menus");
		lblCreatedMenus.setBounds(300, 10, 140, 20);
		frmMainWindow.getContentPane().add(lblCreatedMenus);
		
		
		/**
		 * loads arrayLists of menuManager into comboboxes
		 */
		cboEntree = new JComboBox(menuManager.getEntrees().toArray());
		cboEntree.setBounds(lblBuildMenu.getX() + 80, lblBuildMenu.getY(), lblBuildMenu.getWidth() + 50, lblBuildMenu.getHeight() + 60);
		frmMainWindow.getContentPane().add(cboEntree);
		
		cboSide = new JComboBox(menuManager.getSides().toArray());
		cboSide.setBounds(lblBuildMenu.getX() + 80, lblBuildMenu.getY(), lblBuildMenu.getWidth() + 50, lblBuildMenu.getHeight() + 110);
		frmMainWindow.getContentPane().add(cboSide);
		
		cboSalad = new JComboBox(menuManager.getSalads().toArray());
		cboSalad.setBounds(lblBuildMenu.getX() + 80, lblBuildMenu.getY(), lblBuildMenu.getWidth() + 50, lblBuildMenu.getHeight() + 160);
		frmMainWindow.getContentPane().add(cboSalad);
		
		cboDessert = new JComboBox(menuManager.getDesserts().toArray());
		cboDessert.setBounds(lblBuildMenu.getX() + 80, lblBuildMenu.getY(), lblBuildMenu.getWidth() + 50, lblBuildMenu.getHeight() + 210);
		frmMainWindow.getContentPane().add(cboDessert);
		
		
		list = new DefaultListModel<Menu>();
		
		lstMenusList = new JList<Menu>(list);
		lstMenusList.setBounds(lblCreatedMenus.getX(), lblCreatedMenus.getY() + 30, lblCreatedMenus.getWidth() + 70, lblCreatedMenus.getHeight() + 310);
		frmMainWindow.getContentPane().add(lstMenusList);
		
		
		btnCreateMenu = new JButton("Create Menu with these dishes");
		btnCreateMenu.setBounds(lblBuildMenu.getX() - 10, lblBuildMenu.getY() + 130, lblBuildMenu.getWidth() + 140, lblBuildMenu.getHeight() + 20);
		frmMainWindow.getContentPane().add(btnCreateMenu);
		
		btnRandomMenu = new JButton("Generate a Random Menu");
		btnRandomMenu.setBounds(lblGenerateMenu.getX() - 10, lblGenerateMenu.getY() + 35, lblGenerateMenu.getWidth() + 140, lblGenerateMenu.getHeight() + 20);
		frmMainWindow.getContentPane().add(btnRandomMenu);
		
		btnMinCalMenu = new JButton("Generate a Minimum Calories Menu");
		btnMinCalMenu.setBounds(lblGenerateMenu.getX() - 10, lblGenerateMenu.getY() + 75, lblGenerateMenu.getWidth() + 140, lblGenerateMenu.getHeight() + 20);
		frmMainWindow.getContentPane().add(btnMinCalMenu);
		
		btnMaxCalMenu = new JButton("Generate a Maximum Calories Menu");
		btnMaxCalMenu.setBounds(lblGenerateMenu.getX() - 10, lblGenerateMenu.getY() + 115, lblGenerateMenu.getWidth() + 140, lblGenerateMenu.getHeight() + 20);
		frmMainWindow.getContentPane().add(btnMaxCalMenu);
		
		btnDetails = new JButton("Details");
		btnDetails.setBounds(lblCreatedMenus.getX(), lblCreatedMenus.getY() + 370, lblCreatedMenus.getWidth() - 75, lblCreatedMenus.getHeight() + 15);
		frmMainWindow.getContentPane().add(btnDetails);
		
		btnDeleteAll = new JButton("Delete all");
		btnDeleteAll.setBounds(lblCreatedMenus.getX() + 63, lblCreatedMenus.getY() + 370, lblCreatedMenus.getWidth() - 70, lblCreatedMenus.getHeight() + 15);
		frmMainWindow.getContentPane().add(btnDeleteAll);

		btnSaveToFile = new JButton("Save to file");
		btnSaveToFile.setBounds(lblCreatedMenus.getX() + 131, lblCreatedMenus.getY() + 370, lblCreatedMenus.getWidth() - 60, lblCreatedMenus.getHeight() + 15);
		frmMainWindow.getContentPane().add(btnSaveToFile);
		
		
		/**
		 * asks user for name of menu
		 * takes selected items from comboxes and creates a menu
		 * stores menu in list
		 */
		btnCreateMenu.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Enter a name for your menu");
				
				Menu menu = new Menu(name, (Entree)cboEntree.getSelectedItem(), (Side)cboSide.getSelectedItem(), (Salad)cboSalad.getSelectedItem(), (Dessert)cboDessert.getSelectedItem());
			
				list.addElement(menu);
			}
		});
		
		/**
		 * asks user for name of menu
		 * creates random menu using randomMenu from MenuManager
		 * stores menu in list
		 */
		btnRandomMenu.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Enter a name for your menu");
				
				Menu menu = menuManager.randomMenu(name);
				
				list.addElement(menu);
			}
		});
		
		/**
		 * asks user for name of menu
		 * creates menu using minCaloriesMenu from MenuManager
		 * stores menu in list
		 */
		btnMinCalMenu.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Enter a name for your menu");
				
			    Menu menu = menuManager.minCaloriesMenu(name);
				
				list.addElement(menu);
			}
		});
		
		/**
		 * asks user for name of menu
		 * creates menu using maxCaloriesMenu from MenuManager
		 * stores menu in list
		 */
		btnMaxCalMenu.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("Enter a name for your menu");
				
			    Menu menu = menuManager.maxCaloriesMenu(name);
				
				list.addElement(menu);
			}
		});
		
		/**
		 * calls child window
		 * sets child window visible
		 */
		btnDetails.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				buildChildWindow();
				frmChildWindow.setVisible(true);	
			}
		});
		
		/**
		 * deletes all menus from the list
		 */
		btnDeleteAll.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				list.clear();
			}
		});
		
		/**
		 * writes a file to menus.txt using writeMenus from FileManager
		 */
		btnSaveToFile.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Menu> menuList = new ArrayList<Menu>(lstMenusList.getModel().getSize());
				
				for (int i = 0; i < lstMenusList.getModel().getSize(); i++) {
					menuList.add(lstMenusList.getModel().getElementAt(i));
				}
				
				FileManager.writeMenus("data/menus.txt", menuList);
			}
		});
	}
	
	/**
	 * builds child window
	 * initializes and places graphic components
	 */
	private void buildChildWindow() {
		Menu selectedMenu = lstMenusList.getSelectedValue();
		
		frmChildWindow = new JFrame("Menu: " + selectedMenu);
		frmChildWindow.setBounds(0, 0, 500, 500);
		frmChildWindow.setLayout(null);
		
		
		lblEntreeChild = new JLabel("Entree");
		lblEntreeChild.setBounds(10, 10, 100, 20);
		frmChildWindow.getContentPane().add(lblEntreeChild);
		
		lblSideChild = new JLabel("Side");
		lblSideChild.setBounds(10, 80, 100, 20);
		frmChildWindow.getContentPane().add(lblSideChild);
		
		lblSaladChild = new JLabel("Salad");
		lblSaladChild.setBounds(10, 150, 100, 20);
		frmChildWindow.getContentPane().add(lblSaladChild);
		
		lblDessertChild = new JLabel("Dessert");
		lblDessertChild.setBounds(10, 220, 100, 20);
		frmChildWindow.getContentPane().add(lblDessertChild);
		
		lblTotalCal = new JLabel("Total calories:");
		lblTotalCal.setBounds(10, 290, 100, 20);
		frmChildWindow.getContentPane().add(lblTotalCal);
		
		lblTotalPrice = new JLabel("Total price: $");
		lblTotalPrice.setBounds(10, 330, 100, 20);
		frmChildWindow.getContentPane().add(lblTotalPrice);
		
		
		/**
		 * fills text areas/fields with name and description from selected menu
		 */
		txtEntree = new JTextArea();
		txtEntree.setLineWrap(true);
		txtEntree.setText(selectedMenu.getEntree().getName() + "\n" + selectedMenu.getEntree().getDescription());
		txtEntree.setEditable(false);
		txtEntree.setBounds(150, 10, 300, 60);
		frmChildWindow.getContentPane().add(txtEntree);
		
		txtSide = new JTextArea();
		txtSide.setLineWrap(true);
		txtSide.setText(selectedMenu.getSide().getName() + "\n" + selectedMenu.getSide().getDescription());
		txtSide.setEditable(false);
		txtSide.setBounds(150, 80, 300, 60);
		frmChildWindow.getContentPane().add(txtSide);
		
		txtSalad = new JTextArea();
		txtSalad.setLineWrap(true);
		txtSalad.setText(selectedMenu.getSalad().getName() + "\n" + selectedMenu.getSalad().getDescription());
		txtSalad.setEditable(false);
		txtSalad.setBounds(150, 150, 300, 60);
		frmChildWindow.getContentPane().add(txtSalad);
		
		txtDessert = new JTextArea();
		txtDessert.setLineWrap(true);
		txtDessert.setText(selectedMenu.getDessert().getName() + "\n" + selectedMenu.getDessert().getDescription());
		txtDessert.setEditable(false);
		txtDessert.setBounds(150, 220, 300, 60);
		frmChildWindow.getContentPane().add(txtDessert);
		
		txfTotalCal = new JTextField();
		txfTotalCal.setText(Integer.toString(selectedMenu.totalCalories()));
		txfTotalCal.setEditable(false);
		txfTotalCal.setBounds(150, 290, 100, 20);
		frmChildWindow.getContentPane().add(txfTotalCal);
		
		txtTotalPrice = new JTextField();
		txtTotalPrice.setText(Double.toString(selectedMenu.totalPrice()));
		txtTotalPrice.setEditable(false);
		txtTotalPrice.setBounds(150, 330, 100, 20);
		frmChildWindow.getContentPane().add(txtTotalPrice);
	}
	
	/**
	 * creates menuManagerGUI object
	 * sets main window visible
	 * @param args
	 */
	public static void main(String[] args) {
		MenuManagerGUI menuManagerGUI = new MenuManagerGUI();
		menuManagerGUI.frmMainWindow.setVisible(true);
	}
}
