package javanotepad;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author mohammad Saiful
 */
public class JavaNotePad extends JFrame {

    JTextArea mainarea;
    JMenuBar mbar;
    JMenu mnuFile, mnuEdit, mnuFormat, mnuHelp;
    JMenuItem itmNew, itmOpen, itmSave;

    public JavaNotePad() {
        initConponent();
    }

    private void initConponent() {
        mainarea = new JTextArea();
        getContentPane().add(mainarea);
        //Scroll bar adding for more text
        getContentPane().add(new JScrollPane(mainarea),
                BorderLayout.CENTER);
        
        //menu bar
        mbar = new JMenuBar();
        //menu
        mnuEdit = new JMenu("Edit");
        mnuFile = new JMenu("File");
        mnuFormat = new JMenu("Fromat");
        mnuHelp = new JMenu("Help");
        //menu Item
        itmNew = new JMenuItem("New");
        itmOpen = new JMenuItem("Open");
        itmSave = new JMenuItem("Save");
       //Add menu item
        mnuFile.add(itmNew);
        mnuFile.add(itmOpen);
        mnuFile.add(itmSave);
        //Add menu item to menu Bar
        mbar.add(mnuFile);
        mbar.add(mnuEdit);
        mbar.add(mnuFormat);
        mbar.add(mnuHelp);
        //add menubar to frame
        setJMenuBar(mbar);
        
        setTitle("Untitled nodepad");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        JavaNotePad jn = new JavaNotePad();

    }
}
