package UniversityExeptions;

public class GroupWithoutStudentsException extends Exception{
    public GroupWithoutStudentsException() {
    }

    public GroupWithoutStudentsException(String message) {
        super(message);
    }

    public GroupWithoutStudentsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GroupWithoutStudentsException(Throwable cause) {
        super(cause);
    }
}
