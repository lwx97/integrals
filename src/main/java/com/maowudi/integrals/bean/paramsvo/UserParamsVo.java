package com.maowudi.integrals.bean.paramsvo;

import com.maowudi.integrals.bean.revo.Page;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserParamsVo implements Serializable {

    private Page page = new Page();

    private String userName;
}
