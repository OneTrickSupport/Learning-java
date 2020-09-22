package labb2;

import java.util.ArrayList;
import java.util.Date;

public class PurchaseStoreStub extends PurchaseStore {

    public ArrayList<Purchase> arrayPurchase;
    public ArrayList<Category> arrayCategori;

    public PurchaseStoreStub(){
        arrayPurchase = new ArrayList<>();
        arrayCategori = new ArrayList<>();
    }

    public PurchaseStoreStub(ArrayList<Purchase> arrayPurchase) {
        this.arrayPurchase = arrayPurchase;
    }

    public void add(Purchase p){
        arrayPurchase.add(p);
        arrayCategori.add(new Category(p.getCategoryId()));
    }





    @Override

    public Purchase[] getPurchases(Date startdate, Date enddate) {
        ArrayList<Purchase> nyarray = new ArrayList<>();

        for (int i = 0; i < arrayPurchase.size() ; i++) {
            if (arrayPurchase.get(i).getDate().after(startdate) && arrayPurchase.get(i).getDate().before(enddate)){
                nyarray.add(arrayPurchase.get(i));
            }
        }
        Purchase[] lista = new Purchase[nyarray.size()];

        nyarray.toArray(lista);


        return lista;
    }

    @Override
    public Purchase[] getPurchasesbyCategory(Date startdate, Date enddate, int catid) {


        ArrayList<Purchase> nyarray = new ArrayList<>();

        for (int i = 0; i < arrayPurchase.size() ; i++) {
            if (catid == arrayPurchase.get(i).getCategoryId() && arrayPurchase.get(i).getDate().after(startdate) && arrayPurchase.get(i).getDate().before(enddate)){
                nyarray.add(arrayPurchase.get(i));
            }
        }
        Purchase[] lista = new Purchase[nyarray.size()];

        nyarray.toArray(lista);


        return lista;
    }

    @Override
    public Category[] getAllCategories() {

        Category[] categoryarray = new Category[arrayCategori.size()];

        for (int i = 0; i <arrayCategori.size() ; i++) {
            categoryarray[i] = arrayCategori.get(i);
        }


        return categoryarray;
    }
}
