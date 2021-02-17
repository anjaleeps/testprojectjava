package user;

public class Example {

    public static void main(String[] args) {
        Example example = new Example();
        example.isAccepted(45);
    }

    public boolean isAccepted(int num ) {
        if (num > 100 || num < 50) {
            return false;
        }
        else if (num % 2 == 0) {
            return true;
        }
        else if (num*3 > 200) {
            return true;
        }
        return false;
    }
}
