package labb2;

import java.util.Date;

public class PurchaseStore implements IpurchaceStore {
    @Override
    public Purchase[] getPurchases(Date startdate, Date enddate) {
        return new Purchase[0];
    }

    @Override
    public Purchase[] getPurchasesbyCategory(Date Date, Date enddate, int catid) {
        return new Purchase[0];
    }

    @Override
    public Category[] getAllCategories() {
        return new Category[0];
    }
}
