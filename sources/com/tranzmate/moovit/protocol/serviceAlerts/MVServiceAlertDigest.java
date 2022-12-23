package com.tranzmate.moovit.protocol.serviceAlerts;

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

public class MVServiceAlertDigest implements TBase<MVServiceAlertDigest, _Fields>, Serializable, Cloneable, Comparable<MVServiceAlertDigest> {

    /* renamed from: b */
    public static final C25113c f28276b = new C25113c("alertId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28277c = new C25113c("serviceStatus", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28278d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28279e = new C25113c("publicationDate", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f28280f = new C25113c("activeFrom", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f28281g = new C25113c("activeTo", (byte) 10, 6);

    /* renamed from: h */
    public static final HashMap f28282h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28283i;
    private byte __isset_bitfield = 0;
    public long activeFrom;
    public long activeTo;
    public String alertId;
    private _Fields[] optionals = {_Fields.PUBLICATION_DATE, _Fields.ACTIVE_FROM, _Fields.ACTIVE_TO};
    public long publicationDate;
    public MVServiceStatus serviceStatus;
    public String title;

    public enum _Fields implements C25085c {
        ALERT_ID(1, "alertId"),
        SERVICE_STATUS(2, "serviceStatus"),
        TITLE(3, "title"),
        PUBLICATION_DATE(4, "publicationDate"),
        ACTIVE_FROM(5, "activeFrom"),
        ACTIVE_TO(6, "activeTo");
        
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
            switch (i) {
                case 1:
                    return ALERT_ID;
                case 2:
                    return SERVICE_STATUS;
                case 3:
                    return TITLE;
                case 4:
                    return PUBLICATION_DATE;
                case 5:
                    return ACTIVE_FROM;
                case 6:
                    return ACTIVE_TO;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest$a */
    public static class C10495a extends C25239c<MVServiceAlertDigest> {
        public C10495a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertDigest mVServiceAlertDigest = (MVServiceAlertDigest) tBase;
            MVServiceStatus mVServiceStatus = mVServiceAlertDigest.serviceStatus;
            C25113c cVar = MVServiceAlertDigest.f28276b;
            gVar.mo61687K();
            if (mVServiceAlertDigest.alertId != null) {
                gVar.mo61711x(MVServiceAlertDigest.f28276b);
                gVar.mo61686J(mVServiceAlertDigest.alertId);
                gVar.mo61712y();
            }
            if (mVServiceAlertDigest.serviceStatus != null) {
                gVar.mo61711x(MVServiceAlertDigest.f28277c);
                mVServiceAlertDigest.serviceStatus.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVServiceAlertDigest.title != null) {
                gVar.mo61711x(MVServiceAlertDigest.f28278d);
                gVar.mo61686J(mVServiceAlertDigest.title);
                gVar.mo61712y();
            }
            if (mVServiceAlertDigest.mo31652i()) {
                gVar.mo61711x(MVServiceAlertDigest.f28279e);
                gVar.mo61679C(mVServiceAlertDigest.publicationDate);
                gVar.mo61712y();
            }
            if (mVServiceAlertDigest.mo31648f()) {
                gVar.mo61711x(MVServiceAlertDigest.f28280f);
                gVar.mo61679C(mVServiceAlertDigest.activeFrom);
                gVar.mo61712y();
            }
            if (mVServiceAlertDigest.mo31649g()) {
                gVar.mo61711x(MVServiceAlertDigest.f28281g);
                gVar.mo61679C(mVServiceAlertDigest.activeTo);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertDigest mVServiceAlertDigest = (MVServiceAlertDigest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVServiceStatus mVServiceStatus = mVServiceAlertDigest.serviceStatus;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDigest.alertId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVServiceStatus mVServiceStatus2 = new MVServiceStatus();
                            mVServiceAlertDigest.serviceStatus = mVServiceStatus2;
                            mVServiceStatus2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDigest.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDigest.publicationDate = gVar.mo61697j();
                            mVServiceAlertDigest.mo31657o();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDigest.activeFrom = gVar.mo61697j();
                            mVServiceAlertDigest.mo31655l();
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDigest.activeTo = gVar.mo61697j();
                            mVServiceAlertDigest.mo31656m();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest$b */
    public static class C10496b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10495a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest$c */
    public static class C10497c extends C25240d<MVServiceAlertDigest> {
        public C10497c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertDigest mVServiceAlertDigest = (MVServiceAlertDigest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVServiceAlertDigest.mo31650h()) {
                bitSet.set(0);
            }
            if (mVServiceAlertDigest.mo31653j()) {
                bitSet.set(1);
            }
            if (mVServiceAlertDigest.mo31654k()) {
                bitSet.set(2);
            }
            if (mVServiceAlertDigest.mo31652i()) {
                bitSet.set(3);
            }
            if (mVServiceAlertDigest.mo31648f()) {
                bitSet.set(4);
            }
            if (mVServiceAlertDigest.mo31649g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVServiceAlertDigest.mo31650h()) {
                jVar.mo61686J(mVServiceAlertDigest.alertId);
            }
            if (mVServiceAlertDigest.mo31653j()) {
                mVServiceAlertDigest.serviceStatus.mo25202X0(jVar);
            }
            if (mVServiceAlertDigest.mo31654k()) {
                jVar.mo61686J(mVServiceAlertDigest.title);
            }
            if (mVServiceAlertDigest.mo31652i()) {
                jVar.mo61679C(mVServiceAlertDigest.publicationDate);
            }
            if (mVServiceAlertDigest.mo31648f()) {
                jVar.mo61679C(mVServiceAlertDigest.activeFrom);
            }
            if (mVServiceAlertDigest.mo31649g()) {
                jVar.mo61679C(mVServiceAlertDigest.activeTo);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertDigest mVServiceAlertDigest = (MVServiceAlertDigest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVServiceAlertDigest.alertId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVServiceStatus mVServiceStatus = new MVServiceStatus();
                mVServiceAlertDigest.serviceStatus = mVServiceStatus;
                mVServiceStatus.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVServiceAlertDigest.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVServiceAlertDigest.publicationDate = jVar.mo61697j();
                mVServiceAlertDigest.mo31657o();
            }
            if (T.get(4)) {
                mVServiceAlertDigest.activeFrom = jVar.mo61697j();
                mVServiceAlertDigest.mo31655l();
            }
            if (T.get(5)) {
                mVServiceAlertDigest.activeTo = jVar.mo61697j();
                mVServiceAlertDigest.mo31656m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest$d */
    public static class C10498d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10497c(0);
        }
    }

    static {
        new C17394d0("MVServiceAlertDigest");
        HashMap hashMap = new HashMap();
        f28282h = hashMap;
        hashMap.put(C25239c.class, new C10496b());
        hashMap.put(C25240d.class, new C10498d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ALERT_ID, new FieldMetaData("alertId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SERVICE_STATUS, new FieldMetaData("serviceStatus", (byte) 3, new StructMetaData(MVServiceStatus.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PUBLICATION_DATE, new FieldMetaData("publicationDate", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ACTIVE_FROM, new FieldMetaData("activeFrom", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ACTIVE_TO, new FieldMetaData("activeTo", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28283i = unmodifiableMap;
        FieldMetaData.m61947a(MVServiceAlertDigest.class, unmodifiableMap);
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
        ((C25238b) f28282h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28282h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVServiceAlertDigest mVServiceAlertDigest = (MVServiceAlertDigest) obj;
        if (!getClass().equals(mVServiceAlertDigest.getClass())) {
            return getClass().getName().compareTo(mVServiceAlertDigest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31650h()).compareTo(Boolean.valueOf(mVServiceAlertDigest.mo31650h()));
        if (compareTo != 0 || ((mo31650h() && (compareTo = this.alertId.compareTo(mVServiceAlertDigest.alertId)) != 0) || (compareTo = Boolean.valueOf(mo31653j()).compareTo(Boolean.valueOf(mVServiceAlertDigest.mo31653j()))) != 0 || ((mo31653j() && (compareTo = this.serviceStatus.compareTo(mVServiceAlertDigest.serviceStatus)) != 0) || (compareTo = Boolean.valueOf(mo31654k()).compareTo(Boolean.valueOf(mVServiceAlertDigest.mo31654k()))) != 0 || ((mo31654k() && (compareTo = this.title.compareTo(mVServiceAlertDigest.title)) != 0) || (compareTo = Boolean.valueOf(mo31652i()).compareTo(Boolean.valueOf(mVServiceAlertDigest.mo31652i()))) != 0 || ((mo31652i() && (compareTo = C25082a.m62840d(this.publicationDate, mVServiceAlertDigest.publicationDate)) != 0) || (compareTo = Boolean.valueOf(mo31648f()).compareTo(Boolean.valueOf(mVServiceAlertDigest.mo31648f()))) != 0 || ((mo31648f() && (compareTo = C25082a.m62840d(this.activeFrom, mVServiceAlertDigest.activeFrom)) != 0) || (compareTo = Boolean.valueOf(mo31649g()).compareTo(Boolean.valueOf(mVServiceAlertDigest.mo31649g()))) != 0)))))) {
            return compareTo;
        }
        if (!mo31649g() || (d = C25082a.m62840d(this.activeTo, mVServiceAlertDigest.activeTo)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVServiceAlertDigest)) {
            return false;
        }
        MVServiceAlertDigest mVServiceAlertDigest = (MVServiceAlertDigest) obj;
        boolean h = mo31650h();
        boolean h2 = mVServiceAlertDigest.mo31650h();
        if ((h || h2) && (!h || !h2 || !this.alertId.equals(mVServiceAlertDigest.alertId))) {
            return false;
        }
        boolean j = mo31653j();
        boolean j2 = mVServiceAlertDigest.mo31653j();
        if ((j || j2) && (!j || !j2 || !this.serviceStatus.mo31678a(mVServiceAlertDigest.serviceStatus))) {
            return false;
        }
        boolean k = mo31654k();
        boolean k2 = mVServiceAlertDigest.mo31654k();
        if ((k || k2) && (!k || !k2 || !this.title.equals(mVServiceAlertDigest.title))) {
            return false;
        }
        boolean i = mo31652i();
        boolean i2 = mVServiceAlertDigest.mo31652i();
        if ((i || i2) && (!i || !i2 || this.publicationDate != mVServiceAlertDigest.publicationDate)) {
            return false;
        }
        boolean f = mo31648f();
        boolean f2 = mVServiceAlertDigest.mo31648f();
        if ((f || f2) && (!f || !f2 || this.activeFrom != mVServiceAlertDigest.activeFrom)) {
            return false;
        }
        boolean g = mo31649g();
        boolean g2 = mVServiceAlertDigest.mo31649g();
        if ((g || g2) && (!g || !g2 || this.activeTo != mVServiceAlertDigest.activeTo)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31648f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo31649g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo31650h() {
        return this.alertId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31652i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo31653j() {
        return this.serviceStatus != null;
    }

    /* renamed from: k */
    public final boolean mo31654k() {
        return this.title != null;
    }

    /* renamed from: l */
    public final void mo31655l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo31656m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo31657o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVServiceAlertDigest(", "alertId:");
        String str = this.alertId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
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
        n.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo31652i()) {
            n.append(", ");
            n.append("publicationDate:");
            n.append(this.publicationDate);
        }
        if (mo31648f()) {
            n.append(", ");
            n.append("activeFrom:");
            n.append(this.activeFrom);
        }
        if (mo31649g()) {
            n.append(", ");
            n.append("activeTo:");
            n.append(this.activeTo);
        }
        n.append(")");
        return n.toString();
    }
}
