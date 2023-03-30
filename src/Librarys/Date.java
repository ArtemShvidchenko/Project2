package Librarys;

import java.text.SimpleDateFormat;
import java.util.HashMap;

public class Date {

    public static void main(String[] args) {


        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");


        HashMap<String, String> date = new HashMap<>();
        date.put("Book 1", ("01.03 2023"));
        date.put("Book 2", ("02.03 2023"));
        date.put("Book 3", ("03.03 2023"));
        date.put("Book 4", ("04.03 2023"));
        date.put("Book 5", ("05.03 2023"));


    }
}
