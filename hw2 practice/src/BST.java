
public class BST {
	
	node start;

	public void insert(int i) {
		// TODO Auto-generated method stub
		node temp = new node();
		temp.data = i;

		if (start == null) {
			start = temp;
		} else {
			start.insert(temp);
		}
		
	}
	
	public void preOrderTraversal() {

		if (start == null) {
			System.out.println("The tree is null");
		} else {
			System.out.println(start.preOrderTraversal());
		}

	}

}
