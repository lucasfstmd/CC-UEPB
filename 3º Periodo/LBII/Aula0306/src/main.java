public class main {
    public static void main(String[] args) {
        Assalariado escravo1 = new Assalariado();
        Assalariado escravo2 = new Assalariado("Jose", "sobrenome", "AS0001", 400);
        Comissionado filhoCap = new Comissionado("Maria", "Jose", "CO0001", 50000D, 0.01);
        Empregado emp01 = new Comissionado("Toin", "Araujo", "CO0002", 30000, 0.03);

        System.out.println("Listagem dos empregados:");

        Empregado vetEmpregado[] = new Empregado[4];

        vetEmpregado[0] = escravo1;
        vetEmpregado[1] = escravo2;
        vetEmpregado[2] = filhoCap;
        vetEmpregado[3] = emp01;

        for(Empregado lista : vetEmpregado){
            System.out.println(lista);
            System.out.printf("Vencimentos: R$ %.2f\n", lista.vencimentos());
            /*if(lista instanceof Comissionado){
                Comissionado temp = (Comissionado) lista;
                temp.setTxComissao(0.15);
                System.out.printf("Comissao com 15%%: R$ %.2f\n", lista.vencimentos());
            }*/
        }
    }
}
