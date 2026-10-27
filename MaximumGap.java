import java.util.*;
class MaximumGap{
public static int maximumGap(int[] nums){
    int n = nums.length;
    if(n == 1){
        return 0;
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < nums.length; i++){
        list.add(nums[i]);
    }
    Collections.sort(list);
    int currentDiff = 0;
    int maxDiff = 0;
    int left = 0;
    int right = left + 1;
    while(left < right && right < n ){
        currentDiff = list.get(right) - list.get(left);
         maxDiff = Math.max(currentDiff, maxDiff);
         left++;
         right++;
    }
   return maxDiff;

}


public static void main(String[] args){
    int[] nums = {3, 6, 9, 1};
    System.out.println(maximumGap(nums));

}
}