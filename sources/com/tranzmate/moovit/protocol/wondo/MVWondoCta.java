package com.tranzmate.moovit.protocol.wondo;

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

public class MVWondoCta implements TBase<MVWondoCta, _Fields>, Serializable, Cloneable, Comparable<MVWondoCta> {

    /* renamed from: b */
    public static final C25113c f30707b = new C25113c(MessageButton.TEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30708c = new C25113c("uri", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30709d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30710e;
    public String text;
    public String uri;

    public enum _Fields implements C25085c {
        TEXT(1, MessageButton.TEXT),
        URI(2, "uri");
        
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
                return TEXT;
            }
            if (i != 2) {
                return null;
            }
            return URI;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCta$a */
    public static class C12029a extends C25239c<MVWondoCta> {
        public C12029a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoCta mVWondoCta = (MVWondoCta) tBase;
            mVWondoCta.getClass();
            C25113c cVar = MVWondoCta.f30707b;
            gVar.mo61687K();
            if (mVWondoCta.text != null) {
                gVar.mo61711x(MVWondoCta.f30707b);
                gVar.mo61686J(mVWondoCta.text);
                gVar.mo61712y();
            }
            if (mVWondoCta.uri != null) {
                gVar.mo61711x(MVWondoCta.f30708c);
                gVar.mo61686J(mVWondoCta.uri);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoCta mVWondoCta = (MVWondoCta) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoCta.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVWondoCta.uri = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVWondoCta.text = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCta$b */
    public static class C12030b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12029a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCta$c */
    public static class C12031c extends C25240d<MVWondoCta> {
        public C12031c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoCta mVWondoCta = (MVWondoCta) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoCta.mo35654f()) {
                bitSet.set(0);
            }
            if (mVWondoCta.mo35655g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVWondoCta.mo35654f()) {
                jVar.mo61686J(mVWondoCta.text);
            }
            if (mVWondoCta.mo35655g()) {
                jVar.mo61686J(mVWondoCta.uri);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoCta mVWondoCta = (MVWondoCta) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVWondoCta.text = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWondoCta.uri = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoCta$d */
    public static class C12032d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12031c(0);
        }
    }

    static {
        new C17394d0("MVWondoCta");
        HashMap hashMap = new HashMap();
        f30709d = hashMap;
        hashMap.put(C25239c.class, new C12030b());
        hashMap.put(C25240d.class, new C12032d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.URI, new FieldMetaData("uri", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30710e = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoCta.class, unmodifiableMap);
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
        ((C25238b) f30709d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30709d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35651a(MVWondoCta mVWondoCta) {
        if (mVWondoCta == null) {
            return false;
        }
        boolean f = mo35654f();
        boolean f2 = mVWondoCta.mo35654f();
        if ((f || f2) && (!f || !f2 || !this.text.equals(mVWondoCta.text))) {
            return false;
        }
        boolean g = mo35655g();
        boolean g2 = mVWondoCta.mo35655g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.uri.equals(mVWondoCta.uri)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoCta mVWondoCta = (MVWondoCta) obj;
        if (!getClass().equals(mVWondoCta.getClass())) {
            return getClass().getName().compareTo(mVWondoCta.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35654f()).compareTo(Boolean.valueOf(mVWondoCta.mo35654f()));
        if (compareTo2 != 0 || ((mo35654f() && (compareTo2 = this.text.compareTo(mVWondoCta.text)) != 0) || (compareTo2 = Boolean.valueOf(mo35655g()).compareTo(Boolean.valueOf(mVWondoCta.mo35655g()))) != 0)) {
            return compareTo2;
        }
        if (!mo35655g() || (compareTo = this.uri.compareTo(mVWondoCta.uri)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVWondoCta)) {
            return mo35651a((MVWondoCta) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35654f() {
        return this.text != null;
    }

    /* renamed from: g */
    public final boolean mo35655g() {
        return this.uri != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoCta(", "text:");
        String str = this.text;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("uri:");
        String str2 = this.uri;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
