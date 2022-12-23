package com.tranzmate.moovit.protocol.reports;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p001a0.C0016g;
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

public class MVPushNotificationReport implements TBase<MVPushNotificationReport, _Fields>, Serializable, Cloneable, Comparable<MVPushNotificationReport> {

    /* renamed from: b */
    public static final C25113c f27973b = new C25113c("pushId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27974c = new C25113c(ServerParameters.STATUS, (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f27975d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27976e;
    private byte __isset_bitfield = 0;
    public int pushId;
    public MVNotificationReportStatus status;

    public enum _Fields implements C25085c {
        PUSH_ID(1, "pushId"),
        STATUS(2, ServerParameters.STATUS);
        
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
                return PUSH_ID;
            }
            if (i != 2) {
                return null;
            }
            return STATUS;
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

    /* renamed from: com.tranzmate.moovit.protocol.reports.MVPushNotificationReport$a */
    public static class C10270a extends C25239c<MVPushNotificationReport> {
        public C10270a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationReport mVPushNotificationReport = (MVPushNotificationReport) tBase;
            mVPushNotificationReport.getClass();
            C25113c cVar = MVPushNotificationReport.f27973b;
            gVar.mo61687K();
            gVar.mo61711x(MVPushNotificationReport.f27973b);
            gVar.mo61678B(mVPushNotificationReport.pushId);
            gVar.mo61712y();
            if (mVPushNotificationReport.status != null) {
                gVar.mo61711x(MVPushNotificationReport.f27974c);
                gVar.mo61678B(mVPushNotificationReport.status.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationReport mVPushNotificationReport = (MVPushNotificationReport) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPushNotificationReport.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVPushNotificationReport.status = MVNotificationReportStatus.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPushNotificationReport.pushId = gVar.mo61696i();
                    mVPushNotificationReport.mo31097h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.reports.MVPushNotificationReport$b */
    public static class C10271b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10270a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.reports.MVPushNotificationReport$c */
    public static class C10272c extends C25240d<MVPushNotificationReport> {
        public C10272c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationReport mVPushNotificationReport = (MVPushNotificationReport) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPushNotificationReport.mo31095f()) {
                bitSet.set(0);
            }
            if (mVPushNotificationReport.mo31096g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPushNotificationReport.mo31095f()) {
                jVar.mo61678B(mVPushNotificationReport.pushId);
            }
            if (mVPushNotificationReport.mo31096g()) {
                jVar.mo61678B(mVPushNotificationReport.status.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPushNotificationReport mVPushNotificationReport = (MVPushNotificationReport) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPushNotificationReport.pushId = jVar.mo61696i();
                mVPushNotificationReport.mo31097h();
            }
            if (T.get(1)) {
                mVPushNotificationReport.status = MVNotificationReportStatus.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.reports.MVPushNotificationReport$d */
    public static class C10273d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10272c(0);
        }
    }

    static {
        new C17394d0("MVPushNotificationReport");
        HashMap hashMap = new HashMap();
        f27975d = hashMap;
        hashMap.put(C25239c.class, new C10271b());
        hashMap.put(C25240d.class, new C10273d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PUSH_ID, new FieldMetaData("pushId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVNotificationReportStatus.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27976e = unmodifiableMap;
        FieldMetaData.m61947a(MVPushNotificationReport.class, unmodifiableMap);
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
        ((C25238b) f27975d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27975d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPushNotificationReport mVPushNotificationReport = (MVPushNotificationReport) obj;
        if (!getClass().equals(mVPushNotificationReport.getClass())) {
            return getClass().getName().compareTo(mVPushNotificationReport.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31095f()).compareTo(Boolean.valueOf(mVPushNotificationReport.mo31095f()));
        if (compareTo2 != 0 || ((mo31095f() && (compareTo2 = C25082a.m62839c(this.pushId, mVPushNotificationReport.pushId)) != 0) || (compareTo2 = Boolean.valueOf(mo31096g()).compareTo(Boolean.valueOf(mVPushNotificationReport.mo31096g()))) != 0)) {
            return compareTo2;
        }
        if (!mo31096g() || (compareTo = this.status.compareTo(mVPushNotificationReport.status)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPushNotificationReport)) {
            return false;
        }
        MVPushNotificationReport mVPushNotificationReport = (MVPushNotificationReport) obj;
        if (this.pushId != mVPushNotificationReport.pushId) {
            return false;
        }
        boolean g = mo31096g();
        boolean g2 = mVPushNotificationReport.mo31096g();
        if ((g || g2) && (!g || !g2 || !this.status.equals(mVPushNotificationReport.status))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31095f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31096g() {
        return this.status != null;
    }

    /* renamed from: h */
    public final void mo31097h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPushNotificationReport(", "pushId:");
        C0016g.m42z(n, this.pushId, ", ", "status:");
        MVNotificationReportStatus mVNotificationReportStatus = this.status;
        if (mVNotificationReportStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVNotificationReportStatus);
        }
        n.append(")");
        return n.toString();
    }
}
