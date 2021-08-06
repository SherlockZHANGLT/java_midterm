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
        ahri.name = "九尾妖狐";
        final Hero annie = new Hero();
        annie.name = "安妮";
        final Hero lala=new Hero();
        lala.name="LALA";
         
        Thread t1 = new Thread(){
            public void run(){
                //占有九尾妖狐
                synchronized (ahri) {
                    System.out.println("t1 已占有九尾妖狐");
                    try {
                        //停顿1000毫秒，另一个线程有足够的时间占有安妮
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                     
                    System.out.println("t1 试图占有安妮");
                    System.out.println("t1 等待中 。。。。");
                    synchronized (annie) {
                        System.out.println("do something");
                    }
                }  
                 
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                //占有安妮
                synchronized (annie) {
                    System.out.println("t2 已占有安妮");
                    try {
                         
                        //停顿1000毫秒，另一个线程有足够的时间占有暂用九尾妖狐
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("t2 试图占有LALA");
                    System.out.println("t2 等待中 。。。。");
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
        			System.out.println("t3 已占有LALA");
        			try {
        				Thread.sleep(1000);
        			}catch(InterruptedException e) {
        				e.printStackTrace();
        			}
        			System.out.println("t3 试图占有九尾妖狐");
        			System.out.println("t3 等待中 。。。。");
        			synchronized(ahri) {
        				System.out.println("do something");
        			}
        		}
        	}
        };
        t3.start();*/
		
		/*final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
           
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    //因为减血更快，所以盖伦的血量迟早会到达1
                    //使用while循环判断是否是1，如果是1就不停的循环
                    //直到加血线程回复了血量
                    //while(gareen.hp==1){
                    //	try {
					//		Thread.sleep(10);
					//	} catch (InterruptedException e) {
					//		// TODO Auto-generated catch block
					//		e.printStackTrace();
					//	}
                    //}
                    gareen.hurt();
                    System.out.printf("t1 为%s 减血1点,减少血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
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
                    System.out.printf("t2 为%s 回血1点,增加血后，%s的血量是%.0f%n",gareen.name,gareen.name,gareen.hp);
 
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
                    //System.out.println("执行任务");
                    //任务可能是打印一句话
                    //可能是访问文件
                    //可能是做排序
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
                    //System.out.println("执行任务");
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
                System.out.println("任务1");
            }
               
        });
    }

}
