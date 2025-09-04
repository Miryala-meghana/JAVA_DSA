import static java.io.ObjectInputFilter.merge;
import static java.io.ObjectInputFilter.rejectUndecidedClass;

public class MergeSort {
    public static void main(String[] args) {
        int nums[] = {10, 2, 13, 25, 8, 3};
        System.out.println("before sorting elements are:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
        mergesort(nums,0,nums.length-1);

        System.out.println("\n After sorting elements are:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

    private static void mergesort(int[] nums, int l, int r) {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergesort(nums,l,mid);
            mergesort(nums,mid+1,r);

            mergee(nums,l,mid,r);
        }
    }

    private static void mergee(int[] nums, int l, int mid, int r) {
        int n1=mid-l+1;
        int n2=r-mid;

        int LArr[]=new int[n1];
        int RArr[]=new int[n2];

        for(int x=0;x<n1;x++)
        {
            LArr[x]=nums[l+x];
        }

        for(int x=0;x<n2;x++)
        {
            RArr[x]=nums[mid+1+x];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2)
        {
          if(LArr[i]<=RArr[j])
          {
              nums[k]=LArr[i];
              i++;
          }
          else {
              nums[k]=RArr[j];
              j++;
          }
          k++;
        }
       while(i<n1)
       {
           nums[k]=LArr[i];
           i++;
           k++;
       }
        while(j<n2)
        {
            nums[k]=RArr[j];
            j++;
            k++;
        }

    }


}
