package GUI프로그래밍공부해보자;
import javax.swing.*;

public class JButtonTest2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(300,300);
        jf.setLocation(400,400);
        jf.setTitle("내가 만든 Button");
        jf.setLayout(null);

        String[]name={"1번","2번","3번"};
        for(int i=0; i<name.length; i++){
            JButton jb = new JButton(name[i]);
            jb.setSize(140,50);
            jb.setLocation(80,30+ 70*i);
            jf.add(jb);
        }
        jf.setVisible(true);
    }
}
