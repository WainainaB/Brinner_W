public class BankAccount {
    public static void main(String[] args) {
        int balance = 100; // Initial balance

        balance++; // Deposit $1
        System.out.println("Balance after first deposit: $" + balance);

        System.out.println("Balance after second deposit (before increment): $" + balance++); // Post-increment
        System.out.println("Balance after second deposit (after increment): $" + balance); // Now updated

        System.out.println("Balance after third deposit: $" + (++balance)); // Pre-increment (increments before printing)

        // Reset balance for withdrawals
        balance = 100;

        ++balance; // Deposit $1
        balance++; // Deposit another $1

        System.out.println("Final Balance: $" + balance);
    }
}

