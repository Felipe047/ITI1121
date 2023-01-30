public class SecurityAgency {
    public static void main(String[] args) {
        int max_attempts = Integer.parseInt(args[0]);
        int attempts = 0;
        SecurityAgent bob = new SecurityAgent();

        DoorLock lock = bob.getDoorLock();

        Combination randomCombination = new Combination(0,0,0);

        boolean bruteForce = true;

        while (bruteForce) {
            if (!lock.isActivated()){
                bob.activateDoorLock();
            }

            attempts++;

            if (attempts > max_attempts) {
                bruteForce = false;
                break;
            }

            int first = (int) (Math.random()*5) + 1;
            int second = (int) (Math.random()*5) + 1;
            int third = (int) (Math.random()*5) + 1;

            randomCombination = new Combination(first, second, third);

            if (lock.open(randomCombination)) {
                bruteForce = false;
            }
            
        }

        if (lock.isOpen()) {
            System.out.println("Success!");
            System.out.println("Number of attempts: " + attempts);
            System.out.println(randomCombination.toString());
        } else {
            System.out.println("Failed!");
            System.out.println("Reached the maximum number of attempts before finding the combination!");
        }
    }
}