package com.tranzmate.moovit.protocol.ticketingV2;

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

public class MVPurchaseType implements TBase<MVPurchaseType, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseType> {

    /* renamed from: b */
    public static final C25113c f29066b = new C25113c("typeId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29067c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29068d = new C25113c("name", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29069e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f29070f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29071g;
    public MVImageReferenceWithParams image;
    public String name;
    private _Fields[] optionals = {_Fields.SUBTITLE};
    public String subtitle;
    public String typeId;

    public enum _Fields implements C25085c {
        TYPE_ID(1, "typeId"),
        IMAGE(2, "image"),
        NAME(3, "name"),
        SUBTITLE(4, "subtitle");
        
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
                return TYPE_ID;
            }
            if (i == 2) {
                return IMAGE;
            }
            if (i == 3) {
                return NAME;
            }
            if (i != 4) {
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseType$a */
    public static class C11009a extends C25239c<MVPurchaseType> {
        public C11009a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseType mVPurchaseType = (MVPurchaseType) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVPurchaseType.image;
            C25113c cVar = MVPurchaseType.f29066b;
            gVar.mo61687K();
            if (mVPurchaseType.typeId != null) {
                gVar.mo61711x(MVPurchaseType.f29066b);
                gVar.mo61686J(mVPurchaseType.typeId);
                gVar.mo61712y();
            }
            if (mVPurchaseType.image != null) {
                gVar.mo61711x(MVPurchaseType.f29067c);
                mVPurchaseType.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseType.name != null) {
                gVar.mo61711x(MVPurchaseType.f29068d);
                gVar.mo61686J(mVPurchaseType.name);
                gVar.mo61712y();
            }
            if (mVPurchaseType.subtitle != null && mVPurchaseType.mo32896h()) {
                gVar.mo61711x(MVPurchaseType.f29069e);
                gVar.mo61686J(mVPurchaseType.subtitle);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseType mVPurchaseType = (MVPurchaseType) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVPurchaseType.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVPurchaseType.subtitle = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVPurchaseType.name = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVPurchaseType.image = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPurchaseType.typeId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseType$b */
    public static class C11010b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11009a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseType$c */
    public static class C11011c extends C25240d<MVPurchaseType> {
        public C11011c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseType mVPurchaseType = (MVPurchaseType) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseType.mo32898i()) {
                bitSet.set(0);
            }
            if (mVPurchaseType.mo32894f()) {
                bitSet.set(1);
            }
            if (mVPurchaseType.mo32895g()) {
                bitSet.set(2);
            }
            if (mVPurchaseType.mo32896h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPurchaseType.mo32898i()) {
                jVar.mo61686J(mVPurchaseType.typeId);
            }
            if (mVPurchaseType.mo32894f()) {
                mVPurchaseType.image.mo25202X0(jVar);
            }
            if (mVPurchaseType.mo32895g()) {
                jVar.mo61686J(mVPurchaseType.name);
            }
            if (mVPurchaseType.mo32896h()) {
                jVar.mo61686J(mVPurchaseType.subtitle);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseType mVPurchaseType = (MVPurchaseType) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVPurchaseType.typeId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVPurchaseType.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPurchaseType.name = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPurchaseType.subtitle = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseType$d */
    public static class C11012d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11011c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseType");
        HashMap hashMap = new HashMap();
        f29070f = hashMap;
        hashMap.put(C25239c.class, new C11010b());
        hashMap.put(C25240d.class, new C11012d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE_ID, new FieldMetaData("typeId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29071g = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseType.class, unmodifiableMap);
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
        ((C25238b) f29070f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29070f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseType mVPurchaseType = (MVPurchaseType) obj;
        if (!getClass().equals(mVPurchaseType.getClass())) {
            return getClass().getName().compareTo(mVPurchaseType.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32898i()).compareTo(Boolean.valueOf(mVPurchaseType.mo32898i()));
        if (compareTo2 != 0 || ((mo32898i() && (compareTo2 = this.typeId.compareTo(mVPurchaseType.typeId)) != 0) || (compareTo2 = Boolean.valueOf(mo32894f()).compareTo(Boolean.valueOf(mVPurchaseType.mo32894f()))) != 0 || ((mo32894f() && (compareTo2 = this.image.compareTo(mVPurchaseType.image)) != 0) || (compareTo2 = Boolean.valueOf(mo32895g()).compareTo(Boolean.valueOf(mVPurchaseType.mo32895g()))) != 0 || ((mo32895g() && (compareTo2 = this.name.compareTo(mVPurchaseType.name)) != 0) || (compareTo2 = Boolean.valueOf(mo32896h()).compareTo(Boolean.valueOf(mVPurchaseType.mo32896h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo32896h() || (compareTo = this.subtitle.compareTo(mVPurchaseType.subtitle)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseType)) {
            return false;
        }
        MVPurchaseType mVPurchaseType = (MVPurchaseType) obj;
        boolean i = mo32898i();
        boolean i2 = mVPurchaseType.mo32898i();
        if ((i || i2) && (!i || !i2 || !this.typeId.equals(mVPurchaseType.typeId))) {
            return false;
        }
        boolean f = mo32894f();
        boolean f2 = mVPurchaseType.mo32894f();
        if ((f || f2) && (!f || !f2 || !this.image.mo26245a(mVPurchaseType.image))) {
            return false;
        }
        boolean g = mo32895g();
        boolean g2 = mVPurchaseType.mo32895g();
        if ((g || g2) && (!g || !g2 || !this.name.equals(mVPurchaseType.name))) {
            return false;
        }
        boolean h = mo32896h();
        boolean h2 = mVPurchaseType.mo32896h();
        if ((h || h2) && (!h || !h2 || !this.subtitle.equals(mVPurchaseType.subtitle))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32894f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo32895g() {
        return this.name != null;
    }

    /* renamed from: h */
    public final boolean mo32896h() {
        return this.subtitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32898i() {
        return this.typeId != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseType(", "typeId:");
        String str = this.typeId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("image:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("name:");
        String str2 = this.name;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo32896h()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
