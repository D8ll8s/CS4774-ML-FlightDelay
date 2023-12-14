import java.util.Random;

public class DogBreeds {

    public static void main(String[] args){
        String[] breed = {"Doberman","Chihuahua","Newfoundland","Mastiff","Sheperd"};
        int[] percentage = new int[breed.length];
        Random rand = new Random();

        int totalPercent = 100;

        for(int i = 0; i < breed.length; i++){
            if (i == breed.length -1 || totalPercent < 2){
                percentage[i] = totalPercent;
                break;
            }
            int breedPercentage = rand.nextInt(totalPercent -1) + 1;
            percentage[i] = breedPercentage;
            totalPercent = totalPercent - breedPercentage;
        }

        for(int j = 0; j < breed.length; j++){
            System.out.println(percentage[j] + " " + breed[j]);
        }

    }
}
