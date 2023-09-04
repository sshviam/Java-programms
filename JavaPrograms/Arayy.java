public class Arayy {
    public static void main(String[] args) {
        int[] Numbers = new int[5];
        String[] Name = new String[5];
        String[] Deparment = new String[5];
        Double[] Marks = new Double[5];

        Numbers[0] = 23;
        Name[0] = "Batman";
        Deparment[0] = "classifed";
        Marks[0] = 45.6;

        Numbers[1] = 23;
        Name[1] = "Superman";
        Deparment[1] = "classifed";
        Marks[1] = 45.6;

        Numbers[2] = 23;
        Name[2] = "Spiderman";
        Deparment[2] = "classifed";
        Marks[2] = 45.6;

        Numbers[3] = 23;
        Name[3] = "Ironman";
        Deparment[3] = "classifed";
        Marks[3] = 45.6;

        Numbers[4] = 23;
        Name[4] = "Thor";
        Deparment[4] = "classifed";
        Marks[4] = 45.6;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + Name[i]);
            System.out.println("Numbers: " + Numbers[i]);
            System.out.println("Marks: " + Marks[i]);
            System.out.println();
    }
}
}
