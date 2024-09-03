package controller;

public class ThreadVetor extends Thread {
    private int numero;
    private int[] vetor;

    public ThreadVetor(int numero, int[] vetor) {
        this.numero = numero;
        this.vetor = vetor;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        if (numero % 2 == 0) {
            for (int i = 0; i < vetor.length; i++) {
            }
        } else {
            for (int valor : vetor) {
            }
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Tempo para percorrer o vetor com número " + numero + ": " + (duration / 1000.0) + " segundos.");
    }
}