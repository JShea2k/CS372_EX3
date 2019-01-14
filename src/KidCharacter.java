import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

public class KidCharacter extends JComponent {
    private volatile int screenX = 0;
    private volatile int screenY = 0;
    private volatile int myX = 0;
    private volatile int myY = 0;
    private volatile int startX = 500;
    private volatile int startY = 500;
    private int gradeLevel;
    protected Kid k1 = new Kid();

    public int getGradeLevel() {
        return gradeLevel;
    }

    public KidCharacter(String _name, int _age, long _phoneNumber, String _favCandy, int _gradeLevel) {

        gradeLevel = _gradeLevel;
        // Creates a kid object
        Kid k1 = new Kid(_name, _age, _phoneNumber);
        k1.setFavCandy(_favCandy);
        k1.setGradeLevel(_gradeLevel);

        // Creates the character
        setBorder(new LineBorder(Color.RED, 3));
        setBackground(Color.WHITE);
        setBounds(startX, startY, 100, 100);
        setOpaque(false);

        addMouseListener(new MouseListener() {

            // Defines the instance if the character is clicked on
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame kFrame = new JFrame("Kid Description");
                kFrame.setBounds(750, 350, 500, 200);
                kFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                kFrame.getContentPane().add(new JLabel(k1.getName() + " is in grade " + k1.getGradeLevel() + ". Their favorite candy is " + k1.getFavCandy() + "."));
                kFrame.setVisible(true);
            }

            // Saves the characters coordinates if it gets dragged
            @Override
            public void mousePressed(MouseEvent e) {
                screenX = e.getXOnScreen();
                screenY = e.getYOnScreen();

                myX = getX();
                myY = getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                JComponent comp = (JComponent) e.getSource();
                comp.getComponentAt(e.getPoint());
            }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }

        });
        addMouseMotionListener(new MouseMotionListener() {

            // Moves the character if it is dragged and released
            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getXOnScreen() - screenX;
                int deltaY = e.getYOnScreen() - screenY;

                setLocation(myX + deltaX, myY + deltaY);
            }
            @Override
            public void mouseMoved(MouseEvent e) { }

        });
    }

}
