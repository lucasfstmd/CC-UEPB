package base;

/*
@autor: Lucas Fausto Medeiros

Classe Structure Static é uma casse generica usada para reaproveitamento de codigo
com os metodos que serão usados em Estrutura de Dados.
 */
public class StructureStatic<T> {
    protected T[] elements;
    /*
    T[] - Argumento do tipo generico, ou seja pode assumir qualquer valor.
     */
    protected int size;

    protected StructureStatic(int size){
        this.elements = (T[]) new Object[size];
        this.size = 0;
    }
    /*
    Construtor passando o tamanho
     */
    protected StructureStatic(){
        this(10);
    }
    /*
    Quando criado objeto Stack com contrutor vazio, o tamanho é definido como 10;
     */
    protected void moreCapacity(){
        if(this.size == this.elements.length){
            T[] newElements = (T[]) new Object[this.elements.length * 2];
            for(int i = 0; i<this.elements.length; i++){
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }
    /*
    Metodo moreCapacity aumenta a capacidade da estrutura ao inserir um novo elemento
     */
    protected boolean add(T element){
        this.moreCapacity();
        if(this.size < this.elements.length){
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }
    /*
    Metodo add adiciona ao topo da estrutura, passando como argumento o elemento a ser inserido
     */
    protected boolean add(int position, T element){
        if(!(position >= 0 || position < this.size)){
            throw new IllegalArgumentException("Position invalide");
        }
        this.moreCapacity();

        //move all elements
        for(int i = this.size-1; i > position; i++){
            this.elements[i+1] = this.elements[i];
        }
        this.elements[position] = element;
        this.size++;

        return true;
    }
    /*
    Metodo add adiciona ao topo da estrutura, passando como argumento o elemento e a posicção
    a ser inserido
     */
    public int getSize(){
        return this.size;
    }
    /*
    Metodo getSize que retorna o tamanho da estrutura
     */
    public boolean isEmpty(){
        return size == 0;
    }
    /*
    metodo isEmpty que retorna se a estrutura esta vazia
     */
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
    /*
    Metodo toString que retorna o conteudo da estrutura
     */
}
