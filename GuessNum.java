import java.util.*;
import java.lang.Math;

public class GuessNum {

    /**
     * @return
     */
    public int randomNum() {
        int ans = 1 + (int) (Math.random() * 100);
        return ans;
    }

    public int takeUserInput() {
        System.out.println("Enter your guess");
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        sc.close();
        return g;
    }

    /* public void checkInput(int gap) {
        if (50 <= gap && gap <= 100) {
            System.out.println("You are far away");
        } else if (30 <= gap && gap < 50) {
            System.out.println("You are pretty close...");
        } else if (10 <= gap && 30 < gap) {
            System.out.println("Good guess, almost there!! 😎");
        } else if (0 < gap && gap < 10) {
            System.out.println("Excellent Guess! 😲");
        } else if (gap == 0) {
            System.out.println("Jackpot! You win! 🎉");
        } else {
            System.out.println("Your guess exceeds limit");
        }

    } */

    public static void main(String[] args) {
        System.out.println("Welcome to the game..Guess a number between 1 - 100");
        System.out.println("You have 5 attempts..");

        // System.out.println(ans);
        GuessNum obj = new GuessNum();
        int ans = obj.randomNum();

        for (int i = 0; i < 5; i++) {
            int guess = obj.takeUserInput();
            int gap = ans - guess;
            if (gap < 0) {
                gap = -gap;
            }
            //obj.checkInput(gap);
            if (50 <= gap && gap <= 100) {
                System.out.println("You are far away ");
            } else if (30 <= gap && gap < 50) {
                System.out.println("You are pretty close...");
            } else if (10 <= gap && 30 < gap) {
                System.out.println("Good guess, almost there!! 😎");
            } else if (0 < gap && gap < 10) {
                System.out.println("Excellent Guess! 😲");
            } else if (gap == 0) {
                System.out.println("Jackpot! You win! 🎉");
                break;
            } else {
                System.out.println("Your guess exceeds limit");
            }
        }
    }
}
