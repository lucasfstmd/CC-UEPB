#include <stdio.h>

int main(void) {

    int qnt_abst, contador;
    float qnt_litros;
    float qnt_kms;
    float total_litros=0;
    float total_kms=0;
    float media;

    printf("Quantos abastecimentos voce fez: ");
    scanf("%d", &qnt_abst);

    for(contador=1; contador<=qnt_abst; contador++){
        printf("\nDiga quantos litros voce colocou: ");
        scanf("%f", &qnt_litros);
        printf("Diga quantos km voce percorreu: ");
        scanf("%f", &qnt_kms);

        total_litros+=qnt_litros;
        total_kms+=qnt_kms;

        media = total_kms/total_litros;
        printf("A media foi: %f\n", media);
    }



return 0;
}
