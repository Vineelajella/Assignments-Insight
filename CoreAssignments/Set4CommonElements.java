package CoreAssignments;

import java.util.HashSet;
import java.util.Set;

public class Set4CommonElements {
    public static int[] findCommonElements(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        for (int num : a) {
            setA.add(num);
        }

        for (int num : b) {
            if (setA.contains(num)) {
                commonElements.add(num);
            }
        }

        int[] result = new int[commonElements.size()];
        int index = 0;
        for (int num : commonElements) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        int[] result = findCommonElements(a, b);

        System.out.print("Common elements: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

