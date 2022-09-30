#include <stdio.h>

#define verdade 1
#define falso 0

void main ()
{

	int ppp = 0;
	int c, qtsZeros;
	int linha, coluna;
	_Bool bo, ok = verdade;
	int qtsLinha, qtsColuna;

	scanf("%d %d", &qtsLinha, &qtsColuna);

	for (linha = 0; linha < qtsLinha; ++linha)
	{

		qtsZeros = 0;
		bo = verdade;

		for (coluna = 0; coluna < qtsColuna; ++coluna)
		{

			scanf("%d", &c);
			if (c == 0 && bo)
				qtsZeros++;
			else
				bo = falso;

		}

		if (linha != 0)
		{

			if ((qtsZeros > ppp || (qtsZeros == ppp && qtsZeros == qtsColuna)) && ok)
				ppp = qtsZeros;
			else
				ppp = 0, ok = falso;

		}
		else
			ppp = qtsZeros;

	}

	if (ppp)
		printf("S\n");
	else
		printf("N\n");

}