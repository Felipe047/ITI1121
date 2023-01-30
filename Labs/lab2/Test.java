public class Test {
   
    public static void main(String[] args) {
        Combination lock1 = new Combination(1, 2, 3);
        Combination lock2 = new Combination(1, 4, 3);
        Combination lock3 = new Combination(1, 2, 3);

        System.out.println(lock1.equals(lock3));
        System.out.println(lock1.equals(lock2));

        System.out.println(lock3.toString());
    }
}
