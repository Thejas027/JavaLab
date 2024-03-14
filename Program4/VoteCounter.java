package Program4;

import java.util.Scanner;

class electioin {

    int spoilBallot = 0;
    int totalVotes = 0;

    void counting(int[] count) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to exit the voting");
        while (true) {
            System.out.println(" enter the ballot value to vote the canditate");
            int vote = sc.nextInt();
            if (vote >= 1 && vote <= 5) {
                totalVotes++;
                System.out.println("Its a valid ballot");
                switch (vote) {
                    case 1:
                        count[0]++;
                        break;
                    case 2:
                        count[1]++;
                        break;
                    case 3:
                        count[2]++;

                        break;
                    case 4:
                        count[3]++;
                        break;
                    case 5:
                        count[4]++;
                        break;
                    case 6:
                        count[5]++;
                        break;

                }
            } else if (vote == 0)
                break;
            else {
                System.out.println("its a spoit ballot \n");
                spoilBallot++;
                break;
            }
        }
    }

    void display(int count[]) {
        System.out.println("election result\n");
        System.out.println("total number of count votes = " + totalVotes);
        for (int i = 0; i < 5; i++) {
            System.out.println("candidate - " + (i + 1) + "got " + count[i] + "votes");
        }
        System.out.println("number of spoit ballots : " + spoilBallot);
    }

}

public class VoteCounter {
    public static void main(String[] args) {
        int[] count = new int[5];
        electioin e = new electioin();
        e.counting(count);
        e.display(count);
    }
}