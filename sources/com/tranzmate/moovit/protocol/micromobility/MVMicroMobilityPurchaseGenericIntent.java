package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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
import org.apache.thrift.meta_data.StructMetaData;
import p531he.C17394d0;
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

public class MVMicroMobilityPurchaseGenericIntent implements TBase<MVMicroMobilityPurchaseGenericIntent, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseGenericIntent> {

    /* renamed from: b */
    public static final C25113c f26614b = new C25113c("userLocation", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f26615c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26616d;
    private _Fields[] optionals = {_Fields.USER_LOCATION};
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        USER_LOCATION(1, "userLocation");
        
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
            return USER_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseGenericIntent$a */
    public static class C9269a extends C25239c<MVMicroMobilityPurchaseGenericIntent> {
        public C9269a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseGenericIntent mVMicroMobilityPurchaseGenericIntent = (MVMicroMobilityPurchaseGenericIntent) tBase;
            MVLatLon mVLatLon = mVMicroMobilityPurchaseGenericIntent.userLocation;
            C25113c cVar = MVMicroMobilityPurchaseGenericIntent.f26614b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseGenericIntent.userLocation != null && mVMicroMobilityPurchaseGenericIntent.mo28817f()) {
                gVar.mo61711x(MVMicroMobilityPurchaseGenericIntent.f26614b);
                mVMicroMobilityPurchaseGenericIntent.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseGenericIntent mVMicroMobilityPurchaseGenericIntent = (MVMicroMobilityPurchaseGenericIntent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVMicroMobilityPurchaseGenericIntent.userLocation;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVLatLon mVLatLon2 = new MVLatLon();
                    mVMicroMobilityPurchaseGenericIntent.userLocation = mVLatLon2;
                    mVLatLon2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseGenericIntent$b */
    public static class C9270b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9269a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseGenericIntent$c */
    public static class C9271c extends C25240d<MVMicroMobilityPurchaseGenericIntent> {
        public C9271c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseGenericIntent mVMicroMobilityPurchaseGenericIntent = (MVMicroMobilityPurchaseGenericIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseGenericIntent.mo28817f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityPurchaseGenericIntent.mo28817f()) {
                mVMicroMobilityPurchaseGenericIntent.userLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseGenericIntent mVMicroMobilityPurchaseGenericIntent = (MVMicroMobilityPurchaseGenericIntent) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMicroMobilityPurchaseGenericIntent.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseGenericIntent$d */
    public static class C9272d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9271c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseGenericIntent");
        HashMap hashMap = new HashMap();
        f26615c = hashMap;
        hashMap.put(C25239c.class, new C9270b());
        hashMap.put(C25240d.class, new C9272d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26616d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseGenericIntent.class, unmodifiableMap);
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
        ((C25238b) f26615c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26615c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchaseGenericIntent mVMicroMobilityPurchaseGenericIntent = (MVMicroMobilityPurchaseGenericIntent) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseGenericIntent.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseGenericIntent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28817f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseGenericIntent.mo28817f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo28817f() || (compareTo = this.userLocation.compareTo(mVMicroMobilityPurchaseGenericIntent.userLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchaseGenericIntent)) {
            return false;
        }
        MVMicroMobilityPurchaseGenericIntent mVMicroMobilityPurchaseGenericIntent = (MVMicroMobilityPurchaseGenericIntent) obj;
        boolean f = mo28817f();
        boolean f2 = mVMicroMobilityPurchaseGenericIntent.mo28817f();
        if ((f || f2) && (!f || !f2 || !this.userLocation.mo26290a(mVMicroMobilityPurchaseGenericIntent.userLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28817f() {
        return this.userLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVMicroMobilityPurchaseGenericIntent(");
        if (mo28817f()) {
            sb.append("userLocation:");
            MVLatLon mVLatLon = this.userLocation;
            if (mVLatLon == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVLatLon);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
