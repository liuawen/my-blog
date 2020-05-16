package top.liuawen.snake;
//awt

import javax.swing.*;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2018-03-03 7:46 PM
 */
public class StartGames {
    public static void main(String[] args) {
        //1.绘制一个静态窗口  JFrame
        JFrame frame = new JFrame("贪吃蛇小游戏");
        frame.setBounds(10,10,900,720);//设置界面起始位置、大小
        frame.setResizable(false);//窗口大小则不可以改变
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭事件，游戏可以关闭了

        //2.添加我们自己编写的画布背景
        frame.add(new GamePanel());

        frame.setVisible(true); //将窗口展示出来


    }
}

