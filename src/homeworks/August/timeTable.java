package homeworks.August;

public class timeTable {
    public static void main(String[] args) {
        int p=1;
        System.out.print("* | ");
        for(int i = 1;i<=10;i++){
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------");
        for(int i =1;i<=10;i++){
            System.out.print(i + " | ");
            for(int j=1;j<=10;j++){
                p=i*j;
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
