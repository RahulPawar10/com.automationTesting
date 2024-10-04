package Programs;

public class FindOutPresentNumberDuplicate {

    public static void main(String[] args) {
        int[] num = {1, 2, 5, 4, 3, 9, 8, 7, 6, 4, 5, 3, 2, 1};

        int ele=11;
        boolean ABC=false;
        for(Integer element:num){
            if (element==ele){
                System.out.println("Duplicate number "+ele);
                ABC=true;
                break;
            }
        }
        if (!ABC){
            System.out.println(" number not present "+ele);
        }
    }
}
