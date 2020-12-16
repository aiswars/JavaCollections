import java.util.ArrayList;
import java.util.Iterator;

public class ClassArrayList {

	public static void main(String[] args) {
		
	 
				 	ArrayList<String> a=new ArrayList<String>();
					a.add("qa"); 
					a.add("java"); 
					a.add("testing");
					a.add("java"); //DUPLICTAE VALUES will be added.
					
					
					
					// print all avlues
					System.out.println(a); 
								
					//indexof - to get the index of a value
					a.indexOf("qa");
					System.out.println("1. qa at 0: "+ (a.indexOf("qa")));
					System.out.println("........................");
					
			
					a.add(0, "student");
					System.out.println("the values added are "+ (a));
					System.out.println("2. now qa at 1 : " + (a.indexOf("qa")));
					System.out.println("........................");
					
					a.add(2, "qa");
					System.out.println("the values added are "+ (a));
					
					
					System.out.println("3. now qa at 1 & 2 : " + (a.indexOf("qa")));
					System.out.println("now java at 3 & 5 : " + (a.indexOf("java")));
					System.out.println("........................");
					
					a.add("sele");
					System.out.println("the values added are "+ (a));
					System.out.println("sele at: " + (a.indexOf("sele")));
					System.out.println("........................");
					
			
					System.out.println("The list is : " + (a));
					a.remove(1);
					System.out.println("Value at 1 (qa) is removed. Now the list is " + (a));
					System.out.println("........................");
					
					//remove using value
					a.remove("java");
					System.out.println("Removed java from the list, java at : " + (a.indexOf("java")));
					System.out.println(a);
					
					System.out.println(a.get(2));
					System.out.println("........................");
					
					System.out.println("using for loop & get()");
					for(int i=0; i<a.size(); i++) {
						System.out.println(a.get(i));
					}			
					System.out.println("________________________________________");
					
					//iterating using iterator()
					System.out.println("using iterator()");
				Iterator<String> it= a.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
					
					
					System.out.println(a.contains("java")); 
					
					System.out.println(a.indexOf("qa"));
					System.out.println(a.isEmpty()); //boolean
					System.out.println(a.size());


			
		}
		
	}


