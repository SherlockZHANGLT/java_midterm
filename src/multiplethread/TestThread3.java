package multiplethread;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicInteger;

public class TestThread3 {
	private static int value = 0;
    private static AtomicInteger atomicValue =new AtomicInteger();
	public static String now() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
 
    public static void log(String msg) {
        System.out.printf("%s %s %s %n", now() , Thread.currentThread().getName() , msg);
    }
 
    public static void main(String[] args) {
        /*Lock lock = new ReentrantLock();
 
        Thread t1 = new Thread() {
            public void run() {
                try {
                    log("线程启动");
                    log("试图占有对象：lock");
 
                    lock.lock();
 
                    log("占有对象：lock");
                    log("进行5秒的业务操作");
                    Thread.sleep(5000);
 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象：lock");
                    lock.unlock();
                }
                log("线程结束");
            }
        };
        t1.setName("t1");
        t1.start();
        try {
            //先让t1飞2秒
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Thread t2 = new Thread() {
 
            public void run() {
                try {
                    log("线程启动");
                    log("试图占有对象：lock");
 
                    lock.lock();
 
                    log("占有对象：lock");
                    log("进行5秒的业务操作");
                    Thread.sleep(5000);
 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象：lock");
                    lock.unlock();
                }
                log("线程结束");
            }
        };
        t2.setName("t2");
        t2.start();*/
    	
    	/*Lock lock = new ReentrantLock();
    	 
        Thread t1 = new Thread() {
            public void run() {
                boolean locked = false;
                try {
                    log("线程启动");
                    log("试图占有对象：lock");
 
                    locked = lock.tryLock(1,TimeUnit.SECONDS);
                    if(locked){
                        log("占有对象：lock");
                        log("进行5秒的业务操作");
                        Thread.sleep(5000);
                    }
                    else{
                        log("经过1秒钟的努力，还没有占有对象，放弃占有");
                    }
 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                     
                    if(locked){
                        log("释放对象：lock");
                        lock.unlock();
                    }
                }
                log("线程结束");
            }
        };
        t1.setName("t1");
        t1.start();
        try {
            //先让t1飞2秒
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Thread t2 = new Thread() {
 
            public void run() {
                boolean locked = false;
                try {
                    log("线程启动");
                    log("试图占有对象：lock");
 
                    locked = lock.tryLock(1,TimeUnit.SECONDS);
                    if(locked){
                        log("占有对象：lock");
                        log("进行5秒的业务操作");
                        Thread.sleep(5000);
                    }
                    else{
                        log("经过1秒钟的努力，还没有占有对象，放弃占有");
                    }
 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                     
                    if(locked){
                        log("释放对象：lock");
                        lock.unlock();
                    }
                }
                log("线程结束");
            }
        };
        t2.setName("t2");
        t2.start();*/
    	
    	/*Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
         
        Thread t1 = new Thread() {
            public void run() {
                try {
                    log("线程启动");
                    log("试图占有对象：lock");
  
                    lock.lock();
  
                    log("占有对象：lock");
                    log("进行5秒的业务操作");
                    Thread.sleep(5000);
                    log("临时释放对象 lock， 并等待");
                    condition.await();
                    log("重新占有对象 lock，并进行5秒的业务操作");
                    Thread.sleep(5000);
  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象：lock");
                    lock.unlock();
                }
                log("线程结束");
            }
        };
        t1.setName("t1");
        t1.start();
        try {
            //先让t1飞2秒
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Thread t2 = new Thread() {
  
            public void run() {
                try {
                    log("线程启动");
                    log("试图占有对象：lock");
  
                    lock.lock();
  
                    log("占有对象：lock");
                    log("进行5秒的业务操作");
                    Thread.sleep(5000);
                    log("唤醒等待中的线程");
                    condition.signal();
  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("释放对象：lock");
                    lock.unlock();
                }
                log("线程结束");
            }
        };
        t2.setName("t2");
        t2.start();*/
    	
    	/*AtomicInteger atomicI =new AtomicInteger();
        int i = atomicI.decrementAndGet();
        int j = atomicI.incrementAndGet();
        int k = atomicI.addAndGet(3);*/
    	
    	int number = 100000;
        Thread[] ts1 = new Thread[number];
        for (int i = 0; i < number; i++) {
            Thread t =new Thread(){
                public void run(){
                    value++;
                }
            };
            t.start();
            ts1[i] = t;
        }
         
        //等待这些线程全部结束
        for (Thread t : ts1) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
         
        System.out.printf("%d个线程进行value++后，value的值变成:%d%n", number,value);
        Thread[] ts2 = new Thread[number];
        for (int i = 0; i < number; i++) {
            Thread t =new Thread(){
                public void run(){
                    atomicValue.incrementAndGet();
                }
            };
            t.start();
            ts2[i] = t;
        }
         
        //等待这些线程全部结束
        for (Thread t : ts2) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.printf("%d个线程进行atomicValue.incrementAndGet();后，atomicValue的值变成:%d%n", number,atomicValue.intValue());
    }

}
