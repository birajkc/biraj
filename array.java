import javax.sound.sampled.SourceDataLine;

public class array {
  

    public static void main(String[] args) {
        int arr[] ={1,5,8,9,2};
int max = arr[0];
for (int i=0; i<arr.length;i++){
            arr[4]=14;
            System.out.println(arr[i]);
        }
        for (int i=0; i<arr.length;i++){
            if(max <arr[i])
            max=arr[i];
            }
        
        System.out.println("biggest="+max);
    }
    }
