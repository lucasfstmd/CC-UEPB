package base;

public class List<T> extends StructureStatic<T>{

    public List(){
        super();
    }
    public List(int size){
        super(size);
    }
    public boolean add(T element){
        return super.add(element);
    }
    public boolean add(int position, T element){
        return super.add(position, element);
    }
}
