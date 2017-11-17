package javabasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("abc.txt");
        File outfile =new File("def.txt");
		
		try {
	         String content = "India is my country and I love my India";
//	         File file = new File("C:\\Users\\TutorialsPoint7\\Desktop\\abc.txt");
	         if (!file.exists()) {
	            file.createNewFile();
	         } 
	         FileWriter fw = new FileWriter(file.getAbsoluteFile());
	         BufferedWriter bw = new BufferedWriter(fw);
	         bw.write(content);
	         bw.close();
	         
	         System.out.println("Done");
	      } catch (IOException e) {
	         e.printStackTrace();
	      } 	
		
		try (BufferedReader br = new BufferedReader(
	         new FileReader(file))) { 
	         
	         String sCurrentLine;
	         while ((sCurrentLine = br.readLine()) != null) {
					System.out.println(sCurrentLine);
				} 
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
		
		  FileInputStream ins = null;
		  FileOutputStream outs = null;
	      try {
	         ins = new FileInputStream(file);
	         outs = new FileOutputStream(outfile);
	         byte[] buffer = new byte[1024];
	         int length;
	         
	         while ((length = ins.read(buffer)) > 0) {
	            outs.write(buffer, 0, length);
	         } 
	         ins.close();
	         outs.close();
	         System.out.println("File copied successfully!!");
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } 
	      
	      try (BufferedReader br = new BufferedReader(
 	         new FileReader(outfile))) { 
 	         
 	         String sCurrentLine;
 	         while ((sCurrentLine = br.readLine()) != null) {
 					System.out.println(sCurrentLine);
 				} 
 	      } catch (IOException e) {
 	         e.printStackTrace();
 	      }
		
	}

}
