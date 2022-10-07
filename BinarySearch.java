import java.util.*;
public class Solution {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    //array input
    for(int i = 0;i<n;i++){
      nums[i] = sc.nextInt();
    }
    
    // target to find int array
    int target = sc.nextInt();
    System.out.println(search(nums,target));
  }
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while(i<=j){
            int mid = (i+j)/2;
          //if found return index
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target) j = mid-1;
            else i = mid+1;
        }
      //if not found return -1;
        return -1;
    }
}
