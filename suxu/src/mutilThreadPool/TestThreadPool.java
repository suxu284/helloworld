package mutilThreadPool;

public class TestThreadPool { 
    public static void main(String[] args){ 
        //创建线程池,开启处理请求服务 
        final int threadCount=10; 
        PoolManage pool=PoolManage.getInstance(); 
        pool.init(); 
        //接收客户端请求 
        WorkTask task1=new  WorkTaskAImp("执行超时任务1..."); 
        TaskManager.addTask(task1); 
        final int requestCount=15; 
        for(int i=0;i<requestCount;i++){ 
            WorkTask task=new WorkTaskImp("执行第"+i+"个增加用户操作....."); 
            TaskManager.addTask(task); 
        } 
        /**/ 
    } 
} 