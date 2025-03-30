package atividades;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Atividade2 {
	public static void main(String[] args) {
        contaTempo(04, 01, 2026);
    }

    public static void contaTempo(int dia, int mes, int ano) {
        Calendar dataAtual = Calendar.getInstance();
        Date agora = dataAtual.getTime();

        Calendar dataAlvo = Calendar.getInstance();
        dataAlvo.set(ano, mes - 1, dia, 0, 0, 0);
        dataAlvo.set(Calendar.MILLISECOND, 0);

        long diferencaEmMillis = dataAlvo.getTimeInMillis() - agora.getTime();

        if (diferencaEmMillis < 0) {
            System.out.println("A data já passou!");
            return;
        }

        long dias = TimeUnit.DAYS.convert(diferencaEmMillis, TimeUnit.MILLISECONDS);
        long horas = TimeUnit.HOURS.convert(diferencaEmMillis, TimeUnit.MILLISECONDS) % 24;
        long minutos = TimeUnit.MINUTES.convert(diferencaEmMillis, TimeUnit.MILLISECONDS) % 60;
        long segundos = TimeUnit.SECONDS.convert(diferencaEmMillis, TimeUnit.MILLISECONDS) % 60;

        System.out.printf("Faltam %d dias, %d horas, %d minutos e %d segundos para %02d/%02d/%d.%n", 
                          dias, horas, minutos, segundos, dia, mes, ano);
    }
}
