package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestException {
	/*public static void main(String[] args) {
        /*File f= new File("d:/LOL.exe");
        try{
            System.out.println("��ͼ�� d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("�ɹ���");
        }
        catch(FileNotFoundException e){
            System.out.println("d:/LOL.exe������");
            e.printStackTrace();
        } */
		
		/*File f = new File("d:/LOL.exe");
        try {
            System.out.println("��ͼ�� d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("�ɹ���");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (FileNotFoundException e) {
            System.out.println("d:/LOL.exe������");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("���ڸ�ʽ��������");
            e.printStackTrace();
        }
		File f = new File("d:/LOL.exe");
		try {
            System.out.println("��ͼ�� d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("�ɹ���");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (ParseException |FileNotFoundException  e) {
            if (e instanceof FileNotFoundException)
                System.out.println("d:/LOL.exe������");
            if (e instanceof ParseException)
                System.out.println("���ڸ�ʽ��������");
 
            e.printStackTrace();
        }finally{
            System.out.println("�����ļ��Ƿ���ڣ� ����ִ�еĴ���");
        }
    }*/
	
	/*public static void main(String[] args) {
        method1();
    }
 
    private static void method1() {
        try {
            method2();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
    private static void method2() throws FileNotFoundException {
        File f = new File("d:/LOL.exe");
        System.out.println("��ͼ�� d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("�ɹ���");
    }*/
	
	/*public static void main(String[] args){
		  System.out.print(methon());
		}
	public static int  methon(){
		try{
		return 1;}
		catch(Exception e){
		return 2;}
		finally{
		return 3;}
	}*/
	
	/*public static void main(String[] args) {
        //�κγ�������Ϊ0:ArithmeticException
        int k = 5/0; 
        //�±�Խ���쳣��ArrayIndexOutOfBoundsException
        int j[] = new int[5];
        j[10] = 10;
        //��ָ���쳣��NullPointerException
        String str = null;
        str.length();
   }*/
	
	/*public static void main(String[] args) {
        File f = new File("d:/LOL.exe");
        try {
            new FileInputStream(f);
            //ʹ��Throwable�����쳣��׽
        } catch (Throwable t) {
            // TODO Auto-generated catch block
            t.printStackTrace();
        }
 
    }*/
	
	public static void main(String[] args) throws Throwable {
		try {
            method();
        } catch (Throwable t) {
            // TODO Auto-generated catch block
            t.printStackTrace();
        }
    }
     
    private static void method() throws Throwable {
        File f = new File("d:/LOL.exe");
        new FileInputStream(f);
        //ʹ��Throwable�����쳣��׽
    }
}


