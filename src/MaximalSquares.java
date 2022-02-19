public class MaximalSquares {

    public int maximalSquare(char[][] matrix) {
        return isOnesSquare(matrix, 0,0,1,1);
    }

    public static int isOnesSquare(char[][] matrix, int i, int j , int iL, int jL){
        if(!valid(matrix, i, j , iL, jL) )
            return 0;

        if(i < matrix.length -1 && j < matrix[0].length -1){
            return Math.max(1+ isOnesSquare(matrix, i, j , iL+1, jL+1),
                    Math.max(isOnesSquare(matrix, i+1, j , iL, jL),
                            isOnesSquare(matrix, i, j+1 , iL, jL)));
        }else{
            return Math.max(isOnesSquare(matrix, i+1, j , iL, jL),
                    isOnesSquare(matrix, i+1, j , iL, jL));
        }

    }

    public static boolean valid(char[][] matrix, int i, int j , int iL, int jL){
        System.out.println("validating");
        if(iL >= matrix.length || i >= matrix.length ) return false;
        if(matrix.length > 0 &&( jL > matrix[0].length || j >= matrix[0].length) ) return false;
        for(int k =i  ; k < iL ; k++){
            for(int l = j; l < jL; l++){
                if(matrix[k][l] != '1')
                    return false;
            }
        }
        return true;
    }
}
