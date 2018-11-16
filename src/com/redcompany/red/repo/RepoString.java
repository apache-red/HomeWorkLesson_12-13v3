package com.redcompany.red.repo;

import java.util.ArrayList;
import java.util.List;

public class RepoString extends Repo {

    List<String> stringList = new ArrayList<String>();


    public void addDataToRepo(String str) {
        stringList.add(str);
    }

    public  void showStringList(){
        for (String str:stringList
        ) {
            System.out.print(str);
        }
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
}
