package school.java.study0613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhotoCard_Class {

    String name;
    int price;
    PhotoCard_Class(){
        name = "";
        price = 0;
    }

    PhotoCard_Class(String _name, int _price){
        name = _name;
        price = _price;
    }
}
