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

public class MVCashInstructions implements TBase<MVCashInstructions, _Fields>, Serializable, Cloneable, Comparable<MVCashInstructions> {

    /* renamed from: b */
    public static final C25113c f27150b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27151c = new C25113c("subtitle", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27152d = new C25113c("image", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f27153e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27154f;
    public MVImageReferenceWithParams image;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.SUBTITLE, _Fields.IMAGE};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        SUBTITLE(2, "subtitle"),
        IMAGE(3, "image");
        
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
            if (i != 3) {
                return null;
            }
            return IMAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCashInstructions$a */
    public static class C9636a extends C25239c<MVCashInstructions> {
        public C9636a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCashInstructions mVCashInstructions = (MVCashInstructions) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVCashInstructions.image;
            C25113c cVar = MVCashInstructions.f27150b;
            gVar.mo61687K();
            if (mVCashInstructions.title != null && mVCashInstructions.mo29661h()) {
                gVar.mo61711x(MVCashInstructions.f27150b);
                gVar.mo61686J(mVCashInstructions.title);
                gVar.mo61712y();
            }
            if (mVCashInstructions.subtitle != null && mVCashInstructions.mo29660g()) {
                gVar.mo61711x(MVCashInstructions.f27151c);
                gVar.mo61686J(mVCashInstructions.subtitle);
                gVar.mo61712y();
            }
            if (mVCashInstructions.image != null && mVCashInstructions.mo29659f()) {
                gVar.mo61711x(MVCashInstructions.f27152d);
                mVCashInstructions.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCashInstructions mVCashInstructions = (MVCashInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVCashInstructions.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVCashInstructions.image = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCashInstructions.subtitle = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCashInstructions.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCashInstructions$b */
    public static class C9637b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9636a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCashInstructions$c */
    public static class C9638c extends C25240d<MVCashInstructions> {
        public C9638c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCashInstructions mVCashInstructions = (MVCashInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCashInstructions.mo29661h()) {
                bitSet.set(0);
            }
            if (mVCashInstructions.mo29660g()) {
                bitSet.set(1);
            }
            if (mVCashInstructions.mo29659f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCashInstructions.mo29661h()) {
                jVar.mo61686J(mVCashInstructions.title);
            }
            if (mVCashInstructions.mo29660g()) {
                jVar.mo61686J(mVCashInstructions.subtitle);
            }
            if (mVCashInstructions.mo29659f()) {
                mVCashInstructions.image.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCashInstructions mVCashInstructions = (MVCashInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVCashInstructions.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCashInstructions.subtitle = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVCashInstructions.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCashInstructions$d */
    public static class C9639d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9638c(0);
        }
    }

    static {
        new C17394d0("MVCashInstructions");
        HashMap hashMap = new HashMap();
        f27153e = hashMap;
        hashMap.put(C25239c.class, new C9637b());
        hashMap.put(C25240d.class, new C9639d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27154f = unmodifiableMap;
        FieldMetaData.m61947a(MVCashInstructions.class, unmodifiableMap);
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
        ((C25238b) f27153e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27153e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29656a(MVCashInstructions mVCashInstructions) {
        if (mVCashInstructions == null) {
            return false;
        }
        boolean h = mo29661h();
        boolean h2 = mVCashInstructions.mo29661h();
        if ((h || h2) && (!h || !h2 || !this.title.equals(mVCashInstructions.title))) {
            return false;
        }
        boolean g = mo29660g();
        boolean g2 = mVCashInstructions.mo29660g();
        if ((g || g2) && (!g || !g2 || !this.subtitle.equals(mVCashInstructions.subtitle))) {
            return false;
        }
        boolean f = mo29659f();
        boolean f2 = mVCashInstructions.mo29659f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.image.mo26245a(mVCashInstructions.image)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCashInstructions mVCashInstructions = (MVCashInstructions) obj;
        if (!getClass().equals(mVCashInstructions.getClass())) {
            return getClass().getName().compareTo(mVCashInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29661h()).compareTo(Boolean.valueOf(mVCashInstructions.mo29661h()));
        if (compareTo2 != 0 || ((mo29661h() && (compareTo2 = this.title.compareTo(mVCashInstructions.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29660g()).compareTo(Boolean.valueOf(mVCashInstructions.mo29660g()))) != 0 || ((mo29660g() && (compareTo2 = this.subtitle.compareTo(mVCashInstructions.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo29659f()).compareTo(Boolean.valueOf(mVCashInstructions.mo29659f()))) != 0))) {
            return compareTo2;
        }
        if (!mo29659f() || (compareTo = this.image.compareTo(mVCashInstructions.image)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCashInstructions)) {
            return mo29656a((MVCashInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29659f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo29660g() {
        return this.subtitle != null;
    }

    /* renamed from: h */
    public final boolean mo29661h() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVCashInstructions(");
        boolean z2 = false;
        if (mo29661h()) {
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
        if (mo29660g()) {
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
        } else {
            z2 = z;
        }
        if (mo29659f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
