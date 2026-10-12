package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/NotificationConfig;", "", "notificationIconResId", "", "notificationTitle", "", "notificationContent", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getNotificationIconResId", "()I", "getNotificationTitle", "()Ljava/lang/String;", "getNotificationContent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.endpoint.security.detection.location.g, reason: from Kotlin metadata and from toString */
/* loaded from: /tmp/larkdex/classes11.dex */
public final /* data */ class NotificationConfig {

    /* renamed from: a, reason: from toString */
    private final int notificationIconResId;

    /* renamed from: b, reason: from toString */
    private final java.lang.String notificationTitle;

    /* renamed from: c, reason: from toString */
    private final java.lang.String notificationContent;

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ss.android.lark.endpoint.security.detection.location.NotificationConfig)) {
            return false;
        }
        com.ss.android.lark.endpoint.security.detection.location.NotificationConfig notificationConfig = (com.ss.android.lark.endpoint.security.detection.location.NotificationConfig) other;
        return this.notificationIconResId == notificationConfig.notificationIconResId && kotlin.jvm.internal.Intrinsics.areEqual(this.notificationTitle, notificationConfig.notificationTitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.notificationContent, notificationConfig.notificationContent);
    }

    public int hashCode() {
        return (((this.notificationIconResId * 31) + this.notificationTitle.hashCode()) * 31) + this.notificationContent.hashCode();
    }

    public java.lang.String toString() {
        return "NotificationConfig(notificationIconResId=" + this.notificationIconResId + ", notificationTitle=" + this.notificationTitle + ", notificationContent=" + this.notificationContent + ')';
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getNotificationContent() {
        return this.notificationContent;
    }

    /* renamed from: b, reason: from getter */
    public final int getNotificationIconResId() {
        return this.notificationIconResId;
    }

    /* renamed from: c, reason: from getter */
    public final java.lang.String getNotificationTitle() {
        return this.notificationTitle;
    }

    public NotificationConfig(int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "notificationTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "notificationContent");
        this.notificationIconResId = i;
        this.notificationTitle = str;
        this.notificationContent = str2;
    }
}
