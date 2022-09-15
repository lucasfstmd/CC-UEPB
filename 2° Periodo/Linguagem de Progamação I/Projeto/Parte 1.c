#include <stdio.h>
#include <string.h>

#define ANSI_COLOR_RED     
#define ANSI_COLOR_GRAY

int main(void) {

    char cpf[ 100 ];
    char nome[ 50 ];
    char endereco[ 50 ];
    int idade, telefone;
 
    FILE *paPtr;

    if ((paPtr = fopen("clients.dat", "a")) == NULL){ 
        printf("Nao ha arquivo\n");
    }

    else {
        printf(ANSI_COLOR_RED "Digite o CPF:\n");
        scanf("%s", cpf);
        while (strlen(cpf) != 11 && !feof(stdin)){

            printf("Digite um cpf valido (11 digitos sem pontos ou tracos): ");
            scanf("%s", cpf);
        }

        printf("O PRIMEIRO NOME\n");
        scanf("%s", nome);
        printf("O BAIRRO (CASO O BAIRRO SEJA COMPOSTO POR DUAS PALAVRAS, INSIRA APENAS AS DUAS LETRAS INICIAIS DO NOME)\n");
        scanf(" %[^\n]", endereco);
        printf("A IDADE e o TELEFONE\n");
        scanf("%d%d", &idade, &telefone);
        if (idade <= 0){
           
            printf("Digite uma idade maior que 0: ");
            scanf("%d", &idade);
            
        }
        printf(": ");

        if (!feof(stdin)){
            fprintf(paPtr, "%s %s %s %d %d\n", cpf, nome, endereco, idade, telefone);
            fclose(paPtr);
            /*mensagemAlerta("\nCliente cadastrado com sucesso!\n");*/
        }
    }

    return 0;

}

