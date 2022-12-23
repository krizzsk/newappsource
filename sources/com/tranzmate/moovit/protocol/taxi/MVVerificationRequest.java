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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVVerificationRequest implements TBase<MVVerificationRequest, _Fields>, Serializable, Cloneable, Comparable<MVVerificationRequest> {

    /* renamed from: b */
    public static final C25113c f28652b = new C25113c("pinNumber", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28653c = new C25113c("source", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f28654d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28655e;
    private _Fields[] optionals = {_Fields.SOURCE};
    public String pinNumber;
    public MVSourceFeature source;

    public enum _Fields implements C25085c {
        PIN_NUMBER(1, "pinNumber"),
        SOURCE(2, "source");
        
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
                return PIN_NUMBER;
            }
            if (i != 2) {
                return null;
            }
            return SOURCE;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVVerificationRequest$a */
    public static class C10756a extends C25239c<MVVerificationRequest> {
        public C10756a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVerificationRequest mVVerificationRequest = (MVVerificationRequest) tBase;
            mVVerificationRequest.getClass();
            C25113c cVar = MVVerificationRequest.f28652b;
            gVar.mo61687K();
            if (mVVerificationRequest.pinNumber != null) {
                gVar.mo61711x(MVVerificationRequest.f28652b);
                gVar.mo61686J(mVVerificationRequest.pinNumber);
                gVar.mo61712y();
            }
            if (mVVerificationRequest.source != null && mVVerificationRequest.mo32290g()) {
                gVar.mo61711x(MVVerificationRequest.f28653c);
                gVar.mo61678B(mVVerificationRequest.source.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVerificationRequest mVVerificationRequest = (MVVerificationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVVerificationRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVVerificationRequest.source = MVSourceFeature.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVVerificationRequest.pinNumber = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVVerificationRequest$b */
    public static class C10757b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10756a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVVerificationRequest$c */
    public static class C10758c extends C25240d<MVVerificationRequest> {
        public C10758c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVVerificationRequest mVVerificationRequest = (MVVerificationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVVerificationRequest.mo32289f()) {
                bitSet.set(0);
            }
            if (mVVerificationRequest.mo32290g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVVerificationRequest.mo32289f()) {
                jVar.mo61686J(mVVerificationRequest.pinNumber);
            }
            if (mVVerificationRequest.mo32290g()) {
                jVar.mo61678B(mVVerificationRequest.source.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVVerificationRequest mVVerificationRequest = (MVVerificationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVVerificationRequest.pinNumber = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVVerificationRequest.source = MVSourceFeature.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVVerificationRequest$d */
    public static class C10759d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10758c(0);
        }
    }

    static {
        new C17394d0("MVVerificationRequest");
        HashMap hashMap = new HashMap();
        f28654d = hashMap;
        hashMap.put(C25239c.class, new C10757b());
        hashMap.put(C25240d.class, new C10759d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PIN_NUMBER, new FieldMetaData("pinNumber", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SOURCE, new FieldMetaData("source", (byte) 2, new EnumMetaData(MVSourceFeature.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28655e = unmodifiableMap;
        FieldMetaData.m61947a(MVVerificationRequest.class, unmodifiableMap);
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
        ((C25238b) f28654d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28654d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVVerificationRequest mVVerificationRequest = (MVVerificationRequest) obj;
        if (!getClass().equals(mVVerificationRequest.getClass())) {
            return getClass().getName().compareTo(mVVerificationRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32289f()).compareTo(Boolean.valueOf(mVVerificationRequest.mo32289f()));
        if (compareTo2 != 0 || ((mo32289f() && (compareTo2 = this.pinNumber.compareTo(mVVerificationRequest.pinNumber)) != 0) || (compareTo2 = Boolean.valueOf(mo32290g()).compareTo(Boolean.valueOf(mVVerificationRequest.mo32290g()))) != 0)) {
            return compareTo2;
        }
        if (!mo32290g() || (compareTo = this.source.compareTo(mVVerificationRequest.source)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVVerificationRequest)) {
            return false;
        }
        MVVerificationRequest mVVerificationRequest = (MVVerificationRequest) obj;
        boolean f = mo32289f();
        boolean f2 = mVVerificationRequest.mo32289f();
        if ((f || f2) && (!f || !f2 || !this.pinNumber.equals(mVVerificationRequest.pinNumber))) {
            return false;
        }
        boolean g = mo32290g();
        boolean g2 = mVVerificationRequest.mo32290g();
        if ((g || g2) && (!g || !g2 || !this.source.equals(mVVerificationRequest.source))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32289f() {
        return this.pinNumber != null;
    }

    /* renamed from: g */
    public final boolean mo32290g() {
        return this.source != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVVerificationRequest(", "pinNumber:");
        String str = this.pinNumber;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo32290g()) {
            n.append(", ");
            n.append("source:");
            MVSourceFeature mVSourceFeature = this.source;
            if (mVSourceFeature == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSourceFeature);
            }
        }
        n.append(")");
        return n.toString();
    }
}
