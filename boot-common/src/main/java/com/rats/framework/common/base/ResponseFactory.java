package com.rats.framework.common.base;

import java.io.Serializable;

public class ResponseFactory implements Serializable {
    /**
     * Field serialVersionUID
     */
    private static final long serialVersionUID = 1L;


    public static ResponseBean getSuccessResult(Object data) {
        ResponseBean bean = new ResponseBean<>();
        bean.setCode(ResponseBean.SUCCESS);
        bean.setMsg(ResponseBean.RESULT_SUCCESS);
        bean.setData(data);
        return bean;
    }
}
