public class TwoD_Array {
    public static void main(String[] args) {
        float fltArrA[][] = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        float fltArrB[][] = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
        float fltArrC [][] = new float [3][3];
        int intCntI = 0;
        int intCntJ = 0;
        for(intCntI = 0; intCntI < 3; intCntI++){
            for(intCntJ = 0; intCntJ < 3; intCntJ++){
                fltArrC[intCntI][intCntJ] = fltArrA[intCntI][intCntJ] + fltArrB[intCntI][intCntJ];
            }
        }
        intCntI = 0;
        intCntJ = 0;
        for(intCntI = 0; intCntI < 3; intCntI++){
            for(intCntJ = 0; intCntJ < 3; intCntJ++){
                System.out.print(fltArrC[intCntI][intCntJ] + "\t\t");
            }
            System.out.println("");
        }
    }
}
