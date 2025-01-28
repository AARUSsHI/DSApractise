package Day04.BST;

public class BinarySearchTree {
    private TreeNode root;

    private static class TreeNode{
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
        if(value < root.data){
            root.left = insert(root.left, value);
        } else{
            root.right = insert(root.right, value);
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

    public TreeNode search(int value){
        return search(root, value);
    }

    public TreeNode search(TreeNode root, int value){
        if(root == null || root.data == value){
            return root;
        }
        if(value < root.data){
            return search(root.left, value);
        }else{
            return search(root.right, value);
        }
    }

    public boolean isValid(TreeNode root){
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data >= max){
            return false;
        }
        boolean left = isValid(root.left, min, root.data);
        if(left){
            boolean right = isValid(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(7);
        bst.insert(3);
        bst.insert(2);
        bst.insert(6);

        bst.inOrder();
        System.out.println();

        if(bst.search(5) != null){
            System.out.println("value found");
        }else{
            System.out.println("value not found");
        }

        if (bst.isValid(bst.root)) {
            System.out.println("Valid Binary Search Tree!!");
        } else {
            System.out.println("Invalid Binary Search Tree!!");
        }
    }
}
