
public class node {
	int data;
	node start, left, mid, right;

	public void insert(node temp) {
		if (this.data > temp.data && left == null) {
			left = temp;
		}
		if (this.data < temp.data && right == null) {
			right = temp;
		}

		if (this.data > temp.left.data && mid == null) {
			mid = temp;
		}

		else if (this.data > temp.data){
			left.insert(temp);	
		}
		
		else if (this.data < temp.data) {
			right.insert(temp);
		}

	}

	public String preOrderTraversal() {
		// TODO Auto-generated method stub

		String s = "";
		s = s + this.data;

		if (this.left != null) {
			s = s + ", " + this.left.preOrderTraversal();
		}
		if (this.mid != null) {
			s = s + ", " + this.mid.preOrderTraversal();
		}
		if (this.right != null) {
			s = s + ", " + this.right.preOrderTraversal();
		}

		return s;
	}

}
