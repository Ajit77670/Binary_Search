/* 
// Point 1:
* WHY BINARY SEARCH ---- Bcuz the time complexity is much more efficient in compare to all the Search technique.
* Time complexity of Binary Serach : log(N)

// Point 2: 
* Binary Search is only applicable for sorted Arrays or sorted elemnts.

// Binary Serach Concept:
*Let say we have a given array int[] arr = {2,3,4,5,6,7,8} and we need to find the target elment let say 6.
* We need the following terms in order to find our target element : start , end and mid indexes of the array.

// Steps for Binary Search :
*First we need to find the middle(mid) element. i.e (start index + end index)/2
*if the target element is > mid element , it means the target element lies to the right side , in this case the new start will be mid+1
*if the target element is < mid element , it means the target element lies to the left side, in this case the start will remain the same , end become , mid-1.
*/ 


public class Binary_Search {
    
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,67,78,79};
        int target = 67;

       int ans = binarySearch(arr, target);
        
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){

    int start = 0;

    int end = arr.length-1 ;


      while(start<=end){

        //find the middle element
        int mid = start + (end-start)/2 ; 
       
        // To find the mid value , ideally we should use the formula mid =(start + end)/2. But here we have taken start + ( end - start)/2 , 
        //bcuz if the start and end having the larger difference it will cross the range of data type int hence to minimize we are using (end - start).
    


        if( target < arr[mid]){

            end = mid -1;
             
            }
            else if (target > arr[mid]){
    
                start = mid+1; 
            } else {

                //ans found
                return mid;
            }
      }  

      return -1;

    }       
            
}
