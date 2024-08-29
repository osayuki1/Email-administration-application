package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String email;
    private String alternateEmail;
    private String companySuffix = "abcompany.com";
    private int defaultPasswordLength;

    public Email(String firstName, String lastName, int defaultPasswordLength) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.defaultPasswordLength = defaultPasswordLength;

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }

    private String setDepartment() {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for other\nEnter department code: ");
            int depChoice = input.nextInt();

            if (depChoice == 1)
            {
                return "sales";
            }
            else if (depChoice == 2)
            {
                return "dev";
            }
            else if (depChoice == 3)
            {
                return "acct";
            }
            else if (depChoice == 0)
            {
                return "other";
            }
            else
            {
                System.out.println("Invalid choice. Please try again");
            }
        }

        }

    private String randomPassword(int length)
    {
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
}
