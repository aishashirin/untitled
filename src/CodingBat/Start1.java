package CodingBat;

public class Start1 {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {1,3};
        Start1 start1 = new Start1();
        System.out.println(start1.start1(a,b));
    }
    public int start1(int[] a, int[] b) {
    int c=0;
    for(int i = 0 ; i<a.length; i++){
        if(a[i] == 1){
            c++;
        } }
        for (int j = 0; j<b.length; j++){

            if(b[j] == 1){
                c++;
            }
        }

    return c;
    }
}
