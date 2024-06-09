package lectures.lesson4;

public class BinarySearch {
   public static void main(String[] args){
       int[] array = { 5, 2, 100, 50, 75, 12, 89, 51, 36, 28, 99 };
       System.out.println(recursiveBinarySearch(array,12));
   }
   public static int recursiveBinarySearch(int[] a, int target){
       return getBinarySearch(a,target,0, a.length-1);
   }

   private static int getBinarySearch(int[] a, int target, int lowerBound, int upperBound){
        int mid = (lowerBound + upperBound) / 2;
        if(lowerBound > upperBound) return -1;
        if(a[mid] == target) return mid;
        if(target > mid){// target is on right side{
            return getBinarySearch(a,target,mid+1,lowerBound);
        }else{  // target is on left side
            return getBinarySearch(a,target,lowerBound , mid - 1);
        }
   }
}
