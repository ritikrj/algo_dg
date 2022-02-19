public class SortingAlgos {
    public static void insertionSort(Comparable[] a){
      for (int i= 1; i < a.length; i++ ){
          for (int j = i; j > 0 && less( a[j],a[j-1]); j--){
              exchange(a, j, j-1);
          }
      }

    }

    public static void selectionSort(Comparable[] a){
        for(int i =0; i < a.length ; i++){
            Comparable min = a[i];
            for( int j= i+1; j < a.length ; j++ ){
                if(less(a[j], min)){
                    exchange(a, i, j);
            }}
        }

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

    public static void merge(Comparable[] a, int low, int mid, int hi){
        Comparable[] aux = new Comparable[a.length];
        int i = low, j = mid+1;

        for(int k = low; k <= hi; k++){
            aux[k] = a[k];
        }

        for(int k = low ; k<= hi; k++){
            if( i > mid) a[k] = aux[j++];
            else if(j > hi) a[k] = aux[i++];
            else if(less(aux[j], aux[i])) a[k] = aux[j++];
            else  a[k] = aux[i++];
        }
    }

    public static void sort(Comparable[] a, int low, int hi){
        if(hi <= low) return;

        int mid = low +(hi - low)/2;
        sort(a, low, mid);
        sort(a, mid+1, hi);
        merge(a, low, mid, hi);
    }

    public static void main(String[] args) {
        String[] a = {"D","A","F","C","I","K","L","Z", "Y"};
        //insertionSort(a);
        Stopwatch timer = new Stopwatch();
        sort(a,0, a.length-1);
        System.out.println("time->"+timer.elapsedTime());
        show(a);
    }

}
