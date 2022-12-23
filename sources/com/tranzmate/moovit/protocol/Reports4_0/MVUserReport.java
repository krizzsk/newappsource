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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVUserReport implements TBase<MVUserReport, _Fields>, Serializable, Cloneable, Comparable<MVUserReport> {

    /* renamed from: b */
    public static final C25113c f24565b = new C25113c("reportId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24566c = new C25113c("creationData", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24567d = new C25113c("likesCount", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f24568e = new C25113c("dislikeCount", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f24569f = new C25113c("inappropriateCount", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f24570g = new C25113c("isOwner", (byte) 2, 6);

    /* renamed from: h */
    public static final C25113c f24571h = new C25113c("userFeedback", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f24572i = new C25113c("userNickName", (byte) 11, 8);

    /* renamed from: j */
    public static final HashMap f24573j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f24574k;
    private byte __isset_bitfield = 0;
    public MVReportCreationData creationData;
    public int dislikeCount;
    public int inappropriateCount;
    public boolean isOwner;
    public int likesCount;
    public String reportId;
    public MVReportUserFeedback userFeedback;
    public String userNickName;

    public enum _Fields implements C25085c {
        REPORT_ID(1, "reportId"),
        CREATION_DATA(2, "creationData"),
        LIKES_COUNT(3, "likesCount"),
        DISLIKE_COUNT(4, "dislikeCount"),
        INAPPROPRIATE_COUNT(5, "inappropriateCount"),
        IS_OWNER(6, "isOwner"),
        USER_FEEDBACK(7, "userFeedback"),
        USER_NICK_NAME(8, "userNickName");
        
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
                    return REPORT_ID;
                case 2:
                    return CREATION_DATA;
                case 3:
                    return LIKES_COUNT;
                case 4:
                    return DISLIKE_COUNT;
                case 5:
                    return INAPPROPRIATE_COUNT;
                case 6:
                    return IS_OWNER;
                case 7:
                    return USER_FEEDBACK;
                case 8:
                    return USER_NICK_NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUserReport$a */
    public static class C8113a extends C25239c<MVUserReport> {
        public C8113a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserReport mVUserReport = (MVUserReport) tBase;
            MVReportCreationData mVReportCreationData = mVUserReport.creationData;
            C25113c cVar = MVUserReport.f24565b;
            gVar.mo61687K();
            if (mVUserReport.reportId != null) {
                gVar.mo61711x(MVUserReport.f24565b);
                gVar.mo61686J(mVUserReport.reportId);
                gVar.mo61712y();
            }
            if (mVUserReport.creationData != null) {
                gVar.mo61711x(MVUserReport.f24566c);
                mVUserReport.creationData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVUserReport.f24567d);
            gVar.mo61678B(mVUserReport.likesCount);
            gVar.mo61712y();
            gVar.mo61711x(MVUserReport.f24568e);
            gVar.mo61678B(mVUserReport.dislikeCount);
            gVar.mo61712y();
            gVar.mo61711x(MVUserReport.f24569f);
            gVar.mo61678B(mVUserReport.inappropriateCount);
            gVar.mo61712y();
            gVar.mo61711x(MVUserReport.f24570g);
            gVar.mo61708u(mVUserReport.isOwner);
            gVar.mo61712y();
            if (mVUserReport.userFeedback != null) {
                gVar.mo61711x(MVUserReport.f24571h);
                gVar.mo61678B(mVUserReport.userFeedback.getValue());
                gVar.mo61712y();
            }
            if (mVUserReport.userNickName != null) {
                gVar.mo61711x(MVUserReport.f24572i);
                gVar.mo61686J(mVUserReport.userNickName);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserReport mVUserReport = (MVUserReport) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVReportCreationData mVReportCreationData = mVUserReport.creationData;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserReport.reportId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVReportCreationData mVReportCreationData2 = new MVReportCreationData();
                            mVUserReport.creationData = mVReportCreationData2;
                            mVReportCreationData2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserReport.likesCount = gVar.mo61696i();
                            mVUserReport.mo25342r();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserReport.dislikeCount = gVar.mo61696i();
                            mVUserReport.mo25339o();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserReport.inappropriateCount = gVar.mo61696i();
                            mVUserReport.mo25340p();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserReport.isOwner = gVar.mo61690c();
                            mVUserReport.mo25341q();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserReport.userFeedback = MVReportUserFeedback.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserReport.userNickName = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUserReport$b */
    public static class C8114b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8113a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUserReport$c */
    public static class C8115c extends C25240d<MVUserReport> {
        public C8115c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserReport mVUserReport = (MVUserReport) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserReport.mo25336k()) {
                bitSet.set(0);
            }
            if (mVUserReport.mo25330f()) {
                bitSet.set(1);
            }
            if (mVUserReport.mo25335j()) {
                bitSet.set(2);
            }
            if (mVUserReport.mo25331g()) {
                bitSet.set(3);
            }
            if (mVUserReport.mo25332h()) {
                bitSet.set(4);
            }
            if (mVUserReport.mo25334i()) {
                bitSet.set(5);
            }
            if (mVUserReport.mo25337l()) {
                bitSet.set(6);
            }
            if (mVUserReport.mo25338m()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVUserReport.mo25336k()) {
                jVar.mo61686J(mVUserReport.reportId);
            }
            if (mVUserReport.mo25330f()) {
                mVUserReport.creationData.mo25202X0(jVar);
            }
            if (mVUserReport.mo25335j()) {
                jVar.mo61678B(mVUserReport.likesCount);
            }
            if (mVUserReport.mo25331g()) {
                jVar.mo61678B(mVUserReport.dislikeCount);
            }
            if (mVUserReport.mo25332h()) {
                jVar.mo61678B(mVUserReport.inappropriateCount);
            }
            if (mVUserReport.mo25334i()) {
                jVar.mo61708u(mVUserReport.isOwner);
            }
            if (mVUserReport.mo25337l()) {
                jVar.mo61678B(mVUserReport.userFeedback.getValue());
            }
            if (mVUserReport.mo25338m()) {
                jVar.mo61686J(mVUserReport.userNickName);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserReport mVUserReport = (MVUserReport) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVUserReport.reportId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVReportCreationData mVReportCreationData = new MVReportCreationData();
                mVUserReport.creationData = mVReportCreationData;
                mVReportCreationData.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVUserReport.likesCount = jVar.mo61696i();
                mVUserReport.mo25342r();
            }
            if (T.get(3)) {
                mVUserReport.dislikeCount = jVar.mo61696i();
                mVUserReport.mo25339o();
            }
            if (T.get(4)) {
                mVUserReport.inappropriateCount = jVar.mo61696i();
                mVUserReport.mo25340p();
            }
            if (T.get(5)) {
                mVUserReport.isOwner = jVar.mo61690c();
                mVUserReport.mo25341q();
            }
            if (T.get(6)) {
                mVUserReport.userFeedback = MVReportUserFeedback.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                mVUserReport.userNickName = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVUserReport$d */
    public static class C8116d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8115c(0);
        }
    }

    static {
        new C17394d0("MVUserReport");
        HashMap hashMap = new HashMap();
        f24573j = hashMap;
        hashMap.put(C25239c.class, new C8114b());
        hashMap.put(C25240d.class, new C8116d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REPORT_ID, new FieldMetaData("reportId", (byte) 3, new FieldValueMetaData((byte) 11, "MVUserReportId")));
        enumMap.put(_Fields.CREATION_DATA, new FieldMetaData("creationData", (byte) 3, new StructMetaData(MVReportCreationData.class)));
        enumMap.put(_Fields.LIKES_COUNT, new FieldMetaData("likesCount", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DISLIKE_COUNT, new FieldMetaData("dislikeCount", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.INAPPROPRIATE_COUNT, new FieldMetaData("inappropriateCount", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IS_OWNER, new FieldMetaData("isOwner", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.USER_FEEDBACK, new FieldMetaData("userFeedback", (byte) 3, new EnumMetaData(MVReportUserFeedback.class)));
        enumMap.put(_Fields.USER_NICK_NAME, new FieldMetaData("userNickName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24574k = unmodifiableMap;
        FieldMetaData.m61947a(MVUserReport.class, unmodifiableMap);
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
        ((C25238b) f24573j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24573j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUserReport mVUserReport = (MVUserReport) obj;
        if (!getClass().equals(mVUserReport.getClass())) {
            return getClass().getName().compareTo(mVUserReport.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25336k()).compareTo(Boolean.valueOf(mVUserReport.mo25336k()));
        if (compareTo2 != 0 || ((mo25336k() && (compareTo2 = this.reportId.compareTo(mVUserReport.reportId)) != 0) || (compareTo2 = Boolean.valueOf(mo25330f()).compareTo(Boolean.valueOf(mVUserReport.mo25330f()))) != 0 || ((mo25330f() && (compareTo2 = this.creationData.compareTo(mVUserReport.creationData)) != 0) || (compareTo2 = Boolean.valueOf(mo25335j()).compareTo(Boolean.valueOf(mVUserReport.mo25335j()))) != 0 || ((mo25335j() && (compareTo2 = C25082a.m62839c(this.likesCount, mVUserReport.likesCount)) != 0) || (compareTo2 = Boolean.valueOf(mo25331g()).compareTo(Boolean.valueOf(mVUserReport.mo25331g()))) != 0 || ((mo25331g() && (compareTo2 = C25082a.m62839c(this.dislikeCount, mVUserReport.dislikeCount)) != 0) || (compareTo2 = Boolean.valueOf(mo25332h()).compareTo(Boolean.valueOf(mVUserReport.mo25332h()))) != 0 || ((mo25332h() && (compareTo2 = C25082a.m62839c(this.inappropriateCount, mVUserReport.inappropriateCount)) != 0) || (compareTo2 = Boolean.valueOf(mo25334i()).compareTo(Boolean.valueOf(mVUserReport.mo25334i()))) != 0 || ((mo25334i() && (compareTo2 = C25082a.m62848l(this.isOwner, mVUserReport.isOwner)) != 0) || (compareTo2 = Boolean.valueOf(mo25337l()).compareTo(Boolean.valueOf(mVUserReport.mo25337l()))) != 0 || ((mo25337l() && (compareTo2 = this.userFeedback.compareTo(mVUserReport.userFeedback)) != 0) || (compareTo2 = Boolean.valueOf(mo25338m()).compareTo(Boolean.valueOf(mVUserReport.mo25338m()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo25338m() || (compareTo = this.userNickName.compareTo(mVUserReport.userNickName)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUserReport)) {
            return false;
        }
        MVUserReport mVUserReport = (MVUserReport) obj;
        boolean k = mo25336k();
        boolean k2 = mVUserReport.mo25336k();
        if ((k || k2) && (!k || !k2 || !this.reportId.equals(mVUserReport.reportId))) {
            return false;
        }
        boolean f = mo25330f();
        boolean f2 = mVUserReport.mo25330f();
        if (((f || f2) && (!f || !f2 || !this.creationData.mo25294a(mVUserReport.creationData))) || this.likesCount != mVUserReport.likesCount || this.dislikeCount != mVUserReport.dislikeCount || this.inappropriateCount != mVUserReport.inappropriateCount || this.isOwner != mVUserReport.isOwner) {
            return false;
        }
        boolean l = mo25337l();
        boolean l2 = mVUserReport.mo25337l();
        if ((l || l2) && (!l || !l2 || !this.userFeedback.equals(mVUserReport.userFeedback))) {
            return false;
        }
        boolean m = mo25338m();
        boolean m2 = mVUserReport.mo25338m();
        if ((m || m2) && (!m || !m2 || !this.userNickName.equals(mVUserReport.userNickName))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25330f() {
        return this.creationData != null;
    }

    /* renamed from: g */
    public final boolean mo25331g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo25332h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25334i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo25335j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo25336k() {
        return this.reportId != null;
    }

    /* renamed from: l */
    public final boolean mo25337l() {
        return this.userFeedback != null;
    }

    /* renamed from: m */
    public final boolean mo25338m() {
        return this.userNickName != null;
    }

    /* renamed from: o */
    public final void mo25339o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo25340p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: q */
    public final void mo25341q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: r */
    public final void mo25342r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserReport(", "reportId:");
        String str = this.reportId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("creationData:");
        MVReportCreationData mVReportCreationData = this.creationData;
        if (mVReportCreationData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVReportCreationData);
        }
        n.append(", ");
        n.append("likesCount:");
        C0016g.m42z(n, this.likesCount, ", ", "dislikeCount:");
        C0016g.m42z(n, this.dislikeCount, ", ", "inappropriateCount:");
        C0016g.m42z(n, this.inappropriateCount, ", ", "isOwner:");
        C13555b.m33977q(n, this.isOwner, ", ", "userFeedback:");
        MVReportUserFeedback mVReportUserFeedback = this.userFeedback;
        if (mVReportUserFeedback == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVReportUserFeedback);
        }
        n.append(", ");
        n.append("userNickName:");
        String str2 = this.userNickName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
