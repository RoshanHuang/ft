package com.vtest.it.ft.Controller;

import com.vtest.it.ft.domain.GobangBean;
import com.vtest.it.ft.domain.ResultBean;
import com.vtest.it.ft.service.tooling.Gobang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gobang")
@CrossOrigin
public class GobangController {

    @Autowired
    private Gobang gobang;
    @PostMapping("/history")
    public void addGobangHistory(@RequestBody GobangBean gobangBean){
         gobang.addGobangHistory(gobangBean);
    }
    @PostMapping("/result")
    public void addGobangResult(@RequestBody ResultBean bean){
        gobang.addGobangResult(bean);
    }
}
