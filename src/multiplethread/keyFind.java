package multiplethread;

public class keyFind implements Runnable{
	private KeySearch k;
    
    public keyFind(KeySearch k) {
        this.k = k;
    }
     
    @Override
    public void run() {
        // TODO 自动生成的方法存根
        k.search(k.folder, k.search);
    }

}
