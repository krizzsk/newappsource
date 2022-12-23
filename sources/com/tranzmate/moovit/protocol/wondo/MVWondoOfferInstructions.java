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

public class MVWondoOfferInstructions implements TBase<MVWondoOfferInstructions, _Fields>, Serializable, Cloneable, Comparable<MVWondoOfferInstructions> {

    /* renamed from: b */
    public static final C25113c f30741b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30742c = new C25113c("subtitle", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30743d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30744e;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOfferInstructions$a */
    public static class C12045a extends C25239c<MVWondoOfferInstructions> {
        public C12045a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoOfferInstructions mVWondoOfferInstructions = (MVWondoOfferInstructions) tBase;
            mVWondoOfferInstructions.getClass();
            C25113c cVar = MVWondoOfferInstructions.f30741b;
            gVar.mo61687K();
            if (mVWondoOfferInstructions.title != null && mVWondoOfferInstructions.mo35703g()) {
                gVar.mo61711x(MVWondoOfferInstructions.f30741b);
                gVar.mo61686J(mVWondoOfferInstructions.title);
                gVar.mo61712y();
            }
            if (mVWondoOfferInstructions.subtitle != null && mVWondoOfferInstructions.mo35702f()) {
                gVar.mo61711x(MVWondoOfferInstructions.f30742c);
                gVar.mo61686J(mVWondoOfferInstructions.subtitle);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoOfferInstructions mVWondoOfferInstructions = (MVWondoOfferInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoOfferInstructions.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVWondoOfferInstructions.subtitle = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVWondoOfferInstructions.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOfferInstructions$b */
    public static class C12046b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12045a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOfferInstructions$c */
    public static class C12047c extends C25240d<MVWondoOfferInstructions> {
        public C12047c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoOfferInstructions mVWondoOfferInstructions = (MVWondoOfferInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoOfferInstructions.mo35703g()) {
                bitSet.set(0);
            }
            if (mVWondoOfferInstructions.mo35702f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVWondoOfferInstructions.mo35703g()) {
                jVar.mo61686J(mVWondoOfferInstructions.title);
            }
            if (mVWondoOfferInstructions.mo35702f()) {
                jVar.mo61686J(mVWondoOfferInstructions.subtitle);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoOfferInstructions mVWondoOfferInstructions = (MVWondoOfferInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVWondoOfferInstructions.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWondoOfferInstructions.subtitle = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOfferInstructions$d */
    public static class C12048d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12047c(0);
        }
    }

    static {
        new C17394d0("MVWondoOfferInstructions");
        HashMap hashMap = new HashMap();
        f30743d = hashMap;
        hashMap.put(C25239c.class, new C12046b());
        hashMap.put(C25240d.class, new C12048d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30744e = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoOfferInstructions.class, unmodifiableMap);
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
        ((C25238b) f30743d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30743d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35699a(MVWondoOfferInstructions mVWondoOfferInstructions) {
        if (mVWondoOfferInstructions == null) {
            return false;
        }
        boolean g = mo35703g();
        boolean g2 = mVWondoOfferInstructions.mo35703g();
        if ((g || g2) && (!g || !g2 || !this.title.equals(mVWondoOfferInstructions.title))) {
            return false;
        }
        boolean f = mo35702f();
        boolean f2 = mVWondoOfferInstructions.mo35702f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.subtitle.equals(mVWondoOfferInstructions.subtitle)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoOfferInstructions mVWondoOfferInstructions = (MVWondoOfferInstructions) obj;
        if (!getClass().equals(mVWondoOfferInstructions.getClass())) {
            return getClass().getName().compareTo(mVWondoOfferInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35703g()).compareTo(Boolean.valueOf(mVWondoOfferInstructions.mo35703g()));
        if (compareTo2 != 0 || ((mo35703g() && (compareTo2 = this.title.compareTo(mVWondoOfferInstructions.title)) != 0) || (compareTo2 = Boolean.valueOf(mo35702f()).compareTo(Boolean.valueOf(mVWondoOfferInstructions.mo35702f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35702f() || (compareTo = this.subtitle.compareTo(mVWondoOfferInstructions.subtitle)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVWondoOfferInstructions)) {
            return mo35699a((MVWondoOfferInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35702f() {
        return this.subtitle != null;
    }

    /* renamed from: g */
    public final boolean mo35703g() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVWondoOfferInstructions(");
        if (mo35703g()) {
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
        if (mo35702f()) {
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
