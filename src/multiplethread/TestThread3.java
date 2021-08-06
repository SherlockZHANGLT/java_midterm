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
                    log("�߳�����");
                    log("��ͼռ�ж���lock");
 
                    lock.lock();
 
                    log("ռ�ж���lock");
                    log("����5���ҵ�����");
                    Thread.sleep(5000);
 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("�ͷŶ���lock");
                    lock.unlock();
                }
                log("�߳̽���");
            }
        };
        t1.setName("t1");
        t1.start();
        try {
            //����t1��2��
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Thread t2 = new Thread() {
 
            public void run() {
                try {
                    log("�߳�����");
                    log("��ͼռ�ж���lock");
 
                    lock.lock();
 
                    log("ռ�ж���lock");
                    log("����5���ҵ�����");
                    Thread.sleep(5000);
 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("�ͷŶ���lock");
                    lock.unlock();
                }
                log("�߳̽���");
            }
        };
        t2.setName("t2");
        t2.start();*/
    	
    	/*Lock lock = new ReentrantLock();
    	 
        Thread t1 = new Thread() {
            public void run() {
                boolean locked = false;
                try {
                    log("�߳�����");
                    log("��ͼռ�ж���lock");
 
                    locked = lock.tryLock(1,TimeUnit.SECONDS);
                    if(locked){
                        log("ռ�ж���lock");
                        log("����5���ҵ�����");
                        Thread.sleep(5000);
                    }
                    else{
                        log("����1���ӵ�Ŭ������û��ռ�ж��󣬷���ռ��");
                    }
 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                     
                    if(locked){
                        log("�ͷŶ���lock");
                        lock.unlock();
                    }
                }
                log("�߳̽���");
            }
        };
        t1.setName("t1");
        t1.start();
        try {
            //����t1��2��
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Thread t2 = new Thread() {
 
            public void run() {
                boolean locked = false;
                try {
                    log("�߳�����");
                    log("��ͼռ�ж���lock");
 
                    locked = lock.tryLock(1,TimeUnit.SECONDS);
                    if(locked){
                        log("ռ�ж���lock");
                        log("����5���ҵ�����");
                        Thread.sleep(5000);
                    }
                    else{
                        log("����1���ӵ�Ŭ������û��ռ�ж��󣬷���ռ��");
                    }
 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                     
                    if(locked){
                        log("�ͷŶ���lock");
                        lock.unlock();
                    }
                }
                log("�߳̽���");
            }
        };
        t2.setName("t2");
        t2.start();*/
    	
    	/*Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
         
        Thread t1 = new Thread() {
            public void run() {
                try {
                    log("�߳�����");
                    log("��ͼռ�ж���lock");
  
                    lock.lock();
  
                    log("ռ�ж���lock");
                    log("����5���ҵ�����");
                    Thread.sleep(5000);
                    log("��ʱ�ͷŶ��� lock�� ���ȴ�");
                    condition.await();
                    log("����ռ�ж��� lock��������5���ҵ�����");
                    Thread.sleep(5000);
  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("�ͷŶ���lock");
                    lock.unlock();
                }
                log("�߳̽���");
            }
        };
        t1.setName("t1");
        t1.start();
        try {
            //����t1��2��
            Thread.sleep(2000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Thread t2 = new Thread() {
  
            public void run() {
                try {
                    log("�߳�����");
                    log("��ͼռ�ж���lock");
  
                    lock.lock();
  
                    log("ռ�ж���lock");
                    log("����5���ҵ�����");
                    Thread.sleep(5000);
                    log("���ѵȴ��е��߳�");
                    condition.signal();
  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    log("�ͷŶ���lock");
                    lock.unlock();
                }
                log("�߳̽���");
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
         
        //�ȴ���Щ�߳�ȫ������
        for (Thread t : ts1) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
         
        System.out.printf("%d���߳̽���value++��value��ֵ���:%d%n", number,value);
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
         
        //�ȴ���Щ�߳�ȫ������
        for (Thread t : ts2) {
            try {
                t.join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.printf("%d���߳̽���atomicValue.incrementAndGet();��atomicValue��ֵ���:%d%n", number,atomicValue.intValue());
    }

}
