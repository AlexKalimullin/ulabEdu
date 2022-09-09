/*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
*/

package homework;

import java.util.HashMap;
import java.util.Map;

public class task2 {

    public static void findPair(int[] nums, int number) {

        try {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(number - nums[i])) {
                    System.out.printf("[%d, %d]",
                            nums[map.get(number - nums[i])], nums[i]);
                    return;
                }
                map.put(nums[i], i);
            }
            System.out.println("Pair not found");
        } catch (Exception e){
            System.out.println("Pair not found");
        }
    }

    public static void main (String[] args)
    {
        int[] arr = {3, 4, 2, 7};
        int number = 10;

        findPair(arr, number);
    }
}
