import java.util.Scanner;

class ExceptionLineTooLong extends Exception {
    ExceptionLineTooLong(String s) {
        super(s);
    }
}

class ExceptionLineTooShort extends Exception {
    ExceptionLineTooShort(String s) {
        super(s);
    }
}

public class StringLengthExceptions {
    static int getLength(String s ){
        return s.length();
    }

    static void getLongException() {
        try {
            throw new ExceptionLineTooLong("String length is greater than 10 character");
        }
        catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }
    }

    static void getShortException() {
        try {
            throw new ExceptionLineTooShort("String length is less than 5 character");
        }
        catch (ExceptionLineTooShort e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you PAN: ");
        String userString = sc.nextLine();

        if(getLength(userString)>10) {
            getLongException();
        }
        else if(getLength(userString)<5) {
            getShortException();
        }
    }
}