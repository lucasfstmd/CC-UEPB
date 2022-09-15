#include <stdio.h>

struct produtosDat {
    int registro;
    char nome[ 50 ];
    int quantidade;
    double custo;
};

int main(void){

    FILE *abPtr;
    int registro;

    struct produtosDat produtos = { 0, "", 0, 0.0 };

    if ((abPtr = fopen("hardware.dat", "rb+")) == NULL){
        printf("Erro ao abrir o arquivo.\n");
    }
    else{

        printf("\nDigite o Registro: ");
        scanf("%d", &registro);
        

        fseek(abPtr, (registro - 1) * sizeof(struct produtosDat), SEEK_SET);

        fread(&produtos, sizeof(struct produtosDat), 1, abPtr);

        if (produtos.registro != 0){
            printf("A ferramenta de registro %d ja existe.\n", produtos.registro);
            printf("\n%-11s%-28s%-15s%10s\n", "Registro", "Nome", "Quantidade", "Custo");
            printf("%-11d%-28s%-15d%10.2f\n\n", produtos.registro, produtos.nome, produtos.quantidade, produtos.custo);
        }
        else{

            printf("\nDigite o nome do produto, quantidade e o custo: ");
            scanf(" %[^\n] %d %lf", produtos.nome, &produtos.quantidade, &produtos.custo);
            produtos.registro = registro;


            fseek(abPtr, (produtos.registro - 1) * sizeof(struct produtosDat), SEEK_SET);

            fwrite(&produtos, sizeof(struct produtosDat), 1, abPtr);
            
        }

        fclose(abPtr);
    }

   return 0; 
}