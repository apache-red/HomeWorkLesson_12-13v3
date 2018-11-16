package com.redcompany.red.work;


import com.redcompany.red.repo.RepoList;
import com.redcompany.red.repo.RepoString;

public class Parse {
    private RepoList repoList;

    public RepoString parse_1(RepoString repoString) {
        RepoString repoStringResult = new RepoString();
        for (int i = 0; i < repoString.getStringList().size(); i++) {
            String line = repoString.getStringList().get(i);

            for (String result : line.split("\\.")) {
               repoStringResult.addDataToRepo(result);
            }


        }
        return repoStringResult;
    }

}
