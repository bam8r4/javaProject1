import java.util.Scanner;

public class Projectone {

    public static void main(String[] args) {

       int hour = 0;
       int minute = 0;

       boolean wrong_Input = true;

       System.out.println("Enter a valid time in this format HH MM");
       //Scanner time = new Scanner(System.in);

       while(wrong_Input){

          Scanner time = new Scanner(System.in);

        try
        {
          hour = time.nextInt();
          minute = time.nextInt();
          wrong_Input = false;
        }
        catch(Exception e)
        {
            System.out.println("That was an incorrect format. Enter integers in the format HH MM");

        }

      }

       if(minute==60)
       {
         ++hour;
         minute = 0;
       }

       if(hour==24 && minute>0)
       {
         hour = 0;
       }


       if(minute>=0 && minute<60)
       {
         if(minute>45)
         {
           minute = minute - 45;
         }
         else
         {
           minute = minute + 15;
           --hour;
         }
       }
       else
       {
         System.out.println("Your value for minutes must be valid. Within the range of 0-59.");
         System.exit(1);
       }

       if(hour<0 && hour>24)
       {
         System.out.println("Your value for hours must be valid. Within the range of 0-24.");
         System.exit(1);
       }


        System.out.println("The new time for Steve to wake up is: " + hour + " " + minute);

    }
}
