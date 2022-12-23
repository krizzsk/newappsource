package com.tranzmate.moovit.protocol.taxi;

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

public class MVGenerateRegistrationRequest implements TBase<MVGenerateRegistrationRequest, _Fields>, Serializable, Cloneable, Comparable<MVGenerateRegistrationRequest> {

    /* renamed from: b */
    public static final C25113c f28525b = new C25113c("phoneNumber", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28526c = new C25113c("callingCode", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28527d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28528e;
    public String callingCode;
    public String phoneNumber;

    public enum _Fields implements C25085c {
        PHONE_NUMBER(1, "phoneNumber"),
        CALLING_CODE(2, "callingCode");
        
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
                return PHONE_NUMBER;
            }
            if (i != 2) {
                return null;
            }
            return CALLING_CODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVGenerateRegistrationRequest$a */
    public static class C10680a extends C25239c<MVGenerateRegistrationRequest> {
        public C10680a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGenerateRegistrationRequest mVGenerateRegistrationRequest = (MVGenerateRegistrationRequest) tBase;
            mVGenerateRegistrationRequest.getClass();
            C25113c cVar = MVGenerateRegistrationRequest.f28525b;
            gVar.mo61687K();
            if (mVGenerateRegistrationRequest.phoneNumber != null) {
                gVar.mo61711x(MVGenerateRegistrationRequest.f28525b);
                gVar.mo61686J(mVGenerateRegistrationRequest.phoneNumber);
                gVar.mo61712y();
            }
            if (mVGenerateRegistrationRequest.callingCode != null) {
                gVar.mo61711x(MVGenerateRegistrationRequest.f28526c);
                gVar.mo61686J(mVGenerateRegistrationRequest.callingCode);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGenerateRegistrationRequest mVGenerateRegistrationRequest = (MVGenerateRegistrationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGenerateRegistrationRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVGenerateRegistrationRequest.callingCode = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGenerateRegistrationRequest.phoneNumber = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVGenerateRegistrationRequest$b */
    public static class C10681b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10680a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVGenerateRegistrationRequest$c */
    public static class C10682c extends C25240d<MVGenerateRegistrationRequest> {
        public C10682c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGenerateRegistrationRequest mVGenerateRegistrationRequest = (MVGenerateRegistrationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGenerateRegistrationRequest.mo32069g()) {
                bitSet.set(0);
            }
            if (mVGenerateRegistrationRequest.mo32068f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGenerateRegistrationRequest.mo32069g()) {
                jVar.mo61686J(mVGenerateRegistrationRequest.phoneNumber);
            }
            if (mVGenerateRegistrationRequest.mo32068f()) {
                jVar.mo61686J(mVGenerateRegistrationRequest.callingCode);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGenerateRegistrationRequest mVGenerateRegistrationRequest = (MVGenerateRegistrationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVGenerateRegistrationRequest.phoneNumber = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVGenerateRegistrationRequest.callingCode = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVGenerateRegistrationRequest$d */
    public static class C10683d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10682c(0);
        }
    }

    static {
        new C17394d0("MVGenerateRegistrationRequest");
        HashMap hashMap = new HashMap();
        f28527d = hashMap;
        hashMap.put(C25239c.class, new C10681b());
        hashMap.put(C25240d.class, new C10683d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PHONE_NUMBER, new FieldMetaData("phoneNumber", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CALLING_CODE, new FieldMetaData("callingCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28528e = unmodifiableMap;
        FieldMetaData.m61947a(MVGenerateRegistrationRequest.class, unmodifiableMap);
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
        ((C25238b) f28527d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28527d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGenerateRegistrationRequest mVGenerateRegistrationRequest = (MVGenerateRegistrationRequest) obj;
        if (!getClass().equals(mVGenerateRegistrationRequest.getClass())) {
            return getClass().getName().compareTo(mVGenerateRegistrationRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32069g()).compareTo(Boolean.valueOf(mVGenerateRegistrationRequest.mo32069g()));
        if (compareTo2 != 0 || ((mo32069g() && (compareTo2 = this.phoneNumber.compareTo(mVGenerateRegistrationRequest.phoneNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo32068f()).compareTo(Boolean.valueOf(mVGenerateRegistrationRequest.mo32068f()))) != 0)) {
            return compareTo2;
        }
        if (!mo32068f() || (compareTo = this.callingCode.compareTo(mVGenerateRegistrationRequest.callingCode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGenerateRegistrationRequest)) {
            return false;
        }
        MVGenerateRegistrationRequest mVGenerateRegistrationRequest = (MVGenerateRegistrationRequest) obj;
        boolean g = mo32069g();
        boolean g2 = mVGenerateRegistrationRequest.mo32069g();
        if ((g || g2) && (!g || !g2 || !this.phoneNumber.equals(mVGenerateRegistrationRequest.phoneNumber))) {
            return false;
        }
        boolean f = mo32068f();
        boolean f2 = mVGenerateRegistrationRequest.mo32068f();
        if ((f || f2) && (!f || !f2 || !this.callingCode.equals(mVGenerateRegistrationRequest.callingCode))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32068f() {
        return this.callingCode != null;
    }

    /* renamed from: g */
    public final boolean mo32069g() {
        return this.phoneNumber != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGenerateRegistrationRequest(", "phoneNumber:");
        String str = this.phoneNumber;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("callingCode:");
        String str2 = this.callingCode;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
