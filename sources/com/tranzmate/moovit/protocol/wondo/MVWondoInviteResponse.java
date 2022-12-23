package com.tranzmate.moovit.protocol.wondo;

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

public class MVWondoInviteResponse implements TBase<MVWondoInviteResponse, _Fields>, Serializable, Cloneable, Comparable<MVWondoInviteResponse> {

    /* renamed from: b */
    public static final C25113c f30711b = new C25113c("imageUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30712c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30713d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30714e = new C25113c("actionText", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30715f = new C25113c("legalUrl", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f30716g = new C25113c("shareSubject", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f30717h = new C25113c("shareDescription", (byte) 11, 7);

    /* renamed from: i */
    public static final HashMap f30718i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f30719j;
    public String actionText;
    public String imageUrl;
    public String legalUrl;
    public String shareDescription;
    public String shareSubject;
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        IMAGE_URL(1, "imageUrl"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        ACTION_TEXT(4, "actionText"),
        LEGAL_URL(5, "legalUrl"),
        SHARE_SUBJECT(6, "shareSubject"),
        SHARE_DESCRIPTION(7, "shareDescription");
        
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
                    return IMAGE_URL;
                case 2:
                    return TITLE;
                case 3:
                    return SUBTITLE;
                case 4:
                    return ACTION_TEXT;
                case 5:
                    return LEGAL_URL;
                case 6:
                    return SHARE_SUBJECT;
                case 7:
                    return SHARE_DESCRIPTION;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoInviteResponse$a */
    public static class C12033a extends C25239c<MVWondoInviteResponse> {
        public C12033a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoInviteResponse mVWondoInviteResponse = (MVWondoInviteResponse) tBase;
            mVWondoInviteResponse.getClass();
            C25113c cVar = MVWondoInviteResponse.f30711b;
            gVar.mo61687K();
            if (mVWondoInviteResponse.imageUrl != null) {
                gVar.mo61711x(MVWondoInviteResponse.f30711b);
                gVar.mo61686J(mVWondoInviteResponse.imageUrl);
                gVar.mo61712y();
            }
            if (mVWondoInviteResponse.title != null) {
                gVar.mo61711x(MVWondoInviteResponse.f30712c);
                gVar.mo61686J(mVWondoInviteResponse.title);
                gVar.mo61712y();
            }
            if (mVWondoInviteResponse.subtitle != null) {
                gVar.mo61711x(MVWondoInviteResponse.f30713d);
                gVar.mo61686J(mVWondoInviteResponse.subtitle);
                gVar.mo61712y();
            }
            if (mVWondoInviteResponse.actionText != null) {
                gVar.mo61711x(MVWondoInviteResponse.f30714e);
                gVar.mo61686J(mVWondoInviteResponse.actionText);
                gVar.mo61712y();
            }
            if (mVWondoInviteResponse.legalUrl != null) {
                gVar.mo61711x(MVWondoInviteResponse.f30715f);
                gVar.mo61686J(mVWondoInviteResponse.legalUrl);
                gVar.mo61712y();
            }
            if (mVWondoInviteResponse.shareSubject != null) {
                gVar.mo61711x(MVWondoInviteResponse.f30716g);
                gVar.mo61686J(mVWondoInviteResponse.shareSubject);
                gVar.mo61712y();
            }
            if (mVWondoInviteResponse.shareDescription != null) {
                gVar.mo61711x(MVWondoInviteResponse.f30717h);
                gVar.mo61686J(mVWondoInviteResponse.shareDescription);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoInviteResponse mVWondoInviteResponse = (MVWondoInviteResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoInviteResponse.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoInviteResponse.imageUrl = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoInviteResponse.title = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoInviteResponse.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoInviteResponse.actionText = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoInviteResponse.legalUrl = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoInviteResponse.shareSubject = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoInviteResponse.shareDescription = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoInviteResponse$b */
    public static class C12034b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12033a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoInviteResponse$c */
    public static class C12035c extends C25240d<MVWondoInviteResponse> {
        public C12035c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoInviteResponse mVWondoInviteResponse = (MVWondoInviteResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoInviteResponse.mo35662g()) {
                bitSet.set(0);
            }
            if (mVWondoInviteResponse.mo35668l()) {
                bitSet.set(1);
            }
            if (mVWondoInviteResponse.mo35667k()) {
                bitSet.set(2);
            }
            if (mVWondoInviteResponse.mo35661f()) {
                bitSet.set(3);
            }
            if (mVWondoInviteResponse.mo35663h()) {
                bitSet.set(4);
            }
            if (mVWondoInviteResponse.mo35666j()) {
                bitSet.set(5);
            }
            if (mVWondoInviteResponse.mo35665i()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVWondoInviteResponse.mo35662g()) {
                jVar.mo61686J(mVWondoInviteResponse.imageUrl);
            }
            if (mVWondoInviteResponse.mo35668l()) {
                jVar.mo61686J(mVWondoInviteResponse.title);
            }
            if (mVWondoInviteResponse.mo35667k()) {
                jVar.mo61686J(mVWondoInviteResponse.subtitle);
            }
            if (mVWondoInviteResponse.mo35661f()) {
                jVar.mo61686J(mVWondoInviteResponse.actionText);
            }
            if (mVWondoInviteResponse.mo35663h()) {
                jVar.mo61686J(mVWondoInviteResponse.legalUrl);
            }
            if (mVWondoInviteResponse.mo35666j()) {
                jVar.mo61686J(mVWondoInviteResponse.shareSubject);
            }
            if (mVWondoInviteResponse.mo35665i()) {
                jVar.mo61686J(mVWondoInviteResponse.shareDescription);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoInviteResponse mVWondoInviteResponse = (MVWondoInviteResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVWondoInviteResponse.imageUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWondoInviteResponse.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVWondoInviteResponse.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVWondoInviteResponse.actionText = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVWondoInviteResponse.legalUrl = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVWondoInviteResponse.shareSubject = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVWondoInviteResponse.shareDescription = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoInviteResponse$d */
    public static class C12036d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12035c(0);
        }
    }

    static {
        new C17394d0("MVWondoInviteResponse");
        HashMap hashMap = new HashMap();
        f30718i = hashMap;
        hashMap.put(C25239c.class, new C12034b());
        hashMap.put(C25240d.class, new C12036d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE_URL, new FieldMetaData("imageUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_TEXT, new FieldMetaData("actionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEGAL_URL, new FieldMetaData("legalUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SHARE_SUBJECT, new FieldMetaData("shareSubject", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SHARE_DESCRIPTION, new FieldMetaData("shareDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30719j = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoInviteResponse.class, unmodifiableMap);
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
        ((C25238b) f30718i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30718i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoInviteResponse mVWondoInviteResponse = (MVWondoInviteResponse) obj;
        if (!getClass().equals(mVWondoInviteResponse.getClass())) {
            return getClass().getName().compareTo(mVWondoInviteResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35662g()).compareTo(Boolean.valueOf(mVWondoInviteResponse.mo35662g()));
        if (compareTo2 != 0 || ((mo35662g() && (compareTo2 = this.imageUrl.compareTo(mVWondoInviteResponse.imageUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35668l()).compareTo(Boolean.valueOf(mVWondoInviteResponse.mo35668l()))) != 0 || ((mo35668l() && (compareTo2 = this.title.compareTo(mVWondoInviteResponse.title)) != 0) || (compareTo2 = Boolean.valueOf(mo35667k()).compareTo(Boolean.valueOf(mVWondoInviteResponse.mo35667k()))) != 0 || ((mo35667k() && (compareTo2 = this.subtitle.compareTo(mVWondoInviteResponse.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo35661f()).compareTo(Boolean.valueOf(mVWondoInviteResponse.mo35661f()))) != 0 || ((mo35661f() && (compareTo2 = this.actionText.compareTo(mVWondoInviteResponse.actionText)) != 0) || (compareTo2 = Boolean.valueOf(mo35663h()).compareTo(Boolean.valueOf(mVWondoInviteResponse.mo35663h()))) != 0 || ((mo35663h() && (compareTo2 = this.legalUrl.compareTo(mVWondoInviteResponse.legalUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35666j()).compareTo(Boolean.valueOf(mVWondoInviteResponse.mo35666j()))) != 0 || ((mo35666j() && (compareTo2 = this.shareSubject.compareTo(mVWondoInviteResponse.shareSubject)) != 0) || (compareTo2 = Boolean.valueOf(mo35665i()).compareTo(Boolean.valueOf(mVWondoInviteResponse.mo35665i()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo35665i() || (compareTo = this.shareDescription.compareTo(mVWondoInviteResponse.shareDescription)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWondoInviteResponse)) {
            return false;
        }
        MVWondoInviteResponse mVWondoInviteResponse = (MVWondoInviteResponse) obj;
        boolean g = mo35662g();
        boolean g2 = mVWondoInviteResponse.mo35662g();
        if ((g || g2) && (!g || !g2 || !this.imageUrl.equals(mVWondoInviteResponse.imageUrl))) {
            return false;
        }
        boolean l = mo35668l();
        boolean l2 = mVWondoInviteResponse.mo35668l();
        if ((l || l2) && (!l || !l2 || !this.title.equals(mVWondoInviteResponse.title))) {
            return false;
        }
        boolean k = mo35667k();
        boolean k2 = mVWondoInviteResponse.mo35667k();
        if ((k || k2) && (!k || !k2 || !this.subtitle.equals(mVWondoInviteResponse.subtitle))) {
            return false;
        }
        boolean f = mo35661f();
        boolean f2 = mVWondoInviteResponse.mo35661f();
        if ((f || f2) && (!f || !f2 || !this.actionText.equals(mVWondoInviteResponse.actionText))) {
            return false;
        }
        boolean h = mo35663h();
        boolean h2 = mVWondoInviteResponse.mo35663h();
        if ((h || h2) && (!h || !h2 || !this.legalUrl.equals(mVWondoInviteResponse.legalUrl))) {
            return false;
        }
        boolean j = mo35666j();
        boolean j2 = mVWondoInviteResponse.mo35666j();
        if ((j || j2) && (!j || !j2 || !this.shareSubject.equals(mVWondoInviteResponse.shareSubject))) {
            return false;
        }
        boolean i = mo35665i();
        boolean i2 = mVWondoInviteResponse.mo35665i();
        if ((i || i2) && (!i || !i2 || !this.shareDescription.equals(mVWondoInviteResponse.shareDescription))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35661f() {
        return this.actionText != null;
    }

    /* renamed from: g */
    public final boolean mo35662g() {
        return this.imageUrl != null;
    }

    /* renamed from: h */
    public final boolean mo35663h() {
        return this.legalUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35665i() {
        return this.shareDescription != null;
    }

    /* renamed from: j */
    public final boolean mo35666j() {
        return this.shareSubject != null;
    }

    /* renamed from: k */
    public final boolean mo35667k() {
        return this.subtitle != null;
    }

    /* renamed from: l */
    public final boolean mo35668l() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoInviteResponse(", "imageUrl:");
        String str = this.imageUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("subtitle:");
        String str3 = this.subtitle;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("actionText:");
        String str4 = this.actionText;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("legalUrl:");
        String str5 = this.legalUrl;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("shareSubject:");
        String str6 = this.shareSubject;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        n.append(", ");
        n.append("shareDescription:");
        String str7 = this.shareDescription;
        if (str7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str7);
        }
        n.append(")");
        return n.toString();
    }
}
