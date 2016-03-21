package basic;

/**
 * Created by jyheo on 2016-03-22.
 */
public class SetOperation {
    public static int[] union(int[] A, int[] B) {
        // TODO: return union of set A and B
        return new int[0];
    }

    public static int[] intersection(int[] A, int[] B) {
        // TODO: return intersection of set A and B
        return new int[0];
    }

    public static void print_array(int[] A) {
        for (int x : A)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5};
        int[] B = new int[]{3, 5, 7, 8, 9};

        int[] C = intersection(A, B);
        print_array(C);

        int[] D = union(A, B);
        print_array(D);
    }
}
