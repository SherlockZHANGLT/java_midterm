package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class TestStream2 {
	//public static void main(String[] args) {
        /*// ׼���ļ�lol.txt���е�������
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("d:/java_project/lol.txt");
        // �����ļ��ַ���
        // ���������뽨����һ�����ڵ����Ļ�����
        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
            )
        {
            while (true) {
                // һ�ζ�һ��
                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		// ���ļ�lol2.txt��д���������
        /*File f = new File("d:/lol2.txt");
        try (
                // �����ļ��ַ���
                FileWriter fw = new FileWriter(f);
                // ���������뽨����һ�����ڵ����Ļ�����              
                PrintWriter pw = new PrintWriter(fw);              
        ) {
            pw.println("garen kill teemo");
            pw.println("teemo revive after 1 minutes");
            pw.flush();
            pw.println("teemo try to garen, but killed again");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*public static void main(String[] args) {
	        File f = new File("D:/lol2.txt");
	        String s = "";
	        removeComments(f,s);    
	    }
	    public static void removeComments(File javaFile,String s) {
	        try (FileReader fr = new FileReader(javaFile);
	                BufferedReader br =  new BufferedReader(fr);
	                ){
	            while (true) {
	                // һ�ζ�һ��
	                String line = br.readLine();
	                if(line == null)
	                    break;
	                if (line == "") {
	                    line += "\r\n";
	                }
	                System.out.println(line);
	                 
	                int i = 0;
	                for (char c : line.toCharArray()) { 
	                    if (c == '/') 
	                        i++;
	                    if (i == 1 && c!= '/')  
	                        break;
	                    if (i == 2) {
	                        line = "";
	                        break;
	                    }
	                }   
	                if (i != 2) {
	                    line += "\r\n";
	                }
	                s += line;      
	            }
	        } catch (IOException e) {
	            // TODO �Զ����ɵ� catch ��
	            e.printStackTrace();
	        } 
	        try(  
	                FileWriter fw = new FileWriter(javaFile);
	                PrintWriter pw = new PrintWriter(fw);
	                ){          
	            pw.println(s);  
	            pw.flush();
	        } catch (IOException e) {
	            // TODO �Զ����ɵ� catch ��
	            e.printStackTrace();
	        }*/
	/*public static void main(String[] args) {
        write();
        read();
    }
 
    private static void read() {
        File f =new File("d:/java_project/Lol.txt");
        try (
                FileInputStream fis  = new FileInputStream(f);
                DataInputStream dis =new DataInputStream(fis);
        ){
            boolean b= dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();
             
            System.out.println("��ȡ������ֵ:"+b);
            System.out.println("��ȡ������:"+i);
            System.out.println("��ȡ���ַ���:"+str);
 
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
 
    private static void write() {
        File f =new File("d:/java_project/Lol.txt");
        try (
                FileOutputStream fos  = new FileOutputStream(f);
                DataOutputStream dos =new DataOutputStream(fos);
        ){
            dos.writeBoolean(true);
            dos.writeInt(300);
            dos.writeUTF("123 this is gareen");
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }*/
	/*public static void main(String args[]) {
		File f=new File("d:/java_project/Lol_2.txt");
		try (FileWriter fw = new FileWriter(f);PrintWriter pw = new PrintWriter(fw);) {
            pw.print(11);
            pw.print('@');
            pw.print(12);
            pw.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		File f1=new File("d:/java_project/Lol_2.txt");
		try(FileReader fr=new FileReader(f1);BufferedReader br=new BufferedReader(fr);){
			/*char i1=(char) br.read();
			String i2=br.readLine();
			System.out.println(i1);
			System.out.println(i2);
			while (true) {
                String line = br.readLine();
                if (null == line)
                    break;
                String[] s = line.split("@");
                int c = Integer.valueOf(s[0]);
                int d = Integer.valueOf(s[1]);
                System.out.println("������������ֱַ���:");
                System.out.println(c);
                System.out.println(d);
            }
		}
	    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}*/
	public static void main(String[] args) {
        write();
        read();
    }
 
    private static void read() {
        File f =new File("d:/java_project/Lol_3.txt");
        try (
                FileInputStream fis  = new FileInputStream(f);
                DataInputStream dis =new DataInputStream(fis);
        ){
            int i1 = dis.readInt();
            char c=dis.readChar();
            int i2=dis.readInt();
             
            System.out.println("��ȡ����һ����:"+i1);
            System.out.println("��ȡ���ڶ�����:"+i2);
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
 
    private static void write() {
        File f =new File("d:/java_project/Lol_3.txt");
        try (
                FileOutputStream fos  = new FileOutputStream(f);
                DataOutputStream dos =new DataOutputStream(fos);
        ){
        	dos.writeInt(11);
            dos.writeChar('@');
            dos.writeInt(12);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
