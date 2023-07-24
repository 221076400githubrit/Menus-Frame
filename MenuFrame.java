/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.ul;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author 001
 */
public class MenuFrame extends JFrame{
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu viewMenu;
    private JMenu editorsViewSubMenu;
    private JMenu splitViewSubMenu;
    
    private JMenuItem newProjectMenuItem;
    private JMenuItem newFileMenuItem;
    private JMenuItem openProjectMenuItem;
    private JMenuItem openRecentProjectMenuItem;
    private JMenuItem closeAllProjectsMenuItem;
    
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;
    
    private JMenuItem sourceMenuItem;
    
    private JMenuItem horizontallyMenuItem;
    private JMenuItem verticallyMenuItem;
    private JMenuItem clearMenuItem;

    public MenuFrame() {
        //create frame
        setTitle("Menu Frame");
        setSize(700, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        
        //create menuBar
        menuBar = new JMenuBar();
        
        //create menus
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        editorsViewSubMenu = new JMenu("Editors");
        splitViewSubMenu = new JMenu("Split");
        
        //create menuItems
        newProjectMenuItem = new JMenuItem("New Project...");
        newFileMenuItem = new JMenuItem("New File...");
        openProjectMenuItem = new JMenuItem("Open Project...");
        openRecentProjectMenuItem = new JMenuItem("Open Recent Project");
        closeAllProjectsMenuItem = new JMenuItem("Close All Projects");
        
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem = new JMenuItem("Copy");
        pasteMenuItem = new JMenuItem("Paste");
        
        //view menu items
        sourceMenuItem = new JMenuItem("Source");
        editorsViewSubMenu.add(sourceMenuItem);
        
        horizontallyMenuItem = new JMenuItem("Horizontally");
        verticallyMenuItem = new JMenuItem("Vertically");
        clearMenuItem = new JMenuItem("Clear");
        splitViewSubMenu.add(horizontallyMenuItem);
        splitViewSubMenu.add(verticallyMenuItem);
        splitViewSubMenu.add(clearMenuItem);
        
        //add file items to the menu
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(openRecentProjectMenuItem);        
        fileMenu.add(closeAllProjectsMenuItem);
        
        //add edit items to the menu
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);        
        editMenu.add(pasteMenuItem);
        
        //add view items to the menu
        viewMenu.add(editorsViewSubMenu);
        viewMenu.add(splitViewSubMenu);
        
        //add the menus to the bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        //add the bar to the frame
        setJMenuBar(menuBar);
        
        setVisible(true);   
    }
}
