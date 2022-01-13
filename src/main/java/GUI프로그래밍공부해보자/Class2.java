package GUI프로그래밍공부해보자;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Class2 {

    public static void main(String[] args) {
    JFrame jf = new JFrame();
    jf.setSize(300,360);
    jf.setLayout(null);

    JButton jb = new JButton("Test");
    jb.setSize(150,60);
    jb.setLocation(10,10);
    jf.add(jb);

    JTextField jt = new JTextField("Password : ");
    jt.setBounds(10,50,150,60);
    jf.add(jt);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null,"이벤트 생성\n 클릭한번만");
            }
        });

    }
}
