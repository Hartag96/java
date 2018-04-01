import java.util.Random;
import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.List;

public class fileProcedure {
public static void procedureIO(char [] tab) throws IOException {
        int i = 0;
        FileWriter writer = null;
        FileReader reader = null;
        char[] cbuf = new char[1000];

        try { // Zapis
                writer = new FileWriter("1000.txt");
                writer.write(tab, 0, 1000);
        } catch(Exception e) {
                e.printStackTrace();
        } finally {
                if (writer != null)
                        writer.close();
        }

        try { // Odczyt
                reader = new FileReader("1000.txt");
                reader.read(cbuf, 0, 1000);
                System.out.println(cbuf);
        } catch(Exception e) {
                e.printStackTrace();
        } finally {
                if (reader != null)
                        reader.close();
        }
}
public static void procedureNIO(char [] tab) throws IOException {
        Path path = Paths.get("1000.txt");
        int i = 0;
        try {
                byte[] bs = new byte[1000];
                for(i = 0; i < 1000; i++) {
                        bs[i] = (byte) tab[i];
                }
                Files.write(path, bs);
                List<String> strings = Files.readAllLines(path);
                System.out.println(strings);
        } catch (Exception e) {
                e.printStackTrace();
        }

}
public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        String line = null;
        Random generator = new Random();
        int rand = 0;
        //System.out.println(Character.toString ((char) rand));
        int i = 0;
        int c;
        char [] tab = new char[1000];
        for(; i < 1000; i++) {
                rand = generator.nextInt(126 - 33 + 1) + 33;
                tab[i] = (char) rand;
        }


        long startTimeIO = System.nanoTime();
        procedureIO(tab);
        long endTimeIO = System.nanoTime();
        long durationIO = (endTimeIO - startTimeIO);


        long startTimeNIO = System.nanoTime();
        procedureNIO(tab);
        long endTimeNIO = System.nanoTime();
        long durationNIO = (endTimeNIO - startTimeNIO);

        System.out.println("\n\nCzas wykonywania procedura z biblioteki  IO: " + durationIO);
        System.out.println("Czas wykonywania procedura z biblioteki NIO: " + durationNIO);
        if(durationIO < durationNIO)
                System.out.println("Procedura IO jest szybsza");
        else
                System.out.println("Procedura NIO jest szybsza");
}


}
