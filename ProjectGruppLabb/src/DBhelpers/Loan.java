package DBhelpers;

import java.util.Date;

public class Loan {
    Date lendingDate;
    Date fillingDate;
    int loanID;
    int itemID;
    int memberID;
    boolean delayed = false;

    public Loan(Date lendingDate, Date fillingDate, int loanID, int itemID, int memberID) {
        this.lendingDate = lendingDate;
        this.fillingDate = fillingDate;
        this.loanID = loanID;
        this.itemID = itemID;
        this.memberID = memberID;
    }

    public Date getLendingDate() {
        return lendingDate;
    }

    public void setLendingDate(Date lendingDate) {
        this.lendingDate = lendingDate;
    }

    public Date getFillingDate() {
        return fillingDate;
    }

    public void setFillingDate(Date fillingDate) {
        this.fillingDate = fillingDate;
    }

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
}
