package com.zqy.crm.workbench.dao;

import com.zqy.crm.workbench.domain.Clue;

public interface ClueDao {


    int save(Clue c);

    Clue detail(String id);
}
