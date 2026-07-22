package practical5;

public class RollNumberAssigner {

    private int counter = 1000;

    public String assign() {
        counter++;
        String rollNumber = "PCPS-" + counter;
        System.out.println("Roll number assigned: " + rollNumber);
        return rollNumber;
    }
}
