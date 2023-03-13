public class FullStackException extends IllegalArgumentException {
    
    FullStackException() {

    }

    @Override
    public String getMessage() {
        return "Can not push in Full Stack";
    }
}
