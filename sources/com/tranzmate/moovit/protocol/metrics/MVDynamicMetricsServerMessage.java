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

public class MVDynamicMetricsServerMessage implements TBase<MVDynamicMetricsServerMessage, _Fields>, Serializable, Cloneable, Comparable<MVDynamicMetricsServerMessage> {

    /* renamed from: b */
    public static final C25113c f26410b = new C25113c(ServerParameters.DEVICE_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26411c = new C25113c("app", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26412d = new C25113c("timestamp", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f26413e = new C25113c("tag", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f26414f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26415g;
    private byte __isset_bitfield = 0;
    public MVAppMetrics app;
    public MVDynamicDeviceMetrics device;
    private _Fields[] optionals = {_Fields.TAG};
    public String tag;
    public long timestamp;

    public enum _Fields implements C25085c {
        DEVICE(1, ServerParameters.DEVICE_KEY),
        APP(2, "app"),
        TIMESTAMP(3, "timestamp"),
        TAG(4, "tag");
        
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
            if (i == 2) {
                return APP;
            }
            if (i == 3) {
                return TIMESTAMP;
            }
            if (i != 4) {
                return null;
            }
            return TAG;
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

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDynamicMetricsServerMessage$a */
    public static class C9142a extends C25239c<MVDynamicMetricsServerMessage> {
        public C9142a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage = (MVDynamicMetricsServerMessage) tBase;
            mVDynamicMetricsServerMessage.getClass();
            C25113c cVar = MVDynamicMetricsServerMessage.f26410b;
            gVar.mo61687K();
            if (mVDynamicMetricsServerMessage.device != null) {
                gVar.mo61711x(MVDynamicMetricsServerMessage.f26410b);
                mVDynamicMetricsServerMessage.device.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVDynamicMetricsServerMessage.app != null) {
                gVar.mo61711x(MVDynamicMetricsServerMessage.f26411c);
                mVDynamicMetricsServerMessage.app.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVDynamicMetricsServerMessage.f26412d);
            gVar.mo61679C(mVDynamicMetricsServerMessage.timestamp);
            gVar.mo61712y();
            if (mVDynamicMetricsServerMessage.tag != null && mVDynamicMetricsServerMessage.mo28498h()) {
                gVar.mo61711x(MVDynamicMetricsServerMessage.f26413e);
                gVar.mo61686J(mVDynamicMetricsServerMessage.tag);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage = (MVDynamicMetricsServerMessage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDynamicMetricsServerMessage.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVDynamicMetricsServerMessage.tag = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 10) {
                            mVDynamicMetricsServerMessage.timestamp = gVar.mo61697j();
                            mVDynamicMetricsServerMessage.mo28501j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVAppMetrics mVAppMetrics = new MVAppMetrics();
                        mVDynamicMetricsServerMessage.app = mVAppMetrics;
                        mVAppMetrics.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVDynamicDeviceMetrics mVDynamicDeviceMetrics = new MVDynamicDeviceMetrics();
                    mVDynamicMetricsServerMessage.device = mVDynamicDeviceMetrics;
                    mVDynamicDeviceMetrics.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDynamicMetricsServerMessage$b */
    public static class C9143b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9142a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDynamicMetricsServerMessage$c */
    public static class C9144c extends C25240d<MVDynamicMetricsServerMessage> {
        public C9144c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage = (MVDynamicMetricsServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDynamicMetricsServerMessage.mo28497g()) {
                bitSet.set(0);
            }
            if (mVDynamicMetricsServerMessage.mo28496f()) {
                bitSet.set(1);
            }
            if (mVDynamicMetricsServerMessage.mo28500i()) {
                bitSet.set(2);
            }
            if (mVDynamicMetricsServerMessage.mo28498h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVDynamicMetricsServerMessage.mo28497g()) {
                mVDynamicMetricsServerMessage.device.mo25202X0(jVar);
            }
            if (mVDynamicMetricsServerMessage.mo28496f()) {
                mVDynamicMetricsServerMessage.app.mo25202X0(jVar);
            }
            if (mVDynamicMetricsServerMessage.mo28500i()) {
                jVar.mo61679C(mVDynamicMetricsServerMessage.timestamp);
            }
            if (mVDynamicMetricsServerMessage.mo28498h()) {
                jVar.mo61686J(mVDynamicMetricsServerMessage.tag);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage = (MVDynamicMetricsServerMessage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVDynamicDeviceMetrics mVDynamicDeviceMetrics = new MVDynamicDeviceMetrics();
                mVDynamicMetricsServerMessage.device = mVDynamicDeviceMetrics;
                mVDynamicDeviceMetrics.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVAppMetrics mVAppMetrics = new MVAppMetrics();
                mVDynamicMetricsServerMessage.app = mVAppMetrics;
                mVAppMetrics.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVDynamicMetricsServerMessage.timestamp = jVar.mo61697j();
                mVDynamicMetricsServerMessage.mo28501j();
            }
            if (T.get(3)) {
                mVDynamicMetricsServerMessage.tag = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.metrics.MVDynamicMetricsServerMessage$d */
    public static class C9145d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9144c(0);
        }
    }

    static {
        new C17394d0("MVDynamicMetricsServerMessage");
        HashMap hashMap = new HashMap();
        f26414f = hashMap;
        hashMap.put(C25239c.class, new C9143b());
        hashMap.put(C25240d.class, new C9145d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DEVICE, new FieldMetaData(ServerParameters.DEVICE_KEY, (byte) 3, new StructMetaData(MVDynamicDeviceMetrics.class)));
        enumMap.put(_Fields.APP, new FieldMetaData("app", (byte) 3, new StructMetaData(MVAppMetrics.class)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TAG, new FieldMetaData("tag", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26415g = unmodifiableMap;
        FieldMetaData.m61947a(MVDynamicMetricsServerMessage.class, unmodifiableMap);
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
        ((C25238b) f26414f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26414f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage = (MVDynamicMetricsServerMessage) obj;
        if (!getClass().equals(mVDynamicMetricsServerMessage.getClass())) {
            return getClass().getName().compareTo(mVDynamicMetricsServerMessage.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28497g()).compareTo(Boolean.valueOf(mVDynamicMetricsServerMessage.mo28497g()));
        if (compareTo2 != 0 || ((mo28497g() && (compareTo2 = this.device.compareTo(mVDynamicMetricsServerMessage.device)) != 0) || (compareTo2 = Boolean.valueOf(mo28496f()).compareTo(Boolean.valueOf(mVDynamicMetricsServerMessage.mo28496f()))) != 0 || ((mo28496f() && (compareTo2 = this.app.compareTo(mVDynamicMetricsServerMessage.app)) != 0) || (compareTo2 = Boolean.valueOf(mo28500i()).compareTo(Boolean.valueOf(mVDynamicMetricsServerMessage.mo28500i()))) != 0 || ((mo28500i() && (compareTo2 = C25082a.m62840d(this.timestamp, mVDynamicMetricsServerMessage.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo28498h()).compareTo(Boolean.valueOf(mVDynamicMetricsServerMessage.mo28498h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo28498h() || (compareTo = this.tag.compareTo(mVDynamicMetricsServerMessage.tag)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDynamicMetricsServerMessage)) {
            return false;
        }
        MVDynamicMetricsServerMessage mVDynamicMetricsServerMessage = (MVDynamicMetricsServerMessage) obj;
        boolean g = mo28497g();
        boolean g2 = mVDynamicMetricsServerMessage.mo28497g();
        if ((g || g2) && (!g || !g2 || !this.device.mo28470a(mVDynamicMetricsServerMessage.device))) {
            return false;
        }
        boolean f = mo28496f();
        boolean f2 = mVDynamicMetricsServerMessage.mo28496f();
        if (((f || f2) && (!f || !f2 || !this.app.mo28383a(mVDynamicMetricsServerMessage.app))) || this.timestamp != mVDynamicMetricsServerMessage.timestamp) {
            return false;
        }
        boolean h = mo28498h();
        boolean h2 = mVDynamicMetricsServerMessage.mo28498h();
        if ((h || h2) && (!h || !h2 || !this.tag.equals(mVDynamicMetricsServerMessage.tag))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28496f() {
        return this.app != null;
    }

    /* renamed from: g */
    public final boolean mo28497g() {
        return this.device != null;
    }

    /* renamed from: h */
    public final boolean mo28498h() {
        return this.tag != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28500i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo28501j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDynamicMetricsServerMessage(", "device:");
        MVDynamicDeviceMetrics mVDynamicDeviceMetrics = this.device;
        if (mVDynamicDeviceMetrics == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDynamicDeviceMetrics);
        }
        n.append(", ");
        n.append("app:");
        MVAppMetrics mVAppMetrics = this.app;
        if (mVAppMetrics == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAppMetrics);
        }
        n.append(", ");
        n.append("timestamp:");
        n.append(this.timestamp);
        if (mo28498h()) {
            n.append(", ");
            n.append("tag:");
            String str = this.tag;
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
