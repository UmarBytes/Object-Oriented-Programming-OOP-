import javax.swing.*;
  import javax.swing.event.*;
  import java.awt.*;
  class GUIs{
      public static void main(String[] args) {
          JFrame frame = new JFrame("Chat Frame");

	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	          frame.setSize(400, 400);

	          JMenuBar mb = new JMenuBar();

	          JMenu m1 = new JMenu("FILE");

	          JMenu m2 = new JMenu("HELP");

	          mb.add(m1);
	          mb.add(m2);

	          JMenuItem n11 = new JMenuItem("Open");

	          JMenuItem n22 = new JMenuItem("Save as");

	          m1.add(n11);
	          m1.add(n22);

	          JPanel panel = new JPanel();

	          JLabel label = new JLabel("Enter Text");

	          JTextField tf = new JTextField(10);

	          JButton send = new JButton("Send");

	          JButton reset = new JButton("Reset");

	          panel.add(label);

	          panel.add(tf);
	          panel.add(send);
	          panel.add(reset);

	          JTextArea ta = new JTextArea();

	          frame.getContentPane().add(BorderLayout.SOUTH, panel);

	          frame.getContentPane().add(BorderLayout.NORTH, mb);

	          frame.getContentPane().add(BorderLayout.CENTER, ta);

	          frame.setVisible(true);
      }
  }