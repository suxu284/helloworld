package mutilThreadPool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class helloworld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		System.out.println(new Date());// new Date()Ϊ��ȡ��ǰϵͳʱ��

		try {
             Thread.sleep(5000);//����CPU,����ʱ������»�ȡ�����߳�
         } catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
         System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
         System.out.println("suxusuxu");
	}

}
