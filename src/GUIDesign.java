import javax.swing.*;

/**
 * Created by isjo16 on 2019-01-11.
 */
public class GUIDesign {
    private JTextField textField1;
    private JButton browseButton;
    private JTextField textField2;
    private JButton browseButton1;
    private JTextField enterKeyLeaveEmptyTextField;
    private JButton decryptButton;
    private JButton enryptButton;
    private JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIDesign");
        frame.setContentPane(new GUIDesign().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
