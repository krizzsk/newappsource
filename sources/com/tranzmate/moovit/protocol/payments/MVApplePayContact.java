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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVApplePayContact implements TBase<MVApplePayContact, _Fields>, Serializable, Cloneable, Comparable<MVApplePayContact> {

    /* renamed from: b */
    public static final C25113c f27078b = new C25113c("postalAddress", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27079c = new C25113c("emailAddress", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27080d = new C25113c("phoneNumber", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27081e = new C25113c("name", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27082f = new C25113c("phoneticName", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f27083g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27084h;
    public String emailAddress;
    public MVApplePayPersonName name;
    private _Fields[] optionals = {_Fields.POSTAL_ADDRESS, _Fields.EMAIL_ADDRESS, _Fields.PHONE_NUMBER, _Fields.NAME, _Fields.PHONETIC_NAME};
    public String phoneNumber;
    public MVApplePayPersonName phoneticName;
    public MVApplePayPostalAddress postalAddress;

    public enum _Fields implements C25085c {
        POSTAL_ADDRESS(1, "postalAddress"),
        EMAIL_ADDRESS(2, "emailAddress"),
        PHONE_NUMBER(3, "phoneNumber"),
        NAME(4, "name"),
        PHONETIC_NAME(5, "phoneticName");
        
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
                return POSTAL_ADDRESS;
            }
            if (i == 2) {
                return EMAIL_ADDRESS;
            }
            if (i == 3) {
                return PHONE_NUMBER;
            }
            if (i == 4) {
                return NAME;
            }
            if (i != 5) {
                return null;
            }
            return PHONETIC_NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayContact$a */
    public static class C9588a extends C25239c<MVApplePayContact> {
        public C9588a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayContact mVApplePayContact = (MVApplePayContact) tBase;
            mVApplePayContact.mo29544k();
            C25113c cVar = MVApplePayContact.f27078b;
            gVar.mo61687K();
            if (mVApplePayContact.postalAddress != null && mVApplePayContact.mo29543j()) {
                gVar.mo61711x(MVApplePayContact.f27078b);
                mVApplePayContact.postalAddress.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVApplePayContact.emailAddress != null && mVApplePayContact.mo29538f()) {
                gVar.mo61711x(MVApplePayContact.f27079c);
                gVar.mo61686J(mVApplePayContact.emailAddress);
                gVar.mo61712y();
            }
            if (mVApplePayContact.phoneNumber != null && mVApplePayContact.mo29540h()) {
                gVar.mo61711x(MVApplePayContact.f27080d);
                gVar.mo61686J(mVApplePayContact.phoneNumber);
                gVar.mo61712y();
            }
            if (mVApplePayContact.name != null && mVApplePayContact.mo29539g()) {
                gVar.mo61711x(MVApplePayContact.f27081e);
                mVApplePayContact.name.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVApplePayContact.phoneticName != null && mVApplePayContact.mo29542i()) {
                gVar.mo61711x(MVApplePayContact.f27082f);
                mVApplePayContact.phoneticName.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayContact mVApplePayContact = (MVApplePayContact) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVApplePayContact.mo29544k();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVApplePayPersonName mVApplePayPersonName = new MVApplePayPersonName();
                                    mVApplePayContact.phoneticName = mVApplePayPersonName;
                                    mVApplePayPersonName.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVApplePayPersonName mVApplePayPersonName2 = new MVApplePayPersonName();
                                mVApplePayContact.name = mVApplePayPersonName2;
                                mVApplePayPersonName2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVApplePayContact.phoneNumber = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVApplePayContact.emailAddress = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVApplePayPostalAddress mVApplePayPostalAddress = new MVApplePayPostalAddress();
                    mVApplePayContact.postalAddress = mVApplePayPostalAddress;
                    mVApplePayPostalAddress.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayContact$b */
    public static class C9589b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9588a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayContact$c */
    public static class C9590c extends C25240d<MVApplePayContact> {
        public C9590c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVApplePayContact mVApplePayContact = (MVApplePayContact) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVApplePayContact.mo29543j()) {
                bitSet.set(0);
            }
            if (mVApplePayContact.mo29538f()) {
                bitSet.set(1);
            }
            if (mVApplePayContact.mo29540h()) {
                bitSet.set(2);
            }
            if (mVApplePayContact.mo29539g()) {
                bitSet.set(3);
            }
            if (mVApplePayContact.mo29542i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVApplePayContact.mo29543j()) {
                mVApplePayContact.postalAddress.mo25202X0(jVar);
            }
            if (mVApplePayContact.mo29538f()) {
                jVar.mo61686J(mVApplePayContact.emailAddress);
            }
            if (mVApplePayContact.mo29540h()) {
                jVar.mo61686J(mVApplePayContact.phoneNumber);
            }
            if (mVApplePayContact.mo29539g()) {
                mVApplePayContact.name.mo25202X0(jVar);
            }
            if (mVApplePayContact.mo29542i()) {
                mVApplePayContact.phoneticName.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVApplePayContact mVApplePayContact = (MVApplePayContact) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVApplePayPostalAddress mVApplePayPostalAddress = new MVApplePayPostalAddress();
                mVApplePayContact.postalAddress = mVApplePayPostalAddress;
                mVApplePayPostalAddress.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVApplePayContact.emailAddress = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVApplePayContact.phoneNumber = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVApplePayPersonName mVApplePayPersonName = new MVApplePayPersonName();
                mVApplePayContact.name = mVApplePayPersonName;
                mVApplePayPersonName.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVApplePayPersonName mVApplePayPersonName2 = new MVApplePayPersonName();
                mVApplePayContact.phoneticName = mVApplePayPersonName2;
                mVApplePayPersonName2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVApplePayContact$d */
    public static class C9591d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9590c(0);
        }
    }

    static {
        new C17394d0("MVApplePayContact");
        HashMap hashMap = new HashMap();
        f27083g = hashMap;
        hashMap.put(C25239c.class, new C9589b());
        hashMap.put(C25240d.class, new C9591d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.POSTAL_ADDRESS, new FieldMetaData("postalAddress", (byte) 2, new StructMetaData(MVApplePayPostalAddress.class)));
        enumMap.put(_Fields.EMAIL_ADDRESS, new FieldMetaData("emailAddress", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PHONE_NUMBER, new FieldMetaData("phoneNumber", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 2, new StructMetaData(MVApplePayPersonName.class)));
        enumMap.put(_Fields.PHONETIC_NAME, new FieldMetaData("phoneticName", (byte) 2, new StructMetaData(MVApplePayPersonName.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27084h = unmodifiableMap;
        FieldMetaData.m61947a(MVApplePayContact.class, unmodifiableMap);
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
        ((C25238b) f27083g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27083g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29535a(MVApplePayContact mVApplePayContact) {
        if (mVApplePayContact == null) {
            return false;
        }
        boolean j = mo29543j();
        boolean j2 = mVApplePayContact.mo29543j();
        if ((j || j2) && (!j || !j2 || !this.postalAddress.mo29609a(mVApplePayContact.postalAddress))) {
            return false;
        }
        boolean f = mo29538f();
        boolean f2 = mVApplePayContact.mo29538f();
        if ((f || f2) && (!f || !f2 || !this.emailAddress.equals(mVApplePayContact.emailAddress))) {
            return false;
        }
        boolean h = mo29540h();
        boolean h2 = mVApplePayContact.mo29540h();
        if ((h || h2) && (!h || !h2 || !this.phoneNumber.equals(mVApplePayContact.phoneNumber))) {
            return false;
        }
        boolean g = mo29539g();
        boolean g2 = mVApplePayContact.mo29539g();
        if ((g || g2) && (!g || !g2 || !this.name.mo29597a(mVApplePayContact.name))) {
            return false;
        }
        boolean i = mo29542i();
        boolean i2 = mVApplePayContact.mo29542i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.phoneticName.mo29597a(mVApplePayContact.phoneticName)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVApplePayContact mVApplePayContact = (MVApplePayContact) obj;
        if (!getClass().equals(mVApplePayContact.getClass())) {
            return getClass().getName().compareTo(mVApplePayContact.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29543j()).compareTo(Boolean.valueOf(mVApplePayContact.mo29543j()));
        if (compareTo2 != 0 || ((mo29543j() && (compareTo2 = this.postalAddress.compareTo(mVApplePayContact.postalAddress)) != 0) || (compareTo2 = Boolean.valueOf(mo29538f()).compareTo(Boolean.valueOf(mVApplePayContact.mo29538f()))) != 0 || ((mo29538f() && (compareTo2 = this.emailAddress.compareTo(mVApplePayContact.emailAddress)) != 0) || (compareTo2 = Boolean.valueOf(mo29540h()).compareTo(Boolean.valueOf(mVApplePayContact.mo29540h()))) != 0 || ((mo29540h() && (compareTo2 = this.phoneNumber.compareTo(mVApplePayContact.phoneNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo29539g()).compareTo(Boolean.valueOf(mVApplePayContact.mo29539g()))) != 0 || ((mo29539g() && (compareTo2 = this.name.compareTo(mVApplePayContact.name)) != 0) || (compareTo2 = Boolean.valueOf(mo29542i()).compareTo(Boolean.valueOf(mVApplePayContact.mo29542i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29542i() || (compareTo = this.phoneticName.compareTo(mVApplePayContact.phoneticName)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVApplePayContact)) {
            return mo29535a((MVApplePayContact) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29538f() {
        return this.emailAddress != null;
    }

    /* renamed from: g */
    public final boolean mo29539g() {
        return this.name != null;
    }

    /* renamed from: h */
    public final boolean mo29540h() {
        return this.phoneNumber != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29542i() {
        return this.phoneticName != null;
    }

    /* renamed from: j */
    public final boolean mo29543j() {
        return this.postalAddress != null;
    }

    /* renamed from: k */
    public final void mo29544k() throws TException {
        MVApplePayPostalAddress mVApplePayPostalAddress = this.postalAddress;
        if (mVApplePayPostalAddress != null) {
            mVApplePayPostalAddress.getClass();
        }
        MVApplePayPersonName mVApplePayPersonName = this.name;
        if (mVApplePayPersonName != null) {
            mVApplePayPersonName.getClass();
        }
        MVApplePayPersonName mVApplePayPersonName2 = this.phoneticName;
        if (mVApplePayPersonName2 != null) {
            mVApplePayPersonName2.getClass();
        }
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVApplePayContact(");
        boolean z2 = false;
        if (mo29543j()) {
            sb.append("postalAddress:");
            MVApplePayPostalAddress mVApplePayPostalAddress = this.postalAddress;
            if (mVApplePayPostalAddress == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVApplePayPostalAddress);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29538f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("emailAddress:");
            String str = this.emailAddress;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        }
        if (mo29540h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("phoneNumber:");
            String str2 = this.phoneNumber;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo29539g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            MVApplePayPersonName mVApplePayPersonName = this.name;
            if (mVApplePayPersonName == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVApplePayPersonName);
            }
        } else {
            z2 = z;
        }
        if (mo29542i()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("phoneticName:");
            MVApplePayPersonName mVApplePayPersonName2 = this.phoneticName;
            if (mVApplePayPersonName2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVApplePayPersonName2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
