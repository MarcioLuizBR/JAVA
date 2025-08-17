public class App {
    public static void main(String[] args) {
        int num1;
        num1 = 0;
        while (num1 <= 10) {
            System.out.println("Valor de num1 é : " + num1);
            num1++;
        }
        System.out.println("--------------------------------------------------");

        // exemplos de else if

        int num2 = 40, num3 = 30;
        if (num2 > num3) {
            System.out.println("Valor de num2 é maior que num3");
        } 
        else if(num2 <= 10) {
            System.out.println("Valor de num2 é : " + num2);
            num2++;
        }else {
            System.out.println("Valor de num3 é maior que num2");
        }

        System.out.println("--------------------------------------------------");

        // comando condicional SWITCH
        int opcao = 4;
        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada");
                break;
            case 2:
                System.out.println("Opção 2 selecionada");
                break;
            case 3:
                System.out.println("Opção 3 selecionada");
                break;
            default:
                System.out.println("Opção inválida");
        }

        System.out.println("Fim do programa");
    }
}
