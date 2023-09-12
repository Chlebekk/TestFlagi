import java.util.*;

public class Game {
    private static Set<Integer> rolled=new HashSet<>();
    private List<Integer> read;
    private List<Integer> correct;
    private static void randomize(){
        System.out.println("generating random 5 numbers to a list");
        while (rolled.size()<6) {
            int rollingNmbr = (int) (Math.random() * 100 + 1);
            rolled.add(rollingNmbr);
        }
    }
    private void readN(){
        read =new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        for (int i = 1; i<7;i++) {
            System.out.println("Enter the "+i+" number");
            int readNumber=keyboard.nextInt();
            while (read.contains(readNumber)){
                System.out.println("Enter a diffrent number");
                readNumber=keyboard.nextInt();
            }
            read.add(readNumber);
        }
    }
    private void sumItUp(){
        correct =new LinkedList<>();
        for (Integer rng :rolled){
            if (read.contains(rng)){
                correct.add(rng);
            }
        }
    }
    public void  play(){
        randomize();
        System.out.println("Rolled: "+rolled);
        readN();
        sumItUp();
        System.out.println("Read: "+read);
        System.out.println("Rolled: "+rolled);
        System.out.println("Correct: "+correct);
    }
}
