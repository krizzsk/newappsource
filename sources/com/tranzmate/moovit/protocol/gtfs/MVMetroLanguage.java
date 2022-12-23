package com.tranzmate.moovit.protocol.gtfs;

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
import p001a0.C0017h;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVMetroLanguage implements TBase<MVMetroLanguage, _Fields>, Serializable, Cloneable, Comparable<MVMetroLanguage> {

    /* renamed from: b */
    public static final C25113c f25761b = new C25113c("name", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25762c = new C25113c(LinksConfiguration.KEY_KEY, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25763d = new C25113c("isDefault", (byte) 2, 3);

    /* renamed from: e */
    public static final HashMap f25764e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25765f;
    private byte __isset_bitfield = 0;
    public boolean isDefault;
    public String key;
    public String name;

    public enum _Fields implements C25085c {
        NAME(1, "name"),
        KEY(2, LinksConfiguration.KEY_KEY),
        IS_DEFAULT(3, "isDefault");
        
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
                return NAME;
            }
            if (i == 2) {
                return KEY;
            }
            if (i != 3) {
                return null;
            }
            return IS_DEFAULT;
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroLanguage$a */
    public static class C8803a extends C25239c<MVMetroLanguage> {
        public C8803a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroLanguage mVMetroLanguage = (MVMetroLanguage) tBase;
            mVMetroLanguage.getClass();
            C25113c cVar = MVMetroLanguage.f25761b;
            gVar.mo61687K();
            if (mVMetroLanguage.name != null) {
                gVar.mo61711x(MVMetroLanguage.f25761b);
                gVar.mo61686J(mVMetroLanguage.name);
                gVar.mo61712y();
            }
            if (mVMetroLanguage.key != null) {
                gVar.mo61711x(MVMetroLanguage.f25762c);
                gVar.mo61686J(mVMetroLanguage.key);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVMetroLanguage.f25763d);
            C0017h.m62S(gVar, mVMetroLanguage.isDefault);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroLanguage mVMetroLanguage = (MVMetroLanguage) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMetroLanguage.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 2) {
                            mVMetroLanguage.isDefault = gVar.mo61690c();
                            mVMetroLanguage.mo27448i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMetroLanguage.key = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMetroLanguage.name = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroLanguage$b */
    public static class C8804b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8803a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroLanguage$c */
    public static class C8805c extends C25240d<MVMetroLanguage> {
        public C8805c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroLanguage mVMetroLanguage = (MVMetroLanguage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMetroLanguage.mo27446h()) {
                bitSet.set(0);
            }
            if (mVMetroLanguage.mo27445g()) {
                bitSet.set(1);
            }
            if (mVMetroLanguage.mo27444f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMetroLanguage.mo27446h()) {
                jVar.mo61686J(mVMetroLanguage.name);
            }
            if (mVMetroLanguage.mo27445g()) {
                jVar.mo61686J(mVMetroLanguage.key);
            }
            if (mVMetroLanguage.mo27444f()) {
                jVar.mo61708u(mVMetroLanguage.isDefault);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroLanguage mVMetroLanguage = (MVMetroLanguage) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVMetroLanguage.name = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMetroLanguage.key = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMetroLanguage.isDefault = jVar.mo61690c();
                mVMetroLanguage.mo27448i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVMetroLanguage$d */
    public static class C8806d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8805c(0);
        }
    }

    static {
        new C17394d0("MVMetroLanguage");
        HashMap hashMap = new HashMap();
        f25764e = hashMap;
        hashMap.put(C25239c.class, new C8804b());
        hashMap.put(C25240d.class, new C8806d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.KEY, new FieldMetaData(LinksConfiguration.KEY_KEY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_DEFAULT, new FieldMetaData("isDefault", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25765f = unmodifiableMap;
        FieldMetaData.m61947a(MVMetroLanguage.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f25764e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25764e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo27441a(MVMetroLanguage mVMetroLanguage) {
        if (mVMetroLanguage == null) {
            return false;
        }
        boolean h = mo27446h();
        boolean h2 = mVMetroLanguage.mo27446h();
        if ((h || h2) && (!h || !h2 || !this.name.equals(mVMetroLanguage.name))) {
            return false;
        }
        boolean g = mo27445g();
        boolean g2 = mVMetroLanguage.mo27445g();
        if (((g || g2) && (!g || !g2 || !this.key.equals(mVMetroLanguage.key))) || this.isDefault != mVMetroLanguage.isDefault) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVMetroLanguage mVMetroLanguage = (MVMetroLanguage) obj;
        if (!getClass().equals(mVMetroLanguage.getClass())) {
            return getClass().getName().compareTo(mVMetroLanguage.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27446h()).compareTo(Boolean.valueOf(mVMetroLanguage.mo27446h()));
        if (compareTo != 0 || ((mo27446h() && (compareTo = this.name.compareTo(mVMetroLanguage.name)) != 0) || (compareTo = Boolean.valueOf(mo27445g()).compareTo(Boolean.valueOf(mVMetroLanguage.mo27445g()))) != 0 || ((mo27445g() && (compareTo = this.key.compareTo(mVMetroLanguage.key)) != 0) || (compareTo = Boolean.valueOf(mo27444f()).compareTo(Boolean.valueOf(mVMetroLanguage.mo27444f()))) != 0))) {
            return compareTo;
        }
        if (!mo27444f() || (l = C25082a.m62848l(this.isDefault, mVMetroLanguage.isDefault)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMetroLanguage)) {
            return mo27441a((MVMetroLanguage) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27444f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo27445g() {
        return this.key != null;
    }

    /* renamed from: h */
    public final boolean mo27446h() {
        return this.name != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo27448i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMetroLanguage(", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("key:");
        String str2 = this.key;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("isDefault:");
        return C25541a.m63885p(n, this.isDefault, ")");
    }
}
