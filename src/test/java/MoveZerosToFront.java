import java.util.*;
class MoveZerosToFront {
    public static void main(String[] args) {
        int[] arr={1,0,2,0,3,0};int n=arr.length;int size=n-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=0){
                arr[size]=arr[i];
                size--;
            }
        }
        while(size>=0){
            arr[size]=0;
            size--;
        }
        System.out.print(Arrays.toString(arr));
    }

    }