
public class LinkedTree<T> implements Tree<T>{

    private BinNode<T> rootNode;

    public LinkedTree(){
        this.rootNode=new BinNode();
    }

    public LinkedTree(T root){
        this.rootNode=new BinNode(root);
    }

    public LinkedTree(BinNode<T> leftChild, T racine, BinNode<T> rightChild){
        this.rootNode=new BinNode(racine);
        this.rootNode.setLeftChild(leftChild);
        this.rootNode.setRightChild(rightChild);
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

    @Override
    public String toString(){
        StringBuffer liste=new StringBuffer();
        liste.append("[");
        BreadthFirstIterator<T> iterator=new BreadthFirstIterator(rootNode);
        while(iterator.hasNext()){
            liste.append(iterator.next().getRoot());
            if(iterator.hasNext())
                liste.append(", ");
        }
        liste.append("]");
        return liste.toString();
    }

    public int getSize(){
        int count=0;
        BreadthFirstIterator<T> iterator=new BreadthFirstIterator(rootNode);
        while(iterator.hasNext()){
            BinNode<T> temp=iterator.next();
            if(temp.getLeftChild()!=null || temp.getRightChild()!=null){
                count ++;
            }
        }
        return count;
    }

    public int getCountLeaf(){
        int count=0;
        BreadthFirstIterator<T> iterator=new BreadthFirstIterator(rootNode);
        while(iterator.hasNext()){
            BinNode<T> temp=iterator.next();
            if(temp.getLeftChild()==null && temp.getRightChild()==null){
                count ++;
            }
        }
        return count;
    }

}
