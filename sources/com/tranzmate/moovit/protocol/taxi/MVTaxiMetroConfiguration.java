package com.tranzmate.moovit.protocol.taxi;

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

public class MVTaxiMetroConfiguration implements TBase<MVTaxiMetroConfiguration, _Fields>, Serializable, Cloneable, Comparable<MVTaxiMetroConfiguration> {

    /* renamed from: b */
    public static final C25113c f28565b = new C25113c("taxiId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28566c = new C25113c("metadata", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f28567d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28568e;
    private byte __isset_bitfield = 0;
    public MVTaxiMetroConfigurationMetadata metadata;
    public int taxiId;

    public enum _Fields implements C25085c {
        TAXI_ID(1, "taxiId"),
        METADATA(2, "metadata");
        
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
                return TAXI_ID;
            }
            if (i != 2) {
                return null;
            }
            return METADATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfiguration$a */
    public static class C10712a extends C25239c<MVTaxiMetroConfiguration> {
        public C10712a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiMetroConfiguration mVTaxiMetroConfiguration = (MVTaxiMetroConfiguration) tBase;
            MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata = mVTaxiMetroConfiguration.metadata;
            C25113c cVar = MVTaxiMetroConfiguration.f28565b;
            gVar.mo61687K();
            gVar.mo61711x(MVTaxiMetroConfiguration.f28565b);
            gVar.mo61678B(mVTaxiMetroConfiguration.taxiId);
            gVar.mo61712y();
            if (mVTaxiMetroConfiguration.metadata != null) {
                gVar.mo61711x(MVTaxiMetroConfiguration.f28566c);
                mVTaxiMetroConfiguration.metadata.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiMetroConfiguration mVTaxiMetroConfiguration = (MVTaxiMetroConfiguration) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata = mVTaxiMetroConfiguration.metadata;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata2 = new MVTaxiMetroConfigurationMetadata();
                        mVTaxiMetroConfiguration.metadata = mVTaxiMetroConfigurationMetadata2;
                        mVTaxiMetroConfigurationMetadata2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTaxiMetroConfiguration.taxiId = gVar.mo61696i();
                    mVTaxiMetroConfiguration.mo32147h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfiguration$b */
    public static class C10713b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10712a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfiguration$c */
    public static class C10714c extends C25240d<MVTaxiMetroConfiguration> {
        public C10714c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiMetroConfiguration mVTaxiMetroConfiguration = (MVTaxiMetroConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiMetroConfiguration.mo32146g()) {
                bitSet.set(0);
            }
            if (mVTaxiMetroConfiguration.mo32145f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTaxiMetroConfiguration.mo32146g()) {
                jVar.mo61678B(mVTaxiMetroConfiguration.taxiId);
            }
            if (mVTaxiMetroConfiguration.mo32145f()) {
                mVTaxiMetroConfiguration.metadata.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiMetroConfiguration mVTaxiMetroConfiguration = (MVTaxiMetroConfiguration) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTaxiMetroConfiguration.taxiId = jVar.mo61696i();
                mVTaxiMetroConfiguration.mo32147h();
            }
            if (T.get(1)) {
                MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata = new MVTaxiMetroConfigurationMetadata();
                mVTaxiMetroConfiguration.metadata = mVTaxiMetroConfigurationMetadata;
                mVTaxiMetroConfigurationMetadata.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiMetroConfiguration$d */
    public static class C10715d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10714c(0);
        }
    }

    static {
        new C17394d0("MVTaxiMetroConfiguration");
        HashMap hashMap = new HashMap();
        f28567d = hashMap;
        hashMap.put(C25239c.class, new C10713b());
        hashMap.put(C25240d.class, new C10715d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TAXI_ID, new FieldMetaData("taxiId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.METADATA, new FieldMetaData("metadata", (byte) 3, new StructMetaData(MVTaxiMetroConfigurationMetadata.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28568e = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiMetroConfiguration.class, unmodifiableMap);
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
        ((C25238b) f28567d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28567d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiMetroConfiguration mVTaxiMetroConfiguration = (MVTaxiMetroConfiguration) obj;
        if (!getClass().equals(mVTaxiMetroConfiguration.getClass())) {
            return getClass().getName().compareTo(mVTaxiMetroConfiguration.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32146g()).compareTo(Boolean.valueOf(mVTaxiMetroConfiguration.mo32146g()));
        if (compareTo2 != 0 || ((mo32146g() && (compareTo2 = C25082a.m62839c(this.taxiId, mVTaxiMetroConfiguration.taxiId)) != 0) || (compareTo2 = Boolean.valueOf(mo32145f()).compareTo(Boolean.valueOf(mVTaxiMetroConfiguration.mo32145f()))) != 0)) {
            return compareTo2;
        }
        if (!mo32145f() || (compareTo = this.metadata.compareTo(mVTaxiMetroConfiguration.metadata)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTaxiMetroConfiguration)) {
            return false;
        }
        MVTaxiMetroConfiguration mVTaxiMetroConfiguration = (MVTaxiMetroConfiguration) obj;
        if (this.taxiId != mVTaxiMetroConfiguration.taxiId) {
            return false;
        }
        boolean f = mo32145f();
        boolean f2 = mVTaxiMetroConfiguration.mo32145f();
        if ((f || f2) && (!f || !f2 || !this.metadata.mo32169a(mVTaxiMetroConfiguration.metadata))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32145f() {
        return this.metadata != null;
    }

    /* renamed from: g */
    public final boolean mo32146g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo32147h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiMetroConfiguration(", "taxiId:");
        C0016g.m42z(n, this.taxiId, ", ", "metadata:");
        MVTaxiMetroConfigurationMetadata mVTaxiMetroConfigurationMetadata = this.metadata;
        if (mVTaxiMetroConfigurationMetadata == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTaxiMetroConfigurationMetadata);
        }
        n.append(")");
        return n.toString();
    }
}
