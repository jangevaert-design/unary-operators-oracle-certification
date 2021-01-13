package edu.cnm.deepdive;

public class UnaryOperators {

  public static void main(String[] args) {
    double y = 10;
    y = - y;// this compiles; you simply make the initial value of y negative (y = -1 * y).

    boolean a = true;
    boolean b = !a;// b is false.
    b = !b;//compiles!

    //increment and decrement operators have a higher order than arithmetic operators.
      int myInt = 5;
      int myOtherint = ++myInt;
    System.out.println("myInt = " + myInt + "myOtherInt = " + myOtherint);// both will be printed
    //as sic because myInt is incremented to six before being assigned to myOtherInt.

    int newInt = 5;
    int newOtherInt = newInt++;//since the increment operator comes after newInt, newInt will be
    //assigned as 5 to newOtherInt and only then will newInt be incremented to 6.

    int count = 0;
    System.out.println(count);//prints 0.
    System.out.println(++count);//prints 1 since we incremented before printing.
    System.out.println(count);// prints 1 because of line 25.
    System.out.println(count--);//prints 1 and will only after decrement.
    System.out.println(count);//prints 0 because of line 27.



  }
}
