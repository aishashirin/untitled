package homeworks.August;

public class CheckPassFail {
    public static void main(String[] args) {
        int mark = 49;   // Set the value of "mark" here!
        System.out.println("The mark is " + mark);
        passedOrFailed(mark);
    }

    public static void passedOrFailed (int mark){
      if (mark >= 50 ) {
        System.out.println("Congratulations, exam passed!");
    } else {
        System.out.println( "Exam failed.");
    }

}
}


