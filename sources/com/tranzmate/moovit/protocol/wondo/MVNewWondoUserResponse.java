package com.tranzmate.moovit.protocol.wondo;

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

public class MVNewWondoUserResponse implements TBase<MVNewWondoUserResponse, _Fields>, Serializable, Cloneable, Comparable<MVNewWondoUserResponse> {

    /* renamed from: b */
    public static final C25113c f30671b = new C25113c("confirmation", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f30672c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f30673d;
    public MVWondoConfirmation confirmation;

    public enum _Fields implements C25085c {
        CONFIRMATION(1, "confirmation");
        
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
            if (i != 1) {
                return null;
            }
            return CONFIRMATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVNewWondoUserResponse$a */
    public static class C12009a extends C25239c<MVNewWondoUserResponse> {
        public C12009a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNewWondoUserResponse mVNewWondoUserResponse = (MVNewWondoUserResponse) tBase;
            MVWondoConfirmation mVWondoConfirmation = mVNewWondoUserResponse.confirmation;
            if (mVWondoConfirmation != null) {
                mVWondoConfirmation.mo35648k();
            }
            C25113c cVar = MVNewWondoUserResponse.f30671b;
            gVar.mo61687K();
            if (mVNewWondoUserResponse.confirmation != null) {
                gVar.mo61711x(MVNewWondoUserResponse.f30671b);
                mVNewWondoUserResponse.confirmation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNewWondoUserResponse mVNewWondoUserResponse = (MVNewWondoUserResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVWondoConfirmation mVWondoConfirmation = new MVWondoConfirmation();
                    mVNewWondoUserResponse.confirmation = mVWondoConfirmation;
                    mVWondoConfirmation.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVWondoConfirmation mVWondoConfirmation2 = mVNewWondoUserResponse.confirmation;
            if (mVWondoConfirmation2 != null) {
                mVWondoConfirmation2.mo35648k();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVNewWondoUserResponse$b */
    public static class C12010b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12009a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVNewWondoUserResponse$c */
    public static class C12011c extends C25240d<MVNewWondoUserResponse> {
        public C12011c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNewWondoUserResponse mVNewWondoUserResponse = (MVNewWondoUserResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVNewWondoUserResponse.mo35597f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVNewWondoUserResponse.mo35597f()) {
                mVNewWondoUserResponse.confirmation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNewWondoUserResponse mVNewWondoUserResponse = (MVNewWondoUserResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVWondoConfirmation mVWondoConfirmation = new MVWondoConfirmation();
                mVNewWondoUserResponse.confirmation = mVWondoConfirmation;
                mVWondoConfirmation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVNewWondoUserResponse$d */
    public static class C12012d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12011c(0);
        }
    }

    static {
        new C17394d0("MVNewWondoUserResponse");
        HashMap hashMap = new HashMap();
        f30672c = hashMap;
        hashMap.put(C25239c.class, new C12010b());
        hashMap.put(C25240d.class, new C12012d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONFIRMATION, new FieldMetaData("confirmation", (byte) 3, new StructMetaData(MVWondoConfirmation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30673d = unmodifiableMap;
        FieldMetaData.m61947a(MVNewWondoUserResponse.class, unmodifiableMap);
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
        ((C25238b) f30672c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30672c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVNewWondoUserResponse mVNewWondoUserResponse = (MVNewWondoUserResponse) obj;
        if (!getClass().equals(mVNewWondoUserResponse.getClass())) {
            return getClass().getName().compareTo(mVNewWondoUserResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35597f()).compareTo(Boolean.valueOf(mVNewWondoUserResponse.mo35597f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo35597f() || (compareTo = this.confirmation.compareTo(mVNewWondoUserResponse.confirmation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVNewWondoUserResponse)) {
            return false;
        }
        MVNewWondoUserResponse mVNewWondoUserResponse = (MVNewWondoUserResponse) obj;
        boolean f = mo35597f();
        boolean f2 = mVNewWondoUserResponse.mo35597f();
        if ((f || f2) && (!f || !f2 || !this.confirmation.mo35639a(mVNewWondoUserResponse.confirmation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35597f() {
        return this.confirmation != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVNewWondoUserResponse(", "confirmation:");
        MVWondoConfirmation mVWondoConfirmation = this.confirmation;
        if (mVWondoConfirmation == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWondoConfirmation);
        }
        n.append(")");
        return n.toString();
    }
}
