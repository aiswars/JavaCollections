import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class ClassHashTable {

	public static void main(String[] args) {

		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		ht.put(34, 393);
		ht.put(12, 393);
		ht.put(9, 393);// no duplicate values
		ht.put(9, 393);
		ht.put(9, 000);
//		ht.put(null,null);        //nullpointer exception >> no null keys and null values

		System.out.print(ht);
		System.out.println("    are the values added ");

		int a[] = { 105, 255, 135, 105, 255, 135, 444, 126 };

		for (int i = 0; i < a.length; i++) {
			ht.put(i, a[i]);
		}

		System.out.println("The inserted elements to the hashtable are " + ht);

		if (ht.contains(255)) {
			System.out.println(" contains : Value found");
		}
		if (ht.containsValue(255)) {
			System.out.println(" containsValue : Value found");
		}

		System.out.println("Value at key " + ht.get(3));
		System.out.println("Hashcode of this hashtable " + ht.hashCode());
		System.out.println("____________________________________________________");

		for (int j = 0; j < ht.size(); j++) {
			System.out.println(ht.get(j));
		}

		System.out.println("____________________________________________________");
		// elements() >>>> Enumeration
		// NO iterator()

		Enumeration e = ht.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// entrySet()

		Set s = ht.entrySet();
		System.out.println(s);

		// clone() >> to create copy
		Hashtable<Integer, Integer> ht2 = new Hashtable<Integer, Integer>();

		ht2 = (Hashtable<Integer, Integer>) ht.clone();
		System.out.println("The copied values are " + ht2);

		// checking two hashtables are equal or not
		if (ht.equals(ht2)) {
			System.out.println(" check two hashtables are equal or not?  ");
		}

		ht2.clear();
		System.out.println(" The copied values are cleared??? " + ht2);
	}
}
