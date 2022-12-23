package com.tranzmate.moovit.protocol.Reports4_0;

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
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVUsersReportsForRedshift implements TBase<MVUsersReportsForRedshift, _Fields>, Serializable, Cloneable, Comparable<MVUsersReportsForRedshift> {

    /* renamed from: b */
    public static final C25113c f24582b = new C25113c("reportId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24583c = new C25113c("reportRequest", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f24584d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24585e;
    public String reportId;
    public MVCreateReportRequest reportRequest;

    public enum _Fields implements C25085c {
        REPORT_ID(1, "reportId"),
        REPORT_REQUEST(2, "reportRequest");
        
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
                return REPORT_ID;
            }
            if (i != 2) {
                return null;
            }
            return REPORT_REQUEST;
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsForRedshift$a */
    public static class C8121a extends C25239c<MVUsersReportsForRedshift> {
        public C8121a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUsersReportsForRedshift mVUsersReportsForRedshift = (MVUsersReportsForRedshift) tBase;
            MVCreateReportRequest mVCreateReportRequest = mVUsersReportsForRedshift.reportRequest;
            if (mVCreateReportRequest != null) {
                mVCreateReportRequest.mo25255i();
            }
            C25113c cVar = MVUsersReportsForRedshift.f24582b;
            gVar.mo61687K();
            if (mVUsersReportsForRedshift.reportId != null) {
                gVar.mo61711x(MVUsersReportsForRedshift.f24582b);
                gVar.mo61686J(mVUsersReportsForRedshift.reportId);
                gVar.mo61712y();
            }
            if (mVUsersReportsForRedshift.reportRequest != null) {
                gVar.mo61711x(MVUsersReportsForRedshift.f24583c);
                mVUsersReportsForRedshift.reportRequest.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUsersReportsForRedshift mVUsersReportsForRedshift = (MVUsersReportsForRedshift) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVCreateReportRequest mVCreateReportRequest = new MVCreateReportRequest();
                        mVUsersReportsForRedshift.reportRequest = mVCreateReportRequest;
                        mVCreateReportRequest.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVUsersReportsForRedshift.reportId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVCreateReportRequest mVCreateReportRequest2 = mVUsersReportsForRedshift.reportRequest;
            if (mVCreateReportRequest2 != null) {
                mVCreateReportRequest2.mo25255i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsForRedshift$b */
    public static class C8122b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8121a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsForRedshift$c */
    public static class C8123c extends C25240d<MVUsersReportsForRedshift> {
        public C8123c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUsersReportsForRedshift mVUsersReportsForRedshift = (MVUsersReportsForRedshift) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUsersReportsForRedshift.mo25359f()) {
                bitSet.set(0);
            }
            if (mVUsersReportsForRedshift.mo25360g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVUsersReportsForRedshift.mo25359f()) {
                jVar.mo61686J(mVUsersReportsForRedshift.reportId);
            }
            if (mVUsersReportsForRedshift.mo25360g()) {
                mVUsersReportsForRedshift.reportRequest.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUsersReportsForRedshift mVUsersReportsForRedshift = (MVUsersReportsForRedshift) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVUsersReportsForRedshift.reportId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCreateReportRequest mVCreateReportRequest = new MVCreateReportRequest();
                mVUsersReportsForRedshift.reportRequest = mVCreateReportRequest;
                mVCreateReportRequest.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsForRedshift$d */
    public static class C8124d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8123c(0);
        }
    }

    static {
        new C17394d0("MVUsersReportsForRedshift");
        HashMap hashMap = new HashMap();
        f24584d = hashMap;
        hashMap.put(C25239c.class, new C8122b());
        hashMap.put(C25240d.class, new C8124d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REPORT_ID, new FieldMetaData("reportId", (byte) 3, new FieldValueMetaData((byte) 11, "MVUserReportId")));
        enumMap.put(_Fields.REPORT_REQUEST, new FieldMetaData("reportRequest", (byte) 3, new StructMetaData(MVCreateReportRequest.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24585e = unmodifiableMap;
        FieldMetaData.m61947a(MVUsersReportsForRedshift.class, unmodifiableMap);
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
        ((C25238b) f24584d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24584d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUsersReportsForRedshift mVUsersReportsForRedshift = (MVUsersReportsForRedshift) obj;
        if (!getClass().equals(mVUsersReportsForRedshift.getClass())) {
            return getClass().getName().compareTo(mVUsersReportsForRedshift.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25359f()).compareTo(Boolean.valueOf(mVUsersReportsForRedshift.mo25359f()));
        if (compareTo2 != 0 || ((mo25359f() && (compareTo2 = this.reportId.compareTo(mVUsersReportsForRedshift.reportId)) != 0) || (compareTo2 = Boolean.valueOf(mo25360g()).compareTo(Boolean.valueOf(mVUsersReportsForRedshift.mo25360g()))) != 0)) {
            return compareTo2;
        }
        if (!mo25360g() || (compareTo = this.reportRequest.compareTo(mVUsersReportsForRedshift.reportRequest)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUsersReportsForRedshift)) {
            return false;
        }
        MVUsersReportsForRedshift mVUsersReportsForRedshift = (MVUsersReportsForRedshift) obj;
        boolean f = mo25359f();
        boolean f2 = mVUsersReportsForRedshift.mo25359f();
        if ((f || f2) && (!f || !f2 || !this.reportId.equals(mVUsersReportsForRedshift.reportId))) {
            return false;
        }
        boolean g = mo25360g();
        boolean g2 = mVUsersReportsForRedshift.mo25360g();
        if ((g || g2) && (!g || !g2 || !this.reportRequest.mo25248a(mVUsersReportsForRedshift.reportRequest))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25359f() {
        return this.reportId != null;
    }

    /* renamed from: g */
    public final boolean mo25360g() {
        return this.reportRequest != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUsersReportsForRedshift(", "reportId:");
        String str = this.reportId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("reportRequest:");
        MVCreateReportRequest mVCreateReportRequest = this.reportRequest;
        if (mVCreateReportRequest == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCreateReportRequest);
        }
        n.append(")");
        return n.toString();
    }
}
