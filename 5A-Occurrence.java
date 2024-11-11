import java.io.*;

class Occurrence {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Please provide a single character to search for.");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream("Input.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int i;
            int occur = 0;

            while ((i = bis.read()) != -1) {
                char a = (char) i;
                if (a == args[0].charAt(0)) {
                    occur++;
                }
            }

            System.out.println("The letter '" + args[0].charAt(0) + "' occurs " + occur + " times in the file.");

            bis.close();
            fis.close();

        } catch (Exception ex) {
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}
