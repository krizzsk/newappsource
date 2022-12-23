package com.tranzmate.moovit.protocol.ptb.activations;

import com.braze.models.BrazeGeofence;
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

public class MVPTBFareInfo implements TBase<MVPTBFareInfo, _Fields>, Serializable, Cloneable, Comparable<MVPTBFareInfo> {

    /* renamed from: b */
    public static final C25113c f27881b = new C25113c("fareCode", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27882c = new C25113c(BrazeGeofence.RADIUS_METERS, (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f27883d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27884e;
    private byte __isset_bitfield = 0;
    public int fareCode;
    public int radius;

    public enum _Fields implements C25085c {
        FARE_CODE(1, "fareCode"),
        RADIUS(2, BrazeGeofence.RADIUS_METERS);
        
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
                return FARE_CODE;
            }
            if (i != 2) {
                return null;
            }
            return RADIUS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFareInfo$a */
    public static class C10197a extends C25239c<MVPTBFareInfo> {
        public C10197a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFareInfo mVPTBFareInfo = (MVPTBFareInfo) tBase;
            mVPTBFareInfo.getClass();
            C25113c cVar = MVPTBFareInfo.f27881b;
            gVar.mo61687K();
            gVar.mo61711x(MVPTBFareInfo.f27881b);
            gVar.mo61678B(mVPTBFareInfo.fareCode);
            gVar.mo61712y();
            gVar.mo61711x(MVPTBFareInfo.f27882c);
            C16530d.m42020n(gVar, mVPTBFareInfo.radius);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFareInfo mVPTBFareInfo = (MVPTBFareInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPTBFareInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVPTBFareInfo.radius = gVar.mo61696i();
                        mVPTBFareInfo.mo30931i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPTBFareInfo.fareCode = gVar.mo61696i();
                    mVPTBFareInfo.mo30929h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFareInfo$b */
    public static class C10198b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10197a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFareInfo$c */
    public static class C10199c extends C25240d<MVPTBFareInfo> {
        public C10199c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBFareInfo mVPTBFareInfo = (MVPTBFareInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBFareInfo.mo30927f()) {
                bitSet.set(0);
            }
            if (mVPTBFareInfo.mo30928g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPTBFareInfo.mo30927f()) {
                jVar.mo61678B(mVPTBFareInfo.fareCode);
            }
            if (mVPTBFareInfo.mo30928g()) {
                jVar.mo61678B(mVPTBFareInfo.radius);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBFareInfo mVPTBFareInfo = (MVPTBFareInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPTBFareInfo.fareCode = jVar.mo61696i();
                mVPTBFareInfo.mo30929h();
            }
            if (T.get(1)) {
                mVPTBFareInfo.radius = jVar.mo61696i();
                mVPTBFareInfo.mo30931i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBFareInfo$d */
    public static class C10200d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10199c(0);
        }
    }

    static {
        new C17394d0("MVPTBFareInfo");
        HashMap hashMap = new HashMap();
        f27883d = hashMap;
        hashMap.put(C25239c.class, new C10198b());
        hashMap.put(C25240d.class, new C10200d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FARE_CODE, new FieldMetaData("fareCode", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RADIUS, new FieldMetaData(BrazeGeofence.RADIUS_METERS, (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27884e = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBFareInfo.class, unmodifiableMap);
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
        ((C25238b) f27883d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27883d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30924a(MVPTBFareInfo mVPTBFareInfo) {
        if (mVPTBFareInfo != null && this.fareCode == mVPTBFareInfo.fareCode && this.radius == mVPTBFareInfo.radius) {
            return true;
        }
        return false;
    }

    public final int compareTo(Object obj) {
        int c;
        MVPTBFareInfo mVPTBFareInfo = (MVPTBFareInfo) obj;
        if (!getClass().equals(mVPTBFareInfo.getClass())) {
            return getClass().getName().compareTo(mVPTBFareInfo.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30927f()).compareTo(Boolean.valueOf(mVPTBFareInfo.mo30927f()));
        if (compareTo != 0 || ((mo30927f() && (compareTo = C25082a.m62839c(this.fareCode, mVPTBFareInfo.fareCode)) != 0) || (compareTo = Boolean.valueOf(mo30928g()).compareTo(Boolean.valueOf(mVPTBFareInfo.mo30928g()))) != 0)) {
            return compareTo;
        }
        if (!mo30928g() || (c = C25082a.m62839c(this.radius, mVPTBFareInfo.radius)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPTBFareInfo)) {
            return mo30924a((MVPTBFareInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30927f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30928g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo30929h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo30931i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBFareInfo(", "fareCode:");
        C0016g.m42z(n, this.fareCode, ", ", "radius:");
        return C13437d.m33707l(n, this.radius, ")");
    }
}
