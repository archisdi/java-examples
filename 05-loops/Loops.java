import java.util.ArrayList;

class Loops {

  public static void main(String[] args) {

    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(63.99);
    expenses.add(10.57);
    expenses.add(81.37);

    double mostExpensive = 0;
    double total = 0;

    // the while loop
    // while(true){
    // do
    //
    // }

    // for loop
    for (double expense : expenses) {
      if (expense > mostExpensive) {
        mostExpensive = expense;
      }
    }

    // for i loop
    for (int i = 0; i < expenses.size(); i++) {
      total += expenses.get(i);
    }

    System.out.println(mostExpensive);

  }

}