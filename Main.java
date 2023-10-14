import java.util.*;
public class Main {
    public static void main(String[] args) {
    Set<String>hashSet=new HashSet<>();

    hashSet.add("Aamir");
    hashSet.add("Danish");
    hashSet.add("Tabish");

    String target="Danish";
    if(hashSet.contains(target)){
        System.out.println("Element "+target+" exits in the hashSet");
    }else{
        System.out.println("Element "+target+" not exits in the hashSet");
    }
    }
}