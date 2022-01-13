package GUI프로그래밍공부해보자;
import javax.swing.JFrame;

public class JFrameTest extends JFrame{

    public static void main(String[] args) {
    JFrame jf = new JFrame();   //새로운 jFrame을 만들어서 jf란 이름으로 사용할 수 있다.

        jf.setBounds(600,300,300,300);  //jf의 좌표와 크기를 지정하겠습니다.
        jf.setTitle("내 첫 프레임"); //jf의 제목을 "내 첫 프레임"으로 설정한다.
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //닫기 버튼을 눌렀을 때 동작 설정(프로그램을 아예 나가도록 설정한다.)
        jf.setVisible(true);    //jf프레임이 보이도록 설정
    }
}
