package labb2;

import java.util.Date;

public class PurchaseManager implements IPurchaseManager {

    // PurchaseStoreStub Purchasestore;
    PurchaseStore purchaseStore;

    public PurchaseManager(PurchaseStore ps) {
        purchaseStore = ps;
    }


    // PurchaseStoreStub purchaseStoreStub;

    @Override
    public float sumOfMonth(int year, int month) {

        float sum = 0;
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        Purchase[] purchases = purchaseStore.getPurchases(new Date(year, month, 1), new Date(year, month, days[month - 1]));
        for (int i = 0; i < purchases.length; i++) {
            sum = sum + purchases[i].getAmount();
        }
        return sum;


    }

    @Override
    public float[] monthlyaverage(int year) {
        float[] summa = new float[12];
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        float x = 0;

        for (int i = 0; i < 12; i++) {
            Purchase[] purchases = purchaseStore.getPurchases(new Date(year, i + 1, 1), new Date(year, i + 1, days[i]));
            if (purchases.length != 0) {
                x = sumOfMonth(year, i + 1) / purchases.length;
                summa[i] = x;
            } else
                summa[i] = 0;
        }


        return summa;
    }

    @Override
    public float[] yearlyAveragePerCategory(int year) {
        Purchase[] purchases = purchaseStore.getPurchases(new Date(year, 1, 1), new Date(year, 12, 31));
        Category[] categories = purchaseStore.getAllCategories();

        int index = 0;

        float[] summa = new float[categories.length];
        float tillfällig = 0;

        for (int i = 0; i < categories.length; i++) {
            if(purchases!=null){
            for (int j = 0; j < purchases.length; j++) {
                if (categories[i].getId() == purchases[j].getCategoryId()) {
                    tillfällig = tillfällig + purchases[j].getAmount();
                    index++;
                }

            }}
            if (index != 0) {


                tillfällig = tillfällig / index;
            }
            index = 0;
            summa[i] = tillfällig;
            tillfällig = 0;

        }


        return summa;
    }
}
