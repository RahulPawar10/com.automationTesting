package Programs;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String sentence = "This is a test test rahul sentence sentence with duplicate duplicate words words";

        String result = "";
        String arr[] = sentence.split(" ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result += arr[i]+" ";
            }
        }
        System.out.println("Original sentence: " + sentence);
        System.out.println("Sentence after removing duplicates: " + result);
    }
}
