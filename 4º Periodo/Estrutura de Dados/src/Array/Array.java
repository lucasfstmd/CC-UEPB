package Array;

import java.util.Arrays;

public class Array {

    private String[] elements;
    private int size;

    public Array(int size){
        this.elements = new String[size];
        this.size = 0;
    }

    public void add(String element) throws Exception{
        if(this.size < this.elements.length){

        this.elements[this.size] = element;
        this.size++;
        }else{
            throw new Exception("This Array exception size, nothing is possible add new elements.");
        }
    }

    public void add(String element, int indice)throws Exception{
        if(this.size < this.elements.length){
            this.elements[indice] = element;
            this.size++;
        }else{
            throw new Exception("This Array exception size, nothing is possible add new element.");
        }
    }

    public boolean find(String element){
        for(int i = 0; i < this.size; i++){
            if(this.elements[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public String find(int indice){
        if(!(indice >= 0 && indice < this.size)){
            throw new IllegalArgumentException("Invalible indice");
        }

        return this.elements[indice];
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < this.size-1; i++){
            s.append(this.elements[i]);
            s.append(", ");
        }
        if(this.size>0){
            s.append(this.elements[this.size-1]);
        }
        s.append("]");

        return s.toString();
    }

}
