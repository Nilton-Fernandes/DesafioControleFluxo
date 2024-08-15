package principal;

import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        }else {
            System.out.printf("Parametros: \n%d - %d = %d.\n",parametroUm,parametroDois, contagem);
            System.out.println("contagem de 1 a "+contagem);
        }

        for (int i = 1; i <= contagem ; i++) {

            System.out.println(i);

        }
    }
}