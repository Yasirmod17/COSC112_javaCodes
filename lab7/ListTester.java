import java.io.*;
import java.util.Vector;

public class ListTester {

    public static void main(String args[]) throws IOException {

	ListTester lt = new ListTester();
	
	//args[0] is the first thing typed after the name of the program, e.g.
	// if you type:
	//java ListTester testFile.dat
	// args[0] will contain the String testFile.dat
	//
	
	if (args.length < 1) {
	    System.out.println("you need to enter a file name, e.g. ");
	    System.out.println("java ListTester testFile.dat");
	    System.exit(1);
	}

	//	lt.readFromFileExample(args[0]);
	
	      	lt.go(args[0]);
	
    }
    
    public void readFromFileExample(String fileName) throws IOException {
	
	// A FileReader allows you to read characters one-by-one from a file
	// The character is read as an int and you can then cast it to a char
	// the read() method will return -1 at the end of the file
	//
	
	FileReader fr = new FileReader(fileName); // for reading character by character
	Vector<Character> chars = new Vector<Character>();
	
	
	
	// read all chars from file, put into Vector
	
	boolean done = false;
	
	while (!done) {
	    int readFromFile = fr.read();
	    if (readFromFile != -1) {
		char ch = (char) readFromFile;
		chars.addElement(ch);
	    }
	    else done = true;
	}
	
	// copy all chars from Vector into list
	
	//	ListInterface allChars = new CS112List();
		ListInterface allChars=new MyList();
	
	for (int i=0; i< chars.size(); i++) {
	    char ch1 = chars.elementAt(i);
	    allChars.addElement(ch1);
	}
	
	
	allChars.printList();
	allChars.reverseList();
	allChars.printList();
	allChars.addElement('m');
	allChars.reverseList();
	
	System.out.println("There are "+allChars.count('a')+" small as in the list");
    }

    public void go(String filename) throws IOException {

	//	ListInterface list=new CS112List();
	ListInterface list=new MyList();
       	FileReader fr = new FileReader(filename);
	boolean done = false;
	
	while (!done) {
	    int readFromFile = fr.read();
	    if (readFromFile != -1) {
		char ch = (char) readFromFile;
		list.addElement(ch);
	    }
	    else done = true;
    }
	list.printList();
	list.reverseList();
	list.printList();
	list.addElement('m');
	list.printList();
	list.reverseList();
	list.printList();
	list.reverseList();
	list.printList();

	

	for (char c='A';c<='Z';c++){
	     if (list.count(c)!=0){
		System.out.println("There are "+list.count(c)+" capital "+ c+"'s in the list");}
      
	}
	for (char c='a'; c<='z';c++){
	     if (list.count(c)!=0){
	    	System.out.println("There are "+list.count(c)+" small "+ c+"'s in the list");}
	}
	    
	    
	
	/*	char[] alpha={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	char[] smallAlpha={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int i=0;
	while (i<alpha.length){
	    if (list.count(alpha[i])!=0){
		System.out.println("There are "+list.count(alpha[i])+" capital "+ alpha[i]+"'s in the list");}
	    i++;
	}
	int j=0;
	while (j<smallAlpha.length){
	    if (list.count(smallAlpha[j])!=0){
	    	System.out.println("There are "+list.count(smallAlpha[j])+" small "+ smallAlpha[j]+"'s in the list");}
		j++;
	}
	*/    
    }
    
}
