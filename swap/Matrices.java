public class Matrices
{
    public void swap(int mat[][], int i, int j){
        int aux = 0;
        for(int a = 0; a<mat.length; a++){
            aux = mat[i][a];
            mat[i][a] = mat[j][a];
            mat[j][a] = aux;
        }
    }
}
