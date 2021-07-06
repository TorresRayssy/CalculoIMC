package calculoimc;

import java.util.Scanner;
        
public class CalculoIMC {
    
    public static void main(String[] args) {
        
        String nome, resp;
        double peso, altura;
        Scanner teclado=new Scanner(System.in);
        do{
            System.out.print("Digite o nome: ");
            nome=teclado.nextLine();
            System.out.print("Digite seu peso(kg): ");
            peso=teclado.nextDouble();
            System.out.print("Digite sua altura(m): ");
            altura=teclado.nextDouble();
        
            double imc = peso/Math.pow(altura,2);
            teclado.nextLine();
        
            System.out.printf("Seu IMC é %.2f %n", +imc);
            
            
        if (imc<16){
            System.out.println(nome+ " sua situação corporal é "
                    + "Magreza grau III.");
        }else if (imc>16 && imc<16.99){
            System.out.println(nome+ " sua situação corporal é "
                    + "Magreza grau II.");
        }else if (imc>17 && imc <18.49){
            System.out.println(nome+ " sua situação corporal é "
                    + "Magreza grau I.");
        }else if (imc>18.5 && imc <24.99){
            System.out.println(nome+ " sua situação corporal é "
                    + "Adequado.");
        }else if (imc>25 && imc<29.99){
            System.out.println(nome+ " sua situação corporal é "
                    + "Pré-obeso.");
        }else if (imc>30 && imc<34.99){
            System.out.println(nome+ " sua situação corporal é "
                    + "Obesidade grau I.");
        }else if (imc>35 && imc<39.99){
            System.out.println(nome+ " sua situação corporal é "
                    + "Obesidade grau II.");
        }else if (imc>=40){
            System.out.println(nome+ " sua situação corporal é "
                    + "Obesidade grau III.");
        }else{
            System.out.println();
        }
        
            System.out.println("Deseja continuar? [Sim/Não]");
            resp = teclado.next();
            teclado.nextLine();
        }while (resp.equals("Sim"));
        System.out.println("Aplicativo encerrado");
             
        
    }
    
}
