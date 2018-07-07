package com.iteaj.util.module.oauth2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by iteaj on 2017/3/14.
 */
public abstract class AbstractAuthorizeResult {

    private String errMsg;
    private boolean success;
    protected AbstractStorageContext context;

    public AbstractAuthorizeResult(AbstractStorageContext context) {
        this.errMsg = "Ok";
        this.success = true;
        this.context = context;
    }

    public abstract void build();

    public boolean success() {
        return false;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public AbstractAuthorizeResult setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AbstractAuthorizeResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Object getContextParam(String key) {
        return context.getContextParam(key);
    }

    public AuthorizeContext getContext() {
        return context;
    }

    public HttpServletRequest getRequest(){
        return context.getRequest();
    }

    public HttpServletResponse getResponse(){
        return context.getResponse();
    }
}
