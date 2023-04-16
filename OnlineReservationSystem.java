// package OasisInfobyte2
import java.util.Scanner;
public class OnlineReservationSystem
{
    private static boolean [] seats =new boolean[50];
    public static void main(String args[])
    {
        System.out.println("welcome to reservation system...");
        Scanner sc = new Scanner(System.in);
         while(true)
         {
            System.out.println("Enter your choice");
            System.out.println("1. view seat map");
            System.out.println("2. Reservation seats");
            System.out.println("3.cancel seats");
            System.out.println("4.Exit");
            int option = sc.nextInt();

            switch (option) {

                case 1:
                    vSM();
                    break;

                case 2:
                    rese();
                    break;

                case 3:
                    can();
                    break;

                case 4:
                    System.exit(0); // exit the program

                default:
                    System.out.println("Invalid option!");
            }
            

         }
    }
    private static void vSM()
        {
            System.out.println("\n current seats map");
            for(int i=0; i < seats.length;i++)
            {
                if(seats[i])
                {
                    System.out.println("already reserved");

                }
                else
                {
                    System.out.println((i+1)+ " ");
                }
            }
            System.out.println();
        }
        private static void rese() 
        {
        
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter seat number (1-50): ");
            int seatNumber = sc.nextInt();
            if (seatNumber < 1 || seatNumber > 50) 
            {
                System.out.println("Invalid seat number...");
            } else if (seats[seatNumber - 1]) 

            {
              
                System.out.println("Seat already reserved....");

            } else
            
            {
                seats[seatNumber - 1] = true;
                System.out.println("Seat reserved.....");
            }
        }
    
        private static void can() 
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter seat number (1-50): ");
            int seatNumber = sc.nextInt();
            if (seatNumber < 1 || seatNumber > 50)
            {
                System.out.println("Invalid seat number...");
            } else if (!seats[seatNumber - 1]) 
            {
                System.out.println("Seat not reserved....");
            } else
            {
                seats[seatNumber - 1] = false;
                System.out.println("Reservation canceled....");
            }
        }


}