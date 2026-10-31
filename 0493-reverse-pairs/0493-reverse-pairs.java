class Solution {
public int reversePairs(int[] nums) {

    int[] arr = Arrays.copyOf(nums, nums.length);

    if (arr.length < 2) {
        return 0;
    }

    return mergeSort(arr, 0, arr.length - 1);
}

// Divides the array and counts reverse pairs
private int mergeSort(int[] arr, int left, int right) {

    if (left >= right) {
        return 0;
    }

    int mid = left + (right - left) / 2;

    int count = 0;

    count += mergeSort(arr, left, mid);
    count += mergeSort(arr, mid + 1, right);

    count += countPairs(arr, left, mid, right);

    merge(arr, left, mid, right);

    return count;
}

// Counts pairs where arr[i] > 2 * arr[j]
private int countPairs(int[] arr, int left, int mid, int right) {

    int count = 0;
    int j = mid + 1;

    for (int i = left; i <= mid; i++) {

        while (j <= right && arr[i] > 2L * arr[j]) {
            j++;
        }

        count += j - (mid + 1);
    }

    return count;
}

// Merges two sorted halves
private void merge(int[] arr, int left, int mid, int right) {

    int[] temp = new int[right - left + 1];

    int i = left;
    int j = mid + 1;
    int k = 0;

    // Compare and insert smaller element
    while (i <= mid && j <= right) {

        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    // Copy remaining left elements
    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    // Copy remaining right elements
    while (j <= right) {
        temp[k++] = arr[j++];
    }

    // Copy sorted elements back
    for (int x = 0; x < temp.length; x++) {
        arr[left + x] = temp[x];
    }
}
}