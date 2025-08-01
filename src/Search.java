import java.util.Arrays;

import static java.util.Arrays.sort;

public class Search {
    public static void main(String args[])
    {
        int num[]={2,4,5,6,9};
        int key=9;

        int res=linesrSearch(num,key);
        int res1=binarySearch(num,key);
        if(res==-1)
            System.out.println("not found");
        else
            System.out.println("found at index "+res);

        if(res1==-1)
            System.out.println("not found");
        else
            System.out.println("found at index "+res);
    }



    public static int linesrSearch(int[] num, int key) {

        for(int i=0;i<num.length;i++)
        {
            if (num[i]==key)
                return i;
        }
        return -1;
    }



    private static int binarySearch(int[] num, int key) {

//        {2,4,5,6,9}
       int left=0;
       int right= num.length-1;

       while(left <= right)
       {
           int mid=(left+right)/2;
           if(num[mid]==key)
           {
               return mid;
           }
           else if(key < num[mid]){
           right=mid-1;
           }
           else{
               left=mid+1;
           }
       }

       return -1;
    }

}
