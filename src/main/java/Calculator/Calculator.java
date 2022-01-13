package Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    private JTextField inputSpace;  //화면은 JTextField로 구현


    Calculator(){
        setLayout(null);    //배치 관리자 별도로 사용하지 않을거에요.

        inputSpace = new JTextField();
        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.darkGray);
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);
        inputSpace.setFont(new Font("ITALIC",Font.BOLD,50));
        inputSpace.setBounds(0,0,300,100);

        JPanel buttonPanel = new JPanel();//버튼들을 담을 패널 생성
        buttonPanel.setLayout(new GridLayout(4,4,2,2));
        buttonPanel.setBounds(0,100,300,280);

        String[] buttonOrder ={"AC","/","x","=","7","8","9","+","4","5","6","-","1","2","3","0"};
        JButton[] buttons = new JButton[buttonOrder.length];

        for(int i=0; i<buttonOrder.length; i++){
            buttons[i] = new JButton(buttonOrder[i]);
            buttons[i].setFont(new Font("ITALIC",Font.BOLD,25));

            if(buttonOrder[i] == "AC"){
                buttons[i].setBackground(new Color(0xFF9300));buttons[i].setOpaque(true);}

            else if((i >= 4 && i <= 6) || (i >= 8 && i <= 10) ||(i>=12 && i<=14)){
                buttons[i].setBackground(Color.black);buttons[i].setOpaque(true);}
            else {
                buttons[i].setBackground(Color.gray);buttons[i].setOpaque(true);}

            buttons[i].setForeground(Color.white);buttons[i].setOpaque(true);   //텍스트 색
            buttons[i].setBorderPainted(false);buttons[i].setOpaque(true);

            buttonPanel.add(buttons[i]); //buttonPanel에 buttons 배열 넣기
            }

        add(inputSpace);    //프레임에 텍스트필트 넣기
        add(buttonPanel);   //프레임에 버픈패널 넣기





        add(inputSpace);    //JFrame에 inputSpace 넣어줍니다.

        setTitle("계산기");    //창의제목
        setVisible(true);   //창의 보이기 여부
        setSize(300,400);   //창의 사이즈
        setLocationRelativeTo(null);    //화면 가운데에 띄우기
        setResizable(true);    //사이즈 조절 불가능하게 하기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫을 때 프로그램 또한 종

    }
    public static void main(String[] args) {
        new Calculator();

    }
}
