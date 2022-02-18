import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{
    Window(){
        setTitle("Счетчик");
        setSize(400, 350);
        setLayout(null);
        setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        Font BigFont = new Font("", Font.ROMAN_BASELINE, 20);

        JLabel label = new JLabel("Число");
        label.setFont(BigFont);
        label.setBounds(70, 50, 70,35);

        JTextField value = new JTextField("0");
        value.setFont(BigFont);
        value.setBounds(140, 50, 70, 35);

        JButton buttonOne = new JButton("+1");
        buttonOne.setFont(BigFont);
        buttonOne.setBounds(220,50,70,35);
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valueFromTextField = value.getText();
                int a = Integer.parseInt(valueFromTextField);
                if(a < 3){
                    a++;
                    value.setText(Integer.toString(a));
                }
            }
        });

        JButton buttonTwo = new JButton("-1");
        buttonTwo.setFont(BigFont);
        buttonTwo.setBounds(220,80,70,35);
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valueFromTextField = value.getText();
                int a = Integer.parseInt(value.getText());
                if(a >- 5){
                    a--;
                    value.setText(Integer.toString(a));
                }
            }
        });

        add(value);
        add(buttonOne);
        add(buttonTwo);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }

}
