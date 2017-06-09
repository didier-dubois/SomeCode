package ch.dd.interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  - Describe each line.
 *  - Does it compile? Why?
 *  - Please comment & argue the code.
 *  - Explain intent.
 */
public class Files {

    public static void main(String[] args) {
        String fileName = "myfile.md";
        new Files().run(fileName);
    }

    private void run(String fileName) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            String content = "This is the content to write into file\n";
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            bw.write(content);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
