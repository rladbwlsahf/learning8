package human99;

import java.util.ArrayList;

public class ListNow {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("KIM");
		names.add("Park");
		
//		System.out.println(names.get(0));
//		
//		System.out.println(names.size());
		
		for(int i=0; i<names.size(); i++) {
			System.out.printf("nmaes.get(%d) => %s \n",i,names.get(i));
		}

	}

}
