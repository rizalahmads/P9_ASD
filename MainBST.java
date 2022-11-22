public class MainBST {
    public static void main(String[] args) {
        BinarySeacrhTree bst = new BinarySeacrhTree();

        // Inserting nodes atau menambahkan node
        bst.insert(5);
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);

        // Traversal tree atau baca tree
        System.out.print("Inorder: ");
        bst.inorder();
        System.out.print("Preorder: ");
        bst.preorder();
        System.out.println("Postorder: ");
        bst.postorder();

        System.out.println("Delete 5");
        bst.delete(5);
        bst.inorder();
        bst.getRoot();

        System.out.println("Delete 6");
        bst.delete(6);
        bst.getRoot();
    }
}
