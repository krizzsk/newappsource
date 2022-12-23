package com.tranzmate.moovit.protocol.taxi;

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

public class MVTaxiOrderConfig implements TBase<MVTaxiOrderConfig, _Fields>, Serializable, Cloneable, Comparable<MVTaxiOrderConfig> {

    /* renamed from: b */
    public static final C25113c f28603b = new C25113c("additionalPassengersProfiles", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28604c = new C25113c("maxNumberOfPassengers", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f28605d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28606e;
    private byte __isset_bitfield = 0;
    public List<MVTaxiOrderProfile> additionalPassengersProfiles;
    public int maxNumberOfPassengers;

    public enum _Fields implements C25085c {
        ADDITIONAL_PASSENGERS_PROFILES(1, "additionalPassengersProfiles"),
        MAX_NUMBER_OF_PASSENGERS(2, "maxNumberOfPassengers");
        
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
                return ADDITIONAL_PASSENGERS_PROFILES;
            }
            if (i != 2) {
                return null;
            }
            return MAX_NUMBER_OF_PASSENGERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiOrderConfig$a */
    public static class C10724a extends C25239c<MVTaxiOrderConfig> {
        public C10724a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiOrderConfig mVTaxiOrderConfig = (MVTaxiOrderConfig) tBase;
            mVTaxiOrderConfig.getClass();
            C25113c cVar = MVTaxiOrderConfig.f28603b;
            gVar.mo61687K();
            if (mVTaxiOrderConfig.additionalPassengersProfiles != null) {
                gVar.mo61711x(MVTaxiOrderConfig.f28603b);
                gVar.mo61680D(new C25119e((byte) 12, mVTaxiOrderConfig.additionalPassengersProfiles.size()));
                for (MVTaxiOrderProfile X0 : mVTaxiOrderConfig.additionalPassengersProfiles) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTaxiOrderConfig.f28604c);
            C16530d.m42020n(gVar, mVTaxiOrderConfig.maxNumberOfPassengers);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiOrderConfig mVTaxiOrderConfig = (MVTaxiOrderConfig) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTaxiOrderConfig.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVTaxiOrderConfig.maxNumberOfPassengers = gVar.mo61696i();
                        mVTaxiOrderConfig.mo32204h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVTaxiOrderConfig.additionalPassengersProfiles = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVTaxiOrderProfile mVTaxiOrderProfile = new MVTaxiOrderProfile();
                        mVTaxiOrderProfile.mo25201C1(gVar);
                        mVTaxiOrderConfig.additionalPassengersProfiles.add(mVTaxiOrderProfile);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiOrderConfig$b */
    public static class C10725b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10724a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiOrderConfig$c */
    public static class C10726c extends C25240d<MVTaxiOrderConfig> {
        public C10726c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiOrderConfig mVTaxiOrderConfig = (MVTaxiOrderConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiOrderConfig.mo32202f()) {
                bitSet.set(0);
            }
            if (mVTaxiOrderConfig.mo32203g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTaxiOrderConfig.mo32202f()) {
                jVar.mo61678B(mVTaxiOrderConfig.additionalPassengersProfiles.size());
                for (MVTaxiOrderProfile X0 : mVTaxiOrderConfig.additionalPassengersProfiles) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTaxiOrderConfig.mo32203g()) {
                jVar.mo61678B(mVTaxiOrderConfig.maxNumberOfPassengers);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiOrderConfig mVTaxiOrderConfig = (MVTaxiOrderConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVTaxiOrderConfig.additionalPassengersProfiles = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTaxiOrderProfile mVTaxiOrderProfile = new MVTaxiOrderProfile();
                    mVTaxiOrderProfile.mo25201C1(jVar);
                    mVTaxiOrderConfig.additionalPassengersProfiles.add(mVTaxiOrderProfile);
                }
            }
            if (T.get(1)) {
                mVTaxiOrderConfig.maxNumberOfPassengers = jVar.mo61696i();
                mVTaxiOrderConfig.mo32204h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiOrderConfig$d */
    public static class C10727d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10726c(0);
        }
    }

    static {
        new C17394d0("MVTaxiOrderConfig");
        HashMap hashMap = new HashMap();
        f28605d = hashMap;
        hashMap.put(C25239c.class, new C10725b());
        hashMap.put(C25240d.class, new C10727d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ADDITIONAL_PASSENGERS_PROFILES, new FieldMetaData("additionalPassengersProfiles", (byte) 3, new ListMetaData(new StructMetaData(MVTaxiOrderProfile.class))));
        enumMap.put(_Fields.MAX_NUMBER_OF_PASSENGERS, new FieldMetaData("maxNumberOfPassengers", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28606e = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiOrderConfig.class, unmodifiableMap);
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
        ((C25238b) f28605d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28605d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32199a(MVTaxiOrderConfig mVTaxiOrderConfig) {
        if (mVTaxiOrderConfig == null) {
            return false;
        }
        boolean f = mo32202f();
        boolean f2 = mVTaxiOrderConfig.mo32202f();
        if (((f || f2) && (!f || !f2 || !this.additionalPassengersProfiles.equals(mVTaxiOrderConfig.additionalPassengersProfiles))) || this.maxNumberOfPassengers != mVTaxiOrderConfig.maxNumberOfPassengers) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVTaxiOrderConfig mVTaxiOrderConfig = (MVTaxiOrderConfig) obj;
        if (!getClass().equals(mVTaxiOrderConfig.getClass())) {
            return getClass().getName().compareTo(mVTaxiOrderConfig.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32202f()).compareTo(Boolean.valueOf(mVTaxiOrderConfig.mo32202f()));
        if (compareTo != 0 || ((mo32202f() && (compareTo = C25082a.m62844h(this.additionalPassengersProfiles, mVTaxiOrderConfig.additionalPassengersProfiles)) != 0) || (compareTo = Boolean.valueOf(mo32203g()).compareTo(Boolean.valueOf(mVTaxiOrderConfig.mo32203g()))) != 0)) {
            return compareTo;
        }
        if (!mo32203g() || (c = C25082a.m62839c(this.maxNumberOfPassengers, mVTaxiOrderConfig.maxNumberOfPassengers)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiOrderConfig)) {
            return mo32199a((MVTaxiOrderConfig) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32202f() {
        return this.additionalPassengersProfiles != null;
    }

    /* renamed from: g */
    public final boolean mo32203g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo32204h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiOrderConfig(", "additionalPassengersProfiles:");
        List<MVTaxiOrderProfile> list = this.additionalPassengersProfiles;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("maxNumberOfPassengers:");
        return C13437d.m33707l(n, this.maxNumberOfPassengers, ")");
    }
}
