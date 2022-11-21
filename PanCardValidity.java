import java.util.Scanner;

class withInvalidPanException extends Exception {
    public withInvalidPanException(String s) {
        super(s);
    }
}

public class PanCardValidity {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you PAN: ");
        String pan = sc.nextLine();
        System.out.print("Enter you Name: ");
        String name = sc.nextLine();

        try {
            if(pan.charAt(4) != name.charAt(0)) {
                throw new withInvalidPanException("Invalid Pan Card");
            }else {
                System.out.println("Valid Pan Card");
            }
        } catch (withInvalidPanException e) {
            System.out.println(e.getMessage());
        }
    }
}