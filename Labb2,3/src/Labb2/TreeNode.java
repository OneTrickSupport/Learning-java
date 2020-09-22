package Labb2;

public class TreeNode<E extends Comparable<E>>  {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E e){
        element = e;
    }

  /*  public void addNode(TreeNode<E> t) {
        if(t.element.compareTo(element) < 0) {
            if (left == null) {
                left = t;
            } else {
                left.addNode(t);
            }
        } else if(t.element.compareTo(element) > 0) {
            if(right == null) {
                right = t;
            } else {
                right.addNode(t);
            }
        }
    }*/

   /* private TreeNode findRecursive(TreeNode<E> t) {
        if(t == null) {
            return null;
        } else if(t.element.equals(this.element)) {
            return t;
        } else if (t.element.compareTo(this.element) > 0) {
            return findRecursive(t.left);
        } else { // (t.data.compareTo(s) < 0)
            return findRecursive(t.right);
        }
    }
        public boolean findRecursive() {
            if (findRecursive(TreeNode<E>) != null)
            }
        }*/





}
