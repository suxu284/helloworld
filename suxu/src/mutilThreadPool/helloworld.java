package mutilThreadPool;

import java.text.SimpleDateFormat;
import java.util.Date;

public class helloworld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		System.out.println(new Date());// new Date()为获取当前系统时间

		try {
             Thread.sleep(5000);//放弃CPU,若干时间后重新获取空闲线程
         } catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
         System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
         System.out.println("suxusuxu");
	}

}
