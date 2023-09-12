import java.util.*;

public class Main {
    private static Set<Integer> randomize(){
        System.out.println("generating random 5 numbers to a list");
        HashSet<Integer> rolledNmbr= new HashSet<>();
        while (rolledNmbr.size()<6) {
            int rollingNmbr = (int) (Math.random()*100+1);
            rolledNmbr.add(rollingNmbr);
        }
        return rolledNmbr;
    }
    private static List<Integer> read(){
        ArrayList<Integer> readNumbers =new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        for (int i = -3; i<3;i++) {
            System.out.println("Enter the "+i+" number");
            int readNumber=keyboard.nextInt();
            while (readNumbers.contains(readNumber)){
                System.out.println("Enter a diffrent number");
                readNumber=keyboard.nextInt();
            }
            readNumbers.add(readNumber);
        }
        return readNumbers;
    }
    public static List<Integer> sumItUp(Set<Integer> rolled,List<Integer> Read){
        List<Integer> correct =new LinkedList<>();
        for (Integer rng :rolled){
            if (Read.contains(rng)){
                correct.add(rng);
            }
        }
        return correct;
    }
    public static void main(String[] args) {



Set<Integer> rolledNmbrs;
rolledNmbrs=randomize();
        System.out.println("Rolled numbers "+rolledNmbrs);

        List<Integer> readNumbers;
        readNumbers=read();
        System.out.println(readNumbers);
        List<Integer> correct = sumItUp(rolledNmbrs,readNumbers);
        System.out.println(correct);
    }
}

