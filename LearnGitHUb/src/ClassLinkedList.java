
import java.util.Iterator;
import java.util.LinkedList;

public class ClassLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		// add
		list.add("US");
		list.add("UK");
		list.add("INdia");
		// print / iterate
		System.out.println(list);

		System.out.println("print using get()");
		System.out.println(list.get(0));

		list.add(1, "canada");
		System.out.println(list);
		list.set(1, "DC");
		System.out.println(list);

		list.addFirst("firstval");
		list.addLast("lastval");
		System.out.println(list);
		System.out.println(list.getLast());
		System.out.println(list);
		System.out.println("''''''''''''''''''''''''''");

		System.out.println(" for loop################");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Advanced for loop###############");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("using iterator###########()");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("printing using While loop##################");
		int i = 0;
		while (i > list.size()) {
			System.out.println(list.get(i));

		}

		list.remove();
		System.out.println(list);
		System.out.println("''''''''''''''");

		list.remove(2);
		System.out.println(list);

		list.remove();
		System.out.println(list);
	}

}
