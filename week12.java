package com.example.demo3;

import java.util.LinkedList;
import java.util.List;

public class week12 {
        public static void main(String[] args) {

        }
    }
    class MyLinkedList<E> {

        private List<E> list;

        public MyLinkedList() {
            list = new LinkedList<>();
        }

        public boolean contains(E e) {
            return list.contains(e);
        }

        public E  get(int index) {
            return list.get(index);
        }
        public int indexOf(E e) {
            return list.indexOf(e);
        }
        public int lastIndexOf(E e) {
            return list.lastIndexOf(e);
        }
        public E set(int index, E e) {
            return list.set(index, e);
        }


    }

