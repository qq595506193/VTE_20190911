package com.example.tidus.ristrat.api;

import com.example.tidus.ristrat.bean.Assessment;
import com.example.tidus.ristrat.bean.CommitBean;
import com.example.tidus.ristrat.bean.Infrom;
import com.example.tidus.ristrat.bean.LoginBean;
import com.example.tidus.ristrat.bean.Patient;
import com.example.tidus.ristrat.bean.PlanBean;
import com.example.tidus.ristrat.bean.ReportBean;
import com.example.tidus.ristrat.bean.RiskBean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface RetrofitApi {
    //登录
    @GET("Login")
    Call<LoginBean> Login(@QueryMap Map<String,String> params);
    //计划管理页面
    @GET("RobotBackground.do")
    Observable<PlanBean> getPlanBean(@QueryMap Map<String,String> params);
    //查询评估问卷列表
    @GET("his.do")
    Observable<Patient> getPatient(@QueryMap Map<String,String> params);
    //查询评估问卷
    @GET("RobotappBG.do")
    Observable<Assessment> getAssessment(@QueryMap Map<String,String> params);
    //查询问卷下对应危险因素
    @GET("RobotappBG.do")
    Observable<RiskBean> getRiskBean(@QueryMap Map<String,String> params);
    //个人评估报告
    @GET("RobotappBG.do")
    Observable<ReportBean> getReport(@QueryMap Map<String,String> params);
    //VTE风险评估个人报告提交
    @GET("RobotBackground.do")
    Observable<CommitBean> getCommit(@QueryMap Map<String,String> params);
    //查看报告
    @GET("RobotBackground.do")
    Observable<Infrom> getInfrom(@QueryMap Map<String,String> params);
}
