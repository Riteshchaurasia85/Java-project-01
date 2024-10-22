
import java.util.Random;
import java.util.Scanner;

 class Game{

     public int number;
     public int input;
     public int Guessno = 0;

     public int getGuessno() {
         return Guessno;
     }

     public void setGuessno(int Guessno) {
         this.Guessno = Guessno;
     }
     Game(){
         Random rand = new Random();
         this.number= rand.nextInt(100);
     }
     void userinput(){
         System.out.println("Guess the number");
         Scanner sc = new Scanner(System.in);
         input = sc.nextInt();
     }
     boolean correctnumber(){
         Guessno++;
         if(input==number){
             System.out.format("You are guessed no. , it was %d\n you guessed if in %d attempt\n",number,Guessno);
             System.out.println(" Congratulations! you are win");
             return true;

         }
         else if (input<number) {
             System.out.println("Too low....");

         }
         else if (input>number) {
             System.out.println("Too high.......");
         }
         return false;
     }
 }
public class RC_NumberGuess_Game {
    public static void main(String[] args) {
        Game g =new Game();
        boolean b =false;
        while(!b){
            g.userinput();
            b=g.correctnumber();
        }
    }
}
