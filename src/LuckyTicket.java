import java.util.Arrays;
import java.util.Random;

public class LuckyTicket {
    public static void main(String[]args) {
        int[] numberFirm = new int[7];
        int[] numberHuman = new int[7];
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            numberFirm[i] = random.nextInt(10);
            numberHuman[i] = random.nextInt(10);
        }
        Arrays.sort(numberFirm);
        Arrays.sort(numberHuman);
        int coincidence = 0;
        for (int i = 0; i < 7; i++) {
            if (numberHuman[i] == numberFirm[i]) {
                coincidence++;

            }
        }
        System.out.println(Arrays.toString(numberFirm));
        System.out.println(Arrays.toString(numberHuman));
        System.out.println(" Кількість збігів " + coincidence);

    }
}



