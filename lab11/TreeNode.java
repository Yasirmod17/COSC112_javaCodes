public class TreeNode {

    private int p;

    private TreeNode right, left, parent;
    public int rightD=0;
    public int leftD=0;
    
    public String toString() {
	return "A TreeNode containg "+p;
    }


    public TreeNode(int p){
	this.p = p;
    }

    public void setParent(TreeNode p) {
	parent = p;
    }

    public void add(int newP) {
		
	if (p  == newP)
	    return;
	if (p  < newP) {
	    if (right == null) {
		right = new TreeNode(newP);
		right.parent = this;
		return;
	    }
	    else {
		right.add(newP);
	    }
	}
	else {
	    if (left ==null) {
		left = new TreeNode(newP);
		left.parent = this;
		return;
	    }
	    else {
		left.add(newP);
	    }
	}
    }

    public boolean find(int findThis) {
		
	if (p == findThis)
	    return true;
	if (findThis>p){
	    if (right != null && right.find(findThis))
	    return true;}
	else{	
	    if (left != null && left.find(findThis))
		return true;}
	return false;
    }

    public void inOrdertraversal(String inFront) {
       	if (left!=null)
	   
	    left.inOrdertraversal(inFront+" ");
	 System.out.println(inFront+p);
	if (right!=null)
	    right.inOrdertraversal(inFront+" ");
	
		
    }

    public TreeNode smallest() {
	if (this.left == null)
	    return this;
	else return this.left.smallest();
    }
    
    public int depth() {
	if (left!=null){
	    leftD=left.depth()+1;}
	if (right!=null){
	    rightD=right.depth()+1;}
	if (rightD>leftD){
	    
	    return rightD;}
	else{
	    return leftD;}
    }

    public TreeNode ancestorLarger(int child) {
	if (p > child)
	    return this;
	else if (parent == null)
	    return null;
	else return parent.ancestorLarger(child);
    }

    public TreeNode findNext() {
	if (right == null) 
	    if (parent == null)
		return null;
	    else
		return parent.ancestorLarger(p);
    
    else{
	return right.smallest();}

	 
    }
    public boolean balanced(){
	if (this.right==null && this.left==null){
	    return true;
	}
	else if(this..depth==1){
	    return true;}
	else{
	    



}




