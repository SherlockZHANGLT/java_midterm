package file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class TestFile {
	/*public static void main(String[] args) {
       /* // ����·��
        File f1 = new File("d:/LOLFolder");
        System.out.println("f1�ľ���·����" + f1.getAbsolutePath());
        // ���·��,����ڹ���Ŀ¼�������eclipse�У�������ĿĿ¼
        File f2 = new File("LOL.exe");
        System.out.println("f2�ľ���·����" + f2.getAbsolutePath());
        // ��f1��Ϊ��Ŀ¼�����ļ�����
        File f3 = new File(f1, "LOL.exe");
        System.out.println("f3�ľ���·����" + f3.getAbsolutePath());*/
		
		/*File f = new File("d:/LOLFolder/LOL.exe");
        System.out.println("��ǰ�ļ��ǣ�" +f);
        //�ļ��Ƿ����
        System.out.println("�ж��Ƿ���ڣ�"+f.exists());
        //�Ƿ����ļ���
        System.out.println("�ж��Ƿ����ļ��У�"+f.isDirectory());
        //�Ƿ����ļ������ļ��У�
        System.out.println("�ж��Ƿ����ļ���"+f.isFile());
        //�ļ�����
        System.out.println("��ȡ�ļ��ĳ��ȣ�"+f.length());
        //�ļ�����޸�ʱ��
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("��ȡ�ļ�������޸�ʱ�䣺"+d);
        //�����ļ��޸�ʱ��Ϊ1970.1.1 08:00:00
        f.setLastModified(0);
        //�ļ�������
        File f2 =new File("d:/LOLFolder/DOTA.exe");
        System.out.println("�ж��Ƿ���ڣ�"+f2.exists());
        f.renameTo(f2);
        System.out.println("��LOL.exe��������DOTA.exe"); 
        System.out.println("ע�⣺ ��Ҫ��D:\\LOLFolderȷʵ����һ��LOL.exe,\r\n�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ");
    }*/
		public static void main(String[] args) throws IOException {
	        /*File f = new File("d:/LOLFolder/skin");
	        // ���ַ����������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
	        System.out.println(Arrays.toString(f.list()));
	        // ���ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
	        File[]fs= f.listFiles();
	        System.out.println(Arrays.toString(fs));
	        // ���ַ�����ʽ���ػ�ȡ�����ļ���
	        System.out.println(f.getParent());
	        // ���ļ���ʽ���ػ�ȡ�����ļ���
	        f.getParentFile();
	        // �����ļ��У�������ļ���skin�����ڣ���������Ч
	        f.mkdir();
	        // �����ļ��У�������ļ���skin�����ڣ��ͻᴴ�����ļ���
	        f.mkdirs();
	        // ����һ�����ļ�,������ļ���skin�����ڣ��ͻ��׳��쳣
	        f.createNewFile();
	        // ���Դ���һ�����ļ�֮ǰ��ͨ�����ᴴ����Ŀ¼
	        f.getParentFile().mkdirs();
	        // �г����е��̷�c: d: e: �ȵ�
	        System.out.println(Arrays.toString(f.listRoots()));
	        // �h���ļ�
	        //f.delete();
	        // JVM������ʱ�򣬄h���ļ�����������ʱ�ļ���ɾ��
	        //f.deleteOnExit();*/
			long m;
			File f=new File("D:/2019");
			File[]fs=f.listFiles();
			System.out.println(Arrays.toString(fs));
			String[]fst=f.list();
			m=fs[0].length();
			for(int i=1;i<fs.length;i++) {
				File f1 = new File(fst[i]);
				if(m>f1.length())
					m=f1.length();
			}
			System.out.println(m);
	}
}
