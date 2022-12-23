package com.tranzmate.moovit.protocol.checkin;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVGeofence;
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

public class MVNavigationGeofence implements TBase<MVNavigationGeofence, _Fields>, Serializable, Cloneable, Comparable<MVNavigationGeofence> {

    /* renamed from: b */
    public static final C25113c f24953b = new C25113c("geofenceId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24954c = new C25113c("geofence", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24955d = new C25113c("metadata", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f24956e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24957f;
    private byte __isset_bitfield = 0;
    public MVGeofence geofence;
    public int geofenceId;
    public MVGeofenceMetadata metadata;

    public enum _Fields implements C25085c {
        GEOFENCE_ID(1, "geofenceId"),
        GEOFENCE(2, "geofence"),
        METADATA(3, "metadata");
        
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
                return GEOFENCE_ID;
            }
            if (i == 2) {
                return GEOFENCE;
            }
            if (i != 3) {
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

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence$a */
    public static class C8356a extends C25239c<MVNavigationGeofence> {
        public C8356a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNavigationGeofence mVNavigationGeofence = (MVNavigationGeofence) tBase;
            mVNavigationGeofence.getClass();
            C25113c cVar = MVNavigationGeofence.f24953b;
            gVar.mo61687K();
            gVar.mo61711x(MVNavigationGeofence.f24953b);
            gVar.mo61678B(mVNavigationGeofence.geofenceId);
            gVar.mo61712y();
            if (mVNavigationGeofence.geofence != null) {
                gVar.mo61711x(MVNavigationGeofence.f24954c);
                mVNavigationGeofence.geofence.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVNavigationGeofence.metadata != null) {
                gVar.mo61711x(MVNavigationGeofence.f24955d);
                mVNavigationGeofence.metadata.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNavigationGeofence mVNavigationGeofence = (MVNavigationGeofence) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVNavigationGeofence.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVGeofenceMetadata mVGeofenceMetadata = new MVGeofenceMetadata();
                            mVNavigationGeofence.metadata = mVGeofenceMetadata;
                            mVGeofenceMetadata.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVGeofence mVGeofence = new MVGeofence();
                        mVNavigationGeofence.geofence = mVGeofence;
                        mVGeofence.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVNavigationGeofence.geofenceId = gVar.mo61696i();
                    mVNavigationGeofence.mo26045i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence$b */
    public static class C8357b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8356a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence$c */
    public static class C8358c extends C25240d<MVNavigationGeofence> {
        public C8358c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNavigationGeofence mVNavigationGeofence = (MVNavigationGeofence) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVNavigationGeofence.mo26042g()) {
                bitSet.set(0);
            }
            if (mVNavigationGeofence.mo26041f()) {
                bitSet.set(1);
            }
            if (mVNavigationGeofence.mo26043h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVNavigationGeofence.mo26042g()) {
                jVar.mo61678B(mVNavigationGeofence.geofenceId);
            }
            if (mVNavigationGeofence.mo26041f()) {
                mVNavigationGeofence.geofence.mo25202X0(jVar);
            }
            if (mVNavigationGeofence.mo26043h()) {
                mVNavigationGeofence.metadata.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNavigationGeofence mVNavigationGeofence = (MVNavigationGeofence) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVNavigationGeofence.geofenceId = jVar.mo61696i();
                mVNavigationGeofence.mo26045i();
            }
            if (T.get(1)) {
                MVGeofence mVGeofence = new MVGeofence();
                mVNavigationGeofence.geofence = mVGeofence;
                mVGeofence.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVGeofenceMetadata mVGeofenceMetadata = new MVGeofenceMetadata();
                mVNavigationGeofence.metadata = mVGeofenceMetadata;
                mVGeofenceMetadata.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence$d */
    public static class C8359d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8358c(0);
        }
    }

    static {
        new C17394d0("MVNavigationGeofence");
        HashMap hashMap = new HashMap();
        f24956e = hashMap;
        hashMap.put(C25239c.class, new C8357b());
        hashMap.put(C25240d.class, new C8359d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GEOFENCE_ID, new FieldMetaData("geofenceId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.GEOFENCE, new FieldMetaData("geofence", (byte) 3, new StructMetaData(MVGeofence.class)));
        enumMap.put(_Fields.METADATA, new FieldMetaData("metadata", (byte) 3, new StructMetaData(MVGeofenceMetadata.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24957f = unmodifiableMap;
        FieldMetaData.m61947a(MVNavigationGeofence.class, unmodifiableMap);
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
        ((C25238b) f24956e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24956e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVNavigationGeofence mVNavigationGeofence = (MVNavigationGeofence) obj;
        if (!getClass().equals(mVNavigationGeofence.getClass())) {
            return getClass().getName().compareTo(mVNavigationGeofence.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26042g()).compareTo(Boolean.valueOf(mVNavigationGeofence.mo26042g()));
        if (compareTo2 != 0 || ((mo26042g() && (compareTo2 = C25082a.m62839c(this.geofenceId, mVNavigationGeofence.geofenceId)) != 0) || (compareTo2 = Boolean.valueOf(mo26041f()).compareTo(Boolean.valueOf(mVNavigationGeofence.mo26041f()))) != 0 || ((mo26041f() && (compareTo2 = this.geofence.compareTo(mVNavigationGeofence.geofence)) != 0) || (compareTo2 = Boolean.valueOf(mo26043h()).compareTo(Boolean.valueOf(mVNavigationGeofence.mo26043h()))) != 0))) {
            return compareTo2;
        }
        if (!mo26043h() || (compareTo = this.metadata.compareTo(mVNavigationGeofence.metadata)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVNavigationGeofence)) {
            return false;
        }
        MVNavigationGeofence mVNavigationGeofence = (MVNavigationGeofence) obj;
        if (this.geofenceId != mVNavigationGeofence.geofenceId) {
            return false;
        }
        boolean f = mo26041f();
        boolean f2 = mVNavigationGeofence.mo26041f();
        if ((f || f2) && (!f || !f2 || !this.geofence.mo26169a(mVNavigationGeofence.geofence))) {
            return false;
        }
        boolean h = mo26043h();
        boolean h2 = mVNavigationGeofence.mo26043h();
        if ((h || h2) && (!h || !h2 || !this.metadata.mo26021a(mVNavigationGeofence.metadata))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26041f() {
        return this.geofence != null;
    }

    /* renamed from: g */
    public final boolean mo26042g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo26043h() {
        return this.metadata != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26045i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVNavigationGeofence(", "geofenceId:");
        C0016g.m42z(n, this.geofenceId, ", ", "geofence:");
        MVGeofence mVGeofence = this.geofence;
        if (mVGeofence == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGeofence);
        }
        n.append(", ");
        n.append("metadata:");
        MVGeofenceMetadata mVGeofenceMetadata = this.metadata;
        if (mVGeofenceMetadata == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVGeofenceMetadata);
        }
        n.append(")");
        return n.toString();
    }
}
