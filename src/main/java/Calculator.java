import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JTextField inputSpace;   //연산결과창
    private boolean state = false;      //화면에 표시된 number 핸들러
    private int num3;
    private double num1, num2;
    private double result;  //연산 결과
    private String func = "";   //기능 연산자
    private String nInput = ""; //마지막에 누른 연산자 저장

    String[] buttonOrder = { "←", "C", "%", "x²", "7", "8", "9", "÷", "4", "5", "6", "×", "1", "2", "3", "-", ".", "0", "=",
            "+" };        // 버튼 안에 값 배열
    public Calculator(){

        setTitle("계산기");
        setResizable(true);
        setVisible(true);
        setSize(400,300);
        setLocationRelativeTo(null);


        //결과창GUI
        inputSpace = new JTextField("값을 입력하세요",20);
        inputSpace.setEditable(false);
        inputSpace.setBounds(0,0,300,100);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,4,2,2));

        JButton[] buttons = new JButton[buttonOrder.length];   //버튼 생성, 배열의 길이만큼 값을 가져온다.

        for(int i =0; i<buttonOrder.length; i++){
            buttons[i] =new JButton(buttonOrder[i]);
            buttons[i].addActionListener(new PadActionListener);
            buttonPanel.add(buttons[i]);
        }
       setLayout(null);
       setBounds();




    }
    class PadActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = e.getActionCommand();    //이벤트를 발생시킨 객체의 문자열을 가져와서 input에 넣는다.

            if(input.equals("+")){
                num3
            }
        }
    }
    public static void main(String[] args) {


    }
}
