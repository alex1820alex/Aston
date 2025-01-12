public class Main
{
    public static void main(String[] args) {
        quickSort quickSort= new quickSort();

        int[] array= new int[10];
        for(int i=0;i<array.length;i++)
        {
            array[i]=(int) (Math.random() * 100);
        }
        System.out.printf("first array:");
        for(int temp: array)System.out.printf(temp+" ");
        quickSort.quickSortMethodTwo(array,0,array.length-1);
        System.out.println();
        System.out.printf("next array:");
        for(int temp: array)System.out.printf(temp+" ");
    }

}