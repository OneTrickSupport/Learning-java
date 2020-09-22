package Labb2;

import java.util.ArrayList;
import java.util.Iterator;

public class BST<E extends Comparable<E>> implements Iterable<E> {
    private TreeNode<E> root;
    int size = 0;

    public int getSize() {
        return size;
    }


    public TreeNode<E> getRoot() {
        return root;
    }

    public void add(E e) {
        if(root == null) {
            root = new TreeNode<E>(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if(e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                }
                else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<E>(e);
            }
            else {
                parent.right = new TreeNode<E>(e);
            }
        }size++;
    }

    public void remove(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        TreeNode<E> nu = new TreeNode<>(e);
        while (current != null) {
            if (nu.element.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (nu.element.compareTo(current.element) > 0) {
                parent = current;
                current = parent.right;
            } else {
                break;
            }
        }
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                if (nu.element.compareTo(parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        }

        else {
            TreeNode<E> parentOfRight = current;
            TreeNode<E> rightMost = current.left;
            while(rightMost.right != null) {
                parentOfRight = rightMost;
                rightMost = rightMost.right;
            }
            current.element = rightMost.element;
            if(parentOfRight.right == rightMost) {
                parentOfRight.right = rightMost.left;
            } else {
                parentOfRight.left = rightMost.left;
            }
        }
        size--;
    }

    public boolean find(E e){
        TreeNode<E> current = root;

        while (current != null){
            if(e.compareTo(current.element) < 0){
                current = current.left;
            }
            else if(e.compareTo(current.element) > 0){
                current = current.right;
            }
            else {return true;}
        }return false;
    }

    public E max(){
        TreeNode<E> current = root;
        if(current==null)return null;
        while(current != null){
            if(current.left == null){
                break;
            }
            current = current.left;
        }return current.element;
    }

    public E min(){
        TreeNode<E> current = root;
        if (current==null)return null;
        while(current != null){
            if(current.right == null){
                break;
            }
            current = current.right;
        }return current.element;
    }

















    @Override
    public Iterator<E> iterator() {
        return new BSTIterator();
    }
    private class BSTIterator implements Iterator<E>{
        private ArrayList<E> list = new ArrayList<>();
        private int current = 0;
        public BSTIterator(){
            inorder();
        }
        private void inorder(){
            inorder(root);
        }
        private void inorder(TreeNode<E> root){
            if(root == null)return;
            inorder(root.left);
            //list.add(root.element);
            System.out.println(root.element);
            inorder(root.right);
        }


        @Override
        public boolean hasNext() {
            if(current < list.size()){
                return true;
            }

            return false;
        }

        @Override
        public E next() {
            return list.get(current++);
        }
    }
}
