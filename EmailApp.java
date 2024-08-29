package emailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Lucy", "Smith", 6);

        em1.setAlternateEmail("johnb@gmail.com");
        System.out.println(em1.getAlternateEmail());

        em1.setMailboxCapacity(500);
        System.out.println(em1.getMailboxCapacity());
    }
}
