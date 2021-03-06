import java.util.ArrayList;

public class Node {
	public ArrayList<Node> list = new ArrayList<>();
	public int degree;
	public int id;

	public Node (int i) {
		id = i;
		degree = 0;
	}

	public void addNeighbor(Node x) {
		list.add(x);
		degree++;
	}

	public void removeNeighbor(int x) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).id == x) {
                list.remove(i);
                break;
            }
        }
		degree--;
        
	}

	public void removeAllNeighbors() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).removeNeighbor(id);
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
