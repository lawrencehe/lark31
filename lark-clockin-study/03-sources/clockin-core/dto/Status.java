package com.ss.android.lark.appstrategy.clockin.dto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "NO_PERMISSION", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public final class Status {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ com.ss.android.lark.appstrategy.clockin.dto.Status[] $VALUES;
    public static final com.ss.android.lark.appstrategy.clockin.dto.Status SUCCESS = new com.ss.android.lark.appstrategy.clockin.dto.Status("SUCCESS", 0);
    public static final com.ss.android.lark.appstrategy.clockin.dto.Status FAIL = new com.ss.android.lark.appstrategy.clockin.dto.Status("FAIL", 1);
    public static final com.ss.android.lark.appstrategy.clockin.dto.Status NO_PERMISSION = new com.ss.android.lark.appstrategy.clockin.dto.Status("NO_PERMISSION", 2);

    private static final /* synthetic */ com.ss.android.lark.appstrategy.clockin.dto.Status[] $values() {
        return new com.ss.android.lark.appstrategy.clockin.dto.Status[]{SUCCESS, FAIL, NO_PERMISSION};
    }

    public static kotlin.enums.a<com.ss.android.lark.appstrategy.clockin.dto.Status> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        com.ss.android.lark.appstrategy.clockin.dto.Status[] statusArr$values = $values();
        $VALUES = statusArr$values;
        $ENTRIES = kotlin.enums.b.a(statusArr$values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static com.ss.android.lark.appstrategy.clockin.dto.Status[] values() {
        return (com.ss.android.lark.appstrategy.clockin.dto.Status[]) $VALUES.clone();
    }

    public static com.ss.android.lark.appstrategy.clockin.dto.Status valueOf(java.lang.String str) {
        return (com.ss.android.lark.appstrategy.clockin.dto.Status) java.lang.Enum.valueOf(com.ss.android.lark.appstrategy.clockin.dto.Status.class, str);
    }

    private Status(java.lang.String str, int i) {
    }
}
