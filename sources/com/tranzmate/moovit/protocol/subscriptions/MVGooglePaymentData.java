package com.tranzmate.moovit.protocol.subscriptions;

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

public class MVGooglePaymentData implements TBase<MVGooglePaymentData, _Fields>, Serializable, Cloneable, Comparable<MVGooglePaymentData> {

    /* renamed from: b */
    public static final C25113c f28360b = new C25113c("sku", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28361c = new C25113c("purchaseToken", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28362d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28363e;
    public String purchaseToken;
    public String sku;

    public enum _Fields implements C25085c {
        SKU(1, "sku"),
        PURCHASE_TOKEN(2, "purchaseToken");
        
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
                return SKU;
            }
            if (i != 2) {
                return null;
            }
            return PURCHASE_TOKEN;
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

    /* renamed from: com.tranzmate.moovit.protocol.subscriptions.MVGooglePaymentData$a */
    public static class C10567a extends C25239c<MVGooglePaymentData> {
        public C10567a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGooglePaymentData mVGooglePaymentData = (MVGooglePaymentData) tBase;
            mVGooglePaymentData.getClass();
            C25113c cVar = MVGooglePaymentData.f28360b;
            gVar.mo61687K();
            if (mVGooglePaymentData.sku != null) {
                gVar.mo61711x(MVGooglePaymentData.f28360b);
                gVar.mo61686J(mVGooglePaymentData.sku);
                gVar.mo61712y();
            }
            if (mVGooglePaymentData.purchaseToken != null) {
                gVar.mo61711x(MVGooglePaymentData.f28361c);
                gVar.mo61686J(mVGooglePaymentData.purchaseToken);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGooglePaymentData mVGooglePaymentData = (MVGooglePaymentData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGooglePaymentData.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVGooglePaymentData.purchaseToken = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGooglePaymentData.sku = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.subscriptions.MVGooglePaymentData$b */
    public static class C10568b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10567a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.subscriptions.MVGooglePaymentData$c */
    public static class C10569c extends C25240d<MVGooglePaymentData> {
        public C10569c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGooglePaymentData mVGooglePaymentData = (MVGooglePaymentData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGooglePaymentData.mo31805g()) {
                bitSet.set(0);
            }
            if (mVGooglePaymentData.mo31804f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGooglePaymentData.mo31805g()) {
                jVar.mo61686J(mVGooglePaymentData.sku);
            }
            if (mVGooglePaymentData.mo31804f()) {
                jVar.mo61686J(mVGooglePaymentData.purchaseToken);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGooglePaymentData mVGooglePaymentData = (MVGooglePaymentData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVGooglePaymentData.sku = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVGooglePaymentData.purchaseToken = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.subscriptions.MVGooglePaymentData$d */
    public static class C10570d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10569c(0);
        }
    }

    static {
        new C17394d0("MVGooglePaymentData");
        HashMap hashMap = new HashMap();
        f28362d = hashMap;
        hashMap.put(C25239c.class, new C10568b());
        hashMap.put(C25240d.class, new C10570d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SKU, new FieldMetaData("sku", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PURCHASE_TOKEN, new FieldMetaData("purchaseToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28363e = unmodifiableMap;
        FieldMetaData.m61947a(MVGooglePaymentData.class, unmodifiableMap);
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
        ((C25238b) f28362d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28362d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVGooglePaymentData mVGooglePaymentData = (MVGooglePaymentData) obj;
        if (!getClass().equals(mVGooglePaymentData.getClass())) {
            return getClass().getName().compareTo(mVGooglePaymentData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31805g()).compareTo(Boolean.valueOf(mVGooglePaymentData.mo31805g()));
        if (compareTo2 != 0 || ((mo31805g() && (compareTo2 = this.sku.compareTo(mVGooglePaymentData.sku)) != 0) || (compareTo2 = Boolean.valueOf(mo31804f()).compareTo(Boolean.valueOf(mVGooglePaymentData.mo31804f()))) != 0)) {
            return compareTo2;
        }
        if (!mo31804f() || (compareTo = this.purchaseToken.compareTo(mVGooglePaymentData.purchaseToken)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGooglePaymentData)) {
            return false;
        }
        MVGooglePaymentData mVGooglePaymentData = (MVGooglePaymentData) obj;
        boolean g = mo31805g();
        boolean g2 = mVGooglePaymentData.mo31805g();
        if ((g || g2) && (!g || !g2 || !this.sku.equals(mVGooglePaymentData.sku))) {
            return false;
        }
        boolean f = mo31804f();
        boolean f2 = mVGooglePaymentData.mo31804f();
        if ((f || f2) && (!f || !f2 || !this.purchaseToken.equals(mVGooglePaymentData.purchaseToken))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31804f() {
        return this.purchaseToken != null;
    }

    /* renamed from: g */
    public final boolean mo31805g() {
        return this.sku != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGooglePaymentData(", "sku:");
        String str = this.sku;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("purchaseToken:");
        String str2 = this.purchaseToken;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
