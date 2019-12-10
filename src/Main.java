public class Main {

    public static void main(String[] args) {
        //sous arbre gauche
        BinNode<Integer> noued1=new BinNode(1);
        BinNode<Integer> noued2=new BinNode(2);
        BinNode<Integer> noued4=new BinNode(4);
        BinNode<Integer> noued3=new BinNode(3);
        BinNode<Integer> noued5=new BinNode(5);
        BinNode<Integer> noued6=new BinNode(6);
        BinNode<Integer> noued7=new BinNode(7);

        //sous arbre droit
        BinNode<Integer> noued8=new BinNode(8);
        BinNode<Integer> noued9=new BinNode(9);
        BinNode<Integer> noued13=new BinNode(13);
        BinNode<Integer> noued10=new BinNode(10);
        BinNode<Integer> noued14=new BinNode(14);
        BinNode<Integer> noued15=new BinNode(15);
        BinNode<Integer> noued11=new BinNode(11);
        BinNode<Integer> noued12=new BinNode(12);

        //définition des fils du sous arbre gauche
        noued1.setLeftChild(noued2);
        noued1.setRightChild(noued4);
        noued2.setLeftChild(noued3);
        noued4.setLeftChild(noued5);
        noued4.setRightChild(noued6);
        noued6.setRightChild(noued7);

        //définition des fils du sous arbre droite
        noued8.setLeftChild(noued9);
        noued8.setRightChild(noued13);
        noued9.setRightChild(noued10);
        noued10.setLeftChild(noued11);
        noued10.setRightChild(noued12);
        noued13.setLeftChild(noued14);
        noued13.setRightChild(noued15);

        //construction de l'arbre
        LinkedTree<Integer> arbre=new LinkedTree(noued1, 0, noued8);
        //Parcours en largeur
        System.out.println(arbre.toString());
        //calcul de la taille de l'arbre
        System.out.println(arbre.getSize());
        //calcul du nombre de feuille
        System.out.println(arbre.getCountLeaf());
    }
}
