package Programs;



public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 4, 3, 9, 8, 7, 6, 4, 5, 3, 2, 1};
        String result = "";
        for (int i=0;i<num.length;i++){
            boolean isDuplicate=false;
            for (int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if (!isDuplicate){
                result+=num[i]+ " ";
            }
        }
        System.out.println("Original number: " );
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println("\nnumber after removing duplicates: " + result);
    }
}
