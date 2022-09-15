       // Lucas Fausto Medeiros -- Matricula: 211080055 \\

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(void) {

    setlocale(LC_ALL, "Portuguese");

    int contador_alinhamento, contador_inicio, contador_impressao;
    int espaco, asterisco, metade;
    int num_linhas;

        asterisco = 1;
        espaco = 10;

    printf("\nDigite a quantidade de linhas do losangulo (numero impar entre 1 e 19): ");
    scanf("%d", &num_linhas);

    metade = ((num_linhas - 1) / 2) + 1;
    printf(" \n");

    if (num_linhas <= 19) {
        if (asterisco <= num_linhas) {
            for (contador_inicio=0; contador_inicio < metade; contador_inicio++) {

                for (contador_alinhamento = 1; contador_alinhamento <= espaco; contador_alinhamento++)
                    printf(" ");

                espaco--;


                for (contador_impressao = 0; contador_impressao < asterisco; contador_impressao++)
                    printf("*");

                        printf("\n");
                        asterisco+=2;
            }

                asterisco-=2;
                espaco++;

            for (contador_inicio = 0; contador_inicio < metade; contador_inicio++) {

                asterisco-=2;
                espaco++;

                for (contador_alinhamento = 0; contador_alinhamento < espaco; contador_alinhamento++)
                        printf(" ");

                for (contador_impressao = 0; contador_impressao < asterisco; contador_impressao++)
                    printf("*");

                printf("\n");

            }
        }
        else {
            printf("\n deu certo bacana"); // so uma gracinha
        }
    }
    else {
        printf("Colaco so até 19 bacana!");
        scanf("%d", &num_linhas);
    }

    return 0;
}
