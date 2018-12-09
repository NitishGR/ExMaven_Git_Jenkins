package ExMaven_Git_Jenkins.ExMaven_Git_Jenkins;

/**
 * Hello world!
 *
 */
public class App 
{
  
	public void printnames() { 
		// Added few names
		String[] names = {"Thanos","Captain America","Thor","Iron Man","Ant Man","Black Widow","Hawkeye","Hulk"};
		/*
		 * Changed to for each loop
		 */
		for(String name : names) {
			System.out.println("Name : "+name);
			System.out.println("hello "+name+ " , How are you doing?");
		}
	}
}
