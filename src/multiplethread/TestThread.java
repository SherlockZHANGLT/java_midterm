package multiplethread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.GradientPaint;

public class TestThread {
	public static String now(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
	
	public static void main(String[] args) {
        
        /*Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 616;
        gareen.damage = 1;
 
        Hero teemo = new Hero();
        teemo.name = "��Ī";
        teemo.hp = 300;
        teemo.damage = 30;
         
        Hero bh = new Hero();
        bh.name = "�ͽ�����";
        bh.hp = 500;
        bh.damage = 1;
         
        Hero leesin = new Hero();
        leesin.name = "äɮ";
        leesin.hp = 455;
        leesin.damage = 80;*/
         
        /*//���׹�����Ī
        while(!teemo.isDead()){
            gareen.attackHero(teemo);
        }
 
        //�ͽ����˹���äɮ
        while(!leesin.isDead()){
            bh.attackHero(leesin);
        }*/
        
        /*KillThread killThread1 = new KillThread(gareen,teemo);
        killThread1.start();
        KillThread killThread2 = new KillThread(bh,leesin);
        killThread2.start();*/
        
        /*Battle battle1 = new Battle(gareen,teemo);
        new Thread(battle1).start();
        Battle battle2 = new Battle(bh,leesin);
        new Thread(battle2).start();*/
        
        /*//������
        Thread t1= new Thread(){
            public void run(){
                //���������õ��ⲿ�ľֲ�����teemo�������teemo����Ϊfinal
                //������JDK7�Ժ󣬾Ͳ��Ǳ����final����
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }              
            }
        }; 
        t1.start();
          
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }              
            }
        };
        t2.start();*/
        
        /*Thread t1= new Thread(){
            public void run(){
                int seconds =0;
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("�Ѿ�����LOL %d ��%n", seconds++);
                    if(seconds==10)
                    	break;
                }              
            }
        };
        t1.start();*/
        
        /*Thread t1= new Thread(){
            public void run(){
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }              
            }
        };  
        t1.start();
 
      //����ִ�е����һֱ��main�߳�������
        try {
            //t1�̼߳��뵽main�߳�������ֻ��t1�߳����н������Ż����������
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }              
            }
        };
        //��۲쵽���װ���Īɱ���󣬲�����t2�߳�
        t2.start();*/
        
        /*Thread t1= new Thread(){
            public void run(){
 
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }              
            }
        };
          
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }              
            }
        };
         
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();*/
        
        /*Thread t1= new Thread(){
            public void run(){
 
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }              
            }
        };
          
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    //��ʱ��ͣ��ʹ��t1����ռ��CPU��Դ
                    Thread.yield();
                     
                    bh.attackHero(leesin);
                }              
            }
        };
         
        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();*/
        
        /*Thread t1= new Thread(){
            public void run(){
                int seconds =0;
                 
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("�Ѿ�����LOL %d ��%n", seconds++);
                     
                }              
            }
        };
        t1.setDaemon(true);
        t1.start();*/
        
        /*final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 10000;
           
        System.out.printf("���׵ĳ�ʼѪ���� %.0f%n", gareen.hp);
           
        //���߳�ͬ������ָ���Ƕ���߳�ͬʱ�޸�һ�����ݵ�ʱ�򣬵��µ�����
           
        //���������10000��Ѫ�������ڻ����ͬʱ�ֱ��Է����Ӣ�۹���
           
        //��JAVA��������ʾ�������ж���߳��ڼ��ٸ��׵�hp
        //ͬʱ���ж���߳��ڻָ����׵�hp
           
        //n���߳����Ӹ��׵�hp
           
        int n = 10000;
   
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];
           
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    gareen.recover();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;
               
        }
           
        //n���̼߳��ٸ��׵�hp
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    gareen.hurt();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreads[i] = t;
        }
           
        //�ȴ����������߳̽���
        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //�ȴ����м����߳̽���
        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
           
        //����ִ�е�����������Ӻͼ����̶߳�������
           
        //���Ӻͼ����̵߳�������һ���ģ�ÿ�ζ����ӣ�����1.
        //��ô�����̶߳������󣬸��׵�hpӦ�û��ǳ�ʼֵ
           
        //������ʵ�Ϲ۲쵽���ǣ�
                   
        System.out.printf("%d�������̺߳�%d�������߳̽�����%n���׵�Ѫ������� %.0f%n", n,n,gareen.hp);
    */
		final Object someObject = new Object();
        
        Thread t1 = new Thread(){
            public void run(){
                try {
                    System.out.println( now()+" t1 �߳��Ѿ�����");
                    System.out.println( now()+this.getName()+ " ��ͼռ�ж���someObject");
                    synchronized (someObject) {
                          
                        System.out.println( now()+this.getName()+ " ռ�ж���someObject");
                        Thread.sleep(5000);
                        System.out.println( now()+this.getName()+ " �ͷŶ���someObject");
                    }
                    System.out.println(now()+" t1 �߳̽���");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        t1.setName(" t1");
        t1.start();
        Thread t2 = new Thread(){
  
            public void run(){
                try {
                    System.out.println( now()+" t2 �߳��Ѿ�����");
                    System.out.println( now()+this.getName()+ " ��ͼռ�ж���someObject");
                    synchronized (someObject) {
                        System.out.println( now()+this.getName()+ " ռ�ж���someObject");
                        Thread.sleep(5000);
                        System.out.println( now()+this.getName()+ " �ͷŶ���someObject");
                    }
                    System.out.println(now()+" t2 �߳̽���");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        t2.setName(" t2");
        t2.start();
		
		/*//final Object someObject = new Object();
        
        final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 10000;
          
        int n = 10000;
  
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];
          
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                     
                    //�κ��߳�Ҫ�޸�hp��ֵ��������ռ��someObject
                    //synchronized (someObject) {
                	//synchronized (gareen) {
                       // gareen.recover();
                    //}
                     
                	gareen.recover();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;
              
        }
          
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    //�κ��߳�Ҫ�޸�hp��ֵ��������ռ��someObject
                    //synchronized (someObject) {
                       // gareen.hurt();
                   // }
                	gareen.hurt();
                     
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreads[i] = t;
        }
          
        for (Thread t : addThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (Thread t : reduceThreads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
          
        System.out.printf("%d�������̺߳�%d�������߳̽�����%n���׵�Ѫ���� %.0f%n", n,n,gareen.hp);
    */
    }

}
