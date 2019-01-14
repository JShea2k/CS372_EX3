import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.ArrayList;
import java.util.Random;

public class TeacherCharacter extends JPanel {
    Random rand = new Random();
    private volatile int screenX = 0;
    private volatile int screenY = 0;
    private volatile int myX = 0;
    private volatile int myY = 0;
    private volatile int startX = 500;
    private volatile int startY = 500;
    private int gradeLevel;
    protected Teacher t1 = new Teacher();

    // Returns the  grade level the teacher teaches
    public int getGradeLevel() {
        return gradeLevel;
    }

    // Loaded Teacher Character Constructor
    public TeacherCharacter(String _name, int _age, long _phoneNumber, int _gradeLevel, String _certification) {

        gradeLevel = _gradeLevel;

        // Creates teacher object for the character
        Teacher t1 = new Teacher(_name, _age, _phoneNumber);
        t1.setGradeLevel(_gradeLevel);
        t1.setCertification(_certification);

        // Creates the character
        setBorder(new LineBorder(Color.BLUE, 3));
        setBackground(Color.WHITE);
        setBounds(startX, startY, 100, 100);
        setOpaque(false);

        addMouseListener(new MouseListener() {

            // Defines the instance if a mouse is clicked
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame tFrame = new JFrame("Teacher Description");
                tFrame.setBounds(750, 350, 500, 200);
                tFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                tFrame.getContentPane().add(new JLabel(t1.getName() + " teaches grade " + t1.getGradeLevel() + " and has a certification in " + t1.getCertification() + "."));
                tFrame.setVisible(true);
            }

            // Saves the coordinates of the character in case it gets dragged
            @Override
            public void mousePressed(MouseEvent e) {
                screenX = e.getXOnScreen();
                screenY = e.getYOnScreen();

                myX = getX();
                myY = getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }

        });
        addMouseMotionListener(new MouseMotionListener() {

            // Moves the character to where the mouse was dragged
            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getXOnScreen() - screenX;
                int deltaY = e.getYOnScreen() - screenY;
                setLocation(myX + deltaX, myY + deltaY);
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) { }

        });
    }

}
