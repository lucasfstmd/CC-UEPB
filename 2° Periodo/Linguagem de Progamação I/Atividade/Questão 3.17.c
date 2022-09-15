        
        //------------------------------------------------------------//
        // Maria Clara Rodrigues do Nascimento - Matricula: 211080039 //
        // Lucas Fausto Medeiros               - Matricula: 211080055 //
        //------------------------------------------------------------//
        //               Questão 3.17 (Consumo de gasolina)           // 
        //------------------------------------------------------------//

#include <stdio.h>
#include <locale.h>

int main (void) {
    
    setlocale(LC_ALL, "Portuguese");

    int distancia;
    float gasolina, consumo;
    int contador;
    int total;

    float media;

    contador = 0;
    total = 0;

    printf("Informe quantos litros abasteceu (-1 para terminar): ");
    scanf("%f", &gasolina);

    printf("Informe quantos km dirigiu: ");
    scanf("%d", &distancia);

    consumo = distancia/gasolina;

    printf("O consumo atual foi de: %f km/l\n", consumo);

    while (gasolina != -1) {
        total = total + gasolina;
        contador = contador + 1;

        printf("Informe quantos litros abasteceu (-1 para terminar): ");
        scanf("%f", &gasolina);

        printf("Informe quantos km dirigiu: ");
        scanf("%d", &distancia);

        consumo = distancia/gasolina;

        printf("O consumo atual foi de: %f km/l\n", consumo);

    }

    if (contador != 0) {
        media = (float) total / contador;

        printf("A média geral de consumo foi: %f km/l\n", media);
    }

    return 0;
}