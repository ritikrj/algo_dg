public class QuickSort {

    public static void sort(Comparable[] a, int lo, int hi){
       if(hi<=lo) return;
       int partition = partition(a,lo,hi);
       sort(a,lo,partition -1);
       sort(a, partition+1, hi);

    }

//    public static int partition(Comparable[] a, int lo, int hi){
//        int partition = (lo+hi)/2;
//        Comparable[] aux = new Comparable[a.length];
//        for(int i =lo; i<=hi ;i++){
//            aux[i] = a[i];
//        }
//
//        for(int i = lo; i <= hi; i++){
//            if(a[i] < )
//        }
//      return (lo+hi)/2;
//    }

    private static int partition(Comparable[] a, int lo, int hi)
    { // Partition into a[lo..i-1], a[i], a[i+1..hi].
        int i = lo, j = hi+1; // left and right scan indices
        Comparable v = a[lo]; // partitioning item
        while (true)
        { // Scan right, scan left, check for scan complete, and exchange.
            while (less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exchange(a, i, j);
        }
        exchange(a, lo, j); // Put v = a[j] into position
        return j; // with a[lo..j-1] <= a[j] <= a[j+1..hi].
    }

    public static void main(String[] args) {
      Comparable[] entry = {1,8,3,4,3,6};
      sort(entry, 0 , entry.length-1);
      show(entry);
    }

    public static boolean less( Comparable i, Comparable j){
        return i.compareTo(j) > 0;

    }
    public static void exchange(Comparable[] a,int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void show(Comparable[] a){
        for(int i=0; i < a.length ;i++){
            System.out.println(a[i]);
        }
    }
}
