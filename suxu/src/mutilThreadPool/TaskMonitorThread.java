package mutilThreadPool;

public final class TaskMonitorThread extends Thread {
    //private PoolManage threadPool;
    private int GetWorkTaskPollTime = 10;// ���������ѯʱ�䣬������
    /*public TaskMonitorThread(PoolManage pool) {
        System.out.println("���ڴ����������߳�...");
        this.threadPool = pool;
    }*/
    public TaskMonitorThread() {
        System.out.println("���ڴ����������߳�...");
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            
            try {
                WorkTask task = TaskManager.getTask();
                if (task == null) {
                    try {
                    	System.out.println("���ڵȴ���.....");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                } else {
                    Worker t = PoolManage.getInstance().getIdleThread();// ��ȡ�����߳�
                     System.out.println("Worker.toString()=============================>?"+t.toString());
                    if (t == null)
                        break;
                     t.setWorkTask(task);// �����߳�����
                     System.out.println("task.toString()=============================>?"+task.toString());
                     t.setIsRunning(true);//��������߳�
                     System.out.println("Worker.toString()=============================>?"+t.getIsrunning());
                    // try {
                    //Thread.sleep(GetWorkTaskPollTime);
                    //
                }

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


}