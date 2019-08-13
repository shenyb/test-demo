package com.syb.part3;

/**
 * @version : v1.0
 * @Written by :shenyb
 * @Creation Date : 19/8/11 下午9:40
 * @Description : 二叉查找树的实现查找和插入，对应算法3.3
 */
public class BST<Key extends Comparable,Value> {
    private Node root;
    private class Node{
        private Key key;
        private Value value;
        private Node left,right;
        private  int N;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }
    public Value get(Key key){
        return get(key,root);
    }

    private Value get(Key key, Node root) {
        if(root==null){return null;}
        int compare = root.key.compareTo(key);
        if(compare==0){
            return root.value;
        }
        if(compare>0){
            return get(key,root.left);
        }else{
            return get(key,root.right);
        }
    }

    public Node put(Node root,Key key,Value value){
        if(root == null){return new Node(key,value);}
        int compare = root.key.compareTo(key);
        if(compare==0){
            root.value = value;
        }else if(compare>0){
            Node r = put(root.left,key,value);
            if(r!=null){
                root.left = r;
            }
        }else {
            Node r = put(root.right,key,value);
            if(r!=null){
                root.right = r;
            }
        }
        return null;

    }
    public int size(){
        return root.N;
    }
    // max,min,floor,ceiling,select,rank,delete,deleteMin,deleteMax,keys

    public Value getMin(){
        if(root == null){return null;}
        Node min = root;
        while(min.left!=null){
            min = min.left;
        }
        return min.value;
    }
    public Value getMax(){
        if(root == null){return null;}
        Node min = root;
        while(min.right!=null){
            min = min.right;
        }
        return min.value;
    }
}
