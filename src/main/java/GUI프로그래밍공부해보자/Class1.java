package GUI프로그래밍공부해보자;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

public class Class1 {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setSize(500, 560);


       JButton jb1 = new JButton("1번째");
       jf.add(jb1);
       JButton jb2 = new JButton("2번째");
       jf.add(jb2);
       JButton jb3 = new JButton("3번째");
       jf.add(jb3);

            jf.setLayout(null);
            jb1.setBounds(10,10,160,50);
            jb2.setBounds(10,50,160,50);
            jb3.setBounds(10,90,160,50);



        }

    }

