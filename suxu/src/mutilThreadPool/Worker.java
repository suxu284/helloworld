package mutilThreadPool;

public class Worker extends Thread {
    public boolean isrunning=false;
    private WorkTask nowTask; // ��ǰ����
    private Object threadTag;// �̱߳�ʶ
    //��ȡ�̱߳�ʶkey
    public Object getThreadTag() {
        return threadTag;
    }      
    public synchronized void setWorkTask(WorkTask task) {
        this.nowTask = task;
    }

    public synchronized void setIsRunning(boolean flag) {
        this.isrunning = flag;
        if (flag) {
            this.notify();
        }
    }

    public Worker(Object key) {
        System.out.println("���ڴ��������߳�...�̱߳��" + key.toString());
        this.threadTag = key;
        // this.state=CREATESTATE;
    }

    public boolean getIsrunning() {
        return isrunning;
    }

    public synchronized void run() {
        System.out.println("�����߳�" +  this.getThreadTag()  + "��ʼ���ɹ�");
        while (true) {
            if (!isrunning) {
                try {
                    System.out.println("����" + this.getThreadTag() + "������ɻع��̳߳�");
                    this.wait();
                } catch (InterruptedException e) {
                    System.out.println("�̱߳��赲");
                    e.printStackTrace();
                }
            } else {
                //try {
                    nowTask.runTask();
                    setIsRunning(false);
                    System.out.println("����" +this.getThreadTag()  + "��ʼ����");
                    //this.sleep(3000);
            //} catch (InterruptedException e) {
                //    e.printStackTrace();
                //}
                
                //this.notify();
                //break;
            }
        }
    }
}