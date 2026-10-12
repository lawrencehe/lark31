package com.ss.android.lark.pb.attendance_push;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: /tmp/larkdex/classes18.dex */
public enum EnvironmentType implements WireEnum {
    GPS(1),
    WIFI(2),
    IP(3),
    MACHINE(4),
    BLUETOOTH(5);

    public static final ProtoAdapter<EnvironmentType> ADAPTER = ProtoAdapter.newEnumAdapter(EnvironmentType.class);
    private final int value;

    public final int getValue() {
        return this.value;
    }

    public static EnvironmentType fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return BLUETOOTH;
                    }
                    return MACHINE;
                }
                return IP;
            }
            return WIFI;
        }
        return GPS;
    }

    EnvironmentType(int i) {
        this.value = i;
    }
}
