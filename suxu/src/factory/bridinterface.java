package factory;

public abstract class bridinterface {
	public void run(){
		String cn = this.getClass().getName();
		System.out.println(cn);
	}
}
