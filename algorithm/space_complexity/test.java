package algorithm.space_complexity;

public class test {
        public static void main(String[] args) {
            int result = get(5);
            System.out.println(result);
        }

        public static int get(int n){
            if (n <= 1) {
                return 0;
            }
            get(n-1);
            return n;
    }

}

//error