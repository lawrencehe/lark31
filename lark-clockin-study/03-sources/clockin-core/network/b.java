package com.ss.android.lark.appstrategy.clockin.network;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n\u00a2\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "data", "", "parse", "([B)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: /tmp/larkdex/classes8.dex */
public final class b<T> implements com.ss.android.lark.sdk.SdkSender.IParser {
    public static final com.ss.android.lark.appstrategy.clockin.network.b<T> a = new com.ss.android.lark.appstrategy.clockin.network.b<>();

    /* JADX DEBUG: Method merged with bridge method: parse([B)Ljava/lang/Object; */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.String parse(byte[] bArr) {
        return ((com.bytedance.lark.pb.basic.v1.SendHttpResponse) com.bytedance.lark.pb.basic.v1.SendHttpResponse.ADAPTER.decode(bArr)).json_body;
    }
}
