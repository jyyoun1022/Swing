package GUI프로그래밍공부해보자;
import javax.swing.*;

public class JButtonTest {

    public static void main(String[] args) {
        JFrame jf = new JFrame();   //프레임을 만들고 사이즈와 위치를 설정한다.
        jf.setSize(220,180);
        jf.setLocation(200,200);
        jf.setTitle("JButton");
        jf.setLayout(null); //jf프레임의 레이아웃을 null으로 설정한다.

        JButton jb = new JButton("Click");  //버튼을 만들고 사이즈와 위치를 설정한다.
        jb.setSize(70,40);
        jb.setLocation(60,40);
        jf.add(jb); //jf프레임에 jb를 넣는다.

        jf.setVisible(true);
    }
}
