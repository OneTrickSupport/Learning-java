package labb2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class Unittest {

    Purchase a = new Purchase();
    Category b = new Category();


    @Test
    void getAllCategoriesTest(){
        PurchaseStoreStub stub = new PurchaseStoreStub();


        Category c1 = new Category(1,"Mat");
        Category c2 = new Category(2,"Hyra");
        Category c3 = new Category(3,"Sprit");

        stub.arrayCategori.add(c1);
        stub.arrayCategori.add(c2);
        stub.arrayCategori.add(c3);



        assertArrayEquals(new Category[]{c1,c2,c3}, stub.getAllCategories());
    }
    @Test
    void getPurchasesTest(){
        PurchaseStoreStub stub = new PurchaseStoreStub();


        Purchase t1 = new Purchase(1, new Date(2014, 3, 6), 300, "", 5);
        Purchase t2 = new Purchase(2, new Date(2014, 3, 6), 100, "", 2);
        Purchase t3 = new Purchase(3, new Date(2014, 3, 6), 100, "", 3);
        Purchase t4 = new Purchase(4, new Date(2014, 3, 6), 100, "", 4);

        stub.arrayPurchase.add(t1);
        stub.arrayPurchase.add(t2);
        stub.arrayPurchase.add(t3);
        stub.arrayPurchase.add(t4);

        System.out.println(stub.getPurchases(new Date(2014, 1, 1), new Date(2014,12,31)));

        Purchase[] retur = new Purchase[stub.arrayPurchase.size()];

        retur = stub.getPurchases(new Date(2014, 1, 1), new Date(2014,12,31));

        for (int i = 0; i <retur.length ; i++) {
            System.out.println(retur[i].getAmount());
        }

       // assertArrayEquals(new Purchase[]{t1, t3}, stub.getPurchases(new Date(2014,1 ,1),
          //      new Date(
         //               2014, 12, 31)));

    }
    @Test
    void getPurchasesByCategoryTest(){
        PurchaseStoreStub stub = new PurchaseStoreStub();

        Purchase t1 = new Purchase(1, new Date(2014, 3, 6), 100, "", 5);
        Purchase t2 = new Purchase(2, new Date(2019, 3, 6), 100, "", 1);
        Purchase t3 = new Purchase(3, new Date(2014, 3, 6), 100, "", 3);
        Purchase t4 = new Purchase(4, new Date(2019, 3, 6), 100, "", 1);

        stub.arrayPurchase.add(t1);
        stub.arrayPurchase.add(t2);
        stub.arrayPurchase.add(t3);
        stub.arrayPurchase.add(t4);

        assertArrayEquals(new Purchase[]{t2, t4}, stub.getPurchasesbyCategory(new Date(2019, 1, 1),
                new Date(2019, 12, 31), 1));
    }







    @Test
    void sumOfMonth(){
        PurchaseStoreStub stub = new  PurchaseStoreStub();
        PurchaseManager man = new PurchaseManager(stub);

        Purchase t1 = new Purchase(1, new Date(2014, 4, 6), 100, "", 5);
        Purchase t2 = new Purchase(2, new Date(2014, 3, 6), 100, "", 1);
        Purchase t3 = new Purchase(3, new Date(2014, 3, 6), 100, "", 3);
        Purchase t4 = new Purchase(4, new Date(2014, 3, 6), 100, "", 1);

        stub.arrayPurchase.add(t1);
        stub.arrayPurchase.add(t2);
        stub.arrayPurchase.add(t3);
        stub.arrayPurchase.add(t4);


        System.out.println(man.sumOfMonth(2014, 3));



        assertEquals(300, man.sumOfMonth(2014, 3));

        //System.out.println(t1.toString() + t2.toString() +  t3.toString() + t4.toString());



    }
    @Test
    void monthlyAverageTest(){
        PurchaseStoreStub stub = new  PurchaseStoreStub();
        PurchaseManager man = new PurchaseManager(stub);

        Purchase t1 = new Purchase(1, new Date(2014, 4, 6), 100, "", 5);
        Purchase t2 = new Purchase(2, new Date(2014, 3, 6), 200, "", 1);
        Purchase t3 = new Purchase(3, new Date(2014, 3, 6), 100, "", 3);
        Purchase t4 = new Purchase(4, new Date(2014, 3, 6), 100, "", 1);

        stub.arrayPurchase.add(t1);
        stub.arrayPurchase.add(t2);
        stub.arrayPurchase.add(t3);
        stub.arrayPurchase.add(t4);

        float[] retur = new float[stub.arrayPurchase.size()];

        retur = man.monthlyaverage(2014);

        for (int i = 0; i <retur.length ; i++) {
            System.out.println(retur[i]);
        }
        //assertArrayEquals(new float[]{0,0,300,100,0,0,0,0,0,0,0,0}, man.monthlyaverage(2014));



    }
    @Test
    void yearlyAveragePerCategoryTest(){

        PurchaseStoreStub stub = new  PurchaseStoreStub();
        PurchaseManager man = new PurchaseManager(stub);

        Purchase t1 = new Purchase(1, new Date(2014, 4, 6), 500, "", 1);
        Purchase t2 = new Purchase(2, new Date(2014, 3, 6), 800, "", 1);
        Purchase t3 = new Purchase(3, new Date(2014, 3, 6), 100, "", 3);
        Purchase t4 = new Purchase(4, new Date(2014, 3, 6), 100, "", 3);

        Category c1 = new Category(1, "Mat");
        Category c2 = new Category(2, "Hyra");
        Category c3 = new Category(3, "Spel");
        //Category c4 = new Category(4, "Alkohol");

        stub.arrayPurchase.add(t1);
        stub.arrayPurchase.add(t2);
        stub.arrayPurchase.add(t3);
        stub.arrayPurchase.add(t4);

        stub.arrayCategori.add(c1);
        stub.arrayCategori.add(c2);
        stub.arrayCategori.add(c3);
       // stub.arrayCategori.add(c4);

        float[] retur = new float[stub.arrayPurchase.size()];

        retur = man.yearlyAveragePerCategory(2014);

        for (int i = 0; i <retur.length ; i++) {
            System.out.println(retur[i]);
        }

        //assertArrayEquals(new float[]{200, 0, 100, 100}, man.yearlyAveragePerCategory(2014));
    }


}
