package atividades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Atividade1 {
    public static void main(String[] args) {
        mostrarDataPorExtenso();
    }

    public static void mostrarDataPorExtenso() {
        Date agora = new Date();
        SimpleDateFormat diaDaSemanaFormat = new SimpleDateFormat("EEEE", new Locale("pt", "BR"));
        SimpleDateFormat diaFormat = new SimpleDateFormat("dd");
        SimpleDateFormat mesFormat = new SimpleDateFormat("MMMM", new Locale("pt", "BR"));
        SimpleDateFormat anoFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH");
        SimpleDateFormat minutoFormat = new SimpleDateFormat("mm");

        String diaDaSemana = diaDaSemanaFormat.format(agora);
        String dia = diaFormat.format(agora);
        String mes = mesFormat.format(agora);
        String ano = anoFormat.format(agora);
        String hora = horaFormat.format(agora);
        String minuto = minutoFormat.format(agora);

        System.out.println("Hoje é " + diaDaSemana + ", dia " + dia + " de " + mes + " de " + ano + " e agora são " + hora + " horas e " + minuto + " minutos.");
    }
}

