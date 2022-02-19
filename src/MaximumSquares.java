public class MaximumSquares {

    public int maximalSquare(char[][] matrix) {
        int max = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++)
                if(matrix[i][j] == '1')
                {  int temp = isOnesSquare(matrix, i,j);
                    // System.out.println(temp);
                    if(temp*temp > max)
                        max = temp*temp;
                }
        }
        //int val = isOnesSquare(matrix, i,j,i+1,j+1);
        return max;
    }

    public static int isOnesSquare(char[][] matrix, int i, int j){
        int iL = i+1;
        int jL = j+1;
        int iD = i;
        while(i< iL){
                for(; i < iL ; i++){
                    for(;j < jL ; j++)
                        if(matrix[i][j] != '1'){
                            return i - iD ;
                        }

                }

            if(iL == jL){
                iL++;
                continue;
            }
            else if(iL > jL){
                jL++;
                continue;
            }
//            if(iL < matrix.length && i < iL && j < jL && jL < matrix[0].length)
//                continue;
//            else
//                break;
        }
        return i - iD;

    }
}
