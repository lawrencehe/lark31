package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00a6@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0096@\u00a2\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/IEndpointLocationClient;", "", "startContinuousLocation", "", "context", "Landroid/content/Context;", "intervalMillis", "", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopContinuousLocation", "", "isLocating", "isGpsSupported", "hasLocationPermission", "requestLocationPermission", "Lcom/ss/android/lark/endpoint/security/detection/location/LocationPermissionRequestResult;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentLocation", "Lcom/ss/android/lark/location/dto/LarkLocation;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentLocationDetailed", "Lkotlin/Result;", "getCurrentLocationDetailed-IoAF18A", "isLocationServicesEnabled", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes11.dex */
public interface IEndpointLocationClient {
    java.lang.Object a(android.content.Context context, int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object b(android.content.Context context, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult> continuation);

    java.lang.Object c(kotlin.coroutines.Continuation<? super com.ss.android.lark.location.dto.LarkLocation> continuation);

    void d(android.content.Context context);

    java.lang.Object e(kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.ss.android.lark.location.dto.LarkLocation>> continuation);

    boolean f(android.content.Context context);

    boolean g(android.content.Context context);

    boolean isGpsSupported(android.content.Context context);

    boolean isLocating(android.content.Context context);

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object a(com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient iEndpointLocationClient, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.ss.android.lark.location.dto.LarkLocation>> continuation) {
            com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient$getCurrentLocationDetailed$1 iEndpointLocationClient$getCurrentLocationDetailed$1;
            if (continuation instanceof com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient$getCurrentLocationDetailed$1) {
                iEndpointLocationClient$getCurrentLocationDetailed$1 = (com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient$getCurrentLocationDetailed$1) continuation;
                int i = iEndpointLocationClient$getCurrentLocationDetailed$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iEndpointLocationClient$getCurrentLocationDetailed$1.label = i - Integer.MIN_VALUE;
                } else {
                    iEndpointLocationClient$getCurrentLocationDetailed$1 = new com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient$getCurrentLocationDetailed$1(continuation);
                }
            }
            java.lang.Object objC = iEndpointLocationClient$getCurrentLocationDetailed$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = iEndpointLocationClient$getCurrentLocationDetailed$1.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    kotlin.ResultKt.throwOnFailure(objC);
                } else {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.ResultKt.throwOnFailure(objC);
                iEndpointLocationClient$getCurrentLocationDetailed$1.label = 1;
                objC = iEndpointLocationClient.c(iEndpointLocationClient$getCurrentLocationDetailed$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            com.ss.android.lark.location.dto.LarkLocation larkLocation = (com.ss.android.lark.location.dto.LarkLocation) objC;
            if (larkLocation != null) {
                return kotlin.Result.constructor-impl(larkLocation);
            }
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Unknown.INSTANCE));
        }
    }
}
