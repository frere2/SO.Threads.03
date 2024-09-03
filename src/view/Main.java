package view;

import controller.ThreadVetor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vet = new int[1000];
        Random random = new Random();

        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(100) + 1;
        }

        Thread threadVetor1 = new ThreadVetor(1, vet);
        Thread threadVetor2 = new ThreadVetor(2, vet);
        threadVetor1.start();
        threadVetor2.start();
    }
}