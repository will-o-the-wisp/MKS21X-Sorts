import java.util.Random;
public class Sorts{
  public static void selectionSort(int[] ary){
    int min=ary[0];
    int start=0;
    int index=0;
    while(start<ary.length){
      min=ary[start];
      for(int i=start;i<ary.length;i++){
        if(ary[i]<=min){
          min=ary[i];
          index=i;
        }
      }
      ary[index]=ary[start];
      ary[start]=min;
      start++;
    }
  }
  public static void bubbleSort(int[] ary){
    
  }
  public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
  }
  public static void main(String[] args) {
    int[] ary=new int[Integer.parseInt(args[0])];
    Random r = new Random();
    for(int i=0;i<ary.length;i++){
      ary[i]=r.nextInt();
    }
    selectionSort(ary);
    // Google random int generator
    /*
    String sorted = "";

    // 8 nums, [0:10]
    int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
    System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]

    sort(test_a);

    sorted = printArray(test_a);
    System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]

    if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 12 nums, [0:20]
    int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
    System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

    sort(test_b);

    sorted = printArray(test_b);
    System.out.println(sorted);               // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

    if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 20 nums, [0:100]
    int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
    System.out.println(printArray(test_c));   // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

    sort(test_c);

    sorted = printArray(test_c);
    System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

    if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }
    */
  }
}
