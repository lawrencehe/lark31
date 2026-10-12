package com.larksuite.framework.lark.open.plugin.openapi.liveAuthentication;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.file.TTFile;
import com.bytedance.ee.lark.infra.file.n;
import com.bytedance.ee.lark.infra.file.p;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.LKBaseRequestModel;
import com.larksuite.framework.apiplugin.common.LKBaseResponseModel;
import com.larksuite.framework.lark.open.infra.annotation.ApiConfig;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import ht1.h;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/larkdex/classes3.dex */
public class OfflineFaceStartPlugin extends BaseFaceCheckPlugin {

    private static class OfflineFaceStartRequest extends LKBaseRequestModel {

        @JSONField(name = "certAppId")
        public String certAppId;

        @JSONField(name = "path")
        @LKRequiredParam
        public String mPath;

        @JSONField(name = "mode")
        public int mode;

        @JSONField(name = "motionTypes")
        public List<String> motionTypes;

        @JSONField(name = "scene")
        public String scene;

        @JSONField(name = "ticket")
        public String ticket;

        private OfflineFaceStartRequest() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$faceOfflineStart$0(is1.h hVar, JSONObject jSONObject) throws JSONException {
        commResultCallback(jSONObject, hVar);
    }

    private String getSystemFile(String str, String str2, OPTrace oPTrace) {
        AppBrandLogger.i("OfflineFaceStartPlugin", new Object[]{"ttFilePath:" + str + " tag:" + str2});
        try {
            File fileA = getAppContext().findService(n.class).A(new TTFile(str), new p(oPTrace, str2));
            if (fileA != null) {
                return fileA.getAbsolutePath();
            }
            AppBrandLogger.e("OfflineFaceStartPlugin", new Object[]{"getSystemFile return null"});
            return null;
        } catch (Exception e) {
            AppBrandLogger.e("OfflineFaceStartPlugin", new Object[]{"getSystemFile failed e:" + e});
            return null;
        }
    }

    @ApiConfig(apiName = "startLocalFaceVerify", async = true)
    public void faceOfflineStart(OfflineFaceStartRequest offlineFaceStartRequest, OPTrace oPTrace, final is1.h<LKBaseResponseModel> hVar) {
        AppBrandLogger.i("OfflineFaceStartPlugin", new Object[]{"offline face start, origin path = " + offlineFaceStartRequest.mPath});
        String systemFile = offlineFaceStartRequest.mPath;
        if (!TextUtils.isEmpty(systemFile)) {
            if (new TTFile(systemFile).isTTFileScheme()) {
                systemFile = getSystemFile(systemFile, "startLocalFaceVerify", oPTrace);
            }
            AppBrandLogger.i("OfflineFaceStartPlugin", new Object[]{"after transfer path = " + systemFile});
        }
        String str = systemFile;
        try {
            CertMotionHelper.a(offlineFaceStartRequest.motionTypes);
            ((ht1.h) this.appContext.findService(ht1.h.class)).B(offlineFaceStartRequest.mAppIdentify, str, offlineFaceStartRequest.ticket, offlineFaceStartRequest.scene, offlineFaceStartRequest.certAppId, offlineFaceStartRequest.mode, offlineFaceStartRequest.motionTypes, new h.b() { // from class: com.larksuite.framework.lark.open.plugin.openapi.liveAuthentication.d
                @Override // ht1.h.b
                public final void onResult(JSONObject jSONObject) throws JSONException {
                    this.a.lambda$faceOfflineStart$0(hVar, jSONObject);
                }
            });
        } catch (IllegalArgumentException e) {
            LKBaseResponseModel lKBaseResponseModel = new LKBaseResponseModel();
            lKBaseResponseModel.setApiErrCode(js1.e.h);
            lKBaseResponseModel.setApiErrNo(ns1.i.h(e.getMessage()));
            hVar.a(lKBaseResponseModel);
        }
    }
}
