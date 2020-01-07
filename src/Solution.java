
/*
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String resourceFileName = reader.readLine();
        String storageFileName1 = reader.readLine();
        String storageFileName2 = reader.readLine();
        FileInputStream fileReader = new FileInputStream(resourceFileName);
        FileOutputStream fileWriter1 = new FileOutputStream(storageFileName1);
        FileOutputStream fileWriter2 = new FileOutputStream(storageFileName2);
        if(fileReader.available() % 2 == 0) {
            byte[] buffer = new byte[fileReader.available() / 2];
            byte[] buffer2 = new byte[fileReader.available() / 2];
            while (fileReader.available() > 0) {
                int count = fileReader.read(buffer);
                int count2 = fileReader.read(buffer2);
                fileWriter1.write(buffer, 0, count);
                fileWriter2.write(buffer2, 0, count2);
            }
        }
        else {
            byte[] buffer = new byte[fileReader.available() / 2 + 1];
            byte[] buffer2 = new byte[fileReader.available() / 2];
            while (fileReader.available() > 0) {
                int count = fileReader.read(buffer);
                int count2 = fileReader.read(buffer2);
                fileWriter1.write(buffer, 0, count);
                fileWriter2.write(buffer2, 0, count2);

            }
        }
        reader.close();
        fileReader.close();
        fileWriter1.close();
        fileWriter2.close();


    }
}
