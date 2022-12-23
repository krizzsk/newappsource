package com.tranzmate.moovit.protocol.tod.shuttles;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPaymentInfo;
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

public class MVTodGetTripOrderResponse implements TBase<MVTodGetTripOrderResponse, _Fields>, Serializable, Cloneable, Comparable<MVTodGetTripOrderResponse> {

    /* renamed from: b */
    public static final C25113c f29723b = new C25113c("order", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f29724c = new C25113c("paymentInfo", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29725d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29726e;
    public MVTodTripOrder order;
    public MVTodPaymentInfo paymentInfo;

    public enum _Fields implements C25085c {
        ORDER(1, "order"),
        PAYMENT_INFO(2, "paymentInfo");
        
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
                return ORDER;
            }
            if (i != 2) {
                return null;
            }
            return PAYMENT_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderResponse$a */
    public static class C11415a extends C25239c<MVTodGetTripOrderResponse> {
        public C11415a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetTripOrderResponse mVTodGetTripOrderResponse = (MVTodGetTripOrderResponse) tBase;
            mVTodGetTripOrderResponse.getClass();
            C25113c cVar = MVTodGetTripOrderResponse.f29723b;
            gVar.mo61687K();
            if (mVTodGetTripOrderResponse.order != null) {
                gVar.mo61711x(MVTodGetTripOrderResponse.f29723b);
                mVTodGetTripOrderResponse.order.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodGetTripOrderResponse.paymentInfo != null) {
                gVar.mo61711x(MVTodGetTripOrderResponse.f29724c);
                mVTodGetTripOrderResponse.paymentInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetTripOrderResponse mVTodGetTripOrderResponse = (MVTodGetTripOrderResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodGetTripOrderResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTodPaymentInfo mVTodPaymentInfo = new MVTodPaymentInfo();
                        mVTodGetTripOrderResponse.paymentInfo = mVTodPaymentInfo;
                        mVTodPaymentInfo.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVTodTripOrder mVTodTripOrder = new MVTodTripOrder();
                    mVTodGetTripOrderResponse.order = mVTodTripOrder;
                    mVTodTripOrder.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderResponse$b */
    public static class C11416b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11415a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderResponse$c */
    public static class C11417c extends C25240d<MVTodGetTripOrderResponse> {
        public C11417c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetTripOrderResponse mVTodGetTripOrderResponse = (MVTodGetTripOrderResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodGetTripOrderResponse.mo33973f()) {
                bitSet.set(0);
            }
            if (mVTodGetTripOrderResponse.mo33974g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTodGetTripOrderResponse.mo33973f()) {
                mVTodGetTripOrderResponse.order.mo25202X0(jVar);
            }
            if (mVTodGetTripOrderResponse.mo33974g()) {
                mVTodGetTripOrderResponse.paymentInfo.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetTripOrderResponse mVTodGetTripOrderResponse = (MVTodGetTripOrderResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVTodTripOrder mVTodTripOrder = new MVTodTripOrder();
                mVTodGetTripOrderResponse.order = mVTodTripOrder;
                mVTodTripOrder.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVTodPaymentInfo mVTodPaymentInfo = new MVTodPaymentInfo();
                mVTodGetTripOrderResponse.paymentInfo = mVTodPaymentInfo;
                mVTodPaymentInfo.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.shuttles.MVTodGetTripOrderResponse$d */
    public static class C11418d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11417c(0);
        }
    }

    static {
        new C17394d0("MVTodGetTripOrderResponse");
        HashMap hashMap = new HashMap();
        f29725d = hashMap;
        hashMap.put(C25239c.class, new C11416b());
        hashMap.put(C25240d.class, new C11418d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ORDER, new FieldMetaData("order", (byte) 3, new StructMetaData(MVTodTripOrder.class)));
        enumMap.put(_Fields.PAYMENT_INFO, new FieldMetaData("paymentInfo", (byte) 3, new StructMetaData(MVTodPaymentInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29726e = unmodifiableMap;
        FieldMetaData.m61947a(MVTodGetTripOrderResponse.class, unmodifiableMap);
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
        ((C25238b) f29725d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29725d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTodGetTripOrderResponse mVTodGetTripOrderResponse = (MVTodGetTripOrderResponse) obj;
        if (!getClass().equals(mVTodGetTripOrderResponse.getClass())) {
            return getClass().getName().compareTo(mVTodGetTripOrderResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo33973f()).compareTo(Boolean.valueOf(mVTodGetTripOrderResponse.mo33973f()));
        if (compareTo2 != 0 || ((mo33973f() && (compareTo2 = this.order.compareTo(mVTodGetTripOrderResponse.order)) != 0) || (compareTo2 = Boolean.valueOf(mo33974g()).compareTo(Boolean.valueOf(mVTodGetTripOrderResponse.mo33974g()))) != 0)) {
            return compareTo2;
        }
        if (!mo33974g() || (compareTo = this.paymentInfo.compareTo(mVTodGetTripOrderResponse.paymentInfo)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTodGetTripOrderResponse)) {
            return false;
        }
        MVTodGetTripOrderResponse mVTodGetTripOrderResponse = (MVTodGetTripOrderResponse) obj;
        boolean f = mo33973f();
        boolean f2 = mVTodGetTripOrderResponse.mo33973f();
        if ((f || f2) && (!f || !f2 || !this.order.mo34046a(mVTodGetTripOrderResponse.order))) {
            return false;
        }
        boolean g = mo33974g();
        boolean g2 = mVTodGetTripOrderResponse.mo33974g();
        if ((g || g2) && (!g || !g2 || !this.paymentInfo.mo33633a(mVTodGetTripOrderResponse.paymentInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33973f() {
        return this.order != null;
    }

    /* renamed from: g */
    public final boolean mo33974g() {
        return this.paymentInfo != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodGetTripOrderResponse(", "order:");
        MVTodTripOrder mVTodTripOrder = this.order;
        if (mVTodTripOrder == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodTripOrder);
        }
        n.append(", ");
        n.append("paymentInfo:");
        MVTodPaymentInfo mVTodPaymentInfo = this.paymentInfo;
        if (mVTodPaymentInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodPaymentInfo);
        }
        n.append(")");
        return n.toString();
    }
}
