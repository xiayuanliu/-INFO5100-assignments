import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StudentsApplication extends JFrame {
	private JTable studentsTable;
	

	public StudentsApplication(Students students) {
		
		
		JFrame jf = new JFrame();
		jf.setSize(500, 500);
		JPanel p = new JPanel();
		JButton b = new JButton("Add");
		p.add(b);
		JTextField text1 = new JTextField("Roll");
		p.add(text1);
		JTextField text2 = new JTextField("First");
		p.add(text2);
		JTextField text3 = new JTextField("Last");
		p.add(text3);
		JRadioButton rb = new JRadioButton("Gender");
		p.add(rb);
		
		StudentsTableModel model = new StudentsTableModel(students);
		studentsTable = new JTable(model);
		JScrollPane jsp = new JScrollPane(studentsTable);
		class AddListener implements ActionListener {
	        
	        public void actionPerformed(ActionEvent e) {
	        	students.addStudent(new Student(Integer.parseInt(text1.getText()),text2.getText(),text3.getText(),rb.isSelected()));
	        	studentsTable.updateUI();
	        }
	    }
		AddListener al = new AddListener();
		b.addActionListener(al);
        
		
		p.add(jsp);
		
		jf.add(p);

		
		jf.setVisible(true);
	}
   
	public static void main(String[] args) {
		Students s = new Students();
		s.addStudent(new Student(100, "Divya", "Sharma", true));
		s.addStudent(new Student(101, "Mihir", "Salunke", false));
		StudentsApplication sa = new StudentsApplication(s);

	}

}

class Students {
	private Collection<Student> students = new ArrayList<Student>();

	public Collection<Student> getStudents() {
		return students;

	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public int getNumberOfStudents() {
		return getStudents().size();
	}

}

class Student {
	int roll;
	String first;
	String last;
	boolean gender = false;

	public Student(int roll, String first, String last, boolean gender) {
		this.roll = roll;
		this.first = first;
		this.last = last;
		this.gender = gender;
	}
}

class StudentsTableModel implements TableModel {

	private Students students;

	public StudentsTableModel(Students students) {
		this.students = students;
	}

	@Override
	public int getRowCount() {
		return students.getNumberOfStudents();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "ROLL";
		}
		if (columnIndex == 1) {
			return "First";
		}
		if (columnIndex == 2)
			return "Last";
		if (columnIndex == 3)
			return "Gender";
		return null;
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		if (columnIndex == 3) {
			return Boolean.class;
		}
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {

		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Collection<Student> s = students.getStudents();
		int row = -1;
		for (Student student : s) {
			row++;
			if (row == rowIndex) {
				if (columnIndex == 0) {
					return student.roll + "";
				}
				if (columnIndex == 1) {
					return student.first;
				}
				if (columnIndex == 2) {
					return student.last;
				}
				if (columnIndex == 3) {
					return student.gender;
				}
			}
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}