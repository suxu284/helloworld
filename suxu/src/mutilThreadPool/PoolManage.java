package mutilThreadPool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/*
 *  �̳߳ع�������PoolManager��:���ڴ����������̳߳أ����õ���ģʽ
 * 
 */
public class PoolManage {
    public static PoolManage mPool=new PoolManage();
    public final int max_pool =2;
    public final int max_Tasks = 15;
    public static ArrayList<Worker> init_pools;
    private int GetIdleThreadPollTime=50;//��ȡ�����߳���ѯ���ʱ��,������
    private TaskMonitorThread mainThread;//�������߳�

    static {
        init_pools = new ArrayList(1);
    }

    public static PoolManage getInstance() {
        if (mPool == null) {
            mPool = new PoolManage();
        }

        return mPool;
    }
    
    
    
    //��ȡ�����߳�
    public  Worker getIdleThread(){
        Worker working =null;
        while(true){
            synchronized(init_pools){
                for (int i = 0; i < max_pool; i++) {
                    //Worker working = init_pools.get(i);
                    working = init_pools.get(i);
                    if (!working.isrunning) {
                    //    System.out.println("�������������߳�" + working.getThreadTag() + "ִ��");
                        return working;
                    }
                }
            }
            try {
                Thread.sleep(5000);//����CPU,����ʱ������»�ȡ�����߳�
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        
    }
    public void init() {
        System.out.println("�̳߳س�ʼ����ʼ������");
        Worker worker = null;
        for (int i = 0; i < this.max_pool; i++) {
            worker = new Worker("initThread"+i);
            init_pools.add(worker);
            worker.start();
        }
        mainThread=new  TaskMonitorThread();
        mainThread.start();
        System.out.println("������ʼ���̳߳�...");

    }
    

}