import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

public class PoliceCharacter extends JPanel implements MouseInputListener{
    Random rand = new Random();
    private volatile int screenX = 0;
    private volatile int screenY = 0;
    private volatile int myX = 0;
    private volatile int myY = 0;
    private volatile int startX = 100;
    private volatile int startY = 100;
    protected Police p1 = new Police();

    public PoliceCharacter(String _name, int _age, long _phoneNumber, Police.Role _role) {

        // Creates a police object for the character object
        p1.setName(_name);
        p1.setAge(_age);
        p1.setPhoneNumber(_phoneNumber);
        p1.setRole(_role);

        // Creates the character object
        setBorder(new LineBorder(Color.BLACK, 3));
        setBackground(Color.WHITE);
        setBounds(startX, startY, 50, 50);
        setOpaque(false);

        addMouseListener(new MouseListener() {

            // Defines the instance if the mouse is clicked on it
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame kFrame = new JFrame("Police Description");
                kFrame.setBounds(750, 350, 500, 200);
                kFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                kFrame.getContentPane().add(new JLabel("The role of " + p1.getName() + " is " + p1.getRole() + "."));
                kFrame.setVisible(true);
            }

            // Holds coordinates of the character in case it gets dragged
            @Override
            public void mousePressed(MouseEvent e) {
                screenX = e.getXOnScreen();
                screenY = e.getYOnScreen();

                myX = getX();
                myY = getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

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

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

