package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVPurchaseItineraryLineLeg implements TBase<MVPurchaseItineraryLineLeg, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseItineraryLineLeg> {

    /* renamed from: b */
    public static final C25113c f28895b = new C25113c("startTime", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f28896c = new C25113c("endTime", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f28897d = new C25113c("lineId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f28898e = new C25113c("originStopId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28899f = new C25113c("destinationStopId", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f28900g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28901h;
    private byte __isset_bitfield = 0;
    public int destinationStopId;
    public long endTime;
    public int lineId;
    public int originStopId;
    public long startTime;

    public enum _Fields implements C25085c {
        START_TIME(1, "startTime"),
        END_TIME(2, "endTime"),
        LINE_ID(3, "lineId"),
        ORIGIN_STOP_ID(4, "originStopId"),
        DESTINATION_STOP_ID(5, "destinationStopId");
        
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
                return START_TIME;
            }
            if (i == 2) {
                return END_TIME;
            }
            if (i == 3) {
                return LINE_ID;
            }
            if (i == 4) {
                return ORIGIN_STOP_ID;
            }
            if (i != 5) {
                return null;
            }
            return DESTINATION_STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLineLeg$a */
    public static class C10920a extends C25239c<MVPurchaseItineraryLineLeg> {
        public C10920a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLineLeg mVPurchaseItineraryLineLeg = (MVPurchaseItineraryLineLeg) tBase;
            mVPurchaseItineraryLineLeg.getClass();
            C25113c cVar = MVPurchaseItineraryLineLeg.f28895b;
            gVar.mo61687K();
            gVar.mo61711x(MVPurchaseItineraryLineLeg.f28895b);
            gVar.mo61679C(mVPurchaseItineraryLineLeg.startTime);
            gVar.mo61712y();
            gVar.mo61711x(MVPurchaseItineraryLineLeg.f28896c);
            gVar.mo61679C(mVPurchaseItineraryLineLeg.endTime);
            gVar.mo61712y();
            gVar.mo61711x(MVPurchaseItineraryLineLeg.f28897d);
            gVar.mo61678B(mVPurchaseItineraryLineLeg.lineId);
            gVar.mo61712y();
            gVar.mo61711x(MVPurchaseItineraryLineLeg.f28898e);
            gVar.mo61678B(mVPurchaseItineraryLineLeg.originStopId);
            gVar.mo61712y();
            gVar.mo61711x(MVPurchaseItineraryLineLeg.f28899f);
            C16530d.m42020n(gVar, mVPurchaseItineraryLineLeg.destinationStopId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLineLeg mVPurchaseItineraryLineLeg = (MVPurchaseItineraryLineLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseItineraryLineLeg.getClass();
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
                                    mVPurchaseItineraryLineLeg.destinationStopId = gVar.mo61696i();
                                    mVPurchaseItineraryLineLeg.mo32665k();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVPurchaseItineraryLineLeg.originStopId = gVar.mo61696i();
                                mVPurchaseItineraryLineLeg.mo32668o();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVPurchaseItineraryLineLeg.lineId = gVar.mo61696i();
                            mVPurchaseItineraryLineLeg.mo32667m();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVPurchaseItineraryLineLeg.endTime = gVar.mo61697j();
                        mVPurchaseItineraryLineLeg.mo32666l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVPurchaseItineraryLineLeg.startTime = gVar.mo61697j();
                    mVPurchaseItineraryLineLeg.mo32669p();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLineLeg$b */
    public static class C10921b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10920a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLineLeg$c */
    public static class C10922c extends C25240d<MVPurchaseItineraryLineLeg> {
        public C10922c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLineLeg mVPurchaseItineraryLineLeg = (MVPurchaseItineraryLineLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseItineraryLineLeg.mo32664j()) {
                bitSet.set(0);
            }
            if (mVPurchaseItineraryLineLeg.mo32660g()) {
                bitSet.set(1);
            }
            if (mVPurchaseItineraryLineLeg.mo32661h()) {
                bitSet.set(2);
            }
            if (mVPurchaseItineraryLineLeg.mo32663i()) {
                bitSet.set(3);
            }
            if (mVPurchaseItineraryLineLeg.mo32659f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPurchaseItineraryLineLeg.mo32664j()) {
                jVar.mo61679C(mVPurchaseItineraryLineLeg.startTime);
            }
            if (mVPurchaseItineraryLineLeg.mo32660g()) {
                jVar.mo61679C(mVPurchaseItineraryLineLeg.endTime);
            }
            if (mVPurchaseItineraryLineLeg.mo32661h()) {
                jVar.mo61678B(mVPurchaseItineraryLineLeg.lineId);
            }
            if (mVPurchaseItineraryLineLeg.mo32663i()) {
                jVar.mo61678B(mVPurchaseItineraryLineLeg.originStopId);
            }
            if (mVPurchaseItineraryLineLeg.mo32659f()) {
                jVar.mo61678B(mVPurchaseItineraryLineLeg.destinationStopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseItineraryLineLeg mVPurchaseItineraryLineLeg = (MVPurchaseItineraryLineLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPurchaseItineraryLineLeg.startTime = jVar.mo61697j();
                mVPurchaseItineraryLineLeg.mo32669p();
            }
            if (T.get(1)) {
                mVPurchaseItineraryLineLeg.endTime = jVar.mo61697j();
                mVPurchaseItineraryLineLeg.mo32666l();
            }
            if (T.get(2)) {
                mVPurchaseItineraryLineLeg.lineId = jVar.mo61696i();
                mVPurchaseItineraryLineLeg.mo32667m();
            }
            if (T.get(3)) {
                mVPurchaseItineraryLineLeg.originStopId = jVar.mo61696i();
                mVPurchaseItineraryLineLeg.mo32668o();
            }
            if (T.get(4)) {
                mVPurchaseItineraryLineLeg.destinationStopId = jVar.mo61696i();
                mVPurchaseItineraryLineLeg.mo32665k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLineLeg$d */
    public static class C10923d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10922c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseItineraryLineLeg");
        HashMap hashMap = new HashMap();
        f28900g = hashMap;
        hashMap.put(C25239c.class, new C10921b());
        hashMap.put(C25240d.class, new C10923d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.START_TIME, new FieldMetaData("startTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.END_TIME, new FieldMetaData("endTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ORIGIN_STOP_ID, new FieldMetaData("originStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DESTINATION_STOP_ID, new FieldMetaData("destinationStopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28901h = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseItineraryLineLeg.class, unmodifiableMap);
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
        ((C25238b) f28900g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28900g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVPurchaseItineraryLineLeg mVPurchaseItineraryLineLeg = (MVPurchaseItineraryLineLeg) obj;
        if (!getClass().equals(mVPurchaseItineraryLineLeg.getClass())) {
            return getClass().getName().compareTo(mVPurchaseItineraryLineLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32664j()).compareTo(Boolean.valueOf(mVPurchaseItineraryLineLeg.mo32664j()));
        if (compareTo != 0 || ((mo32664j() && (compareTo = C25082a.m62840d(this.startTime, mVPurchaseItineraryLineLeg.startTime)) != 0) || (compareTo = Boolean.valueOf(mo32660g()).compareTo(Boolean.valueOf(mVPurchaseItineraryLineLeg.mo32660g()))) != 0 || ((mo32660g() && (compareTo = C25082a.m62840d(this.endTime, mVPurchaseItineraryLineLeg.endTime)) != 0) || (compareTo = Boolean.valueOf(mo32661h()).compareTo(Boolean.valueOf(mVPurchaseItineraryLineLeg.mo32661h()))) != 0 || ((mo32661h() && (compareTo = C25082a.m62839c(this.lineId, mVPurchaseItineraryLineLeg.lineId)) != 0) || (compareTo = Boolean.valueOf(mo32663i()).compareTo(Boolean.valueOf(mVPurchaseItineraryLineLeg.mo32663i()))) != 0 || ((mo32663i() && (compareTo = C25082a.m62839c(this.originStopId, mVPurchaseItineraryLineLeg.originStopId)) != 0) || (compareTo = Boolean.valueOf(mo32659f()).compareTo(Boolean.valueOf(mVPurchaseItineraryLineLeg.mo32659f()))) != 0))))) {
            return compareTo;
        }
        if (!mo32659f() || (c = C25082a.m62839c(this.destinationStopId, mVPurchaseItineraryLineLeg.destinationStopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseItineraryLineLeg)) {
            return false;
        }
        MVPurchaseItineraryLineLeg mVPurchaseItineraryLineLeg = (MVPurchaseItineraryLineLeg) obj;
        if (this.startTime == mVPurchaseItineraryLineLeg.startTime && this.endTime == mVPurchaseItineraryLineLeg.endTime && this.lineId == mVPurchaseItineraryLineLeg.lineId && this.originStopId == mVPurchaseItineraryLineLeg.originStopId && this.destinationStopId == mVPurchaseItineraryLineLeg.destinationStopId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32659f() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: g */
    public final boolean mo32660g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo32661h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32663i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo32664j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final void mo32665k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: l */
    public final void mo32666l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo32667m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo32668o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: p */
    public final void mo32669p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseItineraryLineLeg(", "startTime:");
        C25541a.m63889t(n, this.startTime, ", ", "endTime:");
        C25541a.m63889t(n, this.endTime, ", ", "lineId:");
        C0016g.m42z(n, this.lineId, ", ", "originStopId:");
        C0016g.m42z(n, this.originStopId, ", ", "destinationStopId:");
        return C13437d.m33707l(n, this.destinationStopId, ")");
    }
}
