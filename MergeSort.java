public class MergeSort {

   public int[] mergeSort(int[] values){
       if(values.length <= 1)
           return values;
       else{
           int[] leftHalf = new int[values.length/2];
           int[] rightHalf = new int[values.length - leftHalf.length];
           for(int x = 0; x < leftHalf.length; x++){
               leftHalf[x] = values[x];
           }
           for(int x = leftHalf.length; x < values.length; x++){
               rightHalf[x-leftHalf.length] = values[x];
           }
           mergeSort(leftHalf);
           mergeSort(rightHalf);
           return merge(leftHalf, rightHalf, values);
       }
   }
   public int[] merge(int [] l, int[] r, int[] v){
    int indexL = 0;
    int indexR = 0;
    for( int x = 0; x<v.length && indexL<l.length && indexR< r.length; x++)
        if (l[indexL]<r[indexR]){
            v[x] = l[indexL];
            indexL++;

        } else{
            v[x] = r[indexR];
            indexR++;

        }
    return v; 
         
   }
   public void print(int[] arr){
       for (int x : arr)
           System.out.print(x + ", ");
       System.out.println();
   }
   public static void main(String[] args) {
       MergeSort m = new MergeSort();
       int[] c = m.mergeSort(new int[]{10,5,7,6,2,9});
       m.print(c);
   }
}



