package Librarys;

import java.io.*;

public class bot {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("usernames.txt");

        if (!file.exists()) {
            file.createNewFile();
        }

        System.out.print("Enter your name: ");
        String name = br.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        boolean userExists = false;
        String line;
        while ((line = fileReader.readLine()) != null) {
            if (line.equals(name)) {
                userExists = true;
                break;
            }
        }
        fileReader.close();

        if (!userExists) {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true));
            fileWriter.write(name + "\n");
            fileWriter.close();
            System.out.println("Добро пожаловать! Чем могу помочь?");
        } else {
            System.out.println("С возвращением! Чем могу помочь?");
        }

    }
}
