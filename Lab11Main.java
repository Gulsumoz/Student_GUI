import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab11Main extends JFrame {

    ArrayList<Student> studentlog = new ArrayList<Student>(10);
    //javax.swing.DefaultListModel model=new javax.swing.DefaultListModel();

    private JMenuItem addst=new JMenuItem("Add Students");
    private JMenuItem rmst=new JMenuItem("Remove Students");
    private JMenuItem srtst=new JMenuItem("Sort Students");
    private JMenuItem dspst=new JMenuItem("Display Students");
    private JMenuItem exit=new JMenuItem("Exit");

    public Lab11Main(){
        JFrame f=new JFrame("Student Info Log Program");
        JMenuBar menuBar=new JMenuBar();
        JMenu student=new JMenu("Click to Choose a Menu Option");


        // adding action listener to each item menu
        addst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==addst){
                    addStudents(studentlog);
                }

            }
        });
        rmst.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==rmst) {

            removeStudent(studentlog);
        }
    }
});
        srtst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==srtst) {

                    sortStudent(studentlog);
                }
            }
        });
        dspst.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==dspst) {

                    displayStudent(studentlog);
                }
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        student.add(addst);
        student.add(rmst);
        student.add(srtst);
        student.add(dspst);
        student.add(exit);
        menuBar.add(student);
        f.setJMenuBar(menuBar);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }




    public static void main (String[]args){
        new Lab11Main();

    }

    public static void addStudents(ArrayList<Student> studentlog) {
        boolean student_added = false;
        Student s = new Student();
        ArrayList<Student> temp=new ArrayList<Student>();
        s.setFirstName(JOptionPane.showInputDialog("Please enter student first name:"));
        s.setLastName (JOptionPane.showInputDialog("Please enter student last name:"));
        s.setMajor(JOptionPane.showInputDialog("Please enter student  major:"));
        s.setGPA(JOptionPane.showInputDialog("Please enter student GPA:"));;
        s.setUIN(JOptionPane.showInputDialog("Please enter student UIN:"));;
        s.setNetID(JOptionPane.showInputDialog("Please enter student netID:"));;
        s.setAge(JOptionPane.showInputDialog("Please enter student age:"));;
        s.setGender(JOptionPane.showInputDialog("Please enter student Gender:"));;

       Student[] array =new Student[1];

       array[0]=s;


        Student a= new Student(s.getFirstName(), s.getLastName(), s.getMajor(),s.getGPA(),
                s.getUIN(), s.getNetID(), s.getAge(), s.getGender());
        studentlog.add(a);

        JOptionPane.showMessageDialog(null, "Student added successfully:");
    }

    private static void displayStudent(ArrayList<Student> studentlog) {
        StringBuilder builder = new StringBuilder();
        for (Student e : studentlog) {
            builder.append(e.getFirstName()+" "+ e.getLastName()).append("\n");

        }
        JOptionPane.showMessageDialog( null, builder.toString(),"Student list", JOptionPane.INFORMATION_MESSAGE );

    }
    private static void sortStudent(ArrayList<Student> studentlog) {
        class SampleComparator implements Comparator<Student> {
            @Override
            public int compare(Student o1, Student o2) {

                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        }
        Collections.sort(studentlog, new SampleComparator());

        StringBuilder sortbuilder = new StringBuilder();
        for (Student e : studentlog) {
            sortbuilder.append( e.getFirstName()+ " " +e.getLastName()).append("\n");

        }
        JOptionPane.showMessageDialog( null, sortbuilder.toString(), "sorted student list by name", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void removeStudent(ArrayList<Student> studentlog) {
        String input= JOptionPane.showInputDialog("Please enter student name to remove :");
        boolean removed=false;
        for (Student e : studentlog) {
            if (e.getFirstName().compareToIgnoreCase(input) == 0) {
                studentlog.remove(e);
                removed = true;
                JOptionPane.showMessageDialog(null, "Student Removed:");
                break;
            }

        }
if (!removed){
    JOptionPane.showMessageDialog(null, "No susch student in the list:");
        }

    }


}
