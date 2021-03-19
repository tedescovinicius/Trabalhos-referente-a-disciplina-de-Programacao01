#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <time.h>

/*#define TAM 1000*/

void decrescente(int TAM){
    int numeros[TAM];
  int i,j, aux, contador, ordenado = 0;
  clock_t start, end;

  for (i=TAM; i >= 0; i--){
      for (j = 0; j < TAM ; j++);
        numeros[j] = i;
  }
  printf("%d", numeros[2]);

  /*printf("Ordem atual dos itens no array:\n");
    for (i = 0; i < TAM; i++) {
        printf("%4d", numeros[i]);
    }*/
  
  start = clock();
  // Algoritmo de ordenação Bubblesort:
    for (contador = 0; contador < TAM && ordenado == 0; contador++) {
        ordenado = 1;
        for (int i = 0; i < TAM - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                aux = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = aux;
                ordenado = 0;
            }
        }      
    }
    end = clock();

    double difTempo = ((double) end - start)/CLOCKS_PER_SEC;

  printf("\n\n\n\t -> Tempo em s: %lf, Tempo em ms: %lf", difTempo, difTempo*1000);

}

void crescente(int TAM){
  int numeros[TAM];
  int i, aux, contador, ordenado = 0;
  clock_t start, end;

  for (i=0; i< TAM; i++){
      numeros[i] = i;
  }

  printf("Ordem atual dos itens no array:\n");
    for (i = 0; i < TAM; i++) {
        printf("%4d", numeros[i]);
    }
  
  start = clock();
  // Algoritmo de ordenação Bubblesort:
    for (contador = 0; contador < TAM && ordenado == 0; contador++) {
        ordenado = 1;
        for (int i = 0; i < TAM - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                aux = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = aux;
                ordenado = 0;
            }
        }      
    }
    end = clock();

    double difTempo = ((double) end - start)/CLOCKS_PER_SEC;

  printf("\n\n\n\t -> Tempo em s: %lf, Tempo em ms: %lf", difTempo, difTempo*1000);

}

void aleatorio(int TAM){

  int numeros[TAM];
  int i, aux, contador, ordenado = 0;
  clock_t start, end;

  for (int i = 0; i < TAM; i++){
  /* gerando valores aleatórios entre zero e 1000 */
        numeros[i] = rand() % 1000;
  }

  /*printf("Ordem atual dos itens no array:\n");
    for (i = 0; i < TAM; i++) {
        printf("%4d", numeros[i]);
    }*/
  
  start = clock();
  // Algoritmo de ordenação Bubblesort:
    for (contador = 0; contador < TAM && ordenado == 0; contador++) {
        ordenado = 1;
        for (int i = 0; i < TAM - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                aux = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = aux;
                ordenado = 0;
            }
        }      
    }
    end = clock();

    double difTempo = ((double) end - start)/CLOCKS_PER_SEC;

  printf("\n\n\n\t -> Tempo em s: %lf, Tempo em ms: %lf", difTempo, difTempo*1000);

 }

int main(){

    /*aleatorio(1000);*/
    /*crescente(1000);*/
    decrescente(1000);

    return 0;

}