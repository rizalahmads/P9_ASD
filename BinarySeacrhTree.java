public class BinarySeacrhTree {

    class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }

    }

    // Root of BST
    Node root;

    public BinarySeacrhTree() {
        root = null;
    }

    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;

    }

    public void insert(int value) {
        root = insert(root, value);
    }

    // Traversal tree (baca tree) dengan inorder
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);

        }
    }

    public void inorder() {
        if (root == null) {
            System.out.print("BST Empty");
        } else {
            inorder(root);
        }
    }

    // Traversal tree (baca tree) dengan preorder
    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void preorder() {
        if (root == null) {
            System.out.print("BST Empty");
        } else {
            preorder(root);
        }
    }

    // Traversal tree (baca tree) dengan postorder
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }
    }

    public void postorder() {
        if (root == null) {
            System.out.print("BST Empty");
        } else {
            postorder(root);
        }
    }

    // delete node
    public Node delete(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.value) {
            root.left = delete(root.left, value);
        } else if (value > root.value) {
            root.right = delete(root.right, value);
        } else {
            // 1 anak
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // 2 anak (cari nilai terkecil di subtree kanan)
            root.value = findMinimum(root.right);

            root.right = delete(root.right, root.value);

        }
        return root;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    public int findMinimum(Node root) {
        int min = root.value;
        while (root.left != null) {
            min = root.left.value;
            root = root.left;
        }
        return min;
    }

    public void getRoot() {
        System.out.println("Root: " + root.value);
    }

}
