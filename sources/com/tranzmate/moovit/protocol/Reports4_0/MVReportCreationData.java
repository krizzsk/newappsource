package com.tranzmate.moovit.protocol.Reports4_0;

import com.appboy.Constants;
import com.appboy.models.MessageButton;
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

public class MVReportCreationData implements TBase<MVReportCreationData, _Fields>, Serializable, Cloneable, Comparable<MVReportCreationData> {

    /* renamed from: b */
    public static final C25113c f24547b = new C25113c("categoryUnionType", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24548c = new C25113c("index", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24549d = new C25113c(MessageButton.TEXT, (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24550e = new C25113c("reportLocationName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f24551f = new C25113c("creationTime", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f24552g = new C25113c("email", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f24553h = new C25113c(Constants.APPBOY_PUSH_EXTRAS_KEY, (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f24554i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f24555j;
    private byte __isset_bitfield = 0;
    public MVUserReportCategoryType categoryUnionType;
    public long creationTime;
    public String email;
    public String extra;
    public int index;
    private _Fields[] optionals = {_Fields.INDEX, _Fields.TEXT};
    public String reportLocationName;
    public String text;

    public enum _Fields implements C25085c {
        CATEGORY_UNION_TYPE(1, "categoryUnionType"),
        INDEX(2, "index"),
        TEXT(3, MessageButton.TEXT),
        REPORT_LOCATION_NAME(4, "reportLocationName"),
        CREATION_TIME(5, "creationTime"),
        EMAIL(6, "email"),
        EXTRA(7, Constants.APPBOY_PUSH_EXTRAS_KEY);
        
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
                    return CATEGORY_UNION_TYPE;
                case 2:
                    return INDEX;
                case 3:
                    return TEXT;
                case 4:
                    return REPORT_LOCATION_NAME;
                case 5:
                    return CREATION_TIME;
                case 6:
                    return EMAIL;
                case 7:
                    return EXTRA;
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVReportCreationData$a */
    public static class C8097a extends C25239c<MVReportCreationData> {
        public C8097a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVReportCreationData mVReportCreationData = (MVReportCreationData) tBase;
            mVReportCreationData.getClass();
            C25113c cVar = MVReportCreationData.f24547b;
            gVar.mo61687K();
            if (mVReportCreationData.categoryUnionType != null) {
                gVar.mo61711x(MVReportCreationData.f24547b);
                mVReportCreationData.categoryUnionType.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVReportCreationData.mo25302j()) {
                gVar.mo61711x(MVReportCreationData.f24548c);
                gVar.mo61678B(mVReportCreationData.index);
                gVar.mo61712y();
            }
            if (mVReportCreationData.text != null && mVReportCreationData.mo25304l()) {
                gVar.mo61711x(MVReportCreationData.f24549d);
                gVar.mo61686J(mVReportCreationData.text);
                gVar.mo61712y();
            }
            if (mVReportCreationData.reportLocationName != null) {
                gVar.mo61711x(MVReportCreationData.f24550e);
                gVar.mo61686J(mVReportCreationData.reportLocationName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVReportCreationData.f24551f);
            gVar.mo61679C(mVReportCreationData.creationTime);
            gVar.mo61712y();
            if (mVReportCreationData.email != null) {
                gVar.mo61711x(MVReportCreationData.f24552g);
                gVar.mo61686J(mVReportCreationData.email);
                gVar.mo61712y();
            }
            if (mVReportCreationData.extra != null) {
                gVar.mo61711x(MVReportCreationData.f24553h);
                gVar.mo61686J(mVReportCreationData.extra);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVReportCreationData mVReportCreationData = (MVReportCreationData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVReportCreationData.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVUserReportCategoryType mVUserReportCategoryType = new MVUserReportCategoryType();
                            mVReportCreationData.categoryUnionType = mVUserReportCategoryType;
                            mVUserReportCategoryType.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVReportCreationData.index = gVar.mo61696i();
                            mVReportCreationData.mo25306o();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVReportCreationData.text = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVReportCreationData.reportLocationName = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVReportCreationData.creationTime = gVar.mo61697j();
                            mVReportCreationData.mo25305m();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVReportCreationData.email = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVReportCreationData.extra = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVReportCreationData$b */
    public static class C8098b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8097a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVReportCreationData$c */
    public static class C8099c extends C25240d<MVReportCreationData> {
        public C8099c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVReportCreationData mVReportCreationData = (MVReportCreationData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVReportCreationData.mo25297f()) {
                bitSet.set(0);
            }
            if (mVReportCreationData.mo25302j()) {
                bitSet.set(1);
            }
            if (mVReportCreationData.mo25304l()) {
                bitSet.set(2);
            }
            if (mVReportCreationData.mo25303k()) {
                bitSet.set(3);
            }
            if (mVReportCreationData.mo25298g()) {
                bitSet.set(4);
            }
            if (mVReportCreationData.mo25299h()) {
                bitSet.set(5);
            }
            if (mVReportCreationData.mo25301i()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVReportCreationData.mo25297f()) {
                mVReportCreationData.categoryUnionType.mo25202X0(jVar);
            }
            if (mVReportCreationData.mo25302j()) {
                jVar.mo61678B(mVReportCreationData.index);
            }
            if (mVReportCreationData.mo25304l()) {
                jVar.mo61686J(mVReportCreationData.text);
            }
            if (mVReportCreationData.mo25303k()) {
                jVar.mo61686J(mVReportCreationData.reportLocationName);
            }
            if (mVReportCreationData.mo25298g()) {
                jVar.mo61679C(mVReportCreationData.creationTime);
            }
            if (mVReportCreationData.mo25299h()) {
                jVar.mo61686J(mVReportCreationData.email);
            }
            if (mVReportCreationData.mo25301i()) {
                jVar.mo61686J(mVReportCreationData.extra);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVReportCreationData mVReportCreationData = (MVReportCreationData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                MVUserReportCategoryType mVUserReportCategoryType = new MVUserReportCategoryType();
                mVReportCreationData.categoryUnionType = mVUserReportCategoryType;
                mVUserReportCategoryType.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVReportCreationData.index = jVar.mo61696i();
                mVReportCreationData.mo25306o();
            }
            if (T.get(2)) {
                mVReportCreationData.text = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVReportCreationData.reportLocationName = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVReportCreationData.creationTime = jVar.mo61697j();
                mVReportCreationData.mo25305m();
            }
            if (T.get(5)) {
                mVReportCreationData.email = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVReportCreationData.extra = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.Reports4_0.MVReportCreationData$d */
    public static class C8100d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8099c(0);
        }
    }

    static {
        new C17394d0("MVReportCreationData");
        HashMap hashMap = new HashMap();
        f24554i = hashMap;
        hashMap.put(C25239c.class, new C8098b());
        hashMap.put(C25240d.class, new C8100d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CATEGORY_UNION_TYPE, new FieldMetaData("categoryUnionType", (byte) 3, new StructMetaData(MVUserReportCategoryType.class)));
        enumMap.put(_Fields.INDEX, new FieldMetaData("index", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REPORT_LOCATION_NAME, new FieldMetaData("reportLocationName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CREATION_TIME, new FieldMetaData("creationTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.EMAIL, new FieldMetaData("email", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EXTRA, new FieldMetaData(Constants.APPBOY_PUSH_EXTRAS_KEY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24555j = unmodifiableMap;
        FieldMetaData.m61947a(MVReportCreationData.class, unmodifiableMap);
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
        ((C25238b) f24554i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24554i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25294a(MVReportCreationData mVReportCreationData) {
        if (mVReportCreationData == null) {
            return false;
        }
        boolean f = mo25297f();
        boolean f2 = mVReportCreationData.mo25297f();
        if ((f || f2) && (!f || !f2 || !this.categoryUnionType.mo26435k(mVReportCreationData.categoryUnionType))) {
            return false;
        }
        boolean j = mo25302j();
        boolean j2 = mVReportCreationData.mo25302j();
        if ((j || j2) && (!j || !j2 || this.index != mVReportCreationData.index)) {
            return false;
        }
        boolean l = mo25304l();
        boolean l2 = mVReportCreationData.mo25304l();
        if ((l || l2) && (!l || !l2 || !this.text.equals(mVReportCreationData.text))) {
            return false;
        }
        boolean k = mo25303k();
        boolean k2 = mVReportCreationData.mo25303k();
        if (((k || k2) && (!k || !k2 || !this.reportLocationName.equals(mVReportCreationData.reportLocationName))) || this.creationTime != mVReportCreationData.creationTime) {
            return false;
        }
        boolean h = mo25299h();
        boolean h2 = mVReportCreationData.mo25299h();
        if ((h || h2) && (!h || !h2 || !this.email.equals(mVReportCreationData.email))) {
            return false;
        }
        boolean i = mo25301i();
        boolean i2 = mVReportCreationData.mo25301i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.extra.equals(mVReportCreationData.extra)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVReportCreationData mVReportCreationData = (MVReportCreationData) obj;
        if (!getClass().equals(mVReportCreationData.getClass())) {
            return getClass().getName().compareTo(mVReportCreationData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25297f()).compareTo(Boolean.valueOf(mVReportCreationData.mo25297f()));
        if (compareTo2 != 0 || ((mo25297f() && (compareTo2 = this.categoryUnionType.compareTo(mVReportCreationData.categoryUnionType)) != 0) || (compareTo2 = Boolean.valueOf(mo25302j()).compareTo(Boolean.valueOf(mVReportCreationData.mo25302j()))) != 0 || ((mo25302j() && (compareTo2 = C25082a.m62839c(this.index, mVReportCreationData.index)) != 0) || (compareTo2 = Boolean.valueOf(mo25304l()).compareTo(Boolean.valueOf(mVReportCreationData.mo25304l()))) != 0 || ((mo25304l() && (compareTo2 = this.text.compareTo(mVReportCreationData.text)) != 0) || (compareTo2 = Boolean.valueOf(mo25303k()).compareTo(Boolean.valueOf(mVReportCreationData.mo25303k()))) != 0 || ((mo25303k() && (compareTo2 = this.reportLocationName.compareTo(mVReportCreationData.reportLocationName)) != 0) || (compareTo2 = Boolean.valueOf(mo25298g()).compareTo(Boolean.valueOf(mVReportCreationData.mo25298g()))) != 0 || ((mo25298g() && (compareTo2 = C25082a.m62840d(this.creationTime, mVReportCreationData.creationTime)) != 0) || (compareTo2 = Boolean.valueOf(mo25299h()).compareTo(Boolean.valueOf(mVReportCreationData.mo25299h()))) != 0 || ((mo25299h() && (compareTo2 = this.email.compareTo(mVReportCreationData.email)) != 0) || (compareTo2 = Boolean.valueOf(mo25301i()).compareTo(Boolean.valueOf(mVReportCreationData.mo25301i()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo25301i() || (compareTo = this.extra.compareTo(mVReportCreationData.extra)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVReportCreationData)) {
            return mo25294a((MVReportCreationData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25297f() {
        return this.categoryUnionType != null;
    }

    /* renamed from: g */
    public final boolean mo25298g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo25299h() {
        return this.email != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25301i() {
        return this.extra != null;
    }

    /* renamed from: j */
    public final boolean mo25302j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo25303k() {
        return this.reportLocationName != null;
    }

    /* renamed from: l */
    public final boolean mo25304l() {
        return this.text != null;
    }

    /* renamed from: m */
    public final void mo25305m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo25306o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVReportCreationData(", "categoryUnionType:");
        MVUserReportCategoryType mVUserReportCategoryType = this.categoryUnionType;
        if (mVUserReportCategoryType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVUserReportCategoryType);
        }
        if (mo25302j()) {
            n.append(", ");
            n.append("index:");
            n.append(this.index);
        }
        if (mo25304l()) {
            n.append(", ");
            n.append("text:");
            String str = this.text;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("reportLocationName:");
        String str2 = this.reportLocationName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("creationTime:");
        C25541a.m63889t(n, this.creationTime, ", ", "email:");
        String str3 = this.email;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("extra:");
        String str4 = this.extra;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }
}
