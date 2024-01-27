public class Order_Agnostic_Binary_Search {
    
    public static void main(String[] args) {
        

        // Ascending Sorted Array
        int[] arr1 = {2,3,4,5,68,69,71};
        int target1 = 68;

        int ans1 = Order_Agnostic_BS(arr1, target1);
        System.out.println(ans1);

        // Descendind Sorted Array
        int[] arr2 = {71,70,33,22,11,10};
        int target2 = 71;

        int ans2 = Order_Agnostic_BS(arr2, target2);
        System.out.println(ans2);

    }


    

    static int Order_Agnostic_BS(int[] arr , int target){

        int start = 0;
        int end = arr.length-1;


        // Check if the Array is inAscending or Descending Order
            boolean isAsc;
            if(arr[start] < arr[end]){
                isAsc = true;
            } else {
                isAsc = false;
            }


        // Loop iteration for the given Array
         while(start <= end)
         {

             int mid = start + (end -start)/2; // finding mid

             // if the target elemnet found at mid itself , then rturn the mid which will be our answer.
             if(arr[mid]== target){ 

                return mid;
             }

             // if/else for Asc or Desc sorted Array 
             if(isAsc){

                if(target < arr[mid]){  
                     end = mid -1;
                }
                else{
                    start = mid+1;
                }
             } else {
                if(target > arr[mid] )
                {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }         
         return -1;
    }

   
}
