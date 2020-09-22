package DBhelpers;

import java.util.Date;

public class Loan {
    Date lendingDate;
    int loanID;
    int itemID;
    int memberID;
    boolean delayed = false;

    public Loan(Date lendingDate, int loanID, int memberID, int itemID) {
        this.lendingDate = lendingDate;
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
