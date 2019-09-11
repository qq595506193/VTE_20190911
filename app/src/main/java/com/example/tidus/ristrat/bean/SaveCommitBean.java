package com.example.tidus.ristrat.bean;

import java.io.Serializable;

/**
 * Created by TriumphalSun
 * on 2019/7/19 0019
 */
public class SaveCommitBean implements Serializable {
    /**
     * code : 1
     * message : 失败
     * server_params :
     * server_code :
     */

    private String code;
    private String message;
    private String server_params;
    private String server_code;

    public String getCode() { return code;}

    public void setCode(String code) { this.code = code;}

    public String getMessage() { return message;}

    public void setMessage(String message) { this.message = message;}

    public String getServer_params() { return server_params;}

    public void setServer_params(String server_params) { this.server_params = server_params;}

    public String getServer_code() { return server_code;}

    public void setServer_code(String server_code) { this.server_code = server_code;}
}
