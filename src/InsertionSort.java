public class InsertionSort {

    public static void main(String[] args)
    {
        int nums[]={10,2,13,25,8,3};
        System.out.println("before sorting elements are:");

        for(int num:nums)
        {
            System.out.print(num+" ");
        }
//        insetionsorting(nums);
        insetionsorting(nums);

        System.out.println("\n After sorting elements are:");

        for(int num:nums)
        {
            System.out.print(num+" ");
        }

    }
    public static void insetionsorting(int nums[])
    {

        for (int i=1;i<nums.length;i++)
        {
           int key =nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key )
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }

    }
}
