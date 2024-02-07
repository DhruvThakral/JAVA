class Account {

    // Hiding the data using private
    private String accName = "Hello";
    private int accBalance = 100;
    private int accNumber = 1234;

    public int getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(int val) {
        accBalance = val;
    }
}

// private variables are visible only in

class LPU {
    public static void main(String args[]){
        // Encapsulation 

        Account a1 = new Account(); 
        System.out.println()
        a1.setAccBalance(50);
        System.out.println(a1.accBalance);
 
       

    }
}


// Encapsulation is a process of wrapping  data members and 