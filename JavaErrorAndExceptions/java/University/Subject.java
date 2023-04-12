package University;

public enum Subject {
    HISTORY, DEMOGRAPHY, BIOLOGY, CHEMISTRY, PHYSICS, MATHEMATICS;

    @Override
    public String toString() {
        return "Subject: " + this.name();
    }
}
