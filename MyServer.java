import java.io.*;  
import java.net.*;  
public class MyServer {  
public static void main(String[] args){  
	try{  
		ServerSocket ss=new ServerSocket(8080);  
		Socket s=ss.accept();//establishes connection   
		DataInputStream dis=new DataInputStream(s.getInputStream());  
		System.out.println("Hello");  
		ss.close();  
	}catch(Exception e){System.out.println(e);}  
}  
}