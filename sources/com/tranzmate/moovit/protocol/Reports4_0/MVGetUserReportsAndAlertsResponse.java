package com.tranzmate.moovit.protocol.Reports4_0;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails;
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

public class MVGetUserReportsAndAlertsResponse implements TBase<MVGetUserReportsAndAlertsResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetUserReportsAndAlertsResponse> {

    /* renamed from: b */
    public static final C25113c f24539b = new C25113c("reports", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f24540c = new C25113c("lineAlerts", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f24541d = new C25113c("nextPageId", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f24542e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24543f;
    public List<MVServiceAlertDetails> lineAlerts;
    public String nextPageId;
    private _Fields[] optionals = {_Fields.NEXT_PAGE_ID};
    public List<MVUserReport> reports;

    public enum _Fields implements C25085c {
        REPORTS(1, "reports"),
        LINE_ALERTS(2, "lineAlerts"),
        NEXT_PAGE_ID(3, "nextPageId");
        
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
                return REPORTS;
            }
            if (i == 2) {
                return LINE_ALERTS;
            }
            if (i != 3) {
                return null;
            }
            return NEXT_PAGE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsResponse$a */
    public static class C8089a extends C25239c<MVGetUserReportsAndAlertsResponse> {
        public C8089a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetUserReportsAndAlertsResponse mVGetUserReportsAndAlertsResponse = (MVGetUserReportsAndAlertsResponse) tBase;
            mVGetUserReportsAndAlertsResponse.getClass();
            C25113c cVar = MVGetUserReportsAndAlertsResponse.f24539b;
            gVar.mo61687K();
            if (mVGetUserReportsAndAlertsResponse.reports != null) {
                gVar.mo61711x(MVGetUserReportsAndAlertsResponse.f24539b);
                gVar.mo61680D(new C25119e((byte) 12, mVGetUserReportsAndAlertsResponse.reports.size()));
                for (MVUserReport X0 : mVGetUserReportsAndAlertsResponse.reports) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVGetUserReportsAndAlertsResponse.lineAlerts != null) {
                gVar.mo61711x(MVGetUserReportsAndAlertsResponse.f24540c);
                gVar.mo61680D(new C25119e((byte) 12, mVGetUserReportsAndAlertsResponse.lineAlerts.size()));
                for (MVServiceAlertDetails X02 : mVGetUserReportsAndAlertsResponse.lineAlerts) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVGetUserReportsAndAlertsResponse.nextPageId != null && mVGetUserReportsAndAlertsResponse.mo25282g()) {
                gVar.mo61711x(MVGetUserReportsAndAlertsResponse.f24541d);
                gVar.mo61686J(mVGetUserReportsAndAlertsResponse.nextPageId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetUserReportsAndAlertsResponse mVGetUserReportsAndAlertsResponse = (MVGetUserReportsAndAlertsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGetUserReportsAndAlertsResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVGetUserReportsAndAlertsResponse.nextPageId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVGetUserReportsAndAlertsResponse.lineAlerts = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            MVServiceAlertDetails mVServiceAlertDetails = new MVServiceAlertDetails();
                            mVServiceAlertDetails.mo25201C1(gVar);
                            mVGetUserReportsAndAlertsResponse.lineAlerts.add(mVServiceAlertDetails);
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVGetUserReportsAndAlertsResponse.reports = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVUserReport mVUserReport = new MVUserReport();
                        mVUserReport.mo25201C1(gVar);
                        mVGetUserReportsAndAlertsResponse.reports.add(mVUserReport);
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsResponse$b */
    public static class C8090b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8089a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsResponse$c */
    public static class C8091c extends C25240d<MVGetUserReportsAndAlertsResponse> {
        public C8091c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetUserReportsAndAlertsResponse mVGetUserReportsAndAlertsResponse = (MVGetUserReportsAndAlertsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetUserReportsAndAlertsResponse.mo25283h()) {
                bitSet.set(0);
            }
            if (mVGetUserReportsAndAlertsResponse.mo25281f()) {
                bitSet.set(1);
            }
            if (mVGetUserReportsAndAlertsResponse.mo25282g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVGetUserReportsAndAlertsResponse.mo25283h()) {
                jVar.mo61678B(mVGetUserReportsAndAlertsResponse.reports.size());
                for (MVUserReport X0 : mVGetUserReportsAndAlertsResponse.reports) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVGetUserReportsAndAlertsResponse.mo25281f()) {
                jVar.mo61678B(mVGetUserReportsAndAlertsResponse.lineAlerts.size());
                for (MVServiceAlertDetails X02 : mVGetUserReportsAndAlertsResponse.lineAlerts) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVGetUserReportsAndAlertsResponse.mo25282g()) {
                jVar.mo61686J(mVGetUserReportsAndAlertsResponse.nextPageId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetUserReportsAndAlertsResponse mVGetUserReportsAndAlertsResponse = (MVGetUserReportsAndAlertsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVGetUserReportsAndAlertsResponse.reports = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVUserReport mVUserReport = new MVUserReport();
                    mVUserReport.mo25201C1(jVar);
                    mVGetUserReportsAndAlertsResponse.reports.add(mVUserReport);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVGetUserReportsAndAlertsResponse.lineAlerts = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVServiceAlertDetails mVServiceAlertDetails = new MVServiceAlertDetails();
                    mVServiceAlertDetails.mo25201C1(jVar);
                    mVGetUserReportsAndAlertsResponse.lineAlerts.add(mVServiceAlertDetails);
                }
            }
            if (T.get(2)) {
                mVGetUserReportsAndAlertsResponse.nextPageId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVGetUserReportsAndAlertsResponse$d */
    public static class C8092d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8091c(0);
        }
    }

    static {
        new C17394d0("MVGetUserReportsAndAlertsResponse");
        HashMap hashMap = new HashMap();
        f24542e = hashMap;
        hashMap.put(C25239c.class, new C8090b());
        hashMap.put(C25240d.class, new C8092d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REPORTS, new FieldMetaData("reports", (byte) 3, new ListMetaData(new StructMetaData(MVUserReport.class))));
        enumMap.put(_Fields.LINE_ALERTS, new FieldMetaData("lineAlerts", (byte) 3, new ListMetaData(new StructMetaData(MVServiceAlertDetails.class))));
        enumMap.put(_Fields.NEXT_PAGE_ID, new FieldMetaData("nextPageId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24543f = unmodifiableMap;
        FieldMetaData.m61947a(MVGetUserReportsAndAlertsResponse.class, unmodifiableMap);
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
        ((C25238b) f24542e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24542e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGetUserReportsAndAlertsResponse mVGetUserReportsAndAlertsResponse = (MVGetUserReportsAndAlertsResponse) obj;
        if (!getClass().equals(mVGetUserReportsAndAlertsResponse.getClass())) {
            return getClass().getName().compareTo(mVGetUserReportsAndAlertsResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25283h()).compareTo(Boolean.valueOf(mVGetUserReportsAndAlertsResponse.mo25283h()));
        if (compareTo2 != 0 || ((mo25283h() && (compareTo2 = C25082a.m62844h(this.reports, mVGetUserReportsAndAlertsResponse.reports)) != 0) || (compareTo2 = Boolean.valueOf(mo25281f()).compareTo(Boolean.valueOf(mVGetUserReportsAndAlertsResponse.mo25281f()))) != 0 || ((mo25281f() && (compareTo2 = C25082a.m62844h(this.lineAlerts, mVGetUserReportsAndAlertsResponse.lineAlerts)) != 0) || (compareTo2 = Boolean.valueOf(mo25282g()).compareTo(Boolean.valueOf(mVGetUserReportsAndAlertsResponse.mo25282g()))) != 0))) {
            return compareTo2;
        }
        if (!mo25282g() || (compareTo = this.nextPageId.compareTo(mVGetUserReportsAndAlertsResponse.nextPageId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetUserReportsAndAlertsResponse)) {
            return false;
        }
        MVGetUserReportsAndAlertsResponse mVGetUserReportsAndAlertsResponse = (MVGetUserReportsAndAlertsResponse) obj;
        boolean h = mo25283h();
        boolean h2 = mVGetUserReportsAndAlertsResponse.mo25283h();
        if ((h || h2) && (!h || !h2 || !this.reports.equals(mVGetUserReportsAndAlertsResponse.reports))) {
            return false;
        }
        boolean f = mo25281f();
        boolean f2 = mVGetUserReportsAndAlertsResponse.mo25281f();
        if ((f || f2) && (!f || !f2 || !this.lineAlerts.equals(mVGetUserReportsAndAlertsResponse.lineAlerts))) {
            return false;
        }
        boolean g = mo25282g();
        boolean g2 = mVGetUserReportsAndAlertsResponse.mo25282g();
        if ((g || g2) && (!g || !g2 || !this.nextPageId.equals(mVGetUserReportsAndAlertsResponse.nextPageId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25281f() {
        return this.lineAlerts != null;
    }

    /* renamed from: g */
    public final boolean mo25282g() {
        return this.nextPageId != null;
    }

    /* renamed from: h */
    public final boolean mo25283h() {
        return this.reports != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetUserReportsAndAlertsResponse(", "reports:");
        List<MVUserReport> list = this.reports;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("lineAlerts:");
        List<MVServiceAlertDetails> list2 = this.lineAlerts;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        if (mo25282g()) {
            n.append(", ");
            n.append("nextPageId:");
            String str = this.nextPageId;
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
