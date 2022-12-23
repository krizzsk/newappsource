package com.tranzmate.moovit.protocol.payments;

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

public class MVEmailVerificationInstructions implements TBase<MVEmailVerificationInstructions, _Fields>, Serializable, Cloneable, Comparable<MVEmailVerificationInstructions> {

    /* renamed from: b */
    public static final C25113c f27243b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27244c = new C25113c("subtitle", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27245d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27246e;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVEmailVerificationInstructions$a */
    public static class C9724a extends C25239c<MVEmailVerificationInstructions> {
        public C9724a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmailVerificationInstructions mVEmailVerificationInstructions = (MVEmailVerificationInstructions) tBase;
            mVEmailVerificationInstructions.getClass();
            C25113c cVar = MVEmailVerificationInstructions.f27243b;
            gVar.mo61687K();
            if (mVEmailVerificationInstructions.title != null) {
                gVar.mo61711x(MVEmailVerificationInstructions.f27243b);
                gVar.mo61686J(mVEmailVerificationInstructions.title);
                gVar.mo61712y();
            }
            if (mVEmailVerificationInstructions.subtitle != null) {
                gVar.mo61711x(MVEmailVerificationInstructions.f27244c);
                gVar.mo61686J(mVEmailVerificationInstructions.subtitle);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmailVerificationInstructions mVEmailVerificationInstructions = (MVEmailVerificationInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVEmailVerificationInstructions.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVEmailVerificationInstructions.subtitle = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVEmailVerificationInstructions.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVEmailVerificationInstructions$b */
    public static class C9725b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9724a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVEmailVerificationInstructions$c */
    public static class C9726c extends C25240d<MVEmailVerificationInstructions> {
        public C9726c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmailVerificationInstructions mVEmailVerificationInstructions = (MVEmailVerificationInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEmailVerificationInstructions.mo29828g()) {
                bitSet.set(0);
            }
            if (mVEmailVerificationInstructions.mo29827f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVEmailVerificationInstructions.mo29828g()) {
                jVar.mo61686J(mVEmailVerificationInstructions.title);
            }
            if (mVEmailVerificationInstructions.mo29827f()) {
                jVar.mo61686J(mVEmailVerificationInstructions.subtitle);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmailVerificationInstructions mVEmailVerificationInstructions = (MVEmailVerificationInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVEmailVerificationInstructions.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVEmailVerificationInstructions.subtitle = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVEmailVerificationInstructions$d */
    public static class C9727d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9726c(0);
        }
    }

    static {
        new C17394d0("MVEmailVerificationInstructions");
        HashMap hashMap = new HashMap();
        f27245d = hashMap;
        hashMap.put(C25239c.class, new C9725b());
        hashMap.put(C25240d.class, new C9727d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27246e = unmodifiableMap;
        FieldMetaData.m61947a(MVEmailVerificationInstructions.class, unmodifiableMap);
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
        ((C25238b) f27245d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27245d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29824a(MVEmailVerificationInstructions mVEmailVerificationInstructions) {
        if (mVEmailVerificationInstructions == null) {
            return false;
        }
        boolean g = mo29828g();
        boolean g2 = mVEmailVerificationInstructions.mo29828g();
        if ((g || g2) && (!g || !g2 || !this.title.equals(mVEmailVerificationInstructions.title))) {
            return false;
        }
        boolean f = mo29827f();
        boolean f2 = mVEmailVerificationInstructions.mo29827f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.subtitle.equals(mVEmailVerificationInstructions.subtitle)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVEmailVerificationInstructions mVEmailVerificationInstructions = (MVEmailVerificationInstructions) obj;
        if (!getClass().equals(mVEmailVerificationInstructions.getClass())) {
            return getClass().getName().compareTo(mVEmailVerificationInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29828g()).compareTo(Boolean.valueOf(mVEmailVerificationInstructions.mo29828g()));
        if (compareTo2 != 0 || ((mo29828g() && (compareTo2 = this.title.compareTo(mVEmailVerificationInstructions.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29827f()).compareTo(Boolean.valueOf(mVEmailVerificationInstructions.mo29827f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29827f() || (compareTo = this.subtitle.compareTo(mVEmailVerificationInstructions.subtitle)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVEmailVerificationInstructions)) {
            return mo29824a((MVEmailVerificationInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29827f() {
        return this.subtitle != null;
    }

    /* renamed from: g */
    public final boolean mo29828g() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVEmailVerificationInstructions(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("subtitle:");
        String str2 = this.subtitle;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
