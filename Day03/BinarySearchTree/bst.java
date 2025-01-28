package Day03.BinarySearchTree;

public class bst {
    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void insert(int value){
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value > root.data){
            root.right = insert(root.right, value);
        }
        if(value < root.data){
            root.left = insert(root.left, value);
        }
        return root;
    }

    public void inOrder(){
        inOrder(root);
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        bst b = new bst();
        b.insert(5);
        b.insert(3);
        b.insert(7);
        b.insert(1);

        b.inOrder();
    }
}
