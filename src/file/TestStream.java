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
            // 创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            // 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
            FileOutputStream fous=new FileOutputStream(f);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/
	
	public static void main(String[] args) {
        /*try {
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
            File f =new File("d:/java_project/lol.txt");
            //创建基于文件的输入流
            FileInputStream fis =new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all =new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b : all) {
                //打印出来是65 66
                System.out.println(b);
            }
            //每次使用完流，都应该进行关闭
            fis.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*try {
            // 准备文件lol2.txt其中的内容是空的
            File f = new File("d:/java_project/abc/def/ggg/lol2.txt");
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };
            if(!f.getParentFile().exists()) {
                f.getParentFile().mkdirs();
            }
            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
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
            // 在try 里关闭流
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
            // 在finally 里关闭流
            if (null != fis)
                try {
 
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }*/
		
		/*File f = new File("d:/lol.txt"); 
        //把流定义在try()里,try,catch或者finally结束的时候，会自动关闭
        try (FileInputStream fis = new FileInputStream(f)) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
		
		/*// 准备文件lol.txt其中的内容是AB
        File f = new File("d:/java_project/lol.txt");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.println(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*// 准备文件lol2.txt
        File f = new File("d:/java_project/lol4.txt");
        // 创建基于文件的Writer
        try (FileWriter fr = new FileWriter(f)) {
            // 以字符流的形式把数据写入到文件中
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
		
		/*String str = "中";
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
            System.out.printf("字符: \"%s\" 的在编码方式%s下的十六进制值是%n", str, encode);
            byte[] bs = str.getBytes(encode);
 
            for (byte b : bs) {
                int i = b&0xff;
                System.out.print(Integer.toHexString(i) + "\t");
            }
            System.out.println();
            System.out.println();
        } catch (UnsupportedEncodingException e) {
            System.out.printf("UnsupportedEncodingException: %s编码方式无法解析字符%s\n", encode, str);
        }*/
		
		/*File f = new File("D:\\java_project\\test.txt");
        try (FileInputStream fis = new FileInputStream(f);) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
   
            //文件中读出来的数据是
            System.out.println("文件中读出来的数据是：");
            for (byte b : all)
            {
                int i = b&0x000000ff;  //只取16进制的后两位
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("把这个数字，放在GBK的棋盘上去：");
            String str = new String(all,"GBK");
            System.out.println(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();}*/
		
		File f = new File("D:\\\\java_project\\\\test1.txt");
        System.out.println("默认编码方式:"+Charset.defaultCharset());
        //FileReader得到的是字符，所以一定是已经把字节根据某种编码识别成了字符了
        //而FileReader使用的编码方式是Charset.defaultCharset()的返回值，如果是中文的操作系统，就是GBK
        try (FileReader fr = new FileReader(f)) {
            char[] cs = new char[(int) f.length()];
            fr.read(cs);
            System.out.printf("FileReader会使用默认的编码方式%s,识别出来的字符是：%n",Charset.defaultCharset());
            System.out.println(new String(cs));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //FileReader是不能手动设置编码方式的，为了使用其他的编码方式，只能使用InputStreamReader来代替
        //并且使用new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8")); 这样的形式
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
            char[] cs = new char[(int) f.length()];
            isr.read(cs);
            System.out.printf("InputStreamReader 指定编码方式UTF-8,识别出来的字符是：%n");
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
            System.out.printf("UnsupportedEncodingException: %s编码方式无法解析字符%s\n");
        }*/
	}
}
