package practical4;

public class EmailAdapter implements NotificationService {

    private OldEmailService oldEmailService;

    public EmailAdapter(OldEmailService oldEmailService) {
        this.oldEmailService = oldEmailService;
    }

    @Override
    public void sendNotification(String message) {
        oldEmailService.sendMail(message);
    }

    public OldEmailService getOldEmailService() {
        return oldEmailService;
    }
}
