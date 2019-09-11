package com.example.tidus.ristrat.callback;

import com.example.tidus.ristrat.bean.AssessCancelBean;
import com.example.tidus.ristrat.bean.CancelAssessBean;
import com.example.tidus.ristrat.bean.CaseControlBean;
import com.example.tidus.ristrat.bean.CheckRiskBean;
import com.example.tidus.ristrat.bean.CommitBean;
import com.example.tidus.ristrat.bean.EvaluatingBean;
import com.example.tidus.ristrat.bean.HistoryAssessBean;
import com.example.tidus.ristrat.bean.LaterOnBean;
import com.example.tidus.ristrat.bean.MessageBean;
import com.example.tidus.ristrat.bean.MessageStratBean;
import com.example.tidus.ristrat.bean.MessageUpdateBean;
import com.example.tidus.ristrat.bean.NowSelectTablesBean;
import com.example.tidus.ristrat.bean.QueryHMBean;
import com.example.tidus.ristrat.bean.RiskAssessmentBean;
import com.example.tidus.ristrat.bean.SaveCommitBean;
import com.example.tidus.ristrat.bean.SelectedTablesBean;

import java.util.HashMap;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface IRetrofitServer {

    // 患者列表展示
    @GET
    Observable<CaseControlBean> doCaseControlGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 消息列表展示
    @GET
    Observable<MessageBean> doMessageListGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 消息状态修改
    @GET
    Observable<MessageUpdateBean> doMessageTypeUpdateGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 查询未读消息条数
    @GET
    Observable<ResponseBody> doMessageNumGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 查询题目表格列表
    @GET
    Observable<RiskAssessmentBean> doRiskTableListGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 历史评估查询
    @GET
    Observable<HistoryAssessBean> doHistoryAssessGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 提交表格
    @GET
    Observable<CommitBean> doCommitGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 保存表格
    @GET
    Observable<SaveCommitBean> doSaveGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 提醒变色
    @GET
    Observable<QueryHMBean> doQueryHMGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 取消评估
    @GET
    Observable<CancelAssessBean> doCancelAssessGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 评估中监控
    @GET
    Observable<EvaluatingBean> doEvaluatingGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 加勾选
    @GET
    Observable<CheckRiskBean> doCheckRiskGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 终止评估
    @GET
    Observable<AssessCancelBean> doAssessCancelGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 立即问卷查询
    @GET
    Observable<NowSelectTablesBean> doNowSelectTablesGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 业务问卷查询
    @GET
    Observable<SelectedTablesBean> doSelectedTablesGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 稍后提醒
    @GET
    Observable<LaterOnBean> doLaterOnGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);

    // 查看是否可以从消息页面跳转
    @GET
    Observable<MessageStratBean> doMessageStartGet(@Url String apiUrl, @QueryMap HashMap<String, Object> params);
}
