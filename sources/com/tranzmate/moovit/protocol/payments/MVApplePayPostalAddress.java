package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVApplePayPostalAddress implements TBase<MVApplePayPostalAddress, _Fields>, Serializable, Cloneable, Comparable<MVApplePayPostalAddress> {

    /* renamed from: b */
    public static final C25113c f27121b = new C25113c("street", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27122c = new C25113c("city", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27123d = new C25113c("isoCountryCode", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27124e = new C25113c("state", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27125f = new C25113c("postalCode", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f27126g = new C25113c(ServerParameters.COUNTRY, (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f27127h = new C25113c("subAdministrativeArea", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f27128i = new C25113c("subLocality", (byte) 11, 8);

    /* renamed from: j */
    public static final HashMap f27129j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f27130k;
    public String city;
    public String country;
    public String isoCountryCode;
    public String postalCode;
    public String state;
    public String street;
    public String subAdministrativeArea;
    public String subLocality;

    public enum _Fields implements C25085c {
        STREET(1, "street"),
        CITY(2, "city"),
        ISO_COUNTRY_CODE(3, "isoCountryCode"),
        STATE(4, "state"),
        POSTAL_CODE(5, "postalCode"),
        COUNTRY(6, ServerParameters.COUNTRY),
        SUB_ADMINISTRATIVE_AREA(7, "subAdministrativeArea"),
        SUB_LOCALITY(8, "subLocality");
        
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
                    return STREET;
                case 2:
                    return CITY;
                case 3:
                    return ISO_COUNTRY_CODE;
                case 4:
                    return STATE;
                case 5:
                    return POSTAL_CODE;
                case 6:
                    return COUNTRY;
                case 7:
                    return SUB_ADMINISTRATIVE_AREA;
                case 8:
                    return SUB_LOCALITY;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPostalAddress$a */
    public static class C9616a extends C25239c<MVApplePayPostalAddress> {
        public C9616a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPostalAddress mVApplePayPostalAddress = (MVApplePayPostalAddress) tBase;
            mVApplePayPostalAddress.getClass();
            C25113c cVar = MVApplePayPostalAddress.f27121b;
            gVar.mo61687K();
            if (mVApplePayPostalAddress.street != null) {
                gVar.mo61711x(MVApplePayPostalAddress.f27121b);
                gVar.mo61686J(mVApplePayPostalAddress.street);
                gVar.mo61712y();
            }
            if (mVApplePayPostalAddress.city != null) {
                gVar.mo61711x(MVApplePayPostalAddress.f27122c);
                gVar.mo61686J(mVApplePayPostalAddress.city);
                gVar.mo61712y();
            }
            if (mVApplePayPostalAddress.isoCountryCode != null) {
                gVar.mo61711x(MVApplePayPostalAddress.f27123d);
                gVar.mo61686J(mVApplePayPostalAddress.isoCountryCode);
                gVar.mo61712y();
            }
            if (mVApplePayPostalAddress.state != null) {
                gVar.mo61711x(MVApplePayPostalAddress.f27124e);
                gVar.mo61686J(mVApplePayPostalAddress.state);
                gVar.mo61712y();
            }
            if (mVApplePayPostalAddress.postalCode != null) {
                gVar.mo61711x(MVApplePayPostalAddress.f27125f);
                gVar.mo61686J(mVApplePayPostalAddress.postalCode);
                gVar.mo61712y();
            }
            if (mVApplePayPostalAddress.country != null) {
                gVar.mo61711x(MVApplePayPostalAddress.f27126g);
                gVar.mo61686J(mVApplePayPostalAddress.country);
                gVar.mo61712y();
            }
            if (mVApplePayPostalAddress.subAdministrativeArea != null) {
                gVar.mo61711x(MVApplePayPostalAddress.f27127h);
                gVar.mo61686J(mVApplePayPostalAddress.subAdministrativeArea);
                gVar.mo61712y();
            }
            if (mVApplePayPostalAddress.subLocality != null) {
                gVar.mo61711x(MVApplePayPostalAddress.f27128i);
                gVar.mo61686J(mVApplePayPostalAddress.subLocality);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPostalAddress mVApplePayPostalAddress = (MVApplePayPostalAddress) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVApplePayPostalAddress.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPostalAddress.street = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPostalAddress.city = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPostalAddress.isoCountryCode = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPostalAddress.state = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPostalAddress.postalCode = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPostalAddress.country = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPostalAddress.subAdministrativeArea = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVApplePayPostalAddress.subLocality = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPostalAddress$b */
    public static class C9617b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9616a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPostalAddress$c */
    public static class C9618c extends C25240d<MVApplePayPostalAddress> {
        public C9618c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPostalAddress mVApplePayPostalAddress = (MVApplePayPostalAddress) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplePayPostalAddress.mo29618k()) {
                bitSet.set(0);
            }
            if (mVApplePayPostalAddress.mo29612f()) {
                bitSet.set(1);
            }
            if (mVApplePayPostalAddress.mo29614h()) {
                bitSet.set(2);
            }
            if (mVApplePayPostalAddress.mo29617j()) {
                bitSet.set(3);
            }
            if (mVApplePayPostalAddress.mo29616i()) {
                bitSet.set(4);
            }
            if (mVApplePayPostalAddress.mo29613g()) {
                bitSet.set(5);
            }
            if (mVApplePayPostalAddress.mo29619l()) {
                bitSet.set(6);
            }
            if (mVApplePayPostalAddress.mo29620m()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVApplePayPostalAddress.mo29618k()) {
                jVar.mo61686J(mVApplePayPostalAddress.street);
            }
            if (mVApplePayPostalAddress.mo29612f()) {
                jVar.mo61686J(mVApplePayPostalAddress.city);
            }
            if (mVApplePayPostalAddress.mo29614h()) {
                jVar.mo61686J(mVApplePayPostalAddress.isoCountryCode);
            }
            if (mVApplePayPostalAddress.mo29617j()) {
                jVar.mo61686J(mVApplePayPostalAddress.state);
            }
            if (mVApplePayPostalAddress.mo29616i()) {
                jVar.mo61686J(mVApplePayPostalAddress.postalCode);
            }
            if (mVApplePayPostalAddress.mo29613g()) {
                jVar.mo61686J(mVApplePayPostalAddress.country);
            }
            if (mVApplePayPostalAddress.mo29619l()) {
                jVar.mo61686J(mVApplePayPostalAddress.subAdministrativeArea);
            }
            if (mVApplePayPostalAddress.mo29620m()) {
                jVar.mo61686J(mVApplePayPostalAddress.subLocality);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayPostalAddress mVApplePayPostalAddress = (MVApplePayPostalAddress) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVApplePayPostalAddress.street = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVApplePayPostalAddress.city = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVApplePayPostalAddress.isoCountryCode = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVApplePayPostalAddress.state = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVApplePayPostalAddress.postalCode = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVApplePayPostalAddress.country = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVApplePayPostalAddress.subAdministrativeArea = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVApplePayPostalAddress.subLocality = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayPostalAddress$d */
    public static class C9619d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9618c(0);
        }
    }

    static {
        new C17394d0("MVApplePayPostalAddress");
        HashMap hashMap = new HashMap();
        f27129j = hashMap;
        hashMap.put(C25239c.class, new C9617b());
        hashMap.put(C25240d.class, new C9619d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STREET, new FieldMetaData("street", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CITY, new FieldMetaData("city", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ISO_COUNTRY_CODE, new FieldMetaData("isoCountryCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STATE, new FieldMetaData("state", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.POSTAL_CODE, new FieldMetaData("postalCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.COUNTRY, new FieldMetaData(ServerParameters.COUNTRY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUB_ADMINISTRATIVE_AREA, new FieldMetaData("subAdministrativeArea", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUB_LOCALITY, new FieldMetaData("subLocality", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27130k = unmodifiableMap;
        FieldMetaData.m61947a(MVApplePayPostalAddress.class, unmodifiableMap);
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
        ((C25238b) f27129j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27129j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29609a(MVApplePayPostalAddress mVApplePayPostalAddress) {
        if (mVApplePayPostalAddress == null) {
            return false;
        }
        boolean k = mo29618k();
        boolean k2 = mVApplePayPostalAddress.mo29618k();
        if ((k || k2) && (!k || !k2 || !this.street.equals(mVApplePayPostalAddress.street))) {
            return false;
        }
        boolean f = mo29612f();
        boolean f2 = mVApplePayPostalAddress.mo29612f();
        if ((f || f2) && (!f || !f2 || !this.city.equals(mVApplePayPostalAddress.city))) {
            return false;
        }
        boolean h = mo29614h();
        boolean h2 = mVApplePayPostalAddress.mo29614h();
        if ((h || h2) && (!h || !h2 || !this.isoCountryCode.equals(mVApplePayPostalAddress.isoCountryCode))) {
            return false;
        }
        boolean j = mo29617j();
        boolean j2 = mVApplePayPostalAddress.mo29617j();
        if ((j || j2) && (!j || !j2 || !this.state.equals(mVApplePayPostalAddress.state))) {
            return false;
        }
        boolean i = mo29616i();
        boolean i2 = mVApplePayPostalAddress.mo29616i();
        if ((i || i2) && (!i || !i2 || !this.postalCode.equals(mVApplePayPostalAddress.postalCode))) {
            return false;
        }
        boolean g = mo29613g();
        boolean g2 = mVApplePayPostalAddress.mo29613g();
        if ((g || g2) && (!g || !g2 || !this.country.equals(mVApplePayPostalAddress.country))) {
            return false;
        }
        boolean l = mo29619l();
        boolean l2 = mVApplePayPostalAddress.mo29619l();
        if ((l || l2) && (!l || !l2 || !this.subAdministrativeArea.equals(mVApplePayPostalAddress.subAdministrativeArea))) {
            return false;
        }
        boolean m = mo29620m();
        boolean m2 = mVApplePayPostalAddress.mo29620m();
        if (!m && !m2) {
            return true;
        }
        if (!m || !m2 || !this.subLocality.equals(mVApplePayPostalAddress.subLocality)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVApplePayPostalAddress mVApplePayPostalAddress = (MVApplePayPostalAddress) obj;
        if (!getClass().equals(mVApplePayPostalAddress.getClass())) {
            return getClass().getName().compareTo(mVApplePayPostalAddress.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29618k()).compareTo(Boolean.valueOf(mVApplePayPostalAddress.mo29618k()));
        if (compareTo2 != 0 || ((mo29618k() && (compareTo2 = this.street.compareTo(mVApplePayPostalAddress.street)) != 0) || (compareTo2 = Boolean.valueOf(mo29612f()).compareTo(Boolean.valueOf(mVApplePayPostalAddress.mo29612f()))) != 0 || ((mo29612f() && (compareTo2 = this.city.compareTo(mVApplePayPostalAddress.city)) != 0) || (compareTo2 = Boolean.valueOf(mo29614h()).compareTo(Boolean.valueOf(mVApplePayPostalAddress.mo29614h()))) != 0 || ((mo29614h() && (compareTo2 = this.isoCountryCode.compareTo(mVApplePayPostalAddress.isoCountryCode)) != 0) || (compareTo2 = Boolean.valueOf(mo29617j()).compareTo(Boolean.valueOf(mVApplePayPostalAddress.mo29617j()))) != 0 || ((mo29617j() && (compareTo2 = this.state.compareTo(mVApplePayPostalAddress.state)) != 0) || (compareTo2 = Boolean.valueOf(mo29616i()).compareTo(Boolean.valueOf(mVApplePayPostalAddress.mo29616i()))) != 0 || ((mo29616i() && (compareTo2 = this.postalCode.compareTo(mVApplePayPostalAddress.postalCode)) != 0) || (compareTo2 = Boolean.valueOf(mo29613g()).compareTo(Boolean.valueOf(mVApplePayPostalAddress.mo29613g()))) != 0 || ((mo29613g() && (compareTo2 = this.country.compareTo(mVApplePayPostalAddress.country)) != 0) || (compareTo2 = Boolean.valueOf(mo29619l()).compareTo(Boolean.valueOf(mVApplePayPostalAddress.mo29619l()))) != 0 || ((mo29619l() && (compareTo2 = this.subAdministrativeArea.compareTo(mVApplePayPostalAddress.subAdministrativeArea)) != 0) || (compareTo2 = Boolean.valueOf(mo29620m()).compareTo(Boolean.valueOf(mVApplePayPostalAddress.mo29620m()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo29620m() || (compareTo = this.subLocality.compareTo(mVApplePayPostalAddress.subLocality)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVApplePayPostalAddress)) {
            return mo29609a((MVApplePayPostalAddress) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29612f() {
        return this.city != null;
    }

    /* renamed from: g */
    public final boolean mo29613g() {
        return this.country != null;
    }

    /* renamed from: h */
    public final boolean mo29614h() {
        return this.isoCountryCode != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29616i() {
        return this.postalCode != null;
    }

    /* renamed from: j */
    public final boolean mo29617j() {
        return this.state != null;
    }

    /* renamed from: k */
    public final boolean mo29618k() {
        return this.street != null;
    }

    /* renamed from: l */
    public final boolean mo29619l() {
        return this.subAdministrativeArea != null;
    }

    /* renamed from: m */
    public final boolean mo29620m() {
        return this.subLocality != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVApplePayPostalAddress(", "street:");
        String str = this.street;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("city:");
        String str2 = this.city;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("isoCountryCode:");
        String str3 = this.isoCountryCode;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("state:");
        String str4 = this.state;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
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
        n.append("country:");
        String str6 = this.country;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        n.append(", ");
        n.append("subAdministrativeArea:");
        String str7 = this.subAdministrativeArea;
        if (str7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str7);
        }
        n.append(", ");
        n.append("subLocality:");
        String str8 = this.subLocality;
        if (str8 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str8);
        }
        n.append(")");
        return n.toString();
    }
}
