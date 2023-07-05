public class Matrices2
{
    public void flipVertical (int mat [][]){
        int c = mat.length -1;
        int aux = 0;
        for(int i = 0; i < mat.length;i++){
            for(int j = 0; j<mat[0][0]; j++){
                if(i<c){
                    aux = mat[j][i];
                    mat[j][i] = mat[j][c];
                    mat[j][c] = aux;
                }
            }
            c--;
        }
    }
}
