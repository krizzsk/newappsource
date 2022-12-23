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

public class MVReconnectInstructions implements TBase<MVReconnectInstructions, _Fields>, Serializable, Cloneable, Comparable<MVReconnectInstructions> {

    /* renamed from: b */
    public static final C25113c f27680b = new C25113c("image", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27681c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27682d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f27683e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27684f;
    public MVImageReferenceWithParams image;
    private _Fields[] optionals = {_Fields.IMAGE, _Fields.TITLE, _Fields.SUBTITLE};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        IMAGE(1, "image"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle");
        
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
                return IMAGE;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i != 3) {
                return null;
            }
            return SUBTITLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVReconnectInstructions$a */
    public static class C10049a extends C25239c<MVReconnectInstructions> {
        public C10049a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVReconnectInstructions mVReconnectInstructions = (MVReconnectInstructions) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVReconnectInstructions.image;
            C25113c cVar = MVReconnectInstructions.f27680b;
            gVar.mo61687K();
            if (mVReconnectInstructions.image != null && mVReconnectInstructions.mo30559f()) {
                gVar.mo61711x(MVReconnectInstructions.f27680b);
                mVReconnectInstructions.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVReconnectInstructions.title != null && mVReconnectInstructions.mo30561h()) {
                gVar.mo61711x(MVReconnectInstructions.f27681c);
                gVar.mo61686J(mVReconnectInstructions.title);
                gVar.mo61712y();
            }
            if (mVReconnectInstructions.subtitle != null && mVReconnectInstructions.mo30560g()) {
                gVar.mo61711x(MVReconnectInstructions.f27682d);
                gVar.mo61686J(mVReconnectInstructions.subtitle);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVReconnectInstructions mVReconnectInstructions = (MVReconnectInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVReconnectInstructions.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVReconnectInstructions.subtitle = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVReconnectInstructions.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                    mVReconnectInstructions.image = mVImageReferenceWithParams2;
                    mVImageReferenceWithParams2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVReconnectInstructions$b */
    public static class C10050b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10049a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVReconnectInstructions$c */
    public static class C10051c extends C25240d<MVReconnectInstructions> {
        public C10051c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVReconnectInstructions mVReconnectInstructions = (MVReconnectInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVReconnectInstructions.mo30559f()) {
                bitSet.set(0);
            }
            if (mVReconnectInstructions.mo30561h()) {
                bitSet.set(1);
            }
            if (mVReconnectInstructions.mo30560g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVReconnectInstructions.mo30559f()) {
                mVReconnectInstructions.image.mo25202X0(jVar);
            }
            if (mVReconnectInstructions.mo30561h()) {
                jVar.mo61686J(mVReconnectInstructions.title);
            }
            if (mVReconnectInstructions.mo30560g()) {
                jVar.mo61686J(mVReconnectInstructions.subtitle);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVReconnectInstructions mVReconnectInstructions = (MVReconnectInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVReconnectInstructions.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVReconnectInstructions.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVReconnectInstructions.subtitle = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVReconnectInstructions$d */
    public static class C10052d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10051c(0);
        }
    }

    static {
        new C17394d0("MVReconnectInstructions");
        HashMap hashMap = new HashMap();
        f27683e = hashMap;
        hashMap.put(C25239c.class, new C10050b());
        hashMap.put(C25240d.class, new C10052d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27684f = unmodifiableMap;
        FieldMetaData.m61947a(MVReconnectInstructions.class, unmodifiableMap);
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
        ((C25238b) f27683e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27683e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30556a(MVReconnectInstructions mVReconnectInstructions) {
        if (mVReconnectInstructions == null) {
            return false;
        }
        boolean f = mo30559f();
        boolean f2 = mVReconnectInstructions.mo30559f();
        if ((f || f2) && (!f || !f2 || !this.image.mo26245a(mVReconnectInstructions.image))) {
            return false;
        }
        boolean h = mo30561h();
        boolean h2 = mVReconnectInstructions.mo30561h();
        if ((h || h2) && (!h || !h2 || !this.title.equals(mVReconnectInstructions.title))) {
            return false;
        }
        boolean g = mo30560g();
        boolean g2 = mVReconnectInstructions.mo30560g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.subtitle.equals(mVReconnectInstructions.subtitle)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVReconnectInstructions mVReconnectInstructions = (MVReconnectInstructions) obj;
        if (!getClass().equals(mVReconnectInstructions.getClass())) {
            return getClass().getName().compareTo(mVReconnectInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30559f()).compareTo(Boolean.valueOf(mVReconnectInstructions.mo30559f()));
        if (compareTo2 != 0 || ((mo30559f() && (compareTo2 = this.image.compareTo(mVReconnectInstructions.image)) != 0) || (compareTo2 = Boolean.valueOf(mo30561h()).compareTo(Boolean.valueOf(mVReconnectInstructions.mo30561h()))) != 0 || ((mo30561h() && (compareTo2 = this.title.compareTo(mVReconnectInstructions.title)) != 0) || (compareTo2 = Boolean.valueOf(mo30560g()).compareTo(Boolean.valueOf(mVReconnectInstructions.mo30560g()))) != 0))) {
            return compareTo2;
        }
        if (!mo30560g() || (compareTo = this.subtitle.compareTo(mVReconnectInstructions.subtitle)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVReconnectInstructions)) {
            return mo30556a((MVReconnectInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30559f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo30560g() {
        return this.subtitle != null;
    }

    /* renamed from: h */
    public final boolean mo30561h() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVReconnectInstructions(");
        boolean z2 = false;
        if (mo30559f()) {
            sb.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo30561h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("title:");
            String str = this.title;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
        } else {
            z2 = z;
        }
        if (mo30560g()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("subtitle:");
            String str2 = this.subtitle;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
