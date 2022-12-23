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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVServiceAlertsForAgency implements TBase<MVServiceAlertsForAgency, _Fields>, Serializable, Cloneable, Comparable<MVServiceAlertsForAgency> {

    /* renamed from: b */
    public static final C25113c f28288b = new C25113c("agencyId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28289c = new C25113c("lineAlerts", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f28290d = new C25113c("agencyAlerts", (byte) 15, 3);

    /* renamed from: e */
    public static final HashMap f28291e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28292f;
    private byte __isset_bitfield = 0;
    public List<MVServiceAlertDigest> agencyAlerts;
    public int agencyId;
    public List<MVLineAlertDigest> lineAlerts;

    public enum _Fields implements C25085c {
        AGENCY_ID(1, "agencyId"),
        LINE_ALERTS(2, "lineAlerts"),
        AGENCY_ALERTS(3, "agencyAlerts");
        
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
                return AGENCY_ID;
            }
            if (i == 2) {
                return LINE_ALERTS;
            }
            if (i != 3) {
                return null;
            }
            return AGENCY_ALERTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertsForAgency$a */
    public static class C10503a extends C25239c<MVServiceAlertsForAgency> {
        public C10503a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertsForAgency mVServiceAlertsForAgency = (MVServiceAlertsForAgency) tBase;
            mVServiceAlertsForAgency.getClass();
            C25113c cVar = MVServiceAlertsForAgency.f28288b;
            gVar.mo61687K();
            gVar.mo61711x(MVServiceAlertsForAgency.f28288b);
            gVar.mo61678B(mVServiceAlertsForAgency.agencyId);
            gVar.mo61712y();
            if (mVServiceAlertsForAgency.lineAlerts != null) {
                gVar.mo61711x(MVServiceAlertsForAgency.f28289c);
                gVar.mo61680D(new C25119e((byte) 12, mVServiceAlertsForAgency.lineAlerts.size()));
                for (MVLineAlertDigest X0 : mVServiceAlertsForAgency.lineAlerts) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVServiceAlertsForAgency.agencyAlerts != null) {
                gVar.mo61711x(MVServiceAlertsForAgency.f28290d);
                gVar.mo61680D(new C25119e((byte) 12, mVServiceAlertsForAgency.agencyAlerts.size()));
                for (MVServiceAlertDigest X02 : mVServiceAlertsForAgency.agencyAlerts) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertsForAgency mVServiceAlertsForAgency = (MVServiceAlertsForAgency) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVServiceAlertsForAgency.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    int i = 0;
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 15) {
                            C25119e k = gVar.mo61698k();
                            mVServiceAlertsForAgency.agencyAlerts = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVServiceAlertDigest mVServiceAlertDigest = new MVServiceAlertDigest();
                                mVServiceAlertDigest.mo25201C1(gVar);
                                mVServiceAlertsForAgency.agencyAlerts.add(mVServiceAlertDigest);
                                i++;
                            }
                            gVar.mo61699l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k2 = gVar.mo61698k();
                        mVServiceAlertsForAgency.lineAlerts = new ArrayList(k2.f63395b);
                        while (i < k2.f63395b) {
                            MVLineAlertDigest mVLineAlertDigest = new MVLineAlertDigest();
                            mVLineAlertDigest.mo25201C1(gVar);
                            mVServiceAlertsForAgency.lineAlerts.add(mVLineAlertDigest);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVServiceAlertsForAgency.agencyId = gVar.mo61696i();
                    mVServiceAlertsForAgency.mo31675i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertsForAgency$b */
    public static class C10504b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10503a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertsForAgency$c */
    public static class C10505c extends C25240d<MVServiceAlertsForAgency> {
        public C10505c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertsForAgency mVServiceAlertsForAgency = (MVServiceAlertsForAgency) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVServiceAlertsForAgency.mo31672g()) {
                bitSet.set(0);
            }
            if (mVServiceAlertsForAgency.mo31673h()) {
                bitSet.set(1);
            }
            if (mVServiceAlertsForAgency.mo31671f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVServiceAlertsForAgency.mo31672g()) {
                jVar.mo61678B(mVServiceAlertsForAgency.agencyId);
            }
            if (mVServiceAlertsForAgency.mo31673h()) {
                jVar.mo61678B(mVServiceAlertsForAgency.lineAlerts.size());
                for (MVLineAlertDigest X0 : mVServiceAlertsForAgency.lineAlerts) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVServiceAlertsForAgency.mo31671f()) {
                jVar.mo61678B(mVServiceAlertsForAgency.agencyAlerts.size());
                for (MVServiceAlertDigest X02 : mVServiceAlertsForAgency.agencyAlerts) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertsForAgency mVServiceAlertsForAgency = (MVServiceAlertsForAgency) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVServiceAlertsForAgency.agencyId = jVar.mo61696i();
                mVServiceAlertsForAgency.mo31675i();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVServiceAlertsForAgency.lineAlerts = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLineAlertDigest mVLineAlertDigest = new MVLineAlertDigest();
                    mVLineAlertDigest.mo25201C1(jVar);
                    mVServiceAlertsForAgency.lineAlerts.add(mVLineAlertDigest);
                }
            }
            if (T.get(2)) {
                int i3 = jVar.mo61696i();
                mVServiceAlertsForAgency.agencyAlerts = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVServiceAlertDigest mVServiceAlertDigest = new MVServiceAlertDigest();
                    mVServiceAlertDigest.mo25201C1(jVar);
                    mVServiceAlertsForAgency.agencyAlerts.add(mVServiceAlertDigest);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertsForAgency$d */
    public static class C10506d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10505c(0);
        }
    }

    static {
        new C17394d0("MVServiceAlertsForAgency");
        HashMap hashMap = new HashMap();
        f28291e = hashMap;
        hashMap.put(C25239c.class, new C10504b());
        hashMap.put(C25240d.class, new C10506d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_ALERTS, new FieldMetaData("lineAlerts", (byte) 3, new ListMetaData(new StructMetaData(MVLineAlertDigest.class))));
        enumMap.put(_Fields.AGENCY_ALERTS, new FieldMetaData("agencyAlerts", (byte) 3, new ListMetaData(new StructMetaData(MVServiceAlertDigest.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28292f = unmodifiableMap;
        FieldMetaData.m61947a(MVServiceAlertsForAgency.class, unmodifiableMap);
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
        ((C25238b) f28291e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28291e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVServiceAlertsForAgency mVServiceAlertsForAgency = (MVServiceAlertsForAgency) obj;
        if (!getClass().equals(mVServiceAlertsForAgency.getClass())) {
            return getClass().getName().compareTo(mVServiceAlertsForAgency.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31672g()).compareTo(Boolean.valueOf(mVServiceAlertsForAgency.mo31672g()));
        if (compareTo != 0 || ((mo31672g() && (compareTo = C25082a.m62839c(this.agencyId, mVServiceAlertsForAgency.agencyId)) != 0) || (compareTo = Boolean.valueOf(mo31673h()).compareTo(Boolean.valueOf(mVServiceAlertsForAgency.mo31673h()))) != 0 || ((mo31673h() && (compareTo = C25082a.m62844h(this.lineAlerts, mVServiceAlertsForAgency.lineAlerts)) != 0) || (compareTo = Boolean.valueOf(mo31671f()).compareTo(Boolean.valueOf(mVServiceAlertsForAgency.mo31671f()))) != 0))) {
            return compareTo;
        }
        if (!mo31671f() || (h = C25082a.m62844h(this.agencyAlerts, mVServiceAlertsForAgency.agencyAlerts)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVServiceAlertsForAgency)) {
            return false;
        }
        MVServiceAlertsForAgency mVServiceAlertsForAgency = (MVServiceAlertsForAgency) obj;
        if (this.agencyId != mVServiceAlertsForAgency.agencyId) {
            return false;
        }
        boolean h = mo31673h();
        boolean h2 = mVServiceAlertsForAgency.mo31673h();
        if ((h || h2) && (!h || !h2 || !this.lineAlerts.equals(mVServiceAlertsForAgency.lineAlerts))) {
            return false;
        }
        boolean f = mo31671f();
        boolean f2 = mVServiceAlertsForAgency.mo31671f();
        if ((f || f2) && (!f || !f2 || !this.agencyAlerts.equals(mVServiceAlertsForAgency.agencyAlerts))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31671f() {
        return this.agencyAlerts != null;
    }

    /* renamed from: g */
    public final boolean mo31672g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo31673h() {
        return this.lineAlerts != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31675i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVServiceAlertsForAgency(", "agencyId:");
        C0016g.m42z(n, this.agencyId, ", ", "lineAlerts:");
        List<MVLineAlertDigest> list = this.lineAlerts;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("agencyAlerts:");
        List<MVServiceAlertDigest> list2 = this.agencyAlerts;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
