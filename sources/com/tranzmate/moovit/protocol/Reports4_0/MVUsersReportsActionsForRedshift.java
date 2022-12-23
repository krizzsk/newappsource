package com.tranzmate.moovit.protocol.Reports4_0;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVUserReportCategoryType;
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

public class MVUsersReportsActionsForRedshift implements TBase<MVUsersReportsActionsForRedshift, _Fields>, Serializable, Cloneable, Comparable<MVUsersReportsActionsForRedshift> {

    /* renamed from: b */
    public static final C25113c f24575b = new C25113c("reportId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24576c = new C25113c("reportAction", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24577d = new C25113c("actionTime", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f24578e = new C25113c("categoryUnionType", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f24579f = new C25113c("reportCreationTime", (byte) 10, 5);

    /* renamed from: g */
    public static final HashMap f24580g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f24581h;
    private byte __isset_bitfield = 0;
    public long actionTime;
    public MVUserReportCategoryType categoryUnionType;
    public MVReportActions reportAction;
    public long reportCreationTime;
    public String reportId;

    public enum _Fields implements C25085c {
        REPORT_ID(1, "reportId"),
        REPORT_ACTION(2, "reportAction"),
        ACTION_TIME(3, "actionTime"),
        CATEGORY_UNION_TYPE(4, "categoryUnionType"),
        REPORT_CREATION_TIME(5, "reportCreationTime");
        
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
            if (i == 2) {
                return REPORT_ACTION;
            }
            if (i == 3) {
                return ACTION_TIME;
            }
            if (i == 4) {
                return CATEGORY_UNION_TYPE;
            }
            if (i != 5) {
                return null;
            }
            return REPORT_CREATION_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsActionsForRedshift$a */
    public static class C8117a extends C25239c<MVUsersReportsActionsForRedshift> {
        public C8117a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUsersReportsActionsForRedshift mVUsersReportsActionsForRedshift = (MVUsersReportsActionsForRedshift) tBase;
            mVUsersReportsActionsForRedshift.getClass();
            C25113c cVar = MVUsersReportsActionsForRedshift.f24575b;
            gVar.mo61687K();
            if (mVUsersReportsActionsForRedshift.reportId != null) {
                gVar.mo61711x(MVUsersReportsActionsForRedshift.f24575b);
                gVar.mo61686J(mVUsersReportsActionsForRedshift.reportId);
                gVar.mo61712y();
            }
            if (mVUsersReportsActionsForRedshift.reportAction != null) {
                gVar.mo61711x(MVUsersReportsActionsForRedshift.f24576c);
                gVar.mo61678B(mVUsersReportsActionsForRedshift.reportAction.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVUsersReportsActionsForRedshift.f24577d);
            gVar.mo61679C(mVUsersReportsActionsForRedshift.actionTime);
            gVar.mo61712y();
            if (mVUsersReportsActionsForRedshift.categoryUnionType != null) {
                gVar.mo61711x(MVUsersReportsActionsForRedshift.f24578e);
                mVUsersReportsActionsForRedshift.categoryUnionType.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVUsersReportsActionsForRedshift.f24579f);
            C25541a.m63891v(gVar, mVUsersReportsActionsForRedshift.reportCreationTime);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUsersReportsActionsForRedshift mVUsersReportsActionsForRedshift = (MVUsersReportsActionsForRedshift) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUsersReportsActionsForRedshift.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 10) {
                                    mVUsersReportsActionsForRedshift.reportCreationTime = gVar.mo61697j();
                                    mVUsersReportsActionsForRedshift.mo25354l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVUserReportCategoryType mVUserReportCategoryType = new MVUserReportCategoryType();
                                mVUsersReportsActionsForRedshift.categoryUnionType = mVUserReportCategoryType;
                                mVUserReportCategoryType.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 10) {
                            mVUsersReportsActionsForRedshift.actionTime = gVar.mo61697j();
                            mVUsersReportsActionsForRedshift.mo25353k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVUsersReportsActionsForRedshift.reportAction = MVReportActions.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVUsersReportsActionsForRedshift.reportId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsActionsForRedshift$b */
    public static class C8118b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8117a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsActionsForRedshift$c */
    public static class C8119c extends C25240d<MVUsersReportsActionsForRedshift> {
        public C8119c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUsersReportsActionsForRedshift mVUsersReportsActionsForRedshift = (MVUsersReportsActionsForRedshift) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUsersReportsActionsForRedshift.mo25352j()) {
                bitSet.set(0);
            }
            if (mVUsersReportsActionsForRedshift.mo25349h()) {
                bitSet.set(1);
            }
            if (mVUsersReportsActionsForRedshift.mo25347f()) {
                bitSet.set(2);
            }
            if (mVUsersReportsActionsForRedshift.mo25348g()) {
                bitSet.set(3);
            }
            if (mVUsersReportsActionsForRedshift.mo25351i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVUsersReportsActionsForRedshift.mo25352j()) {
                jVar.mo61686J(mVUsersReportsActionsForRedshift.reportId);
            }
            if (mVUsersReportsActionsForRedshift.mo25349h()) {
                jVar.mo61678B(mVUsersReportsActionsForRedshift.reportAction.getValue());
            }
            if (mVUsersReportsActionsForRedshift.mo25347f()) {
                jVar.mo61679C(mVUsersReportsActionsForRedshift.actionTime);
            }
            if (mVUsersReportsActionsForRedshift.mo25348g()) {
                mVUsersReportsActionsForRedshift.categoryUnionType.mo25202X0(jVar);
            }
            if (mVUsersReportsActionsForRedshift.mo25351i()) {
                jVar.mo61679C(mVUsersReportsActionsForRedshift.reportCreationTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUsersReportsActionsForRedshift mVUsersReportsActionsForRedshift = (MVUsersReportsActionsForRedshift) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVUsersReportsActionsForRedshift.reportId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVUsersReportsActionsForRedshift.reportAction = MVReportActions.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVUsersReportsActionsForRedshift.actionTime = jVar.mo61697j();
                mVUsersReportsActionsForRedshift.mo25353k();
            }
            if (T.get(3)) {
                MVUserReportCategoryType mVUserReportCategoryType = new MVUserReportCategoryType();
                mVUsersReportsActionsForRedshift.categoryUnionType = mVUserReportCategoryType;
                mVUserReportCategoryType.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVUsersReportsActionsForRedshift.reportCreationTime = jVar.mo61697j();
                mVUsersReportsActionsForRedshift.mo25354l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUsersReportsActionsForRedshift$d */
    public static class C8120d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8119c(0);
        }
    }

    static {
        new C17394d0("MVUsersReportsActionsForRedshift");
        HashMap hashMap = new HashMap();
        f24580g = hashMap;
        hashMap.put(C25239c.class, new C8118b());
        hashMap.put(C25240d.class, new C8120d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REPORT_ID, new FieldMetaData("reportId", (byte) 3, new FieldValueMetaData((byte) 11, "MVUserReportId")));
        enumMap.put(_Fields.REPORT_ACTION, new FieldMetaData("reportAction", (byte) 3, new EnumMetaData(MVReportActions.class)));
        enumMap.put(_Fields.ACTION_TIME, new FieldMetaData("actionTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.CATEGORY_UNION_TYPE, new FieldMetaData("categoryUnionType", (byte) 3, new StructMetaData(MVUserReportCategoryType.class)));
        enumMap.put(_Fields.REPORT_CREATION_TIME, new FieldMetaData("reportCreationTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24581h = unmodifiableMap;
        FieldMetaData.m61947a(MVUsersReportsActionsForRedshift.class, unmodifiableMap);
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
        ((C25238b) f24580g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24580g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVUsersReportsActionsForRedshift mVUsersReportsActionsForRedshift = (MVUsersReportsActionsForRedshift) obj;
        if (!getClass().equals(mVUsersReportsActionsForRedshift.getClass())) {
            return getClass().getName().compareTo(mVUsersReportsActionsForRedshift.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25352j()).compareTo(Boolean.valueOf(mVUsersReportsActionsForRedshift.mo25352j()));
        if (compareTo != 0 || ((mo25352j() && (compareTo = this.reportId.compareTo(mVUsersReportsActionsForRedshift.reportId)) != 0) || (compareTo = Boolean.valueOf(mo25349h()).compareTo(Boolean.valueOf(mVUsersReportsActionsForRedshift.mo25349h()))) != 0 || ((mo25349h() && (compareTo = this.reportAction.compareTo(mVUsersReportsActionsForRedshift.reportAction)) != 0) || (compareTo = Boolean.valueOf(mo25347f()).compareTo(Boolean.valueOf(mVUsersReportsActionsForRedshift.mo25347f()))) != 0 || ((mo25347f() && (compareTo = C25082a.m62840d(this.actionTime, mVUsersReportsActionsForRedshift.actionTime)) != 0) || (compareTo = Boolean.valueOf(mo25348g()).compareTo(Boolean.valueOf(mVUsersReportsActionsForRedshift.mo25348g()))) != 0 || ((mo25348g() && (compareTo = this.categoryUnionType.compareTo(mVUsersReportsActionsForRedshift.categoryUnionType)) != 0) || (compareTo = Boolean.valueOf(mo25351i()).compareTo(Boolean.valueOf(mVUsersReportsActionsForRedshift.mo25351i()))) != 0))))) {
            return compareTo;
        }
        if (!mo25351i() || (d = C25082a.m62840d(this.reportCreationTime, mVUsersReportsActionsForRedshift.reportCreationTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUsersReportsActionsForRedshift)) {
            return false;
        }
        MVUsersReportsActionsForRedshift mVUsersReportsActionsForRedshift = (MVUsersReportsActionsForRedshift) obj;
        boolean j = mo25352j();
        boolean j2 = mVUsersReportsActionsForRedshift.mo25352j();
        if ((j || j2) && (!j || !j2 || !this.reportId.equals(mVUsersReportsActionsForRedshift.reportId))) {
            return false;
        }
        boolean h = mo25349h();
        boolean h2 = mVUsersReportsActionsForRedshift.mo25349h();
        if (((h || h2) && (!h || !h2 || !this.reportAction.equals(mVUsersReportsActionsForRedshift.reportAction))) || this.actionTime != mVUsersReportsActionsForRedshift.actionTime) {
            return false;
        }
        boolean g = mo25348g();
        boolean g2 = mVUsersReportsActionsForRedshift.mo25348g();
        if (((g || g2) && (!g || !g2 || !this.categoryUnionType.mo26435k(mVUsersReportsActionsForRedshift.categoryUnionType))) || this.reportCreationTime != mVUsersReportsActionsForRedshift.reportCreationTime) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25347f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo25348g() {
        return this.categoryUnionType != null;
    }

    /* renamed from: h */
    public final boolean mo25349h() {
        return this.reportAction != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25351i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo25352j() {
        return this.reportId != null;
    }

    /* renamed from: k */
    public final void mo25353k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo25354l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUsersReportsActionsForRedshift(", "reportId:");
        String str = this.reportId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("reportAction:");
        MVReportActions mVReportActions = this.reportAction;
        if (mVReportActions == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVReportActions);
        }
        n.append(", ");
        n.append("actionTime:");
        C25541a.m63889t(n, this.actionTime, ", ", "categoryUnionType:");
        MVUserReportCategoryType mVUserReportCategoryType = this.categoryUnionType;
        if (mVUserReportCategoryType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVUserReportCategoryType);
        }
        n.append(", ");
        n.append("reportCreationTime:");
        return C25541a.m63884o(n, this.reportCreationTime, ")");
    }
}
