class Search_Insert_Position {
    public static void main(String[] args)
    {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        int len = nums.length;
        int left = 0;
        int right = len-1;
        while(left <= right){
            int middle = left + (right-left)/2;
            if(target < nums[middle]){
                right = middle-1;
            }else if(target > nums[middle]){
                left = middle+1;
            }else {
                System.out.println(middle);
                break;
            }
        }
        System.out.println(right+1);
    }
}