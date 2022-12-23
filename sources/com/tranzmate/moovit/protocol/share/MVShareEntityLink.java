package com.tranzmate.moovit.protocol.share;

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

public class MVShareEntityLink implements TBase<MVShareEntityLink, _Fields>, Serializable, Cloneable, Comparable<MVShareEntityLink> {

    /* renamed from: b */
    public static final C25113c f28315b = new C25113c("url", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28316c = new C25113c("displayTitle", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28317d = new C25113c("displayMessage", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f28318e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28319f;
    public String displayMessage;
    public String displayTitle;
    public String url;

    public enum _Fields implements C25085c {
        URL(1, "url"),
        DISPLAY_TITLE(2, "displayTitle"),
        DISPLAY_MESSAGE(3, "displayMessage");
        
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
                return URL;
            }
            if (i == 2) {
                return DISPLAY_TITLE;
            }
            if (i != 3) {
                return null;
            }
            return DISPLAY_MESSAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.share.MVShareEntityLink$a */
    public static class C10527a extends C25239c<MVShareEntityLink> {
        public C10527a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVShareEntityLink mVShareEntityLink = (MVShareEntityLink) tBase;
            mVShareEntityLink.getClass();
            C25113c cVar = MVShareEntityLink.f28315b;
            gVar.mo61687K();
            if (mVShareEntityLink.url != null) {
                gVar.mo61711x(MVShareEntityLink.f28315b);
                gVar.mo61686J(mVShareEntityLink.url);
                gVar.mo61712y();
            }
            if (mVShareEntityLink.displayTitle != null) {
                gVar.mo61711x(MVShareEntityLink.f28316c);
                gVar.mo61686J(mVShareEntityLink.displayTitle);
                gVar.mo61712y();
            }
            if (mVShareEntityLink.displayMessage != null) {
                gVar.mo61711x(MVShareEntityLink.f28317d);
                gVar.mo61686J(mVShareEntityLink.displayMessage);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVShareEntityLink mVShareEntityLink = (MVShareEntityLink) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVShareEntityLink.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVShareEntityLink.displayMessage = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVShareEntityLink.displayTitle = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVShareEntityLink.url = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.share.MVShareEntityLink$b */
    public static class C10528b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10527a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.share.MVShareEntityLink$c */
    public static class C10529c extends C25240d<MVShareEntityLink> {
        public C10529c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVShareEntityLink mVShareEntityLink = (MVShareEntityLink) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVShareEntityLink.mo31720h()) {
                bitSet.set(0);
            }
            if (mVShareEntityLink.mo31719g()) {
                bitSet.set(1);
            }
            if (mVShareEntityLink.mo31718f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVShareEntityLink.mo31720h()) {
                jVar.mo61686J(mVShareEntityLink.url);
            }
            if (mVShareEntityLink.mo31719g()) {
                jVar.mo61686J(mVShareEntityLink.displayTitle);
            }
            if (mVShareEntityLink.mo31718f()) {
                jVar.mo61686J(mVShareEntityLink.displayMessage);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVShareEntityLink mVShareEntityLink = (MVShareEntityLink) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVShareEntityLink.url = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVShareEntityLink.displayTitle = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVShareEntityLink.displayMessage = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.share.MVShareEntityLink$d */
    public static class C10530d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10529c(0);
        }
    }

    static {
        new C17394d0("MVShareEntityLink");
        HashMap hashMap = new HashMap();
        f28318e = hashMap;
        hashMap.put(C25239c.class, new C10528b());
        hashMap.put(C25240d.class, new C10530d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.URL, new FieldMetaData("url", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DISPLAY_TITLE, new FieldMetaData("displayTitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DISPLAY_MESSAGE, new FieldMetaData("displayMessage", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28319f = unmodifiableMap;
        FieldMetaData.m61947a(MVShareEntityLink.class, unmodifiableMap);
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
        ((C25238b) f28318e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28318e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31715a(MVShareEntityLink mVShareEntityLink) {
        if (mVShareEntityLink == null) {
            return false;
        }
        boolean h = mo31720h();
        boolean h2 = mVShareEntityLink.mo31720h();
        if ((h || h2) && (!h || !h2 || !this.url.equals(mVShareEntityLink.url))) {
            return false;
        }
        boolean g = mo31719g();
        boolean g2 = mVShareEntityLink.mo31719g();
        if ((g || g2) && (!g || !g2 || !this.displayTitle.equals(mVShareEntityLink.displayTitle))) {
            return false;
        }
        boolean f = mo31718f();
        boolean f2 = mVShareEntityLink.mo31718f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.displayMessage.equals(mVShareEntityLink.displayMessage)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVShareEntityLink mVShareEntityLink = (MVShareEntityLink) obj;
        if (!getClass().equals(mVShareEntityLink.getClass())) {
            return getClass().getName().compareTo(mVShareEntityLink.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31720h()).compareTo(Boolean.valueOf(mVShareEntityLink.mo31720h()));
        if (compareTo2 != 0 || ((mo31720h() && (compareTo2 = this.url.compareTo(mVShareEntityLink.url)) != 0) || (compareTo2 = Boolean.valueOf(mo31719g()).compareTo(Boolean.valueOf(mVShareEntityLink.mo31719g()))) != 0 || ((mo31719g() && (compareTo2 = this.displayTitle.compareTo(mVShareEntityLink.displayTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo31718f()).compareTo(Boolean.valueOf(mVShareEntityLink.mo31718f()))) != 0))) {
            return compareTo2;
        }
        if (!mo31718f() || (compareTo = this.displayMessage.compareTo(mVShareEntityLink.displayMessage)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVShareEntityLink)) {
            return mo31715a((MVShareEntityLink) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31718f() {
        return this.displayMessage != null;
    }

    /* renamed from: g */
    public final boolean mo31719g() {
        return this.displayTitle != null;
    }

    /* renamed from: h */
    public final boolean mo31720h() {
        return this.url != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVShareEntityLink(", "url:");
        String str = this.url;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("displayTitle:");
        String str2 = this.displayTitle;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("displayMessage:");
        String str3 = this.displayMessage;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(")");
        return n.toString();
    }
}
