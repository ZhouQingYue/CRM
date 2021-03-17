package com.zqy.crm.settings.dao;

import com.zqy.crm.settings.domain.DicValue;

import java.util.List;

public interface DicValueDao {
    List<DicValue> getListByCode(String code);
}
