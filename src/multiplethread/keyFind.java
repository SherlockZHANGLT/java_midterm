package multiplethread;

public class keyFind implements Runnable{
	private KeySearch k;
    
    public keyFind(KeySearch k) {
        this.k = k;
    }
     
    @Override
    public void run() {
        // TODO �Զ����ɵķ������
        k.search(k.folder, k.search);
    }

}
