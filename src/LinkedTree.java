
public class LinkedTree<T> implements Tree<T>{

    private BinNode<T> rootNode;

    public LinkedTree(){
        this.rootNode=new BinNode();
    }

    public LinkedTree(T root){
        this.rootNode=new BinNode();
        this.rootNode.setRoot(root);
    }

    public LinkedTree(BinNode<T> leftChild, T racine, BinNode<T> rightChild){
        this.rootNode=new BinNode(racine, leftChild, rightChild);
    }

    @Override
    public boolean isEmpty() {
        return  (rootNode==null)? true:false;
    }

    @Override
    public T root() {
        return rootNode.getRoot();
    }

    @Override
    public Tree<T> leftSubTree() {
        return new LinkedTree(rootNode.getLeftChild());
    }

    @Override
    public Tree<T> rightSubTree() {
        return new LinkedTree(rootNode.getRightChild());
    }
}
