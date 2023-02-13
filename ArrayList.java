package Datastructure;

import java.util.Arrays;

public class ArrayList {
    private static final int DEFAULT_CAPACITY=5;
    int [] array;

    private static int size =0;

    public ArrayList(){
        array = new int[DEFAULT_CAPACITY];
    }

    public void insert(int num){

        if(array.length-size <= 5){
            increaseListSize();
        }
        array[size++] = num;

    }
    public void delete(int index){
        for (int i = index; i < size ; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public void increaseListSize(){
       //array = Arrays.copyOf(array,array.length+5);
       int[] newarray =new int[array.length+5];
        for (int i = 0; i < size; i++) {
          newarray[i]=   array[i];
        }
        array=newarray;
    }


    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.insert(1);
        al.insert(2);
        al.insert(3);
        al.insert(4);
        al.insert(5);
        al.insert(6);
        al.print();
        al.delete(2);
        al.print();
    }
}

