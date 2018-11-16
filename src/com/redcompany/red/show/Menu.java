package com.redcompany.red.show;

import com.redcompany.red.readfile.ReadFile;
import com.redcompany.red.repo.RepoChar;
import com.redcompany.red.repo.RepoList;
import com.redcompany.red.repo.RepoString;
import com.redcompany.red.work.Parse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

private ReadFile readFile;
private RepoString repoString;
private Parse parse = new Parse();
private RepoList repoList = new RepoList();


    public void start(){
        initFile();
    showMainMenu();
    choseActionMainMenu(writeAction());
    }


    private void showMainMenu() {
        System.out.println("Select an action. Enter the number 1....");
        System.out.println("1. Find the largest number of text sentences that have the same the words.");
//        System.out.println("2. Split input file into parts (WORKS!!!)");
//        System.out.println("4. Change speed unit KM/H & MILES/H (WORKS!!!)");
//        System.out.println("5. Sort vehicle lists. (WORKS!!!)");
//        System.out.println("6. Show All Array. (WORKS!!!)");
        System.out.println("0. Stop program. (WORKS!!!)");
        System.out.println("------------------------------");
    }


    private void choseActionMainMenu(int number) {
        switch (number) {
            case 1:
             initString();

                repoList.addDataToRepo(repoString = parse.parse_1((RepoString) repoList.getRepoList().get(1)));
             repoString.showStringList();
                break;
            case 2:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;

            case 0:
                System.out.println("Program was stopped");
                System.exit(0);
        }
        start();
    }

    private void initFile() {

        RepoChar repoChar = new RepoChar();
        ReadFile readFile = new ReadFile();
        readFile.readFromFile(repoChar);
        repoList.addDataToRepo(repoChar);
        System.out.println("Input file initialization!");
        //repoChar.showCharacterList();
    }
    private void initString() {
        RepoString repoString = new RepoString();
        ReadFile readFile = new ReadFile();
        readFile.readFromFile(repoString);
        repoList.addDataToRepo(repoString);
        System.out.println("Input String initialization!");
        //repoString.showStringList();
    }





    private int writeAction() {
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        int number = 5;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("!Exeption! Enter a number");
            writeAction();
        }
        return number;
    }
}
