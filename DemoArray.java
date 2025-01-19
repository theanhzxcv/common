public class Array {
    public static void addNewValue(int[] arr, int n, int pos, int val) {
        int[] newArr = new int[n + 1];

        // Sao chép phần tử trước vị trí chèn
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Chèn giá trị mới
        newArr[pos] = val;

        // Sao chép phần tử sau vị trí chèn
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        n++;

        // Hiển thị mảng sau khi chèn
        System.out.println("Mảng sau khi chèn:");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

    }

    public static void removeExistsValue(int[] arr, int n, int pos) {
        int[] newArr = new int[n-1];

        // Sao chép phần tử trước vị trí xoá
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Sao chép phần tử sau vị trí xoá
        for (int i = pos+1; i < n; i++) {
            newArr[i - 1] = arr[i];
        }

        n--;

        // Hiển thị mảng sau khi xoá
        System.out.println("Mảng sau khi xoá:");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();

    }

    public static void searchValue(int[] arr, int n, int val) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == val) {
                found = true;
                System.out.println("Tìm thấy phần tử " + val + " tại vị trí " + (i+1) + " ");
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy phần tử " + val + " trong mảng.");
        }
    }

    public static void sortArrayAsc(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void binarySearch(int[] arr, int leftIndex, int rightIndex, int val) {
        // Sắp xếp mảng tăng dần
        sortArrayAsc(arr);

        // Trả về khi không tìm thấy phần tử
        if (leftIndex > rightIndex) {
            System.out.println("Không tìm thấy phần tử " + val);
            return;
        }

        // Lấy chỉ số ở giữa mảng, chia mảng ra làm 2 phần
        int midIndex = leftIndex + (rightIndex-leftIndex)/2;

        // Nếu phần tử ở chỉ số giữa chính là phần tử cần tìm, found = true, trả về và dừng đệ quy
        if (arr[midIndex] == val) {
            System.out.println("Tìm thấy phần tử " + val + " tại vị trí " + midIndex);
            return;
        }

        // Nếu phần tử ở chỉ số giữa lớn hơn phần tử cần tìm, gọi đệ quy tìm kiếm về bên trái, hoặc ngược lại
        if (arr[midIndex] > val) {
            binarySearch(arr, leftIndex, midIndex-1, val);
        } else {
            binarySearch(arr, midIndex + 1, rightIndex, val);
        }
    }

    public static void updateValue(int[] arr, int n, int pos, int val) {
        for (int i = 0; i < n; i++) {
            if ((i+1) == pos) {
                arr[i] = val;
            }
        }

        // Hiển thị mảng sau khi cập nhật
        System.out.println("Mảng sau cập nhật:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 3, 5, 20, 9};

        // Hiển thị mảng ban đầu
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        addNewValue(arr, n, 3, 40);
        removeExistsValue(arr, n, 3);
        searchValue(arr, n, 10);
        updateValue(arr, n, 3, 10);
        searchValue(arr, n, 10);
        sortArrayAsc(arr);

        // Hiển thị mảng sau khi sắp xếp
        System.out.println("Mảng sau sắp xếp tăng dần: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        binarySearch(arr, 0, arr.length-1, 10);
    }
}
