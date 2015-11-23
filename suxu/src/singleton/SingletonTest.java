package singleton;

public class SingletonTest {
	private SingletonTest(){
		
	}
	
	private static SingletonTest ss;
	
	public static SingletonTest getInstance(){
		if(ss == null){
			synchronized(SingletonTest.class){
				if(ss == null){
					ss = new SingletonTest();
				}
			}
		}
		return ss;
	}
	
	public void printstring(String sss){
		System.out.print(sss);
	}
	
	
	
}
