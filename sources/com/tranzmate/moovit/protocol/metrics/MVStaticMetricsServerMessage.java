package com.tranzmate.moovit.protocol.metrics;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVStaticMetricsServerMessage implements TBase<MVStaticMetricsServerMessage, _Fields>, Serializable, Cloneable, Comparable<MVStaticMetricsServerMessage> {

    /* renamed from: b */
    public static final C25113c f26442b = new C25113c(ServerParameters.DEVICE_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26443c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f26444d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26445e;
    private byte __isset_bitfield = 0;
    public MVStaticDeviceMetrics device;
    public long timestamp;

    public enum _Fields implements C25085c {
        DEVICE(1, ServerParameters.DEVICE_KEY),
        TIMESTAMP(2, "timestamp");
        
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
                return DEVICE;
            }
            if (i != 2) {
                return null;
            }
            return TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVStaticMetricsServerMessage$a */
    public static class C9154a extends C25239c<MVStaticMetricsServerMessage> {
        public C9154a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStaticMetricsServerMessage mVStaticMetricsServerMessage = (MVStaticMetricsServerMessage) tBase;
            mVStaticMetricsServerMessage.getClass();
            C25113c cVar = MVStaticMetricsServerMessage.f26442b;
            gVar.mo61687K();
            if (mVStaticMetricsServerMessage.device != null) {
                gVar.mo61711x(MVStaticMetricsServerMessage.f26442b);
                mVStaticMetricsServerMessage.device.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVStaticMetricsServerMessage.f26443c);
            C25541a.m63891v(gVar, mVStaticMetricsServerMessage.timestamp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStaticMetricsServerMessage mVStaticMetricsServerMessage = (MVStaticMetricsServerMessage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStaticMetricsServerMessage.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVStaticMetricsServerMessage.timestamp = gVar.mo61697j();
                        mVStaticMetricsServerMessage.mo28554h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVStaticDeviceMetrics mVStaticDeviceMetrics = new MVStaticDeviceMetrics();
                    mVStaticMetricsServerMessage.device = mVStaticDeviceMetrics;
                    mVStaticDeviceMetrics.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVStaticMetricsServerMessage$b */
    public static class C9155b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9154a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVStaticMetricsServerMessage$c */
    public static class C9156c extends C25240d<MVStaticMetricsServerMessage> {
        public C9156c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStaticMetricsServerMessage mVStaticMetricsServerMessage = (MVStaticMetricsServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStaticMetricsServerMessage.mo28552f()) {
                bitSet.set(0);
            }
            if (mVStaticMetricsServerMessage.mo28553g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVStaticMetricsServerMessage.mo28552f()) {
                mVStaticMetricsServerMessage.device.mo25202X0(jVar);
            }
            if (mVStaticMetricsServerMessage.mo28553g()) {
                jVar.mo61679C(mVStaticMetricsServerMessage.timestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStaticMetricsServerMessage mVStaticMetricsServerMessage = (MVStaticMetricsServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVStaticDeviceMetrics mVStaticDeviceMetrics = new MVStaticDeviceMetrics();
                mVStaticMetricsServerMessage.device = mVStaticDeviceMetrics;
                mVStaticDeviceMetrics.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVStaticMetricsServerMessage.timestamp = jVar.mo61697j();
                mVStaticMetricsServerMessage.mo28554h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVStaticMetricsServerMessage$d */
    public static class C9157d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9156c(0);
        }
    }

    static {
        new C17394d0("MVStaticMetricsServerMessage");
        HashMap hashMap = new HashMap();
        f26444d = hashMap;
        hashMap.put(C25239c.class, new C9155b());
        hashMap.put(C25240d.class, new C9157d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DEVICE, new FieldMetaData(ServerParameters.DEVICE_KEY, (byte) 3, new StructMetaData(MVStaticDeviceMetrics.class)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26445e = unmodifiableMap;
        FieldMetaData.m61947a(MVStaticMetricsServerMessage.class, unmodifiableMap);
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
        ((C25238b) f26444d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26444d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVStaticMetricsServerMessage mVStaticMetricsServerMessage = (MVStaticMetricsServerMessage) obj;
        if (!getClass().equals(mVStaticMetricsServerMessage.getClass())) {
            return getClass().getName().compareTo(mVStaticMetricsServerMessage.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28552f()).compareTo(Boolean.valueOf(mVStaticMetricsServerMessage.mo28552f()));
        if (compareTo != 0 || ((mo28552f() && (compareTo = this.device.compareTo(mVStaticMetricsServerMessage.device)) != 0) || (compareTo = Boolean.valueOf(mo28553g()).compareTo(Boolean.valueOf(mVStaticMetricsServerMessage.mo28553g()))) != 0)) {
            return compareTo;
        }
        if (!mo28553g() || (d = C25082a.m62840d(this.timestamp, mVStaticMetricsServerMessage.timestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVStaticMetricsServerMessage)) {
            return false;
        }
        MVStaticMetricsServerMessage mVStaticMetricsServerMessage = (MVStaticMetricsServerMessage) obj;
        boolean f = mo28552f();
        boolean f2 = mVStaticMetricsServerMessage.mo28552f();
        if (((f || f2) && (!f || !f2 || !this.device.mo28527a(mVStaticMetricsServerMessage.device))) || this.timestamp != mVStaticMetricsServerMessage.timestamp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28552f() {
        return this.device != null;
    }

    /* renamed from: g */
    public final boolean mo28553g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo28554h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVStaticMetricsServerMessage(", "device:");
        MVStaticDeviceMetrics mVStaticDeviceMetrics = this.device;
        if (mVStaticDeviceMetrics == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVStaticDeviceMetrics);
        }
        n.append(", ");
        n.append("timestamp:");
        return C25541a.m63884o(n, this.timestamp, ")");
    }
}
