package HW2_2;
public class MainHW2_2 {
    static int SIZE = 4;

    public static void main(String[] args)  {

//        System.out.println(w.length);//length- длина массива
//        System.out.println(w[3].length); // сколько элементов в этой строке


    String[][] arr = {
            {"01", "02", "03", "04"},
            {"05", "06", "07", "08"},
            {"09", "10", "11", "12"},
            {"13", "14", "15", "16а"},
    };
    try {
            System.out.println(sum(arr));


//    int count = arr.length;
//    int countLine = arr[0].length + arr[1].length + arr[2].length + arr[3].length;
//    System.out.println("Массив из " + count + " колонок и " + countLine + " элементов");
//
//    if (arr.length > 4 | arr.length < 4);
//    if ((arr[0].length + arr[1].length + arr[2].length + arr[3].length) < 4 | (arr[0].length + arr[1].length + arr[2].length + arr[3].length)> 4) ;

        }catch (MyArraySizeException e){
    e.printStackTrace();
        } catch (MyArrayDataException e){
        e.printStackTrace();
        System.out.println(e.getRow() + " "  + e.getCol());
        System.out.println(arr[e.getRow()][e.getCol()]);
    }

        System.out.println(" продолжение программы");
// на выполнение данного куска потрачено более 12 часов... обучение точно с нуля?
//

//try {
//        } catch (MyArraySizeException e){
//            System.out.println("массив должен быть 4 на 4");
//        }

    }
    static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != SIZE){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE){
                throw new MyArraySizeException();//размер массива не равен SIZE


            }

        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try{
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }

            }

        } return sum;
    }

}

//        System.out.printf("%s %s %s %s\n", arr[0][0], arr[0][1], arr[0][2], arr[0][3]);
//        System.out.printf("%s %s %s %s\n", arr[1][0], arr[1][1], arr[1][2], arr[1][3]);
//        System.out.printf("%s %s %s %s\n", arr[2][0], arr[2][1], arr[2][2], arr[2][3]);
//        System.out.printf("%s %s %s %s\n", arr[3][0], arr[3][1], arr[3][2], arr[3][3]);
//        int count = Stream.of(arr.length).mapToInt(m -> arr.length).sum();
//        long count = Arrays.stream(arr).count();