package mutilThreadPool;

public interface WorkTask {
    public void runTask();//ִ�й�������
       //public int compareTo(mJob job);
    public void cancelTask();
    public int getProgress();
}
