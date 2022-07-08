package UI.Condition;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Condition {

    Box conditionBar = Box.createVerticalBox();

    // 属于计日板的组件对象
    Label dayCount = new Label("第一天");

    // 属于号码状态板的组件对象
    Box idPad = Box.createHorizontalBox();
    Box idSubPad1 = Box.createVerticalBox();
    Box idSubPad2 = Box.createVerticalBox();
    ArrayList<Label> ids = new ArrayList<>();

    // 属于只看菜单的组件对象
    Box onlyMenu = Box.createVerticalBox();
    Label onlyTitle = new Label("只看");
    Box checkBar = Box.createHorizontalBox();
    Checkbox voteOnly = new Checkbox("票型", false);
    Checkbox statementOnly = new Checkbox("发言", false);
    Checkbox eventOnly = new Checkbox("事件", false);


    public Box makeCondition() {
        // 组装计日板，调整计日板的大小，以及字体大小
        dayCount.setAlignment(Label.CENTER);
        dayCount.setFont(new Font("", Font.PLAIN, 40));

        // 组装号码状态板
        ids.add(null); // 加入一个空Label，以后调用的时候，编号能与下标直接对应
        for (int i = 1; i <= 12; i++) {
            StringBuilder s = new StringBuilder();
            if (i == 1 || i == 6) {
                s.append(" ");
                s.append(((Integer) i).toString());
                s.append(" ");
            } else {
                s.append(((Integer) i).toString());
            }
            ids.add(new Label(s.toString()));
            ids.get(i).setFont(new Font("", Font.BOLD, 30));
            ids.get(i).setAlignment(Label.CENTER);
            ids.get(i).setBackground(Color.lightGray);
        }
        for (int i = 1; i <= 6; i++) {
            idSubPad1.add(ids.get(i));
        }
        for (int i = 7; i <= 12; i++) {
            idSubPad2.add(ids.get(i));
        }
        idPad.add(Box.createVerticalStrut(1));
        idPad.add(idSubPad1);
        idPad.add(Box.createVerticalStrut(1));
        idPad.add(idSubPad2);
        idPad.add(Box.createVerticalStrut(1));

        // 组装只看菜单
        onlyTitle.setFont(new Font("", Font.BOLD, 20));
        onlyTitle.setAlignment(Label.CENTER);
        Font onlyFont = new Font("", Font.PLAIN, 15);
        voteOnly.setFont(onlyFont);
        statementOnly.setFont(onlyFont);
        eventOnly.setFont(onlyFont);
        checkBar.add(voteOnly);
        checkBar.add(statementOnly);
        checkBar.add(eventOnly);
        onlyMenu.add(onlyTitle);
        onlyMenu.add(checkBar);


        conditionBar.add(dayCount);
        conditionBar.add(idPad);
        conditionBar.add(onlyMenu);

        return conditionBar;
    }
}
