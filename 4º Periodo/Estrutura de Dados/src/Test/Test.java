package Test;

import Stack.Stack;

public class Test {

    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("A pilha esta vazia?");
        System.out.println(stack.isEmpty());

        for(int i = 1; i<=11; i++){
            stack.stackUp(i);
        }
        System.out.println("Conteudo da pilha: ");
        System.out.println(stack);
        System.out.println("A pilha esta vazia?");
        System.out.println(stack.isEmpty());
        System.out.println("Tamanho da pilha");
        System.out.println(stack.getSize());
        System.out.println("Topo da pilha");
        System.out.println(stack.top());
        System.out.println("Desempilhandando elemento " + stack.unStack());
        System.out.println(stack);

    }
}
