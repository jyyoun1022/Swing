package GUI프로그래밍공부해보자;
import javax.swing.*;
import java.awt.*;

class setFontEx extends JFrame{
    setFontEx(){
        this.setTitle("setFont 사용 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        this.add(panel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        this.setSize(600,300);
        this.setVisible(true);
    }
    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.green);
            Font f = new Font("Arial", Font.ITALIC, 30);
            g.setFont(f);
            g.drawString("자바는 재밌다.~~", 30, 30);
            g.setFont(new Font("궁서체",Font.BOLD, 40));
            g.drawString("자바는 재밌다.~~", 30, 90);
            g.setFont(new Font("돋움체", Font.CENTER_BASELINE, 50));
            g.drawString("자바는 재밌다.~~", 30, 170);
        }
    }
}
public class JavaApplication6 {
    public static void main(String[] args) {
        new setFontEx();
    }

}

