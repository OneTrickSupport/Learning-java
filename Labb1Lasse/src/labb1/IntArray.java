package labb1;

public class IntArray implements IIntArray {

    int[] arr = new int[] {1,2,3,2,2} ;

    @Override
    public double getAverage() throws ArrayExeption {
        if(arr.length == 0){
            throw new ArrayExeption(String.format("Length is %d", arr.length));
        }
        int cont = 0;
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {

            cont += arr[i];
            count += 1;
        }
        double avg = cont/count;
        return avg;
    }

    @Override
    public int[] findPositions(int val) {
        int[] result = new int[]{};
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] == val) {

                if (result.length == 0) {
                    result = new int[]{i};

                } else {
                    int[] previous = result;
                    result = new int[previous.length + 1];
                    for (int j = 0; j < previous.length; j++) {
                        result[j] = previous[j];
                    }
                    result[result.length-1] = i;

                }
            }

        }
        return result;
    }

    @Override
    public void appendLast(int value) {

        if(arr == null){
            arr[0] = value;
        } else {
            int[] nyarray = new int[arr.length + 1];

            for (int i = 0; i <arr.length ; i++) {
                nyarray[i] = arr[i];
            }
            arr = new int[arr.length + 1];
            arr = nyarray;

            arr[arr.length - 1] = value;

        }

    }

    @Override
    public void insertAt(int pos, int value) throws ArrayExeption {
        validate(pos);
        if(pos >= arr.length){
            int[] nyarray = new int[pos + 1];
            for (int i = 0; i <arr.length ; i++) {
                nyarray[i] = arr[i];
            }
            nyarray[pos] = value;
            arr = nyarray;
        }
        else {
            int[] nyarray = new int[arr.length+1];
            for (int i = 0; i <arr.length ; i++) {
                nyarray[i] = arr[i];
            }
            int räkna = 1;
            for (int i = 0; i <nyarray.length ; i++) {

                if (pos==i){
                    for (int j = 0; j < nyarray.length - i ; j++) {
                        nyarray[nyarray.length - räkna] = nyarray[nyarray.length-räkna-1];
                        räkna++;
                    }


                }
            }
            nyarray[pos] = value;
            arr = nyarray;
        }


    }

    @Override
    public int getAt(int pos) throws ArrayExeption {
        validate(pos);


        return arr[pos];
    }

    @Override
    public void setAt(int pos, int element) throws ArrayExeption {
        validate(pos);

        arr[pos] = element;


    }

    @Override
    public int deleteAt(int pos) throws ArrayExeption {
        validate(pos);

        int tagbortvärde = arr[pos];


        for (int i = 0; i <arr.length ; i++) {
            if(pos==i){
                for (int j = 0; j <arr.length-i-1 ; j++) {
                    arr[i] = arr[i+1];
                }


            }
        }
        int[] nyarray = new int[arr.length-1];
        for (int i = 0; i <nyarray.length ; i++) {
            nyarray[i] = arr[i];
        }

        arr = nyarray;


     return tagbortvärde;
    }
    public void validate(int pos) throws ArrayExeption {
        if (pos < 0 || pos > arr.length){
            throw new ArrayExeption(String.format("%d is not a valid position. Length is %d", pos, arr.length));
        }
    }

}
