import javax.swing.*;
class GUIs.Window_Ch_12{
    public static void main(String[] args) {
            final int WINDOW_WIDTH = 400;
            final int WINDOW_HEIGHT = 300;

            //Creat a window
        JFrame window = new JFrame();

        // set the title
        window.setTitle("This is just practice");

        //set the size of window
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        //Specify the happens when the button "close"
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Display the window
        window.setVisible(true);
    }
}