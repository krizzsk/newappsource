package com.tranzmate.moovit.protocol.micromobility;

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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVMicroMobilityZonesResponse implements TBase<MVMicroMobilityZonesResponse, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityZonesResponse> {

    /* renamed from: b */
    public static final C25113c f26771b = new C25113c("zones", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f26772c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26773d;
    private _Fields[] optionals = {_Fields.ZONES};
    public List<MVMicroMobilityZone> zones;

    public enum _Fields implements C25085c {
        ZONES(1, "zones");
        
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
            if (i != 1) {
                return null;
            }
            return ZONES;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZonesResponse$a */
    public static class C9368a extends C25239c<MVMicroMobilityZonesResponse> {
        public C9368a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityZonesResponse mVMicroMobilityZonesResponse = (MVMicroMobilityZonesResponse) tBase;
            mVMicroMobilityZonesResponse.getClass();
            C25113c cVar = MVMicroMobilityZonesResponse.f26771b;
            gVar.mo61687K();
            if (mVMicroMobilityZonesResponse.zones != null && mVMicroMobilityZonesResponse.mo29052f()) {
                gVar.mo61711x(MVMicroMobilityZonesResponse.f26771b);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityZonesResponse.zones.size()));
                for (MVMicroMobilityZone X0 : mVMicroMobilityZonesResponse.zones) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityZonesResponse mVMicroMobilityZonesResponse = (MVMicroMobilityZonesResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityZonesResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVMicroMobilityZonesResponse.zones = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVMicroMobilityZone mVMicroMobilityZone = new MVMicroMobilityZone();
                        mVMicroMobilityZone.mo25201C1(gVar);
                        mVMicroMobilityZonesResponse.zones.add(mVMicroMobilityZone);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZonesResponse$b */
    public static class C9369b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9368a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZonesResponse$c */
    public static class C9370c extends C25240d<MVMicroMobilityZonesResponse> {
        public C9370c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityZonesResponse mVMicroMobilityZonesResponse = (MVMicroMobilityZonesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityZonesResponse.mo29052f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityZonesResponse.mo29052f()) {
                jVar.mo61678B(mVMicroMobilityZonesResponse.zones.size());
                for (MVMicroMobilityZone X0 : mVMicroMobilityZonesResponse.zones) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityZonesResponse mVMicroMobilityZonesResponse = (MVMicroMobilityZonesResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVMicroMobilityZonesResponse.zones = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVMicroMobilityZone mVMicroMobilityZone = new MVMicroMobilityZone();
                    mVMicroMobilityZone.mo25201C1(jVar);
                    mVMicroMobilityZonesResponse.zones.add(mVMicroMobilityZone);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZonesResponse$d */
    public static class C9371d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9370c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityZonesResponse");
        HashMap hashMap = new HashMap();
        f26772c = hashMap;
        hashMap.put(C25239c.class, new C9369b());
        hashMap.put(C25240d.class, new C9371d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ZONES, new FieldMetaData("zones", (byte) 2, new ListMetaData(new StructMetaData(MVMicroMobilityZone.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26773d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityZonesResponse.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f26772c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26772c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVMicroMobilityZonesResponse mVMicroMobilityZonesResponse = (MVMicroMobilityZonesResponse) obj;
        if (!getClass().equals(mVMicroMobilityZonesResponse.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityZonesResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29052f()).compareTo(Boolean.valueOf(mVMicroMobilityZonesResponse.mo29052f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo29052f() || (h = C25082a.m62844h(this.zones, mVMicroMobilityZonesResponse.zones)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityZonesResponse)) {
            return false;
        }
        MVMicroMobilityZonesResponse mVMicroMobilityZonesResponse = (MVMicroMobilityZonesResponse) obj;
        boolean f = mo29052f();
        boolean f2 = mVMicroMobilityZonesResponse.mo29052f();
        if ((f || f2) && (!f || !f2 || !this.zones.equals(mVMicroMobilityZonesResponse.zones))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29052f() {
        return this.zones != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVMicroMobilityZonesResponse(");
        if (mo29052f()) {
            sb.append("zones:");
            List<MVMicroMobilityZone> list = this.zones;
            if (list == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
