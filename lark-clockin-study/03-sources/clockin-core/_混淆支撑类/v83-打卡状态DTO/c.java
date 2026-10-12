package v83;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B1\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0013\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult;", "Lcom/ss/android/lark/appstrategy/clockin/dto/BaseResult;", "status", "Lcom/ss/android/lark/appstrategy/clockin/dto/Status;", "errCode", "", "errMsg", "", "location", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Location;", "<init>", "(Lcom/ss/android/lark/appstrategy/clockin/dto/Status;ILjava/lang/String;Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Location;)V", "getLocation", "()Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Location;", "Success", "Fail", "NoPermission", "Location", "GpsMapType", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Fail;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$NoPermission;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Success;", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public abstract class c extends v83.a {
    private final v83.c.Location d;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$NoPermission;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult;", "<init>", "()V", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: v83.c$c, reason: collision with other inner class name */
    public static final class C0234c extends v83.c {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C0234c() {
            super(com.ss.android.lark.appstrategy.clockin.dto.Status.NO_PERMISSION, -1, "no permission", null, 8, null);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.ss.android.lark.appstrategy.clockin.dto.Status), (r2v0 int), (r3v0 java.lang.String), (r4v0 v83.c$b) A[MD:(com.ss.android.lark.appstrategy.clockin.dto.Status, int, java.lang.String, v83.c$b):void (m)] call: v83.c.<init>(com.ss.android.lark.appstrategy.clockin.dto.Status, int, java.lang.String, v83.c$b):void type: THIS */
    public /* synthetic */ c(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str, v83.c.Location location, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(status, i, str, location);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Location;", "", "latitude", "", "longitude", "accuracy", "gpsMapType", "", "<init>", "(DDDI)V", "getLatitude", "()D", "getLongitude", "getAccuracy", "getGpsMapType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: v83.c$b, reason: from toString */
    public static final /* data */ class Location {

        /* renamed from: a, reason: from toString */
        private final double latitude;

        /* renamed from: b, reason: from toString */
        private final double longitude;

        /* renamed from: c, reason: from toString */
        private final double accuracy;

        /* renamed from: d, reason: from toString */
        private final int gpsMapType;

        public Location() {
            this(0.0d, 0.0d, 0.0d, 0, 15, null);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof v83.c.Location)) {
                return false;
            }
            v83.c.Location location = (v83.c.Location) other;
            return java.lang.Double.compare(this.latitude, location.latitude) == 0 && java.lang.Double.compare(this.longitude, location.longitude) == 0 && java.lang.Double.compare(this.accuracy, location.accuracy) == 0 && this.gpsMapType == location.gpsMapType;
        }

        public int hashCode() {
            return (((((t.a(this.latitude) * 31) + t.a(this.longitude)) * 31) + t.a(this.accuracy)) * 31) + this.gpsMapType;
        }

        public java.lang.String toString() {
            return "Location(latitude=" + this.latitude + ", longitude=" + this.longitude + ", accuracy=" + this.accuracy + ", gpsMapType=" + this.gpsMapType + ')';
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* renamed from: a, reason: from getter */
        public final double getAccuracy() {
            return this.accuracy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* renamed from: b, reason: from getter */
        public final int getGpsMapType() {
            return this.gpsMapType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* renamed from: c, reason: from getter */
        public final double getLatitude() {
            return this.latitude;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* renamed from: d, reason: from getter */
        public final double getLongitude() {
            return this.longitude;
        }

        public Location(double d, double d2, double d3, int i) {
            this.latitude = d;
            this.longitude = d2;
            this.accuracy = d3;
            this.gpsMapType = i;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Location(double d, double d2, double d3, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            double d4;
            double d5;
            int i3;
            if ((i2 & 1) != 0) {
                d4 = 0.0d;
            } else {
                d4 = d;
            }
            if ((i2 & 2) != 0) {
                d5 = 0.0d;
            } else {
                d5 = d2;
            }
            double d6 = (i2 & 4) == 0 ? d3 : 0.0d;
            if ((i2 & 8) != 0) {
                i3 = 1;
            } else {
                i3 = i;
            }
            this(d4, d5, d6, i3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* renamed from: d, reason: from getter */
    public final v83.c.Location getD() {
        return this.d;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Success;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult;", "location", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Location;", "<init>", "(Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Location;)V", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends v83.c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v83.c.Location location) {
            super(com.ss.android.lark.appstrategy.clockin.dto.Status.SUCCESS, 0, "success", location, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "location");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult$Fail;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult;", "errCode", "", "errMsg", "", "<init>", "(ILjava/lang/String;)V", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends v83.c {
        public a(int i, java.lang.String str) {
            super(com.ss.android.lark.appstrategy.clockin.dto.Status.FAIL, i, str, null, 8, null);
        }
    }

    private c(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str, v83.c.Location location) {
        super(status, i, str);
        this.d = location;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str, v83.c.Location location, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        java.lang.String str2;
        v83.c.Location location2;
        if ((i2 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            location2 = null;
        } else {
            location2 = location;
        }
        this(status, i, str2, location2, null);
    }
}
