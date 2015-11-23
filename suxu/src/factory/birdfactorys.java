package factory;

public class birdfactorys {
	public static bridinterface productbird(String ss) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		bridinterface mm = (bridinterface)Class.forName(ss).newInstance();
		return mm;
		
	}
}
