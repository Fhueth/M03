
public class Ex06_Matriu {
    public static void main(String[] args) {
        int[][] matriu= new int[4][10];
       
        //entrada
        for (int i = 0; i < 10; i++) {
            matriu[0][i]=(i+1)*2;
            matriu[1][i]=(i+1)*(i+1);
            matriu[2][i]=matriu[0][i]-matriu[1][i];
            matriu[3][i]=matriu[0][i]+matriu[1][i]+matriu[2][i];
        }
       
        //sortida
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("\t"+matriu[i][j]);
            }
            System.out.println("");
        }
       
    }
   
}