import java.util.Scanner;
public class Elevator {

    private int currentFloor;

    public void run() {
        currentFloor = 1 + ((int) (Math.random() * 10));
        Scanner Keyboard = new Scanner(System.in);


        System.out.println("The elevator is now on floor " + currentFloor);
        System.out.print("Which floor are you at now (0-10) where 0 = basement: ");
        int personFloor = Keyboard.nextInt();
        moveTo(personFloor);
        System.out.println("Enter the elevator");

        System.out.println("To which floor do you want to go (0-10) where 0 = basement");
        int destinationFloor = Keyboard.nextInt();
        moveTo(destinationFloor);
        System.out.println("Leave the elevator");


/*    }*/
/*    private int CheckBeforeInput(int destinationFloor) {*/
/*        int currentposition = Integer.parseInt("B3b")*/
/*        boolean valid = false;*/
/*        while (!valid){*/
/*            */
/*        }*/
/*        if (destinationFloor == currentFloor) {*/
/*
*/

/*
*/

/*    }*/
 //      return currentFloor;
    }


    private void moveTo(int destinationFloor) {
        if (destinationFloor == currentFloor) {
      /* nothing to do */
        } else if (destinationFloor > currentFloor) {
            moveUpTo(destinationFloor);
        } else {
            moveDownTo(destinationFloor);
        }
    }
    private void CrashElevator(int destinationFloor) {
        if (destinationFloor > currentFloor) {
      /* nothing to do */
        } else if (destinationFloor > currentFloor) {
            moveUpTo(destinationFloor);
        } else {
            moveDownTo(destinationFloor);
        }
    }

    private void moveUpTo(int destinationFloor)  {

        System.out.println("The elevator is on its way up ...");
        while (currentFloor < destinationFloor) {
            currentFloor++;
            System.out.println(currentFloor);
        }
        System.out.println("The elevator has arrived");
    }

    private void moveDownTo(int destinationFloor) {
        System.out.println("The elevator is on its way down ...");
        while (currentFloor > destinationFloor) {
            currentFloor--;
            System.out.println(currentFloor);
        }
        System.out.println("The elevator has arrived");
    }

    public static void main(String[] args) {
        new Elevator().run();
    }

}