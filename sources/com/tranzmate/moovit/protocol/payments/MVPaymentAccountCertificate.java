package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVPaymentAccountCertificate implements TBase<MVPaymentAccountCertificate, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountCertificate> {

    /* renamed from: b */
    public static final C25113c f27404b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27405c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27406d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27407e = new C25113c("image", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27408f = new C25113c("cta", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f27409g = new C25113c(ServerParameters.STATUS, (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f27410h = new C25113c("accessibilityHint", (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f27411i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f27412j;
    public String accessibilityHint;
    public String cta;
    public MVImageReferenceWithParams image;
    private _Fields[] optionals = {_Fields.PAYMENT_CONTEXT, _Fields.TITLE, _Fields.SUBTITLE, _Fields.IMAGE, _Fields.CTA, _Fields.ACCESSIBILITY_HINT};
    public String paymentContext;
    public MVVerificationStatus status;
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        IMAGE(4, "image"),
        CTA(5, "cta"),
        STATUS(6, ServerParameters.STATUS),
        ACCESSIBILITY_HINT(7, "accessibilityHint");
        
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
                    return PAYMENT_CONTEXT;
                case 2:
                    return TITLE;
                case 3:
                    return SUBTITLE;
                case 4:
                    return IMAGE;
                case 5:
                    return CTA;
                case 6:
                    return STATUS;
                case 7:
                    return ACCESSIBILITY_HINT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountCertificate$a */
    public static class C9849a extends C25239c<MVPaymentAccountCertificate> {
        public C9849a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountCertificate mVPaymentAccountCertificate = (MVPaymentAccountCertificate) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVPaymentAccountCertificate.image;
            C25113c cVar = MVPaymentAccountCertificate.f27404b;
            gVar.mo61687K();
            if (mVPaymentAccountCertificate.paymentContext != null && mVPaymentAccountCertificate.mo30107i()) {
                gVar.mo61711x(MVPaymentAccountCertificate.f27404b);
                gVar.mo61686J(mVPaymentAccountCertificate.paymentContext);
                gVar.mo61712y();
            }
            if (mVPaymentAccountCertificate.title != null && mVPaymentAccountCertificate.mo30110l()) {
                gVar.mo61711x(MVPaymentAccountCertificate.f27405c);
                gVar.mo61686J(mVPaymentAccountCertificate.title);
                gVar.mo61712y();
            }
            if (mVPaymentAccountCertificate.subtitle != null && mVPaymentAccountCertificate.mo30109k()) {
                gVar.mo61711x(MVPaymentAccountCertificate.f27406d);
                gVar.mo61686J(mVPaymentAccountCertificate.subtitle);
                gVar.mo61712y();
            }
            if (mVPaymentAccountCertificate.image != null && mVPaymentAccountCertificate.mo30105h()) {
                gVar.mo61711x(MVPaymentAccountCertificate.f27407e);
                mVPaymentAccountCertificate.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAccountCertificate.cta != null && mVPaymentAccountCertificate.mo30104g()) {
                gVar.mo61711x(MVPaymentAccountCertificate.f27408f);
                gVar.mo61686J(mVPaymentAccountCertificate.cta);
                gVar.mo61712y();
            }
            if (mVPaymentAccountCertificate.status != null) {
                gVar.mo61711x(MVPaymentAccountCertificate.f27409g);
                gVar.mo61678B(mVPaymentAccountCertificate.status.getValue());
                gVar.mo61712y();
            }
            if (mVPaymentAccountCertificate.accessibilityHint != null && mVPaymentAccountCertificate.mo30103f()) {
                gVar.mo61711x(MVPaymentAccountCertificate.f27410h);
                gVar.mo61686J(mVPaymentAccountCertificate.accessibilityHint);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountCertificate mVPaymentAccountCertificate = (MVPaymentAccountCertificate) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVPaymentAccountCertificate.image;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountCertificate.paymentContext = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountCertificate.title = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountCertificate.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVPaymentAccountCertificate.image = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountCertificate.cta = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountCertificate.status = MVVerificationStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccountCertificate.accessibilityHint = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountCertificate$b */
    public static class C9850b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9849a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountCertificate$c */
    public static class C9851c extends C25240d<MVPaymentAccountCertificate> {
        public C9851c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountCertificate mVPaymentAccountCertificate = (MVPaymentAccountCertificate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountCertificate.mo30107i()) {
                bitSet.set(0);
            }
            if (mVPaymentAccountCertificate.mo30110l()) {
                bitSet.set(1);
            }
            if (mVPaymentAccountCertificate.mo30109k()) {
                bitSet.set(2);
            }
            if (mVPaymentAccountCertificate.mo30105h()) {
                bitSet.set(3);
            }
            if (mVPaymentAccountCertificate.mo30104g()) {
                bitSet.set(4);
            }
            if (mVPaymentAccountCertificate.mo30108j()) {
                bitSet.set(5);
            }
            if (mVPaymentAccountCertificate.mo30103f()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVPaymentAccountCertificate.mo30107i()) {
                jVar.mo61686J(mVPaymentAccountCertificate.paymentContext);
            }
            if (mVPaymentAccountCertificate.mo30110l()) {
                jVar.mo61686J(mVPaymentAccountCertificate.title);
            }
            if (mVPaymentAccountCertificate.mo30109k()) {
                jVar.mo61686J(mVPaymentAccountCertificate.subtitle);
            }
            if (mVPaymentAccountCertificate.mo30105h()) {
                mVPaymentAccountCertificate.image.mo25202X0(jVar);
            }
            if (mVPaymentAccountCertificate.mo30104g()) {
                jVar.mo61686J(mVPaymentAccountCertificate.cta);
            }
            if (mVPaymentAccountCertificate.mo30108j()) {
                jVar.mo61678B(mVPaymentAccountCertificate.status.getValue());
            }
            if (mVPaymentAccountCertificate.mo30103f()) {
                jVar.mo61686J(mVPaymentAccountCertificate.accessibilityHint);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountCertificate mVPaymentAccountCertificate = (MVPaymentAccountCertificate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVPaymentAccountCertificate.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentAccountCertificate.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPaymentAccountCertificate.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVPaymentAccountCertificate.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVPaymentAccountCertificate.cta = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVPaymentAccountCertificate.status = MVVerificationStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                mVPaymentAccountCertificate.accessibilityHint = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountCertificate$d */
    public static class C9852d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9851c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountCertificate");
        HashMap hashMap = new HashMap();
        f27411i = hashMap;
        hashMap.put(C25239c.class, new C9850b());
        hashMap.put(C25240d.class, new C9852d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.CTA, new FieldMetaData("cta", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVVerificationStatus.class)));
        enumMap.put(_Fields.ACCESSIBILITY_HINT, new FieldMetaData("accessibilityHint", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27412j = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountCertificate.class, unmodifiableMap);
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
        ((C25238b) f27411i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27411i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPaymentAccountCertificate mVPaymentAccountCertificate = (MVPaymentAccountCertificate) obj;
        if (!getClass().equals(mVPaymentAccountCertificate.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountCertificate.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30107i()).compareTo(Boolean.valueOf(mVPaymentAccountCertificate.mo30107i()));
        if (compareTo2 != 0 || ((mo30107i() && (compareTo2 = this.paymentContext.compareTo(mVPaymentAccountCertificate.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo30110l()).compareTo(Boolean.valueOf(mVPaymentAccountCertificate.mo30110l()))) != 0 || ((mo30110l() && (compareTo2 = this.title.compareTo(mVPaymentAccountCertificate.title)) != 0) || (compareTo2 = Boolean.valueOf(mo30109k()).compareTo(Boolean.valueOf(mVPaymentAccountCertificate.mo30109k()))) != 0 || ((mo30109k() && (compareTo2 = this.subtitle.compareTo(mVPaymentAccountCertificate.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo30105h()).compareTo(Boolean.valueOf(mVPaymentAccountCertificate.mo30105h()))) != 0 || ((mo30105h() && (compareTo2 = this.image.compareTo(mVPaymentAccountCertificate.image)) != 0) || (compareTo2 = Boolean.valueOf(mo30104g()).compareTo(Boolean.valueOf(mVPaymentAccountCertificate.mo30104g()))) != 0 || ((mo30104g() && (compareTo2 = this.cta.compareTo(mVPaymentAccountCertificate.cta)) != 0) || (compareTo2 = Boolean.valueOf(mo30108j()).compareTo(Boolean.valueOf(mVPaymentAccountCertificate.mo30108j()))) != 0 || ((mo30108j() && (compareTo2 = this.status.compareTo(mVPaymentAccountCertificate.status)) != 0) || (compareTo2 = Boolean.valueOf(mo30103f()).compareTo(Boolean.valueOf(mVPaymentAccountCertificate.mo30103f()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo30103f() || (compareTo = this.accessibilityHint.compareTo(mVPaymentAccountCertificate.accessibilityHint)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentAccountCertificate)) {
            return false;
        }
        MVPaymentAccountCertificate mVPaymentAccountCertificate = (MVPaymentAccountCertificate) obj;
        boolean i = mo30107i();
        boolean i2 = mVPaymentAccountCertificate.mo30107i();
        if ((i || i2) && (!i || !i2 || !this.paymentContext.equals(mVPaymentAccountCertificate.paymentContext))) {
            return false;
        }
        boolean l = mo30110l();
        boolean l2 = mVPaymentAccountCertificate.mo30110l();
        if ((l || l2) && (!l || !l2 || !this.title.equals(mVPaymentAccountCertificate.title))) {
            return false;
        }
        boolean k = mo30109k();
        boolean k2 = mVPaymentAccountCertificate.mo30109k();
        if ((k || k2) && (!k || !k2 || !this.subtitle.equals(mVPaymentAccountCertificate.subtitle))) {
            return false;
        }
        boolean h = mo30105h();
        boolean h2 = mVPaymentAccountCertificate.mo30105h();
        if ((h || h2) && (!h || !h2 || !this.image.mo26245a(mVPaymentAccountCertificate.image))) {
            return false;
        }
        boolean g = mo30104g();
        boolean g2 = mVPaymentAccountCertificate.mo30104g();
        if ((g || g2) && (!g || !g2 || !this.cta.equals(mVPaymentAccountCertificate.cta))) {
            return false;
        }
        boolean j = mo30108j();
        boolean j2 = mVPaymentAccountCertificate.mo30108j();
        if ((j || j2) && (!j || !j2 || !this.status.equals(mVPaymentAccountCertificate.status))) {
            return false;
        }
        boolean f = mo30103f();
        boolean f2 = mVPaymentAccountCertificate.mo30103f();
        if ((f || f2) && (!f || !f2 || !this.accessibilityHint.equals(mVPaymentAccountCertificate.accessibilityHint))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30103f() {
        return this.accessibilityHint != null;
    }

    /* renamed from: g */
    public final boolean mo30104g() {
        return this.cta != null;
    }

    /* renamed from: h */
    public final boolean mo30105h() {
        return this.image != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30107i() {
        return this.paymentContext != null;
    }

    /* renamed from: j */
    public final boolean mo30108j() {
        return this.status != null;
    }

    /* renamed from: k */
    public final boolean mo30109k() {
        return this.subtitle != null;
    }

    /* renamed from: l */
    public final boolean mo30110l() {
        return this.title != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPaymentAccountCertificate(");
        boolean z2 = false;
        if (mo30107i()) {
            sb.append("paymentContext:");
            String str = this.paymentContext;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo30110l()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo30109k()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (mo30105h()) {
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
            z = false;
        }
        if (mo30104g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("cta:");
            String str4 = this.cta;
            if (str4 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str4);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("status:");
        MVVerificationStatus mVVerificationStatus = this.status;
        if (mVVerificationStatus == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVVerificationStatus);
        }
        if (mo30103f()) {
            sb.append(", ");
            sb.append("accessibilityHint:");
            String str5 = this.accessibilityHint;
            if (str5 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str5);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
