package com.peyman;

import com.peyman.collections.Book;

import java.util.*;

public class App8 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String username = scanner.next();
        String password = args[1];
//        System.out.println(username);
        System.out.println(password);
        int[] arr = new int[4]; //static
//        int i = 10;
//        if(arr[3] !=0){
//            arr = Arrays.copyOf(arr,10);
//            arr[9] = i;
//
//        }

        //collection api
        LinkedList<String> list = new LinkedList<String>(){{add("") ; add("");}};
        list.add("salam");
        list.add("java");
        list.add("php");
        list.add("book");

        list.add(2, "movie"); //adds & shift

        list.set(2, "C#"); //replace

        Comparator<Object> objectComparator = (Object o1, Object o2) -> {
            return 0;
        };
//        String[] dest = list;

        String[] dest2 = list.toArray(new String[list.size()]);

        String[] dest = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            dest[i] = list.get(i);
        }


        String[] dummy = {"1", "2", "3"};
        ArrayList<String> strs = new ArrayList<>(Arrays.asList(dummy));


//        strs = dummy;
        for (int i = 0; i < dummy.length; i++) {
            strs.add(dummy[i]);
        }


//        strs.add("1");
//        strs.add("2");
//        strs.add("3");
        String element = list.get(2);
        boolean f = list.remove("book");
        String f2 = list.remove(1);
        list.sort(objectComparator);

        for (String item : list) {
            System.out.println(item);
        }
        String x = list.get(0);


        List<Book> books = new ArrayList<Book>(){{ add(new Book("java", 5000)); add(new Book("c#" , 2000)); }}; //upcasting

        String title = "java";

        if(books.contains(new Book(title))){
            System.out.println("TRUE");
        }

//      Stream
        // SET
        //MAP
        //Iterator

        Set<String> words = new HashSet<>();
        words.add(new String("ali"));
        System.out.println("ali".hashCode());
        words.add("reza");
        System.out.println("reza".hashCode());

        words.add(new String("ali"));
        System.out.println("mahdi".hashCode());
        System.out.println("ali".hashCode());
        words.add("mahdi");

        for (String item : words) {
            System.out.println(item);
        }


        Set<Book> bookSet = new HashSet<>();
//        bookSet.add(new Book("java",5000));
//        bookSet.add(new Book("c#",3000));
//        bookSet.add(new Book("php",1000));
//        bookSet.add(new Book("java",5000));

        for (Book book : bookSet) {
            System.out.println(book);
        }


        Set<Book> bookTree = new TreeSet<>();
        bookTree.add(new Book("java",5000));
        bookTree.add(new Book("c#",3000));
        bookTree.add(new Book("php",1000));
        bookTree.add(new Book("java",5000));

        for (Book book : bookSet) {
            System.out.println(book);
        }


        Map<String, Integer> map = new HashMap<>();
        map.put("reza",123);
        map.put("javad",500);

        ArrayList arrayList = (ArrayList) map.values();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();


        List<Map.Entry<String, Integer>> data = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : entries) {
            data.add(entry);
        }

        Map.Entry<String,Integer> my = data.get(0);


        Integer v =  map.get("dollar");
        System.out.println(v);

    }


    public static void f(List<Book> books) {

    }

}
