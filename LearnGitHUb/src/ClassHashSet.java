
import java.util.HashSet;
import java.util.Iterator;

public class ClassHashSet {


	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("NZ");
		hs.add("CANADA");
		hs.add("INDIA"); // this duplicate value will not be added.

		System.out.println("The values added are " + hs);
		System.out.println("..............................");

		// iterator()
		System.out.println("Using iterator()method The values added are ");
		Iterator<String> it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------");

		// remove
		System.out.println("remove() is boolean");
		System.out.println(hs.remove("UK"));
		System.out.println("removed UK");
		System.out.println("The values available now are " + hs);

		// isempty
		System.out.println("isEmpty() :  " + (hs.isEmpty()));
		// size
		System.out.println("The size of hashset: " + (hs.size()));

	}

}
