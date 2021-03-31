package bsu.rfe.java.group8.lab6.Yury.varA4;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
    @SuppressWarnings("serial")
    public class MainFrame extends JFrame {
        // Константы, задающие размер окна приложения, если оно
// не распахнуто на весь экран
        private static final int WIDTH = 700;
        private static final int HEIGHT = 500;
        private JMenuItem pauseMenuItem;
        private JMenuItem resumeMenuItem;
        // Поле, по которому прыгают мячи
        private Field field = new Field();
        // Конструктор главного окна приложения
        public MainFrame() {
            super("Программирование и синхронизация потоков");
            setSize(WIDTH, HEIGHT);
            Toolkit kit = Toolkit.getDefaultToolkit();
// Отцентрировать окно приложения на экране
            setLocation((kit.getScreenSize().width - WIDTH) / 2,
                    (kit.getScreenSize().height - HEIGHT) / 2);
// Установить начальное состояние окна развѐрнутым на весь экран
            setExtendedState(MAXIMIZED_BOTH);
        }

    public static void main(String[] args) {
	// write your code here
    }
}
