public class countrepeatednumarr {
    public static void main(String[] args) {
        int[] arr={8,9,2,1,1,2,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                {
                    count++;
                }
             }if(count>=arr.length/2){
                System.out.println(arr[i]+":"+count);
                break;
            }
            count=0;
        }
    }
}


