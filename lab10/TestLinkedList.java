
public class TestLinkedList {

	public static void main(String[] args) {
		new TestLinkedList().go();

	}

	private void go() {
		
		List l = new List();
		l.add("One");
		l.add("Two");
		l.add("One");
		
		System.out.println("Length should be 3 "+l.length());
		System.out.println("How many One should be 2 "+l.howMany("One"));
		System.out.println("How many Three should be 0 "+l.howMany("Three"));
		//	l.insertNth(2,"Hugo");

			l.addFile("TestData.dat");
		System.out.println("How many One should be 14 "+l.howMany("One"));
		//	l.length();
		//	System.out.println(""+l.length());
		l.sortedInsert("P");
	       	l=l.insertSort();
		l.length();
		
		/*		l.insertNth(2,"mohammed");
		System.out.println(l.howMany("mohammed"));
		l.insertNth(3,"rager");
		System.out.println(l.howMany("rager"));
		//	System.out.println("new Length" + l.length());
		/*	l.sortedInsert("i");
			l.length();*/
		
	}

}
