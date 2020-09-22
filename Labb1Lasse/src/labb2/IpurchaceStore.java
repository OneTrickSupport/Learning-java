package labb2;

import java.util.Date;

public interface IpurchaceStore {
    Purchase[] getPurchases(Date startdate, Date enddate);
    Purchase[] getPurchasesbyCategory(Date startdate, Date enddate, int catid);
    Category[] getAllCategories();


}

