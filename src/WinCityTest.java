import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class WinCityTest {
    private  Random rand = new Random();
    private JPanel window1;
    private JPanel SpoElemSchoolPanel;
    private JButton SpoElemSchoolBtn;
    private JPanel SpoMidSchoolPanel;
    private JButton SpoMidSchoolBtn;
    private JPanel SpoHighSchoolPanel;
    private JButton SpoHighSchoolBtn;
    protected JPanel CityHallPanel;
    private JButton CityHallBtn;
    private JButton moveKidsToSchoolBtn;
    private JButton moveTeachToSchool;
    private JButton movePoliceToCityHallBtn;
    private JButton randomizeBtn;
    protected ArrayList<Police> numPolice = new ArrayList<>(0);
    protected ArrayList<Teacher> numTeachers = new ArrayList<>(0);
    protected ArrayList<Kid> numKids = new ArrayList<>(0);

    public WinCityTest(ArrayList<PoliceCharacter> police, ArrayList<KidCharacter> kids, ArrayList<TeacherCharacter> teachers) {

        // Randomizes the location of all of the characters on screen
        randomizeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < police.size(); i++) {
                    police.get(i).setLocation(rand.nextInt(1400) + 100 , rand.nextInt(750) + 100);
                    police.get(i).repaint();
                }
                for(int i = 0; i < kids.size(); i++) {
                    kids.get(i).setLocation(rand.nextInt(1400) + 100 , rand.nextInt(750) + 100);
                    kids.get(i).repaint();
                }
                for(int i = 0; i < teachers.size(); i++) {
                    teachers.get(i).setLocation(rand.nextInt(1400) + 100 , rand.nextInt(750) + 100);
                    teachers.get(i).repaint();
                }
            }
        });

        // Moves all of the police characters to City Hall
        movePoliceToCityHallBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < police.size(); i++) {
                    police.get(i).setLocation(CityHallPanel.getX() + 100, CityHallPanel.getY() + (100 + 100 * i));
                    police.get(i).repaint();
                }
            }
        });

        // Moves all of the kid characters to their respective school
        moveKidsToSchoolBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < kids.size(); i++) {
                    if((kids.get(i).getGradeLevel() >= 1) && (kids.get(i).getGradeLevel() <= 6) ) {
                        kids.get(i).setLocation(SpoElemSchoolPanel.getX() + 100, SpoElemSchoolPanel.getY() + 300);
                        kids.get(i).repaint();
                    }
                    else if((kids.get(i).getGradeLevel() >= 7) && (kids.get(i).getGradeLevel() <= 8) ) {
                        kids.get(i).setLocation(SpoMidSchoolPanel.getX() + 100, SpoMidSchoolPanel.getY() + 300);
                        kids.get(i).repaint();
                    }
                    else if((kids.get(i).getGradeLevel() >= 9) && (kids.get(i).getGradeLevel() <= 12) ) {
                        kids.get(i).setLocation(SpoHighSchoolPanel.getX() + 100, SpoHighSchoolPanel.getY() + 300);
                        kids.get(i).repaint();
                    }
                }
            }
        });

        // Moves all teacher characters to their respective schools
        moveTeachToSchool.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < teachers.size(); i++) {
                    if((teachers.get(i).getGradeLevel() >= 1) && (teachers.get(i).getGradeLevel() <= 6) ) {
                        teachers.get(i).setLocation(SpoElemSchoolPanel.getX() + 100, SpoElemSchoolPanel.getY() + 100);
                        teachers.get(i).repaint();
                    }
                    else if((teachers.get(i).getGradeLevel() >= 7) && (teachers.get(i).getGradeLevel() <= 8) ) {
                        teachers.get(i).setLocation(SpoMidSchoolPanel.getX() + 100, SpoMidSchoolPanel.getY() + 100);
                        teachers.get(i).repaint();
                    }
                    else if((teachers.get(i).getGradeLevel() >= 9) && (teachers.get(i).getGradeLevel() <= 12) ) {
                        teachers.get(i).setLocation(SpoHighSchoolPanel.getX() + 100, SpoHighSchoolPanel.getY() + 100);
                        teachers.get(i).repaint();
                    }
                }
            }
        });

        // Makes the panel for City Hall
        CityHallPanel.setPreferredSize(new Dimension(200, 300));
        CityHallPanel.setBorder(new LineBorder(Color.DARK_GRAY, 3));
        CityHallPanel.setVisible(true);
        CityHallPanel.setOpaque(false);

        // Makes the button for City Hall and its response
        CityHall spoCityHall = new CityHall("Spokane City Hall", "303 W Hawthorne Rd");
        CityHallBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "The Spokane City Hall is located at: \n" + spoCityHall.getAddress());
            }
        });

        //Makes the panel for Spokane Elementary School
        SpoElemSchoolPanel.setPreferredSize(new Dimension(200, 300));
        SpoElemSchoolPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
        SpoElemSchoolPanel.setVisible(true);
        SpoElemSchoolPanel.setOpaque(false);

        // Makes the button for Spokane Elementary School and its response
        School spoElemSchool = new School("Spokane Elementary School", "300 W Hawthorne Rd");
        SpoElemSchoolBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,  "The Spokane Elementary School is located at: \n" + spoElemSchool.getAddress());
            }
        });

        //Makes the panel for Spokane Middle School;
        SpoMidSchoolPanel.setPreferredSize(new Dimension(200, 300));
        SpoMidSchoolPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
        SpoMidSchoolPanel.setVisible(true);
        SpoMidSchoolPanel.setOpaque(false);

        // Makes the button for Spokane Middle School and its response
        School spoMidSchool = new School("Spokane Middle School", "301 W Hawthorne Rd");
        SpoMidSchoolBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "The Spokane Middle School is located at: \n" + spoMidSchool.getAddress());
            }
        });

        // Makes the panel for Spokane High School
        SpoHighSchoolPanel.setPreferredSize(new Dimension(200, 300));
        SpoHighSchoolPanel.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
        SpoHighSchoolPanel.setVisible(true);
        SpoHighSchoolPanel.setOpaque(false);

        // Makes the button for Spokane High School and its response
        School spoHighSchool = new School("Spokane High School", "302 W Hawthorne Rd");
        SpoHighSchoolBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "The Spokane High School is located at \n" + spoHighSchool.getAddress());
            }
        });
    }

    // Main
    public static void main(String[] args) {

        Random rand = new Random();

        // Creates the frame for the simulation
        JFrame frame = new JFrame("City Simulation");
        frame.setSize(3000, 1024);

        PoliceCharacter p1 = new PoliceCharacter("Jacob", 19, 4259749743L, Police.Role.Patrol);
        PoliceCharacter p2 = new PoliceCharacter("Travis", 20, 5093891301L, Police.Role.Chief);
        p1.setPreferredSize(new Dimension(50,50));
        p2.setPreferredSize(new Dimension(50,50));

        KidCharacter k1 = new KidCharacter("Johnny", 8, 8081111111L, "Twix", 3);
        KidCharacter k2 = new KidCharacter("Penelope", 13, 8881113333L, "Starbursts", 7);
        KidCharacter k3 = new KidCharacter("Derek", 18, 8881113333L, "Dark Chocolate", 12);
        k1.setPreferredSize(new Dimension(50,50));
        k2.setPreferredSize(new Dimension(50,50));
        k3.setPreferredSize(new Dimension(50,50));

        TeacherCharacter t1 = new TeacherCharacter("Mr. Bell", 40, 5099999999L, 8, "Algebra 2");
        TeacherCharacter t2 = new TeacherCharacter("Mr. Tucker", 21, 5093333333L, 12, "Computer Science");
        TeacherCharacter t3 = new TeacherCharacter("Mrs. Illac", 30, 4253886725L, 4, "Elementary Education");
        t1.setPreferredSize(new Dimension(50,50));
        t2.setPreferredSize(new Dimension(50,50));
        t3.setPreferredSize(new Dimension(50,50));

        try {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            URL imgUrl = new URL("https://www-tc.pbskids.org/apps/media/apps/caillou.png");
            Image img = toolkit.getImage(imgUrl);
            img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            JLabel kid = new JLabel(icon);
            k1.add(kid);
        }
        catch (Exception ex) {}

        //
        ArrayList<PoliceCharacter> police = new ArrayList<>(2);
        police.add(p1);
        police.add(p2);
        ArrayList<KidCharacter> kids = new ArrayList<>(2);
        kids.add(k1);
        kids.add(k2);
        kids.add(k3);
        ArrayList<TeacherCharacter> teachers = new ArrayList<>(3);
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);

        // Creates the frame
        WinCityTest winCityTest = new WinCityTest(police, kids, teachers);
        frame.setContentPane(winCityTest.window1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Adds the people to the frame
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(k1);
        frame.add(k2);
        frame.add(k3);
        frame.add(p1);
        frame.add(p2);
        frame.revalidate();
    }
}


