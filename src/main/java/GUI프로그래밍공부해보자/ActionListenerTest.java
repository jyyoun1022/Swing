package GUI프로그래밍공부해보자;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest {

    public static void main(String[] args) {
        JButtonTest3 fl = new JButtonTest3();
        fl.JFrameLayout();
    }
}

class JButtonTest3  implements ActionListener { //이벤트 리스너는 static으로 선언한 main()메서드에서는 사용이 불가능하다.
    //따라서 클래스를 하나 더만들어서 선언한다.

    public void JFrameLayout() {

        JFrame jf = new JFrame();
        jf.setSize(300, 300);
        jf.setTitle("What you want Number?");
        jf.setLayout(null);

        String[] name = {"1번", "2번", "3번"};
        for (int i = 0; i < name.length; i++) {
            JButton jb = new JButton(name[i]);
            jb.setSize(160, 50);
            jb.addActionListener(this); //jb 버튼에 이벤트 리스너를 추가,아래에 있는 actionPerformed()메서드를 클릭할 때마다 작동함

            jb.setLocation(80,30+70*i);

            jf.add(jb);
        }
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"이벤트 발생 \n 클릭한 번호는" + e.getActionCommand()+"입니다.");
        //첫번째 인자 : Component parentComponent : 메시지창이 어떤 Frame 에서 보이지게 될 것인지 지정해준다. 보통 null 을 사용한다.
        //getActionCommand()메서드는 이벤트가 발생한 객체의 내용을 돌려준다.(1번을 눌렀을 때 1번을 돌려주고,2번을 눌렀을 때 2번을 돌려준다.)
        //\n 은 줄바꿈이다.
        JOptionPane.showMessageDialog(null,"에러 메세지","ERROR_MESSAGE",JOptionPane.ERROR_MESSAGE);
    }
}




