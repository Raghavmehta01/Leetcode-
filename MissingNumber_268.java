public class MissingNumber_268 {

    public static void sorted(int[] nums){
        int i=0;
        while(i<nums.length ){
            int correct = nums[i];
            if (correct < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;

            }
            else{
                i++;
            }
        }
        

    }
    public static void miss(int[] nums){
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=i){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Missing number: " + nums.length);
        }
    public static void main(String[] args) {
        int[] nums ={2,0,1};
        sorted(nums);
        miss(nums);
    }
}
