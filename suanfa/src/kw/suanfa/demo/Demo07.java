package kw.suanfa.demo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;

public class Demo07 {
	public static void main(String[] args) throws Exception {
		//�����л�����
       /* ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\apache-maven-3.0.5\\LICENSE.txt"));
        System.out.println("obj1 " + (String) in.readObject());    //��ȡ����ֵ����
        System.out.println("obj2 " + (Date) in.readObject());    //��ȡ����Date����
        //Customer obj3 = (Customer) in.readObject();    //��ȡcustomer����
       
        in.close();*/
		
/*		 DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\apache-maven-3.0.5\\demo.txt"));
	      
	           //д��customer����
	        
		
		 try {
	            BufferedReader in = new BufferedReader(new FileReader("C:\\apache-maven-3.0.5\\LICENSE.txt"));
	            String str;
	            while ((str = in.readLine()) != null) {
	            	 out.writeBytes(str);
	            }
	          
	        } catch (IOException e) {
	        }
		 		out.close();
	}*/

	
	
			try {

			String url = "F:\\gsm\\";

			String FileName = "info.dat";

			File file = new File(url);

			file.mkdirs();//�����ļ���

			File fil = new File(url);

			fil.createNewFile();

			 

			 

			FileWriter fileWriter=new FileWriter(url+FileName);
			

			 try {
		            BufferedReader in = new BufferedReader(new FileReader("C:\\apache-maven-3.0.5\\LICENSE.txt"));
		            String str;
		            while ((str = in.readLine()) != null) {
		            	fileWriter.write(str);		            }
		          
		        } catch (IOException e) {
		        }


			fileWriter.close();

			} catch (IOException e) {

			e.printStackTrace();

			}

			}

		
}






