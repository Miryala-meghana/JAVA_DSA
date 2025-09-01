public class QuickSort {

    public static void quicksort(int[] arr, int low, int high){
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);

        }
    }

    private static int partition(int[] arr, int low, int high)
    {
        int pivot=arr[high];
        int i=low-1;
        int temp;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public static void main(String[] args)
    {
       int arr[]={10,3,27,34,32,70};
        System.out.println("Before sorting");
        for(int num:arr)
        {
            System.out.print(num+" ");
        }

       quicksort(arr,0, arr.length-1);

        System.out.println(" \nAfter sorting");
       for(int num:arr)
       {
           System.out.print(num+" ");
       }
    }
}
