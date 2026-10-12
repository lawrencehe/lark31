package com.ss.android.lark.pb.attendance_push;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* loaded from: /tmp/larkdex/classes18.dex */
public final class PushAttendanceRequest extends Message<PushAttendanceRequest, a> {
    public static final ProtoAdapter<PushAttendanceRequest> ADAPTER = new b();
    public static final Long DEFAULT_PUSH_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<EnvironmentType> menvironment_type_list;
    public final PushType mevent_type;
    public final Long mpush_time;

    public static final class a extends Message.Builder<PushAttendanceRequest, a> {
        public PushType a;
        public Long b;
        public List<EnvironmentType> c = Internal.newMutableList();

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PushAttendanceRequest build() {
            PushType pushType = this.a;
            if (pushType == null || this.b == null) {
                throw Internal.missingRequiredFields(new Object[]{pushType, "mevent_type", this.b, "mpush_time"});
            }
            return new PushAttendanceRequest(this.a, this.b, this.c, super.buildUnknownFields());
        }
    }

    private static final class b extends ProtoAdapter<PushAttendanceRequest> {
        b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushAttendanceRequest.class);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PushAttendanceRequest decode(ProtoReader protoReader) throws IOException {
            a aVar = new a();
            aVar.b = 0L;
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    aVar.c.add((EnvironmentType) EnvironmentType.ADAPTER.decode(protoReader));
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            aVar.b = (Long) ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        try {
                            aVar.a = (PushType) PushType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            aVar.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(PushAttendanceRequest pushAttendanceRequest) {
            return PushType.ADAPTER.encodedSizeWithTag(1, pushAttendanceRequest.mevent_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, pushAttendanceRequest.mpush_time) + EnvironmentType.ADAPTER.asRepeated().encodedSizeWithTag(3, pushAttendanceRequest.menvironment_type_list) + pushAttendanceRequest.unknownFields().size();
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(ProtoWriter protoWriter, PushAttendanceRequest pushAttendanceRequest) throws IOException {
            PushType.ADAPTER.encodeWithTag(protoWriter, 1, pushAttendanceRequest.mevent_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, pushAttendanceRequest.mpush_time);
            EnvironmentType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, pushAttendanceRequest.menvironment_type_list);
            protoWriter.writeBytes(pushAttendanceRequest.unknownFields());
        }
    }

    public a newBuilder() {
        a aVar = new a();
        aVar.a = this.mevent_type;
        aVar.b = this.mpush_time;
        aVar.c = Internal.copyOf("menvironment_type_list", this.menvironment_type_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    public String toString() {
        return PushAttendanceRequest.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    public enum PushType implements WireEnum {
        UNKNOWN(0),
        REFRESH_CONFIG(1),
        TOP_SPEED_CLOCK_IN(2);

        public static final ProtoAdapter<PushType> ADAPTER = ProtoAdapter.newEnumAdapter(PushType.class);
        private final int value;

        public final int getValue() {
            return this.value;
        }

        public static PushType fromValue(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return TOP_SPEED_CLOCK_IN;
                }
                return REFRESH_CONFIG;
            }
            return UNKNOWN;
        }

        PushType(int i) {
            this.value = i;
        }
    }

    public PushAttendanceRequest(PushType pushType, Long l, List<EnvironmentType> list) {
        this(pushType, l, list, ByteString.EMPTY);
    }

    public PushAttendanceRequest(PushType pushType, Long l, List<EnvironmentType> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mevent_type = pushType;
        this.mpush_time = l;
        this.menvironment_type_list = Internal.immutableCopyOf("menvironment_type_list", list);
    }
}
