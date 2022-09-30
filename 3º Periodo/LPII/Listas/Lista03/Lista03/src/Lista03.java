/* QUESTAO 01 */ 
/*




public class Lista03 {

    public static int numero(int x){

        if(x % 2 == 0){
            return 1;
        }else{
            return 0;
        }

    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int x, y;

        System.out.println("Digite X: ");
        x = scan.nextInt();

        y = numero(x); 

        System.out.println(y);
               

    }
}
*/


/* QUESTÃO 02 */
/*
public class Lista03{

    public static Scanner scan = new Scanner(System.in);

    public static float Media(){

        float x, y, z, valor_media = 0;
        String opcao;

        System.out.println("Digite a primeria nota: ");
        x = scan.nextFloat();

        System.out.println("Digite a segunda nota: ");
        y = scan.nextFloat();

        System.out.println("Digite a terceira nota: ");
        z = scan.nextFloat();

        System.out.println("Digite a opcao de media: ");
        opcao = scan.next();

        if (opcao.equalsIgnoreCase("a")){
            valor_mediamedia = (x + y + z)/3;

        }else if(opcao.equalsIgnoreCase("p")){
            valor_media = ((x * 5) + (y * 3) + (z * 2)) / 10;
        
        }
        
        return valor_media;

    }   
    public static void main(String[] args) {
        
        float media;
        
        media = Media();

        System.out.format("A media foi: %.1f", media);
    }
}
*/

/*QUESTÃO 03 */
/*
public class Lista03{

    public static Scanner scan = new Scanner(System.in);

    public static void triangulo(double x, double y, double z){
    
        if (x < y + z && y < x + z && z < x + y){
            if (y == x && x == z){
                System.out.println("Triangulo Equilatero.");
            }else if(x == y || x == z || y == z){
                System.out.println("Triangulo isorceles.");
            }else{
                System.out.println("Triangulo Escaleno.");
            } 
        }else{
            System.out.println("Nao e triangulo.");
        }
    }

    public static void main(String[] args) {
        
        double ladoA, ladoB, ladoC;

        System.out.printf("\nDigite o lado A: ");
        ladoA = scan.nextDouble();

        System.out.printf("Digite o lado B: ");
        ladoB = scan.nextDouble();

        System.out.printf("Digite o lado C: ");
        ladoC = scan.nextDouble();

        triangulo(ladoA, ladoB, ladoC);
    }
}
*/

/*QUESTAO 04 */

/*
public class Lista03{

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        String S1, S2;
        
        System.out.print("Digite uma string: ");
        S1 = scan.next();
        
    
        System.out.print("Digite uma nova string: ");
        S2 = scan.next();
                    
        if (S1.equalsIgnoreCase(S2)){
            System.out.println("Strings Iguais.");
        }else{
            String S3 = S1 + " " + S2;

            System.out.format("String resultante: %s", S3);
        }
    }
}
*/

/*QUESTAO 05 */
/*
public class Lista03{

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        String escolha;

        System.out.print("[A] para ler uma string 1.\n[B] para imprimir o tamanho da string 1.\n[C] para adicionar uma nova string e, comparar com a string 1.\n[D] para concatenar a string 1 com a string 2.\n[E] para imprimir a string 1 inversa.\n");
        System.out.println("Escolha: ");
        escolha = scan.next();

        escolha = escolha.toUpperCase();

            switch(escolha){
                case "A":{
                    String S1;
                    System.out.print("Digite uma string: ");
                    S1 = scan.next();
                    while(S1.length() > 20){
                        System.out.print("Digite uma string de ate 20 caracteries: ");
                        S1 = scan.next();
                    }
                }break;
                case "B":{
                    tamanhoStr();
                }break; 
                case "C":{
                    comparaStr();
                }break;
                case "D":{
                    concatenarStr();
                }break;
                case "E":{
                    inversaStr();
                }break;
            }
    
    }
    public static void tamanhoStr(){
        String S1;
        
        System.out.print("Digite uma string: ");
        S1 = scan.next();
        while(S1.length() > 20){
            System.out.print("Digite uma string de ate 20 caracteries: ");
            S1 = scan.next();}
        System.out.format("O tamanho de S1 é: " + S1.length());
    }       
    public static void comparaStr(){
        String S1, S2;
        
        System.out.print("Digite uma string: ");
        S1 = scan.next();
        while(S1.length() > 20){
            System.out.print("Digite uma string de ate 20 caracteries: ");
            S1 = scan.next();}
        System.out.print("Digite uma nova string: ");
        S2 = scan.next();
        if (S1.equalsIgnoreCase(S2)){
            System.out.println("Strings Iguais.");
        }else{
            System.out.println("Strings Diferentes.");
        }        
    }
    public static void concatenarStr(){
        String S1, S2, S3;
        
        System.out.print("Digite uma string: ");
        S1 = scan.next();
        while(S1.length() > 20){
            System.out.print("Digite uma string de ate 20 caracteries: ");
            S1 = scan.next();}
        System.out.print("Digite uma nova string: ");
        S2 = scan.next();
        S3 = S1 + " " + S2;
        System.out.format("String resultado da primeria string com a segunda: %s", S3); 
    }
    public static void inversaStr(){
        String S1;
        
        System.out.print("Digite uma string: ");
        S1 = scan.next();
        String inversa = "";
        
        for (int i = S1.length() - 1; i >= 0; i--){
            inversa += S1.charAt(i);
        }
        
        System.out.format("A string %s invesa: %s", S1, inversa);
    }
}
*/

/* QUESTAO 06 */
/*
public class Lista03{

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int n1;

        System.out.println("Digite o numero: ");
        n1 = scan.nextInt();

        Somatorio(n1);
        

    }
    public static void Somatorio(int n){
        int somatorio = 0;
        for(int i = 1; i <= n; i++){
            somatorio+=i;
        }
        System.out.format("O somatorio de 1 ate %d e: %d", n, somatorio);
    }
}
*/

/* QUESTAO 07 */
/*
public class Lista03{

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int N1, N2, resto;

        System.out.println("Digite numero 1: ");
        N1 = scan.nextInt();

        System.out.println("Digite numero 2: ");
        N2 = scan.nextInt();
  
        mdc(N1, N2);
    }

    public static int mdc(int n1, int n2) {
        int resto;
        while(n2 != 0){
         resto = n1 % n2;
         n1 = n2;
         n2 = resto;
         }
         return n1;
     }
}
*/

/* QUESTAO 08 */
/*
public class Lista03{

    public static Scanner scan = new Scanner(System.in);
    public static Filmes[] vetFilmes = new Filmes[3];
    public static Filmes filmes; 

    public static void main(String[] args) {
        
        int op;

        System.out.println("[1] para cadastrar um novo filme.\n[2] para imprimir filmes cadastrados.\n");
        System.out.print("Sua opcao: ");
        op = scan.nextInt();
        do{
            switch(op){
                case 1: cadastrarFilme();break;
                case 2: mostrarFilmes();break;
            }
        }while(op!=0);
    }
    
    public static void cadastrarFilme(){
        for(int i = 1; i <= 3; i++){
            System.out.print("Digite o nome do filme: ");
            String nome = scan.next();
            System.out.print("Digite o autor do filme: ");
            String autor = scan.next();
            System.out.print("Digite o ano de publicação: ");
            int ano = scan.nextInt();
            System.out.print("Digite o valor do filme: ");
            float preco = scan.nextFloat();
            filmes = new Filmes(nome, autor, ano, preco);
            vetFilmes[i] = filmes;
        }
    }
    public static void mostrarFilmes(){
        System.out.format("Nomes. \tAutor. \tAno. \tPreco.");
        for(int i = 1; i <= 3; i++){
            System.out.format("%s. \t%s. \t%d. \t%f.\n", vetFilmes[i].nome, vetFilmes[i].autor, vetFilmes[i].ano, vetFilmes[i].preco);
        }
    }  
}
*/