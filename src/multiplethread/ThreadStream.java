package multiplethread;

import java.io.File;

public class ThreadStream {
	public static void main(String[] args) {
        //目标目录下
        File f = new File("D:/java_project/lol");
        String search = "Magic";
        search(f,search);
    }  
	public static void search(File f, String search) {
        /*String[] s = f.list();
        File[] fl = new File[s.length];
        keyFind[] keys = new keyFind[s.length];
        for (int i = 0; i < s.length; i++) {
            fl[i] = new File(f.getAbsoluteFile() + "/" + s[i]);
            if (fl[i].isFile() && String.valueOf(fl[i]).contains(".java")) {
                keys[i] = new keyFind(new KeySearch(fl[i],search));
                new Thread(keys[i]).start();
            }
            if (fl[i].isDirectory()) { 
                search(fl[i],search);
            }
        }*/
		
		String[] s = f.list();
        File[] fl = new File[s.length];
        keyFind1[] keys = new keyFind1[s.length];
        for (int i = 0; i < s.length; i++) {
            fl[i] = new File(f.getAbsoluteFile() + "/" + s[i]);
            if (fl[i].isFile() && String.valueOf(fl[i]).contains(".java")) {
                keys[i] = new keyFind1(fl[i],search);
                keys[i].start();
            }
            if (fl[i].isDirectory()) { 
                search(fl[i],search);
            }
        }
    }

}
