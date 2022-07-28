package com.baranbatur.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setLayout() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public static int centerLocation(String point, Dimension dimension) {
        switch (point) {
            case "x":
                return (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - dimension.getWidth() / 2);
            case "y":
                return (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - dimension.getHeight() / 2);
            default:
                return 0;
        }
    }
}
