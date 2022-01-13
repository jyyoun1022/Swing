package GUI프로그래밍공부해보자;
import javax.swing.*;

public class JLabel_JTextField {

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setLocation(700,400);    //내 화면의 가운데에 오게 위치값 잡아주기
        jf.setSize(380,180);
        jf.setTitle("로그인");
        jf.setLayout(null);

        JLabel jl = new JLabel("아이디 : ");
        jl.setSize(80,30);
        jl.setLocation(30,30);
        jl.setHorizontalAlignment(JLabel.CENTER);

        jf.add(jl); //JFrame에 JLabel를 추가



        jl = new JLabel("비밀번호 : ");
        jl.setSize(80,30);
        jl.setLocation(30,70);
        jf.add(jl);

        jf.add(jl);
        JTextField jt = new JTextField();
        jt.setSize(130,30);
        jt.setLocation(110,30);

        jf.add(jt);//JFrame에 JTextField를 추가
        jt = new JTextField();
        jt.setSize(130,30);
        jt.setLocation(110,70);
        jf.add(jt);

        jf.setVisible(true);    //이것은 항상 마지막에 넣어야한다.중간에 넣을경우 거기까지 구현하겠다.라는 뜻이 된다.
    }
}
