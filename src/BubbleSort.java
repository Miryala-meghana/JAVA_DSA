public class BubbleSort {
    public static void bubble(int nums[])
    {
        int size= nums.length;
        System.out.print(" ");
        for(int i=0;i<size;i++)
        {
            System.out.print("\npass "+i+":\n");
            for (int j=0;j<size-1;j++)
            {

                if(nums[j] > nums[j+1])
                {
                    int temp=0;
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
//                System.out.print("\nparse "+i+":\n");
                for(int num:nums)
                {
                    System.out.print(num+" ");
                }
                System.out.print("\n");
            }
        }
    }


    public static void main(String[] args)
    {
        int nums[]={10,2,13,25,8,3};
        System.out.println("before sorting elements are:");

        for(int num:nums)
        {
            System.out.print(num+" ");
        }
        bubble(nums);

        System.out.println("\n After sorting elements are:");

        for(int num:nums)
        {
            System.out.print(num+" ");
        }

    }

}
