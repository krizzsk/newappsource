package com.tranzmate.moovit.protocol.crowd;

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

public class MVConnectivity implements TBase<MVConnectivity, _Fields>, Serializable, Cloneable, Comparable<MVConnectivity> {

    /* renamed from: b */
    public static final C25113c f25360b = new C25113c("reachable", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f25361c = new C25113c("reachableWifi", (byte) 2, 2);

    /* renamed from: d */
    public static final C25113c f25362d = new C25113c("cellularDataType", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25363e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25364f;
    private byte __isset_bitfield = 0;
    public String cellularDataType;
    private _Fields[] optionals = {_Fields.REACHABLE_WIFI, _Fields.CELLULAR_DATA_TYPE};
    public boolean reachable;
    public boolean reachableWifi;

    public enum _Fields implements C25085c {
        REACHABLE(1, "reachable"),
        REACHABLE_WIFI(2, "reachableWifi"),
        CELLULAR_DATA_TYPE(3, "cellularDataType");
        
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
                return REACHABLE;
            }
            if (i == 2) {
                return REACHABLE_WIFI;
            }
            if (i != 3) {
                return null;
            }
            return CELLULAR_DATA_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVConnectivity$a */
    public static class C8565a extends C25239c<MVConnectivity> {
        public C8565a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConnectivity mVConnectivity = (MVConnectivity) tBase;
            mVConnectivity.getClass();
            C25113c cVar = MVConnectivity.f25360b;
            gVar.mo61687K();
            gVar.mo61711x(MVConnectivity.f25360b);
            gVar.mo61708u(mVConnectivity.reachable);
            gVar.mo61712y();
            if (mVConnectivity.mo26788h()) {
                gVar.mo61711x(MVConnectivity.f25361c);
                gVar.mo61708u(mVConnectivity.reachableWifi);
                gVar.mo61712y();
            }
            if (mVConnectivity.cellularDataType != null && mVConnectivity.mo26786f()) {
                gVar.mo61711x(MVConnectivity.f25362d);
                gVar.mo61686J(mVConnectivity.cellularDataType);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConnectivity mVConnectivity = (MVConnectivity) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVConnectivity.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVConnectivity.cellularDataType = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 2) {
                        mVConnectivity.reachableWifi = gVar.mo61690c();
                        mVConnectivity.mo26791j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVConnectivity.reachable = gVar.mo61690c();
                    mVConnectivity.mo26790i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVConnectivity$b */
    public static class C8566b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8565a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVConnectivity$c */
    public static class C8567c extends C25240d<MVConnectivity> {
        public C8567c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConnectivity mVConnectivity = (MVConnectivity) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVConnectivity.mo26787g()) {
                bitSet.set(0);
            }
            if (mVConnectivity.mo26788h()) {
                bitSet.set(1);
            }
            if (mVConnectivity.mo26786f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVConnectivity.mo26787g()) {
                jVar.mo61708u(mVConnectivity.reachable);
            }
            if (mVConnectivity.mo26788h()) {
                jVar.mo61708u(mVConnectivity.reachableWifi);
            }
            if (mVConnectivity.mo26786f()) {
                jVar.mo61686J(mVConnectivity.cellularDataType);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConnectivity mVConnectivity = (MVConnectivity) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVConnectivity.reachable = jVar.mo61690c();
                mVConnectivity.mo26790i();
            }
            if (T.get(1)) {
                mVConnectivity.reachableWifi = jVar.mo61690c();
                mVConnectivity.mo26791j();
            }
            if (T.get(2)) {
                mVConnectivity.cellularDataType = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVConnectivity$d */
    public static class C8568d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8567c(0);
        }
    }

    static {
        new C17394d0("MVConnectivity");
        HashMap hashMap = new HashMap();
        f25363e = hashMap;
        hashMap.put(C25239c.class, new C8566b());
        hashMap.put(C25240d.class, new C8568d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REACHABLE, new FieldMetaData("reachable", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.REACHABLE_WIFI, new FieldMetaData("reachableWifi", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.CELLULAR_DATA_TYPE, new FieldMetaData("cellularDataType", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25364f = unmodifiableMap;
        FieldMetaData.m61947a(MVConnectivity.class, unmodifiableMap);
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
        ((C25238b) f25363e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25363e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVConnectivity mVConnectivity = (MVConnectivity) obj;
        if (!getClass().equals(mVConnectivity.getClass())) {
            return getClass().getName().compareTo(mVConnectivity.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26787g()).compareTo(Boolean.valueOf(mVConnectivity.mo26787g()));
        if (compareTo2 != 0 || ((mo26787g() && (compareTo2 = C25082a.m62848l(this.reachable, mVConnectivity.reachable)) != 0) || (compareTo2 = Boolean.valueOf(mo26788h()).compareTo(Boolean.valueOf(mVConnectivity.mo26788h()))) != 0 || ((mo26788h() && (compareTo2 = C25082a.m62848l(this.reachableWifi, mVConnectivity.reachableWifi)) != 0) || (compareTo2 = Boolean.valueOf(mo26786f()).compareTo(Boolean.valueOf(mVConnectivity.mo26786f()))) != 0))) {
            return compareTo2;
        }
        if (!mo26786f() || (compareTo = this.cellularDataType.compareTo(mVConnectivity.cellularDataType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVConnectivity)) {
            return false;
        }
        MVConnectivity mVConnectivity = (MVConnectivity) obj;
        if (this.reachable != mVConnectivity.reachable) {
            return false;
        }
        boolean h = mo26788h();
        boolean h2 = mVConnectivity.mo26788h();
        if ((h || h2) && (!h || !h2 || this.reachableWifi != mVConnectivity.reachableWifi)) {
            return false;
        }
        boolean f = mo26786f();
        boolean f2 = mVConnectivity.mo26786f();
        if ((f || f2) && (!f || !f2 || !this.cellularDataType.equals(mVConnectivity.cellularDataType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26786f() {
        return this.cellularDataType != null;
    }

    /* renamed from: g */
    public final boolean mo26787g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo26788h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26790i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo26791j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVConnectivity(", "reachable:");
        n.append(this.reachable);
        if (mo26788h()) {
            n.append(", ");
            n.append("reachableWifi:");
            n.append(this.reachableWifi);
        }
        if (mo26786f()) {
            n.append(", ");
            n.append("cellularDataType:");
            String str = this.cellularDataType;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(")");
        return n.toString();
    }
}
