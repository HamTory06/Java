package school.java.study0510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String _str = in.readLine();
        String[] _arr = _str.split(", ");
        int[] original2 = new int[_arr.length];

        for(int i=0; i<_arr.length; i++){
            original2[i] = Integer.parseInt( _arr[i]);
        }
        System.out.println(Arrays.toString(up(original2)));
        System.out.println(Arrays.toString(down(original2)));


    }

    static int[] shuffle(int[] result){
        Random random = new Random();
        for(int i=0; i<result.length; i++){
            int stepping_Stone = 0;
            int random1 = random.nextInt(9);
            int random2 = random.nextInt(9);
            if(random1 != random2){
                stepping_Stone = result[random1];
                result[random1] = result[random2];
                result[random2] = stepping_Stone;
            } else
                continue;
        }
        return result;
    }

    static int[] up(int[] random){
        int stepping_Stone;
        for(int i=0; i<random.length; i++){
            for(int j=0; j<random.length; j++){
                if(random[i] > random[j]){
                    stepping_Stone = random[i];
                    random[i] = random[j];
                    random[j] = stepping_Stone;
                }
            }
        }
        return random;
    }

    static int[] down(int[] random){
        int stepping_Stone = 0;
        for(int i=0; i<random.length; i++){
            for(int j=0; j<random.length; j++){
                if(random[i] < random[j]){
                    stepping_Stone = random[i];
                    random[i] = random[j];
                    random[j] = stepping_Stone;
                }
            }
        }
        return random;
    }
}
