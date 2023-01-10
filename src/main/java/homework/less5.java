package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class less5 {
    private static Map<String, ArrayList<String>> phoneNote = new HashMap<>();
    private static ArrayList record = new ArrayList<>();
    public static void main(String[] args){
        getData();
        phoneNote();
        System.out.println(phoneNote);
    }

    private static ArrayList getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию");
        record.add(scanner.nextLine());
        System.out.println("Введите номер");
        record.add(scanner.nextLine());
        return record;
    }

    private static void phoneNote() {
        ArrayList<String> numbers=new ArrayList<>();
        if (phoneNote.containsKey(record.get(0))){
            numbers = phoneNote.get(record.get(0));
            numbers.add((String) record.get(1));
        }
        else {
            numbers.add((String) record.get(1));
            phoneNote.put((String) record.get(0),numbers);
        }

    }
}
