package com.tranzmate.moovit.protocol.carpool;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
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
import p358af.C13437d;
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

public class MVRidePoint implements TBase<MVRidePoint, _Fields>, Serializable, Cloneable, Comparable<MVRidePoint> {

    /* renamed from: b */
    public static final C25113c f24865b = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24866c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f24867d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24868e;
    public MVGpsLocation location;
    public String name;

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        NAME(2, "name");
        
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
                return LOCATION;
            }
            if (i != 2) {
                return null;
            }
            return NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRidePoint$a */
    public static class C8307a extends C25239c<MVRidePoint> {
        public C8307a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRidePoint mVRidePoint = (MVRidePoint) tBase;
            MVGpsLocation mVGpsLocation = mVRidePoint.location;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVRidePoint.f24865b;
            gVar.mo61687K();
            if (mVRidePoint.location != null) {
                gVar.mo61711x(MVRidePoint.f24865b);
                mVRidePoint.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRidePoint.name != null) {
                gVar.mo61711x(MVRidePoint.f24866c);
                gVar.mo61686J(mVRidePoint.name);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRidePoint mVRidePoint = (MVRidePoint) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVRidePoint.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVGpsLocation mVGpsLocation = new MVGpsLocation();
                    mVRidePoint.location = mVGpsLocation;
                    mVGpsLocation.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVGpsLocation mVGpsLocation2 = mVRidePoint.location;
            if (mVGpsLocation2 != null) {
                mVGpsLocation2.mo26193r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRidePoint$b */
    public static class C8308b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8307a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRidePoint$c */
    public static class C8309c extends C25240d<MVRidePoint> {
        public C8309c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRidePoint mVRidePoint = (MVRidePoint) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRidePoint.mo25883f()) {
                bitSet.set(0);
            }
            if (mVRidePoint.mo25884g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVRidePoint.mo25883f()) {
                mVRidePoint.location.mo25202X0(jVar);
            }
            if (mVRidePoint.mo25884g()) {
                jVar.mo61686J(mVRidePoint.name);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRidePoint mVRidePoint = (MVRidePoint) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVRidePoint.location = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVRidePoint.name = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRidePoint$d */
    public static class C8310d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8309c(0);
        }
    }

    static {
        new C17394d0("MVRidePoint");
        HashMap hashMap = new HashMap();
        f24867d = hashMap;
        hashMap.put(C25239c.class, new C8308b());
        hashMap.put(C25240d.class, new C8310d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVGpsLocation.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24868e = unmodifiableMap;
        FieldMetaData.m61947a(MVRidePoint.class, unmodifiableMap);
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
        ((C25238b) f24867d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24867d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRidePoint mVRidePoint = (MVRidePoint) obj;
        if (!getClass().equals(mVRidePoint.getClass())) {
            return getClass().getName().compareTo(mVRidePoint.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25883f()).compareTo(Boolean.valueOf(mVRidePoint.mo25883f()));
        if (compareTo2 != 0 || ((mo25883f() && (compareTo2 = this.location.compareTo(mVRidePoint.location)) != 0) || (compareTo2 = Boolean.valueOf(mo25884g()).compareTo(Boolean.valueOf(mVRidePoint.mo25884g()))) != 0)) {
            return compareTo2;
        }
        if (!mo25884g() || (compareTo = this.name.compareTo(mVRidePoint.name)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRidePoint)) {
            return false;
        }
        MVRidePoint mVRidePoint = (MVRidePoint) obj;
        boolean f = mo25883f();
        boolean f2 = mVRidePoint.mo25883f();
        if ((f || f2) && (!f || !f2 || !this.location.mo26178a(mVRidePoint.location))) {
            return false;
        }
        boolean g = mo25884g();
        boolean g2 = mVRidePoint.mo25884g();
        if ((g || g2) && (!g || !g2 || !this.name.equals(mVRidePoint.name))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25883f() {
        return this.location != null;
    }

    /* renamed from: g */
    public final boolean mo25884g() {
        return this.name != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRidePoint(", "location:");
        MVGpsLocation mVGpsLocation = this.location;
        if (mVGpsLocation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGpsLocation);
        }
        n.append(", ");
        n.append("name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
