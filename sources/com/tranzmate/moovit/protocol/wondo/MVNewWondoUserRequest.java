package com.tranzmate.moovit.protocol.wondo;

import com.appboy.support.StringUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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

public class MVNewWondoUserRequest implements TBase<MVNewWondoUserRequest, _Fields>, Serializable, Cloneable, Comparable<MVNewWondoUserRequest> {

    /* renamed from: b */
    public static final C25113c f30667b = new C25113c("referrer", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30668c = new C25113c(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30669d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30670e;
    private _Fields[] optionals = {_Fields.REFERRER, _Fields.ORIGIN};
    public String origin;
    public String referrer;

    public enum _Fields implements C25085c {
        REFERRER(1, "referrer"),
        ORIGIN(2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        
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
                return REFERRER;
            }
            if (i != 2) {
                return null;
            }
            return ORIGIN;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVNewWondoUserRequest$a */
    public static class C12005a extends C25239c<MVNewWondoUserRequest> {
        public C12005a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNewWondoUserRequest mVNewWondoUserRequest = (MVNewWondoUserRequest) tBase;
            mVNewWondoUserRequest.getClass();
            C25113c cVar = MVNewWondoUserRequest.f30667b;
            gVar.mo61687K();
            if (mVNewWondoUserRequest.referrer != null && mVNewWondoUserRequest.mo35591g()) {
                gVar.mo61711x(MVNewWondoUserRequest.f30667b);
                gVar.mo61686J(mVNewWondoUserRequest.referrer);
                gVar.mo61712y();
            }
            if (mVNewWondoUserRequest.origin != null && mVNewWondoUserRequest.mo35590f()) {
                gVar.mo61711x(MVNewWondoUserRequest.f30668c);
                gVar.mo61686J(mVNewWondoUserRequest.origin);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNewWondoUserRequest mVNewWondoUserRequest = (MVNewWondoUserRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVNewWondoUserRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVNewWondoUserRequest.origin = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVNewWondoUserRequest.referrer = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVNewWondoUserRequest$b */
    public static class C12006b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12005a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVNewWondoUserRequest$c */
    public static class C12007c extends C25240d<MVNewWondoUserRequest> {
        public C12007c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNewWondoUserRequest mVNewWondoUserRequest = (MVNewWondoUserRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVNewWondoUserRequest.mo35591g()) {
                bitSet.set(0);
            }
            if (mVNewWondoUserRequest.mo35590f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVNewWondoUserRequest.mo35591g()) {
                jVar.mo61686J(mVNewWondoUserRequest.referrer);
            }
            if (mVNewWondoUserRequest.mo35590f()) {
                jVar.mo61686J(mVNewWondoUserRequest.origin);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNewWondoUserRequest mVNewWondoUserRequest = (MVNewWondoUserRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVNewWondoUserRequest.referrer = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVNewWondoUserRequest.origin = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVNewWondoUserRequest$d */
    public static class C12008d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12007c(0);
        }
    }

    static {
        new C17394d0("MVNewWondoUserRequest");
        HashMap hashMap = new HashMap();
        f30669d = hashMap;
        hashMap.put(C25239c.class, new C12006b());
        hashMap.put(C25240d.class, new C12008d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REFERRER, new FieldMetaData("referrer", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ORIGIN, new FieldMetaData(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30670e = unmodifiableMap;
        FieldMetaData.m61947a(MVNewWondoUserRequest.class, unmodifiableMap);
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
        ((C25238b) f30669d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30669d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVNewWondoUserRequest mVNewWondoUserRequest = (MVNewWondoUserRequest) obj;
        if (!getClass().equals(mVNewWondoUserRequest.getClass())) {
            return getClass().getName().compareTo(mVNewWondoUserRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35591g()).compareTo(Boolean.valueOf(mVNewWondoUserRequest.mo35591g()));
        if (compareTo2 != 0 || ((mo35591g() && (compareTo2 = this.referrer.compareTo(mVNewWondoUserRequest.referrer)) != 0) || (compareTo2 = Boolean.valueOf(mo35590f()).compareTo(Boolean.valueOf(mVNewWondoUserRequest.mo35590f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35590f() || (compareTo = this.origin.compareTo(mVNewWondoUserRequest.origin)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVNewWondoUserRequest)) {
            return false;
        }
        MVNewWondoUserRequest mVNewWondoUserRequest = (MVNewWondoUserRequest) obj;
        boolean g = mo35591g();
        boolean g2 = mVNewWondoUserRequest.mo35591g();
        if ((g || g2) && (!g || !g2 || !this.referrer.equals(mVNewWondoUserRequest.referrer))) {
            return false;
        }
        boolean f = mo35590f();
        boolean f2 = mVNewWondoUserRequest.mo35590f();
        if ((f || f2) && (!f || !f2 || !this.origin.equals(mVNewWondoUserRequest.origin))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35590f() {
        return this.origin != null;
    }

    /* renamed from: g */
    public final boolean mo35591g() {
        return this.referrer != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVNewWondoUserRequest(");
        if (mo35591g()) {
            sb.append("referrer:");
            String str = this.referrer;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo35590f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("origin:");
            String str2 = this.origin;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
