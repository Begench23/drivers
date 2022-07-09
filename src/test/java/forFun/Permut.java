package forFun;

public class Permut {


    public static void main(String[] args) {


        char[] arr= {'A', 'B', 'C', 'D'};

        int a= arr.length -1;


        while (a >= 0){


            char c = arr[a];

            for (int i = 0; i < arr.length; i++) {

                if(arr[i] == c){
                    continue;
                }

                System.out.println(c + " " + arr[i]);
            }

            a--;
        }





    }

}
