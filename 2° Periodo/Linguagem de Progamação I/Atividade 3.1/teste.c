#include <stdio.h>

#define true 1
#define false 0

void main (){

  int cont_0s = 0;
	int matriz, qntZeros;
	int linha, coluna;
	_Bool bo, ok = true;
  int qntLinhas, qntColunas;

	scanf("%d %d", &qntLinhas, &qntColunas);

	for (linha = 0; linha < qntLinhas; ++linha){

		qntZeros = 0;
		bo = true;

		for (coluna = 0; coluna < qntColunas; ++coluna){

			scanf("%d", &matriz);
			if (matriz == 0 && bo){
				qntZeros++;
      }
			else{
				bo = false;
      }
		}
		if (linha != 0){

			if ((qntZeros > cont_0s || (qntZeros == cont_0s && qntZeros == qntColunas)) && ok)
				cont_0s = qntZeros;
			else{
				cont_0s = 0, ok = false;
      }
		}
		else{
			cont_0s = qntZeros;
    }
	}
	if (cont_0s){
		printf("S\n");
  }
	else{
		printf("N\n");
  }
}