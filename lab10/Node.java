public class Node {

	private String name;
	private Node next;
	
	public Node(String n) {
		name = n;
	}
	
	public void add(String s)  {
		
		if (next == null)
			next = new Node(s);
		else
			next.add(s);
		
	}
	
	public int length() {
		if (next == null)
			return 0;
		else{
		    int counter=0;
		    Node nextN=this;
		    while (nextN!=null){
			System.out.println(nextN.name);
			counter+=1;
			nextN=nextN.next;
		    }
		    return counter;
		}}

	public int howMany(String find) {
	    Node temp=this;
	    int count=0;
	    while (temp!=null){
		if (temp.name.equals(find)){
		    System.out.println(temp.name);
			count+=1;
		    }
		temp=temp.next;
		    }
	    return count;

	}
    public void insert(int where, String newString){
	//	System.out.println("where do you need a node?");
	//int x=keyboard.nextInt();
	boolean going=true;
	int count=0;
	Node temp=this;
	while (count!=where){
		temp=this.next;
		count++;
	}
	Node carrier=temp.next;
	temp.next=new Node(newString);
	temp.next.next=carrier;}
	
	
    public String getName(){
	return this.name;}
    public Node getNext(){
	return next;
    }
    public void setNext(Node x){
	this.next=x;}

    public void sortedInsert(String toInsert){

	
	Node temp=this;
	    Node temp2=this.next;
	    while (toInsert.compareTo(temp2.name)>0){
		temp=temp.next;
		temp2=temp2.next;
	    }
	    Node newN=new Node(toInsert);
	    Node car=temp2;
	    temp.next=newN;
	    newN.next=car;
	
    }}
