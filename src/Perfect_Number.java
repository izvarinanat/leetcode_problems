import java.util.ArrayList;

public class Perfect_Number {
    public static void main(String[] args) {
        int num = 120;
        int sum=0;
        Boolean perfect = true;
        for (int i=1; i<num; i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if (sum != num)
            perfect = false;
        System.out.println(perfect);
    }
}
