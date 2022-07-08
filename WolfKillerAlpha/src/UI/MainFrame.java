package UI;

import UI.Condition.Condition;
import UI.MenuLine.MenuLine;

import java.awt.*;
import java.awt.event.*;

public class MainFrame {
    Frame mainFrame = new Frame("狼人杀终结者 alpha v1.0");

    public void init() {
        // 设置关闭窗口监听器
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // 加入菜单条
        mainFrame.setMenuBar(new MenuLine().MakeMenuLine());

        //加入状态栏
        mainFrame.add(new Condition().makeCondition());

        // 整理并显示
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
