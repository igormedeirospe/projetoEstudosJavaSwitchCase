import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        String nome;
        nome = "Maria";
        int numero;
        numero = 9;
        if (numero>= 9 && nome.equals("Maria")){
            System.out.println("O numero é " + numero + " e nome é " + nome);
        }else{
            System.out.println("ocorreu um erro!");
        }
        //Usando SWITCH
        String fruta;
        //recebendo valor e armazenando na variavel fruta
        fruta = JOptionPane.showInputDialog("Digite o nome da fruta");
        //switch - Avalia o valor de uma variavel e dependendo do resultado ele entra
        //em um caso (case)
        switch(fruta){
            //case
            case "Banana":
                System.out.println("voce digitou Banana");
                //break encerrar o case
                break;

            case "Laranja":
                System.out.println("voce digitou laranja");
                break;

            default: System.out.println("fruta invalida");
            break;

        }



    }
}