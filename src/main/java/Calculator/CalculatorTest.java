package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class CalculatorTest extends JFrame {
    private JTextField inputSpace;
    private ArrayList<String> equation = new ArrayList<>();
    private String num = "";

    public CalculatorTest() {
        setLayout(null);


        inputSpace = new JTextField();
        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.darkGray);
        inputSpace.setHorizontalAlignment(JTextField.LEFT);
        inputSpace.setFont(new Font("ITALIC", Font.BOLD, 50));
        inputSpace.setBounds(0, 0, 300, 100);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 2, 2));
        buttonPanel.setBounds(0, 100, 300, 280);

        String[] buttonOrder = {"C", "/", "x", "=", "9", "8", "7", "+", "4", "5", "6", "-", "1", "2", "3", "0"};
        JButton[] buttons = new JButton[buttonOrder.length];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonOrder[i]);
            buttonPanel.add(buttons[i]);
        }

        add(inputSpace);
        add(buttonPanel);

        setTitle("계산기");
        setVisible(true);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class JaeYealActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String operation = e.getActionCommand();

            if (operation.equals("C")) inputSpace.setText("");
            else if (operation.equals("=")) {
                String result = Integer.toString(calculate(inputSpace.getText()));
            } else inputSpace.setText(inputSpace.getText() + e.getActionCommand());

        }
    }

    private void textParsing(String inputText) { //계산 기능 구현
        equation.clear();

        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);

            if (ch == '-' | ch == '+' | ch == 'x' | ch == '/') {
                equation.add(num);  //equation이 배열이에요
                num = "";
                equation.add(ch + "");
                //연산 기호를 거치게 될 시 앞은 숫자이므로 숫자를 먼저 ArrayList에 추가해주고 num을 초기화해준 후 연산 기호를 ArrayList에 추가
            } else {
                num = num + ch;
            }
        }
        equation.add(num);//반복문이 끝나고 최종으로 있는 num을 ArrayList에 추가
    }

    public int calculate(String inputText) {
        textParsing(inputText);

        int prev = 0;
        int current = 0;
        String operation = "";

        for (int i = 0; i < equation.size(); i++) {
            String s = equation.get(i);

            if (s.equals("+")) operation = "add";
            else if (s.equals("-")) operation = "sub";
            else if (s.equals("x")) operation = "times";
            else current = Integer.parseInt(s);
            if (operation == "add") prev += current;
            else if (operation == "sub") prev -= current;
            else if (operation == "times") prev *= current;
            else prev = current;


    }return prev;
}




    public static void main(String[] args) {
       new CalculatorTest();

    }
}
