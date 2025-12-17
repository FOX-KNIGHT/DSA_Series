import java.util.*;
public class Helpful_math {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int c1=0,c2=0,c3=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                c1++;
            }else if(str.charAt(i)=='2'){
                c2++;
            }else if(str.charAt(i)=='3'){
                c3++;
            }else{
                System.out.println("Invalid Input");
                return;
            }
        }
        String res="";
        for(int i=0;i<c1;i++){
            res+="1+";
        }
        for(int i=0;i<c2;i++){
            res+="2+";
        }
        for(int i=0;i<c3;i++){
            res+="3+";
        }
        System.out.println(res.substring(0,res.length()-1));
    }
}
