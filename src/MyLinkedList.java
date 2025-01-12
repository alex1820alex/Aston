/**
 *Класс для создания связанных списков
 * @param <E> какой тип данных будет хранится в этом списке
 */

public class MyLinkedList<E>  {
    /**
     *@param size- размер списка
     *@param first -первый эемент списка
     *@param last - последнией элемент списка
     */
    private int size=0;
    private Node<E> first;
    private Node<E> last;

    /**
     * клас для создания списка
     * @param <E> тип который будет хранить этот элемент списка
     */
    private  class Node<E> {
        /**
         *@param element сам элемент
         *@param next указатель на следующий элемент
         *@param prev указатель на предедущий элемент
         */
        E element;
        Node<E> next;
        Node<E> prev;

        /**
         *Конструктор создание списка
         * @param prev предедущий элемент
         * @param element сам элемент который будет тут хранится
         * @param next предедущий элемент
         */
        Node(Node<E> prev, E element,Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }


    /**
     *добовление элемента в конец списка
     * @param e элемент который будет добавлен
     */
    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;

    }

    /**
     *добовление элемента в список
     * @param e элемент который будет добавлен
     * @return true
     */
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    /**
     *удаление элемента со списка
     * @param index индекс элемента
     * @return true
     */
    boolean remove(int index)
    {
        unlink(node(index));

       return true;
    }

    /**
     *удаление всех связей и элемента в списке
     * @param e элемент который будет удалятся
     */
    void unlink(Node<E> e)
    {
        final E element =e.element;
        final Node<E>next= e.next;
        final Node<E>prev= e.prev;
        if (prev==null)
        {
            first=next;
        }
        else
        {
            prev.next = next;
            e.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            e.next = null;
        }
        e.element = null;
        size--;

    }

    /**
     *поиск элемента в списке по индексу
     * @param index индекс элемента в списке
     * @return элемента найденого по индексу
     */

    Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    /**
     *установление значения пэлемнета по индексу
     * @param index индекс элемента в списке
     * @param element элемент который будет установлен на место прошлого
     * @return возвращение элемента который был удален
     */

    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> x = node(index);
        E oldVal = x.element;
        x.element = element;
        return oldVal;
    }

    /**
     *получение элемента со списка по индексу
     * @param index индекс элемента в списке
     * @return возвращение найденого элемента
     */
    public E get(int index) {
        checkElementIndex(index);
        Node<E> x = node(index);
        E Val = x.element;
        return Val;

    }

    /**
     *Возращение значения рамера списка
     * @return размер списка
     */
    public int size()
    {
        return size;
    }

    /**
     *Проверка на то чтобы index не заходил за размер списка
     * @param index индекс элемента в списке
     */
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    /**
     * Проверка на то чтобы index не заходил за размер списка
     * @param index индекс элемента в списке
     * @return возращение true или false
     */
    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    /**
     *выовод ошибки что индекс выходи за размеры списка
     * @param index индекс элемента
     * @return выовд ошибки в текстовом виде
     */
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    /**
     *вывод списка в виде текста
     */
    void display()
    {
         Node<E> e= first;
        for (int i = 0; i < size; i++) {
            System.out.print("["+e.element+"]"+" ");
            e = e.next;
        }

    }

    /**
     *делит список на подсписок
     * @param fromIndex  индекс начало нового списка
     * @param toIndex индекс конца нового списка
     * @return возвращает подсписок в виде List
     */
    public MyList<E> subList(int fromIndex, int toIndex) {
        checkElementIndex(fromIndex);
        checkElementIndex(toIndex);
        MyList<E> myList=new MyList<>();
        for (int i=fromIndex; i<toIndex;i++)
        {
            Node<E> x = node(i);
            E Val = x.element;
            myList.add(Val);
        }
        return myList;
    }

}







