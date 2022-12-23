package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVExternalPaymentMethodInfo implements TBase<MVExternalPaymentMethodInfo, _Fields>, Serializable, Cloneable, Comparable<MVExternalPaymentMethodInfo> {

    /* renamed from: b */
    public static final C25113c f27251b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27252c = new C25113c("subtitle", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27253d = new C25113c("image", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27254e = new C25113c("presentationType", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f27255f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27256g;
    public MVImageReferenceWithParams image;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.SUBTITLE, _Fields.IMAGE};
    public MVExternalPaymentMethodPresentationType presentationType;
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        SUBTITLE(2, "subtitle"),
        IMAGE(3, "image"),
        PRESENTATION_TYPE(4, "presentationType");
        
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
                return TITLE;
            }
            if (i == 2) {
                return SUBTITLE;
            }
            if (i == 3) {
                return IMAGE;
            }
            if (i != 4) {
                return null;
            }
            return PRESENTATION_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVExternalPaymentMethodInfo$a */
    public static class C9732a extends C25239c<MVExternalPaymentMethodInfo> {
        public C9732a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalPaymentMethodInfo mVExternalPaymentMethodInfo = (MVExternalPaymentMethodInfo) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVExternalPaymentMethodInfo.image;
            C25113c cVar = MVExternalPaymentMethodInfo.f27251b;
            gVar.mo61687K();
            if (mVExternalPaymentMethodInfo.title != null && mVExternalPaymentMethodInfo.mo29845i()) {
                gVar.mo61711x(MVExternalPaymentMethodInfo.f27251b);
                gVar.mo61686J(mVExternalPaymentMethodInfo.title);
                gVar.mo61712y();
            }
            if (mVExternalPaymentMethodInfo.subtitle != null && mVExternalPaymentMethodInfo.mo29843h()) {
                gVar.mo61711x(MVExternalPaymentMethodInfo.f27252c);
                gVar.mo61686J(mVExternalPaymentMethodInfo.subtitle);
                gVar.mo61712y();
            }
            if (mVExternalPaymentMethodInfo.image != null && mVExternalPaymentMethodInfo.mo29841f()) {
                gVar.mo61711x(MVExternalPaymentMethodInfo.f27253d);
                mVExternalPaymentMethodInfo.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVExternalPaymentMethodInfo.presentationType != null) {
                gVar.mo61711x(MVExternalPaymentMethodInfo.f27254e);
                gVar.mo61678B(mVExternalPaymentMethodInfo.presentationType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalPaymentMethodInfo mVExternalPaymentMethodInfo = (MVExternalPaymentMethodInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVExternalPaymentMethodInfo.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVExternalPaymentMethodInfo.presentationType = MVExternalPaymentMethodPresentationType.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVExternalPaymentMethodInfo.image = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVExternalPaymentMethodInfo.subtitle = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVExternalPaymentMethodInfo.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVExternalPaymentMethodInfo$b */
    public static class C9733b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9732a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVExternalPaymentMethodInfo$c */
    public static class C9734c extends C25240d<MVExternalPaymentMethodInfo> {
        public C9734c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalPaymentMethodInfo mVExternalPaymentMethodInfo = (MVExternalPaymentMethodInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVExternalPaymentMethodInfo.mo29845i()) {
                bitSet.set(0);
            }
            if (mVExternalPaymentMethodInfo.mo29843h()) {
                bitSet.set(1);
            }
            if (mVExternalPaymentMethodInfo.mo29841f()) {
                bitSet.set(2);
            }
            if (mVExternalPaymentMethodInfo.mo29842g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVExternalPaymentMethodInfo.mo29845i()) {
                jVar.mo61686J(mVExternalPaymentMethodInfo.title);
            }
            if (mVExternalPaymentMethodInfo.mo29843h()) {
                jVar.mo61686J(mVExternalPaymentMethodInfo.subtitle);
            }
            if (mVExternalPaymentMethodInfo.mo29841f()) {
                mVExternalPaymentMethodInfo.image.mo25202X0(jVar);
            }
            if (mVExternalPaymentMethodInfo.mo29842g()) {
                jVar.mo61678B(mVExternalPaymentMethodInfo.presentationType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalPaymentMethodInfo mVExternalPaymentMethodInfo = (MVExternalPaymentMethodInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVExternalPaymentMethodInfo.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVExternalPaymentMethodInfo.subtitle = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVExternalPaymentMethodInfo.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVExternalPaymentMethodInfo.presentationType = MVExternalPaymentMethodPresentationType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVExternalPaymentMethodInfo$d */
    public static class C9735d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9734c(0);
        }
    }

    static {
        new C17394d0("MVExternalPaymentMethodInfo");
        HashMap hashMap = new HashMap();
        f27255f = hashMap;
        hashMap.put(C25239c.class, new C9733b());
        hashMap.put(C25240d.class, new C9735d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.PRESENTATION_TYPE, new FieldMetaData("presentationType", (byte) 3, new EnumMetaData(MVExternalPaymentMethodPresentationType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27256g = unmodifiableMap;
        FieldMetaData.m61947a(MVExternalPaymentMethodInfo.class, unmodifiableMap);
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
        ((C25238b) f27255f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27255f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVExternalPaymentMethodInfo mVExternalPaymentMethodInfo = (MVExternalPaymentMethodInfo) obj;
        if (!getClass().equals(mVExternalPaymentMethodInfo.getClass())) {
            return getClass().getName().compareTo(mVExternalPaymentMethodInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29845i()).compareTo(Boolean.valueOf(mVExternalPaymentMethodInfo.mo29845i()));
        if (compareTo2 != 0 || ((mo29845i() && (compareTo2 = this.title.compareTo(mVExternalPaymentMethodInfo.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29843h()).compareTo(Boolean.valueOf(mVExternalPaymentMethodInfo.mo29843h()))) != 0 || ((mo29843h() && (compareTo2 = this.subtitle.compareTo(mVExternalPaymentMethodInfo.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo29841f()).compareTo(Boolean.valueOf(mVExternalPaymentMethodInfo.mo29841f()))) != 0 || ((mo29841f() && (compareTo2 = this.image.compareTo(mVExternalPaymentMethodInfo.image)) != 0) || (compareTo2 = Boolean.valueOf(mo29842g()).compareTo(Boolean.valueOf(mVExternalPaymentMethodInfo.mo29842g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29842g() || (compareTo = this.presentationType.compareTo(mVExternalPaymentMethodInfo.presentationType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVExternalPaymentMethodInfo)) {
            return false;
        }
        MVExternalPaymentMethodInfo mVExternalPaymentMethodInfo = (MVExternalPaymentMethodInfo) obj;
        boolean i = mo29845i();
        boolean i2 = mVExternalPaymentMethodInfo.mo29845i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVExternalPaymentMethodInfo.title))) {
            return false;
        }
        boolean h = mo29843h();
        boolean h2 = mVExternalPaymentMethodInfo.mo29843h();
        if ((h || h2) && (!h || !h2 || !this.subtitle.equals(mVExternalPaymentMethodInfo.subtitle))) {
            return false;
        }
        boolean f = mo29841f();
        boolean f2 = mVExternalPaymentMethodInfo.mo29841f();
        if ((f || f2) && (!f || !f2 || !this.image.mo26245a(mVExternalPaymentMethodInfo.image))) {
            return false;
        }
        boolean g = mo29842g();
        boolean g2 = mVExternalPaymentMethodInfo.mo29842g();
        if ((g || g2) && (!g || !g2 || !this.presentationType.equals(mVExternalPaymentMethodInfo.presentationType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29841f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo29842g() {
        return this.presentationType != null;
    }

    /* renamed from: h */
    public final boolean mo29843h() {
        return this.subtitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29845i() {
        return this.title != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVExternalPaymentMethodInfo(");
        boolean z2 = false;
        if (mo29845i()) {
            sb.append("title:");
            String str = this.title;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29843h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("subtitle:");
            String str2 = this.subtitle;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo29841f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("presentationType:");
        MVExternalPaymentMethodPresentationType mVExternalPaymentMethodPresentationType = this.presentationType;
        if (mVExternalPaymentMethodPresentationType == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVExternalPaymentMethodPresentationType);
        }
        sb.append(")");
        return sb.toString();
    }
}
