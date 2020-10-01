package CodingBat;

public class without2 {
    public static void main(String[] args) {
        String str = "HelloHe";
        String s = "";
        if(str.length() >2){
            System.out.println("true");
            if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()-1))){
                System.out.println(true);
                s=str.substring(2);
                System.out.println(s);}
        else
                System.out.println("false");
        }
    }
    public String without2(String str) {
        String s = "";
        if(str.length() >2){
            if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()-1))){
                s=str.substring(2);
                return s;
            }
            else{
                return str;
            }
        }

        else
            return s;
    }

}
