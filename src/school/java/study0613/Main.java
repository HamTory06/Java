package school.java.study0613;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    BufferedReader in;

    PhotoCard_Class[] mArray = new PhotoCard_Class[100];

    public static void main(String[] args) throws IOException {
        Main _main = new Main();
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
        for( int _pos=0; _pos < mArray.length; _pos++){
            if( mArray[_pos] == null){
                mArray[_pos] = _temp;
                break;
            }
        }
    }

    private void printInfo() {
        for(int _pos = 0; _pos < mArray.length; _pos++){
            if(mArray[_pos] != null){
                System.out.println("이름 : " + mArray[_pos].name+
                        "가격 : "+mArray[_pos].price);
            }
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
        } else if (_meun.equals("9")) {
            return true;
        }
        return false;
    }

    private void init_data() {
        in = new BufferedReader(new InputStreamReader(System.in));
    }

    private void searchName() throws IOException {
        String _name = in.readLine();
        boolean flag = true;
        for(int i=0; i<mArray.length; i++){

            if(mArray[i] != null){
                if(mArray[i].name.contains(_name)){
                    System.out.println(mArray[i].name);
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("검색된 이름이 없습니다");
        }
        System.out.println("다시 검색하시겠습니다? (yes, no)");
        String _temp = in.readLine();
        if(_temp.equals("yes")){
            searchName();
        }
    }

    private void deleteName(){
        
    }
}
