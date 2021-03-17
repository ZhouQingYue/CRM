package com.zqy.crm.settings.service.impl;

import com.zqy.crm.settings.dao.DicTypeDao;
import com.zqy.crm.settings.dao.DicValueDao;
import com.zqy.crm.settings.domain.DicType;
import com.zqy.crm.settings.domain.DicValue;
import com.zqy.crm.settings.service.DicService;
import com.zqy.crm.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DicServiceImpl implements DicService {
    private DicTypeDao dicTypeDao = SqlSessionUtil.getSqlSession().getMapper(DicTypeDao.class);
    private DicValueDao dicValueDao = SqlSessionUtil.getSqlSession().getMapper(DicValueDao.class);

    @Override
    public Map<String, List<DicValue>> getAll() {
        Map<String, List<DicValue>> map = new HashMap<>();
        List<DicType> dicTypeList = dicTypeDao.getTypeList();
        for (DicType dt : dicTypeList) {
            String code = dt.getCode();
            List<DicValue> dicValueList = dicValueDao.getListByCode(code);
            map.put(code + "List", dicValueList);
        }
        return map;
    }
}
