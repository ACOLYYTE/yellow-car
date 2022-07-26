package swing;


import javax.swing.*;

public class Main{

    public static void main(String[] args) {
        JFrame frame = SwingTest.getJFrame();
        frame.add(new MyComponent());
    }

}
