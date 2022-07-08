package UI.MenuLine;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuLine {
    private MenuBar menuBar = new MenuBar();
    private Menu fileMenu = new Menu("文件");
    private MenuItem save = new MenuItem("保存");
    private MenuItem load = new MenuItem("导入");

    // 在此组装好菜单条，然后当做返回值传给 MainFrame
    public MenuBar MakeMenuLine() {
        save.addActionListener(new ActionListener() {
            @Override
            // save功能在此实现
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了保存按钮");
            }
        });
        load.addActionListener((new ActionListener() {
            @Override
            // load功能在此实现
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了导入按钮");
            }
        }));

        fileMenu.add(save);
        fileMenu.add(load);
        menuBar.add(fileMenu);

        return menuBar;
    }
}
