package com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.LKBaseRequestModel;
import com.larksuite.framework.apiplugin.common.OPMonitorReportModel$Request;
import com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin;
import com.ss.android.lark.utils.ApiUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import oz5.c;

/* loaded from: /tmp/larkdex/classes18.dex */
public class OfflineFaceCheckPlugin extends OfflineFaceBasePlugin {

    public static class OfflineFaceCheckRequest extends LKBaseRequestModel {

        @JSONField(name = "checkUpdate")
        public boolean checkUpdate = true;
    }

    @Override // com.ss.android.lark.openplatform.openapi.api.plugin.OPPlugin, com.larksuite.framework.apiplugin.f
    public void onRelease() {
    }

    class a implements c.b {
        final /* synthetic */ is1.h a;
        final /* synthetic */ com.larksuite.framework.apiplugin.c b;

        @Override // oz5.c.b
        public void onResult(JSONObject jSONObject) throws JSONException {
            OfflineFaceCheckPlugin.this.commResultCallback(jSONObject, this.a, this.b);
        }

        a(is1.h hVar, com.larksuite.framework.apiplugin.c cVar) {
            this.a = hVar;
            this.b = cVar;
        }
    }

    @Override // com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin
    public void reportSuccess(com.larksuite.framework.apiplugin.c cVar) {
        OPMonitorReportModel$Request oPMonitorReportModel$Request = new OPMonitorReportModel$Request();
        oPMonitorReportModel$Request.mMonitorCode = new OPMonitorReportModel$Request.OPInnerMonitorCode().adapter(com.ss.android.lark.gadget.monitor.event.e.h1);
        cVar.i(oPMonitorReportModel$Request);
    }

    @LKPluginFunction(async = true, eventName = {"checkLocalFaceVerify"})
    public void faceOfflineCheckReady(OfflineFaceCheckRequest offlineFaceCheckRequest, com.larksuite.framework.apiplugin.c cVar, is1.h<OfflineFaceBasePlugin.FaceCheckResponse> hVar) {
        AppBrandLogger.i("OfflineFaceCheckPlugin", new Object[]{"plugin process start checkUpdate: " + offlineFaceCheckRequest.checkUpdate});
        p16.b bVar = (p16.b) ApiUtils.getApi(p16.b.class);
        Objects.requireNonNull(bVar);
        bVar.offlineCheckReady(offlineFaceCheckRequest.mAppIdentify, offlineFaceCheckRequest.checkUpdate, new a(hVar, cVar));
    }

    @Override // com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin
    public void reportOtherFailed(com.larksuite.framework.apiplugin.c cVar, int i, String str, JSONObject jSONObject) {
        OPMonitorReportModel$Request oPMonitorReportModel$Request = new OPMonitorReportModel$Request();
        oPMonitorReportModel$Request.mMonitorCode = new OPMonitorReportModel$Request.OPInnerMonitorCode().adapter(com.ss.android.lark.gadget.monitor.event.e.i1);
        oPMonitorReportModel$Request.mErrorCode = String.valueOf(i);
        oPMonitorReportModel$Request.mErrorMessage = str;
        cVar.i(oPMonitorReportModel$Request);
    }
}
