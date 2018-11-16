package com.redcompany.red.repo;

import java.util.ArrayList;
import java.util.List;

public class RepoChar extends Repo {




    List<Character> characterList = new ArrayList<Character>();



    public void addDataToRepo(Character ch) {
        characterList.add(ch);
    }

    public  void showCharacterList(){
        for (char c:characterList
             ) {
            System.out.print(c);
        }
    }


    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }


}
