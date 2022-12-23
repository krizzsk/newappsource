package com.tranzmate.moovit.protocol.directsales;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
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

public class MVAdTargeting implements TBase<MVAdTargeting, _Fields>, Serializable, Cloneable, Comparable<MVAdTargeting> {

    /* renamed from: b */
    public static final C25113c f25519b = new C25113c("userLocation", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f25520c = new C25113c("targetLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f25521d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25522e;
    private _Fields[] optionals = {_Fields.USER_LOCATION, _Fields.TARGET_LOCATION};
    public MVLatLon targetLocation;
    public MVGpsLocation userLocation;

    public enum _Fields implements C25085c {
        USER_LOCATION(1, "userLocation"),
        TARGET_LOCATION(2, "targetLocation");
        
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
                return USER_LOCATION;
            }
            if (i != 2) {
                return null;
            }
            return TARGET_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdTargeting$a */
    public static class C8649a extends C25239c<MVAdTargeting> {
        public C8649a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAdTargeting mVAdTargeting = (MVAdTargeting) tBase;
            mVAdTargeting.mo27035h();
            C25113c cVar = MVAdTargeting.f25519b;
            gVar.mo61687K();
            if (mVAdTargeting.userLocation != null && mVAdTargeting.mo27034g()) {
                gVar.mo61711x(MVAdTargeting.f25519b);
                mVAdTargeting.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAdTargeting.targetLocation != null && mVAdTargeting.mo27033f()) {
                gVar.mo61711x(MVAdTargeting.f25520c);
                mVAdTargeting.targetLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAdTargeting mVAdTargeting = (MVAdTargeting) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAdTargeting.mo27035h();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVLatLon mVLatLon = new MVLatLon();
                        mVAdTargeting.targetLocation = mVLatLon;
                        mVLatLon.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVGpsLocation mVGpsLocation = new MVGpsLocation();
                    mVAdTargeting.userLocation = mVGpsLocation;
                    mVGpsLocation.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdTargeting$b */
    public static class C8650b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8649a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdTargeting$c */
    public static class C8651c extends C25240d<MVAdTargeting> {
        public C8651c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAdTargeting mVAdTargeting = (MVAdTargeting) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAdTargeting.mo27034g()) {
                bitSet.set(0);
            }
            if (mVAdTargeting.mo27033f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVAdTargeting.mo27034g()) {
                mVAdTargeting.userLocation.mo25202X0(jVar);
            }
            if (mVAdTargeting.mo27033f()) {
                mVAdTargeting.targetLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAdTargeting mVAdTargeting = (MVAdTargeting) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVAdTargeting.userLocation = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVAdTargeting.targetLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.directsales.MVAdTargeting$d */
    public static class C8652d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8651c(0);
        }
    }

    static {
        new C17394d0("MVAdTargeting");
        HashMap hashMap = new HashMap();
        f25521d = hashMap;
        hashMap.put(C25239c.class, new C8650b());
        hashMap.put(C25240d.class, new C8652d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.TARGET_LOCATION, new FieldMetaData("targetLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25522e = unmodifiableMap;
        FieldMetaData.m61947a(MVAdTargeting.class, unmodifiableMap);
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
        ((C25238b) f25521d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25521d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo27030a(MVAdTargeting mVAdTargeting) {
        if (mVAdTargeting == null) {
            return false;
        }
        boolean g = mo27034g();
        boolean g2 = mVAdTargeting.mo27034g();
        if ((g || g2) && (!g || !g2 || !this.userLocation.mo26178a(mVAdTargeting.userLocation))) {
            return false;
        }
        boolean f = mo27033f();
        boolean f2 = mVAdTargeting.mo27033f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.targetLocation.mo26290a(mVAdTargeting.targetLocation)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAdTargeting mVAdTargeting = (MVAdTargeting) obj;
        if (!getClass().equals(mVAdTargeting.getClass())) {
            return getClass().getName().compareTo(mVAdTargeting.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27034g()).compareTo(Boolean.valueOf(mVAdTargeting.mo27034g()));
        if (compareTo2 != 0 || ((mo27034g() && (compareTo2 = this.userLocation.compareTo(mVAdTargeting.userLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo27033f()).compareTo(Boolean.valueOf(mVAdTargeting.mo27033f()))) != 0)) {
            return compareTo2;
        }
        if (!mo27033f() || (compareTo = this.targetLocation.compareTo(mVAdTargeting.targetLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVAdTargeting)) {
            return mo27030a((MVAdTargeting) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27033f() {
        return this.targetLocation != null;
    }

    /* renamed from: g */
    public final boolean mo27034g() {
        return this.userLocation != null;
    }

    /* renamed from: h */
    public final void mo27035h() throws TException {
        MVGpsLocation mVGpsLocation = this.userLocation;
        if (mVGpsLocation != null) {
            mVGpsLocation.mo26193r();
        }
        MVLatLon mVLatLon = this.targetLocation;
        if (mVLatLon != null) {
            mVLatLon.getClass();
        }
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVAdTargeting(");
        if (mo27034g()) {
            sb.append("userLocation:");
            MVGpsLocation mVGpsLocation = this.userLocation;
            if (mVGpsLocation == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVGpsLocation);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo27033f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("targetLocation:");
            MVLatLon mVLatLon = this.targetLocation;
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
