package cache;

public class ces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println(CacheManager.getSimpleFlag("alksd")); 
		     CacheManager.putCache("abc", new Cache()); 
		     CacheManager.putCache("def", new Cache()); 
		     CacheManager.putCache("ccc", new Cache()); 
		     CacheManager.clearOnly(""); 
		     Cache c = new Cache(); 
		     for (int i = 0; i < 10; i++) { 
		         CacheManager.putCache("" + i, c); 
		     } 
		     CacheManager.putCache("aaaaaaaa", c); 
		     CacheManager.putCache("abchcy;alskd", c); 
		     CacheManager.putCache("cccccccc", c); 
		     CacheManager.putCache("abcoqiwhcy", c); 
		     System.out.println("ɾ��ǰ�Ĵ�С��"+CacheManager.getCacheSize()); 
		     CacheManager.getCacheAllkey(); 
		     CacheManager.clearAll("aaaa"); 
		     System.out.println("ɾ����Ĵ�С��"+CacheManager.getCacheSize()); 
		     CacheManager.getCacheAllkey(); 
	}

}
