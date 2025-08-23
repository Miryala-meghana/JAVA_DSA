import java.util.Arrays;

import static java.util.Arrays.sort;

public class Search {
    public static void main(String args[])
    {
        int num[]={2,4,5,6,9,10,12,34,45,56};
        int key=12;

        int res=linesrSearch(num,key);
        int res1=binarySearch(num,key);
        int res2=recursiveBinarySearch(num,key,0,num.length-1);

//        searching via linear search
        if(res==-1)
            System.out.println("not found");
        else
            System.out.println("found at index :linear"+res);
//        searching via Binary linear search
        if(res1==-1)
            System.out.println("not found");
        else
            System.out.println("found at index :binary"+res1);

//        searching via recursive binary search
        if(res2==-1)
            System.out.println("not found");
        else
            System.out.println("found at index :rec binary"+res2);
    }



//method for linear search

    public static int linesrSearch(int[] num, int key) {

        for(int i=0;i<num.length;i++)
        {
            if (num[i]==key)
                return i;
        }
        return -1;
    }

//method for Binary search.

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


//    method for recursive binary search
private static int recursiveBinarySearch(int[] num, int key,int left,int right) {
//    int num[]={2,4,5,6,9,10,12,34,45,56};
            if (left>right)
               return -1;
            else{
            int mid=(left+right)/2;
            if (num[mid]==key){
                System.out.println(mid +" "+key);
                return mid;}
            else if(num[mid] < key)
                return  recursiveBinarySearch(num,key,mid+1,right);
            else
                return recursiveBinarySearch(num,key,left,mid-1);
            }

}

}
