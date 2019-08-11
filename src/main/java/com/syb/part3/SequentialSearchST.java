package com.syb.part3;

import lombok.Data;

/**
 * @version : v1.0
 * @Written by :shenyb
 * @Creation Date : 19/8/11 下午7:11
 * @Description :顺序查找（基于链表）
 */
public class SequentialSearchST {
    private Node first;
    public String get(String key){
        if(first==null){
            return null;
        }
        for(Node x = first;x!=null;x = x.next){
            if(x.key.equals(key)){
                return x.value;
            }
        }
        return null;
    }
    public void put(String key,String value){
        for(Node x = first;x!=null;x = x.next){
            if(x.key.equals(key)){
                x.value = value;
                return;
            }
        }
        Node node = new Node();
        node.key = key;
        node.value = value;
        node.next = first;
    }
    @Data
    private class Node{
        Node next;
        String key;
        String value;
    }
}


