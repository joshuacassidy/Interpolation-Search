
public class Interpolation {


    public Integer search(int arr[], int p, int r, int key) {
        while ((arr[r] !=  arr[p]) && (key >= arr[p]) && (key <= arr[r])) {
            int q = p + ((key - arr[p]) * (r - p) / (arr[r] - arr[p]));
            if (arr[q] < key) {
                p = q + 1;
            } else if (arr[q] > key) {
                r = q -1;
            } else {
                return q;
            }
        }
        return null;
    }

    public Integer recursivesearch(int arr[], int p, int r, int key) {
        int x = recursiveSearch(arr, p, r, key);
        return x;
    }

    public Integer recursiveSearch(int arr[], int p, int r, int key) {
        if ((arr[r] !=  arr[p]) && (key >= arr[p]) && (key <= arr[r])) {
            int q = p + ((key - arr[p]) * (r - p) / (arr[r] - arr[p]));
            return arr[q] < key ? recursiveSearch(arr,q+1,r,key) : arr[q] > key ? recursiveSearch(arr,p,q-1,key) : q;
        } else {
            return null;
        }
    }

}
