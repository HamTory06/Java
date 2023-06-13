package school.java.study0517;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        HashSet _hs = new HashSet();

        Iterator _it = _hs.iterator();

        while (_hs.size() < 10){
            _hs.add(rnd.nextInt(10));
        }

        for(int i=0; i<_hs.size(); i++){
            System.out.println(i+" : "+_hs);
        }

        System.out.println();

        ArrayList _arr = new ArrayList<Integer>();

        while (_it.hasNext()){
            _arr.add(rnd.nextInt(10));
        }


        for (int i = 0; i < 10; i++) {
            _arr.add(rnd.nextInt(10));
        }

        System.out.println("ArrayList");
        for (int i = 0; i < _arr.size(); i++) {
            System.out.println(i+" : "+_arr.get(i));
        }


    }
}
