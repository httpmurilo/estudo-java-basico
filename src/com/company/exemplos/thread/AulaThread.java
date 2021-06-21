package com.company.exemplos.thread;

import javax.swing.*;

public class AulaThread {
    public static void main(String[] args) throws InterruptedException {

        /*processamento em paralelo de envio de email*/
        new Thread() {

            public void run(){
                /*codigo da rotina */
                for (int pos = 0; pos < 10; pos++) {

                    System.out.println("Executando alguma rotina, envio de email");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        /*Divisão das threads */
        /* Envio de nota fiscal */
        new Thread() {

            public void run(){
                /*codigo da rotina */
                for (int pos = 0; pos < 10; pos++) {

                    System.out.println("Executando alguma rotina, envio de uma nota fiscal");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        /* Codigo do sistema do usuário continua o fluxo de trabalho*/
        System.out.println("Chegou ao fim do codigo de teste de thread");
        /*Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal*/
        JOptionPane.showMessageDialog(null,"Sistema continua executando para o usuário");

    }
}
