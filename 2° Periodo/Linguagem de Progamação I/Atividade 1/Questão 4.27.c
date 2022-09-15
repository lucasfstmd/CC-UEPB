     
        //------------------------------------------------------------//
        // Maria Clara Rodrigues do Nascimento - Matricula: 211080039 //
        // Lucas Fausto Medeiros               - Matricula: 211080055 //
        //------------------------------------------------------------//
        //               Questão 4.27 (Triplas de Pitágoras)          // 
        //------------------------------------------------------------//

#include <stdio.h>
#include <stdlib.h>

int main(void) {
    
    int cateto1;
    int cateto2;
    int hipotenusa;

    for (hipotenusa =1; hipotenusa < 500; hipotenusa++) {
            for (cateto1 = 1; cateto1 < 500; cateto1++) {
                for (cateto2 = 1; cateto2 < 500; cateto2++) {
                    int lado1 = cateto1 * (cateto1 + cateto2) * cateto2;
                    int lado2 = hipotenusa * hipotenusa;

                    if (lado1 == lado2) {
                        printf("Triplas de Pitagoras: %d, %d e %d\n", hipotenusa, cateto1, cateto2);
                    }
                    else if (lado1 > lado2) {
                        break;
                    }
                }
            }
    }

    return 0;
}