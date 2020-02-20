package com.vtest.it.ft.service.tooling;

import com.vtest.it.ft.domain.GobangBean;
import com.vtest.it.ft.domain.ResultBean;

public interface Gobang {
    public void addGobangHistory(GobangBean gobangBean);
    public void addGobangResult(ResultBean bean);
}
