import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainEmp {

   
	public static void main(String[] args) {
		
		  MainEmp objectIO = new MainEmp();
		System.out.println("enter size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Employee[] emp=new Employee[size]; // s is array
		
		for(int i=0;i<emp.length;i++)
		{	System.out.println("enter eno");
			int no=sc.nextInt();
				System.out.println("enter ename");
			String name=sc.next();	//sc.nextLine();
				System.out.println("enter salary");
			double sal=sc.nextDouble();
				System.out.println("enter designation");
			String designation=sc.nextLine();sc.nextLine();
				System.out.println("enter department");
			String dept=sc.nextLine();
			 sc.nextLine();
			emp[i]=new Employee(no,name,sal,designation,dept);
			
			
		}
		

        objectIO.WriteObjectToFile(emp);
		for(Employee st:emp)
		{
			System.out.println(st.getEno()+" "+st.getEname());
			
		}

	}

	private void WriteObjectToFile(Employee[] emp) {
		// TODO Auto-generated method stub
		try {
			 
			File f = new File("emp_data.txt");
            FileOutputStream fileOut = new FileOutputStream(f);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            for(Employee xx:emp)
            objectOut.writeObject(xx);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}

}
