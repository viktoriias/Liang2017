
public class BST<E extends Comparable<E>> {
	TreeNode<E> root;
	
	public void insert(E e) {
		if (root == null)
			root = new TreeNode<E>(e);
		else {
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null) {
				parent = current;
				if (e.compareTo(parent.element) <= 0)
					current = parent.left;
				else
					current = parent.right;
			}
			if (parent.element.compareTo(e) > 0)
				parent.left = new TreeNode<E>(e);
			else 
				parent.right = new TreeNode<E>(e);
		}
	}
	
	public void inorder() { inorder(root); System.out.println(); }
	
	public void inorder(TreeNode<E> root) {
		if (root == null) return;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}	
	
	public void preorder() { preorder(root); System.out.println(); }
	
	public void preorder(TreeNode<E> root) {
		if (root == null) return;
		System.out.print(root.element + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public void postorder() { postorder(root); System.out.println(); }
	
	public void postorder(TreeNode<E> root) {
		if (root == null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element + " ");
	}

	public static void main(String[] args) {
		BST<Integer> bst = new BST<>();
		bst.insert(4);
		bst.insert(2);
		bst.insert(3);
		bst.insert(1);
		bst.insert(4);
		bst.insert(5);
		bst.inorder();
		bst.postorder();
		bst.preorder();
	}

	static class TreeNode<E> {
		E element;
		TreeNode<E> left;
		TreeNode<E> right;
		
		public TreeNode(E element) {
			this.element = element;
		}
	}
}