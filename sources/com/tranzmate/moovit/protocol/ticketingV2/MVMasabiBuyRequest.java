package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
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

public class MVMasabiBuyRequest implements TBase<MVMasabiBuyRequest, _Fields>, Serializable, Cloneable, Comparable<MVMasabiBuyRequest> {

    /* renamed from: b */
    public static final C25113c f28728b = new C25113c("paymentAuthorisationToken", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28729c = new C25113c("fullBrandId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28730d = new C25113c(GroupedInventoryCardActivity.EXTRA_BODY, (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f28731e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28732f;
    public String body;
    public String fullBrandId;
    public String paymentAuthorisationToken;

    public enum _Fields implements C25085c {
        PAYMENT_AUTHORISATION_TOKEN(1, "paymentAuthorisationToken"),
        FULL_BRAND_ID(2, "fullBrandId"),
        BODY(3, GroupedInventoryCardActivity.EXTRA_BODY);
        
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
                return PAYMENT_AUTHORISATION_TOKEN;
            }
            if (i == 2) {
                return FULL_BRAND_ID;
            }
            if (i != 3) {
                return null;
            }
            return BODY;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMasabiBuyRequest$a */
    public static class C10815a extends C25239c<MVMasabiBuyRequest> {
        public C10815a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMasabiBuyRequest mVMasabiBuyRequest = (MVMasabiBuyRequest) tBase;
            mVMasabiBuyRequest.getClass();
            C25113c cVar = MVMasabiBuyRequest.f28728b;
            gVar.mo61687K();
            if (mVMasabiBuyRequest.paymentAuthorisationToken != null) {
                gVar.mo61711x(MVMasabiBuyRequest.f28728b);
                gVar.mo61686J(mVMasabiBuyRequest.paymentAuthorisationToken);
                gVar.mo61712y();
            }
            if (mVMasabiBuyRequest.fullBrandId != null) {
                gVar.mo61711x(MVMasabiBuyRequest.f28729c);
                gVar.mo61686J(mVMasabiBuyRequest.fullBrandId);
                gVar.mo61712y();
            }
            if (mVMasabiBuyRequest.body != null) {
                gVar.mo61711x(MVMasabiBuyRequest.f28730d);
                gVar.mo61686J(mVMasabiBuyRequest.body);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMasabiBuyRequest mVMasabiBuyRequest = (MVMasabiBuyRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMasabiBuyRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVMasabiBuyRequest.body = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMasabiBuyRequest.fullBrandId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMasabiBuyRequest.paymentAuthorisationToken = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMasabiBuyRequest$b */
    public static class C10816b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10815a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMasabiBuyRequest$c */
    public static class C10817c extends C25240d<MVMasabiBuyRequest> {
        public C10817c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMasabiBuyRequest mVMasabiBuyRequest = (MVMasabiBuyRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMasabiBuyRequest.mo32418h()) {
                bitSet.set(0);
            }
            if (mVMasabiBuyRequest.mo32417g()) {
                bitSet.set(1);
            }
            if (mVMasabiBuyRequest.mo32416f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVMasabiBuyRequest.mo32418h()) {
                jVar.mo61686J(mVMasabiBuyRequest.paymentAuthorisationToken);
            }
            if (mVMasabiBuyRequest.mo32417g()) {
                jVar.mo61686J(mVMasabiBuyRequest.fullBrandId);
            }
            if (mVMasabiBuyRequest.mo32416f()) {
                jVar.mo61686J(mVMasabiBuyRequest.body);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMasabiBuyRequest mVMasabiBuyRequest = (MVMasabiBuyRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVMasabiBuyRequest.paymentAuthorisationToken = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMasabiBuyRequest.fullBrandId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMasabiBuyRequest.body = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMasabiBuyRequest$d */
    public static class C10818d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10817c(0);
        }
    }

    static {
        new C17394d0("MVMasabiBuyRequest");
        HashMap hashMap = new HashMap();
        f28731e = hashMap;
        hashMap.put(C25239c.class, new C10816b());
        hashMap.put(C25240d.class, new C10818d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_AUTHORISATION_TOKEN, new FieldMetaData("paymentAuthorisationToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FULL_BRAND_ID, new FieldMetaData("fullBrandId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BODY, new FieldMetaData(GroupedInventoryCardActivity.EXTRA_BODY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28732f = unmodifiableMap;
        FieldMetaData.m61947a(MVMasabiBuyRequest.class, unmodifiableMap);
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
        ((C25238b) f28731e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28731e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMasabiBuyRequest mVMasabiBuyRequest = (MVMasabiBuyRequest) obj;
        if (!getClass().equals(mVMasabiBuyRequest.getClass())) {
            return getClass().getName().compareTo(mVMasabiBuyRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32418h()).compareTo(Boolean.valueOf(mVMasabiBuyRequest.mo32418h()));
        if (compareTo2 != 0 || ((mo32418h() && (compareTo2 = this.paymentAuthorisationToken.compareTo(mVMasabiBuyRequest.paymentAuthorisationToken)) != 0) || (compareTo2 = Boolean.valueOf(mo32417g()).compareTo(Boolean.valueOf(mVMasabiBuyRequest.mo32417g()))) != 0 || ((mo32417g() && (compareTo2 = this.fullBrandId.compareTo(mVMasabiBuyRequest.fullBrandId)) != 0) || (compareTo2 = Boolean.valueOf(mo32416f()).compareTo(Boolean.valueOf(mVMasabiBuyRequest.mo32416f()))) != 0))) {
            return compareTo2;
        }
        if (!mo32416f() || (compareTo = this.body.compareTo(mVMasabiBuyRequest.body)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMasabiBuyRequest)) {
            return false;
        }
        MVMasabiBuyRequest mVMasabiBuyRequest = (MVMasabiBuyRequest) obj;
        boolean h = mo32418h();
        boolean h2 = mVMasabiBuyRequest.mo32418h();
        if ((h || h2) && (!h || !h2 || !this.paymentAuthorisationToken.equals(mVMasabiBuyRequest.paymentAuthorisationToken))) {
            return false;
        }
        boolean g = mo32417g();
        boolean g2 = mVMasabiBuyRequest.mo32417g();
        if ((g || g2) && (!g || !g2 || !this.fullBrandId.equals(mVMasabiBuyRequest.fullBrandId))) {
            return false;
        }
        boolean f = mo32416f();
        boolean f2 = mVMasabiBuyRequest.mo32416f();
        if ((f || f2) && (!f || !f2 || !this.body.equals(mVMasabiBuyRequest.body))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32416f() {
        return this.body != null;
    }

    /* renamed from: g */
    public final boolean mo32417g() {
        return this.fullBrandId != null;
    }

    /* renamed from: h */
    public final boolean mo32418h() {
        return this.paymentAuthorisationToken != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMasabiBuyRequest(", "paymentAuthorisationToken:");
        String str = this.paymentAuthorisationToken;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("fullBrandId:");
        String str2 = this.fullBrandId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("body:");
        String str3 = this.body;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(")");
        return n.toString();
    }
}
