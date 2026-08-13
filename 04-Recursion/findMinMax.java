import java.util.ArrayList;

class FindMinMax {

    public ArrayList<Integer> findminmax(int[] arr, int i) {

        // Base case
        if (i == arr.length - 1) {
            ArrayList<Integer> base = new ArrayList<>();
            base.add(arr[i]); 
            base.add(arr[i]); 
            return base;
        }

        // Recursive call
        ArrayList<Integer> base = findminmax(arr, i + 1);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(Math.min(arr[i], base.get(0))); 
        list.add(Math.max(arr[i], base.get(1))); 

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        FindMinMax obj = new FindMinMax();

        ArrayList<Integer> res = obj.findminmax(arr, 0);

        System.out.println(res.get(0) + " " + res.get(1));
    }
}