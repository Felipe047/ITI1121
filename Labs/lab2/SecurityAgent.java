public class SecurityAgent {
    Combination secret;
    DoorLock lock;
   
    public SecurityAgent() {
        int first = (int) (Math.random()*5) + 1;
        int second = (int) (Math.random()*5) + 1;
        int third = (int) (Math.random()*5) + 1;

        this.secret = new Combination(first, second, third);
        this.lock = new DoorLock(secret);
    }

    public DoorLock getDoorLock() {
        return this.lock;
    }

    public void activateDoorLock() {
        this.lock.activate(this.secret);
    }
}
