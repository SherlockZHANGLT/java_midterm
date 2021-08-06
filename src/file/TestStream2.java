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
        /*// 准备文件lol.txt其中的内容是
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
        File f = new File("d:/java_project/lol.txt");
        // 创建文件字符流
        // 缓存流必须建立在一个存在的流的基础上
        try (
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
            )
        {
            while (true) {
                // 一次读一行
                String line = br.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		// 向文件lol2.txt中写入三行语句
        /*File f = new File("d:/lol2.txt");
        try (
                // 创建文件字符流
                FileWriter fw = new FileWriter(f);
                // 缓存流必须建立在一个存在的流的基础上              
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
	                // 一次读一行
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
	            // TODO 自动生成的 catch 块
	            e.printStackTrace();
	        } 
	        try(  
	                FileWriter fw = new FileWriter(javaFile);
	                PrintWriter pw = new PrintWriter(fw);
	                ){          
	            pw.println(s);  
	            pw.flush();
	        } catch (IOException e) {
	            // TODO 自动生成的 catch 块
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
             
            System.out.println("读取到布尔值:"+b);
            System.out.println("读取到整数:"+i);
            System.out.println("读取到字符串:"+str);
 
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
                System.out.println("输入的两个数字分别是:");
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
             
            System.out.println("读取到第一个数:"+i1);
            System.out.println("读取到第二个数:"+i2);
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
