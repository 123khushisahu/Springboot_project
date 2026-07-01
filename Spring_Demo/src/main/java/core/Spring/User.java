package core.Spring;
/*Class → Class = extends
Class → Interface = implements
Interface → Interface = extends*/
import java.util.Scanner;

import ch.qos.logback.core.pattern.Converter;




class PDFMessageConverter{
	public String convertTo(String fileName) {//concrete
		return "<PDF>"+fileName+"</PDF>";
		
	}
}
class ModifyLogic{
	PDFMessageConverter converter=new PDFMessageConverter();//composition
	public String modify(String fileName) {//tightly bound bcz obj
		return converter.convertTo(fileName);
		
	}
	
//	Logic converter;
//	public String modify(String fileName,String type) {
//		converter=MessageFactory.factoryMethod(type);
//		String data=converter.convertTo(fileName);
//		return data;
		
	}

class WORDMessageConverter implements Logic{

	@Override
	public String convertTo(String fileName) {
		return "<html>"+fileName+"</html>";
	}
	
}
//Factory Design Pattern
class MessageFactory{
	@SuppressWarnings("deprecation")
	public static Logic factoryMethod(String type) {
		Logic data=null;
		if(type.equalsIgnoreCase("pdf")) {
			//data=new PDFMessageConverter();
			try {
				Class<?> forName=Class.forName("core.Spring..PDFMessageConverter");
				data=(Logic) forName.newInstance();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch (InstantiationException e) {
				e.printStackTrace();
			}catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return data;
		
	}
}
public class User {
public static void main(String[] args) throws InterruptedException {
	Scanner sc=new Scanner(System.in);
	System.out.println("Entera text message.");
	System.out.println("Select the desired conversion format (WORD or PDF).");
	System.out.println("The application should dynamically create the appropriate converter object");
	System.out.println(" Convert the message and display the converted output.");
	 Thread.sleep(3000);
	 
}
}



