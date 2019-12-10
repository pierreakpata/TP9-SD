import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class BreadthFirstIterator<T> implements Iterator<BinNode<T>> {

    private Deque<BinNode<T>> file;
    private BinNode<T> currentNode;

    public BreadthFirstIterator(BinNode<T> rootNode){
        this.file=new ArrayDeque<>();
        this.file.offer(rootNode);
    }

    @Override
    public boolean hasNext() {
        return (file.isEmpty()) ? false : true;
    }

    @Override
    public BinNode<T> next() {
        currentNode=file.poll();
        if(currentNode.getLeftChild()!=null){
            file.offer(currentNode.getLeftChild());
        }
        if(currentNode.getRightChild()!=null){
            file.offer(currentNode.getRightChild());
        }
        return currentNode;
    }
}
