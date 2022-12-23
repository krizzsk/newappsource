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
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVTodCancelOrderRequest implements TBase<MVTodCancelOrderRequest, _Fields>, Serializable, Cloneable, Comparable<MVTodCancelOrderRequest> {

    /* renamed from: b */
    public static final C25113c f29370b = new C25113c("rideId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29371c = new C25113c("cancellationFee", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29372d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29373e;
    public MVCurrencyAmount cancellationFee;
    private _Fields[] optionals = {_Fields.CANCELLATION_FEE};
    public String rideId;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        CANCELLATION_FEE(2, "cancellationFee");
        
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
                return RIDE_ID;
            }
            if (i != 2) {
                return null;
            }
            return CANCELLATION_FEE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelOrderRequest$a */
    public static class C11201a extends C25239c<MVTodCancelOrderRequest> {
        public C11201a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodCancelOrderRequest mVTodCancelOrderRequest = (MVTodCancelOrderRequest) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVTodCancelOrderRequest.cancellationFee;
            C25113c cVar = MVTodCancelOrderRequest.f29370b;
            gVar.mo61687K();
            if (mVTodCancelOrderRequest.rideId != null) {
                gVar.mo61711x(MVTodCancelOrderRequest.f29370b);
                gVar.mo61686J(mVTodCancelOrderRequest.rideId);
                gVar.mo61712y();
            }
            if (mVTodCancelOrderRequest.cancellationFee != null && mVTodCancelOrderRequest.mo33381f()) {
                gVar.mo61711x(MVTodCancelOrderRequest.f29371c);
                mVTodCancelOrderRequest.cancellationFee.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodCancelOrderRequest mVTodCancelOrderRequest = (MVTodCancelOrderRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVTodCancelOrderRequest.cancellationFee;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                        mVTodCancelOrderRequest.cancellationFee = mVCurrencyAmount2;
                        mVCurrencyAmount2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTodCancelOrderRequest.rideId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelOrderRequest$b */
    public static class C11202b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11201a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelOrderRequest$c */
    public static class C11203c extends C25240d<MVTodCancelOrderRequest> {
        public C11203c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodCancelOrderRequest mVTodCancelOrderRequest = (MVTodCancelOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodCancelOrderRequest.mo33382g()) {
                bitSet.set(0);
            }
            if (mVTodCancelOrderRequest.mo33381f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodCancelOrderRequest.mo33382g()) {
                jVar.mo61686J(mVTodCancelOrderRequest.rideId);
            }
            if (mVTodCancelOrderRequest.mo33381f()) {
                mVTodCancelOrderRequest.cancellationFee.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodCancelOrderRequest mVTodCancelOrderRequest = (MVTodCancelOrderRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTodCancelOrderRequest.rideId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodCancelOrderRequest.cancellationFee = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelOrderRequest$d */
    public static class C11204d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11203c(0);
        }
    }

    static {
        new C17394d0("MVTodCancelOrderRequest");
        HashMap hashMap = new HashMap();
        f29372d = hashMap;
        hashMap.put(C25239c.class, new C11202b());
        hashMap.put(C25240d.class, new C11204d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CANCELLATION_FEE, new FieldMetaData("cancellationFee", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29373e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodCancelOrderRequest.class, unmodifiableMap);
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
        ((C25238b) f29372d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29372d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodCancelOrderRequest mVTodCancelOrderRequest = (MVTodCancelOrderRequest) obj;
        if (!getClass().equals(mVTodCancelOrderRequest.getClass())) {
            return getClass().getName().compareTo(mVTodCancelOrderRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33382g()).compareTo(Boolean.valueOf(mVTodCancelOrderRequest.mo33382g()));
        if (compareTo2 != 0 || ((mo33382g() && (compareTo2 = this.rideId.compareTo(mVTodCancelOrderRequest.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo33381f()).compareTo(Boolean.valueOf(mVTodCancelOrderRequest.mo33381f()))) != 0)) {
            return compareTo2;
        }
        if (!mo33381f() || (compareTo = this.cancellationFee.compareTo(mVTodCancelOrderRequest.cancellationFee)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodCancelOrderRequest)) {
            return false;
        }
        MVTodCancelOrderRequest mVTodCancelOrderRequest = (MVTodCancelOrderRequest) obj;
        boolean g = mo33382g();
        boolean g2 = mVTodCancelOrderRequest.mo33382g();
        if ((g || g2) && (!g || !g2 || !this.rideId.equals(mVTodCancelOrderRequest.rideId))) {
            return false;
        }
        boolean f = mo33381f();
        boolean f2 = mVTodCancelOrderRequest.mo33381f();
        if ((f || f2) && (!f || !f2 || !this.cancellationFee.mo26102a(mVTodCancelOrderRequest.cancellationFee))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33381f() {
        return this.cancellationFee != null;
    }

    /* renamed from: g */
    public final boolean mo33382g() {
        return this.rideId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodCancelOrderRequest(", "rideId:");
        String str = this.rideId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo33381f()) {
            n.append(", ");
            n.append("cancellationFee:");
            MVCurrencyAmount mVCurrencyAmount = this.cancellationFee;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        n.append(")");
        return n.toString();
    }
}
