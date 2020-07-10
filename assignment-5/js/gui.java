import javax.javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class simple{
    JFrame f;
    simple(){
        f = new JFrame();
        JButton jb = new JButton("click me");
        jb.setBounds(130,100,100,40);
        f.add(jb);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new simple();
    }
}