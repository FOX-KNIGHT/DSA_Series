public class Merge_Sort {
    public static void divide(int[] arr, int start, int end){
        if(start<end){
            int mid=start+(end-start)/2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int n1=mid-start+1;
        int n2=end-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
        for(int i=0;i<l.length;i++){
            l[i]=arr[start+i];
        }
        for(int i=0;i<r.length;i++){
            r[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=start;
        for( k=start;k<end;k++){
            if(l[i]<=r[j]){
                arr[k]=l[i];
                i++;
            }else{
                arr[k]=r[j];
                j++;
            }
        }
        while (i < n1) {
            arr[k] = l[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        divide(arr, 0, arr.length);
        System.out.println();
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}