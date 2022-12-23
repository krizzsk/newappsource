package com.tranzmate.moovit.protocol.crowd;

import com.appboy.support.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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

public class MVBluetooth implements TBase<MVBluetooth, _Fields>, Serializable, Cloneable, Comparable<MVBluetooth> {

    /* renamed from: b */
    public static final C25113c f25343b = new C25113c(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f25344c = new C25113c("uuid", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25345d = new C25113c("rssi", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f25346e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25347f;
    private byte __isset_bitfield = 0;
    public boolean active;
    public String rssi;
    public String uuid;

    public enum _Fields implements C25085c {
        ACTIVE(1, AppMeasurementSdk.ConditionalUserProperty.ACTIVE),
        UUID(2, "uuid"),
        RSSI(3, "rssi");
        
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
                return ACTIVE;
            }
            if (i == 2) {
                return UUID;
            }
            if (i != 3) {
                return null;
            }
            return RSSI;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBluetooth$a */
    public static class C8553a extends C25239c<MVBluetooth> {
        public C8553a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBluetooth mVBluetooth = (MVBluetooth) tBase;
            mVBluetooth.getClass();
            C25113c cVar = MVBluetooth.f25343b;
            gVar.mo61687K();
            gVar.mo61711x(MVBluetooth.f25343b);
            gVar.mo61708u(mVBluetooth.active);
            gVar.mo61712y();
            if (mVBluetooth.uuid != null) {
                gVar.mo61711x(MVBluetooth.f25344c);
                gVar.mo61686J(mVBluetooth.uuid);
                gVar.mo61712y();
            }
            if (mVBluetooth.rssi != null) {
                gVar.mo61711x(MVBluetooth.f25345d);
                gVar.mo61686J(mVBluetooth.rssi);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBluetooth mVBluetooth = (MVBluetooth) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBluetooth.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVBluetooth.rssi = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVBluetooth.uuid = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVBluetooth.active = gVar.mo61690c();
                    mVBluetooth.mo26760i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBluetooth$b */
    public static class C8554b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8553a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBluetooth$c */
    public static class C8555c extends C25240d<MVBluetooth> {
        public C8555c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBluetooth mVBluetooth = (MVBluetooth) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBluetooth.mo26756f()) {
                bitSet.set(0);
            }
            if (mVBluetooth.mo26758h()) {
                bitSet.set(1);
            }
            if (mVBluetooth.mo26757g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVBluetooth.mo26756f()) {
                jVar.mo61708u(mVBluetooth.active);
            }
            if (mVBluetooth.mo26758h()) {
                jVar.mo61686J(mVBluetooth.uuid);
            }
            if (mVBluetooth.mo26757g()) {
                jVar.mo61686J(mVBluetooth.rssi);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBluetooth mVBluetooth = (MVBluetooth) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVBluetooth.active = jVar.mo61690c();
                mVBluetooth.mo26760i();
            }
            if (T.get(1)) {
                mVBluetooth.uuid = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVBluetooth.rssi = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVBluetooth$d */
    public static class C8556d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8555c(0);
        }
    }

    static {
        new C17394d0("MVBluetooth");
        HashMap hashMap = new HashMap();
        f25346e = hashMap;
        hashMap.put(C25239c.class, new C8554b());
        hashMap.put(C25240d.class, new C8556d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACTIVE, new FieldMetaData(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.UUID, new FieldMetaData("uuid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RSSI, new FieldMetaData("rssi", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25347f = unmodifiableMap;
        FieldMetaData.m61947a(MVBluetooth.class, unmodifiableMap);
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
        ((C25238b) f25346e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25346e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVBluetooth mVBluetooth = (MVBluetooth) obj;
        if (!getClass().equals(mVBluetooth.getClass())) {
            return getClass().getName().compareTo(mVBluetooth.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26756f()).compareTo(Boolean.valueOf(mVBluetooth.mo26756f()));
        if (compareTo2 != 0 || ((mo26756f() && (compareTo2 = C25082a.m62848l(this.active, mVBluetooth.active)) != 0) || (compareTo2 = Boolean.valueOf(mo26758h()).compareTo(Boolean.valueOf(mVBluetooth.mo26758h()))) != 0 || ((mo26758h() && (compareTo2 = this.uuid.compareTo(mVBluetooth.uuid)) != 0) || (compareTo2 = Boolean.valueOf(mo26757g()).compareTo(Boolean.valueOf(mVBluetooth.mo26757g()))) != 0))) {
            return compareTo2;
        }
        if (!mo26757g() || (compareTo = this.rssi.compareTo(mVBluetooth.rssi)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBluetooth)) {
            return false;
        }
        MVBluetooth mVBluetooth = (MVBluetooth) obj;
        if (this.active != mVBluetooth.active) {
            return false;
        }
        boolean h = mo26758h();
        boolean h2 = mVBluetooth.mo26758h();
        if ((h || h2) && (!h || !h2 || !this.uuid.equals(mVBluetooth.uuid))) {
            return false;
        }
        boolean g = mo26757g();
        boolean g2 = mVBluetooth.mo26757g();
        if ((g || g2) && (!g || !g2 || !this.rssi.equals(mVBluetooth.rssi))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26756f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26757g() {
        return this.rssi != null;
    }

    /* renamed from: h */
    public final boolean mo26758h() {
        return this.uuid != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo26760i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBluetooth(", "active:");
        C13555b.m33977q(n, this.active, ", ", "uuid:");
        String str = this.uuid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("rssi:");
        String str2 = this.rssi;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
