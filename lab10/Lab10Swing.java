import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab10Swing extends JPanel implements ActionListener, MouseListener {
    // Элементы интерфейса
    private JTextField nameField;
    private JButton submitBtn, redBtn, greenBtn, blueBtn, countBtn;

    // Переменные состояния
    private String displayName = ""; // Задание 6, 10 [cite: 113, 121]
    private String message = "Hello Java Applet (Swing Version)"; // Задание 3, 4 [cite: 107, 109]
    private int clickCount = 0; // Задание 5 [cite: 111]
    private Color currentColor = Color.BLACK; // Задание 7, 10 [cite: 115, 121]

    // Координаты для анимации и мыши
    private int animX = 250; // Задание 8 [cite: 117]
    private int animDir = 1;
    private int mouseX = -10, mouseY = -10; // Задание 9 [cite: 119]

    public Lab10Swing() {
        setLayout(new FlowLayout());

        // Настройка элементов (Задание 10)
        nameField = new JTextField(10);
        submitBtn = new JButton("Submit Name");
        countBtn = new JButton("Click Count: 0");
        redBtn = new JButton("Red");
        greenBtn = new JButton("Green");
        blueBtn = new JButton("Blue");

        // Добавление на панель
        add(new JLabel("Name:"));
        add(nameField);
        add(submitBtn);
        add(countBtn);
        add(redBtn);
        add(greenBtn);
        add(blueBtn);

        // Слушатели
        submitBtn.addActionListener(this);
        countBtn.addActionListener(this);
        redBtn.addActionListener(this);
        greenBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        addMouseListener(this);

        // Запуск анимации (Задание 8) [cite: 118]
        Timer timer = new Timer(50, e -> {
            animX += animDir * 5;
            if (animX > 500 || animX < 200) animDir *= -1;
            repaint();
        });
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            displayName = nameField.getText(); // Задание 6 [cite: 114]
            message = "Button clicked!"; // Задание 4 [cite: 110]
            currentColor = Color.MAGENTA; // Задание 10 [cite: 128]
        } else if (e.getSource() == countBtn) {
            clickCount++; // Задание 5 [cite: 112]
            countBtn.setText("Click Count: " + clickCount);
        } else if (e.getSource() == redBtn) {
            currentColor = Color.RED; // Задание 7 [cite: 116]
        } else if (e.getSource() == greenBtn) {
            currentColor = Color.GREEN; // Задание 7 [cite: 116]
        } else if (e.getSource() == blueBtn) {
            currentColor = Color.BLUE; // Задание 7 [cite: 116]
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Задание 1: Фигуры и подписи [cite: 100, 104]
        g.setColor(Color.BLACK);
        g.drawRect(50, 100, 80, 50); // прямоугольник [cite: 102]
        g.drawString("Rectangle", 55, 95);

        g.drawOval(150, 100, 50, 50); // круг [cite: 103]
        g.drawString("Circle", 155, 95);

        g.drawLine(50, 180, 200, 180); // линия [cite: 104]
        g.drawString("Line", 100, 175);

        // Задание 2: Фигуры разными цветами [cite: 105, 106]
        g.setColor(Color.ORANGE);
        g.fillRect(250, 100, 40, 40);
        g.setColor(Color.CYAN);
        g.fillOval(310, 100, 40, 40);
        g.setColor(Color.PINK);
        g.fillRoundRect(370, 100, 40, 40, 10, 10);

        // Задание 3: Текст (цвет и положение) [cite: 108]
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.drawString("Hello Java (Swing)", 250, 200);

        // Задание 4 & 6: Вывод сообщений [cite: 110, 114]
        g.setColor(Color.DARK_GRAY);
        g.drawString(message, 50, 220);
        if (!displayName.isEmpty()) {
            g.drawString("Привет, " + displayName, 50, 240);
        }

        // Задание 8: Анимация [cite: 118]
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(animX, 260, 30, 30);

        // Задание 9: Клик мыши [cite: 120]
        if (mouseX > 0) {
            g.setColor(Color.RED);
            g.fillOval(mouseX - 5, mouseY - 5, 10, 10);
        }

        // Задание 10: Элемент, меняющий цвет [cite: 125, 128]
        g.setColor(currentColor);
        g.fillRect(450, 220, 80, 50);
    }

    // Методы MouseListener
    public void mouseClicked(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        repaint();
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // Точка входа для запуска программы
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 10 - Swing Version");
        Lab10Swing panel = new Lab10Swing();
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}