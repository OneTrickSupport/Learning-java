package labb2;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class Mocking {

    @Test
    void sumOfMonth_Mockito(){
        PurchaseStore store = mock(PurchaseStore.class);
        PurchaseManager man = new PurchaseManager(store);

        when(store.getPurchases(new Date(2014,1,1), new Date(2014,1,31)))
                .thenReturn(new Purchase[]{
                        new Purchase(1,new Date(2014,1,12), 100, "", 1),
                        new Purchase(1,new Date(2014,1,14), 200, "", 1)

                });

        assertEquals(man.sumOfMonth(2014,1), 300);

    }

    @Test
    void monthlyAverage_Mockito(){
        PurchaseStore store = mock(PurchaseStore.class);
        PurchaseManager man = new PurchaseManager(store);

        int days = 31;

        for (int i = 0; i <12 ; i++) {


            if (i==1){
                days =28;
            }
            if (i == 3 || i == 5 || i == 8 || i == 10){
                days=30;
            }
            when(store.getPurchases(new Date(2014,i+1,1), new Date(2014,i+1,days)))
                    .thenReturn(new Purchase[]{
                            new Purchase(1,new Date(2014,1,12), 200, "", 1),
                            new Purchase(1,new Date(2014,1,14), 200, "", 1)

                    });
            days=31;
        }

        //assertArrayEquals(man.monthlyaverage(2014), new float[]{0,0,0,0,0,0,0,0,0,0,0,0});
        assertArrayEquals(new float[]{200,200,200,200,200,200,200,200,200,200,200,200}, man.monthlyaverage(2014));



    }
    @Test
    void monthlyAvarageMockitolånga(){

        PurchaseStore store = mock(PurchaseStore.class);
        PurchaseManager man = new PurchaseManager(store);
        int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        //januari
        when(store.getPurchases(new Date(2014, 1, 1), new Date(2014, 1, 31)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 102, "100", 1)
                });
        //februari
        when(store.getPurchases(new Date(2014, 2, 1), new Date(2014, 2, 28)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //mars
        when(store.getPurchases(new Date(2014, 3, 1), new Date(2014, 3, 31)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //apil
        when(store.getPurchases(new Date(2014, 4, 1), new Date(2014, 4, 30)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //maj
        when(store.getPurchases(new Date(2014, 5, 1), new Date(2014, 5, 31)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //juni
        when(store.getPurchases(new Date(2014, 6, 1), new Date(2014, 6, 30)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //juli
        when(store.getPurchases(new Date(2014, 7, 1), new Date(2014, 7, 31)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //augusti
        when(store.getPurchases(new Date(2014, 8, 1), new Date(2014, 8, 31)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //september
        when(store.getPurchases(new Date(2014, 9, 1), new Date(2014, 9, 30)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //oktober
        when(store.getPurchases(new Date(2014, 10, 1), new Date(2014, 10, 31)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //november
        when(store.getPurchases(new Date(2014, 11, 1), new Date(2014, 11, 30)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });
        //december
        when(store.getPurchases(new Date(2014, 12, 1), new Date(2014, 12, 31)))
                .thenReturn(new Purchase[]{
                        new Purchase(1, new Date(2014, 1, 12), 100, "200", 1),
                        new Purchase(1, new Date(2014, 1, 13), 100, "101", 1)
                });


        float[]expected=new float[]{101,100,100,100,100,100,100,100,100,100,100,100};

        assertArrayEquals(man.monthlyaverage(2014),expected);

    }






    @Test
    void yearlyAveragePerCategoryTest(){
        PurchaseStore store = mock(PurchaseStore.class);
        PurchaseManager man = new PurchaseManager(store);


        when(store.getPurchases(new Date(2014,1,1), new Date(2014,12,31)))
                .thenReturn(new Purchase[]{
                        new Purchase(1,new Date(2014,4,12), 500, "", 1),
                        new Purchase(1,new Date(2014,3,14), 800, "", 1),
                        new Purchase(1,new Date(2014,3,14), 200, "", 3),
                        new Purchase(1,new Date(2014,3,14), 200, "", 3)

                });

        when(store.getAllCategories()).thenReturn(new Category[]{
                new Category(1,"Mat"),
                new Category(2,"Sprit"),
                new Category(3, "Hyra")
        });




        assertArrayEquals(man.yearlyAveragePerCategory(2014), new float[]{650,0,200});
    }
}
