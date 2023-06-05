package main;

import javax.swing.*;
import java.awt.*;

public class LoginFrame {

    private JFrame jFrame;
    private JButton loginButton;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    public LoginFrame() {
        jFrame = new JFrame();
        loginButton = new JButton("登录");
        usernameTextField = new JTextField(10);
        passwordTextField = new JTextField(10);
        usernameLabel = new JLabel("用户名");
        passwordLabel = new JLabel("密码");
        System.out.println(1);
    }

    public void initJFrame() {
        jFrame.setTitle("登录");
        jFrame.setSize(600,500);
        jFrame.setDefaultCloseOperation(1);
        Container contentPane = jFrame.getContentPane();
        Panel usernamePanel = new Panel();
        Panel passwordPanel = new Panel();
        Panel loginButtonPanel = new Panel();
        Panel loginPanel = new Panel();
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameTextField);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordTextField);
        loginButtonPanel.add(loginButton);
        GridLayout gridLayout = new GridLayout(3, 1);
        gridLayout.setVgap(0);
        loginPanel.setLayout(gridLayout);
        loginPanel.add(usernamePanel);
        loginPanel.add(passwordPanel);
        loginPanel.add(loginButtonPanel);
        contentPane.add(loginPanel);
        jFrameCenter();
        jFrame.setVisible(true);
    }

    private void jFrameCenter() {
        int jFrameWidth = jFrame.getWidth();
        int jFrameHeight = jFrame.getHeight();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        double screenSizeWidth = screenSize.getWidth();
        double screenSizeHeight = screenSize.getHeight();
        if(jFrameWidth>screenSizeWidth) {
            jFrameWidth = (int) screenSizeWidth;
        }
        if(jFrameHeight>screenSizeHeight) {
            jFrameHeight = (int) screenSizeHeight;
        }
        int positionX = (int) ((screenSizeWidth-jFrameWidth)/2);
        int positionY = (int) ((screenSizeHeight-jFrameHeight)/2);
        jFrame.setLocation(positionX,positionY);
    }
}
