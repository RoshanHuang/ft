package com.vtest.it.ft.service.tooling.impl;

import com.vtest.it.ft.dao.GobangDao;
import com.vtest.it.ft.domain.GobangBean;
import com.vtest.it.ft.domain.ResultBean;
import com.vtest.it.ft.service.tooling.Gobang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GobangImpl implements Gobang {
    @Autowired
    private GobangDao gobangDao;
    @Override
    public void addGobangHistory(GobangBean gobangBean) {
       gobangDao.addGobangHistory(gobangBean);

    }
    @Override
    public void addGobangResult(ResultBean bean) {
        gobangDao.addGobangResult(bean);
    }
}
