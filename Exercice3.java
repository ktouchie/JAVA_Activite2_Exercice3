import java.util.Scanner;
class Exercice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre:");
        int num1 = sc.nextInt();
        System.out.println("Veuillez saisir un autre nombre:");
        int num2 = sc.nextInt();
        System.out.println("Veuillez saisir encore un autre nombre:");
        int num3 = sc.nextInt();
        int max = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : (num2 >= num3) ? num2 : num3;

        System.out.println("Le maximum de ces trois nombres est " + max);
        
	}

}