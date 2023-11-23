public class Ex06 {

    public static void main(String[] args) {
        sequence(5);
    }


    public static void sequence(int n) {
        if (n <= 0) {
            System.out.println("1");
        } else {
            String sequence = "1";
            for (int x = 0; x <= n; x++) {
                System.out.println(sequence);
                StringBuilder result = new StringBuilder();
                char currentChar = sequence.charAt(0);
                int count = 1;

                for (int i = 1; i < sequence.length(); i++) {
                    if (sequence.charAt(i) == currentChar) {
                        count++;
                    } else {
                        result.append(count).append(currentChar);
                        currentChar = sequence.charAt(i);
                        count = 1;
                    }
                }
                result.append(count).append(currentChar);
                sequence = result.toString();
            }
        }
    }
}