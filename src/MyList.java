/**
 * Mylist-List
 * Класс для создания массивов
 * @param <E> какой тип данных будет хранится в этом массиве
 */
public class MyList<E> {
    /**
     * @param size-размер массива
     * @param elementData-сам массив
     * @param EMPTY_ELEMENTDATA-пустой массив
     * @param DEFAULT_CAPACITY-размер массива по умолчанию
     */
    private int size;
    private Object[] elementData;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * создание массива (объекта класса Mylist) с размером по умолчанию
     */
    public MyList()
    {
        elementData= new Object[DEFAULT_CAPACITY];
    }

    /**
     * создание массива (объекта класса Mylist) с определенным размером
     * @param CAPACITY-размер массива
     */
    public MyList(int CAPACITY)
    {
        if (CAPACITY > 0) {
            this.elementData = new Object[CAPACITY];
        } else if (CAPACITY == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    CAPACITY);
        }
    }

    /**
     * добавление элемента в массив без передачи индекса
     * @param e элемент который будете добовляться в массив
     */
    public void add(E e) {
        elementData[size++]=e;
    }

    /**
     * добавление элемента массива по индексун
     * @param index -индекс элемента в массиве
     * @param element элемент который будете добовляться в массив
     */
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        final int s;
        Object[] elementData;
        if ((s = size) == (elementData = this.elementData).length)
            size++;
        System.arraycopy(elementData, index,
                elementData, index + 1,
                s - index);
        elementData[index] = element;

    }

    /**
     * проверка чтобы передоваемый индекс не заходил за размеры массива
     * @param index  индекс элемента в массиве
     */
    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > this.size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    /**
     * вывод ошибки перехода за размеры массива
     * @param index индекс элемента в массиве
     * @return возращение строковую ошибку перехода за размеры массива
     */
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+this.size;
    }

    /**
     * Возвращение размера массива
     * @return размер массива
     */
    public int size()
    {
        return size;
    }

    /**
     * получение элемента массива по ево индексу
     * @param index  индекс элемента в массиве
     * @return возвращение элемента массива либо возвращение null
     */
    public E get(int index) {
        if (index>size || index<0) {
            System.out.println(outOfBoundsMsg(index));
            return null;
        }
        else return elementData(index);
    }

    /**
     * Возвращение элемента массива по индексу
     * @param index  индекс элемента в массиве
     * @return возвращение элемента массива
     */
    E elementData(int index) {
        return (E) elementData[index];
    }

    /**
     * Установление значение элемента по индексу
     * @param index  индекс элемента в массиве
     * @param element элемент массива
     * @return возвращение значение старого элемента
     */
    public E set(int index, E element) {
        E oldValue = elementData(index);
        elementData[index] = element;
        return oldValue;
    }

    /**
     * удаление элемента массива по индексу
     * @param index индекс элемента в массиве
     */
    public void remove(int index)
    {
        for (int i=index;i<size;i++) {
            elementData[i] = elementData[i+1];
        }
        size--;
    }

    /**
     * переопределение метода toString()
     * @return возвращение строкого значение метода toString(Object[] a,int size)
     */
    @Override
    public String toString(){

        return toString(elementData,size);
    }

    /**
     *
     * @param a массив
     * @param size размер массива
     * @return возвращение символов
     */
    public static String toString(Object[] a,int size) {
        if (a == null)
            return "null";

        int iMax = size-1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(a[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    /**
     * удаление элементов массива по индексам
     * @param fromIndex наиндекс элемента в массиве для начало удаления
     * @param toIndex индекс элемента в массиве для конца удалениия(невключительно)
     */
    public void subList(int fromIndex, int toIndex) {
        for (int i=toIndex-1;i>=fromIndex;i--) {

            remove(i);
        }

    }


}
