package com.ss.android.lark.location.dto;

/* loaded from: /tmp/larkdex/classes15.dex */
public class LarkLocation extends android.location.Location {
    public static final int m = 2131829081;
    public static final int n = 2131828894;
    java.lang.String a;
    java.lang.String b;
    java.lang.String c;
    java.lang.String d;
    java.lang.String e;
    java.lang.String f;
    int g;
    boolean h;
    boolean i;
    int j;
    java.lang.String k;
    com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem l;

    public static com.ss.android.lark.location.dto.LarkLocation c() {
        com.ss.android.lark.location.dto.LarkLocation larkLocation = new com.ss.android.lark.location.dto.LarkLocation(new android.location.Location(""));
        larkLocation.c0(40200);
        larkLocation.d0("Token is intercepted by config");
        return larkLocation;
    }

    @Override // android.location.Location
    public java.lang.String toString() {
        return "LarkLocation{errorCode=" + this.g + ", errorMsg='" + this.k + "', coordinateSystem=" + this.l + '}';
    }

    public boolean w() {
        return this.g == 40100;
    }

    public enum CoordinateSystem {
        DEFAULT(0),
        WGS(1),
        GCJ(2);

        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return DEFAULT;
                    }
                    return GCJ;
                }
                return WGS;
            }
            return DEFAULT;
        }

        CoordinateSystem(int i) {
            this.value = i;
        }
    }

    public boolean F() {
        return this.h;
    }

    public java.lang.String e() {
        return this.a;
    }

    public java.lang.String f() {
        return this.c;
    }

    public com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem g() {
        return this.l;
    }

    public java.lang.String h() {
        return this.d;
    }

    public int j() {
        return this.g;
    }

    public java.lang.String n() {
        return this.k;
    }

    public int o() {
        return this.j;
    }

    public java.lang.String r() {
        return this.b;
    }

    public java.lang.String s() {
        return this.e;
    }

    public java.lang.String t() {
        return this.f;
    }

    public boolean y() {
        return this.i;
    }

    public LarkLocation(android.location.Location location) {
        super(location);
        this.j = -1;
        this.l = com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.WGS;
    }

    public static com.ss.android.lark.location.dto.LarkLocation a(android.content.Context context) {
        com.ss.android.lark.location.dto.LarkLocation larkLocation = new com.ss.android.lark.location.dto.LarkLocation(new android.location.Location(""));
        larkLocation.c0(40400);
        larkLocation.d0(context.getString(m));
        return larkLocation;
    }

    public static com.ss.android.lark.location.dto.LarkLocation b(android.content.Context context) {
        com.ss.android.lark.location.dto.LarkLocation larkLocation = new com.ss.android.lark.location.dto.LarkLocation(new android.location.Location(""));
        larkLocation.c0(40100);
        larkLocation.d0(context.getString(n));
        return larkLocation;
    }

    public void G(java.lang.String str) {
        this.a = str;
    }

    public void H(java.lang.String str) {
        this.c = str;
    }

    public void J(com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem coordinateSystem) {
        this.l = coordinateSystem;
    }

    public void V(java.lang.String str) {
        this.d = str;
    }

    public void c0(int i) {
        this.g = i;
    }

    public void d0(java.lang.String str) {
        this.k = str;
    }

    public void e0(boolean z) {
        this.i = z;
    }

    public void g0(boolean z) {
        this.h = z;
    }

    public void l0(int i) {
        this.j = i;
    }

    public void n0(java.lang.String str) {
        this.b = str;
    }

    public void o0(java.lang.String str) {
        this.e = str;
    }

    public void p0(java.lang.String str) {
        this.f = str;
    }
}
