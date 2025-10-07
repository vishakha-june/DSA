public class JaggedArray {
    //a multideimensional array with different size of rows
    public static void main(String[] args) {
        int[][] _2dArray=new int[2][];
        _2dArray[0]=new int[3];
        _2dArray[1]=new int[5];
        int counter=0;
        for(int row=0;row< _2dArray.length;row++){
            for(int col=0;col<_2dArray[row].length;col++){
                _2dArray[row][col]=counter++;
            }
        }
        for (int row=0;row< _2dArray.length;row++){
            System.out.println();
            for(int col=0;col<_2dArray[row].length;col++){
                System.out.print(_2dArray[row][col]+" ");
            }
        }
    }
}
