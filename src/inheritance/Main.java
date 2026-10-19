package inheritance;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    boolean test=false;   int index=0;
    int temp;
     void main() {

//        new Student();
     int[]   nums = {2,7,11,15};
        int target = 9;

        int index1 , index2;
        for(int i=0; i<nums.length; i++){
            int a = nums[i];

            if (target > a){
                temp = target - a;
            }
           test = Arrays.stream(nums).anyMatch(value -> value == temp);
             index = IntStream.range(0, nums.length)
                    .filter(ind -> nums[ind] == temp)
                    .findFirst()
                    .orElse(-1);
//            for(int j=i+1; j<nums.length; j++){
//                if(a + nums[j] == target){
//                    index1 = i;
//                    index2 = j;
//                    System.out.println("found at [ " + index1 + "," + index2 + " ]");
//                    return;
//                }
//            }
        }

        System.out.println(test);
        System.out.println(index);
    }
}
