import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Delhi");
		hm.put(1, "Mumbai");
		hm.put(38, "Hyderabad"); // no duplicates. this value wont be there
		hm.put(38, "Hyderabad");
		hm.put(24, "Hyderabad");
		hm.put(53, "Bangalore");
		hm.put(null, "Jaipur"); // inserted the value .. key is null
		hm.put(3, null); // multiple null values
		hm.put(76, null);
		hm.put(21, null);

		System.out.println(hm);
		System.out.println(hm.get(null));
		hm.put(53, "wwewe");

		System.out.println(hm);
		System.out.println(hm.get(53));
		System.out.println(hm.get(10));

		System.out.println(hm.get(38));
		hm.remove(38);

		// -entrySet() >> Set Interface

		System.out.println("the values added are");

		Set s = hm.entrySet();
		Iterator it = s.iterator();

		// Display elements
		while (it.hasNext()) {

			Map.Entry m = (Map.Entry) it.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}

		System.out.println();

		// Entry Map m
		System.out.println("the values added are");
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}

		System.out.println(hm.size());
	}

}
