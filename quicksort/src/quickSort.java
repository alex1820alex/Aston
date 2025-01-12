public class quickSort {
    public static void quickSortMethodOne(int[] array,int firstIndex,int lastIndex)
    {
        if (array.length == 0)return;

        if(firstIndex>=lastIndex)return;

        int leftPoint=firstIndex;
        int rightPoint=lastIndex;
        int midlePoint=firstIndex + (lastIndex - firstIndex) / 2;
        int midleValue=array[midlePoint];

        while(leftPoint<=rightPoint)
        {
            while(array[leftPoint]<midleValue)leftPoint++;
            while(array[rightPoint]>midleValue)rightPoint--;
            if(leftPoint<=rightPoint)
            {
                swap(array,leftPoint,rightPoint);
                leftPoint++;
                rightPoint--;
            }
        }
        if (firstIndex < rightPoint)quickSortMethodOne(array, firstIndex, rightPoint);
        if (lastIndex > leftPoint)quickSortMethodOne(array, leftPoint, lastIndex);
    }
    public static void swap(int[] array,int firstIndex,int lastIndex)
    {
        int temp = array[firstIndex];
        array[firstIndex] = array[lastIndex];
        array[lastIndex] = temp;
    }
    public static void quickSortMethodTwo(int[] array, int low, int high)
    {
            if (low < high) {
                int pi = partition(array, low, high);


                quickSortMethodTwo(array, low, pi - 1);
                quickSortMethodTwo(array, pi + 1, high);
            }
        }
    public static int partition(int[] array, int low, int high)
    {
            int pivot = array[high];
            int i = (low - 1);

            for (int j = low; j < high; j++) {

                if (array[j] <= pivot) {
                    i++;

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }


            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            return i + 1;
        }
}
