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
        //����һ��Hero garen
        //Ҫ��Hero����ֱ�ӱ������ļ��ϣ������Hero��ʵ��Serializable�ӿ�
        Hero h = new Hero();
        h.name = "garen";
        h.hp = 616;
        //׼��һ���ļ����ڱ���ö���
        File f =new File("d:/java_project/garen.lol");
        try(
            //�������������
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            //��������������              
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
                // ����a,Ȼ���ûس����Կ���
                // 97 13 10
                // 97��a��ASCII��
                // 13 10�ֱ��Ӧ�س�����
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
        System.out.println("��һ��������"+a);
        int b = s.nextInt();
        System.out.println("�ڶ���������"+b);
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
                    // ������ȡ������
                    FileReader fr = new FileReader(srcF);
                    BufferedReader br = new BufferedReader(fr);
                    //����д�뻺����
                    FileWriter fw = new FileWriter(destF.getAbsoluteFile());
                    PrintWriter pw = new PrintWriter(fw);
                    ){
                while (true){
                    String line = br.readLine();
                    if(null == line){
                        break;
                    }
                    //��src�ļ�������д��dest�ļ�
                    pw.println(line);
                    //����д��
                    pw.flush();
                    //�رջ�����
                    pw.close();
                }
                System.out.println("�������");
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
            //Ŀ¼�µ������ļ����ļ��з�������
            File[] srcList = srcF.listFiles();
            assert srcList != null;
            for (File file : srcList) {
                //�����ǰ���ļ���
                if (file.isDirectory()) {
                    //�ݹ���ø����ļ���  �����������ϵ�ǰ���ļ�����
                    copyFolder(file.getAbsolutePath(), destFolder + "\\" + file.getName());
                }
                //�����ǰ���ļ�
                if (file.isFile()) {
                    //���ø����ļ�  �����������ϵ�ǰ���ļ�����
                    copyFile(file.getAbsolutePath(), destFolder + "\\" + file.getName());
                }
            }
        }
     
        public static void search(File folder, String search) throws IOException {
            //�����ļ����鲢����
            File[] folderList = folder.listFiles();
            for (File file : folderList) {
                //�����ǰ��������Ϊ�ļ���,�ݹ�search��ǰ��������
                if (file.isDirectory()) {
                    search(file, search);
                }
                //�����ǰ��������Ϊ�ļ�
                if (file.isFile()) {
                    //����������
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    while (true) {
                        String line = br.readLine();
                        if (null == line) {
                            break;
                        }
                        //����������ҵ�Magic�ַ���
                        if (line.indexOf("Magic") > 0) {
                            //����ļ�����·��
                            System.out.println(file.getAbsoluteFile());
                        }
                    }
                }
            }
        }
}
