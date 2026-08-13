
import java.util.Arrays;

public class sizeTri {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        tri(A);
    }
    public static void tri(int[] a){
        if(a.length<1){
            return;
        }
        int[] temp=new int[a.length-1];
        for (int idx = 0; idx < a.length-1; idx++) {
            int x=a[idx]+a[idx+1];
            temp[idx]=x;
        }
            tri(temp);

            System.out.println(Arrays.toString(a));
            
        
    }
}
