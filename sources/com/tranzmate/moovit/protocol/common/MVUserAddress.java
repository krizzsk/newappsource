package com.tranzmate.moovit.protocol.common;

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

public class MVUserAddress implements TBase<MVUserAddress, _Fields>, Serializable, Cloneable, Comparable<MVUserAddress> {

    /* renamed from: b */
    public static final C25113c f25155b = new C25113c("streetAddress", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f25156c = new C25113c("streetAddress2", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25157d = new C25113c("city", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f25158e = new C25113c("stateCode", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f25159f = new C25113c("postalCode", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f25160g = new C25113c("countryAlpha2Code", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f25161h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25162i;
    public String city;
    public String countryAlpha2Code;
    private _Fields[] optionals = {_Fields.STREET_ADDRESS2, _Fields.STATE_CODE};
    public String postalCode;
    public String stateCode;
    public String streetAddress;
    public String streetAddress2;

    public enum _Fields implements C25085c {
        STREET_ADDRESS(1, "streetAddress"),
        STREET_ADDRESS2(2, "streetAddress2"),
        CITY(3, "city"),
        STATE_CODE(4, "stateCode"),
        POSTAL_CODE(5, "postalCode"),
        COUNTRY_ALPHA2_CODE(6, "countryAlpha2Code");
        
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
            switch (i) {
                case 1:
                    return STREET_ADDRESS;
                case 2:
                    return STREET_ADDRESS2;
                case 3:
                    return CITY;
                case 4:
                    return STATE_CODE;
                case 5:
                    return POSTAL_CODE;
                case 6:
                    return COUNTRY_ALPHA2_CODE;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVUserAddress$a */
    public static class C8504a extends C25239c<MVUserAddress> {
        public C8504a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserAddress mVUserAddress = (MVUserAddress) tBase;
            mVUserAddress.getClass();
            C25113c cVar = MVUserAddress.f25155b;
            gVar.mo61687K();
            if (mVUserAddress.streetAddress != null) {
                gVar.mo61711x(MVUserAddress.f25155b);
                gVar.mo61686J(mVUserAddress.streetAddress);
                gVar.mo61712y();
            }
            if (mVUserAddress.streetAddress2 != null && mVUserAddress.mo26429k()) {
                gVar.mo61711x(MVUserAddress.f25156c);
                gVar.mo61686J(mVUserAddress.streetAddress2);
                gVar.mo61712y();
            }
            if (mVUserAddress.city != null) {
                gVar.mo61711x(MVUserAddress.f25157d);
                gVar.mo61686J(mVUserAddress.city);
                gVar.mo61712y();
            }
            if (mVUserAddress.stateCode != null && mVUserAddress.mo26427i()) {
                gVar.mo61711x(MVUserAddress.f25158e);
                gVar.mo61686J(mVUserAddress.stateCode);
                gVar.mo61712y();
            }
            if (mVUserAddress.postalCode != null) {
                gVar.mo61711x(MVUserAddress.f25159f);
                gVar.mo61686J(mVUserAddress.postalCode);
                gVar.mo61712y();
            }
            if (mVUserAddress.countryAlpha2Code != null) {
                gVar.mo61711x(MVUserAddress.f25160g);
                gVar.mo61686J(mVUserAddress.countryAlpha2Code);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserAddress mVUserAddress = (MVUserAddress) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUserAddress.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserAddress.streetAddress = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserAddress.streetAddress2 = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserAddress.city = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserAddress.stateCode = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserAddress.postalCode = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVUserAddress.countryAlpha2Code = gVar.mo61704q();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVUserAddress$b */
    public static class C8505b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8504a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVUserAddress$c */
    public static class C8506c extends C25240d<MVUserAddress> {
        public C8506c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserAddress mVUserAddress = (MVUserAddress) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserAddress.mo26428j()) {
                bitSet.set(0);
            }
            if (mVUserAddress.mo26429k()) {
                bitSet.set(1);
            }
            if (mVUserAddress.mo26423f()) {
                bitSet.set(2);
            }
            if (mVUserAddress.mo26427i()) {
                bitSet.set(3);
            }
            if (mVUserAddress.mo26425h()) {
                bitSet.set(4);
            }
            if (mVUserAddress.mo26424g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVUserAddress.mo26428j()) {
                jVar.mo61686J(mVUserAddress.streetAddress);
            }
            if (mVUserAddress.mo26429k()) {
                jVar.mo61686J(mVUserAddress.streetAddress2);
            }
            if (mVUserAddress.mo26423f()) {
                jVar.mo61686J(mVUserAddress.city);
            }
            if (mVUserAddress.mo26427i()) {
                jVar.mo61686J(mVUserAddress.stateCode);
            }
            if (mVUserAddress.mo26425h()) {
                jVar.mo61686J(mVUserAddress.postalCode);
            }
            if (mVUserAddress.mo26424g()) {
                jVar.mo61686J(mVUserAddress.countryAlpha2Code);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserAddress mVUserAddress = (MVUserAddress) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVUserAddress.streetAddress = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVUserAddress.streetAddress2 = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVUserAddress.city = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVUserAddress.stateCode = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVUserAddress.postalCode = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVUserAddress.countryAlpha2Code = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVUserAddress$d */
    public static class C8507d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8506c(0);
        }
    }

    static {
        new C17394d0("MVUserAddress");
        HashMap hashMap = new HashMap();
        f25161h = hashMap;
        hashMap.put(C25239c.class, new C8505b());
        hashMap.put(C25240d.class, new C8507d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STREET_ADDRESS, new FieldMetaData("streetAddress", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STREET_ADDRESS2, new FieldMetaData("streetAddress2", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CITY, new FieldMetaData("city", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STATE_CODE, new FieldMetaData("stateCode", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.POSTAL_CODE, new FieldMetaData("postalCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.COUNTRY_ALPHA2_CODE, new FieldMetaData("countryAlpha2Code", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25162i = unmodifiableMap;
        FieldMetaData.m61947a(MVUserAddress.class, unmodifiableMap);
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
        ((C25238b) f25161h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25161h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26420a(MVUserAddress mVUserAddress) {
        if (mVUserAddress == null) {
            return false;
        }
        boolean j = mo26428j();
        boolean j2 = mVUserAddress.mo26428j();
        if ((j || j2) && (!j || !j2 || !this.streetAddress.equals(mVUserAddress.streetAddress))) {
            return false;
        }
        boolean k = mo26429k();
        boolean k2 = mVUserAddress.mo26429k();
        if ((k || k2) && (!k || !k2 || !this.streetAddress2.equals(mVUserAddress.streetAddress2))) {
            return false;
        }
        boolean f = mo26423f();
        boolean f2 = mVUserAddress.mo26423f();
        if ((f || f2) && (!f || !f2 || !this.city.equals(mVUserAddress.city))) {
            return false;
        }
        boolean i = mo26427i();
        boolean i2 = mVUserAddress.mo26427i();
        if ((i || i2) && (!i || !i2 || !this.stateCode.equals(mVUserAddress.stateCode))) {
            return false;
        }
        boolean h = mo26425h();
        boolean h2 = mVUserAddress.mo26425h();
        if ((h || h2) && (!h || !h2 || !this.postalCode.equals(mVUserAddress.postalCode))) {
            return false;
        }
        boolean g = mo26424g();
        boolean g2 = mVUserAddress.mo26424g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.countryAlpha2Code.equals(mVUserAddress.countryAlpha2Code)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUserAddress mVUserAddress = (MVUserAddress) obj;
        if (!getClass().equals(mVUserAddress.getClass())) {
            return getClass().getName().compareTo(mVUserAddress.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26428j()).compareTo(Boolean.valueOf(mVUserAddress.mo26428j()));
        if (compareTo2 != 0 || ((mo26428j() && (compareTo2 = this.streetAddress.compareTo(mVUserAddress.streetAddress)) != 0) || (compareTo2 = Boolean.valueOf(mo26429k()).compareTo(Boolean.valueOf(mVUserAddress.mo26429k()))) != 0 || ((mo26429k() && (compareTo2 = this.streetAddress2.compareTo(mVUserAddress.streetAddress2)) != 0) || (compareTo2 = Boolean.valueOf(mo26423f()).compareTo(Boolean.valueOf(mVUserAddress.mo26423f()))) != 0 || ((mo26423f() && (compareTo2 = this.city.compareTo(mVUserAddress.city)) != 0) || (compareTo2 = Boolean.valueOf(mo26427i()).compareTo(Boolean.valueOf(mVUserAddress.mo26427i()))) != 0 || ((mo26427i() && (compareTo2 = this.stateCode.compareTo(mVUserAddress.stateCode)) != 0) || (compareTo2 = Boolean.valueOf(mo26425h()).compareTo(Boolean.valueOf(mVUserAddress.mo26425h()))) != 0 || ((mo26425h() && (compareTo2 = this.postalCode.compareTo(mVUserAddress.postalCode)) != 0) || (compareTo2 = Boolean.valueOf(mo26424g()).compareTo(Boolean.valueOf(mVUserAddress.mo26424g()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo26424g() || (compareTo = this.countryAlpha2Code.compareTo(mVUserAddress.countryAlpha2Code)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVUserAddress)) {
            return mo26420a((MVUserAddress) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26423f() {
        return this.city != null;
    }

    /* renamed from: g */
    public final boolean mo26424g() {
        return this.countryAlpha2Code != null;
    }

    /* renamed from: h */
    public final boolean mo26425h() {
        return this.postalCode != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26427i() {
        return this.stateCode != null;
    }

    /* renamed from: j */
    public final boolean mo26428j() {
        return this.streetAddress != null;
    }

    /* renamed from: k */
    public final boolean mo26429k() {
        return this.streetAddress2 != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUserAddress(", "streetAddress:");
        String str = this.streetAddress;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo26429k()) {
            n.append(", ");
            n.append("streetAddress2:");
            String str2 = this.streetAddress2;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("city:");
        String str3 = this.city;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo26427i()) {
            n.append(", ");
            n.append("stateCode:");
            String str4 = this.stateCode;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        n.append(", ");
        n.append("postalCode:");
        String str5 = this.postalCode;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("countryAlpha2Code:");
        String str6 = this.countryAlpha2Code;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        n.append(")");
        return n.toString();
    }
}
