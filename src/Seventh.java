import java.io.SequenceInputStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Seventh {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name of the fIle you want to write data to :");
		String s1 = sc.next();
		s1 = s1+".txt";
		String F1 = "E:/worldpay training/JAVA"+s1;
		File file1 = new File(F1);
		FileOutputStream fis1 = new FileOutputStream(file1);
		
		
		System.out.print("Enter Name of First File :");
		String s2 = sc.next();
		s2 = s2+".txt";
		String F2 = "E:/worldpay training/JAVA"+s2;
		File file2 = new File(F2);
		FileInputStream fis2 = new FileInputStream(file2);



		System.out.print("Enter Name of the Second File :");
		String s3 = sc.next();
		s3 = s3+".txt";
		String F3 = "E:/worldpay training/JAVA"+s3;
		File file3 = new File(F3);
        FileInputStream fis3 = new FileInputStream(file3);
		
		SequenceInputStream inst=new SequenceInputStream(fis2,fis3);   
		
		 int j;    
		   while((j=inst.read())!=-1){    
		    //System.out.print((char)j);
			   fis1.write((char)j);
		   }

	}

}
