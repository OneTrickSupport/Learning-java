/*package labb2;

import java.util.ArrayList;
import java.util.Date;

public class PurchaseManagerStub extends PurchaseManager

{
PurchaseStore purchaseStore;
PurchaseStoreStub purchaseStoreStub;

    public PurchaseManagerStub(PurchaseStoreStub purchasestore) {
        super(purchasestore);
    }
    ArrayList<Purchase> arrayPurchase = new ArrayList<>();
    ArrayList<Category> arrayCategori = new ArrayList<>();

    @Override
    public float sumOfMonth(int year, int month) {
        float sum = 0;
        int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};


        Purchase[] purchases = purchaseStore.getPurchases(new Date(year, month, 1), new Date(year,month,days[month-1]));
        for (int i = 0; i <purchases.length ; i++) {
            sum = sum+purchases[i].getAmount();
        }
        return sum;

        /*

        ArrayList<Float> summa = new ArrayList();
        float summa1 = 0;

        for (int i = 0; i <arrayPurchase.size() ; i++) {
            if(arrayPurchase.get(i).getDate().getYear()== year && arrayPurchase.get(i).getDate().getMonth()== month) {


                summa.add(arrayPurchase.get(i).getAmount());
            }
        }
        for (int i = 0; i <summa.size() ; i++) {
            summa1 = summa.get(i) + summa1;
        }



    }

    @Override
    public float[] monthlyaverage(int year) {

        float[] summa = new float[12];

        for (int i = 0; i <12 ; i++) {
            summa[i] = sumOfMonth(year, i);
        }

return summa;
        /*

        ArrayList<Purchase> lista = new ArrayList<>();
        float månad = 0;
        float[] floatarray = new float[12];

        for (int i = 0; i <arrayPurchase.size() ; i++) {
            if(year== arrayPurchase.get(i).getDate().getYear()){

                lista.add(arrayPurchase.get(i));

                for (int j = 1; j < lista.size()+j; i++) {
                    if(lista.get(j).getDate().getMonth()==j){
                        månad = lista.get(j).getDate().getMonth() + månad;
                    }
                }
                floatarray[i] = månad;

            }
        }


        return floatarray;
    }

    @Override
    public float[] yearlyAveragePerCategory(int year) {

        Category[] categories = purchaseStore.getAllCategories();
        Purchase[] purchases = purchaseStore.getPurchases(new Date(year, 1, 1), new Date(year,12,31));

        float[] summa = new float[categories.length];

        for (int i = 0; i <categories.length ; i++) {
            if (purchases[i].getCategoryId() == categories[i].getId()){
                for (int j = 0; j <purchases.length ; j++) {
                    summa[i] = summa[i] + purchases[j].getAmount();
                }
            }

        }


        return summa;
    }



}
*/