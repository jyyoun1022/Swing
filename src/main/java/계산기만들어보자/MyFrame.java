package 계산기만들어보자;
import javax.swing.* ;  //스윙 컴포넌트 사용하기 위해 스윙 패키지의 경로명 import

public class MyFrame extends JFrame{    //JFrame을 상속 받아 프레임을 만든다.
    MyFrame(){//생성자
        super("타이틀");   //JFrame("타이틀")생성자 호출
        setTitle("제목"); //타이틀 달기
        setVisible(true);   //프레임이 화면에 나타난다.false의 경우 프레임이 숨겨짐.
    }

    public static void main(String[] args) {
        MyFrame myframe = new MyFrame();//스윙 프레임 생성(MyFrame 객체가 스윙 프레임 역할)
        //main()의 기능은 최소화 하는 것이 좋다.

    }
}
