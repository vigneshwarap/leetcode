import java.util.HashMap;

public class Fruit_Into_Baskets_904 {

    public int totalFruit(int[] fruits) {
        int left = 0, right = 0, maxFruit = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        while (right < fruits.length) {
            freqMap.put(fruits[right], freqMap.getOrDefault(fruits[right], 0) + 1);

            if (freqMap.size() <= 2) {
                maxFruit = Math.max(maxFruit, right - left + 1);
            }

            if (freqMap.size() > 2) {
                if (freqMap.get(fruits[left]) == 1) {
                    freqMap.remove(fruits[left]);
                } else {
                    freqMap.put(fruits[left], freqMap.get(fruits[left]) - 1);
                }
                left++;
            }

            right++;
        }
        return maxFruit;
    }


    public int totalFruit1(int[] fruits) {
        int left = 0, right = 0, maxFruit = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        while(right < fruits.length) {

            freqMap.put(fruits[right], freqMap.getOrDefault(fruits[right], 0) + 1);

            if (freqMap.size() <= 2) {
                maxFruit = Math.max(maxFruit, right - left + 1);
            }

            while(freqMap.size() > 2) {
                if (freqMap.get(fruits[left]) == 1) {
                    freqMap.remove(fruits[left]);
                } else {
                    freqMap.put(fruits[left], freqMap.get(fruits[left]) - 1);
                }
                left++;
            }
            right++;
        }

        return maxFruit;
    }



    public static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};

        Fruit_Into_Baskets_904 obj = new Fruit_Into_Baskets_904();
        System.out.println(obj.totalFruit(fruits));
    }
}
