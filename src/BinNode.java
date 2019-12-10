
public class BinNode<T> {
    private T root;
    private BinNode<T> leftChild;
    private BinNode<T> rightChild;

    public BinNode(){
        this.root=null;
        this.leftChild=null;
        this.rightChild=null;
    }

    public BinNode(T root){
        this.root=root;
        this.leftChild=null;
        this.rightChild=null;
    }


    public T getRoot() {
        return root;
    }

    public void setRoot(T root) {
        this.root = root;
    }

    public BinNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BinNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinNode<T> rightChild) {
        this.rightChild = rightChild;
    }
}
