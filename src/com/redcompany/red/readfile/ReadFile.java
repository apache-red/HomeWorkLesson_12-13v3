package com.redcompany.red.readfile;

import com.redcompany.red.repo.RepoChar;
import com.redcompany.red.repo.RepoString;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {



    public void readFromFile(RepoChar repoChar) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(("./src/com/redcompany/red/readfile/text.txt"))))
        {
            int c;
            while((c=reader.read())!=-1){
               repoChar.addDataToRepo((char)c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was no found!");
        } catch (IOException e) {
            System.out.println("Problems with the file");
        }
    }

    public void readFromFile(RepoString repoString) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(("./src/com/redcompany/red/readfile/text.txt"))))
        {
            String line;
            while ((line = reader.readLine()) != null) {
                repoString.addDataToRepo(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was no found!");
        } catch (IOException e) {
            System.out.println("Problems with the file");
        }
    }


}
