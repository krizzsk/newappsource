package com.tranzmate.moovit.protocol.kinesis;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVAnalyticsEvent implements TBase<MVAnalyticsEvent, _Fields>, Serializable, Cloneable, Comparable<MVAnalyticsEvent> {

    /* renamed from: b */
    public static final C25113c f25871b = new C25113c("eventKey", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25872c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f25873d = new C25113c("attributes", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f25874e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25875f;
    private byte __isset_bitfield = 0;
    public List<MVAnalyticsAttribute> attributes;
    public MVAnalyticsEventKey eventKey;
    public long timestamp;

    public enum _Fields implements C25085c {
        EVENT_KEY(1, "eventKey"),
        TIMESTAMP(2, "timestamp"),
        ATTRIBUTES(3, "attributes");
        
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
                return EVENT_KEY;
            }
            if (i == 2) {
                return TIMESTAMP;
            }
            if (i != 3) {
                return null;
            }
            return ATTRIBUTES;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVAnalyticsEvent$a */
    public static class C8879a extends C25239c<MVAnalyticsEvent> {
        public C8879a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAnalyticsEvent mVAnalyticsEvent = (MVAnalyticsEvent) tBase;
            mVAnalyticsEvent.getClass();
            C25113c cVar = MVAnalyticsEvent.f25871b;
            gVar.mo61687K();
            if (mVAnalyticsEvent.eventKey != null) {
                gVar.mo61711x(MVAnalyticsEvent.f25871b);
                gVar.mo61678B(mVAnalyticsEvent.eventKey.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAnalyticsEvent.f25872c);
            gVar.mo61679C(mVAnalyticsEvent.timestamp);
            gVar.mo61712y();
            if (mVAnalyticsEvent.attributes != null) {
                gVar.mo61711x(MVAnalyticsEvent.f25873d);
                gVar.mo61680D(new C25119e((byte) 12, mVAnalyticsEvent.attributes.size()));
                for (MVAnalyticsAttribute X0 : mVAnalyticsEvent.attributes) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAnalyticsEvent mVAnalyticsEvent = (MVAnalyticsEvent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAnalyticsEvent.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVAnalyticsEvent.attributes = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVAnalyticsAttribute mVAnalyticsAttribute = new MVAnalyticsAttribute();
                                mVAnalyticsAttribute.mo25201C1(gVar);
                                mVAnalyticsEvent.attributes.add(mVAnalyticsAttribute);
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVAnalyticsEvent.timestamp = gVar.mo61697j();
                        mVAnalyticsEvent.mo27647i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAnalyticsEvent.eventKey = MVAnalyticsEventKey.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVAnalyticsEvent$b */
    public static class C8880b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8879a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVAnalyticsEvent$c */
    public static class C8881c extends C25240d<MVAnalyticsEvent> {
        public C8881c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAnalyticsEvent mVAnalyticsEvent = (MVAnalyticsEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAnalyticsEvent.mo27644g()) {
                bitSet.set(0);
            }
            if (mVAnalyticsEvent.mo27645h()) {
                bitSet.set(1);
            }
            if (mVAnalyticsEvent.mo27643f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAnalyticsEvent.mo27644g()) {
                jVar.mo61678B(mVAnalyticsEvent.eventKey.getValue());
            }
            if (mVAnalyticsEvent.mo27645h()) {
                jVar.mo61679C(mVAnalyticsEvent.timestamp);
            }
            if (mVAnalyticsEvent.mo27643f()) {
                jVar.mo61678B(mVAnalyticsEvent.attributes.size());
                for (MVAnalyticsAttribute X0 : mVAnalyticsEvent.attributes) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAnalyticsEvent mVAnalyticsEvent = (MVAnalyticsEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVAnalyticsEvent.eventKey = MVAnalyticsEventKey.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVAnalyticsEvent.timestamp = jVar.mo61697j();
                mVAnalyticsEvent.mo27647i();
            }
            if (T.get(2)) {
                int i = jVar.mo61696i();
                mVAnalyticsEvent.attributes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAnalyticsAttribute mVAnalyticsAttribute = new MVAnalyticsAttribute();
                    mVAnalyticsAttribute.mo25201C1(jVar);
                    mVAnalyticsEvent.attributes.add(mVAnalyticsAttribute);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVAnalyticsEvent$d */
    public static class C8882d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8881c(0);
        }
    }

    static {
        new C17394d0("MVAnalyticsEvent");
        HashMap hashMap = new HashMap();
        f25874e = hashMap;
        hashMap.put(C25239c.class, new C8880b());
        hashMap.put(C25240d.class, new C8882d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EVENT_KEY, new FieldMetaData("eventKey", (byte) 3, new EnumMetaData(MVAnalyticsEventKey.class)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ATTRIBUTES, new FieldMetaData("attributes", (byte) 3, new ListMetaData(new StructMetaData(MVAnalyticsAttribute.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25875f = unmodifiableMap;
        FieldMetaData.m61947a(MVAnalyticsEvent.class, unmodifiableMap);
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
        ((C25238b) f25874e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25874e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVAnalyticsEvent mVAnalyticsEvent = (MVAnalyticsEvent) obj;
        if (!getClass().equals(mVAnalyticsEvent.getClass())) {
            return getClass().getName().compareTo(mVAnalyticsEvent.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27644g()).compareTo(Boolean.valueOf(mVAnalyticsEvent.mo27644g()));
        if (compareTo != 0 || ((mo27644g() && (compareTo = this.eventKey.compareTo(mVAnalyticsEvent.eventKey)) != 0) || (compareTo = Boolean.valueOf(mo27645h()).compareTo(Boolean.valueOf(mVAnalyticsEvent.mo27645h()))) != 0 || ((mo27645h() && (compareTo = C25082a.m62840d(this.timestamp, mVAnalyticsEvent.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27643f()).compareTo(Boolean.valueOf(mVAnalyticsEvent.mo27643f()))) != 0))) {
            return compareTo;
        }
        if (!mo27643f() || (h = C25082a.m62844h(this.attributes, mVAnalyticsEvent.attributes)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAnalyticsEvent)) {
            return false;
        }
        MVAnalyticsEvent mVAnalyticsEvent = (MVAnalyticsEvent) obj;
        boolean g = mo27644g();
        boolean g2 = mVAnalyticsEvent.mo27644g();
        if (((g || g2) && (!g || !g2 || !this.eventKey.equals(mVAnalyticsEvent.eventKey))) || this.timestamp != mVAnalyticsEvent.timestamp) {
            return false;
        }
        boolean f = mo27643f();
        boolean f2 = mVAnalyticsEvent.mo27643f();
        if ((f || f2) && (!f || !f2 || !this.attributes.equals(mVAnalyticsEvent.attributes))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27643f() {
        return this.attributes != null;
    }

    /* renamed from: g */
    public final boolean mo27644g() {
        return this.eventKey != null;
    }

    /* renamed from: h */
    public final boolean mo27645h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27647i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAnalyticsEvent(", "eventKey:");
        MVAnalyticsEventKey mVAnalyticsEventKey = this.eventKey;
        if (mVAnalyticsEventKey == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAnalyticsEventKey);
        }
        n.append(", ");
        n.append("timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "attributes:");
        List<MVAnalyticsAttribute> list = this.attributes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
