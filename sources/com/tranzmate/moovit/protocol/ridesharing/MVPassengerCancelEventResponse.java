package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
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

public class MVPassengerCancelEventResponse implements TBase<MVPassengerCancelEventResponse, _Fields>, Serializable, Cloneable, Comparable<MVPassengerCancelEventResponse> {

    /* renamed from: b */
    public static final C25113c f28023b = new C25113c("fee", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f28024c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28025d;
    public MVCurrencyAmount fee;
    private _Fields[] optionals = {_Fields.FEE};

    public enum _Fields implements C25085c {
        FEE(1, "fee");
        
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
            return FEE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventResponse$a */
    public static class C10318a extends C25239c<MVPassengerCancelEventResponse> {
        public C10318a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelEventResponse mVPassengerCancelEventResponse = (MVPassengerCancelEventResponse) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVPassengerCancelEventResponse.fee;
            C25113c cVar = MVPassengerCancelEventResponse.f28023b;
            gVar.mo61687K();
            if (mVPassengerCancelEventResponse.fee != null && mVPassengerCancelEventResponse.mo31198f()) {
                gVar.mo61711x(MVPassengerCancelEventResponse.f28023b);
                mVPassengerCancelEventResponse.fee.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelEventResponse mVPassengerCancelEventResponse = (MVPassengerCancelEventResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVPassengerCancelEventResponse.fee;
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVPassengerCancelEventResponse.fee = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventResponse$b */
    public static class C10319b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10318a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventResponse$c */
    public static class C10320c extends C25240d<MVPassengerCancelEventResponse> {
        public C10320c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelEventResponse mVPassengerCancelEventResponse = (MVPassengerCancelEventResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerCancelEventResponse.mo31198f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVPassengerCancelEventResponse.mo31198f()) {
                mVPassengerCancelEventResponse.fee.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerCancelEventResponse mVPassengerCancelEventResponse = (MVPassengerCancelEventResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPassengerCancelEventResponse.fee = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventResponse$d */
    public static class C10321d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10320c(0);
        }
    }

    static {
        new C17394d0("MVPassengerCancelEventResponse");
        HashMap hashMap = new HashMap();
        f28024c = hashMap;
        hashMap.put(C25239c.class, new C10319b());
        hashMap.put(C25240d.class, new C10321d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FEE, new FieldMetaData("fee", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28025d = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerCancelEventResponse.class, unmodifiableMap);
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
        ((C25238b) f28024c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28024c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerCancelEventResponse mVPassengerCancelEventResponse = (MVPassengerCancelEventResponse) obj;
        if (!getClass().equals(mVPassengerCancelEventResponse.getClass())) {
            return getClass().getName().compareTo(mVPassengerCancelEventResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31198f()).compareTo(Boolean.valueOf(mVPassengerCancelEventResponse.mo31198f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo31198f() || (compareTo = this.fee.compareTo(mVPassengerCancelEventResponse.fee)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerCancelEventResponse)) {
            return false;
        }
        MVPassengerCancelEventResponse mVPassengerCancelEventResponse = (MVPassengerCancelEventResponse) obj;
        boolean f = mo31198f();
        boolean f2 = mVPassengerCancelEventResponse.mo31198f();
        if ((f || f2) && (!f || !f2 || !this.fee.mo26102a(mVPassengerCancelEventResponse.fee))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31198f() {
        return this.fee != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVPassengerCancelEventResponse(");
        if (mo31198f()) {
            sb.append("fee:");
            MVCurrencyAmount mVCurrencyAmount = this.fee;
            if (mVCurrencyAmount == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVCurrencyAmount);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
