package multiplethread;

import java.util.concurrent.atomic.AtomicInteger;

public class Hero {
	public String name;
    public float hp;
    public AtomicInteger hp1 =new AtomicInteger();
    public int damage;
    
  //��Ѫ
    public synchronized void recover(){
    	if(hp==1000) {
    		try {
    			this.wait();
    		}catch(InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
        hp=hp+1;
        System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp);
        // ֪ͨ��Щ�ȴ���this�����ϵ��̣߳������ѹ����ˣ����20�У��ȴ��ŵļ�Ѫ�̣߳����ѹ���
        this.notify();
    }
     
    //��Ѫ
    public synchronized void hurt(){
    	if (hp == 1) {
            try {
                // ��ռ��this�ļ�Ѫ�̣߳���ʱ�ͷŶ�this��ռ�У����ȴ�
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    	hp=hp-1;
    	System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp);
    	this.notify();
    }
    
  //��Ѫ
    public void hurt1(){
    	if (hp1.intValue() == 1) {
            try {
                // ��ռ��this�ļ�Ѫ�̣߳���ʱ�ͷŶ�this��ռ�У����ȴ�
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    	hp1.decrementAndGet();
    	System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp1.intValue());
    	this.notify();
    }
    
    public void attackHero(Hero h) {
        /*try {
            //Ϊ�˱�ʾ������Ҫʱ�䣬ÿ�ι�����ͣ1000����
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        h.hp-=damage;
        System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);
         
        if(h.isDead())
            System.out.println(h.name +"���ˣ�");
    }
 
    public boolean isDead() {
        return 0>=hp?true:false;
    }

}
