package mutilThreadPool;

import java.util.LinkedList;

public class TaskManager {
    public static LinkedList<WorkTask> workqueue =new LinkedList<WorkTask>();// �������
    /**
     * ���������м���һ�������ɹ����߳�ȥִ�и�����
     * 
     * @param task
     */
    public synchronized static void addTask(WorkTask worktask) {
        if (worktask != null &&workqueue.size()<15) {
            workqueue.add(worktask);
        }
    }

    /**
     * �ӹ���������ȡ��һ������
     * 
     * @return
     * @throws InterruptedException
     */
    public synchronized static WorkTask getTask() throws InterruptedException {
        while (workqueue.size() >0) {
            return (WorkTask) workqueue.removeFirst();
        }
        return null;
    }
}
