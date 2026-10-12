package com.larksuite.framework.lark.open.plugin.openapi.liveAuthentication;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.file.TTFile;
import com.bytedance.ee.lark.infra.file.TTFileException;
import com.bytedance.ee.lark.infra.file.n;
import com.bytedance.ee.lark.infra.file.p;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.apiplugin.common.LKBaseRequestModel;
import com.larksuite.framework.apiplugin.common.LKBaseResponseModel;
import com.larksuite.framework.apiplugin.validator.format.StringEnum;
import com.larksuite.framework.lark.open.infra.annotation.ApiConfig;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.socialbase.downloader.api.BuildConfig;
import ht1.h;

/* loaded from: /tmp/larkdex/classes3.dex */
public class AcquireFaceImagePlugin extends BaseFaceCheckPlugin {
    private ht1.f logger;

    public static class AcquireFaceImageRequest extends LKBaseRequestModel {

        @JSONField(name = "cameraDevice")
        @StringEnum(values = {"front", "back"})
        public String cameraDevice = "front";

        @JSONField(name = "pitchAngle")
        public int pitchAngle = -1;
    }

    public static class AcquireFaceImageResponse extends LKBaseResponseModel {

        @JSONField(name = "tempFilePath")
        public String tempFilePath;
    }

    class a implements h.a {
        final /* synthetic */ OPTrace a;
        final /* synthetic */ is1.h b;

        @Override // ht1.h.a
        public void onSuccess(String str) {
            AcquireFaceImagePlugin.this.logI("face extract success" + str);
            if (!TextUtils.isEmpty(str)) {
                if (AcquireFaceImagePlugin.this.getAppContext() != null) {
                    n nVarFindService = AcquireFaceImagePlugin.this.getAppContext().findService(n.class);
                    TTFile child = TTFile.TEMP.getChild(BuildConfig.VERSION_NAME + System.currentTimeMillis() + ".jpeg");
                    try {
                        nVarFindService.X(com.bytedance.ee.lark.infra.foundation.utils.c.b(str), child, new p(this.a, "acquireFaceImage"));
                        if (child == null) {
                            return;
                        }
                        AcquireFaceImagePlugin.this.callbackOk(this.b, child.getRawPath());
                        return;
                    } catch (TTFileException e) {
                        AcquireFaceImagePlugin.this.callbackInternalError(this.b, e);
                        return;
                    }
                }
                AcquireFaceImagePlugin.this.logI("app context is null");
                return;
            }
            AcquireFaceImageResponse acquireFaceImageResponse = new AcquireFaceImageResponse();
            AcquireFaceImagePlugin.this.fillFailedResponse(acquireFaceImageResponse, ms1.h.K, "tempFilePath is empty", ns1.i.f);
            this.b.a(acquireFaceImageResponse);
        }

        @Override // ht1.h.a
        public void onFail(int i, String str) {
            AcquireFaceImageResponse acquireFaceImageResponse = new AcquireFaceImageResponse();
            if (i == -1) {
                AcquireFaceImagePlugin.this.fillFailedResponse(acquireFaceImageResponse, ms1.h.K, "unknown error", ns1.d.b(str, String.valueOf(i)));
                this.b.a(acquireFaceImageResponse);
            } else {
                AcquireFaceImagePlugin.this.callbackFail(this.b, i, str);
            }
            AcquireFaceImagePlugin.this.logI("onIpcCallback error, errCode:" + i + " errMsg:" + str);
        }

        a(OPTrace oPTrace, is1.h hVar) {
            this.a = oPTrace;
            this.b = hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logI(String str) {
        ht1.f fVar = this.logger;
        if (fVar != null) {
            fVar.i("ApiAcquireFaceImagePlugin", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackInternalError(is1.h<AcquireFaceImageResponse> hVar, Exception exc) {
        AcquireFaceImageResponse acquireFaceImageResponse = new AcquireFaceImageResponse();
        fillFailedResponse(acquireFaceImageResponse, js1.e.f, exc.getMessage(), ns1.d.m);
        hVar.a(acquireFaceImageResponse);
        AppBrandLogger.e("ApiAcquireFaceImagePlugin", new Object[]{exc.getMessage()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackOk(is1.h<AcquireFaceImageResponse> hVar, String str) {
        logI("face extract temp path" + str);
        AcquireFaceImageResponse acquireFaceImageResponse = new AcquireFaceImageResponse();
        acquireFaceImageResponse.tempFilePath = str;
        if (hVar != null) {
            hVar.a(acquireFaceImageResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackFail(is1.h<AcquireFaceImageResponse> hVar, int i, String str) {
        ms1.h hVarA = ms1.h.a(i);
        AcquireFaceImageResponse acquireFaceImageResponse = new AcquireFaceImageResponse();
        acquireFaceImageResponse.setApiErrCode(new ms1.b(hVarA.a, str));
        acquireFaceImageResponse.setApiErrNo(getCertSdkError(i, str));
        acquireFaceImageResponse.mInnerMsg = hVarA.b;
        if (hVar != null) {
            hVar.a(acquireFaceImageResponse);
        }
    }

    private void doFaceExtract(OPTrace oPTrace, AcquireFaceImageRequest acquireFaceImageRequest, is1.h<AcquireFaceImageResponse> hVar) {
        logI("doFaceExtract. with camera device : " + acquireFaceImageRequest.cameraDevice);
        if (!TextUtils.isEmpty(acquireFaceImageRequest.cameraDevice) && !TextUtils.equals(acquireFaceImageRequest.cameraDevice, "front") && !TextUtils.equals(acquireFaceImageRequest.cameraDevice, "back")) {
            acquireFaceImageRequest.cameraDevice = "front";
        }
        String appId = getAppId();
        logI("find app id : " + appId);
        faceExtract(hVar, oPTrace, acquireFaceImageRequest, appId);
    }

    private void faceExtract(is1.h<AcquireFaceImageResponse> hVar, OPTrace oPTrace, AcquireFaceImageRequest acquireFaceImageRequest, String str) {
        ((ht1.h) this.appContext.findService(ht1.h.class)).v(str, acquireFaceImageRequest.cameraDevice, acquireFaceImageRequest.pitchAngle, new a(oPTrace, hVar));
    }

    @ApiConfig(apiName = "acquireFaceImage", async = true)
    public void acquireFaceImageAsync(ht1.f fVar, OPTrace oPTrace, AcquireFaceImageRequest acquireFaceImageRequest, is1.h<AcquireFaceImageResponse> hVar) {
        this.logger = fVar;
        try {
            doFaceExtract(oPTrace, acquireFaceImageRequest, hVar);
        } catch (Exception e) {
            callbackInternalError(hVar, e);
        }
    }
}
