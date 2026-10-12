package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityReportOnlineTask;", "Lcom/ss/android/lark/passportc/task/IComponentOnlineTask;", "<init>", "()V", "pushHandler", "Ldagger/Lazy;", "Lcom/ss/android/lark/endpoint/security/detection/factor/IEndpointSecurityReportPushHandler;", "getPushHandler", "()Ldagger/Lazy;", "setPushHandler", "(Ldagger/Lazy;)V", "taskName", "Lcom/ss/android/lark/passportc/task/entity/TaskKey;", "dependencies", "", "execute", "Lio/reactivex/Observable;", "Lcom/ss/android/lark/passportc/task/entity/TaskResult;", "context", "Lcom/ss/android/lark/passportc/task/entity/UserContext;", "Companion", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.endpoint.security.detection.factor.c, reason: from Kotlin metadata */
/* loaded from: /tmp/larkdex/classes11.dex */
public final class EndpointSecurityReportOnlineTask implements com.ss.android.lark.passportc.task.d {
    public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportOnlineTask.a b = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportOnlineTask.a(null);
    private static final hc6.b c = new hc6.b("endpoint_security_report_init");

    @javax.inject.Inject
    public xw7.a<com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityReportPushHandler> a;

    @javax.inject.Inject
    public EndpointSecurityReportOnlineTask() {
    }

    public /* synthetic */ boolean a() {
        return com.ss.android.lark.passportc.task.e.b(this);
    }

    public /* synthetic */ io.reactivex.Observable b(hc6.e eVar) {
        return com.ss.android.lark.passportc.task.e.c(this, eVar);
    }

    public java.util.List<hc6.b> dependencies() {
        return kotlin.collections.CollectionsKt.mutableListOf(new hc6.b[]{new hc6.b("switch_user")});
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityReportOnlineTask$Companion;", "", "<init>", "()V", "TASK_KEY", "Lcom/ss/android/lark/passportc/task/entity/TaskKey;", "getTASK_KEY", "()Lcom/ss/android/lark/passportc/task/entity/TaskKey;", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.ss.android.lark.endpoint.security.detection.factor.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hc6.b a() {
            return com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportOnlineTask.c;
        }
    }

    public final xw7.a<com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityReportPushHandler> f() {
        xw7.a<com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityReportPushHandler> aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("pushHandler");
        return null;
    }

    public hc6.b c() {
        return c;
    }

    public io.reactivex.Observable<hc6.c> d(hc6.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "context");
        io.reactivex.Observable<hc6.c> observableJust = io.reactivex.Observable.just(new hc6.c(c(), true, 0, f().get().toString(), 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }
}
