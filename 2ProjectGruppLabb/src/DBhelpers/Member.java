package DBhelpers;

public class Member {
    Loan[] loans;
    int personalNumber;
    int id;
    String email;
    String type;
    String namn;
    int quantityOfDelays = 0;

    public Member(Loan[] loans, int personalNumber, String email, String type, String namn, int id) {
        this.loans = loans;
        this.personalNumber = personalNumber;
        this.email = email;
        this.type = type;
        this.namn = namn;
        this.id = id;
    }

    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getQuantityOfDelays() {
        return quantityOfDelays;
    }

    public void setQuantityOfDelays(int quantityOfDelays) {
        this.quantityOfDelays = quantityOfDelays;
    }

    public void addDelay(){
        this.quantityOfDelays++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
