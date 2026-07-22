package practical5;

public class StudentRegistrationFacade {

    private StudentValidator validator;
    private RollNumberAssigner assigner;
    private StudentRepository repository;
    private WelcomeMessageSender sender;

    public StudentRegistrationFacade() {
        this.validator = new StudentValidator();
        this.assigner = new RollNumberAssigner();
        this.repository = new StudentRepository();
        this.sender = new WelcomeMessageSender();
    }

    public void register(String name, int id) {
        System.out.println("=== PCPS College - Student Registration ===");
        if (!validator.validate(name, id)) {
            return;
        }
        String rollNumber = assigner.assign();
        repository.save(name, rollNumber);
        sender.send(name, rollNumber);
        System.out.println("Registration complete.");
    }
}
