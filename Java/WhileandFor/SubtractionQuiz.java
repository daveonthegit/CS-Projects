package WhileandFor;
import java.util.*;
public class SubtractionQuiz {
    public static void main(String[] args) {
        HashMap<String, String> output = new HashMap<String, String>();
        Scanner answer = new Scanner(System.in);
        int a = -1;
        int correctCount = 0;
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < 6; i++) {
            int x = (int) (Math.random()*10);
            int y = (int) (Math.random()*10);
            int dif = x-y;
            System.out.println("What is " + x + " - " + y + "? ");
            a = answer.nextInt();
            if (a != dif) {
                System.out.println("Your answer is wrong. \n" + x + " - " + y + " should be " + dif + ".");
                output.put(x + "-" + y + "=" + dif, "wrong");
            } else {
                System.out.println("You're correct!");
                output.put(x + "-" + y + "=" + dif, "correct");
                correctCount++;
            }
        }
        double endTime = System.currentTimeMillis();
        double testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount +
        "\nTest time is " + testTime / 1000 + " seconds\n");
        for (String i : output.keySet()) {
            System.out.println(i + output.get(i));
        }
    }
}
