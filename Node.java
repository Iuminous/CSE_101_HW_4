import java.util.Arraylist;

public class Node {
	public ArrayList<Node> list = new Arraylist<>;
	public int degree;
	public int id;

	public Node (int i) {
		id = i;
		degree = 0;
	}

	public void addNeighbor(Node x) {
		add(x);
		degree++;
	}

	public void removeNeighbor(int x) {
		int index = list.indexOf(Integer.toString(x));
		list.remove(index);
		degree--;
	}

	public void removeAllNeighbors() {
		for (int i = 0; i < list.size(); i++) {
			list[i].removeNeighbor(id);
			list.remove(i);
		}
		degree = 0;
	}

	public void printNode() {
		System.out.println(id);
	}

	public void printNeighbors() {
		for (int i = 0; i < list.size(); i++) {
			printNode();
			System.out.print(" ");
		}
	}
}