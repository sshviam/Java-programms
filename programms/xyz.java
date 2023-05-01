package programms;
import java.util.Scanner;
public class xyz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double teamAustralia = 1.0;
        double teamNewzland = 0.4;
        double teamEngland = 0.5;
        double teamPakistan = 0.8;
        
        if (teamAustralia > teamNewzland && teamAustralia > teamEngland && teamAustralia > teamPakistan) {
            System.out.println("Team Australia has the highest win percentage.");
        } else if (teamNewzland > teamEngland && teamNewzland > teamPakistan) {
            System.out.println("Team Newzland has the highest win percentage.");
        } else if (teamEngland > teamPakistan) {
            System.out.println("Team England has the highest win percentage.");
        } else {
            System.out.println("Team Pakistan has the highest win percentage.");
        }
        sc.close();
    }
}
