
public class UseQueue {
    //Authors :Mohammed Ibrahim and Harrison Marick

	
public static void main(String[] args) {
		
		CS112Queue myQ = new CS112Queue();
		
		myQ.add(1);
		myQ.writeArray();

		myQ.add(2);
		myQ.writeArray();

		myQ.add(7);
		myQ.writeArray();

		myQ.add(18);
		myQ.writeArray();
		myQ.remove();
		myQ.writeArray();
		myQ.remove();
		myQ.writeArray();
		//	myQ.shiftBack();
		//	myQ.writeArray();
		//myQ.writeQueue();
		// this will throw an exception
		myQ.add(9);
		myQ.writeArray();
		myQ.add(10);
		myQ.writeArray();
		myQ.add(99);
		myQ.writeArray();
	
	}


}
