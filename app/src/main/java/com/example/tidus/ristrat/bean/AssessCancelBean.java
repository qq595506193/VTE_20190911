package com.example.tidus.ristrat.bean;

import java.io.Serializable;

public class AssessCancelBean implements Serializable {

    /**
     * code : 0
     * message : 成功
     * server_code :
     * server_params :
     */

    private String code;
    private String message;
    private String server_code;
    private String server_params;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getServer_code() {
        return server_code;
    }

    public void setServer_code(String server_code) {
        this.server_code = server_code;
    }

    public String getServer_params() {
        return server_params;
    }

    public void setServer_params(String server_params) {
        this.server_params = server_params;
    }
}
