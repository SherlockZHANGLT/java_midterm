package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.Scanner;

public class TestHero {
	/*public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
        Hero h = new Hero();
        h.name = "garen";
        h.hp = 616;
        //准备一个文件用于保存该对象
        File f =new File("d:/java_project/garen.lol");
        try(
            //创建对象输出流
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            //创建对象输入流              
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois =new ObjectInputStream(fis);
        ) {
            oos.writeObject(h);
            Hero h2 = (Hero) ois.readObject();
            System.out.println(h2.name);
            System.out.println(h2.hp);   
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }     */
		/*Hero[] h=new Hero[10];
		for(int i=0;i<10;i++) {
			h[i]=new Hero();
			h[i].name="hahahahaha"+i;
		}
		File f=new File("d:/java_project/heros.lol");
		try(FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos =new ObjectOutputStream(fos);            
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois =new ObjectInputStream(fis);){
			oos.writeObject(h);
            Hero[] h2 = (Hero[]) ois.readObject();
            for(Hero he:h2) {
            	System.out.println(he.name);
            }
		}catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*try (InputStream is = System.in;) {
            while (true) {
                // 敲入a,然后敲回车可以看到
                // 97 13 10
                // 97是a的ASCII码
                // 13 10分别对应回车换行
                int i = is.read();
                if(i==13)
                	break;
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
		/*Scanner s = new Scanner(System.in);
        while(true){
            String line = s.nextLine();
            if(line=="q\r")
            	break;
            System.out.println(line);
        }*/
		
		/*Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("第一个整数："+a);
        int b = s.nextInt();
        System.out.println("第二个整数："+b);
    }*/
        public static void main(String[] args) throws IOException {
            /*copyFile("C:\\Users\\91930\\Desktop\\test\\LOL.txt","C:\\Users\\91930\\Desktop\\test\\LOL-Copy.txt");*/
            /*copyFolder("C:\\Users\\91930\\Desktop\\test","C:\\Users\\91930\\Desktop\\test01");*/
            search(new File("C:\\Users\\91930\\Desktop\\test"),"Magic");
        }
     
        public static void copyFile(String srcFile, String destFile) throws IOException {
            File srcF = new File(srcFile);
            File destF = new File(destFile);
            if(!destF.exists()){
                destF.getParentFile().mkdirs();
                destF.createNewFile();
            }
            try(
                    // 创建读取缓存流
                    FileReader fr = new FileReader(srcF);
                    BufferedReader br = new BufferedReader(fr);
                    //创建写入缓存流
                    FileWriter fw = new FileWriter(destF.getAbsoluteFile());
                    PrintWriter pw = new PrintWriter(fw);
                    ){
                while (true){
                    String line = br.readLine();
                    if(null == line){
                        break;
                    }
                    //将src文件的数据写入dest文件
                    pw.println(line);
                    //立即写入
                    pw.flush();
                    //关闭缓存流
                    pw.close();
                }
                System.out.println("复制完毕");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
     
        public static void copyFolder(String srcFolder, String destFolder) throws IOException {
            File srcF = new File(srcFolder);
            File destF = new File(destFolder);
            if (!destF.exists()){
                destF.getParentFile().mkdirs();
     
            }
            //目录下的所有文件和文件夹放入数组
            File[] srcList = srcF.listFiles();
            assert srcList != null;
            for (File file : srcList) {
                //如果当前是文件夹
                if (file.isDirectory()) {
                    //递归调用复制文件夹  函数，并加上当前的文件夹名
                    copyFolder(file.getAbsolutePath(), destFolder + "\\" + file.getName());
                }
                //如果当前是文件
                if (file.isFile()) {
                    //调用复制文件  函数，并加上当前的文件夹名
                    copyFile(file.getAbsolutePath(), destFolder + "\\" + file.getName());
                }
            }
        }
     
        public static void search(File folder, String search) throws IOException {
            //创建文件数组并遍历
            File[] folderList = folder.listFiles();
            for (File file : folderList) {
                //如果当前遍历对象为文件夹,递归search当前遍历对象
                if (file.isDirectory()) {
                    search(file, search);
                }
                //如果当前遍历对象为文件
                if (file.isFile()) {
                    //创建缓存流
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    while (true) {
                        String line = br.readLine();
                        if (null == line) {
                            break;
                        }
                        //如果包含查找的Magic字符串
                        if (line.indexOf("Magic") > 0) {
                            //输出文件绝对路径
                            System.out.println(file.getAbsoluteFile());
                        }
                    }
                }
            }
        }
}
