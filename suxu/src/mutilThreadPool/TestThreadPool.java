package mutilThreadPool;

public class TestThreadPool { 
    public static void main(String[] args){ 
        //�����̳߳�,��������������� 
        final int threadCount=10; 
        PoolManage pool=PoolManage.getInstance(); 
        pool.init(); 
        //���տͻ������� 
        WorkTask task1=new  WorkTaskAImp("ִ�г�ʱ����1..."); 
        TaskManager.addTask(task1); 
        final int requestCount=15; 
        for(int i=0;i<requestCount;i++){ 
            WorkTask task=new WorkTaskImp("ִ�е�"+i+"�������û�����....."); 
            TaskManager.addTask(task); 
        } 
        /**/ 
    } 
} 