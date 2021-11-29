import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class HierarchySkeleton {

	int k=0; 
	ArrayList<Character> firstL =new ArrayList<Character>(); //for 1st layer
	ArrayList<Character> secondL =new ArrayList<Character>(); //for 2nd layer
	ArrayList<Character> thirdL =new ArrayList<Character>(); //for 3rd layer
	public void callForSkeleton(Hashtable<Character, Integer> inp)
	{
		System.out.println("\nThe hierarchy skeleton of all subgraphs derived from the given graph G:-");
//		System.out.println("Key Value");
		

		for(char key:inp.keySet()) {
			if(inp.get(key)==2) {
				firstL.add(key);
			}
			if(inp.get(key)==3) {
				secondL.add(key);
			}
			if(inp.get(key)==4) {
				thirdL.add(key);
			}
//			System.out.println(key +"  "+inp.get(key));//to print all key and values
		}
//		System.out.println();
		System.out.println(inp);

		System.out.println();
		System.out.println("First Layer: "+firstL);
		System.out.println("Second Layer: "+secondL);
		System.out.println("Third Layer: "+thirdL);
		
		System.out.println("********************");
		System.out.println("After sorting/Final Skeleton");
		
		//doing sorting= arranging the subgraphs in alphabetical order
		Collections.sort(firstL);
		Collections.sort(secondL);
		Collections.sort(thirdL);
		
		System.out.println("First Layer: "+firstL);
		System.out.println("Second Layer: "+secondL);
		System.out.println("Third Layer: "+thirdL);
		
		
		
	}
	//print the post-order of the hierarchy skeleton which is derived from the given graph G
	//Post-order= Left-Right-Root
	
}


