package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator extends JFrame {
    private JTextField inputSpace;  //화면은 JTextField로 구현
    private ArrayList<String> equation = new ArrayList<String>();   //계산기능을 구현하기 위해 ArrayList에 숫자와 연산 기호를 하나씩 구분에 담아주기
    private String num ="";


    public Calculator() {
        setLayout(null);    //배치 관리자 별도로 사용하지 않을거에요.

        inputSpace = new JTextField();
        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.darkGray);
        inputSpace.setHorizontalAlignment(JTextField.CENTER);
        inputSpace.setFont(new Font("ITALIC", Font.BOLD, 50));
        inputSpace.setBounds(0, 0, 300, 100);

        JPanel buttonPanel = new JPanel();//버튼들을 담을 패널 생성
        buttonPanel.setLayout(new GridLayout(4, 4, 2, 2));
        buttonPanel.setBounds(0, 100, 300, 280);

        String[] buttonOrder = {"C", "/", "x", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0"};
        JButton[] buttons = new JButton[buttonOrder.length];    //buttonOrder에 있는 값들의 수를 JButton배열의 수

        for (int i = 0; i < buttonOrder.length; i++) {
            buttons[i] = new JButton(buttonOrder[i]);
            buttons[i].addActionListener(new PadActionListener());

            buttonPanel.add(buttons[i]); //buttonPanel에 buttons 배열 넣기
        }

        add(inputSpace);    //프레임에 텍스트필트 넣기
        add(buttonPanel);   //프레임에 버픈패널 넣기

        setTitle("계산기");    //창의제목
        setVisible(true);   //창의 보이기 여부
        setSize(300, 400);   //창의 사이즈
        setLocationRelativeTo(null);    //화면 가운데에 띄우기
        setResizable(true);    //사이즈 조절 불가능하게 하기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫을 때 프로그램 또한 종
    }
        class PadActionListener implements ActionListener{//만든 버튼에 액션 리스너를 붙여서 기능 추가하기
            @Override
            public void actionPerformed(ActionEvent e) {
                String whichButton =e.getActionCommand(); //어떤 버튼이 눌렸는지 확인

                if(whichButton.equals("C")){
                    inputSpace.setText(""); //만약 Buttons[i]에서 "C"를 눌렀을 때 JTextField 초기화시키기
                }else if(whichButton.equals("=")){    //만약 "="이 눌렸을때 계산값이 나오도록 해주기
                    String result = Double.toString(calculate(inputSpace.getText()));
                    inputSpace.setText("" + result);
                    num ="";
                }else{  //"C","=" 이외의 가 눌렷을떄는 계산식에 추가되도록 하기
                    inputSpace.setText(inputSpace.getText()+e.getActionCommand());  //나머지 버튼을 눌렀을 때 계산식에 추가되도록 하기(이벤트를 발생시킨 객체의 문자열을 가져온다 )
                }
            }
        }

    private void fullTextParsing(String inputText) { //계산 기능을 구현, ArrayList에 숫자와 연산 기호를 하나씩 담기.
        equation.clear();  //내부의 배열을 모두 null로 초기화하고 size를 0으로 설정합니다.

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);

            if (ch == '-' | ch == '+' | ch == 'x' | ch == '/') {    //만약 텍스트필드에 사칙연산이 나올경우에
                equation.add(num);
                num = "";   //num을 초기화
                equation.add( ch +""); //사칙연산기호를 ArrayList에 추가.
            } else {
                num = num + ch; //숫자일 경우에는 num 에 더해주기.
            }
        }
        equation.add(num); //반복문이 끝나고 최종으로 있는 num도 ArrayList에 추가
    }
        public double calculate(String inputText) {
            fullTextParsing(inputText);

            double prev = 0;
            double current = 0;
            String mode = "";   //mode라는 변수를 선언하여 연산 기호에 대한 처리

            for (String s : equation) {
                if (s.equals("+")) {
                    mode = "add";
                } else if (s.equals("-")) {
                    mode = "sub";
                } else if (s.equals("x")) {
                    mode = "mul";
                } else if (s.equals("/")) {
                    mode = "div";
                } else {
                    current = Double.parseDouble(s);    //숫자일 경우에는 문자열을 dobule형으로
                    if (mode == "add") {
                        prev += current;    //prev에 계속 계산값이 갱신되어 저장
                    } else if (mode == "sub") {
                        prev -= current;
                    } else if (mode == "mul") {
                        prev *= current;
                    } else if (mode == "div") {
                        prev /= current;
                    } else {
                        prev = current;
                    }
                }
            }
            return prev;    //계산값 반환
    }

    public static void main(String[] args) {
        new Calculator();

    }
}
