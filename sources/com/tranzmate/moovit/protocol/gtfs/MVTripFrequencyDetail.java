package com.tranzmate.moovit.protocol.gtfs;

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

public class MVTripFrequencyDetail implements TBase<MVTripFrequencyDetail, _Fields>, Serializable, Cloneable, Comparable<MVTripFrequencyDetail> {

    /* renamed from: b */
    public static final C25113c f25826b = new C25113c("fromTimeRelativeSeconds", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25827c = new C25113c("toTimeRelativeSeconds", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25828d = new C25113c("rangeMinMinutes", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25829e = new C25113c("rangeMaxMinutes", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f25830f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f25831g;
    private byte __isset_bitfield = 0;
    public int fromTimeRelativeSeconds;
    public int rangeMaxMinutes;
    public int rangeMinMinutes;
    public int toTimeRelativeSeconds;

    public enum _Fields implements C25085c {
        FROM_TIME_RELATIVE_SECONDS(1, "fromTimeRelativeSeconds"),
        TO_TIME_RELATIVE_SECONDS(2, "toTimeRelativeSeconds"),
        RANGE_MIN_MINUTES(3, "rangeMinMinutes"),
        RANGE_MAX_MINUTES(4, "rangeMaxMinutes");
        
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
                return FROM_TIME_RELATIVE_SECONDS;
            }
            if (i == 2) {
                return TO_TIME_RELATIVE_SECONDS;
            }
            if (i == 3) {
                return RANGE_MIN_MINUTES;
            }
            if (i != 4) {
                return null;
            }
            return RANGE_MAX_MINUTES;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripFrequencyDetail$a */
    public static class C8851a extends C25239c<MVTripFrequencyDetail> {
        public C8851a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripFrequencyDetail mVTripFrequencyDetail = (MVTripFrequencyDetail) tBase;
            mVTripFrequencyDetail.getClass();
            C25113c cVar = MVTripFrequencyDetail.f25826b;
            gVar.mo61687K();
            gVar.mo61711x(MVTripFrequencyDetail.f25826b);
            gVar.mo61678B(mVTripFrequencyDetail.fromTimeRelativeSeconds);
            gVar.mo61712y();
            gVar.mo61711x(MVTripFrequencyDetail.f25827c);
            gVar.mo61678B(mVTripFrequencyDetail.toTimeRelativeSeconds);
            gVar.mo61712y();
            gVar.mo61711x(MVTripFrequencyDetail.f25828d);
            gVar.mo61678B(mVTripFrequencyDetail.rangeMinMinutes);
            gVar.mo61712y();
            gVar.mo61711x(MVTripFrequencyDetail.f25829e);
            C16530d.m42020n(gVar, mVTripFrequencyDetail.rangeMaxMinutes);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripFrequencyDetail mVTripFrequencyDetail = (MVTripFrequencyDetail) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripFrequencyDetail.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVTripFrequencyDetail.rangeMaxMinutes = gVar.mo61696i();
                                mVTripFrequencyDetail.mo27566k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVTripFrequencyDetail.rangeMinMinutes = gVar.mo61696i();
                            mVTripFrequencyDetail.mo27567l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVTripFrequencyDetail.toTimeRelativeSeconds = gVar.mo61696i();
                        mVTripFrequencyDetail.mo27568m();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripFrequencyDetail.fromTimeRelativeSeconds = gVar.mo61696i();
                    mVTripFrequencyDetail.mo27565j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripFrequencyDetail$b */
    public static class C8852b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8851a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripFrequencyDetail$c */
    public static class C8853c extends C25240d<MVTripFrequencyDetail> {
        public C8853c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripFrequencyDetail mVTripFrequencyDetail = (MVTripFrequencyDetail) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripFrequencyDetail.mo27560f()) {
                bitSet.set(0);
            }
            if (mVTripFrequencyDetail.mo27564i()) {
                bitSet.set(1);
            }
            if (mVTripFrequencyDetail.mo27562h()) {
                bitSet.set(2);
            }
            if (mVTripFrequencyDetail.mo27561g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTripFrequencyDetail.mo27560f()) {
                jVar.mo61678B(mVTripFrequencyDetail.fromTimeRelativeSeconds);
            }
            if (mVTripFrequencyDetail.mo27564i()) {
                jVar.mo61678B(mVTripFrequencyDetail.toTimeRelativeSeconds);
            }
            if (mVTripFrequencyDetail.mo27562h()) {
                jVar.mo61678B(mVTripFrequencyDetail.rangeMinMinutes);
            }
            if (mVTripFrequencyDetail.mo27561g()) {
                jVar.mo61678B(mVTripFrequencyDetail.rangeMaxMinutes);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripFrequencyDetail mVTripFrequencyDetail = (MVTripFrequencyDetail) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTripFrequencyDetail.fromTimeRelativeSeconds = jVar.mo61696i();
                mVTripFrequencyDetail.mo27565j();
            }
            if (T.get(1)) {
                mVTripFrequencyDetail.toTimeRelativeSeconds = jVar.mo61696i();
                mVTripFrequencyDetail.mo27568m();
            }
            if (T.get(2)) {
                mVTripFrequencyDetail.rangeMinMinutes = jVar.mo61696i();
                mVTripFrequencyDetail.mo27567l();
            }
            if (T.get(3)) {
                mVTripFrequencyDetail.rangeMaxMinutes = jVar.mo61696i();
                mVTripFrequencyDetail.mo27566k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVTripFrequencyDetail$d */
    public static class C8854d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8853c(0);
        }
    }

    static {
        new C17394d0("MVTripFrequencyDetail");
        HashMap hashMap = new HashMap();
        f25830f = hashMap;
        hashMap.put(C25239c.class, new C8852b());
        hashMap.put(C25240d.class, new C8854d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FROM_TIME_RELATIVE_SECONDS, new FieldMetaData("fromTimeRelativeSeconds", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TO_TIME_RELATIVE_SECONDS, new FieldMetaData("toTimeRelativeSeconds", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RANGE_MIN_MINUTES, new FieldMetaData("rangeMinMinutes", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RANGE_MAX_MINUTES, new FieldMetaData("rangeMaxMinutes", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25831g = unmodifiableMap;
        FieldMetaData.m61947a(MVTripFrequencyDetail.class, unmodifiableMap);
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
        ((C25238b) f25830f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25830f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVTripFrequencyDetail mVTripFrequencyDetail = (MVTripFrequencyDetail) obj;
        if (!getClass().equals(mVTripFrequencyDetail.getClass())) {
            return getClass().getName().compareTo(mVTripFrequencyDetail.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27560f()).compareTo(Boolean.valueOf(mVTripFrequencyDetail.mo27560f()));
        if (compareTo != 0 || ((mo27560f() && (compareTo = C25082a.m62839c(this.fromTimeRelativeSeconds, mVTripFrequencyDetail.fromTimeRelativeSeconds)) != 0) || (compareTo = Boolean.valueOf(mo27564i()).compareTo(Boolean.valueOf(mVTripFrequencyDetail.mo27564i()))) != 0 || ((mo27564i() && (compareTo = C25082a.m62839c(this.toTimeRelativeSeconds, mVTripFrequencyDetail.toTimeRelativeSeconds)) != 0) || (compareTo = Boolean.valueOf(mo27562h()).compareTo(Boolean.valueOf(mVTripFrequencyDetail.mo27562h()))) != 0 || ((mo27562h() && (compareTo = C25082a.m62839c(this.rangeMinMinutes, mVTripFrequencyDetail.rangeMinMinutes)) != 0) || (compareTo = Boolean.valueOf(mo27561g()).compareTo(Boolean.valueOf(mVTripFrequencyDetail.mo27561g()))) != 0)))) {
            return compareTo;
        }
        if (!mo27561g() || (c = C25082a.m62839c(this.rangeMaxMinutes, mVTripFrequencyDetail.rangeMaxMinutes)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripFrequencyDetail)) {
            return false;
        }
        MVTripFrequencyDetail mVTripFrequencyDetail = (MVTripFrequencyDetail) obj;
        if (this.fromTimeRelativeSeconds == mVTripFrequencyDetail.fromTimeRelativeSeconds && this.toTimeRelativeSeconds == mVTripFrequencyDetail.toTimeRelativeSeconds && this.rangeMinMinutes == mVTripFrequencyDetail.rangeMinMinutes && this.rangeMaxMinutes == mVTripFrequencyDetail.rangeMaxMinutes) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27560f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27561g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo27562h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27564i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final void mo27565j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo27566k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: l */
    public final void mo27567l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: m */
    public final void mo27568m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripFrequencyDetail(", "fromTimeRelativeSeconds:");
        C0016g.m42z(n, this.fromTimeRelativeSeconds, ", ", "toTimeRelativeSeconds:");
        C0016g.m42z(n, this.toTimeRelativeSeconds, ", ", "rangeMinMinutes:");
        C0016g.m42z(n, this.rangeMinMinutes, ", ", "rangeMaxMinutes:");
        return C13437d.m33707l(n, this.rangeMaxMinutes, ")");
    }
}
