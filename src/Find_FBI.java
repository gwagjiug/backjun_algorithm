import java.util.Scanner;

public class Find_FBI {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String[] agent = new String[5];


        for(int i = 0; i<agent.length; i++){

        agent[i] = sc.nextLine();

        }

        boolean foundFBI=false;

        for(int j = 0; j< agent.length; j++){

            if(agent[j].contains("FBI")){
                System.out.println((j + 1) + "");
                foundFBI = true;
            }
        }
        if (!foundFBI){
            System.out.println("HE GOT AWAY!");
        }


    }
}
