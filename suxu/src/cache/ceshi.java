package cache;

import singleton.SingletonTest;

public class ceshi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonTest ss = SingletonTest.getInstance();
		SingletonTest ssm = SingletonTest.getInstance();
		if(ss==ssm){
			ss.printstring("ok");
			
		}else{
			ss.printstring("false");
			
		}
	}

}
