public class Main {

   public static void main(String []args) {
      // DECLARE 2D Array with Type[][]
      int[][] coordinates;
      // CREATE 2D Array of a certain number
      // of ROWS and COLUMNS
      coordinates = new int[5][5];
      // Default values for int: 0
      // TOTAL NUM OF ELEMENTS = row*col = 25


      // INITIALIZE (Declare + Create)
      String[][] seatingChart = new String[3][4];
      // Default values for String: null
      // TOTAL NUM OF ELEMENTS = row*col = 12

      // SET VALUES in a 2D Array
      seatingChart[0][0] = "Jackson";
      seatingChart[1][0]= "Finny";
      seatingChart[2][0]= "Bryce";
      seatingChart[2][1]= "Natalie";
      seatingChart[2][2]= "Paige";
      seatingChart[2][3]= "Zoie";
      seatingChart[1][3]= "Alex";
      seatingChart[0][3]= "Maia";
      System.out.println(seatingChart);

   }
}
