
public class Binary {

    public static void main(String[] args) {
        int decimalNumber = 2;
        String input = "Hello";
        String binaryNumber = "";

        for (int i = 0; i < input.length(); i++) {
            char letra = input.charAt(i);
            int letraNum = Character.getNumericValue(letra);
            while (letraNum > 0) {
                int remainder = letraNum % 2;
                binaryNumber = remainder + binaryNumber;
                letraNum = letraNum / 2;
            }
        }

        System.out.println(binaryNumber);

    }

}
