import java.util.List;

public class Permutator {

    public static void permute(int pos, int[] arr, List<int[]> list){
        int[] local = arr.clone();
        int i = pos;
        while(i < local.length){
            swap(local,pos,i);
            permute(pos+1, local, list);
            i++;
        }
        if(pos == local.length) list.add(local);
        "mohita".replace(".",",");
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
