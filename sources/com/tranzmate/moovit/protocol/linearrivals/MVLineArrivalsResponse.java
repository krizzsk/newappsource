package com.tranzmate.moovit.protocol.linearrivals;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVLineArrivalsResponse implements TBase<MVLineArrivalsResponse, _Fields>, Serializable, Cloneable, Comparable<MVLineArrivalsResponse> {

    /* renamed from: b */
    public static final C25113c f26152b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26153c = new C25113c("epochDay", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26154d = new C25113c("lineArrivals", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f26155e = new C25113c("stopRealTimeInfo", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f26156f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26157g;
    private byte __isset_bitfield = 0;
    public int epochDay;
    public MVLineArrivals lineArrivals;
    private _Fields[] optionals = {_Fields.STOP_REAL_TIME_INFO};
    public int stopId;
    public MVStopRealTimeInformation stopRealTimeInfo;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        EPOCH_DAY(2, "epochDay"),
        LINE_ARRIVALS(3, "lineArrivals"),
        STOP_REAL_TIME_INFO(4, "stopRealTimeInfo");
        
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
                return STOP_ID;
            }
            if (i == 2) {
                return EPOCH_DAY;
            }
            if (i == 3) {
                return LINE_ARRIVALS;
            }
            if (i != 4) {
                return null;
            }
            return STOP_REAL_TIME_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalsResponse$a */
    public static class C8988a extends C25239c<MVLineArrivalsResponse> {
        public C8988a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivalsResponse mVLineArrivalsResponse = (MVLineArrivalsResponse) tBase;
            MVLineArrivals mVLineArrivals = mVLineArrivalsResponse.lineArrivals;
            C25113c cVar = MVLineArrivalsResponse.f26152b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineArrivalsResponse.f26152b);
            gVar.mo61678B(mVLineArrivalsResponse.stopId);
            gVar.mo61712y();
            gVar.mo61711x(MVLineArrivalsResponse.f26153c);
            gVar.mo61678B(mVLineArrivalsResponse.epochDay);
            gVar.mo61712y();
            if (mVLineArrivalsResponse.lineArrivals != null) {
                gVar.mo61711x(MVLineArrivalsResponse.f26154d);
                mVLineArrivalsResponse.lineArrivals.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLineArrivalsResponse.stopRealTimeInfo != null && mVLineArrivalsResponse.mo28059i()) {
                gVar.mo61711x(MVLineArrivalsResponse.f26155e);
                mVLineArrivalsResponse.stopRealTimeInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivalsResponse mVLineArrivalsResponse = (MVLineArrivalsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLineArrivals mVLineArrivals = mVLineArrivalsResponse.lineArrivals;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVStopRealTimeInformation mVStopRealTimeInformation = new MVStopRealTimeInformation();
                                mVLineArrivalsResponse.stopRealTimeInfo = mVStopRealTimeInformation;
                                mVStopRealTimeInformation.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVLineArrivals mVLineArrivals2 = new MVLineArrivals();
                            mVLineArrivalsResponse.lineArrivals = mVLineArrivals2;
                            mVLineArrivals2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVLineArrivalsResponse.epochDay = gVar.mo61696i();
                        mVLineArrivalsResponse.mo28060j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLineArrivalsResponse.stopId = gVar.mo61696i();
                    mVLineArrivalsResponse.mo28061k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalsResponse$b */
    public static class C8989b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8988a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalsResponse$c */
    public static class C8990c extends C25240d<MVLineArrivalsResponse> {
        public C8990c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivalsResponse mVLineArrivalsResponse = (MVLineArrivalsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineArrivalsResponse.mo28057h()) {
                bitSet.set(0);
            }
            if (mVLineArrivalsResponse.mo28055f()) {
                bitSet.set(1);
            }
            if (mVLineArrivalsResponse.mo28056g()) {
                bitSet.set(2);
            }
            if (mVLineArrivalsResponse.mo28059i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVLineArrivalsResponse.mo28057h()) {
                jVar.mo61678B(mVLineArrivalsResponse.stopId);
            }
            if (mVLineArrivalsResponse.mo28055f()) {
                jVar.mo61678B(mVLineArrivalsResponse.epochDay);
            }
            if (mVLineArrivalsResponse.mo28056g()) {
                mVLineArrivalsResponse.lineArrivals.mo25202X0(jVar);
            }
            if (mVLineArrivalsResponse.mo28059i()) {
                mVLineArrivalsResponse.stopRealTimeInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineArrivalsResponse mVLineArrivalsResponse = (MVLineArrivalsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVLineArrivalsResponse.stopId = jVar.mo61696i();
                mVLineArrivalsResponse.mo28061k();
            }
            if (T.get(1)) {
                mVLineArrivalsResponse.epochDay = jVar.mo61696i();
                mVLineArrivalsResponse.mo28060j();
            }
            if (T.get(2)) {
                MVLineArrivals mVLineArrivals = new MVLineArrivals();
                mVLineArrivalsResponse.lineArrivals = mVLineArrivals;
                mVLineArrivals.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVStopRealTimeInformation mVStopRealTimeInformation = new MVStopRealTimeInformation();
                mVLineArrivalsResponse.stopRealTimeInfo = mVStopRealTimeInformation;
                mVStopRealTimeInformation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalsResponse$d */
    public static class C8991d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8990c(0);
        }
    }

    static {
        new C17394d0("MVLineArrivalsResponse");
        HashMap hashMap = new HashMap();
        f26156f = hashMap;
        hashMap.put(C25239c.class, new C8989b());
        hashMap.put(C25240d.class, new C8991d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EPOCH_DAY, new FieldMetaData("epochDay", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_ARRIVALS, new FieldMetaData("lineArrivals", (byte) 3, new StructMetaData(MVLineArrivals.class)));
        enumMap.put(_Fields.STOP_REAL_TIME_INFO, new FieldMetaData("stopRealTimeInfo", (byte) 2, new StructMetaData(MVStopRealTimeInformation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26157g = unmodifiableMap;
        FieldMetaData.m61947a(MVLineArrivalsResponse.class, unmodifiableMap);
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
        ((C25238b) f26156f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26156f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLineArrivalsResponse mVLineArrivalsResponse = (MVLineArrivalsResponse) obj;
        if (!getClass().equals(mVLineArrivalsResponse.getClass())) {
            return getClass().getName().compareTo(mVLineArrivalsResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28057h()).compareTo(Boolean.valueOf(mVLineArrivalsResponse.mo28057h()));
        if (compareTo2 != 0 || ((mo28057h() && (compareTo2 = C25082a.m62839c(this.stopId, mVLineArrivalsResponse.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo28055f()).compareTo(Boolean.valueOf(mVLineArrivalsResponse.mo28055f()))) != 0 || ((mo28055f() && (compareTo2 = C25082a.m62839c(this.epochDay, mVLineArrivalsResponse.epochDay)) != 0) || (compareTo2 = Boolean.valueOf(mo28056g()).compareTo(Boolean.valueOf(mVLineArrivalsResponse.mo28056g()))) != 0 || ((mo28056g() && (compareTo2 = this.lineArrivals.compareTo(mVLineArrivalsResponse.lineArrivals)) != 0) || (compareTo2 = Boolean.valueOf(mo28059i()).compareTo(Boolean.valueOf(mVLineArrivalsResponse.mo28059i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo28059i() || (compareTo = this.stopRealTimeInfo.compareTo(mVLineArrivalsResponse.stopRealTimeInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineArrivalsResponse)) {
            return false;
        }
        MVLineArrivalsResponse mVLineArrivalsResponse = (MVLineArrivalsResponse) obj;
        if (this.stopId != mVLineArrivalsResponse.stopId || this.epochDay != mVLineArrivalsResponse.epochDay) {
            return false;
        }
        boolean g = mo28056g();
        boolean g2 = mVLineArrivalsResponse.mo28056g();
        if ((g || g2) && (!g || !g2 || !this.lineArrivals.mo28036a(mVLineArrivalsResponse.lineArrivals))) {
            return false;
        }
        boolean i = mo28059i();
        boolean i2 = mVLineArrivalsResponse.mo28059i();
        if ((i || i2) && (!i || !i2 || !this.stopRealTimeInfo.mo28101a(mVLineArrivalsResponse.stopRealTimeInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28055f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo28056g() {
        return this.lineArrivals != null;
    }

    /* renamed from: h */
    public final boolean mo28057h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28059i() {
        return this.stopRealTimeInfo != null;
    }

    /* renamed from: j */
    public final void mo28060j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo28061k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineArrivalsResponse(", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "epochDay:");
        C0016g.m42z(n, this.epochDay, ", ", "lineArrivals:");
        MVLineArrivals mVLineArrivals = this.lineArrivals;
        if (mVLineArrivals == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLineArrivals);
        }
        if (mo28059i()) {
            n.append(", ");
            n.append("stopRealTimeInfo:");
            MVStopRealTimeInformation mVStopRealTimeInformation = this.stopRealTimeInfo;
            if (mVStopRealTimeInformation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVStopRealTimeInformation);
            }
        }
        n.append(")");
        return n.toString();
    }
}
