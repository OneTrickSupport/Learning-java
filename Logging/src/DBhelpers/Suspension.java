package DBhelpers;

import java.util.Date;

public class Suspension {
    Date date;
    int suspensionID;

    public Suspension(Date date, int suspensionID) {
        this.date = date;
        this.suspensionID = suspensionID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSuspensionID() {
        return suspensionID;
    }

    public void setSuspensionID(int suspensionID) {
        this.suspensionID = suspensionID;
    }
}
