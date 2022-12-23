package com.tranzmate.moovit.protocol.wondo;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVExternalAppData;
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

public class MVWondoOffer implements TBase<MVWondoOffer, _Fields>, Serializable, Cloneable, Comparable<MVWondoOffer> {

    /* renamed from: b */
    public static final C25113c f30720b = new C25113c("id", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f30721c = new C25113c("providerName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30722d = new C25113c("name", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30723e = new C25113c("displayInfo", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f30724f = new C25113c("purchaseInfo", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f30725g = new C25113c("externalAppData", (byte) 12, 6);

    /* renamed from: h */
    public static final HashMap f30726h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f30727i;
    private byte __isset_bitfield = 0;
    public MVWondoOfferDisplayInfo displayInfo;
    public MVExternalAppData externalAppData;

    /* renamed from: id */
    public int f30728id;
    public String name;
    public String providerName;
    public List<MVWondoOfferPurchaseItem> purchaseInfo;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        PROVIDER_NAME(2, "providerName"),
        NAME(3, "name"),
        DISPLAY_INFO(4, "displayInfo"),
        PURCHASE_INFO(5, "purchaseInfo"),
        EXTERNAL_APP_DATA(6, "externalAppData");
        
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
            switch (i) {
                case 1:
                    return ID;
                case 2:
                    return PROVIDER_NAME;
                case 3:
                    return NAME;
                case 4:
                    return DISPLAY_INFO;
                case 5:
                    return PURCHASE_INFO;
                case 6:
                    return EXTERNAL_APP_DATA;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOffer$a */
    public static class C12037a extends C25239c<MVWondoOffer> {
        public C12037a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoOffer mVWondoOffer = (MVWondoOffer) tBase;
            mVWondoOffer.getClass();
            C25113c cVar = MVWondoOffer.f30720b;
            gVar.mo61687K();
            gVar.mo61711x(MVWondoOffer.f30720b);
            gVar.mo61678B(mVWondoOffer.f30728id);
            gVar.mo61712y();
            if (mVWondoOffer.providerName != null) {
                gVar.mo61711x(MVWondoOffer.f30721c);
                gVar.mo61686J(mVWondoOffer.providerName);
                gVar.mo61712y();
            }
            if (mVWondoOffer.name != null) {
                gVar.mo61711x(MVWondoOffer.f30722d);
                gVar.mo61686J(mVWondoOffer.name);
                gVar.mo61712y();
            }
            if (mVWondoOffer.displayInfo != null) {
                gVar.mo61711x(MVWondoOffer.f30723e);
                mVWondoOffer.displayInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWondoOffer.purchaseInfo != null) {
                gVar.mo61711x(MVWondoOffer.f30724f);
                gVar.mo61680D(new C25119e((byte) 12, mVWondoOffer.purchaseInfo.size()));
                for (MVWondoOfferPurchaseItem X0 : mVWondoOffer.purchaseInfo) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVWondoOffer.externalAppData != null) {
                gVar.mo61711x(MVWondoOffer.f30725g);
                mVWondoOffer.externalAppData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoOffer mVWondoOffer = (MVWondoOffer) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoOffer.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOffer.f30728id = gVar.mo61696i();
                            mVWondoOffer.mo35680l(true);
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOffer.providerName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOffer.name = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVWondoOfferDisplayInfo mVWondoOfferDisplayInfo = new MVWondoOfferDisplayInfo();
                            mVWondoOffer.displayInfo = mVWondoOfferDisplayInfo;
                            mVWondoOfferDisplayInfo.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVWondoOffer.purchaseInfo = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVWondoOfferPurchaseItem mVWondoOfferPurchaseItem = new MVWondoOfferPurchaseItem();
                                mVWondoOfferPurchaseItem.mo25201C1(gVar);
                                mVWondoOffer.purchaseInfo.add(mVWondoOfferPurchaseItem);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVExternalAppData mVExternalAppData = new MVExternalAppData();
                            mVWondoOffer.externalAppData = mVExternalAppData;
                            mVExternalAppData.mo25201C1(gVar);
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOffer$b */
    public static class C12038b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12037a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOffer$c */
    public static class C12039c extends C25240d<MVWondoOffer> {
        public C12039c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoOffer mVWondoOffer = (MVWondoOffer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoOffer.mo35675h()) {
                bitSet.set(0);
            }
            if (mVWondoOffer.mo35678j()) {
                bitSet.set(1);
            }
            if (mVWondoOffer.mo35677i()) {
                bitSet.set(2);
            }
            if (mVWondoOffer.mo35673f()) {
                bitSet.set(3);
            }
            if (mVWondoOffer.mo35679k()) {
                bitSet.set(4);
            }
            if (mVWondoOffer.mo35674g()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVWondoOffer.mo35675h()) {
                jVar.mo61678B(mVWondoOffer.f30728id);
            }
            if (mVWondoOffer.mo35678j()) {
                jVar.mo61686J(mVWondoOffer.providerName);
            }
            if (mVWondoOffer.mo35677i()) {
                jVar.mo61686J(mVWondoOffer.name);
            }
            if (mVWondoOffer.mo35673f()) {
                mVWondoOffer.displayInfo.mo25202X0(jVar);
            }
            if (mVWondoOffer.mo35679k()) {
                jVar.mo61678B(mVWondoOffer.purchaseInfo.size());
                for (MVWondoOfferPurchaseItem X0 : mVWondoOffer.purchaseInfo) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVWondoOffer.mo35674g()) {
                mVWondoOffer.externalAppData.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoOffer mVWondoOffer = (MVWondoOffer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVWondoOffer.f30728id = jVar.mo61696i();
                mVWondoOffer.mo35680l(true);
            }
            if (T.get(1)) {
                mVWondoOffer.providerName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVWondoOffer.name = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVWondoOfferDisplayInfo mVWondoOfferDisplayInfo = new MVWondoOfferDisplayInfo();
                mVWondoOffer.displayInfo = mVWondoOfferDisplayInfo;
                mVWondoOfferDisplayInfo.mo25201C1(jVar);
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVWondoOffer.purchaseInfo = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVWondoOfferPurchaseItem mVWondoOfferPurchaseItem = new MVWondoOfferPurchaseItem();
                    mVWondoOfferPurchaseItem.mo25201C1(jVar);
                    mVWondoOffer.purchaseInfo.add(mVWondoOfferPurchaseItem);
                }
            }
            if (T.get(5)) {
                MVExternalAppData mVExternalAppData = new MVExternalAppData();
                mVWondoOffer.externalAppData = mVExternalAppData;
                mVExternalAppData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOffer$d */
    public static class C12040d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12039c(0);
        }
    }

    static {
        new C17394d0("MVWondoOffer");
        HashMap hashMap = new HashMap();
        f30726h = hashMap;
        hashMap.put(C25239c.class, new C12038b());
        hashMap.put(C25240d.class, new C12040d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PROVIDER_NAME, new FieldMetaData("providerName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DISPLAY_INFO, new FieldMetaData("displayInfo", (byte) 3, new StructMetaData(MVWondoOfferDisplayInfo.class)));
        enumMap.put(_Fields.PURCHASE_INFO, new FieldMetaData("purchaseInfo", (byte) 3, new ListMetaData(new StructMetaData(MVWondoOfferPurchaseItem.class))));
        enumMap.put(_Fields.EXTERNAL_APP_DATA, new FieldMetaData("externalAppData", (byte) 3, new StructMetaData(MVExternalAppData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30727i = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoOffer.class, unmodifiableMap);
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
        ((C25238b) f30726h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30726h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoOffer mVWondoOffer = (MVWondoOffer) obj;
        if (!getClass().equals(mVWondoOffer.getClass())) {
            return getClass().getName().compareTo(mVWondoOffer.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35675h()).compareTo(Boolean.valueOf(mVWondoOffer.mo35675h()));
        if (compareTo2 != 0 || ((mo35675h() && (compareTo2 = C25082a.m62839c(this.f30728id, mVWondoOffer.f30728id)) != 0) || (compareTo2 = Boolean.valueOf(mo35678j()).compareTo(Boolean.valueOf(mVWondoOffer.mo35678j()))) != 0 || ((mo35678j() && (compareTo2 = this.providerName.compareTo(mVWondoOffer.providerName)) != 0) || (compareTo2 = Boolean.valueOf(mo35677i()).compareTo(Boolean.valueOf(mVWondoOffer.mo35677i()))) != 0 || ((mo35677i() && (compareTo2 = this.name.compareTo(mVWondoOffer.name)) != 0) || (compareTo2 = Boolean.valueOf(mo35673f()).compareTo(Boolean.valueOf(mVWondoOffer.mo35673f()))) != 0 || ((mo35673f() && (compareTo2 = this.displayInfo.compareTo(mVWondoOffer.displayInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo35679k()).compareTo(Boolean.valueOf(mVWondoOffer.mo35679k()))) != 0 || ((mo35679k() && (compareTo2 = C25082a.m62844h(this.purchaseInfo, mVWondoOffer.purchaseInfo)) != 0) || (compareTo2 = Boolean.valueOf(mo35674g()).compareTo(Boolean.valueOf(mVWondoOffer.mo35674g()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo35674g() || (compareTo = this.externalAppData.compareTo(mVWondoOffer.externalAppData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWondoOffer)) {
            return false;
        }
        MVWondoOffer mVWondoOffer = (MVWondoOffer) obj;
        if (this.f30728id != mVWondoOffer.f30728id) {
            return false;
        }
        boolean j = mo35678j();
        boolean j2 = mVWondoOffer.mo35678j();
        if ((j || j2) && (!j || !j2 || !this.providerName.equals(mVWondoOffer.providerName))) {
            return false;
        }
        boolean i = mo35677i();
        boolean i2 = mVWondoOffer.mo35677i();
        if ((i || i2) && (!i || !i2 || !this.name.equals(mVWondoOffer.name))) {
            return false;
        }
        boolean f = mo35673f();
        boolean f2 = mVWondoOffer.mo35673f();
        if ((f || f2) && (!f || !f2 || !this.displayInfo.mo35683a(mVWondoOffer.displayInfo))) {
            return false;
        }
        boolean k = mo35679k();
        boolean k2 = mVWondoOffer.mo35679k();
        if ((k || k2) && (!k || !k2 || !this.purchaseInfo.equals(mVWondoOffer.purchaseInfo))) {
            return false;
        }
        boolean g = mo35674g();
        boolean g2 = mVWondoOffer.mo35674g();
        if ((g || g2) && (!g || !g2 || !this.externalAppData.mo26157a(mVWondoOffer.externalAppData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35673f() {
        return this.displayInfo != null;
    }

    /* renamed from: g */
    public final boolean mo35674g() {
        return this.externalAppData != null;
    }

    /* renamed from: h */
    public final boolean mo35675h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35677i() {
        return this.name != null;
    }

    /* renamed from: j */
    public final boolean mo35678j() {
        return this.providerName != null;
    }

    /* renamed from: k */
    public final boolean mo35679k() {
        return this.purchaseInfo != null;
    }

    /* renamed from: l */
    public final void mo35680l(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoOffer(", "id:");
        C0016g.m42z(n, this.f30728id, ", ", "providerName:");
        String str = this.providerName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("name:");
        String str2 = this.name;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("displayInfo:");
        MVWondoOfferDisplayInfo mVWondoOfferDisplayInfo = this.displayInfo;
        if (mVWondoOfferDisplayInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWondoOfferDisplayInfo);
        }
        n.append(", ");
        n.append("purchaseInfo:");
        List<MVWondoOfferPurchaseItem> list = this.purchaseInfo;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("externalAppData:");
        MVExternalAppData mVExternalAppData = this.externalAppData;
        if (mVExternalAppData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVExternalAppData);
        }
        n.append(")");
        return n.toString();
    }
}
