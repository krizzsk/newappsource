package com.tranzmate.moovit.protocol.taxi;

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

public class MVTaxiOrderProfile implements TBase<MVTaxiOrderProfile, _Fields>, Serializable, Cloneable, Comparable<MVTaxiOrderProfile> {

    /* renamed from: b */
    public static final C25113c f28607b = new C25113c("id", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28608c = new C25113c("icon", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28609d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28610e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f28611f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28612g;
    private byte __isset_bitfield = 0;
    public MVImageReferenceWithParams icon;

    /* renamed from: id */
    public int f28613id;
    private _Fields[] optionals = {_Fields.ICON, _Fields.TITLE, _Fields.SUBTITLE};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        ICON(2, "icon"),
        TITLE(3, "title"),
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
                return ID;
            }
            if (i == 2) {
                return ICON;
            }
            if (i == 3) {
                return TITLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiOrderProfile$a */
    public static class C10728a extends C25239c<MVTaxiOrderProfile> {
        public C10728a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiOrderProfile mVTaxiOrderProfile = (MVTaxiOrderProfile) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTaxiOrderProfile.icon;
            C25113c cVar = MVTaxiOrderProfile.f28607b;
            gVar.mo61687K();
            gVar.mo61711x(MVTaxiOrderProfile.f28607b);
            gVar.mo61678B(mVTaxiOrderProfile.f28613id);
            gVar.mo61712y();
            if (mVTaxiOrderProfile.icon != null && mVTaxiOrderProfile.mo32210f()) {
                gVar.mo61711x(MVTaxiOrderProfile.f28608c);
                mVTaxiOrderProfile.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiOrderProfile.title != null && mVTaxiOrderProfile.mo32214i()) {
                gVar.mo61711x(MVTaxiOrderProfile.f28609d);
                gVar.mo61686J(mVTaxiOrderProfile.title);
                gVar.mo61712y();
            }
            if (mVTaxiOrderProfile.subtitle != null && mVTaxiOrderProfile.mo32212h()) {
                gVar.mo61711x(MVTaxiOrderProfile.f28610e);
                gVar.mo61686J(mVTaxiOrderProfile.subtitle);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiOrderProfile mVTaxiOrderProfile = (MVTaxiOrderProfile) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTaxiOrderProfile.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVTaxiOrderProfile.subtitle = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVTaxiOrderProfile.title = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVTaxiOrderProfile.icon = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTaxiOrderProfile.f28613id = gVar.mo61696i();
                    mVTaxiOrderProfile.mo32215j(true);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiOrderProfile$b */
    public static class C10729b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10728a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiOrderProfile$c */
    public static class C10730c extends C25240d<MVTaxiOrderProfile> {
        public C10730c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiOrderProfile mVTaxiOrderProfile = (MVTaxiOrderProfile) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiOrderProfile.mo32211g()) {
                bitSet.set(0);
            }
            if (mVTaxiOrderProfile.mo32210f()) {
                bitSet.set(1);
            }
            if (mVTaxiOrderProfile.mo32214i()) {
                bitSet.set(2);
            }
            if (mVTaxiOrderProfile.mo32212h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTaxiOrderProfile.mo32211g()) {
                jVar.mo61678B(mVTaxiOrderProfile.f28613id);
            }
            if (mVTaxiOrderProfile.mo32210f()) {
                mVTaxiOrderProfile.icon.mo25202X0(jVar);
            }
            if (mVTaxiOrderProfile.mo32214i()) {
                jVar.mo61686J(mVTaxiOrderProfile.title);
            }
            if (mVTaxiOrderProfile.mo32212h()) {
                jVar.mo61686J(mVTaxiOrderProfile.subtitle);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiOrderProfile mVTaxiOrderProfile = (MVTaxiOrderProfile) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTaxiOrderProfile.f28613id = jVar.mo61696i();
                mVTaxiOrderProfile.mo32215j(true);
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTaxiOrderProfile.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTaxiOrderProfile.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTaxiOrderProfile.subtitle = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiOrderProfile$d */
    public static class C10731d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10730c(0);
        }
    }

    static {
        new C17394d0("MVTaxiOrderProfile");
        HashMap hashMap = new HashMap();
        f28611f = hashMap;
        hashMap.put(C25239c.class, new C10729b());
        hashMap.put(C25240d.class, new C10731d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28612g = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiOrderProfile.class, unmodifiableMap);
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
        ((C25238b) f28611f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28611f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiOrderProfile mVTaxiOrderProfile = (MVTaxiOrderProfile) obj;
        if (!getClass().equals(mVTaxiOrderProfile.getClass())) {
            return getClass().getName().compareTo(mVTaxiOrderProfile.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32211g()).compareTo(Boolean.valueOf(mVTaxiOrderProfile.mo32211g()));
        if (compareTo2 != 0 || ((mo32211g() && (compareTo2 = C25082a.m62839c(this.f28613id, mVTaxiOrderProfile.f28613id)) != 0) || (compareTo2 = Boolean.valueOf(mo32210f()).compareTo(Boolean.valueOf(mVTaxiOrderProfile.mo32210f()))) != 0 || ((mo32210f() && (compareTo2 = this.icon.compareTo(mVTaxiOrderProfile.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo32214i()).compareTo(Boolean.valueOf(mVTaxiOrderProfile.mo32214i()))) != 0 || ((mo32214i() && (compareTo2 = this.title.compareTo(mVTaxiOrderProfile.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32212h()).compareTo(Boolean.valueOf(mVTaxiOrderProfile.mo32212h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo32212h() || (compareTo = this.subtitle.compareTo(mVTaxiOrderProfile.subtitle)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTaxiOrderProfile)) {
            return false;
        }
        MVTaxiOrderProfile mVTaxiOrderProfile = (MVTaxiOrderProfile) obj;
        if (this.f28613id != mVTaxiOrderProfile.f28613id) {
            return false;
        }
        boolean f = mo32210f();
        boolean f2 = mVTaxiOrderProfile.mo32210f();
        if ((f || f2) && (!f || !f2 || !this.icon.mo26245a(mVTaxiOrderProfile.icon))) {
            return false;
        }
        boolean i = mo32214i();
        boolean i2 = mVTaxiOrderProfile.mo32214i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVTaxiOrderProfile.title))) {
            return false;
        }
        boolean h = mo32212h();
        boolean h2 = mVTaxiOrderProfile.mo32212h();
        if ((h || h2) && (!h || !h2 || !this.subtitle.equals(mVTaxiOrderProfile.subtitle))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32210f() {
        return this.icon != null;
    }

    /* renamed from: g */
    public final boolean mo32211g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo32212h() {
        return this.subtitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32214i() {
        return this.title != null;
    }

    /* renamed from: j */
    public final void mo32215j(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiOrderProfile(", "id:");
        n.append(this.f28613id);
        if (mo32210f()) {
            n.append(", ");
            n.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo32214i()) {
            n.append(", ");
            n.append("title:");
            String str = this.title;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo32212h()) {
            n.append(", ");
            n.append("subtitle:");
            String str2 = this.subtitle;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
