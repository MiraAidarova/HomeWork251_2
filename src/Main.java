import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<City> arrayList = new ArrayList<>();
        arrayList.add(new City(7495,"Moscow"));
        System.out.println(arrayList);

        TreeSet<City> map = new TreeSet<>();
        map.add(new City(7495,"Moscow"));
        System.out.println(map);

    }
}