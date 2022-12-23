package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.models.MessageButton;
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

public class MVConfirmation implements TBase<MVConfirmation, _Fields>, Serializable, Cloneable, Comparable<MVConfirmation> {

    /* renamed from: b */
    public static final C25113c f28699b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28700c = new C25113c(MessageButton.TEXT, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28701d = new C25113c("positiveText", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28702e = new C25113c("negetiveText", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f28703f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28704g;
    public String negetiveText;
    public String positiveText;
    public String text;
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        TEXT(2, MessageButton.TEXT),
        POSITIVE_TEXT(3, "positiveText"),
        NEGETIVE_TEXT(4, "negetiveText");
        
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
                return TEXT;
            }
            if (i == 3) {
                return POSITIVE_TEXT;
            }
            if (i != 4) {
                return null;
            }
            return NEGETIVE_TEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVConfirmation$a */
    public static class C10794a extends C25239c<MVConfirmation> {
        public C10794a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConfirmation mVConfirmation = (MVConfirmation) tBase;
            mVConfirmation.getClass();
            C25113c cVar = MVConfirmation.f28699b;
            gVar.mo61687K();
            if (mVConfirmation.title != null) {
                gVar.mo61711x(MVConfirmation.f28699b);
                gVar.mo61686J(mVConfirmation.title);
                gVar.mo61712y();
            }
            if (mVConfirmation.text != null) {
                gVar.mo61711x(MVConfirmation.f28700c);
                gVar.mo61686J(mVConfirmation.text);
                gVar.mo61712y();
            }
            if (mVConfirmation.positiveText != null) {
                gVar.mo61711x(MVConfirmation.f28701d);
                gVar.mo61686J(mVConfirmation.positiveText);
                gVar.mo61712y();
            }
            if (mVConfirmation.negetiveText != null) {
                gVar.mo61711x(MVConfirmation.f28702e);
                gVar.mo61686J(mVConfirmation.negetiveText);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConfirmation mVConfirmation = (MVConfirmation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVConfirmation.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVConfirmation.negetiveText = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVConfirmation.positiveText = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVConfirmation.text = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVConfirmation.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVConfirmation$b */
    public static class C10795b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10794a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVConfirmation$c */
    public static class C10796c extends C25240d<MVConfirmation> {
        public C10796c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConfirmation mVConfirmation = (MVConfirmation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVConfirmation.mo32373i()) {
                bitSet.set(0);
            }
            if (mVConfirmation.mo32371h()) {
                bitSet.set(1);
            }
            if (mVConfirmation.mo32370g()) {
                bitSet.set(2);
            }
            if (mVConfirmation.mo32369f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVConfirmation.mo32373i()) {
                jVar.mo61686J(mVConfirmation.title);
            }
            if (mVConfirmation.mo32371h()) {
                jVar.mo61686J(mVConfirmation.text);
            }
            if (mVConfirmation.mo32370g()) {
                jVar.mo61686J(mVConfirmation.positiveText);
            }
            if (mVConfirmation.mo32369f()) {
                jVar.mo61686J(mVConfirmation.negetiveText);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConfirmation mVConfirmation = (MVConfirmation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVConfirmation.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVConfirmation.text = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVConfirmation.positiveText = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVConfirmation.negetiveText = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVConfirmation$d */
    public static class C10797d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10796c(0);
        }
    }

    static {
        new C17394d0("MVConfirmation");
        HashMap hashMap = new HashMap();
        f28703f = hashMap;
        hashMap.put(C25239c.class, new C10795b());
        hashMap.put(C25240d.class, new C10797d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.POSITIVE_TEXT, new FieldMetaData("positiveText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NEGETIVE_TEXT, new FieldMetaData("negetiveText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28704g = unmodifiableMap;
        FieldMetaData.m61947a(MVConfirmation.class, unmodifiableMap);
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
        ((C25238b) f28703f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28703f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32366a(MVConfirmation mVConfirmation) {
        if (mVConfirmation == null) {
            return false;
        }
        boolean i = mo32373i();
        boolean i2 = mVConfirmation.mo32373i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVConfirmation.title))) {
            return false;
        }
        boolean h = mo32371h();
        boolean h2 = mVConfirmation.mo32371h();
        if ((h || h2) && (!h || !h2 || !this.text.equals(mVConfirmation.text))) {
            return false;
        }
        boolean g = mo32370g();
        boolean g2 = mVConfirmation.mo32370g();
        if ((g || g2) && (!g || !g2 || !this.positiveText.equals(mVConfirmation.positiveText))) {
            return false;
        }
        boolean f = mo32369f();
        boolean f2 = mVConfirmation.mo32369f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.negetiveText.equals(mVConfirmation.negetiveText)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVConfirmation mVConfirmation = (MVConfirmation) obj;
        if (!getClass().equals(mVConfirmation.getClass())) {
            return getClass().getName().compareTo(mVConfirmation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32373i()).compareTo(Boolean.valueOf(mVConfirmation.mo32373i()));
        if (compareTo2 != 0 || ((mo32373i() && (compareTo2 = this.title.compareTo(mVConfirmation.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32371h()).compareTo(Boolean.valueOf(mVConfirmation.mo32371h()))) != 0 || ((mo32371h() && (compareTo2 = this.text.compareTo(mVConfirmation.text)) != 0) || (compareTo2 = Boolean.valueOf(mo32370g()).compareTo(Boolean.valueOf(mVConfirmation.mo32370g()))) != 0 || ((mo32370g() && (compareTo2 = this.positiveText.compareTo(mVConfirmation.positiveText)) != 0) || (compareTo2 = Boolean.valueOf(mo32369f()).compareTo(Boolean.valueOf(mVConfirmation.mo32369f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo32369f() || (compareTo = this.negetiveText.compareTo(mVConfirmation.negetiveText)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVConfirmation)) {
            return mo32366a((MVConfirmation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32369f() {
        return this.negetiveText != null;
    }

    /* renamed from: g */
    public final boolean mo32370g() {
        return this.positiveText != null;
    }

    /* renamed from: h */
    public final boolean mo32371h() {
        return this.text != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32373i() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVConfirmation(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("text:");
        String str2 = this.text;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("positiveText:");
        String str3 = this.positiveText;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("negetiveText:");
        String str4 = this.negetiveText;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }
}
