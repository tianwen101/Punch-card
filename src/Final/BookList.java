package Final;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"网页设计",33));
        list.add(new Book(2,"高数",44));
        list.add(new Book(3,"英语",55));
        System.out.println(list);
        list.add(2,new Book(3,"java",56));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2,new Book(4,"语文",66));
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(new Book(2,"绘画",88));
        System.out.println(list);
        System.out.println(list.indexOf(new Book(2,"高数",44)));
        System.out.println(list.lastIndexOf(new Book(2,"高数",44)));
    }
}
