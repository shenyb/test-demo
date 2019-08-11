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
    }
    public Value get(Key key){
        return null;

    }
    public void put(Key key,Value value){

    }
    public int size(){
        return root.N;
    }
    // max,min,floor,ceiling,select,rank,delete,deleteMin,deleteMax,keys


}
