import java.util.Scanner;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MainEmp {

    private static final String filepath="E:/worldpay training/JAVA/File4.txt";
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
			 
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(emp);
            objectOut.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}

}
