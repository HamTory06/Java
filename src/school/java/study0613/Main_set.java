package school.java.study0613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main_set {
    BufferedReader in;

    //    PhotoCard_Class[] mArray = new PhotoCard_Class[100];
    HashSet<PhotoCard_Class> mArray = new HashSet<>();

    public static void main(String[] args) throws IOException {
        Main_set _main = new Main_set();
        _main.processMethod();
    }

    private void processMethod() throws IOException {
        init_data();
        boolean _isFinish = false;
        while (_isFinish == false) {
            _isFinish = printMenu();
        }
    }


    private void insertCard() throws IOException {
        PhotoCard_Class _temp = new PhotoCard_Class();
        System.out.print("이름 입력 : ");
        _temp.name = in.readLine();
        System.out.print("가격 입력 : ");
        _temp.price = Integer.parseInt((in.readLine()));
        mArray.add(_temp);
    }

    private void printInfo() {
        for (PhotoCard_Class _temp : mArray) {
            System.out.println("이름 : " + _temp.name +
                    "가격 : " + _temp.price);
        }
    }

    private void processExit() {
        System.exit(0);
    }

    private boolean printMenu() throws IOException {
        System.out.println("를 선택하세요.");
        System.out.print("1. 입력 \n");
        System.out.print("2. 출력 \n");
        System.out.print("3. 검색 \n");
        System.out.println("9. 종료 \n");
        System.out.print("메뉴선택 : ");
        String _meun = in.readLine();

        if (_meun.equals("1")) {
            insertCard();
        } else if (_meun.equals("2")) {
            printInfo();
        } else if (_meun.equals("3")) {
            searchName();
        } else if (_meun.equals("4")) {
            deleteName();
        }
        if (_meun.equals("9")) {
            return true;
        }
        return false;
    }

    private void init_data() {
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    private void searchName() throws IOException {
        String _name = in.readLine();
        boolean _isSearch = false;
        Iterator<PhotoCard_Class> _it = mArray.iterator();
        while (_it.hasNext()) {
            PhotoCard_Class _temp = _it.next();
            if (_temp.name.contains(_name)) {
                System.out.println("이름 : " + _temp.name + " " +
                        "가격 : " + _temp.price);
                _isSearch = true;
            }
        }
        if (!_isSearch) {
            System.out.println("검색된 이름이 없습니다");
        }
        System.out.println("다시 검색하시겠습니다? (yes, no)");
        String _temp = in.readLine();
        if (_temp.equals("yes")) {
            searchName();
        }
    }

    private void deleteName() throws IOException {
        String name = in.readLine();
        if (mArray.contains(name)) {
            mArray.remove(name);
        } else {
            System.out.println("검색된 이름이 없습니다");
        }
        System.out.println("다시 검색하시겠습니다? (yes, no)");
        String _temp = in.readLine();
        if (_temp.equals("yes")) {
            deleteName();
        }
    }
}
