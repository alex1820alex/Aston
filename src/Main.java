
public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("adaw1");
        list.add("adaw2");
        list.add("adaw3");
        list.add("adaw4");
        list.add("adaw5");
        list.add("adaw6");
        list.add("adaw7");

        list.set(0,"aedd");
        System.out.println(list);
        list.subList(1, 6);
        System.out.println(list);

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("6");

        linkedList.remove(2);
        linkedList.set(0,"8");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.size());
        linkedList.display();
        MyList<String> mylist=new MyList<>();
        mylist =linkedList.subList(0,2);
        System.out.println(mylist);





    }
}