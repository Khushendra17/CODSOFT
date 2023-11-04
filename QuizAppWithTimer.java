import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizAppWithTimer {
    public static void main(String[] args) {
        // user input
        int Score = 0;
        int CorrectAnswers = 0;
        int WrongAnswers = 0;
        char Que;
        Scanner obj = new Scanner(System.in);
        System.out.println("Welcome to Kon Banega Karodpati\n");
        System.out.println("Press Enter to play the game");
        obj.nextLine();

        // game logic
        // Question 1
        System.out.println("Question 1: What is the main purpose of Java?");
        System.out.println("a) To create dynamic web pages \nb) To write system software\nc) To design mobile apps\nd) To connect to databases");
        System.out.println("Answer: ");

        Timer timer1 = new Timer();

        TimerTask timerTask1 = new TimerTask() {
            public void run() {
                System.out.println("Time's up! You didn't answer in time.");
                System.out.println("Please Play Again\n");
            
             
        }};

        timer1.schedule(timerTask1, 30000); // 30 seconds timer

        Que = obj.next().toLowerCase().charAt(0);
        timerTask1.cancel(); // Cancel the timer

        switch (Que) {
            case 'b' -> {
                System.out.println("Correct Answer\n");
                Score += 20;
                CorrectAnswers += 1;
                }
                case 'a','d','c'->{
                    System.out.println("Wrong Answer!!!\nThe Correct Answer is Option B");
                WrongAnswers +=1;
                }
                default  -> {
                System.out.println("Invalid Input");
                WrongAnswers +=1;
                }  
        }
        obj.nextLine();//
        System.out.println("Press Enter To Continue");
        obj.nextLine();

        // Question 2
        System.out.println("Question 2: In Java, which keyword is used to declare a constant variable?");
        System.out.println("a) var\nb) static\nc) const\nd) final");
        System.out.println("Answer: ");
         Timer timer2 = new Timer();

        TimerTask timerTask2 = new TimerTask() {
            public void run() {
                System.out.println("Time's up! You didn't answer in time.");
                System.out.println("Please Play Again\n");
            
             
        }};

        timer2.schedule(timerTask2, 30000); // 30 seconds timer

        Que = obj.next().toLowerCase().charAt(0);
        timerTask2.cancel(); // Cancel the timer

        switch (Que) {
            case 'd' -> {
                System.out.println("Correct Answer\n");
                 Score += 20;
                 CorrectAnswers += 1;
                }
                 case 'a','b','c'->{
                    System.out.println("Wrong Answer!!!\nThe Correct Answer is Option B");
                WrongAnswers +=1;
                }
                  default ->{
                System.out.println("Invalid Input");
                WrongAnswers +=1; 
            }
        }
        obj.nextLine();
        System.out.println("Press Enter To Continue");
        obj.nextLine();

        // Question 3
        System.out.println("Question 3: What is the output of the following code?");
        System.out.println("int x = 5;\nint y = 2;\nint result = x / y;\nSystem.out.println(result);\n");
        System.out.println("a) 2.5\nb) 2\nc) 2.0\nd) Error");
        System.out.println("Answer: ");
          Timer timer3 = new Timer();

        TimerTask timerTask3 = new TimerTask() {
            public void run() {
                System.out.println("Time's up! You didn't answer in time.");
                System.out.println("Please Play Again\n");
            
             
        }};

        timer3.schedule(timerTask3, 30000); // 30 seconds timer

        Que = obj.next().toLowerCase().charAt(0);
        timerTask3.cancel(); // Cancel the timer
    
        switch (Que) {
            case 'b' -> {
                System.out.println("Correct Answer\n");
                 Score += 20;
                 CorrectAnswers += 1;
                }
                 case 'a','d','c'->{
                    System.out.println("Wrong Answer!!!\nThe Correct Answer is Option B");
                WrongAnswers +=1;
                }
                  default ->{
                System.out.println("Invalid Input");
                WrongAnswers +=1; 
            }
        }
        obj.nextLine();
        System.out.println("Press Enter To Continue");
        obj.nextLine();

        // Question 4
        System.out.println("Question 4: Which data structure in Java is often used to implement a Last-In-First-Out (LIFO) behavior?");
        System.out.println("a) Queue\nb) Stack\nc) List\nd) Array");
        System.out.println("Answer: ");
      
          Timer timer4 = new Timer();

        TimerTask timerTask4 = new TimerTask() {
            public void run() {
                System.out.println("Time's up! You didn't answer in time.");
                System.out.println("Please Play Again\n");
            
             
        }};

        timer4.schedule(timerTask4, 30000); // 30 seconds timer

        Que = obj.next().toLowerCase().charAt(0);
        timerTask4.cancel(); // Cancel the timer

        switch (Que) {
            case 'b' -> {
                System.out.println("Correct Answer\n");
                Score += 20;
                CorrectAnswers += 1;
                }
                case 'a','c','d' ->{
                    System.out.println("Wrong Answer!!!\nThe Correct Answer is Option B");
                    WrongAnswers += 1;
                }
            default ->{
                System.out.println("Invalid Input");
            WrongAnswers +=1;
            }
        }
        obj.nextLine();
        System.out.println("Press Enter To Continue");
        obj.nextLine();

        // Question 5
        System.out.println("Question 5: What is the purpose of the break statement in a Java loop?");
        System.out.println("a) To skip the current iteration and continue with the next one.\nb) To terminate the loop and exit it.\nc) To restart the loop from the beginning.\nd) To print a message and then continue with the next iteration.");
        System.out.println("Answer: ");
      
          Timer timer5 = new Timer();

        TimerTask timerTask5 = new TimerTask() {
            public void run() {
                System.out.println("Time's up! You didn't answer in time.");
                System.out.println("Please Play Again\n");
            
             
        }};

        timer5.schedule(timerTask5, 30000); // 30 seconds timer

        Que = obj.next().toLowerCase().charAt(0);
        timerTask5.cancel(); // Cancel the timer

        switch (Que) {
            case 'b' -> {
                System.out.println("Correct Answer\n");
            Score += 20;
            CorrectAnswers += 1;
                }
                case 'a','c','d' ->{
                    System.out.println("Wrong Answer!!!\\nThe Correct Answer is Option B");
                }
             default ->{
                System.out.println("Invalid Input");
            WrongAnswers +=1;
            }
        }

        // Displaying Score
        System.out.println("Your Total Score is: " + Score);
        System.out.println("Correct Answer: " + CorrectAnswers);
        System.out.println("Wrong Answers: " + WrongAnswers);

        // Play Again
        System.out.println("Do you want to play again? (Yes/No)");
        String PlayAgain = obj.next().toLowerCase();//
        if (PlayAgain.equals("yes")) {
            System.out.println();
            main(args);
        } else {
            System.out.println("Thanks for playing");
        }
        obj.close();
    }
}

