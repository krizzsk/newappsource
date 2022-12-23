package com.tranzmate.moovit.protocol.crowd;

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

public class MVVisit implements TBase<MVVisit, _Fields>, Serializable, Cloneable, Comparable<MVVisit> {

    /* renamed from: b */
    public static final C25113c f25455b = new C25113c("arrivalTimestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f25456c = new C25113c("depatureTimestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25457d = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f25458e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25459f;
    private byte __isset_bitfield = 0;
    public long arrivalTimestamp;
    public long depatureTimestamp;
    public MVGpsLocation location;

    public enum _Fields implements C25085c {
        ARRIVAL_TIMESTAMP(1, "arrivalTimestamp"),
        DEPATURE_TIMESTAMP(2, "depatureTimestamp"),
        LOCATION(3, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        
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
                return ARRIVAL_TIMESTAMP;
            }
            if (i == 2) {
                return DEPATURE_TIMESTAMP;
            }
            if (i != 3) {
                return null;
            }
            return LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVVisit$a */
    public static class C8611a extends C25239c<MVVisit> {
        public C8611a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVisit mVVisit = (MVVisit) tBase;
            MVGpsLocation mVGpsLocation = mVVisit.location;
            if (mVGpsLocation != null) {
                mVGpsLocation.mo26193r();
            }
            C25113c cVar = MVVisit.f25455b;
            gVar.mo61687K();
            gVar.mo61711x(MVVisit.f25455b);
            gVar.mo61679C(mVVisit.arrivalTimestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVVisit.f25456c);
            gVar.mo61679C(mVVisit.depatureTimestamp);
            gVar.mo61712y();
            if (mVVisit.location != null) {
                gVar.mo61711x(MVVisit.f25457d);
                mVVisit.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVisit mVVisit = (MVVisit) tBase;
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
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVGpsLocation mVGpsLocation = new MVGpsLocation();
                            mVVisit.location = mVGpsLocation;
                            mVGpsLocation.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVVisit.depatureTimestamp = gVar.mo61697j();
                        mVVisit.mo26924j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 10) {
                    mVVisit.arrivalTimestamp = gVar.mo61697j();
                    mVVisit.mo26923i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVGpsLocation mVGpsLocation2 = mVVisit.location;
            if (mVGpsLocation2 != null) {
                mVGpsLocation2.mo26193r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVVisit$b */
    public static class C8612b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8611a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVVisit$c */
    public static class C8613c extends C25240d<MVVisit> {
        public C8613c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVisit mVVisit = (MVVisit) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVVisit.mo26919f()) {
                bitSet.set(0);
            }
            if (mVVisit.mo26920g()) {
                bitSet.set(1);
            }
            if (mVVisit.mo26921h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVVisit.mo26919f()) {
                jVar.mo61679C(mVVisit.arrivalTimestamp);
            }
            if (mVVisit.mo26920g()) {
                jVar.mo61679C(mVVisit.depatureTimestamp);
            }
            if (mVVisit.mo26921h()) {
                mVVisit.location.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVisit mVVisit = (MVVisit) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVVisit.arrivalTimestamp = jVar.mo61697j();
                mVVisit.mo26923i();
            }
            if (T.get(1)) {
                mVVisit.depatureTimestamp = jVar.mo61697j();
                mVVisit.mo26924j();
            }
            if (T.get(2)) {
                MVGpsLocation mVGpsLocation = new MVGpsLocation();
                mVVisit.location = mVGpsLocation;
                mVGpsLocation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVVisit$d */
    public static class C8614d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8613c(0);
        }
    }

    static {
        new C17394d0("MVVisit");
        HashMap hashMap = new HashMap();
        f25458e = hashMap;
        hashMap.put(C25239c.class, new C8612b());
        hashMap.put(C25240d.class, new C8614d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ARRIVAL_TIMESTAMP, new FieldMetaData("arrivalTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.DEPATURE_TIMESTAMP, new FieldMetaData("depatureTimestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVGpsLocation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25459f = unmodifiableMap;
        FieldMetaData.m61947a(MVVisit.class, unmodifiableMap);
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
        ((C25238b) f25458e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25458e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVVisit mVVisit = (MVVisit) obj;
        if (!getClass().equals(mVVisit.getClass())) {
            return getClass().getName().compareTo(mVVisit.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26919f()).compareTo(Boolean.valueOf(mVVisit.mo26919f()));
        if (compareTo2 != 0 || ((mo26919f() && (compareTo2 = C25082a.m62840d(this.arrivalTimestamp, mVVisit.arrivalTimestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo26920g()).compareTo(Boolean.valueOf(mVVisit.mo26920g()))) != 0 || ((mo26920g() && (compareTo2 = C25082a.m62840d(this.depatureTimestamp, mVVisit.depatureTimestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo26921h()).compareTo(Boolean.valueOf(mVVisit.mo26921h()))) != 0))) {
            return compareTo2;
        }
        if (!mo26921h() || (compareTo = this.location.compareTo(mVVisit.location)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVVisit)) {
            return false;
        }
        MVVisit mVVisit = (MVVisit) obj;
        if (this.arrivalTimestamp != mVVisit.arrivalTimestamp || this.depatureTimestamp != mVVisit.depatureTimestamp) {
            return false;
        }
        boolean h = mo26921h();
        boolean h2 = mVVisit.mo26921h();
        if ((h || h2) && (!h || !h2 || !this.location.mo26178a(mVVisit.location))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26919f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26920g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo26921h() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26923i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo26924j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVVisit(", "arrivalTimestamp:");
        C25541a.m63889t(n, this.arrivalTimestamp, ", ", "depatureTimestamp:");
        C25541a.m63889t(n, this.depatureTimestamp, ", ", "location:");
        MVGpsLocation mVGpsLocation = this.location;
        if (mVGpsLocation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGpsLocation);
        }
        n.append(")");
        return n.toString();
    }
}
