package com.tranzmate.moovit.protocol.tod.passenger;

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

public class MVTodGetCancelFeeResponse implements TBase<MVTodGetCancelFeeResponse, _Fields>, Serializable, Cloneable, Comparable<MVTodGetCancelFeeResponse> {

    /* renamed from: b */
    public static final C25113c f29387b = new C25113c("cancelFee", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29388c = new C25113c("cancelFeeScreenInfo", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29389d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29390e;
    public MVCurrencyAmount cancelFee;
    public MVTodCancelFeeScreenInfo cancelFeeScreenInfo;
    private _Fields[] optionals = {_Fields.CANCEL_FEE};

    public enum _Fields implements C25085c {
        CANCEL_FEE(1, "cancelFee"),
        CANCEL_FEE_SCREEN_INFO(2, "cancelFeeScreenInfo");
        
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
                return CANCEL_FEE;
            }
            if (i != 2) {
                return null;
            }
            return CANCEL_FEE_SCREEN_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetCancelFeeResponse$a */
    public static class C11221a extends C25239c<MVTodGetCancelFeeResponse> {
        public C11221a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetCancelFeeResponse mVTodGetCancelFeeResponse = (MVTodGetCancelFeeResponse) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTodGetCancelFeeResponse.cancelFee;
            C25113c cVar = MVTodGetCancelFeeResponse.f29387b;
            gVar.mo61687K();
            if (mVTodGetCancelFeeResponse.cancelFee != null && mVTodGetCancelFeeResponse.mo33414f()) {
                gVar.mo61711x(MVTodGetCancelFeeResponse.f29387b);
                mVTodGetCancelFeeResponse.cancelFee.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodGetCancelFeeResponse.cancelFeeScreenInfo != null) {
                gVar.mo61711x(MVTodGetCancelFeeResponse.f29388c);
                mVTodGetCancelFeeResponse.cancelFeeScreenInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetCancelFeeResponse mVTodGetCancelFeeResponse = (MVTodGetCancelFeeResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTodGetCancelFeeResponse.cancelFee;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo = new MVTodCancelFeeScreenInfo();
                        mVTodGetCancelFeeResponse.cancelFeeScreenInfo = mVTodCancelFeeScreenInfo;
                        mVTodCancelFeeScreenInfo.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                    mVTodGetCancelFeeResponse.cancelFee = mVCurrencyAmount2;
                    mVCurrencyAmount2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetCancelFeeResponse$b */
    public static class C11222b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11221a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetCancelFeeResponse$c */
    public static class C11223c extends C25240d<MVTodGetCancelFeeResponse> {
        public C11223c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetCancelFeeResponse mVTodGetCancelFeeResponse = (MVTodGetCancelFeeResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodGetCancelFeeResponse.mo33414f()) {
                bitSet.set(0);
            }
            if (mVTodGetCancelFeeResponse.mo33415g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodGetCancelFeeResponse.mo33414f()) {
                mVTodGetCancelFeeResponse.cancelFee.mo25202X0(jVar);
            }
            if (mVTodGetCancelFeeResponse.mo33415g()) {
                mVTodGetCancelFeeResponse.cancelFeeScreenInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetCancelFeeResponse mVTodGetCancelFeeResponse = (MVTodGetCancelFeeResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodGetCancelFeeResponse.cancelFee = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo = new MVTodCancelFeeScreenInfo();
                mVTodGetCancelFeeResponse.cancelFeeScreenInfo = mVTodCancelFeeScreenInfo;
                mVTodCancelFeeScreenInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetCancelFeeResponse$d */
    public static class C11224d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11223c(0);
        }
    }

    static {
        new C17394d0("MVTodGetCancelFeeResponse");
        HashMap hashMap = new HashMap();
        f29389d = hashMap;
        hashMap.put(C25239c.class, new C11222b());
        hashMap.put(C25240d.class, new C11224d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CANCEL_FEE, new FieldMetaData("cancelFee", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.CANCEL_FEE_SCREEN_INFO, new FieldMetaData("cancelFeeScreenInfo", (byte) 3, new StructMetaData(MVTodCancelFeeScreenInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29390e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodGetCancelFeeResponse.class, unmodifiableMap);
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
        ((C25238b) f29389d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29389d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodGetCancelFeeResponse mVTodGetCancelFeeResponse = (MVTodGetCancelFeeResponse) obj;
        if (!getClass().equals(mVTodGetCancelFeeResponse.getClass())) {
            return getClass().getName().compareTo(mVTodGetCancelFeeResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33414f()).compareTo(Boolean.valueOf(mVTodGetCancelFeeResponse.mo33414f()));
        if (compareTo2 != 0 || ((mo33414f() && (compareTo2 = this.cancelFee.compareTo(mVTodGetCancelFeeResponse.cancelFee)) != 0) || (compareTo2 = Boolean.valueOf(mo33415g()).compareTo(Boolean.valueOf(mVTodGetCancelFeeResponse.mo33415g()))) != 0)) {
            return compareTo2;
        }
        if (!mo33415g() || (compareTo = this.cancelFeeScreenInfo.compareTo(mVTodGetCancelFeeResponse.cancelFeeScreenInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodGetCancelFeeResponse)) {
            return false;
        }
        MVTodGetCancelFeeResponse mVTodGetCancelFeeResponse = (MVTodGetCancelFeeResponse) obj;
        boolean f = mo33414f();
        boolean f2 = mVTodGetCancelFeeResponse.mo33414f();
        if ((f || f2) && (!f || !f2 || !this.cancelFee.mo26102a(mVTodGetCancelFeeResponse.cancelFee))) {
            return false;
        }
        boolean g = mo33415g();
        boolean g2 = mVTodGetCancelFeeResponse.mo33415g();
        if ((g || g2) && (!g || !g2 || !this.cancelFeeScreenInfo.mo33371a(mVTodGetCancelFeeResponse.cancelFeeScreenInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33414f() {
        return this.cancelFee != null;
    }

    /* renamed from: g */
    public final boolean mo33415g() {
        return this.cancelFeeScreenInfo != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVTodGetCancelFeeResponse(");
        if (mo33414f()) {
            sb.append("cancelFee:");
            MVCurrencyAmount mVCurrencyAmount = this.cancelFee;
            if (mVCurrencyAmount == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVCurrencyAmount);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("cancelFeeScreenInfo:");
        MVTodCancelFeeScreenInfo mVTodCancelFeeScreenInfo = this.cancelFeeScreenInfo;
        if (mVTodCancelFeeScreenInfo == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVTodCancelFeeScreenInfo);
        }
        sb.append(")");
        return sb.toString();
    }
}
