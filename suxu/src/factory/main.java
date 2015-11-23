package factory;

public class main {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		bridinterface  mm = birdfactorys.productbird("factory.bird1");
		bridinterface  ll = birdfactorys.productbird("factory.bird2");
		ll.run();
		mm.run();
		
	}

}
