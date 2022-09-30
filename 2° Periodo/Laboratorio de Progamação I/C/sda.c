#include <stdio.h>

int main(){
    
    int numero, contador;
      contador = 1;

    while(1){
  
    scanf("%d", &numero);
    if (numero==0)break;
    printf("1");
    for(contador = 2; contador <= numero; contador++){
        printf(" %d", contador);
    }
    printf("\n");
    }
    
return 0;
}
