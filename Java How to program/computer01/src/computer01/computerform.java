/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer01;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
/**
 *
 * @author DELL
 */
public class computerform extends JFrame{
    private final JButton StudentButton = new JButton("1 Student");
    private final JButton CourseButton = new JButton("2 Course");
    private final JButton UVButton = new JButton("3 UV");
    private final JButton InstructorButton = new JButton("4 Instructor");
    private final JButton ClassroomButton = new JButton("5 Classroom");
    
    public computerform(){
        super("Testing Buttons");
        
        Box verticalmainmenu = Box.createVerticalBox();
        Box horizontalmainmenu = Box.createHorizontalBox();
        
        
        verticalmainmenu.add(Box.createGlue());
        verticalmainmenu.add(StudentButton);//add student to JFrame
        verticalmainmenu.add(Box.createGlue());
        verticalmainmenu.add(CourseButton);//add course to JFrame
        verticalmainmenu.add(Box.createRigidArea(new Dimension(4,12)));
        verticalmainmenu.add(Box.createGlue());        
        verticalmainmenu.add(UVButton);
        verticalmainmenu.add(Box.createGlue());
        verticalmainmenu.add(InstructorButton);
        verticalmainmenu.add(Box.createGlue());
        verticalmainmenu.add(ClassroomButton);
        verticalmainmenu.add(Box.createGlue());
        /*
        horizontalmainmenu.add(StudentButton);//add student to JFrame
        horizontalmainmenu.add(CourseButton);//add course to JFrame
        horizontalmainmenu.add(UVButton);
        horizontalmainmenu.add(InstructorButton);
        horizontalmainmenu.add(ClassroomButton);
        */
        //creat a vertical glue and add buttons to panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        String str1 = "idiotic kalkazor";
        panel.add(new JButton(str1));
        panel.add(Box.createGlue());
        panel.add(new JButton("allen"));  
        panel.add(Box.createGlue());
        panel.add(new JButton("allen bangai"));
        panel.add(Box.createGlue());
                
        //create a JTabbedPane
        JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        
        //place each container on a tab
        tab.addTab("vertical main menu", verticalmainmenu);
        tab.addTab("horizontal main menu", horizontalmainmenu);
        tab.addTab("vertical glue", panel);
        
        //add tabs to JFrame
        add(tab);
        
        //creat new ButtonHandler for event finding
        ButtonHandler handler = new ButtonHandler();       
        StudentButton.addActionListener(handler);
        CourseButton.addActionListener(handler);
        UVButton.addActionListener(handler);
        InstructorButton.addActionListener(handler);
        ClassroomButton.addActionListener(handler);
    }    
    
    //inner class for button event handling
    private class ButtonHandler implements ActionListener{
        //handle button event
        @Override
        public void actionPerformed(ActionEvent event){
            
            JOptionPane.showMessageDialog(computerform.this, String.format("you pressed : %s",event.getActionCommand()));
        }
        
    }
    
}
