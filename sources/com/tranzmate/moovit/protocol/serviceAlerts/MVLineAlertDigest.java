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

public class MVLineAlertDigest implements TBase<MVLineAlertDigest, _Fields>, Serializable, Cloneable, Comparable<MVLineAlertDigest> {

    /* renamed from: b */
    public static final C25113c f28253b = new C25113c("alertIds", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28254c = new C25113c("serviceStatus", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28255d = new C25113c("affectedLine", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28256e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28257f;
    public MVAffectedLine affectedLine;
    public List<String> alertIds;
    public MVServiceStatus serviceStatus;

    public enum _Fields implements C25085c {
        ALERT_IDS(1, "alertIds"),
        SERVICE_STATUS(2, "serviceStatus"),
        AFFECTED_LINE(3, "affectedLine");
        
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
                return ALERT_IDS;
            }
            if (i == 2) {
                return SERVICE_STATUS;
            }
            if (i != 3) {
                return null;
            }
            return AFFECTED_LINE;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertDigest$a */
    public static class C10483a extends C25239c<MVLineAlertDigest> {
        public C10483a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineAlertDigest mVLineAlertDigest = (MVLineAlertDigest) tBase;
            mVLineAlertDigest.getClass();
            C25113c cVar = MVLineAlertDigest.f28253b;
            gVar.mo61687K();
            if (mVLineAlertDigest.alertIds != null) {
                gVar.mo61711x(MVLineAlertDigest.f28253b);
                gVar.mo61680D(new C25119e((byte) 11, mVLineAlertDigest.alertIds.size()));
                for (String J : mVLineAlertDigest.alertIds) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVLineAlertDigest.serviceStatus != null) {
                gVar.mo61711x(MVLineAlertDigest.f28254c);
                mVLineAlertDigest.serviceStatus.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLineAlertDigest.affectedLine != null) {
                gVar.mo61711x(MVLineAlertDigest.f28255d);
                mVLineAlertDigest.affectedLine.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineAlertDigest mVLineAlertDigest = (MVLineAlertDigest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineAlertDigest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVAffectedLine mVAffectedLine = new MVAffectedLine();
                            mVLineAlertDigest.affectedLine = mVAffectedLine;
                            mVAffectedLine.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVServiceStatus mVServiceStatus = new MVServiceStatus();
                        mVLineAlertDigest.serviceStatus = mVServiceStatus;
                        mVServiceStatus.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVLineAlertDigest.alertIds = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        mVLineAlertDigest.alertIds.add(gVar.mo61704q());
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertDigest$b */
    public static class C10484b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10483a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertDigest$c */
    public static class C10485c extends C25240d<MVLineAlertDigest> {
        public C10485c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineAlertDigest mVLineAlertDigest = (MVLineAlertDigest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineAlertDigest.mo31611g()) {
                bitSet.set(0);
            }
            if (mVLineAlertDigest.mo31612h()) {
                bitSet.set(1);
            }
            if (mVLineAlertDigest.mo31610f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVLineAlertDigest.mo31611g()) {
                jVar.mo61678B(mVLineAlertDigest.alertIds.size());
                for (String J : mVLineAlertDigest.alertIds) {
                    jVar.mo61686J(J);
                }
            }
            if (mVLineAlertDigest.mo31612h()) {
                mVLineAlertDigest.serviceStatus.mo25202X0(jVar);
            }
            if (mVLineAlertDigest.mo31610f()) {
                mVLineAlertDigest.affectedLine.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineAlertDigest mVLineAlertDigest = (MVLineAlertDigest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVLineAlertDigest.alertIds = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVLineAlertDigest.alertIds.add(jVar.mo61704q());
                }
            }
            if (T.get(1)) {
                MVServiceStatus mVServiceStatus = new MVServiceStatus();
                mVLineAlertDigest.serviceStatus = mVServiceStatus;
                mVServiceStatus.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVAffectedLine mVAffectedLine = new MVAffectedLine();
                mVLineAlertDigest.affectedLine = mVAffectedLine;
                mVAffectedLine.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVLineAlertDigest$d */
    public static class C10486d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10485c(0);
        }
    }

    static {
        new C17394d0("MVLineAlertDigest");
        HashMap hashMap = new HashMap();
        f28256e = hashMap;
        hashMap.put(C25239c.class, new C10484b());
        hashMap.put(C25240d.class, new C10486d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ALERT_IDS, new FieldMetaData("alertIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.SERVICE_STATUS, new FieldMetaData("serviceStatus", (byte) 3, new StructMetaData(MVServiceStatus.class)));
        enumMap.put(_Fields.AFFECTED_LINE, new FieldMetaData("affectedLine", (byte) 3, new StructMetaData(MVAffectedLine.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28257f = unmodifiableMap;
        FieldMetaData.m61947a(MVLineAlertDigest.class, unmodifiableMap);
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
        ((C25238b) f28256e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28256e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31607a(MVLineAlertDigest mVLineAlertDigest) {
        if (mVLineAlertDigest == null) {
            return false;
        }
        boolean g = mo31611g();
        boolean g2 = mVLineAlertDigest.mo31611g();
        if ((g || g2) && (!g || !g2 || !this.alertIds.equals(mVLineAlertDigest.alertIds))) {
            return false;
        }
        boolean h = mo31612h();
        boolean h2 = mVLineAlertDigest.mo31612h();
        if ((h || h2) && (!h || !h2 || !this.serviceStatus.mo31678a(mVLineAlertDigest.serviceStatus))) {
            return false;
        }
        boolean f = mo31610f();
        boolean f2 = mVLineAlertDigest.mo31610f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.affectedLine.mo31553a(mVLineAlertDigest.affectedLine)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVLineAlertDigest mVLineAlertDigest = (MVLineAlertDigest) obj;
        if (!getClass().equals(mVLineAlertDigest.getClass())) {
            return getClass().getName().compareTo(mVLineAlertDigest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31611g()).compareTo(Boolean.valueOf(mVLineAlertDigest.mo31611g()));
        if (compareTo2 != 0 || ((mo31611g() && (compareTo2 = C25082a.m62844h(this.alertIds, mVLineAlertDigest.alertIds)) != 0) || (compareTo2 = Boolean.valueOf(mo31612h()).compareTo(Boolean.valueOf(mVLineAlertDigest.mo31612h()))) != 0 || ((mo31612h() && (compareTo2 = this.serviceStatus.compareTo(mVLineAlertDigest.serviceStatus)) != 0) || (compareTo2 = Boolean.valueOf(mo31610f()).compareTo(Boolean.valueOf(mVLineAlertDigest.mo31610f()))) != 0))) {
            return compareTo2;
        }
        if (!mo31610f() || (compareTo = this.affectedLine.compareTo(mVLineAlertDigest.affectedLine)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVLineAlertDigest)) {
            return mo31607a((MVLineAlertDigest) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31610f() {
        return this.affectedLine != null;
    }

    /* renamed from: g */
    public final boolean mo31611g() {
        return this.alertIds != null;
    }

    /* renamed from: h */
    public final boolean mo31612h() {
        return this.serviceStatus != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineAlertDigest(", "alertIds:");
        List<String> list = this.alertIds;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("serviceStatus:");
        MVServiceStatus mVServiceStatus = this.serviceStatus;
        if (mVServiceStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVServiceStatus);
        }
        n.append(", ");
        n.append("affectedLine:");
        MVAffectedLine mVAffectedLine = this.affectedLine;
        if (mVAffectedLine == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAffectedLine);
        }
        n.append(")");
        return n.toString();
    }
}
