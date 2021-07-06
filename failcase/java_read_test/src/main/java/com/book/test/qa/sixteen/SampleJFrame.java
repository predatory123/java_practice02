package main.java.com.book.test.qa.sixteen;

import javax.swing.*;
import java.awt.*;

/**
 * JFrame -- 生成gui组件
 */
public class SampleJFrame {
    public static void main(String[] args) {
//        testWindows();
//        testTaschenrechner();
        testLoginWindow();
    }

    /**
     * 普通窗口
     */
    private static void testWindows() {
        JFrame fenster = new JFrame("Gui Sample"); // 标题栏
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 定义可关闭
        fenster.setSize(240, 80);  // 定义窗口的宽高

        JButton schaltflaeche = new JButton("这是一个按钮");
        Container fensterScheibe = fenster.getContentPane();
        // 设置组件布局位置
        fensterScheibe.add(schaltflaeche, BorderLayout.WEST);

        JLabel label = new JLabel("Helo Java");
        fenster.getContentPane().add(label, BorderLayout.EAST);

        fenster.setVisible(true); // 设置窗口的可见性
    }

    /**
     * 网格布局
     */
    public static void testTaschenrechner() {
        JFrame jfmtest = new JFrame("testTaschenrechner");
        jfmtest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfmtest.setSize(200,200);
        jfmtest.setLayout(new GridLayout(4,4));
        jfmtest.getContentPane().add(new JButton("7"));
        jfmtest.getContentPane().add(new JButton("8"));
        jfmtest.getContentPane().add(new JButton("9"));
        jfmtest.getContentPane().add(new JButton("/"));
        jfmtest.getContentPane().add(new JButton("4"));
        jfmtest.getContentPane().add(new JButton("5"));
        jfmtest.getContentPane().add(new JButton("6"));
        jfmtest.getContentPane().add(new JButton("*"));
        jfmtest.getContentPane().add(new JButton("1"));
        jfmtest.getContentPane().add(new JButton("2"));
        jfmtest.getContentPane().add(new JButton("3"));
        jfmtest.getContentPane().add(new JButton("-"));
        jfmtest.getContentPane().add(new JButton("0"));
        jfmtest.getContentPane().add(new JButton(","));
        jfmtest.getContentPane().add(new JButton("="));
        jfmtest.getContentPane().add(new JButton("+"));
        jfmtest.setVisible(true);
    }

    /**
     * 网格布 布局
     */
    public static void testLoginWindow() {
        JFrame frama = new JFrame("Login");
        frama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frama.setSize(290,170);
        frama.setLayout(new GridBagLayout());

        JLabel labelName = new JLabel("Name");
        JLabel labelPassword = new JLabel("Password");
        JTextField feldName = new JTextField();
        JPasswordField felfPassword = new JPasswordField();
        JButton schaltflaecheOka = new JButton("Ok");
        JButton schaltflaecheAbbrechen = new JButton("Abbrechen");

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4,4,4,4);
        c.gridx = 0;
        c.gridy = 0;
        frama.getContentPane().add(labelName, c);
        c.gridx = 1;
        c.gridwidth = 2;
        frama.getContentPane().add(feldName, c);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        frama.getContentPane().add(labelPassword, c);
        c.gridx = 1;
        c.gridwidth = 2;
        frama.getContentPane().add(felfPassword, c);
        c.gridy = 2;
        c.gridx = 1;
        c.gridwidth = 1;
        frama.getContentPane().add(schaltflaecheOka, c);
        c.gridx = 2 ;
        c.gridy = 2;
        frama.getContentPane().add(schaltflaecheAbbrechen, c);
        frama.setVisible(true);

    }

}
