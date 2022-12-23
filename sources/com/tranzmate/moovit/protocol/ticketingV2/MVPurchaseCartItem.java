package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.models.InAppMessageBase;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVInfoBoxData;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVPurchaseCartItem implements TBase<MVPurchaseCartItem, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseCartItem> {

    /* renamed from: b */
    public static final C25113c f28776b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28777c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28778d = new C25113c("quantity", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f28779e = new C25113c(InAppMessageBase.MESSAGE, (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28780f = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f28781g = new C25113c("fullPrice", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f28782h = new C25113c("isRemovable", (byte) 2, 7);

    /* renamed from: i */
    public static final C25113c f28783i = new C25113c("infoBoxData", (byte) 12, 8);

    /* renamed from: j */
    public static final HashMap f28784j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f28785k;
    private byte __isset_bitfield = 0;
    public MVCurrencyAmount fullPrice;

    /* renamed from: id */
    public String f28786id;
    public MVInfoBoxData infoBoxData;
    public boolean isRemovable;
    public String message;
    public String name;
    private _Fields[] optionals = {_Fields.MESSAGE, _Fields.FULL_PRICE, _Fields.INFO_BOX_DATA};
    public MVCurrencyAmount price;
    public int quantity;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        NAME(2, "name"),
        QUANTITY(3, "quantity"),
        MESSAGE(4, InAppMessageBase.MESSAGE),
        PRICE(5, InAppPurchaseMetaData.KEY_PRICE),
        FULL_PRICE(6, "fullPrice"),
        IS_REMOVABLE(7, "isRemovable"),
        INFO_BOX_DATA(8, "infoBoxData");
        
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
                    return NAME;
                case 3:
                    return QUANTITY;
                case 4:
                    return MESSAGE;
                case 5:
                    return PRICE;
                case 6:
                    return FULL_PRICE;
                case 7:
                    return IS_REMOVABLE;
                case 8:
                    return INFO_BOX_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartItem$a */
    public static class C10856a extends C25239c<MVPurchaseCartItem> {
        public C10856a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartItem mVPurchaseCartItem = (MVPurchaseCartItem) tBase;
            mVPurchaseCartItem.getClass();
            C25113c cVar = MVPurchaseCartItem.f28776b;
            gVar.mo61687K();
            if (mVPurchaseCartItem.f28786id != null) {
                gVar.mo61711x(MVPurchaseCartItem.f28776b);
                gVar.mo61686J(mVPurchaseCartItem.f28786id);
                gVar.mo61712y();
            }
            if (mVPurchaseCartItem.name != null) {
                gVar.mo61711x(MVPurchaseCartItem.f28777c);
                gVar.mo61686J(mVPurchaseCartItem.name);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPurchaseCartItem.f28778d);
            gVar.mo61678B(mVPurchaseCartItem.quantity);
            gVar.mo61712y();
            if (mVPurchaseCartItem.message != null && mVPurchaseCartItem.mo32504j()) {
                gVar.mo61711x(MVPurchaseCartItem.f28779e);
                gVar.mo61686J(mVPurchaseCartItem.message);
                gVar.mo61712y();
            }
            if (mVPurchaseCartItem.price != null) {
                gVar.mo61711x(MVPurchaseCartItem.f28780f);
                mVPurchaseCartItem.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPurchaseCartItem.fullPrice != null && mVPurchaseCartItem.mo32499f()) {
                gVar.mo61711x(MVPurchaseCartItem.f28781g);
                mVPurchaseCartItem.fullPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPurchaseCartItem.f28782h);
            gVar.mo61708u(mVPurchaseCartItem.isRemovable);
            gVar.mo61712y();
            if (mVPurchaseCartItem.infoBoxData != null && mVPurchaseCartItem.mo32501h()) {
                gVar.mo61711x(MVPurchaseCartItem.f28783i);
                mVPurchaseCartItem.infoBoxData.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartItem mVPurchaseCartItem = (MVPurchaseCartItem) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseCartItem.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseCartItem.f28786id = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseCartItem.name = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseCartItem.quantity = gVar.mo61696i();
                            mVPurchaseCartItem.mo32509p();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseCartItem.message = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVPurchaseCartItem.price = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVPurchaseCartItem.fullPrice = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseCartItem.isRemovable = gVar.mo61690c();
                            mVPurchaseCartItem.mo32508o();
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVInfoBoxData mVInfoBoxData = new MVInfoBoxData();
                            mVPurchaseCartItem.infoBoxData = mVInfoBoxData;
                            mVInfoBoxData.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartItem$b */
    public static class C10857b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10856a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartItem$c */
    public static class C10858c extends C25240d<MVPurchaseCartItem> {
        public C10858c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartItem mVPurchaseCartItem = (MVPurchaseCartItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseCartItem.mo32500g()) {
                bitSet.set(0);
            }
            if (mVPurchaseCartItem.mo32505k()) {
                bitSet.set(1);
            }
            if (mVPurchaseCartItem.mo32507m()) {
                bitSet.set(2);
            }
            if (mVPurchaseCartItem.mo32504j()) {
                bitSet.set(3);
            }
            if (mVPurchaseCartItem.mo32506l()) {
                bitSet.set(4);
            }
            if (mVPurchaseCartItem.mo32499f()) {
                bitSet.set(5);
            }
            if (mVPurchaseCartItem.mo32503i()) {
                bitSet.set(6);
            }
            if (mVPurchaseCartItem.mo32501h()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVPurchaseCartItem.mo32500g()) {
                jVar.mo61686J(mVPurchaseCartItem.f28786id);
            }
            if (mVPurchaseCartItem.mo32505k()) {
                jVar.mo61686J(mVPurchaseCartItem.name);
            }
            if (mVPurchaseCartItem.mo32507m()) {
                jVar.mo61678B(mVPurchaseCartItem.quantity);
            }
            if (mVPurchaseCartItem.mo32504j()) {
                jVar.mo61686J(mVPurchaseCartItem.message);
            }
            if (mVPurchaseCartItem.mo32506l()) {
                mVPurchaseCartItem.price.mo25202X0(jVar);
            }
            if (mVPurchaseCartItem.mo32499f()) {
                mVPurchaseCartItem.fullPrice.mo25202X0(jVar);
            }
            if (mVPurchaseCartItem.mo32503i()) {
                jVar.mo61708u(mVPurchaseCartItem.isRemovable);
            }
            if (mVPurchaseCartItem.mo32501h()) {
                mVPurchaseCartItem.infoBoxData.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseCartItem mVPurchaseCartItem = (MVPurchaseCartItem) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVPurchaseCartItem.f28786id = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPurchaseCartItem.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPurchaseCartItem.quantity = jVar.mo61696i();
                mVPurchaseCartItem.mo32509p();
            }
            if (T.get(3)) {
                mVPurchaseCartItem.message = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVPurchaseCartItem.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVPurchaseCartItem.fullPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVPurchaseCartItem.isRemovable = jVar.mo61690c();
                mVPurchaseCartItem.mo32508o();
            }
            if (T.get(7)) {
                MVInfoBoxData mVInfoBoxData = new MVInfoBoxData();
                mVPurchaseCartItem.infoBoxData = mVInfoBoxData;
                mVInfoBoxData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartItem$d */
    public static class C10859d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10858c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseCartItem");
        HashMap hashMap = new HashMap();
        f28784j = hashMap;
        hashMap.put(C25239c.class, new C10857b());
        hashMap.put(C25240d.class, new C10859d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.QUANTITY, new FieldMetaData("quantity", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MESSAGE, new FieldMetaData(InAppMessageBase.MESSAGE, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.FULL_PRICE, new FieldMetaData("fullPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.IS_REMOVABLE, new FieldMetaData("isRemovable", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INFO_BOX_DATA, new FieldMetaData("infoBoxData", (byte) 2, new StructMetaData(MVInfoBoxData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28785k = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseCartItem.class, unmodifiableMap);
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
        ((C25238b) f28784j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28784j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseCartItem mVPurchaseCartItem = (MVPurchaseCartItem) obj;
        if (!getClass().equals(mVPurchaseCartItem.getClass())) {
            return getClass().getName().compareTo(mVPurchaseCartItem.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32500g()).compareTo(Boolean.valueOf(mVPurchaseCartItem.mo32500g()));
        if (compareTo2 != 0 || ((mo32500g() && (compareTo2 = this.f28786id.compareTo(mVPurchaseCartItem.f28786id)) != 0) || (compareTo2 = Boolean.valueOf(mo32505k()).compareTo(Boolean.valueOf(mVPurchaseCartItem.mo32505k()))) != 0 || ((mo32505k() && (compareTo2 = this.name.compareTo(mVPurchaseCartItem.name)) != 0) || (compareTo2 = Boolean.valueOf(mo32507m()).compareTo(Boolean.valueOf(mVPurchaseCartItem.mo32507m()))) != 0 || ((mo32507m() && (compareTo2 = C25082a.m62839c(this.quantity, mVPurchaseCartItem.quantity)) != 0) || (compareTo2 = Boolean.valueOf(mo32504j()).compareTo(Boolean.valueOf(mVPurchaseCartItem.mo32504j()))) != 0 || ((mo32504j() && (compareTo2 = this.message.compareTo(mVPurchaseCartItem.message)) != 0) || (compareTo2 = Boolean.valueOf(mo32506l()).compareTo(Boolean.valueOf(mVPurchaseCartItem.mo32506l()))) != 0 || ((mo32506l() && (compareTo2 = this.price.compareTo(mVPurchaseCartItem.price)) != 0) || (compareTo2 = Boolean.valueOf(mo32499f()).compareTo(Boolean.valueOf(mVPurchaseCartItem.mo32499f()))) != 0 || ((mo32499f() && (compareTo2 = this.fullPrice.compareTo(mVPurchaseCartItem.fullPrice)) != 0) || (compareTo2 = Boolean.valueOf(mo32503i()).compareTo(Boolean.valueOf(mVPurchaseCartItem.mo32503i()))) != 0 || ((mo32503i() && (compareTo2 = C25082a.m62848l(this.isRemovable, mVPurchaseCartItem.isRemovable)) != 0) || (compareTo2 = Boolean.valueOf(mo32501h()).compareTo(Boolean.valueOf(mVPurchaseCartItem.mo32501h()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo32501h() || (compareTo = this.infoBoxData.compareTo(mVPurchaseCartItem.infoBoxData)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseCartItem)) {
            return false;
        }
        MVPurchaseCartItem mVPurchaseCartItem = (MVPurchaseCartItem) obj;
        boolean g = mo32500g();
        boolean g2 = mVPurchaseCartItem.mo32500g();
        if ((g || g2) && (!g || !g2 || !this.f28786id.equals(mVPurchaseCartItem.f28786id))) {
            return false;
        }
        boolean k = mo32505k();
        boolean k2 = mVPurchaseCartItem.mo32505k();
        if (((k || k2) && (!k || !k2 || !this.name.equals(mVPurchaseCartItem.name))) || this.quantity != mVPurchaseCartItem.quantity) {
            return false;
        }
        boolean j = mo32504j();
        boolean j2 = mVPurchaseCartItem.mo32504j();
        if ((j || j2) && (!j || !j2 || !this.message.equals(mVPurchaseCartItem.message))) {
            return false;
        }
        boolean l = mo32506l();
        boolean l2 = mVPurchaseCartItem.mo32506l();
        if ((l || l2) && (!l || !l2 || !this.price.mo26102a(mVPurchaseCartItem.price))) {
            return false;
        }
        boolean f = mo32499f();
        boolean f2 = mVPurchaseCartItem.mo32499f();
        if (((f || f2) && (!f || !f2 || !this.fullPrice.mo26102a(mVPurchaseCartItem.fullPrice))) || this.isRemovable != mVPurchaseCartItem.isRemovable) {
            return false;
        }
        boolean h = mo32501h();
        boolean h2 = mVPurchaseCartItem.mo32501h();
        if ((h || h2) && (!h || !h2 || !this.infoBoxData.mo26280a(mVPurchaseCartItem.infoBoxData))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32499f() {
        return this.fullPrice != null;
    }

    /* renamed from: g */
    public final boolean mo32500g() {
        return this.f28786id != null;
    }

    /* renamed from: h */
    public final boolean mo32501h() {
        return this.infoBoxData != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32503i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo32504j() {
        return this.message != null;
    }

    /* renamed from: k */
    public final boolean mo32505k() {
        return this.name != null;
    }

    /* renamed from: l */
    public final boolean mo32506l() {
        return this.price != null;
    }

    /* renamed from: m */
    public final boolean mo32507m() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: o */
    public final void mo32508o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo32509p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseCartItem(", "id:");
        String str = this.f28786id;
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
        n.append("quantity:");
        n.append(this.quantity);
        if (mo32504j()) {
            n.append(", ");
            n.append("message:");
            String str3 = this.message;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo32499f()) {
            n.append(", ");
            n.append("fullPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.fullPrice;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        n.append(", ");
        n.append("isRemovable:");
        n.append(this.isRemovable);
        if (mo32501h()) {
            n.append(", ");
            n.append("infoBoxData:");
            MVInfoBoxData mVInfoBoxData = this.infoBoxData;
            if (mVInfoBoxData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVInfoBoxData);
            }
        }
        n.append(")");
        return n.toString();
    }
}
