public class Main {
    public static void main(String[] args) {
        int[] a = {10, 7, 8, 90, 5};
        int[] b = {110,91,89,71};
        System.out.println(any(a,b));
    }

    static boolean contains(int[] array, int value) {
        for (int v : array) {
            if (v == value)
            {
                return true;
            }
        }
        return false;
    }

    static boolean any (int [] a, int [] b)
    {
        for (int v : b) {
            if(contains(a, v))
            {
                return true;
            }
        }
        return false;
    }
}