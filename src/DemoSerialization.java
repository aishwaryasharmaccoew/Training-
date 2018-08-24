import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.String.Student;
public class DemoSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student su=new Student(12,300,"ABCD");
		Scanner sc =new Scanner(System.in);
		
		Student su1=new Student();
		System.out.println("Enter rollNo :");
		su1.setRollNo(sc.nextInt());
		System.out.println("Enter total :");
		su1.setTotal(sc.nextInt());
		System.out.println("Enter name :");
		su1.setName(sc.next());
		
		
		try {
			
			//Serialization
			FileOutputStream fo=new FileOutputStream("first.txt");
			
			ObjectOutputStream os=new ObjectOutputStream(fo);
			
			os.writeObject(su);
			os.writeObject(su1);
			os.close();
			fo.close();
			//Deserialization
			FileInputStream fs=new FileInputStream("first.txt");
			ObjectInputStream oi=new ObjectInputStream(fs);
			Object obj=oi.readObject();
			Student stu=(Student)obj;
			System.out.println(stu);
			obj=oi.readObject();
			stu=(Student)obj;
			System.out.println(stu);
			
	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		String str="i"+"u";
		System.out.println(str);
	}

}
