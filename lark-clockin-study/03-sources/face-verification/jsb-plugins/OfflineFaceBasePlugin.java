package com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication;

import com.larksuite.framework.apiplugin.common.LKBaseRequestModel;
import com.larksuite.framework.apiplugin.common.LKBaseResponseModel;
import com.ss.android.lark.openplatform.openapi.api.plugin.OPPlugin;
import org.json.JSONObject;

/* loaded from: /tmp/larkdex/classes18.dex */
public abstract class OfflineFaceBasePlugin extends OPPlugin {

    public static class FaceCheckRequest extends LKBaseRequestModel {
    }

    public static class FaceCheckResponse extends LKBaseResponseModel {
    }

    public abstract void reportOtherFailed(com.larksuite.framework.apiplugin.c cVar, int i, String str, JSONObject jSONObject);

    public abstract void reportSuccess(com.larksuite.framework.apiplugin.c cVar);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void commResultCallback(org.json.JSONObject r11, is1.h<com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin.FaceCheckResponse> r12, com.larksuite.framework.apiplugin.c r13) throws org.json.JSONException {
        /*
            r10 = this;
            java.lang.String r0 = "errorMsg"
            java.lang.String r1 = "errorCode"
            java.lang.String r2 = "success"
            if (r11 != 0) goto L24
            com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin$FaceCheckResponse r11 = new com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin$FaceCheckResponse
            r11.<init>()
            ms1.h r0 = ms1.h.K
            r11.setApiErrCode(r0)
            ns1.d r0 = ns1.d.h
            r11.setApiErrNo(r0)
            java.lang.String r0 = "callbackData is null"
            r11.mInnerMsg = r0
            r12.a(r11)
            r11 = -1
            r12 = 0
            r10.reportOtherFailed(r13, r11, r0, r12)
            return
        L24:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "commResultCallback"
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "LiveCheckBasePlugin"
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.i(r5, r4)
            java.lang.String r4 = ""
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            boolean r8 = r11.optBoolean(r2)     // Catch: java.lang.Exception -> L52
            int r9 = r11.optInt(r1)     // Catch: java.lang.Exception -> L50
            java.lang.String r4 = r11.optString(r0)     // Catch: java.lang.Exception -> L4e
            r7.put(r2, r8)     // Catch: java.lang.Exception -> L4e
            r7.put(r1, r9)     // Catch: java.lang.Exception -> L4e
            r7.put(r0, r4)     // Catch: java.lang.Exception -> L4e
            goto L61
        L4e:
            r11 = move-exception
            goto L55
        L50:
            r11 = move-exception
            goto L54
        L52:
            r11 = move-exception
            r8 = 0
        L54:
            r9 = 0
        L55:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "build result error"
            r0[r6] = r1
            r0[r3] = r11
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.e(r5, r0)
        L61:
            if (r8 == 0) goto L6f
            r10.reportSuccess(r13)
            com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin$FaceCheckResponse r11 = new com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin$FaceCheckResponse
            r11.<init>()
            r12.a(r11)
            goto Lbd
        L6f:
            ms1.h r11 = ms1.h.a(r9)
            com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin$FaceCheckResponse r0 = new com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin$FaceCheckResponse
            r0.<init>()
            ms1.b r1 = new ms1.b
            int r2 = r11.a
            r1.<init>(r2, r4)
            r0.setApiErrCode(r1)
            com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.j r1 = com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.j.e()
            ms1.c r1 = r1.d(r9, r4)
            r0.setApiErrNo(r1)
            java.lang.String r11 = r11.b
            r0.mInnerMsg = r11
            java.util.Map<java.lang.Integer, com.ss.android.lark.opmonitor.model.OPMonitorCode> r11 = com.ss.android.lark.openplatform.common.constant.AppbrandConstant.FACE_LIVENESS.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r11 = r11.get(r1)
            com.ss.android.lark.opmonitor.model.OPMonitorCode r11 = (com.ss.android.lark.opmonitor.model.OPMonitorCode) r11
            if (r11 == 0) goto Lb7
            com.larksuite.framework.apiplugin.common.OPMonitorReportModel$Request r1 = new com.larksuite.framework.apiplugin.common.OPMonitorReportModel$Request
            r1.<init>()
            com.larksuite.framework.apiplugin.common.OPMonitorReportModel$Request$OPInnerMonitorCode r2 = new com.larksuite.framework.apiplugin.common.OPMonitorReportModel$Request$OPInnerMonitorCode
            r2.<init>()
            com.larksuite.framework.apiplugin.common.OPMonitorReportModel$Request$OPInnerMonitorCode r11 = r2.adapter(r11)
            r1.mMonitorCode = r11
            java.lang.String r11 = "innerMonitorReport"
            java.lang.Class<com.larksuite.framework.apiplugin.common.OPMonitorReportModel$Response> r2 = com.larksuite.framework.apiplugin.common.OPMonitorReportModel$Response.class
            r13.e(r11, r1, r2)
            goto Lba
        Lb7:
            r10.reportOtherFailed(r13, r9, r4, r7)
        Lba:
            r12.a(r0)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.openplatform.openapi.api.plugin.messenger.liveAuthentication.OfflineFaceBasePlugin.commResultCallback(org.json.JSONObject, is1.h, com.larksuite.framework.apiplugin.c):void");
    }
}
