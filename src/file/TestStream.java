package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class TestStream {
	/*public static void main(String[] args) {
        try {
            File f = new File("d:/lol.txt");
            // ���������ļ���������
            FileInputStream fis = new FileInputStream(f);
            // ͨ��������������Ϳ��԰����ݴ�Ӳ�̣���ȡ��Java�������������Ҳ���Ƕ�ȡ���ڴ���
            FileOutputStream fous=new FileOutputStream(f);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/
	
	public static void main(String[] args) {
        /*try {
            //׼���ļ�lol.txt���е�������AB����Ӧ��ASCII�ֱ���65 66
            File f =new File("d:/java_project/lol.txt");
            //���������ļ���������
            FileInputStream fis =new FileInputStream(f);
            //�����ֽ����飬�䳤�Ⱦ����ļ��ĳ���
            byte[] all =new byte[(int) f.length()];
            //���ֽ�������ʽ��ȡ�ļ���������
            fis.read(all);
            for (byte b : all) {
                //��ӡ������65 66
                System.out.println(b);
            }
            //ÿ��ʹ����������Ӧ�ý��йر�
            fis.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*try {
            // ׼���ļ�lol2.txt���е������ǿյ�
            File f = new File("d:/java_project/abc/def/ggg/lol2.txt");
            // ׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X,Y
            byte data[] = { 88, 89 };
            if(!f.getParentFile().exists()) {
                f.getParentFile().mkdirs();
            }
            // ���������ļ��������
            FileOutputStream fos = new FileOutputStream(f);
            // ������д�뵽�����
            fos.write(data);
            // �ر������
            fos.close(); 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*try {
            File f = new File("d:/java_project/lol.txt");
            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
            // ��try ��ر���
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
		
		/*File f = new File("d:/lol.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // ��finally ��ر���
            if (null != fis)
                try {
 
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }*/
		
		/*File f = new File("d:/lol.txt"); 
        //����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
        try (FileInputStream fis = new FileInputStream(f)) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
		
		/*// ׼���ļ�lol.txt���е�������AB
        File f = new File("d:/java_project/lol.txt");
        // ���������ļ���Reader
        try (FileReader fr = new FileReader(f)) {
            // �����ַ����飬�䳤�Ⱦ����ļ��ĳ���
            char[] all = new char[(int) f.length()];
            // ���ַ�������ʽ��ȡ�ļ���������
            fr.read(all);
            for (char b : all) {
                // ��ӡ������A B
                System.out.println(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*// ׼���ļ�lol2.txt
        File f = new File("d:/java_project/lol4.txt");
        // ���������ļ���Writer
        try (FileWriter fr = new FileWriter(f)) {
            // ���ַ�������ʽ������д�뵽�ļ���
            String data="abcdefg1234567890";
            char[] cs = data.toCharArray();
            for(int i=0;i<cs.length;i++) {
            	cs[i]=(char) (cs[i]+1);
            }
            fr.write(cs);
  
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*String str = "��";
		System.out.println(str);
		showCode(str);
    }
	
	private static void showCode(String str) {
        String[] encodes = { "BIG5", "GBK", "GB2312", "UTF-8", "UTF-16", "UTF-32" };
        for (String encode : encodes) {
            showCode(str, encode);
        }
    }
 
    private static void showCode(String str, String encode) {
        try {
            System.out.printf("�ַ�: \"%s\" ���ڱ��뷽ʽ%s�µ�ʮ������ֵ��%n", str, encode);
            byte[] bs = str.getBytes(encode);
 
            for (byte b : bs) {
                int i = b&0xff;
                System.out.print(Integer.toHexString(i) + "\t");
            }
            System.out.println();
            System.out.println();
        } catch (UnsupportedEncodingException e) {
            System.out.printf("UnsupportedEncodingException: %s���뷽ʽ�޷������ַ�%s\n", encode, str);
        }*/
		
		/*File f = new File("D:\\java_project\\test.txt");
        try (FileInputStream fis = new FileInputStream(f);) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
   
            //�ļ��ж�������������
            System.out.println("�ļ��ж������������ǣ�");
            for (byte b : all)
            {
                int i = b&0x000000ff;  //ֻȡ16���Ƶĺ���λ
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("��������֣�����GBK��������ȥ��");
            String str = new String(all,"GBK");
            System.out.println(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();}*/
		
		File f = new File("D:\\\\java_project\\\\test1.txt");
        System.out.println("Ĭ�ϱ��뷽ʽ:"+Charset.defaultCharset());
        //FileReader�õ������ַ�������һ�����Ѿ����ֽڸ���ĳ�ֱ���ʶ������ַ���
        //��FileReaderʹ�õı��뷽ʽ��Charset.defaultCharset()�ķ���ֵ����������ĵĲ���ϵͳ������GBK
        try (FileReader fr = new FileReader(f)) {
            char[] cs = new char[(int) f.length()];
            fr.read(cs);
            System.out.printf("FileReader��ʹ��Ĭ�ϵı��뷽ʽ%s,ʶ��������ַ��ǣ�%n",Charset.defaultCharset());
            System.out.println(new String(cs));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //FileReader�ǲ����ֶ����ñ��뷽ʽ�ģ�Ϊ��ʹ�������ı��뷽ʽ��ֻ��ʹ��InputStreamReader������
        //����ʹ��new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8")); ��������ʽ
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
            char[] cs = new char[(int) f.length()];
            isr.read(cs);
            System.out.printf("InputStreamReader ָ�����뷽ʽUTF-8,ʶ��������ַ��ǣ�%n");
            System.out.println(new String(cs));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		//byte[] cs= {E5,B1,8C};
		/*try {
			byte[] all = new byte[3];
			all[0]=(byte) 0xE5;
			all[1]=(byte) 0xB1;
			all[2]=(byte) 0x8C;
			String str = new String(all,"UTF-8");
	        System.out.println(str);
        } catch (UnsupportedEncodingException e) {
            System.out.printf("UnsupportedEncodingException: %s���뷽ʽ�޷������ַ�%s\n");
        }*/
	}
}
