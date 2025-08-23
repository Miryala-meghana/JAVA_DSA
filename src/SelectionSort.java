public class SelectionSort {
    public static void selection(int nums[])
    {
        int temp=0;
        int minIndex=-1;
        int size= nums.length;
        System.out.print(" ");
        for(int i=0;i<size-1;i++)
        {
            System.out.print("\npass "+i+":\n");
            for (int j=i;j<size;j++)
            {
              minIndex=i;
              if(nums[minIndex] > nums[j])
              {
                  minIndex=j;
              }
              temp=nums[minIndex];
              nums[minIndex]=nums[i];
              nums[i]=temp;
            }

            for(int num:nums)
            {
                System.out.print(num+" ");
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
        selection(nums);

        System.out.println("\n After sorting elements are:");

        for(int num:nums)
        {
            System.out.print(num+" ");
        }

    }

}
