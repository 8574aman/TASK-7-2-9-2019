import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class DisplayInfo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("emp_data.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp = (Employee)ois.readObject();
		System.out.println("Employee [eno=" + emp.getEno() + ", ename=" + emp.getEname() + ", salary="
				+ emp.getSalary() + ", designation=" + emp.getDesignation() + ", department="
				+ emp.getDepartment());
	}

}