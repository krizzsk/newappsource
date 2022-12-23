package com.tranzmate.moovit.protocol.kinesis;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVProfilerRecordingStop implements TBase<MVProfilerRecordingStop, _Fields>, Serializable, Cloneable, Comparable<MVProfilerRecordingStop> {

    /* renamed from: b */
    public static final C25113c f25995b = new C25113c("profilerType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25996c = new C25113c("sequenceId", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25997d = new C25113c("timestamp", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f25998e = new C25113c("stopReason", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25999f = new C25113c("metroId", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f26000g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26001h;
    private byte __isset_bitfield = 0;
    public int metroId;
    public MVProfilerType profilerType;
    public long sequenceId;
    public MVProfilerStopReason stopReason;
    public long timestamp;

    public enum _Fields implements C25085c {
        PROFILER_TYPE(1, "profilerType"),
        SEQUENCE_ID(2, "sequenceId"),
        TIMESTAMP(3, "timestamp"),
        STOP_REASON(4, "stopReason"),
        METRO_ID(5, "metroId");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            if (i == 1) {
                return PROFILER_TYPE;
            }
            if (i == 2) {
                return SEQUENCE_ID;
            }
            if (i == 3) {
                return TIMESTAMP;
            }
            if (i == 4) {
                return STOP_REASON;
            }
            if (i != 5) {
                return null;
            }
            return METRO_ID;
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerRecordingStop$a */
    public static class C8935a extends C25239c<MVProfilerRecordingStop> {
        public C8935a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfilerRecordingStop mVProfilerRecordingStop = (MVProfilerRecordingStop) tBase;
            mVProfilerRecordingStop.getClass();
            C25113c cVar = MVProfilerRecordingStop.f25995b;
            gVar.mo61687K();
            if (mVProfilerRecordingStop.profilerType != null) {
                gVar.mo61711x(MVProfilerRecordingStop.f25995b);
                gVar.mo61678B(mVProfilerRecordingStop.profilerType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVProfilerRecordingStop.f25996c);
            gVar.mo61679C(mVProfilerRecordingStop.sequenceId);
            gVar.mo61712y();
            gVar.mo61711x(MVProfilerRecordingStop.f25997d);
            gVar.mo61679C(mVProfilerRecordingStop.timestamp);
            gVar.mo61712y();
            if (mVProfilerRecordingStop.stopReason != null) {
                gVar.mo61711x(MVProfilerRecordingStop.f25998e);
                gVar.mo61678B(mVProfilerRecordingStop.stopReason.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVProfilerRecordingStop.f25999f);
            C16530d.m42020n(gVar, mVProfilerRecordingStop.metroId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfilerRecordingStop mVProfilerRecordingStop = (MVProfilerRecordingStop) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVProfilerRecordingStop.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVProfilerRecordingStop.metroId = gVar.mo61696i();
                                    mVProfilerRecordingStop.mo27886k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVProfilerRecordingStop.stopReason = MVProfilerStopReason.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 10) {
                            mVProfilerRecordingStop.timestamp = gVar.mo61697j();
                            mVProfilerRecordingStop.mo27888m();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVProfilerRecordingStop.sequenceId = gVar.mo61697j();
                        mVProfilerRecordingStop.mo27887l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVProfilerRecordingStop.profilerType = MVProfilerType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerRecordingStop$b */
    public static class C8936b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8935a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerRecordingStop$c */
    public static class C8937c extends C25240d<MVProfilerRecordingStop> {
        public C8937c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfilerRecordingStop mVProfilerRecordingStop = (MVProfilerRecordingStop) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVProfilerRecordingStop.mo27881g()) {
                bitSet.set(0);
            }
            if (mVProfilerRecordingStop.mo27882h()) {
                bitSet.set(1);
            }
            if (mVProfilerRecordingStop.mo27885j()) {
                bitSet.set(2);
            }
            if (mVProfilerRecordingStop.mo27884i()) {
                bitSet.set(3);
            }
            if (mVProfilerRecordingStop.mo27880f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVProfilerRecordingStop.mo27881g()) {
                jVar.mo61678B(mVProfilerRecordingStop.profilerType.getValue());
            }
            if (mVProfilerRecordingStop.mo27882h()) {
                jVar.mo61679C(mVProfilerRecordingStop.sequenceId);
            }
            if (mVProfilerRecordingStop.mo27885j()) {
                jVar.mo61679C(mVProfilerRecordingStop.timestamp);
            }
            if (mVProfilerRecordingStop.mo27884i()) {
                jVar.mo61678B(mVProfilerRecordingStop.stopReason.getValue());
            }
            if (mVProfilerRecordingStop.mo27880f()) {
                jVar.mo61678B(mVProfilerRecordingStop.metroId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfilerRecordingStop mVProfilerRecordingStop = (MVProfilerRecordingStop) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVProfilerRecordingStop.profilerType = MVProfilerType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVProfilerRecordingStop.sequenceId = jVar.mo61697j();
                mVProfilerRecordingStop.mo27887l();
            }
            if (T.get(2)) {
                mVProfilerRecordingStop.timestamp = jVar.mo61697j();
                mVProfilerRecordingStop.mo27888m();
            }
            if (T.get(3)) {
                mVProfilerRecordingStop.stopReason = MVProfilerStopReason.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVProfilerRecordingStop.metroId = jVar.mo61696i();
                mVProfilerRecordingStop.mo27886k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVProfilerRecordingStop$d */
    public static class C8938d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8937c(0);
        }
    }

    static {
        new C17394d0("MVProfilerRecordingStop");
        HashMap hashMap = new HashMap();
        f26000g = hashMap;
        hashMap.put(C25239c.class, new C8936b());
        hashMap.put(C25240d.class, new C8938d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROFILER_TYPE, new FieldMetaData("profilerType", (byte) 3, new EnumMetaData(MVProfilerType.class)));
        enumMap.put(_Fields.SEQUENCE_ID, new FieldMetaData("sequenceId", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.STOP_REASON, new FieldMetaData("stopReason", (byte) 3, new EnumMetaData(MVProfilerStopReason.class)));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26001h = unmodifiableMap;
        FieldMetaData.m61947a(MVProfilerRecordingStop.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f26000g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26000g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVProfilerRecordingStop mVProfilerRecordingStop = (MVProfilerRecordingStop) obj;
        if (!getClass().equals(mVProfilerRecordingStop.getClass())) {
            return getClass().getName().compareTo(mVProfilerRecordingStop.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27881g()).compareTo(Boolean.valueOf(mVProfilerRecordingStop.mo27881g()));
        if (compareTo != 0 || ((mo27881g() && (compareTo = this.profilerType.compareTo(mVProfilerRecordingStop.profilerType)) != 0) || (compareTo = Boolean.valueOf(mo27882h()).compareTo(Boolean.valueOf(mVProfilerRecordingStop.mo27882h()))) != 0 || ((mo27882h() && (compareTo = C25082a.m62840d(this.sequenceId, mVProfilerRecordingStop.sequenceId)) != 0) || (compareTo = Boolean.valueOf(mo27885j()).compareTo(Boolean.valueOf(mVProfilerRecordingStop.mo27885j()))) != 0 || ((mo27885j() && (compareTo = C25082a.m62840d(this.timestamp, mVProfilerRecordingStop.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27884i()).compareTo(Boolean.valueOf(mVProfilerRecordingStop.mo27884i()))) != 0 || ((mo27884i() && (compareTo = this.stopReason.compareTo(mVProfilerRecordingStop.stopReason)) != 0) || (compareTo = Boolean.valueOf(mo27880f()).compareTo(Boolean.valueOf(mVProfilerRecordingStop.mo27880f()))) != 0))))) {
            return compareTo;
        }
        if (!mo27880f() || (c = C25082a.m62839c(this.metroId, mVProfilerRecordingStop.metroId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVProfilerRecordingStop)) {
            return false;
        }
        MVProfilerRecordingStop mVProfilerRecordingStop = (MVProfilerRecordingStop) obj;
        boolean g = mo27881g();
        boolean g2 = mVProfilerRecordingStop.mo27881g();
        if (((g || g2) && (!g || !g2 || !this.profilerType.equals(mVProfilerRecordingStop.profilerType))) || this.sequenceId != mVProfilerRecordingStop.sequenceId || this.timestamp != mVProfilerRecordingStop.timestamp) {
            return false;
        }
        boolean i = mo27884i();
        boolean i2 = mVProfilerRecordingStop.mo27884i();
        if (((i || i2) && (!i || !i2 || !this.stopReason.equals(mVProfilerRecordingStop.stopReason))) || this.metroId != mVProfilerRecordingStop.metroId) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27880f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo27881g() {
        return this.profilerType != null;
    }

    /* renamed from: h */
    public final boolean mo27882h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27884i() {
        return this.stopReason != null;
    }

    /* renamed from: j */
    public final boolean mo27885j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final void mo27886k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: l */
    public final void mo27887l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: m */
    public final void mo27888m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVProfilerRecordingStop(", "profilerType:");
        MVProfilerType mVProfilerType = this.profilerType;
        if (mVProfilerType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVProfilerType);
        }
        n.append(", ");
        n.append("sequenceId:");
        C25541a.m63889t(n, this.sequenceId, ", ", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "stopReason:");
        MVProfilerStopReason mVProfilerStopReason = this.stopReason;
        if (mVProfilerStopReason == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVProfilerStopReason);
        }
        n.append(", ");
        n.append("metroId:");
        return C13437d.m33707l(n, this.metroId, ")");
    }
}
