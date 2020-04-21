package javanotepad;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author moham
 */
public class JavaNotePad extends JFrame {

    JTextArea mainarea;

    public JavaNotePad() {
        initConponent();
    }

    private void initConponent() {
        mainarea = new JTextArea();
        getContentPane().add(mainarea);
        getContentPane().add(new JScrollPane(mainarea),
                BorderLayout.CENTER);
        setTitle("Untitled nodepad");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        JavaNotePad jn = new JavaNotePad();

    }
}
