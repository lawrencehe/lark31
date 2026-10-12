package com.ss.android.lark.appstrategy.service.impl;

/* loaded from: /tmp/larkdex/classes8.dex */
public final /* synthetic */ class e implements com.ss.android.lark.sdk.SdkSender.IParser {
    public final /* synthetic */ com.squareup.wire.ProtoAdapter a;

    public final java.lang.Object parse(byte[] bArr) {
        return (com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse) this.a.decode(bArr);
    }
}
