package com.vtest.it.ft.dao;

import com.vtest.it.ft.domain.GobangBean;
import com.vtest.it.ft.domain.ResultBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface GobangDao {
    public void addGobangHistory(GobangBean gobangBean);
    public void addGobangResult(ResultBean bean);
}
