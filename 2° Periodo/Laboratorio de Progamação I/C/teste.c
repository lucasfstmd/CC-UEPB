#include <stdio.h>


int main(){

    double salario;
    double vendas;
    double total;
    double comissao;
    char nome;

    printf("Nome: ");
    scanf("%c", &nome);
    printf("salario: ");
    scanf("2.f%", &salario);
    printf("vendas");
    scanf("2.f%", &vendas);

    comissao = (vendas * (15/100));
    total = salario + comissao;

    printf("TOTAL = R$ %2.f", &total);

return 0;
}
