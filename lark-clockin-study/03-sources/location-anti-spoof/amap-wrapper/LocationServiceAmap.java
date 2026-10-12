package com.ss.android.lark.map.service;

/* loaded from: /tmp/larkdex/classes16.dex */
public class f extends com.ss.android.lark.location.service.a {
    private com.amap.api.location.AMapLocationClient k;
    private volatile com.ss.android.lark.location.service.n l;
    private volatile boolean m;
    private volatile boolean n;
    private o75.b o;
    private com.ss.android.lark.location.dto.Scene p;
    private com.amap.api.location.AMapLocationListener q;

    class b implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com.larksuite.component.universe_design.toast.UDToast.show(((com.ss.android.lark.location.service.a) com.ss.android.lark.map.service.f.this).a, com.ss.android.lark.location.dto.LarkLocation.n);
            com.ss.android.lark.map.service.f fVar = com.ss.android.lark.map.service.f.this;
            fVar.u(com.ss.android.lark.location.dto.LarkLocation.a(((com.ss.android.lark.location.service.a) fVar).a), null);
        }

        b() {
        }
    }

    class c implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com.larksuite.component.universe_design.toast.UDToast.show(((com.ss.android.lark.location.service.a) com.ss.android.lark.map.service.f.this).a, com.ss.android.lark.location.dto.LarkLocation.n);
            com.ss.android.lark.map.service.f fVar = com.ss.android.lark.map.service.f.this;
            fVar.u(com.ss.android.lark.location.dto.LarkLocation.a(((com.ss.android.lark.location.service.a) fVar).a), null);
        }

        c() {
        }
    }

    public synchronized void C() {
        ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "355");
        com.ss.android.lark.log.Log.i("LocationServiceAmap", "release called.");
        if (q()) {
            if (this.k != null) {
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "358");
                com.ss.android.lark.log.Log.i("LocationServiceAmap", "stop amap location");
                this.k.stopLocation();
                this.k.onDestroy();
                this.k = null;
            }
            F();
        }
    }

    protected java.lang.String n() {
        return "Amap";
    }

    protected synchronized void x() {
        if (this.k == null) {
            return;
        }
        if (q()) {
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "241");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap onPauseLocation called. listeners is empty.");
        } else {
            this.k.stopLocation();
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "246");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap onPauseLocation called. stop location.");
        }
    }

    protected synchronized void y() {
        ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "217");
        com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap onRestartLocation called.");
        if (this.k == null) {
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "219");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap onRestartLocation called. but AmapLocationClient is null.");
        } else if (q()) {
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "224");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap onRestartLocation called. but listeners is empty.");
        } else {
            this.k.startLocation();
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "229");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap onRestartLocation called. restart location.");
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.values().length];
            a = iArr;
            try {
                iArr[com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                a[com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.GCJ.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                a[com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.WGS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private void Y() {
        if (this.k == null) {
            com.amap.api.location.AMapLocationClient.updatePrivacyShow(((com.ss.android.lark.location.service.a) this).a, true, true);
            com.amap.api.location.AMapLocationClient.updatePrivacyAgree(((com.ss.android.lark.location.service.a) this).a, true);
            com.amap.api.location.AMapLocationClient aMapLocationClientA = com.ss.android.lark.map.service.AMapLocationClientFactory.a(((com.ss.android.lark.location.service.a) this).a);
            this.k = aMapLocationClientA;
            if (aMapLocationClientA != null) {
                aMapLocationClientA.disableBackgroundLocation(true);
                this.k.setLocationListener(this.q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ss.android.lark.location.service.n Z() {
        if (this.l == null) {
            synchronized (this) {
                if (this.l == null) {
                    this.l = new com.ss.android.lark.location.service.n(((com.ss.android.lark.location.service.a) this).a);
                }
            }
        }
        return this.l;
    }

    protected boolean p() {
        return com.ss.android.lark.map.LocationModule.getDependency().getAppStateDependency().a();
    }

    class a implements com.amap.api.location.AMapLocationListener {
        a() {
        }

        public void onLocationChanged(com.amap.api.location.AMapLocation aMapLocation) {
            int errorCode;
            com.ss.android.lark.location.dto.LarkLocation larkLocationA;
            so6.e eVar;
            so6.e eVar2;
            long jE = com.ss.android.lark.map.service.f.this.o.e();
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService$1", "65");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap onLocationChanged called, cost: " + jE);
            boolean z = false;
            if (aMapLocation == null) {
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService$1", "69");
                com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap onLocationChanged called. but mapLocation is null.");
                larkLocationA = null;
                errorCode = 0;
            } else {
                errorCode = aMapLocation.getErrorCode();
                java.lang.String str = "amap location result, amap_location: " + aMapLocation.toStr(2) + ", location info: {error_code: " + aMapLocation.getErrorCode() + ", error_info: " + aMapLocation.getErrorInfo() + ", type: " + aMapLocation.getLocationType() + ", gps_status: " + aMapLocation.getGpsAccuracyStatus() + ", detail: " + aMapLocation.getLocationDetail() + "}";
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService$1", "73");
                com.ss.android.lark.log.Log.i("LocationServiceAmap", str);
                larkLocationA = me5.a.a(aMapLocation);
            }
            if (errorCode == 0) {
                eVar = bp6.z7.c;
            } else {
                eVar = bp6.z7.d;
            }
            if (com.ss.android.lark.map.service.f.this.m) {
                eVar2 = bp6.g5.d;
            } else {
                eVar2 = bp6.g5.c;
            }
            if (com.ss.android.lark.map.service.f.this.m || !com.ss.android.lark.map.service.f.this.n) {
                z = true;
            }
            com.ss.android.lark.location.dto.Scene.IM im = com.ss.android.lark.map.service.f.this.p;
            if (im == null) {
                im = com.ss.android.lark.location.dto.Scene.IM.INSTANCE;
            }
            if (larkLocationA == null || errorCode != 0) {
                if (!p75.g.a.a()) {
                    ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService$1", "116");
                    com.ss.android.lark.log.Log.i("LocationServiceAmap", "Amap failed and do not use system location");
                    com.ss.android.lark.map.service.f.this.u(larkLocationA, null);
                    if (!z) {
                        return;
                    }
                    com.ss.android.lark.map.service.f.this.n = true;
                    o75.a.m(im, bp6.y5.c, jE, errorCode, eVar, bp6.b2.c, eVar2);
                    return;
                }
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService$1", "132");
                com.ss.android.lark.log.Log.i("LocationServiceAmap", "AMap Failed! Use System Location");
                com.ss.android.lark.map.service.f fVar = com.ss.android.lark.map.service.f.this;
                fVar.l = fVar.Z();
                com.ss.android.lark.map.service.f.this.l.e(new com.bytedance.supervisor.token.Token("null"), im, new com.ss.android.lark.map.service.f.a.C0156a(z, im, jE, errorCode));
                return;
            }
            com.ss.android.lark.map.service.f.this.u(larkLocationA, null);
            if (!z) {
                return;
            }
            com.ss.android.lark.map.service.f.this.n = true;
            o75.a.m(im, bp6.y5.c, jE, errorCode, eVar, bp6.b2.c, eVar2);
        }

        /* renamed from: com.ss.android.lark.map.service.f$a$a, reason: collision with other inner class name */
        class C0156a implements n75.d {
            final /* synthetic */ boolean a;
            final /* synthetic */ com.ss.android.lark.location.dto.Scene b;
            final /* synthetic */ long c;
            final /* synthetic */ int d;

            public void a(com.ss.android.lark.location.dto.LarkLocation larkLocation, java.util.List<android.location.Location> list) {
                if (larkLocation != null) {
                    com.ss.android.lark.map.service.f.this.b(larkLocation);
                    java.lang.String str = "amap downgrade to system location result: type:" + larkLocation.o() + ", error_code:" + larkLocation.j();
                    ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService$1$1", "141");
                    com.ss.android.lark.log.Log.i("LocationServiceAmap", str);
                    if (this.a) {
                        com.ss.android.lark.map.service.f.this.n = true;
                        o75.a.n(this.b, bp6.y5.c, this.c, this.d, bp6.z7.c, bp6.b2.c, bp6.g5.d, bp6.c4.c);
                    }
                } else {
                    ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService$1$1", "157");
                    com.ss.android.lark.log.Log.i("LocationServiceAmap", "AMap and System Location all failed!");
                    if (this.a) {
                        com.ss.android.lark.map.service.f.this.n = true;
                        o75.a.n(this.b, bp6.y5.c, this.c, this.d, bp6.z7.d, bp6.b2.c, bp6.g5.d, bp6.c4.c);
                    }
                }
                com.ss.android.lark.map.service.f.this.u(larkLocation, null);
            }

            C0156a(boolean z, com.ss.android.lark.location.dto.Scene scene, long j, int i) {
                this.a = z;
                this.b = scene;
                this.c = j;
                this.d = i;
            }
        }
    }

    public f(android.content.Context context) {
        super(context);
        this.o = new o75.b();
        this.q = new com.ss.android.lark.map.service.f.a();
        com.amap.api.location.AMapLocationClient.setApiKey(com.ss.android.lark.map.service.AMapKeyManager.c().b(((com.ss.android.lark.location.service.a) this).a));
        Y();
        java.lang.String str = "amapSdk DeviceId:" + com.amap.api.location.AMapLocationClient.getDeviceId(((com.ss.android.lark.location.service.a) this).a);
        ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "192");
        com.ss.android.lark.log.Log.i("LocationServiceAmap", str);
    }

    protected void D(n75.a aVar) {
        com.ss.android.lark.map.LocationModule.getDependency().getAppStateDependency().c(aVar);
    }

    public void b(com.ss.android.lark.location.dto.LarkLocation larkLocation) {
        com.amap.api.location.CoordinateConverter coordinateConverter = new com.amap.api.location.CoordinateConverter(((com.ss.android.lark.location.service.a) this).a);
        int i = com.ss.android.lark.map.service.f.d.a[larkLocation.g().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                coordinateConverter.from(com.amap.api.location.CoordinateConverter.CoordType.GPS);
            }
            try {
                coordinateConverter.coord(new com.amap.api.location.DPoint(larkLocation.getLatitude(), larkLocation.getLongitude()));
                com.amap.api.location.DPoint dPointConvert = coordinateConverter.convert();
                if (com.amap.api.location.CoordinateConverter.isAMapDataAvailable(dPointConvert.getLatitude(), dPointConvert.getLongitude())) {
                    larkLocation.setLongitude(dPointConvert.getLongitude());
                    larkLocation.setLatitude(dPointConvert.getLatitude());
                    larkLocation.J(com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.GCJ);
                }
                java.lang.String str = "covert location from type: " + larkLocation.g() + "success";
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "391");
                com.ss.android.lark.log.Log.i("LocationServiceAmap", str);
            } catch (java.lang.Exception e) {
                java.lang.String str2 = "covert location from type: " + larkLocation.g() + "failed exception: " + e;
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "393");
                com.ss.android.lark.log.Log.e("LocationServiceAmap", str2);
            }
        }
    }

    protected void k(n75.a aVar) {
        com.ss.android.lark.map.LocationModule.getDependency().getAppStateDependency().b(aVar);
    }

    public boolean l(com.ss.android.lark.location.listener.LocationRequestOption locationRequestOption, com.ss.android.lark.location.dto.Scene scene) {
        if (!me5.b.a.a()) {
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "304");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "getContinuousLocation will not call, cause admin amap sdk disabled");
            com.larksuite.framework.thread.ThreadUtils.runOnUIThread(new com.ss.android.lark.map.service.f.c(), 1L);
            return false;
        }
        java.lang.String str = "amap getContinuousLocation called, appStatus:" + p();
        ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "316");
        com.ss.android.lark.log.Log.i("LocationServiceAmap", str);
        if (E(locationRequestOption)) {
            Y();
            this.m = false;
            if (this.k == null) {
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "323");
                com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap getContinuousLocation called, but mAmapLocationClient is null");
                return false;
            }
            com.amap.api.location.AMapLocationClientOption aMapLocationClientOption = new com.amap.api.location.AMapLocationClientOption();
            if (locationRequestOption != null) {
                java.lang.String str2 = "amap location priority:" + locationRequestOption.b().toString();
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "328");
                com.ss.android.lark.log.Log.i("LocationServiceAmap", str2);
                aMapLocationClientOption.setLocationMode(me5.a.b(locationRequestOption.b()));
            }
            aMapLocationClientOption.setInterval(((com.ss.android.lark.location.service.a) this).b);
            aMapLocationClientOption.setNeedAddress(true);
            aMapLocationClientOption.setMockEnable(false);
            this.k.setLocationOption(aMapLocationClientOption);
            this.k.stopLocation();
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "337");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap getContinuousLocation called, start continuous location");
            o75.a.q(scene, bp6.y5.c, bp6.b2.c, bp6.g5.c);
            this.n = false;
            this.p = scene;
            this.o.f();
            this.k.startLocation();
        }
        return true;
    }

    public boolean m(com.ss.android.lark.location.listener.LocationRequestOption locationRequestOption, com.ss.android.lark.location.dto.Scene scene) {
        if (!me5.b.a.a()) {
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "252");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "getOnceLocation will not call, cause admin amap sdk disabled");
            com.larksuite.framework.thread.ThreadUtils.runOnUIThread(new com.ss.android.lark.map.service.f.b(), 1L);
            return false;
        }
        boolean zP = p();
        ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "264");
        com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap getOnceLocation called, appStatus:" + zP);
        if (zP) {
            Y();
            this.m = true;
            if (this.k == null) {
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "271");
                com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap getOnceLocation called, but mAmapLocationClient is null");
                return false;
            }
            com.amap.api.location.AMapLocationClientOption aMapLocationClientOption = new com.amap.api.location.AMapLocationClientOption();
            if (locationRequestOption != null) {
                java.lang.String str = "amap location priority:" + locationRequestOption.b().toString();
                ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "276");
                com.ss.android.lark.log.Log.i("LocationServiceAmap", str);
                aMapLocationClientOption.setLocationMode(me5.a.b(locationRequestOption.b()));
            }
            aMapLocationClientOption.setMockEnable(false);
            aMapLocationClientOption.setOnceLocation(true);
            aMapLocationClientOption.setOnceLocationLatest(true);
            aMapLocationClientOption.setNeedAddress(true);
            this.k.setLocationOption(aMapLocationClientOption);
            this.k.stopLocation();
            ks7.c.d("modules/platform-feature/map/amap-wrapper/", "LocationService", "286");
            com.ss.android.lark.log.Log.i("LocationServiceAmap", "amap getOnceLocation called, start once location");
            o75.a.q(scene, bp6.y5.c, bp6.b2.c, bp6.g5.d);
            this.p = scene;
            this.o.f();
            this.k.startLocation();
        }
        return true;
    }
}
