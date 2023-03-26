// STUDENT NAME:  
// STUDENT ID:    

public class Q1 {
   // METHOD 01:
   // This method prints the values of the argumnet int array.
   static void printIntArray(int[] array) {
      for (int i = 0; i < array.length; ++i)
         System.out.println("@index[" + i + "]:\t" + array[i]);
   }

   // METHOD 02:
   // This method prints the values of the argument String array.
   static void printStrArray(String[] array) {
      for (int i = 0; i < array.length; ++i)
         System.out.println("@index[" + i + "]:\t" + array[i]);
   }

   // METHOD 03:
   // This method inserts the given key value at index 0 in the array.
   // If the array already has a value at index 0, it will shift the
   // values to the right and make space for the new key.
   static void insertKey(int key, int[] array) {
      for (int i = array.length - 1; i > 0; --i)
         array[i] = array[i - 1];
      array[0] = key;
   }

   // METHOD 04:
   // This method performs the opposite function of the above method
   // and remove the key that exists at index 0 in an array. For
   // removal, this method shifts all values to one place to the left.
   static void removeKey(int[] array) {
      for (int i = 0; i < (array.length - 1); ++i)
         array[i] = array[i + 1];
      array[array.length - 1] = 0;
   }

   // METHOD 05:
   // This method copies all values from the argument array to new
   // array. It then returns the newly copied array.
   static int[] copyArray(int[] array) {
      int[] arr = new int[array.length];
      for (int i = 0; i < array.length; ++i)
         arr[i] = array[i];
      return arr;
   }

   // I have overloaded the METHOD 05 for String as well
   // Because, it is mentioned in the given instructions
   // whether it takes int array as an argument or String
   static String[] copyArray(String[] array) {
      String[] arr = new String[array.length];
      for (int i = 0; i < array.length; ++i)
         arr[i] = array[i];
      return arr;
   }

   // METHOD 06:
   // This method returns true if both the argument arrays have the
   // exact same values. Otherwise, returns false.
   static Boolean arraysEqual(int[] arrayA, int[] arrayB) {
      if (arrayA.length != arrayB.length)
         return false;

      for (int i = 0; i < arrayA.length; ++i)
         if (arrayA[i] != arrayB[i])
            return false;

      return true;
   }

   // I have overloaded the METHOD 06 for String as well
   // Because, it is mentioned in the given instructions
   // whether it takes int array as an argument or String
   static Boolean arraysEqual(String[] arrayA, String[] arrayB) {
      if (arrayA.length != arrayB.length)
         return false;

      for (int i = 0; i < arrayA.length; ++i)
         if (!(arrayA[i].equals(arrayB[i])))
            return false;

      return true;
   }

   // METHOD 07:
   // This method finds all String values that have 4 or more characters
   // from the argument array. It copies all those String values into a
   // new array and then returns the newly created array.
   static String[] findStrings(String[] array) {
      String[] arr = new String[array.length];
      int _arrLength = 0;

      for (int i = 0; i < array.length; ++i)
         if (array[i].length() > 3)
            arr[_arrLength++] = array[i];

      // let's remove null from arr in case it has
      String[] _arr = new String[_arrLength];
      for (int i = 0; i < _arrLength; ++i)
         _arr[i] = arr[i];

      return _arr;
   }

   // METHOD 08:
   // This method will switch the two halves of an array if the array
   // size is an even number. If the array size is not even, it displays
   // a message that switching cannot be done.
   static void switchHalves(int[] array) {
      if (array.length % 2 != 0) {
         System.out.println("Switching cannot be done!");
         return;
      }

      for (int i = 0, half = array.length / 2; i < half; ++i) {
         int hold = array[i];
         array[i] = array[i + half];
         array[i + half] = hold;
      }
   }

   // METHOD 09:
   // This method applied the Binary Search algorithm on the String
   // argument array.
   static Boolean binarySearch(String[] array, String key) {
      int left = 0;
      int right = array.length - 1;
      int mid = (left + right) / 2;

      while (left <= right) {
         if (key.compareTo(array[mid]) > 0)
            left = mid + 1;
         else if (array[mid].equals(key))
            return true;
         else
            right = mid - 1;

         mid = (left + right) / 2;
      }

      return !(left > right);
   }

   // METHOD 10:
   // Here, I have testes all above methods.
   public static void main(final String[] args) {
      int[] intArrayA = { 9, 13, 21, 4, 11, 7, 1, 3 };

      int[] intArrayB = new int[6];
      intArrayB[0] = 10;
      intArrayB[1] = 20;
      intArrayB[2] = 30;

      String strArray[] = { "Ali", "Usama", "Hamza" };

      System.out.println("intArrayA[8] = { 9, 13, 21, 4, 11, 7, 1, 3 }");
      System.out.println("intArrayB[6] = { 10, 20, 30, 0, 0, 0 }");
      System.out.println("strArray[3] = { \"Ali\", \"Usama\", \"Hamza\" }");

      // METHOD 01:
      System.out.println("\nprintIntArray(intArrayA) is called;");
      printIntArray(intArrayA);

      // METHOD 02:
      System.out.println("\nprintStrArray(strArray) is called;");
      printStrArray(strArray);

      // METHOD 03:
      System.out.println("\ninsertKey(100, intArrayB) is called;");
      insertKey(100, intArrayB);
      System.out.println("\nprintIntArray(intArrayB) is called;");
      printIntArray(intArrayB);

      // METHOD 04:
      System.out.println("\nremoveKey(intArrayB) is called;");
      removeKey(intArrayB);
      System.out.println("\nprintIntArray(intArrayB) is called;");
      printIntArray(intArrayB);

      // METHOD 05, 06:
      System.out.println("\narraysEqual(copyArray(intArrayA), intArrayA) is called;");
      if (arraysEqual(copyArray(intArrayA), intArrayA))
         System.out.println("Arrays Equal: TRUE");
      else
         System.out.println("Arrays Equal: FALSE");

      // METHOD 07:
      System.out.println("\nprintStrArray(findStrings(strArray)) is called;");
      printStrArray(findStrings(strArray));

      // METHOD 08:
      System.out.println("\nswitchHalves(intArrayA) is called;");
      switchHalves(intArrayA);
      System.out.println("\nprintIntArray(intArrayA) is called;");
      printIntArray(intArrayA);

      // METHOD 09:
      System.out.println("\nbinarySearch(strArray, \"Usama\") is called;");
      if (binarySearch(strArray, "Usama"))
         System.out.println("Value Found: TRUE");
      else
         System.out.println("Value Found: FALSE");
   }
}