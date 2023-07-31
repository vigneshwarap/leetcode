import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Minimum_Index_Sum_of_Two_Lists_599 {
    /*Two for solution */
    public static String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < list1.length; i++) {
            for(int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if((i+j)< min) {
                        min = i+j;
                        ans.clear();
                        ans.add(list1[i]);
                    } else if((i+j) == min) {
                        ans.add(list1[i]);
                    }
                }
            }
        }
        return ans.toArray(new String[ans.size()]);
    }

    /* HashMap solution
    * efficient one
    * */
    public static String[] findRestaurant1(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            map.putIfAbsent(list1[i],i);
        }
        List<String> ans = new ArrayList<>();
        for(int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int i = map.get(list2[j]);
                if((i+j)< min) {
                    min = i+j;
                    ans.clear();
                    ans.add(list1[i]);
                } else if((i+j) == min) {
                    ans.add(list1[i]);
                }
            }
        }

        return ans.toArray(new String[ans.size()]);
    }

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"}, list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}, result;
        result = findRestaurant1(list1,list2);
        System.out.println(Arrays.toString(result));
    }
}
