import java.util.Scanner;

public class Datas {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        
        // Ler data de aniversário
        System.out.println("\fDigite a data de aniversário (dd mm aaaa):");
        int diaAniversario = keyboard.nextInt();
        int mesAniversario = keyboard.nextInt();
        int anoAniversario = keyboard.nextInt();
        
        // Ler data atual
        System.out.println("Digite a data atual (dd mm aaaa):");
        int diaHoje = keyboard.nextInt();
        int mesHoje = keyboard.nextInt();
        int anoHoje = keyboard.nextInt();
        
        // Calcular signo
        String signo = calcularSigno(mesAniversario, diaAniversario);
        
        // Verificar se é bissexto
        boolean bissexto = ehAnoBissexto(anoAniversario);
        if (bissexto == true) {
            System.out.println("Seu aniversário é um ano bissexto.");
        } else {
            System.out.println("Seu aniversário não é um ano bissexto.");
        }
        
        // Imprimir resultado
        System.out.println("Signo da pessoa: " + signo);
        
         // Calcular o dia da semana
        String diaSemanaNascimento = calcularDiaDaSemana(anoAniversario, mesAniversario, diaAniversario);
        System.out.println("Dia da semana do seu nascimento: " + diaSemanaNascimento);
        
        if (diaAniversario == diaHoje && mesAniversario == mesHoje) {
            System.out.println("Parabéns pelo seu aniversário!");
        } else if (mesAniversario < mesHoje || (mesAniversario == mesHoje && diaAniversario < diaHoje)) {
            System.out.println("Seu aniversário já passou. Passaram .... dias desde o seu último aniversário.");
        } else {
            System.out.println("Seu aniversário ainda não chegou. Faltam .... dias para o seu próximo aniversário.");
        }
    }

    // Método para calcular o signo
   public static String calcularSigno(int mes, int dia) {
    if ((dia >= 21 && dia <= 31 && mes == 1) || (dia >= 1 && dia <= 18 && mes == 2)) {
        return "Aquário";
    }
    if ((dia >= 19 && dia <= 31 && mes == 2) || (dia >= 1 && dia <= 20 && mes == 3)) {
        return "Peixes";
    }
    if ((dia >= 21 && dia <= 31 && mes == 3) || (dia >= 1 && dia <= 20 && mes == 4)) {
        return "Áries";
    }
    if ((dia >= 21 && dia <= 30 && mes == 4) || (dia >= 1 && dia <= 20 && mes == 5)) {
        return "Touro";
    }
    if ((dia >= 21 && dia <= 31 && mes == 5) || (dia >= 1 && dia <= 20 && mes == 6)) {
        return "Gêmeos";
    }
    if ((dia >= 21 && dia <= 30 && mes == 6) || (dia >= 1 && dia <= 22 && mes == 7)) {
        return "Câncer";
    }
    if ((dia >= 23 && dia <= 31 && mes == 7) || (dia >= 1 && dia <= 22 && mes == 8)) {
        return "Leão";
    }
    if ((dia >= 23 && dia <= 31 && mes == 8) || (dia >= 1 && dia <= 22 && mes == 9)) {
        return "Virgem";
    }
    if ((dia >= 23 && dia <= 30 && mes == 9) || (dia >= 1 && dia <= 22 && mes == 10)) {
        return "Libra";
    }
    if ((dia >= 23 && dia <= 31 && mes == 10) || (dia >= 1 && dia <= 21 && mes == 11)) {
        return "Escorpião";
    }
    if ((dia >= 22 && dia <= 30 && mes == 11) || (dia >= 1 && dia <= 21 && mes == 12)) {
        return "Sagitário";
    }
    if ((dia >= 22 && dia <= 31 && mes == 12) || (dia >= 1 && dia <= 18 && mes == 1)) {
        return "Capricórnio";
    }
    return "Data de nascimento inválida";
}


    // Método para verificar se o ano é bissexto
    public static boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    // Método para calcular o dia da semana da data de nascimento (Algoritmo de Zeller's Congruence)
    public static String calcularDiaDaSemana(int ano, int mes, int dia) {
        int y = ano - (14 - mes) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = mes + 12 * ((14 - mes) / 12) - 2;
        int d = (dia + x + (31 * m) / 12) % 7;

        switch (d) {
            case 0: return "Domingo";
            case 1: return "Segunda-feira";
            case 2: return "Terça-feira";
            case 3: return "Quarta-feira";
            case 4: return "Quinta-feira";
            case 5: return "Sexta-feira";
            case 6: return "Sábado";
            default: return "Erro ao calcular dia da semana";
        }
}
}
