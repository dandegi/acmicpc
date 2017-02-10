import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


class TreeNode<T> implements Iterable<TreeNode<T>> {
	private T data;
	private TreeNode<T> parent;
	private List<TreeNode<T>> children;
	
	public TreeNode(T data) {
		this.data = data;
		this.children = new LinkedList<TreeNode<T>>();
	}
	
	public TreeNode<T> addChild(T child) {
		TreeNode<T> childNode = new TreeNode<T>(child);
		childNode.parent = this;
		this.children.add(childNode);
		return childNode;
	}

	@Override
	public Iterator<TreeNode<T>> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

public class Main {
	
	public static void main(String[] args) throws IOException {
		TreeNode<String> root = new TreeNode<String> ("root");
		{
			TreeNode<String> node1 = root.addChild("node1");
			TreeNode<String> node2 = root.addChild("node2");
			TreeNode<String> node3 = root.addChild("node3");
			{
				TreeNode<String> node4 = root.addChild("node4");
				TreeNode<String> node5 = root.addChild("node5");
				{
					TreeNode<String> node6 = root.addChild("node6");
				}
			}
		}
		
	}
}