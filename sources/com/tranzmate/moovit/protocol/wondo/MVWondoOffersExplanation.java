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

public class MVWondoOffersExplanation implements TBase<MVWondoOffersExplanation, _Fields>, Serializable, Cloneable, Comparable<MVWondoOffersExplanation> {

    /* renamed from: b */
    public static final C25113c f30749b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30750c = new C25113c("subtitle", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30751d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30752e;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.SUBTITLE};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        SUBTITLE(2, "subtitle");
        
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
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOffersExplanation$a */
    public static class C12053a extends C25239c<MVWondoOffersExplanation> {
        public C12053a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoOffersExplanation mVWondoOffersExplanation = (MVWondoOffersExplanation) tBase;
            mVWondoOffersExplanation.getClass();
            C25113c cVar = MVWondoOffersExplanation.f30749b;
            gVar.mo61687K();
            if (mVWondoOffersExplanation.title != null && mVWondoOffersExplanation.mo35718g()) {
                gVar.mo61711x(MVWondoOffersExplanation.f30749b);
                gVar.mo61686J(mVWondoOffersExplanation.title);
                gVar.mo61712y();
            }
            if (mVWondoOffersExplanation.subtitle != null && mVWondoOffersExplanation.mo35717f()) {
                gVar.mo61711x(MVWondoOffersExplanation.f30750c);
                gVar.mo61686J(mVWondoOffersExplanation.subtitle);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoOffersExplanation mVWondoOffersExplanation = (MVWondoOffersExplanation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoOffersExplanation.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVWondoOffersExplanation.subtitle = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVWondoOffersExplanation.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOffersExplanation$b */
    public static class C12054b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12053a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOffersExplanation$c */
    public static class C12055c extends C25240d<MVWondoOffersExplanation> {
        public C12055c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoOffersExplanation mVWondoOffersExplanation = (MVWondoOffersExplanation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoOffersExplanation.mo35718g()) {
                bitSet.set(0);
            }
            if (mVWondoOffersExplanation.mo35717f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVWondoOffersExplanation.mo35718g()) {
                jVar.mo61686J(mVWondoOffersExplanation.title);
            }
            if (mVWondoOffersExplanation.mo35717f()) {
                jVar.mo61686J(mVWondoOffersExplanation.subtitle);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoOffersExplanation mVWondoOffersExplanation = (MVWondoOffersExplanation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVWondoOffersExplanation.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWondoOffersExplanation.subtitle = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOffersExplanation$d */
    public static class C12056d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12055c(0);
        }
    }

    static {
        new C17394d0("MVWondoOffersExplanation");
        HashMap hashMap = new HashMap();
        f30751d = hashMap;
        hashMap.put(C25239c.class, new C12054b());
        hashMap.put(C25240d.class, new C12056d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30752e = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoOffersExplanation.class, unmodifiableMap);
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
        ((C25238b) f30751d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30751d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35714a(MVWondoOffersExplanation mVWondoOffersExplanation) {
        if (mVWondoOffersExplanation == null) {
            return false;
        }
        boolean g = mo35718g();
        boolean g2 = mVWondoOffersExplanation.mo35718g();
        if ((g || g2) && (!g || !g2 || !this.title.equals(mVWondoOffersExplanation.title))) {
            return false;
        }
        boolean f = mo35717f();
        boolean f2 = mVWondoOffersExplanation.mo35717f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.subtitle.equals(mVWondoOffersExplanation.subtitle)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoOffersExplanation mVWondoOffersExplanation = (MVWondoOffersExplanation) obj;
        if (!getClass().equals(mVWondoOffersExplanation.getClass())) {
            return getClass().getName().compareTo(mVWondoOffersExplanation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35718g()).compareTo(Boolean.valueOf(mVWondoOffersExplanation.mo35718g()));
        if (compareTo2 != 0 || ((mo35718g() && (compareTo2 = this.title.compareTo(mVWondoOffersExplanation.title)) != 0) || (compareTo2 = Boolean.valueOf(mo35717f()).compareTo(Boolean.valueOf(mVWondoOffersExplanation.mo35717f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35717f() || (compareTo = this.subtitle.compareTo(mVWondoOffersExplanation.subtitle)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVWondoOffersExplanation)) {
            return mo35714a((MVWondoOffersExplanation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35717f() {
        return this.subtitle != null;
    }

    /* renamed from: g */
    public final boolean mo35718g() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVWondoOffersExplanation(");
        if (mo35718g()) {
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
        if (mo35717f()) {
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
        }
        sb.append(")");
        return sb.toString();
    }
}
