package HW2_3;


import java.util.*;
import java.util.stream.Collectors;

public class HW2_3 {


    public static void main(String[] args) {
//      1.  Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//        Посчитать, сколько раз встречается каждое слово.

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Молоко", "Квас", "Лимонад", "Творог", "Молоко", "Кефир", "Лимонад",
                "Молоко", "Квас", "Лимонад", "Творог", "Молоко", "Кефир", "Сок"));
        System.out.println(list);


/*        Map<String, Integer> hm = new HashMap<>(); // как посчитать строку не понятно
        for (int i = 0; i < list.size(); i++) {
            int val = 0;
            Integer count = hm.getOrDefault(val,0);
            hm.put(String.valueOf(val), count + 1);
        }
        System.out.println(hm);*/

        String[] arr ={
                "Молоко", "Квас", "Лимонад", "Творог", "Молоко", "Кефир", "Лимонад",
                "Молоко", "Квас", "Лимонад", "Творог", "Молоко", "Кефир", "Сок"

        };
        Set<Integer> set1 = new HashSet<>(); //  только по 1 экземпляру хранит
        Set<String> set = Arrays.stream(arr).collect(Collectors.toSet());
        System.out.println("уникальные слова: " + set);


        //подсказал google:
        Map<String, Integer> mp= new HashMap<String, Integer>();
        int count=0;

        for(int i=0;i<arr.length;i++){
            count=0;

            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }
            }

            mp.put(arr[i], count);
        }

        System.out.println("Повторяются: "+ mp);

/*
        2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий
        и телефонных номеров. В этот телефонный справочник с помощью метода add()
        можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.
*/

        Map<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", 123456);
        phoneBook.put("Петров", 123457);
        phoneBook.put("Кузнецов", 123458);
        phoneBook.put("Иванов", 123459);

        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

//        TreeSet<Object> searchPhone = new TreeSet<Object>(phoneBook.values());
//        System.out.println(phoneBook.get("Иванов"));









    }




}

