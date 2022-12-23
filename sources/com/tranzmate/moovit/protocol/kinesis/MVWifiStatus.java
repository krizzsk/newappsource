package com.tranzmate.moovit.protocol.kinesis;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVWifiStatus implements TBase<MVWifiStatus, _Fields>, Serializable, Cloneable, Comparable<MVWifiStatus> {

    /* renamed from: b */
    public static final C25113c f26102b = new C25113c("wifiOn", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f26103c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f26104d = new C25113c("updateReason", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f26105e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26106f;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.UPDATE_REASON};
    public long timestamp;
    public MVUpdateReason updateReason;
    public boolean wifiOn;

    public enum _Fields implements C25085c {
        WIFI_ON(1, "wifiOn"),
        TIMESTAMP(2, "timestamp"),
        UPDATE_REASON(3, "updateReason");
        
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
                return WIFI_ON;
            }
            if (i == 2) {
                return TIMESTAMP;
            }
            if (i != 3) {
                return null;
            }
            return UPDATE_REASON;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVWifiStatus$a */
    public static class C8960a extends C25239c<MVWifiStatus> {
        public C8960a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWifiStatus mVWifiStatus = (MVWifiStatus) tBase;
            mVWifiStatus.getClass();
            C25113c cVar = MVWifiStatus.f26102b;
            gVar.mo61687K();
            gVar.mo61711x(MVWifiStatus.f26102b);
            gVar.mo61708u(mVWifiStatus.wifiOn);
            gVar.mo61712y();
            gVar.mo61711x(MVWifiStatus.f26103c);
            gVar.mo61679C(mVWifiStatus.timestamp);
            gVar.mo61712y();
            if (mVWifiStatus.updateReason != null && mVWifiStatus.mo27956g()) {
                gVar.mo61711x(MVWifiStatus.f26104d);
                gVar.mo61678B(mVWifiStatus.updateReason.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWifiStatus mVWifiStatus = (MVWifiStatus) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWifiStatus.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVWifiStatus.updateReason = MVUpdateReason.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVWifiStatus.timestamp = gVar.mo61697j();
                        mVWifiStatus.mo27959i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVWifiStatus.wifiOn = gVar.mo61690c();
                    mVWifiStatus.mo27960j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVWifiStatus$b */
    public static class C8961b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8960a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVWifiStatus$c */
    public static class C8962c extends C25240d<MVWifiStatus> {
        public C8962c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWifiStatus mVWifiStatus = (MVWifiStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWifiStatus.mo27957h()) {
                bitSet.set(0);
            }
            if (mVWifiStatus.mo27955f()) {
                bitSet.set(1);
            }
            if (mVWifiStatus.mo27956g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVWifiStatus.mo27957h()) {
                jVar.mo61708u(mVWifiStatus.wifiOn);
            }
            if (mVWifiStatus.mo27955f()) {
                jVar.mo61679C(mVWifiStatus.timestamp);
            }
            if (mVWifiStatus.mo27956g()) {
                jVar.mo61678B(mVWifiStatus.updateReason.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWifiStatus mVWifiStatus = (MVWifiStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVWifiStatus.wifiOn = jVar.mo61690c();
                mVWifiStatus.mo27960j();
            }
            if (T.get(1)) {
                mVWifiStatus.timestamp = jVar.mo61697j();
                mVWifiStatus.mo27959i();
            }
            if (T.get(2)) {
                mVWifiStatus.updateReason = MVUpdateReason.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVWifiStatus$d */
    public static class C8963d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8962c(0);
        }
    }

    static {
        new C17394d0("MVWifiStatus");
        HashMap hashMap = new HashMap();
        f26105e = hashMap;
        hashMap.put(C25239c.class, new C8961b());
        hashMap.put(C25240d.class, new C8963d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.WIFI_ON, new FieldMetaData("wifiOn", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.UPDATE_REASON, new FieldMetaData("updateReason", (byte) 2, new EnumMetaData(MVUpdateReason.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26106f = unmodifiableMap;
        FieldMetaData.m61947a(MVWifiStatus.class, unmodifiableMap);
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
        ((C25238b) f26105e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26105e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWifiStatus mVWifiStatus = (MVWifiStatus) obj;
        if (!getClass().equals(mVWifiStatus.getClass())) {
            return getClass().getName().compareTo(mVWifiStatus.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27957h()).compareTo(Boolean.valueOf(mVWifiStatus.mo27957h()));
        if (compareTo2 != 0 || ((mo27957h() && (compareTo2 = C25082a.m62848l(this.wifiOn, mVWifiStatus.wifiOn)) != 0) || (compareTo2 = Boolean.valueOf(mo27955f()).compareTo(Boolean.valueOf(mVWifiStatus.mo27955f()))) != 0 || ((mo27955f() && (compareTo2 = C25082a.m62840d(this.timestamp, mVWifiStatus.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo27956g()).compareTo(Boolean.valueOf(mVWifiStatus.mo27956g()))) != 0))) {
            return compareTo2;
        }
        if (!mo27956g() || (compareTo = this.updateReason.compareTo(mVWifiStatus.updateReason)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWifiStatus)) {
            return false;
        }
        MVWifiStatus mVWifiStatus = (MVWifiStatus) obj;
        if (this.wifiOn != mVWifiStatus.wifiOn || this.timestamp != mVWifiStatus.timestamp) {
            return false;
        }
        boolean g = mo27956g();
        boolean g2 = mVWifiStatus.mo27956g();
        if ((g || g2) && (!g || !g2 || !this.updateReason.equals(mVWifiStatus.updateReason))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27955f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo27956g() {
        return this.updateReason != null;
    }

    /* renamed from: h */
    public final boolean mo27957h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27959i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: j */
    public final void mo27960j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWifiStatus(", "wifiOn:");
        C13555b.m33977q(n, this.wifiOn, ", ", "timestamp:");
        n.append(this.timestamp);
        if (mo27956g()) {
            n.append(", ");
            n.append("updateReason:");
            MVUpdateReason mVUpdateReason = this.updateReason;
            if (mVUpdateReason == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUpdateReason);
            }
        }
        n.append(")");
        return n.toString();
    }
}
