package com.tranzmate.moovit.protocol.serviceAlerts;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
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

public class MVServiceAlertSubscriptionLine implements TBase<MVServiceAlertSubscriptionLine, _Fields>, Serializable, Cloneable, Comparable<MVServiceAlertSubscriptionLine> {

    /* renamed from: b */
    public static final C25113c f28284b = new C25113c("lineGroupIds", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28285c = new C25113c("stopId", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f28286d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28287e;
    private byte __isset_bitfield = 0;
    public List<Integer> lineGroupIds;
    private _Fields[] optionals = {_Fields.STOP_ID};
    public int stopId;

    public enum _Fields implements C25085c {
        LINE_GROUP_IDS(1, "lineGroupIds"),
        STOP_ID(2, "stopId");
        
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
                return LINE_GROUP_IDS;
            }
            if (i != 2) {
                return null;
            }
            return STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertSubscriptionLine$a */
    public static class C10499a extends C25239c<MVServiceAlertSubscriptionLine> {
        public C10499a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine = (MVServiceAlertSubscriptionLine) tBase;
            mVServiceAlertSubscriptionLine.getClass();
            C25113c cVar = MVServiceAlertSubscriptionLine.f28284b;
            gVar.mo61687K();
            if (mVServiceAlertSubscriptionLine.lineGroupIds != null) {
                gVar.mo61711x(MVServiceAlertSubscriptionLine.f28284b);
                gVar.mo61680D(new C25119e((byte) 8, mVServiceAlertSubscriptionLine.lineGroupIds.size()));
                for (Integer intValue : mVServiceAlertSubscriptionLine.lineGroupIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVServiceAlertSubscriptionLine.mo31664g()) {
                gVar.mo61711x(MVServiceAlertSubscriptionLine.f28285c);
                gVar.mo61678B(mVServiceAlertSubscriptionLine.stopId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine = (MVServiceAlertSubscriptionLine) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVServiceAlertSubscriptionLine.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVServiceAlertSubscriptionLine.stopId = gVar.mo61696i();
                        mVServiceAlertSubscriptionLine.mo31665h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVServiceAlertSubscriptionLine.lineGroupIds = new ArrayList(k.f63395b);
                    int i = 0;
                    while (i < k.f63395b) {
                        i = C13437d.m33701f(gVar.mo61696i(), mVServiceAlertSubscriptionLine.lineGroupIds, i, 1);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertSubscriptionLine$b */
    public static class C10500b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10499a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertSubscriptionLine$c */
    public static class C10501c extends C25240d<MVServiceAlertSubscriptionLine> {
        public C10501c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine = (MVServiceAlertSubscriptionLine) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVServiceAlertSubscriptionLine.mo31663f()) {
                bitSet.set(0);
            }
            if (mVServiceAlertSubscriptionLine.mo31664g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVServiceAlertSubscriptionLine.mo31663f()) {
                jVar.mo61678B(mVServiceAlertSubscriptionLine.lineGroupIds.size());
                for (Integer intValue : mVServiceAlertSubscriptionLine.lineGroupIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVServiceAlertSubscriptionLine.mo31664g()) {
                jVar.mo61678B(mVServiceAlertSubscriptionLine.stopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine = (MVServiceAlertSubscriptionLine) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVServiceAlertSubscriptionLine.lineGroupIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2 = C13437d.m33701f(jVar.mo61696i(), mVServiceAlertSubscriptionLine.lineGroupIds, i2, 1)) {
                }
            }
            if (T.get(1)) {
                mVServiceAlertSubscriptionLine.stopId = jVar.mo61696i();
                mVServiceAlertSubscriptionLine.mo31665h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertSubscriptionLine$d */
    public static class C10502d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10501c(0);
        }
    }

    static {
        new C17394d0("MVServiceAlertSubscriptionLine");
        HashMap hashMap = new HashMap();
        f28286d = hashMap;
        hashMap.put(C25239c.class, new C10500b());
        hashMap.put(C25240d.class, new C10502d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_GROUP_IDS, new FieldMetaData("lineGroupIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28287e = unmodifiableMap;
        FieldMetaData.m61947a(MVServiceAlertSubscriptionLine.class, unmodifiableMap);
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
        ((C25238b) f28286d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28286d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31660a(MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine) {
        if (mVServiceAlertSubscriptionLine == null) {
            return false;
        }
        boolean f = mo31663f();
        boolean f2 = mVServiceAlertSubscriptionLine.mo31663f();
        if ((f || f2) && (!f || !f2 || !this.lineGroupIds.equals(mVServiceAlertSubscriptionLine.lineGroupIds))) {
            return false;
        }
        boolean g = mo31664g();
        boolean g2 = mVServiceAlertSubscriptionLine.mo31664g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || this.stopId != mVServiceAlertSubscriptionLine.stopId) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVServiceAlertSubscriptionLine mVServiceAlertSubscriptionLine = (MVServiceAlertSubscriptionLine) obj;
        if (!getClass().equals(mVServiceAlertSubscriptionLine.getClass())) {
            return getClass().getName().compareTo(mVServiceAlertSubscriptionLine.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31663f()).compareTo(Boolean.valueOf(mVServiceAlertSubscriptionLine.mo31663f()));
        if (compareTo != 0 || ((mo31663f() && (compareTo = C25082a.m62844h(this.lineGroupIds, mVServiceAlertSubscriptionLine.lineGroupIds)) != 0) || (compareTo = Boolean.valueOf(mo31664g()).compareTo(Boolean.valueOf(mVServiceAlertSubscriptionLine.mo31664g()))) != 0)) {
            return compareTo;
        }
        if (!mo31664g() || (c = C25082a.m62839c(this.stopId, mVServiceAlertSubscriptionLine.stopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVServiceAlertSubscriptionLine)) {
            return mo31660a((MVServiceAlertSubscriptionLine) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31663f() {
        return this.lineGroupIds != null;
    }

    /* renamed from: g */
    public final boolean mo31664g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo31665h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVServiceAlertSubscriptionLine(", "lineGroupIds:");
        List<Integer> list = this.lineGroupIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo31664g()) {
            n.append(", ");
            n.append("stopId:");
            n.append(this.stopId);
        }
        n.append(")");
        return n.toString();
    }
}
