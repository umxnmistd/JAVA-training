public class sum {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,7,8,9,0};
        int sum = add(numbers);
        print(sum);

    }
    static int add(int numbers[]) {
        int sum = 0;

        for (int number:numbers){
            sum = sum + number;
        }
        return sum;
    }

    static void print(int add) {
        System.out.print(add);
    }
}
