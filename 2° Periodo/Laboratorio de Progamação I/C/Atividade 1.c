#include <stdio.h>

int main( void ) {

    int gasolina;
    int kms;
    int media;

    printf("digite quanto você percorreu em KM:\n");
    scanf("%d", &kms);

    printf("digite quanto foi gasto de combustivel em L:\n");
    scanf("%d", &gasolina);

    media = kms / gasolina;

    printf("A media de consumo do veiculo foi de: %d\n", media);

    return 0;

}
