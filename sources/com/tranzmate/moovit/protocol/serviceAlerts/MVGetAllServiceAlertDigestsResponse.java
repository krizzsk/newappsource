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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
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

public class MVGetAllServiceAlertDigestsResponse implements TBase<MVGetAllServiceAlertDigestsResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetAllServiceAlertDigestsResponse> {

    /* renamed from: b */
    public static final C25113c f28231b = new C25113c("metroAlerts", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28232c = new C25113c("alertsForAgency", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f28233d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28234e;
    public List<MVServiceAlertsForAgency> alertsForAgency;
    public List<MVServiceAlertDigest> metroAlerts;

    public enum _Fields implements C25085c {
        METRO_ALERTS(1, "metroAlerts"),
        ALERTS_FOR_AGENCY(2, "alertsForAgency");
        
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
                return METRO_ALERTS;
            }
            if (i != 2) {
                return null;
            }
            return ALERTS_FOR_AGENCY;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetAllServiceAlertDigestsResponse$a */
    public static class C10455a extends C25239c<MVGetAllServiceAlertDigestsResponse> {
        public C10455a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetAllServiceAlertDigestsResponse mVGetAllServiceAlertDigestsResponse = (MVGetAllServiceAlertDigestsResponse) tBase;
            mVGetAllServiceAlertDigestsResponse.getClass();
            C25113c cVar = MVGetAllServiceAlertDigestsResponse.f28231b;
            gVar.mo61687K();
            if (mVGetAllServiceAlertDigestsResponse.metroAlerts != null) {
                gVar.mo61711x(MVGetAllServiceAlertDigestsResponse.f28231b);
                gVar.mo61680D(new C25119e((byte) 12, mVGetAllServiceAlertDigestsResponse.metroAlerts.size()));
                for (MVServiceAlertDigest X0 : mVGetAllServiceAlertDigestsResponse.metroAlerts) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVGetAllServiceAlertDigestsResponse.alertsForAgency != null) {
                gVar.mo61711x(MVGetAllServiceAlertDigestsResponse.f28232c);
                gVar.mo61680D(new C25119e((byte) 12, mVGetAllServiceAlertDigestsResponse.alertsForAgency.size()));
                for (MVServiceAlertsForAgency X02 : mVGetAllServiceAlertDigestsResponse.alertsForAgency) {
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
            MVGetAllServiceAlertDigestsResponse mVGetAllServiceAlertDigestsResponse = (MVGetAllServiceAlertDigestsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGetAllServiceAlertDigestsResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVGetAllServiceAlertDigestsResponse.alertsForAgency = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            MVServiceAlertsForAgency mVServiceAlertsForAgency = new MVServiceAlertsForAgency();
                            mVServiceAlertsForAgency.mo25201C1(gVar);
                            mVGetAllServiceAlertDigestsResponse.alertsForAgency.add(mVServiceAlertsForAgency);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVGetAllServiceAlertDigestsResponse.metroAlerts = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVServiceAlertDigest mVServiceAlertDigest = new MVServiceAlertDigest();
                        mVServiceAlertDigest.mo25201C1(gVar);
                        mVGetAllServiceAlertDigestsResponse.metroAlerts.add(mVServiceAlertDigest);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetAllServiceAlertDigestsResponse$b */
    public static class C10456b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10455a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetAllServiceAlertDigestsResponse$c */
    public static class C10457c extends C25240d<MVGetAllServiceAlertDigestsResponse> {
        public C10457c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetAllServiceAlertDigestsResponse mVGetAllServiceAlertDigestsResponse = (MVGetAllServiceAlertDigestsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetAllServiceAlertDigestsResponse.mo31566g()) {
                bitSet.set(0);
            }
            if (mVGetAllServiceAlertDigestsResponse.mo31565f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGetAllServiceAlertDigestsResponse.mo31566g()) {
                jVar.mo61678B(mVGetAllServiceAlertDigestsResponse.metroAlerts.size());
                for (MVServiceAlertDigest X0 : mVGetAllServiceAlertDigestsResponse.metroAlerts) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVGetAllServiceAlertDigestsResponse.mo31565f()) {
                jVar.mo61678B(mVGetAllServiceAlertDigestsResponse.alertsForAgency.size());
                for (MVServiceAlertsForAgency X02 : mVGetAllServiceAlertDigestsResponse.alertsForAgency) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetAllServiceAlertDigestsResponse mVGetAllServiceAlertDigestsResponse = (MVGetAllServiceAlertDigestsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVGetAllServiceAlertDigestsResponse.metroAlerts = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVServiceAlertDigest mVServiceAlertDigest = new MVServiceAlertDigest();
                    mVServiceAlertDigest.mo25201C1(jVar);
                    mVGetAllServiceAlertDigestsResponse.metroAlerts.add(mVServiceAlertDigest);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVGetAllServiceAlertDigestsResponse.alertsForAgency = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVServiceAlertsForAgency mVServiceAlertsForAgency = new MVServiceAlertsForAgency();
                    mVServiceAlertsForAgency.mo25201C1(jVar);
                    mVGetAllServiceAlertDigestsResponse.alertsForAgency.add(mVServiceAlertsForAgency);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVGetAllServiceAlertDigestsResponse$d */
    public static class C10458d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10457c(0);
        }
    }

    static {
        new C17394d0("MVGetAllServiceAlertDigestsResponse");
        HashMap hashMap = new HashMap();
        f28233d = hashMap;
        hashMap.put(C25239c.class, new C10456b());
        hashMap.put(C25240d.class, new C10458d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.METRO_ALERTS, new FieldMetaData("metroAlerts", (byte) 3, new ListMetaData(new StructMetaData(MVServiceAlertDigest.class))));
        enumMap.put(_Fields.ALERTS_FOR_AGENCY, new FieldMetaData("alertsForAgency", (byte) 3, new ListMetaData(new StructMetaData(MVServiceAlertsForAgency.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28234e = unmodifiableMap;
        FieldMetaData.m61947a(MVGetAllServiceAlertDigestsResponse.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f28233d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28233d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVGetAllServiceAlertDigestsResponse mVGetAllServiceAlertDigestsResponse = (MVGetAllServiceAlertDigestsResponse) obj;
        if (!getClass().equals(mVGetAllServiceAlertDigestsResponse.getClass())) {
            return getClass().getName().compareTo(mVGetAllServiceAlertDigestsResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31566g()).compareTo(Boolean.valueOf(mVGetAllServiceAlertDigestsResponse.mo31566g()));
        if (compareTo != 0 || ((mo31566g() && (compareTo = C25082a.m62844h(this.metroAlerts, mVGetAllServiceAlertDigestsResponse.metroAlerts)) != 0) || (compareTo = Boolean.valueOf(mo31565f()).compareTo(Boolean.valueOf(mVGetAllServiceAlertDigestsResponse.mo31565f()))) != 0)) {
            return compareTo;
        }
        if (!mo31565f() || (h = C25082a.m62844h(this.alertsForAgency, mVGetAllServiceAlertDigestsResponse.alertsForAgency)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetAllServiceAlertDigestsResponse)) {
            return false;
        }
        MVGetAllServiceAlertDigestsResponse mVGetAllServiceAlertDigestsResponse = (MVGetAllServiceAlertDigestsResponse) obj;
        boolean g = mo31566g();
        boolean g2 = mVGetAllServiceAlertDigestsResponse.mo31566g();
        if ((g || g2) && (!g || !g2 || !this.metroAlerts.equals(mVGetAllServiceAlertDigestsResponse.metroAlerts))) {
            return false;
        }
        boolean f = mo31565f();
        boolean f2 = mVGetAllServiceAlertDigestsResponse.mo31565f();
        if ((f || f2) && (!f || !f2 || !this.alertsForAgency.equals(mVGetAllServiceAlertDigestsResponse.alertsForAgency))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31565f() {
        return this.alertsForAgency != null;
    }

    /* renamed from: g */
    public final boolean mo31566g() {
        return this.metroAlerts != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetAllServiceAlertDigestsResponse(", "metroAlerts:");
        List<MVServiceAlertDigest> list = this.metroAlerts;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("alertsForAgency:");
        List<MVServiceAlertsForAgency> list2 = this.alertsForAgency;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
