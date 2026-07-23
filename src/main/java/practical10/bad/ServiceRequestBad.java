package practical10.bad;

public class ServiceRequestBad {

    public void submitRequest(String type, String studentName) {
        if (type.equalsIgnoreCase("TRANSCRIPT")) {
            System.out.println("Processing transcript request for " + studentName);
        } else if (type.equalsIgnoreCase("CERTIFICATE")) {
            System.out.println("Processing certificate request for " + studentName);
        } else if (type.equalsIgnoreCase("IDCARD")) {
            System.out.println("Processing ID card request for " + studentName);
        } else if (type.equalsIgnoreCase("LIBRARY")) {
            System.out.println("Processing library card request for " + studentName);
        } else {
            throw new IllegalArgumentException("Invalid request type: " + type);
        }
    }
}
