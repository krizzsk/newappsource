package com.tranzmate.moovit.protocol.linearrivals;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVStopArrivalsResponse implements TBase<MVStopArrivalsResponse, _Fields>, Serializable, Cloneable, Comparable<MVStopArrivalsResponse> {

    /* renamed from: b */
    public static final C25113c f26162b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26163c = new C25113c("epochDay", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26164d = new C25113c("lineArrivals", (byte) 15, 3);

    /* renamed from: e */
    public static final C25113c f26165e = new C25113c("stopRealTimeInfo", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f26166f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26167g;
    private byte __isset_bitfield = 0;
    public int epochDay;
    public List<MVLineArrivals> lineArrivals;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopArrivalsResponse$a */
    public static class C8996a extends C25239c<MVStopArrivalsResponse> {
        public C8996a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopArrivalsResponse mVStopArrivalsResponse = (MVStopArrivalsResponse) tBase;
            MVStopRealTimeInformation mVStopRealTimeInformation = mVStopArrivalsResponse.stopRealTimeInfo;
            C25113c cVar = MVStopArrivalsResponse.f26162b;
            gVar.mo61687K();
            gVar.mo61711x(MVStopArrivalsResponse.f26162b);
            gVar.mo61678B(mVStopArrivalsResponse.stopId);
            gVar.mo61712y();
            gVar.mo61711x(MVStopArrivalsResponse.f26163c);
            gVar.mo61678B(mVStopArrivalsResponse.epochDay);
            gVar.mo61712y();
            if (mVStopArrivalsResponse.lineArrivals != null) {
                gVar.mo61711x(MVStopArrivalsResponse.f26164d);
                gVar.mo61680D(new C25119e((byte) 12, mVStopArrivalsResponse.lineArrivals.size()));
                for (MVLineArrivals X0 : mVStopArrivalsResponse.lineArrivals) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVStopArrivalsResponse.stopRealTimeInfo != null && mVStopArrivalsResponse.mo28077i()) {
                gVar.mo61711x(MVStopArrivalsResponse.f26165e);
                mVStopArrivalsResponse.stopRealTimeInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopArrivalsResponse mVStopArrivalsResponse = (MVStopArrivalsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVStopRealTimeInformation mVStopRealTimeInformation = mVStopArrivalsResponse.stopRealTimeInfo;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVStopRealTimeInformation mVStopRealTimeInformation2 = new MVStopRealTimeInformation();
                                mVStopArrivalsResponse.stopRealTimeInfo = mVStopRealTimeInformation2;
                                mVStopRealTimeInformation2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVStopArrivalsResponse.lineArrivals = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVLineArrivals mVLineArrivals = new MVLineArrivals();
                                mVLineArrivals.mo25201C1(gVar);
                                mVStopArrivalsResponse.lineArrivals.add(mVLineArrivals);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVStopArrivalsResponse.epochDay = gVar.mo61696i();
                        mVStopArrivalsResponse.mo28078j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVStopArrivalsResponse.stopId = gVar.mo61696i();
                    mVStopArrivalsResponse.mo28079k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopArrivalsResponse$b */
    public static class C8997b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8996a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopArrivalsResponse$c */
    public static class C8998c extends C25240d<MVStopArrivalsResponse> {
        public C8998c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopArrivalsResponse mVStopArrivalsResponse = (MVStopArrivalsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStopArrivalsResponse.mo28075h()) {
                bitSet.set(0);
            }
            if (mVStopArrivalsResponse.mo28073f()) {
                bitSet.set(1);
            }
            if (mVStopArrivalsResponse.mo28074g()) {
                bitSet.set(2);
            }
            if (mVStopArrivalsResponse.mo28077i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVStopArrivalsResponse.mo28075h()) {
                jVar.mo61678B(mVStopArrivalsResponse.stopId);
            }
            if (mVStopArrivalsResponse.mo28073f()) {
                jVar.mo61678B(mVStopArrivalsResponse.epochDay);
            }
            if (mVStopArrivalsResponse.mo28074g()) {
                jVar.mo61678B(mVStopArrivalsResponse.lineArrivals.size());
                for (MVLineArrivals X0 : mVStopArrivalsResponse.lineArrivals) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVStopArrivalsResponse.mo28077i()) {
                mVStopArrivalsResponse.stopRealTimeInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopArrivalsResponse mVStopArrivalsResponse = (MVStopArrivalsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVStopArrivalsResponse.stopId = jVar.mo61696i();
                mVStopArrivalsResponse.mo28079k();
            }
            if (T.get(1)) {
                mVStopArrivalsResponse.epochDay = jVar.mo61696i();
                mVStopArrivalsResponse.mo28078j();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVStopArrivalsResponse.lineArrivals = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLineArrivals mVLineArrivals = new MVLineArrivals();
                    mVLineArrivals.mo25201C1(jVar);
                    mVStopArrivalsResponse.lineArrivals.add(mVLineArrivals);
                }
            }
            if (T.get(3)) {
                MVStopRealTimeInformation mVStopRealTimeInformation = new MVStopRealTimeInformation();
                mVStopArrivalsResponse.stopRealTimeInfo = mVStopRealTimeInformation;
                mVStopRealTimeInformation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVStopArrivalsResponse$d */
    public static class C8999d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8998c(0);
        }
    }

    static {
        new C17394d0("MVStopArrivalsResponse");
        HashMap hashMap = new HashMap();
        f26166f = hashMap;
        hashMap.put(C25239c.class, new C8997b());
        hashMap.put(C25240d.class, new C8999d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EPOCH_DAY, new FieldMetaData("epochDay", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_ARRIVALS, new FieldMetaData("lineArrivals", (byte) 3, new ListMetaData(new StructMetaData(MVLineArrivals.class))));
        enumMap.put(_Fields.STOP_REAL_TIME_INFO, new FieldMetaData("stopRealTimeInfo", (byte) 2, new StructMetaData(MVStopRealTimeInformation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26167g = unmodifiableMap;
        FieldMetaData.m61947a(MVStopArrivalsResponse.class, unmodifiableMap);
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
        ((C25238b) f26166f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26166f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVStopArrivalsResponse mVStopArrivalsResponse = (MVStopArrivalsResponse) obj;
        if (!getClass().equals(mVStopArrivalsResponse.getClass())) {
            return getClass().getName().compareTo(mVStopArrivalsResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28075h()).compareTo(Boolean.valueOf(mVStopArrivalsResponse.mo28075h()));
        if (compareTo2 != 0 || ((mo28075h() && (compareTo2 = C25082a.m62839c(this.stopId, mVStopArrivalsResponse.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo28073f()).compareTo(Boolean.valueOf(mVStopArrivalsResponse.mo28073f()))) != 0 || ((mo28073f() && (compareTo2 = C25082a.m62839c(this.epochDay, mVStopArrivalsResponse.epochDay)) != 0) || (compareTo2 = Boolean.valueOf(mo28074g()).compareTo(Boolean.valueOf(mVStopArrivalsResponse.mo28074g()))) != 0 || ((mo28074g() && (compareTo2 = C25082a.m62844h(this.lineArrivals, mVStopArrivalsResponse.lineArrivals)) != 0) || (compareTo2 = Boolean.valueOf(mo28077i()).compareTo(Boolean.valueOf(mVStopArrivalsResponse.mo28077i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo28077i() || (compareTo = this.stopRealTimeInfo.compareTo(mVStopArrivalsResponse.stopRealTimeInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStopArrivalsResponse)) {
            return false;
        }
        MVStopArrivalsResponse mVStopArrivalsResponse = (MVStopArrivalsResponse) obj;
        if (this.stopId != mVStopArrivalsResponse.stopId || this.epochDay != mVStopArrivalsResponse.epochDay) {
            return false;
        }
        boolean g = mo28074g();
        boolean g2 = mVStopArrivalsResponse.mo28074g();
        if ((g || g2) && (!g || !g2 || !this.lineArrivals.equals(mVStopArrivalsResponse.lineArrivals))) {
            return false;
        }
        boolean i = mo28077i();
        boolean i2 = mVStopArrivalsResponse.mo28077i();
        if ((i || i2) && (!i || !i2 || !this.stopRealTimeInfo.mo28101a(mVStopArrivalsResponse.stopRealTimeInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28073f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo28074g() {
        return this.lineArrivals != null;
    }

    /* renamed from: h */
    public final boolean mo28075h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28077i() {
        return this.stopRealTimeInfo != null;
    }

    /* renamed from: j */
    public final void mo28078j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: k */
    public final void mo28079k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStopArrivalsResponse(", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "epochDay:");
        C0016g.m42z(n, this.epochDay, ", ", "lineArrivals:");
        List<MVLineArrivals> list = this.lineArrivals;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo28077i()) {
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
