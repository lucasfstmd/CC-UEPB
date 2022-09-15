    	
		//------------------------------------------------------------//
		// Maria Clara Rodrigues do Nascimento - Matricula: 211080039 //
        // Lucas Fausto Medeiros               - Matricula: 211080055 //
        //------------------------------------------------------------//
        //               Questão 3.36 (Binario para Decimal)          // 
        //------------------------------------------------------------//
	

#include <stdio.h>
#include <math.h>
#include <locale.h>
#include <stdlib.h>


int main(void) {
	
	setlocale(LC_ALL, "Portuguese");

    int binario, contador, resto;
	int decimal = 0;

    printf("Leia um inteiro contendo apenas 0s e 1s (ou seja, um inteiro binário): ");
    scanf("%d", &binario);

	for (contador = 0; contador < 1000; contador++) {
		resto = binario - ((binario / 10)*10);
		binario = binario / 10;
		decimal += resto * pow(2, contador);
	
	}
	
	printf("Decimal: %i \n", decimal);

	return 0;
}
