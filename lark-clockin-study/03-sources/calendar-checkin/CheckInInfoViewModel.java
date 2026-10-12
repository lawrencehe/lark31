package com.ss.android.lark.calendar.impl.features.events.detail.checkin;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import com.ss.android.lark.calendar.impl.framework.usercomponent.CalendarApp;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u001e\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/checkin/CheckInInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "calendarApp", "Lcom/ss/android/lark/calendar/impl/framework/usercomponent/CalendarApp;", "<init>", "(Lcom/ss/android/lark/calendar/impl/framework/usercomponent/CalendarApp;)V", "mIntent", "Landroid/content/Intent;", "value", "", "mCalendarId", "getMCalendarId", "()J", "", "mUid", "getMUid", "()Ljava/lang/String;", "mOriginalTime", "getMOriginalTime", "mStartTime", "getMStartTime", "initData", "", "intent", "getDefaultItem", "", "getFromSource", "calendar-impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes9.dex */
public final class CheckInInfoViewModel extends ViewModel {
    private final CalendarApp calendarApp;
    private long mCalendarId;
    private Intent mIntent;
    private long mOriginalTime;
    private long mStartTime;
    private String mUid;

    public final int getDefaultItem() {
        Intent intent = this.mIntent;
        String stringExtra = intent != null ? intent.getStringExtra("tab") : null;
        if (stringExtra == null) {
            return 0;
        }
        int iHashCode = stringExtra.hashCode();
        if (iHashCode == -951532658) {
            return !stringExtra.equals("qrcode") ? 0 : 1;
        }
        if (iHashCode != 3321850) {
            return (iHashCode == 109757599 && stringExtra.equals("stats")) ? 2 : 0;
        }
        stringExtra.equals("link");
        return 0;
    }

    public final String getFromSource() {
        String stringExtra;
        Intent intent = this.mIntent;
        return (intent == null || (stringExtra = intent.getStringExtra("fromSource")) == null) ? "eventDetail" : stringExtra;
    }

    public final long getMCalendarId() {
        return this.mCalendarId;
    }

    public final long getMOriginalTime() {
        return this.mOriginalTime;
    }

    public final long getMStartTime() {
        return this.mStartTime;
    }

    public final String getMUid() {
        return this.mUid;
    }

    @Inject
    public CheckInInfoViewModel(CalendarApp calendarApp) {
        Intrinsics.checkNotNullParameter(calendarApp, "calendarApp");
        this.calendarApp = calendarApp;
        this.mUid = "";
        this.mStartTime = -1L;
    }

    public final void initData(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.mIntent = intent;
        this.mCalendarId = intent.getLongExtra("calendarId", 0L);
        String stringExtra = intent.getStringExtra("key");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.mUid = stringExtra;
        this.mOriginalTime = intent.getLongExtra("originalTime", 0L);
        this.mStartTime = intent.getLongExtra("startTime", -1L);
    }
}
