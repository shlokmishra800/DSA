// Question=> Check whether is array is sorted or not (strictly ascending order)

public class CheckSorted {
    public static boolean checkSort(int idx, int arr[]) {

        if (idx == arr.length - 1) {

            return true;
        }

        if (arr[idx] < arr[idx + 1]) {

            return checkSort(idx + 1, arr);
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 3, 1 };
        System.out.println(checkSort(0, arr));
    }
}

// output => false

// time complexity = O(n)
// where n = length of array