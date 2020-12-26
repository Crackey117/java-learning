package academy.learnprogramming;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBypes){
        if(kiloBypes < 0){
            System.out.println("Invalid Value");
        }else {
            int megaBytes = Math.round(kiloBypes/1024);
            int remainingKiloBytes = Math.round(kiloBypes % 1024);
            System.out.println(kiloBypes + "KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
