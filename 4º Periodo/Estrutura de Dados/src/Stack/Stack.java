package Stack;

import base.StructureStatic;

public class Stack<T> extends StructureStatic<T> {

    public Stack(){
        super();
    }
    public Stack(int size){
        super(size);
    }
    public void stackUp(T element){
        super.add(element);
    }

    public T top(){
        if(this.isEmpty()){
            return null;
        }
        return this.elements[size-1];
    }
    /*
    Metodo top retorna o topo da pilha
     */
    public T unStack(){
        if(this.isEmpty()){
            return null;
        }

        return this.elements[--size];
    }
    /*
    Metodo unStack desempilha a pilha
     */
}
