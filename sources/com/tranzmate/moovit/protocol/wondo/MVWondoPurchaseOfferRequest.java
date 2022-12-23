package com.tranzmate.moovit.protocol.wondo;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVWondoPurchaseOfferRequest implements TBase<MVWondoPurchaseOfferRequest, _Fields>, Serializable, Cloneable, Comparable<MVWondoPurchaseOfferRequest> {

    /* renamed from: b */
    public static final C25113c f30753b = new C25113c("offerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30754c = new C25113c("purchaseInfo", (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f30755d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30756e;
    private byte __isset_bitfield = 0;
    public int offerId;
    public List<MVWondoOfferPurchaseItem> purchaseInfo;

    public enum _Fields implements C25085c {
        OFFER_ID(1, "offerId"),
        PURCHASE_INFO(2, "purchaseInfo");
        
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
                return OFFER_ID;
            }
            if (i != 2) {
                return null;
            }
            return PURCHASE_INFO;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoPurchaseOfferRequest$a */
    public static class C12057a extends C25239c<MVWondoPurchaseOfferRequest> {
        public C12057a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoPurchaseOfferRequest mVWondoPurchaseOfferRequest = (MVWondoPurchaseOfferRequest) tBase;
            mVWondoPurchaseOfferRequest.getClass();
            C25113c cVar = MVWondoPurchaseOfferRequest.f30753b;
            gVar.mo61687K();
            gVar.mo61711x(MVWondoPurchaseOfferRequest.f30753b);
            gVar.mo61678B(mVWondoPurchaseOfferRequest.offerId);
            gVar.mo61712y();
            if (mVWondoPurchaseOfferRequest.purchaseInfo != null) {
                gVar.mo61711x(MVWondoPurchaseOfferRequest.f30754c);
                gVar.mo61680D(new C25119e((byte) 12, mVWondoPurchaseOfferRequest.purchaseInfo.size()));
                for (MVWondoOfferPurchaseItem X0 : mVWondoPurchaseOfferRequest.purchaseInfo) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoPurchaseOfferRequest mVWondoPurchaseOfferRequest = (MVWondoPurchaseOfferRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoPurchaseOfferRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVWondoPurchaseOfferRequest.purchaseInfo = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            MVWondoOfferPurchaseItem mVWondoOfferPurchaseItem = new MVWondoOfferPurchaseItem();
                            mVWondoOfferPurchaseItem.mo25201C1(gVar);
                            mVWondoPurchaseOfferRequest.purchaseInfo.add(mVWondoOfferPurchaseItem);
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVWondoPurchaseOfferRequest.offerId = gVar.mo61696i();
                    mVWondoPurchaseOfferRequest.mo35726h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoPurchaseOfferRequest$b */
    public static class C12058b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12057a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoPurchaseOfferRequest$c */
    public static class C12059c extends C25240d<MVWondoPurchaseOfferRequest> {
        public C12059c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoPurchaseOfferRequest mVWondoPurchaseOfferRequest = (MVWondoPurchaseOfferRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoPurchaseOfferRequest.mo35724f()) {
                bitSet.set(0);
            }
            if (mVWondoPurchaseOfferRequest.mo35725g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVWondoPurchaseOfferRequest.mo35724f()) {
                jVar.mo61678B(mVWondoPurchaseOfferRequest.offerId);
            }
            if (mVWondoPurchaseOfferRequest.mo35725g()) {
                jVar.mo61678B(mVWondoPurchaseOfferRequest.purchaseInfo.size());
                for (MVWondoOfferPurchaseItem X0 : mVWondoPurchaseOfferRequest.purchaseInfo) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoPurchaseOfferRequest mVWondoPurchaseOfferRequest = (MVWondoPurchaseOfferRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVWondoPurchaseOfferRequest.offerId = jVar.mo61696i();
                mVWondoPurchaseOfferRequest.mo35726h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVWondoPurchaseOfferRequest.purchaseInfo = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWondoOfferPurchaseItem mVWondoOfferPurchaseItem = new MVWondoOfferPurchaseItem();
                    mVWondoOfferPurchaseItem.mo25201C1(jVar);
                    mVWondoPurchaseOfferRequest.purchaseInfo.add(mVWondoOfferPurchaseItem);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoPurchaseOfferRequest$d */
    public static class C12060d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12059c(0);
        }
    }

    static {
        new C17394d0("MVWondoPurchaseOfferRequest");
        HashMap hashMap = new HashMap();
        f30755d = hashMap;
        hashMap.put(C25239c.class, new C12058b());
        hashMap.put(C25240d.class, new C12060d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OFFER_ID, new FieldMetaData("offerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PURCHASE_INFO, new FieldMetaData("purchaseInfo", (byte) 3, new ListMetaData(new StructMetaData(MVWondoOfferPurchaseItem.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30756e = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoPurchaseOfferRequest.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f30755d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30755d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVWondoPurchaseOfferRequest mVWondoPurchaseOfferRequest = (MVWondoPurchaseOfferRequest) obj;
        if (!getClass().equals(mVWondoPurchaseOfferRequest.getClass())) {
            return getClass().getName().compareTo(mVWondoPurchaseOfferRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35724f()).compareTo(Boolean.valueOf(mVWondoPurchaseOfferRequest.mo35724f()));
        if (compareTo != 0 || ((mo35724f() && (compareTo = C25082a.m62839c(this.offerId, mVWondoPurchaseOfferRequest.offerId)) != 0) || (compareTo = Boolean.valueOf(mo35725g()).compareTo(Boolean.valueOf(mVWondoPurchaseOfferRequest.mo35725g()))) != 0)) {
            return compareTo;
        }
        if (!mo35725g() || (h = C25082a.m62844h(this.purchaseInfo, mVWondoPurchaseOfferRequest.purchaseInfo)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWondoPurchaseOfferRequest)) {
            return false;
        }
        MVWondoPurchaseOfferRequest mVWondoPurchaseOfferRequest = (MVWondoPurchaseOfferRequest) obj;
        if (this.offerId != mVWondoPurchaseOfferRequest.offerId) {
            return false;
        }
        boolean g = mo35725g();
        boolean g2 = mVWondoPurchaseOfferRequest.mo35725g();
        if ((g || g2) && (!g || !g2 || !this.purchaseInfo.equals(mVWondoPurchaseOfferRequest.purchaseInfo))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35724f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo35725g() {
        return this.purchaseInfo != null;
    }

    /* renamed from: h */
    public final void mo35726h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoPurchaseOfferRequest(", "offerId:");
        C0016g.m42z(n, this.offerId, ", ", "purchaseInfo:");
        List<MVWondoOfferPurchaseItem> list = this.purchaseInfo;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
