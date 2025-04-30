import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CampusPortalGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("University Portal");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel basePanel = new JPanel();
        basePanel.setLayout(new FlowLayout());

        JButton studBtn = new JButton("Students");
        JButton book = new JButton("Room Booking");
        JButton res = new JButton("Resrcs");
        

        basePanel.add(studBtn);
        basePanel.add(book);
        basePanel.add(res);


        

        frame.add(basePanel);
        frame.setVisible(true);

        // Student button
        studBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentStuff();
            }
        });

        // Booking
        book.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                roomBook(); // room name stuff
            }
        });

        // Resource
        res.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resMenu(); // might change later
            }
        });
    }



    public static void studentStuff() {
        String act = JOptionPane.showInputDialog("Do u want to Add / Edit / Find?");
        if(act == null || act.trim().isEmpty()) return;

        if (act.equalsIgnoreCase("add")) {
            JOptionPane.showMessageDialog(null, "Student has been added");
        } else if (act.equalsIgnoreCase("edit")) {
            JOptionPane.showMessageDialog(null, "Editing student...");
        } else if (act.equalsIgnoreCase("find")) {
            JOptionPane.showMessageDialog(null, "Feature not ready yet");
        } else {
            JOptionPane.showMessageDialog(null, " Not sure what that means");
        }
    }

    public static void roomBook() {
        String roomName = JOptionPane.showInputDialog("Room name?");
        if (roomName != null && roomName.length() > 0) {
            JOptionPane.showMessageDialog(null, "Room '" + roomName + "' booked!");
        } else {
            JOptionPane.showMessageDialog(null, "No input given");
        }
    }

    public static void resMenu() {
        String[] options = {"New Book", "Take Out", "Give Back", "Equipmt"};
        String what = (String) JOptionPane.showInputDialog(null, "Pick something",
                "Res Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (what != null) {
            JOptionPane.showMessageDialog(null, "You picked: " + what);
        } else {
            JOptionPane.showMessageDialog(null, "Nothing picked");
        }
    }
}
