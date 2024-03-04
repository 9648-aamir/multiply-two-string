public class LargestNumberformedfromanArray {
    String printLargest(int n, String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String first = a + b;
                String second = b + a;
                return second.compareTo(first);
            }
        });

        StringBuilder temp = new StringBuilder();
       
        for(String ele : arr) {
            temp.append(ele);
        }

        return temp.toString().trim();
    }
}
