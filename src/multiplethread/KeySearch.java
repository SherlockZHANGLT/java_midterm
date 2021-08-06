package multiplethread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class KeySearch {
	public File folder;
    public String search;
     
    public KeySearch(File folder, String search) {
        this.folder = folder;
        this.search = search;
    }
     
    public void search(File folder, String search) {
        try {
            // 查找停顿，1000毫秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }       
        ArrayList<String> s0 = read(folder);
        if(s0!=null) {
        for (int j = 0; j < s0.size(); j++) {
            if(String.valueOf(s0.get(j)).contains(search)) 
                System.out.printf("找到子目标字符串%s,在文件：%s\r\n", search, String.valueOf
 
(folder));  
        }   
}
    }
 
    @SuppressWarnings("null")
	public ArrayList<String> read(File f){
    	ArrayList<String> s0=new ArrayList<>();
    	int i=0;
		try {
			FileReader fr = new FileReader(f);
	        BufferedReader br = new BufferedReader(fr);
	        while (true) {
	            String line;
				try {
					line = br.readLine();
					s0.add(line);
		            if (null == line) {
		                break;
		            }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			return s0;
		}

}
}
