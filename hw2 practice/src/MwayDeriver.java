import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MwayDeriver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		BST mytree;

		mytree = new BST();

		Scanner sc = new Scanner(new File("tree.dat"));
		while (sc.hasNext()) {
			mytree.insert(Integer.parseInt(sc.next()));

		}
		mytree.preOrderTraversal();

	}	

}
