package java;

import java.util.ArrayList;

class Array {
    private ArrayList<Integer> array = new ArrayList<>();

    public boolean adicionarElemento(int elemento) {
        if(array.add(elemento))
            return true;
        return false;
    }
    
    public void mostrar() {
        for(int i: array) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Array arr = new Array();

        if(arr.adicionarElemento(5))
            System.out.println("elemento adicionado ao final do array");
        arr.mostrar();

    
    }
}