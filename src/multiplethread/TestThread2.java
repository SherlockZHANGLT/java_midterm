package multiplethread;

import java.util.ArrayList;
import java.awt.GradientPaint;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread2 {
	public static void main(String[] args) {
        //List<Integer> list1 = new ArrayList<>();
        //List<Integer> list2 = Collections.synchronizedList(list1);
        
        /*final Hero ahri = new Hero();
        ahri.name = "��β����";
        final Hero annie = new Hero();
        annie.name = "����";
        final Hero lala=new Hero();
        lala.name="LALA";
         
        Thread t1 = new Thread(){
            public void run(){
                //ռ�о�β����
                synchronized (ahri) {
                    System.out.println("t1 ��ռ�о�β����");
                    try {
                        //ͣ��1000���룬��һ���߳����㹻��ʱ��ռ�а���
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                     
                    System.out.println("t1 ��ͼռ�а���");
                    System.out.println("t1 �ȴ��� ��������");
                    synchronized (annie) {
                        System.out.println("do something");
                    }
                }  
                 
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                //ռ�а���
                synchronized (annie) {
                    System.out.println("t2 ��ռ�а���");
                    try {
                         
                        //ͣ��1000���룬��һ���߳����㹻��ʱ��ռ�����þ�β����
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("t2 ��ͼռ��LALA");
                    System.out.println("t2 �ȴ��� ��������");
                    synchronized (lala) {
                        System.out.println("do something");
                    }
                }  
                 
            }
        };
        t2.start();
        Thread t3=new Thread() {
        	public void run() {
        		synchronized(lala) {
        			System.out.println("t3 ��ռ��LALA");
        			try {
        				Thread.sleep(1000);
        			}catch(InterruptedException e) {
        				e.printStackTrace();
        			}
        			System.out.println("t3 ��ͼռ�о�β����");
        			System.out.println("t3 �ȴ��� ��������");
        			synchronized(ahri) {
        				System.out.println("do something");
        			}
        		}
        	}
        };
        t3.start();*/
		
		/*final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 616;
           
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    //��Ϊ��Ѫ���죬���Ը��׵�Ѫ������ᵽ��1
                    //ʹ��whileѭ���ж��Ƿ���1�������1�Ͳ�ͣ��ѭ��
                    //ֱ����Ѫ�̻߳ظ���Ѫ��
                    //while(gareen.hp==1){
                    //	try {
					//		Thread.sleep(10);
					//	} catch (InterruptedException e) {
					//		// TODO Auto-generated catch block
					//		e.printStackTrace();
					//	}
                    //}
                    gareen.hurt();
                    System.out.printf("t1 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
 
            }
        };
        t1.start();
 
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    gareen.recover();
                    System.out.printf("t2 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
 
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
 
            }
        };
        t2.start();*/
		
		/*ThreadPool pool = new ThreadPool();
		  
        for (int i = 0; i < 5; i++) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    //System.out.println("ִ������");
                    //��������Ǵ�ӡһ�仰
                    //�����Ƿ����ļ�
                    //������������
                }
            };
             
            pool.add(task);
             
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }*/
		
		/*ThreadPool pool= new ThreadPool();
        int sleep=1000;
        while(true){
            pool.add(new Runnable(){
                @Override
                public void run() {
                    //System.out.println("ִ������");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
            try {
                Thread.sleep(sleep);
                sleep = sleep>100?sleep-100:sleep;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
              
        }*/
		
		ThreadPoolExecutor threadPool= new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
        
        threadPool.execute(new Runnable(){
   
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("����1");
            }
               
        });
    }

}
