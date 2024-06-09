package lectures.lesson4;

public class LinearSearch {

    public static void main(String[] args){
        int[] a = {4,3,5,3,63,50,20, 40,1,7};
        System.out.println(linearSearch(a, 50));
    }

    public static int linearSearch(int[] a, int target){
        return linearSearchIndex(a,target,0);
    }

    private static int linearSearchIndex(int[] a, int target, int pos){
        if(a.length == 0) return -1;
        if(pos >= a.length) return -1;
        if(target == a[pos]) return pos;
        return linearSearchIndex(a,target,pos+1);
    }
//    public static void main(String[] args) {
//        Object[] items = {1,4,6,830,5};
//        System.out.println(linearSearch(items,6));
//    }
//    public static int linearSearch(Object[] items, Object target){
//        return getLinearSearch(items,target,0);
//    }
//
//    private static int getLinearSearch(Object[] items,Object target, int pos){
//        if(items.length == pos){
//            return -1;
//        }else if ( target.equals(items[pos])){
//            return pos;
//        }else{
//            return getLinearSearch(items,target,pos+1);
//        }
//    }

}
