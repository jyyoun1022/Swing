package GUI프로그래밍공부해보자;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldTest extends JFrame{

    public JTextFieldTest() {
        setLayout(new FlowLayout());
        setSize(500,500);
        //JTextField wtf = new JTextField("숫자를 입력하세요",15);  //열의개수가 15개이고 ,"숫자를 입력하세요"로 초기된 텍스트필스
        JTextField jtf = new JTextField(20);    //입력창의 열의 개수가 15개(입력창의 길이)
        //JTextField:한줄의 입력받는창
//        = 텍스트 입력 도중 <ENTER> 키가 입력되면 Action 이벤트 발생
//                = 입력 가능한 문자 개수와 입력 창의 크기는 서로 다름

        jtf.setText("setEditable(false)");
                jtf.setForeground(Color.red); // 텍스트 빨간색으로 변경
        jtf.setEditable(false); //setEnabeld(false)를 했을때는 텍스트 색상을 바꿀려고 시도해봐도 적용이 안되는 것을 볼 수 있다.
        // 그리고 마우스로 클릭하거나 드래그해봐도 아무런 액션도 할 수 없었다.

        add(jtf);   //JFrame에 jtf를 넣는다.

        setVisible(true);
        setLocationRelativeTo(null);    //창을 화면 가운데 띄우는 역할을 한다.
        setDefaultCloseOperation(EXIT_ON_CLOSE);    //윈도우창 종료시 프로세스까지 모두 닫을 수 있다,
    }

    public static void main(String[] args) {
        new JTextFieldTest();
    }
}