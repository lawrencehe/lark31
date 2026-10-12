package com.larksuite.framework.lark.open.plugin.openapi.liveAuthentication;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.BizType;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.LKBaseRequestModel;
import com.larksuite.framework.apiplugin.common.LKBaseResponseModel;
import com.larksuite.framework.apiplugin.validator.format.Min;
import com.larksuite.framework.lark.open.infra.annotation.ApiConfig;
import com.ss.android.socialbase.downloader.api.BuildConfig;
import ht1.h;
import ht1.p;
import ht1.x;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/larkdex/classes3.dex */
public class StartFaceVerifyPlugin extends BaseFaceCheckPlugin {
    private is1.h<ApiFaceVerifyResponse> invokeCallback;
    private ht1.f logger;

    public static class ApiFaceVerifyRequest extends LKBaseRequestModel {

        @Min(include = false, value = 0.0d)
        @JSONField(name = "actionsScene")
        public String actionsScene;
        public String sessionType;
        public String sessionValue;

        @JSONField(name = "userId")
        @LKRequiredParam
        public String userId;
    }

    public static class ApiFaceVerifyResponse extends LKBaseResponseModel {

        @JSONField(name = "reqNo")
        public String reqNo;
    }

    class a implements h.c {
        final /* synthetic */ String a;

        @Override // ht1.h.c
        public void a(String str) {
            StartFaceVerifyPlugin.this.logI("face verify success");
            StartFaceVerifyPlugin.this.callbackOk(str);
        }

        @Override // ht1.h.c
        public void b(JSONObject jSONObject) {
            int iOptInt = jSONObject.optInt("errorCode", -1);
            String strOptString = jSONObject.optString("errorMsg", BuildConfig.VERSION_NAME);
            ApiFaceVerifyResponse apiFaceVerifyResponse = new ApiFaceVerifyResponse();
            if (iOptInt == -1) {
                StartFaceVerifyPlugin.this.fillFailedResponse(apiFaceVerifyResponse, ms1.h.K, "unknown error", ns1.d.b(strOptString, String.valueOf(iOptInt)));
                StartFaceVerifyPlugin.this.invokeCallback.a(apiFaceVerifyResponse);
            } else {
                StartFaceVerifyPlugin startFaceVerifyPlugin = StartFaceVerifyPlugin.this;
                startFaceVerifyPlugin.callbackFail(iOptInt, strOptString, startFaceVerifyPlugin.getCertSdkError(iOptInt, strOptString));
            }
            StartFaceVerifyPlugin.this.logI("onIpcCallback error, code:" + iOptInt + " errMsg:" + strOptString + " ticket:" + this.a);
        }

        a(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackOk(String str) {
        ApiFaceVerifyResponse apiFaceVerifyResponse = new ApiFaceVerifyResponse();
        apiFaceVerifyResponse.reqNo = str;
        is1.h<ApiFaceVerifyResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.a(apiFaceVerifyResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logI(String str) {
        ht1.f fVar = this.logger;
        if (fVar != null) {
            fVar.i("ApiFaceVerifyPlugin", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTicket$0(ApiFaceVerifyResponse apiFaceVerifyResponse, String str) throws Exception {
        logI("getTicket onResult");
        if (TextUtils.isEmpty(str)) {
            ht1.f fVar = this.logger;
            if (fVar != null) {
                fVar.e("ApiFaceVerifyPlugin", "response is null");
            }
            fillFailedResponse(apiFaceVerifyResponse, js1.e.f, "response is null", ns1.d.e);
            this.invokeCallback.a(apiFaceVerifyResponse);
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("code") && jSONObject.getInt("code") == 0 && jSONObject.has("data")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            String strOptString = jSONObjectOptJSONObject.optString("ticket");
            String strOptString2 = jSONObjectOptJSONObject.optString("scene");
            int iOptInt = jSONObjectOptJSONObject.optInt("appId", -1);
            int iOptInt2 = jSONObjectOptJSONObject.optInt("mode", -1);
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && iOptInt != -1 && iOptInt2 != -1) {
                x xVar = (x) this.appContext.findService(x.class);
                if (xVar != null) {
                    xVar.c0("startFaceVerify");
                }
                doFaceLive(strOptString2, strOptString, iOptInt, iOptInt2);
                return;
            }
            ht1.f fVar2 = this.logger;
            if (fVar2 != null) {
                fVar2.e("ApiFaceVerifyPlugin", String.format("getTicket. params error. ticket is null:%b. scene is null:%b. aid=%d. mode=%d", strOptString, strOptString2, Integer.valueOf(iOptInt), Integer.valueOf(iOptInt2)));
            }
            fillFailedResponse(apiFaceVerifyResponse, js1.e.f, "getTicket. params error. ticket is null", ns1.d.e);
            this.invokeCallback.a(apiFaceVerifyResponse);
            return;
        }
        int iOptInt3 = jSONObject.optInt("code", -1);
        String strOptString3 = jSONObject.optString("msg", "fail");
        callbackFail(iOptInt3, strOptString3, ns1.d.e(strOptString3, String.valueOf(iOptInt3)), jSONObject.optString("op_inner_msg"));
        ht1.f fVar3 = this.logger;
        if (fVar3 != null) {
            fVar3.e("ApiFaceVerifyPlugin", "callback fail. result:" + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTicket$1(ApiFaceVerifyResponse apiFaceVerifyResponse, Throwable th) throws Exception {
        apiFaceVerifyResponse.setApiErrCode(js1.e.f);
        apiFaceVerifyResponse.setApiErrNo(ns1.d.d(th.getMessage()));
        apiFaceVerifyResponse.setCustomErrMsg("network error");
        apiFaceVerifyResponse.mInnerMsg = th.getMessage();
        this.invokeCallback.a(apiFaceVerifyResponse);
        ht1.f fVar = this.logger;
        if (fVar != null) {
            fVar.e("ApiFaceVerifyPlugin", "callback fail.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackFail(int i, String str, ms1.c cVar) {
        ms1.h hVarA = ms1.h.a(i);
        ApiFaceVerifyResponse apiFaceVerifyResponse = new ApiFaceVerifyResponse();
        apiFaceVerifyResponse.setApiErrCode(js1.f.a(hVarA.a, str));
        apiFaceVerifyResponse.setApiErrNo(cVar);
        apiFaceVerifyResponse.mInnerMsg = hVarA.b;
        is1.h<ApiFaceVerifyResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.a(apiFaceVerifyResponse);
        }
    }

    @ApiConfig(apiName = "startFaceVerify", async = true)
    public void startFaceVerifyAsync(ht1.f fVar, ApiFaceVerifyRequest apiFaceVerifyRequest, is1.h<ApiFaceVerifyResponse> hVar) throws JSONException {
        this.invokeCallback = hVar;
        this.logger = fVar;
        getTicket(apiFaceVerifyRequest.userId, apiFaceVerifyRequest.sessionType, apiFaceVerifyRequest.sessionValue, apiFaceVerifyRequest.actionsScene);
    }

    private void callbackFail(int i, String str, ms1.c cVar, String str2) {
        ms1.h hVarA = ms1.h.a(i);
        ApiFaceVerifyResponse apiFaceVerifyResponse = new ApiFaceVerifyResponse();
        apiFaceVerifyResponse.setApiErrCode(js1.f.a(hVarA.a, str));
        apiFaceVerifyResponse.setApiErrNo(cVar);
        if (TextUtils.isEmpty(str2)) {
            apiFaceVerifyResponse.mInnerMsg = hVarA.b;
        } else {
            apiFaceVerifyResponse.mInnerMsg = str2 + ",code:" + i + ",msg:" + str + ")";
        }
        is1.h<ApiFaceVerifyResponse> hVar = this.invokeCallback;
        if (hVar != null) {
            hVar.a(apiFaceVerifyResponse);
        }
    }

    private void doFaceLive(String str, String str2, int i, int i2) {
        boolean z;
        logI("doFaceLive. start ticket: " + str2);
        String appId = getAppId();
        if (getAppContext().getBizType() != BizType.WebAPP) {
            z = true;
        } else {
            z = false;
        }
        ((ht1.h) this.appContext.findService(ht1.h.class)).O(appId, str, str2, i2, i, z, new a(str2));
    }

    private void getTicket(String str, String str2, String str3, String str4) throws JSONException {
        final ApiFaceVerifyResponse apiFaceVerifyResponse = new ApiFaceVerifyResponse();
        HashMap map = new HashMap();
        String session = ((p) this.appContext.findService(p.class)).getSession();
        if (session != null) {
            u1.a.I(map, "session", session);
            logI("get session success");
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            u1.a.I(map, "Session-Type", str2);
            u1.a.I(map, "Session-Value", str3);
        }
        u1.a.I(map, "EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        String str5 = BaseFaceCheckPlugin.getLiveCheckAuthUrl() + "/user_ticket";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str);
            jSONObject.put("ticketType", "face_auth");
            if (!TextUtils.isEmpty(str4) && FaceAuthActionsSceneSettings.a(getAppId())) {
                jSONObject.put("scene", str4);
            }
            logI("send getTicket request of type face_auth, url: " + str5);
            en0.b.h(str5, map, jSONObject, getAppContext()).subscribe(new Consumer() { // from class: com.larksuite.framework.lark.open.plugin.openapi.liveAuthentication.k
                public final void accept(Object obj) throws Exception {
                    this.a.lambda$getTicket$0(apiFaceVerifyResponse, (String) obj);
                }
            }, new Consumer() { // from class: com.larksuite.framework.lark.open.plugin.openapi.liveAuthentication.l
                public final void accept(Object obj) throws Exception {
                    this.a.lambda$getTicket$1(apiFaceVerifyResponse, (Throwable) obj);
                }
            });
        } catch (JSONException e) {
            fillFailedResponse(apiFaceVerifyResponse, js1.e.f, e.getMessage(), ns1.i.f);
            this.invokeCallback.a(apiFaceVerifyResponse);
            ht1.f fVar = this.logger;
            if (fVar != null) {
                fVar.e("ApiFaceVerifyPlugin", "build json error", e);
            }
        }
    }
}
