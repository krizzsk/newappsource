package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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

public class MVTodRideUpdateOffer implements TBase<MVTodRideUpdateOffer, _Fields>, Serializable, Cloneable, Comparable<MVTodRideUpdateOffer> {

    /* renamed from: b */
    public static final C25113c f29593b = new C25113c("offerId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29594c = new C25113c("newDropoff", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29595d = new C25113c("newDestination", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f29596e = new C25113c("newEta", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f29597f = new C25113c("previousEta", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f29598g = new C25113c("newPrice", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f29599h = new C25113c("previousPrice", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f29600i = new C25113c("expirationTime", (byte) 10, 8);

    /* renamed from: j */
    public static final HashMap f29601j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f29602k;
    private byte __isset_bitfield = 0;
    public long expirationTime;
    public MVLocationDescriptor newDestination;
    public MVLocationDescriptor newDropoff;
    public long newEta;
    public MVCurrencyAmount newPrice;
    public String offerId;
    private _Fields[] optionals = {_Fields.NEW_PRICE, _Fields.PREVIOUS_PRICE};
    public long previousEta;
    public MVCurrencyAmount previousPrice;

    public enum _Fields implements C25085c {
        OFFER_ID(1, "offerId"),
        NEW_DROPOFF(2, "newDropoff"),
        NEW_DESTINATION(3, "newDestination"),
        NEW_ETA(4, "newEta"),
        PREVIOUS_ETA(5, "previousEta"),
        NEW_PRICE(6, "newPrice"),
        PREVIOUS_PRICE(7, "previousPrice"),
        EXPIRATION_TIME(8, "expirationTime");
        
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
                    return OFFER_ID;
                case 2:
                    return NEW_DROPOFF;
                case 3:
                    return NEW_DESTINATION;
                case 4:
                    return NEW_ETA;
                case 5:
                    return PREVIOUS_ETA;
                case 6:
                    return NEW_PRICE;
                case 7:
                    return PREVIOUS_PRICE;
                case 8:
                    return EXPIRATION_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideUpdateOffer$a */
    public static class C11332a extends C25239c<MVTodRideUpdateOffer> {
        public C11332a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideUpdateOffer mVTodRideUpdateOffer = (MVTodRideUpdateOffer) tBase;
            mVTodRideUpdateOffer.mo33769r();
            C25113c cVar = MVTodRideUpdateOffer.f29593b;
            gVar.mo61687K();
            if (mVTodRideUpdateOffer.offerId != null) {
                gVar.mo61711x(MVTodRideUpdateOffer.f29593b);
                gVar.mo61686J(mVTodRideUpdateOffer.offerId);
                gVar.mo61712y();
            }
            if (mVTodRideUpdateOffer.newDropoff != null) {
                gVar.mo61711x(MVTodRideUpdateOffer.f29594c);
                mVTodRideUpdateOffer.newDropoff.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideUpdateOffer.newDestination != null) {
                gVar.mo61711x(MVTodRideUpdateOffer.f29595d);
                mVTodRideUpdateOffer.newDestination.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodRideUpdateOffer.f29596e);
            gVar.mo61679C(mVTodRideUpdateOffer.newEta);
            gVar.mo61712y();
            gVar.mo61711x(MVTodRideUpdateOffer.f29597f);
            gVar.mo61679C(mVTodRideUpdateOffer.previousEta);
            gVar.mo61712y();
            if (mVTodRideUpdateOffer.newPrice != null && mVTodRideUpdateOffer.mo33762j()) {
                gVar.mo61711x(MVTodRideUpdateOffer.f29598g);
                mVTodRideUpdateOffer.newPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodRideUpdateOffer.previousPrice != null && mVTodRideUpdateOffer.mo33765m()) {
                gVar.mo61711x(MVTodRideUpdateOffer.f29599h);
                mVTodRideUpdateOffer.previousPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVTodRideUpdateOffer.f29600i);
            C25541a.m63891v(gVar, mVTodRideUpdateOffer.expirationTime);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideUpdateOffer mVTodRideUpdateOffer = (MVTodRideUpdateOffer) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTodRideUpdateOffer.mo33769r();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideUpdateOffer.offerId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                            mVTodRideUpdateOffer.newDropoff = mVLocationDescriptor;
                            mVLocationDescriptor.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                            mVTodRideUpdateOffer.newDestination = mVLocationDescriptor2;
                            mVLocationDescriptor2.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideUpdateOffer.newEta = gVar.mo61697j();
                            mVTodRideUpdateOffer.mo33767p();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideUpdateOffer.previousEta = gVar.mo61697j();
                            mVTodRideUpdateOffer.mo33768q();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVTodRideUpdateOffer.newPrice = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVTodRideUpdateOffer.previousPrice = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTodRideUpdateOffer.expirationTime = gVar.mo61697j();
                            mVTodRideUpdateOffer.mo33766o();
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideUpdateOffer$b */
    public static class C11333b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11332a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideUpdateOffer$c */
    public static class C11334c extends C25240d<MVTodRideUpdateOffer> {
        public C11334c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodRideUpdateOffer mVTodRideUpdateOffer = (MVTodRideUpdateOffer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodRideUpdateOffer.mo33763k()) {
                bitSet.set(0);
            }
            if (mVTodRideUpdateOffer.mo33759h()) {
                bitSet.set(1);
            }
            if (mVTodRideUpdateOffer.mo33758g()) {
                bitSet.set(2);
            }
            if (mVTodRideUpdateOffer.mo33761i()) {
                bitSet.set(3);
            }
            if (mVTodRideUpdateOffer.mo33764l()) {
                bitSet.set(4);
            }
            if (mVTodRideUpdateOffer.mo33762j()) {
                bitSet.set(5);
            }
            if (mVTodRideUpdateOffer.mo33765m()) {
                bitSet.set(6);
            }
            if (mVTodRideUpdateOffer.mo33757f()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVTodRideUpdateOffer.mo33763k()) {
                jVar.mo61686J(mVTodRideUpdateOffer.offerId);
            }
            if (mVTodRideUpdateOffer.mo33759h()) {
                mVTodRideUpdateOffer.newDropoff.mo25202X0(jVar);
            }
            if (mVTodRideUpdateOffer.mo33758g()) {
                mVTodRideUpdateOffer.newDestination.mo25202X0(jVar);
            }
            if (mVTodRideUpdateOffer.mo33761i()) {
                jVar.mo61679C(mVTodRideUpdateOffer.newEta);
            }
            if (mVTodRideUpdateOffer.mo33764l()) {
                jVar.mo61679C(mVTodRideUpdateOffer.previousEta);
            }
            if (mVTodRideUpdateOffer.mo33762j()) {
                mVTodRideUpdateOffer.newPrice.mo25202X0(jVar);
            }
            if (mVTodRideUpdateOffer.mo33765m()) {
                mVTodRideUpdateOffer.previousPrice.mo25202X0(jVar);
            }
            if (mVTodRideUpdateOffer.mo33757f()) {
                jVar.mo61679C(mVTodRideUpdateOffer.expirationTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodRideUpdateOffer mVTodRideUpdateOffer = (MVTodRideUpdateOffer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVTodRideUpdateOffer.offerId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVTodRideUpdateOffer.newDropoff = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                mVTodRideUpdateOffer.newDestination = mVLocationDescriptor2;
                mVLocationDescriptor2.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVTodRideUpdateOffer.newEta = jVar.mo61697j();
                mVTodRideUpdateOffer.mo33767p();
            }
            if (T.get(4)) {
                mVTodRideUpdateOffer.previousEta = jVar.mo61697j();
                mVTodRideUpdateOffer.mo33768q();
            }
            if (T.get(5)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVTodRideUpdateOffer.newPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVTodRideUpdateOffer.previousPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVTodRideUpdateOffer.expirationTime = jVar.mo61697j();
                mVTodRideUpdateOffer.mo33766o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodRideUpdateOffer$d */
    public static class C11335d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11334c(0);
        }
    }

    static {
        new C17394d0("MVTodRideUpdateOffer");
        HashMap hashMap = new HashMap();
        f29601j = hashMap;
        hashMap.put(C25239c.class, new C11333b());
        hashMap.put(C25240d.class, new C11335d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OFFER_ID, new FieldMetaData("offerId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NEW_DROPOFF, new FieldMetaData("newDropoff", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.NEW_DESTINATION, new FieldMetaData("newDestination", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.NEW_ETA, new FieldMetaData("newEta", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.PREVIOUS_ETA, new FieldMetaData("previousEta", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.NEW_PRICE, new FieldMetaData("newPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.PREVIOUS_PRICE, new FieldMetaData("previousPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.EXPIRATION_TIME, new FieldMetaData("expirationTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29602k = unmodifiableMap;
        FieldMetaData.m61947a(MVTodRideUpdateOffer.class, unmodifiableMap);
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
        ((C25238b) f29601j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29601j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo33754a(MVTodRideUpdateOffer mVTodRideUpdateOffer) {
        if (mVTodRideUpdateOffer == null) {
            return false;
        }
        boolean k = mo33763k();
        boolean k2 = mVTodRideUpdateOffer.mo33763k();
        if ((k || k2) && (!k || !k2 || !this.offerId.equals(mVTodRideUpdateOffer.offerId))) {
            return false;
        }
        boolean h = mo33759h();
        boolean h2 = mVTodRideUpdateOffer.mo33759h();
        if ((h || h2) && (!h || !h2 || !this.newDropoff.mo26317a(mVTodRideUpdateOffer.newDropoff))) {
            return false;
        }
        boolean g = mo33758g();
        boolean g2 = mVTodRideUpdateOffer.mo33758g();
        if (((g || g2) && (!g || !g2 || !this.newDestination.mo26317a(mVTodRideUpdateOffer.newDestination))) || this.newEta != mVTodRideUpdateOffer.newEta || this.previousEta != mVTodRideUpdateOffer.previousEta) {
            return false;
        }
        boolean j = mo33762j();
        boolean j2 = mVTodRideUpdateOffer.mo33762j();
        if ((j || j2) && (!j || !j2 || !this.newPrice.mo26102a(mVTodRideUpdateOffer.newPrice))) {
            return false;
        }
        boolean m = mo33765m();
        boolean m2 = mVTodRideUpdateOffer.mo33765m();
        if (((m || m2) && (!m || !m2 || !this.previousPrice.mo26102a(mVTodRideUpdateOffer.previousPrice))) || this.expirationTime != mVTodRideUpdateOffer.expirationTime) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int d;
        MVTodRideUpdateOffer mVTodRideUpdateOffer = (MVTodRideUpdateOffer) obj;
        if (!getClass().equals(mVTodRideUpdateOffer.getClass())) {
            return getClass().getName().compareTo(mVTodRideUpdateOffer.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33763k()).compareTo(Boolean.valueOf(mVTodRideUpdateOffer.mo33763k()));
        if (compareTo != 0 || ((mo33763k() && (compareTo = this.offerId.compareTo(mVTodRideUpdateOffer.offerId)) != 0) || (compareTo = Boolean.valueOf(mo33759h()).compareTo(Boolean.valueOf(mVTodRideUpdateOffer.mo33759h()))) != 0 || ((mo33759h() && (compareTo = this.newDropoff.compareTo(mVTodRideUpdateOffer.newDropoff)) != 0) || (compareTo = Boolean.valueOf(mo33758g()).compareTo(Boolean.valueOf(mVTodRideUpdateOffer.mo33758g()))) != 0 || ((mo33758g() && (compareTo = this.newDestination.compareTo(mVTodRideUpdateOffer.newDestination)) != 0) || (compareTo = Boolean.valueOf(mo33761i()).compareTo(Boolean.valueOf(mVTodRideUpdateOffer.mo33761i()))) != 0 || ((mo33761i() && (compareTo = C25082a.m62840d(this.newEta, mVTodRideUpdateOffer.newEta)) != 0) || (compareTo = Boolean.valueOf(mo33764l()).compareTo(Boolean.valueOf(mVTodRideUpdateOffer.mo33764l()))) != 0 || ((mo33764l() && (compareTo = C25082a.m62840d(this.previousEta, mVTodRideUpdateOffer.previousEta)) != 0) || (compareTo = Boolean.valueOf(mo33762j()).compareTo(Boolean.valueOf(mVTodRideUpdateOffer.mo33762j()))) != 0 || ((mo33762j() && (compareTo = this.newPrice.compareTo(mVTodRideUpdateOffer.newPrice)) != 0) || (compareTo = Boolean.valueOf(mo33765m()).compareTo(Boolean.valueOf(mVTodRideUpdateOffer.mo33765m()))) != 0 || ((mo33765m() && (compareTo = this.previousPrice.compareTo(mVTodRideUpdateOffer.previousPrice)) != 0) || (compareTo = Boolean.valueOf(mo33757f()).compareTo(Boolean.valueOf(mVTodRideUpdateOffer.mo33757f()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo33757f() || (d = C25082a.m62840d(this.expirationTime, mVTodRideUpdateOffer.expirationTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTodRideUpdateOffer)) {
            return mo33754a((MVTodRideUpdateOffer) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo33757f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo33758g() {
        return this.newDestination != null;
    }

    /* renamed from: h */
    public final boolean mo33759h() {
        return this.newDropoff != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33761i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo33762j() {
        return this.newPrice != null;
    }

    /* renamed from: k */
    public final boolean mo33763k() {
        return this.offerId != null;
    }

    /* renamed from: l */
    public final boolean mo33764l() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: m */
    public final boolean mo33765m() {
        return this.previousPrice != null;
    }

    /* renamed from: o */
    public final void mo33766o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: p */
    public final void mo33767p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo33768q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: r */
    public final void mo33769r() throws TException {
        MVLocationDescriptor mVLocationDescriptor = this.newDropoff;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor2 = this.newDestination;
        if (mVLocationDescriptor2 != null) {
            mVLocationDescriptor2.mo26333s();
        }
        MVCurrencyAmount mVCurrencyAmount = this.newPrice;
        if (mVCurrencyAmount != null) {
            mVCurrencyAmount.getClass();
        }
        MVCurrencyAmount mVCurrencyAmount2 = this.previousPrice;
        if (mVCurrencyAmount2 != null) {
            mVCurrencyAmount2.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodRideUpdateOffer(", "offerId:");
        String str = this.offerId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("newDropoff:");
        MVLocationDescriptor mVLocationDescriptor = this.newDropoff;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        n.append(", ");
        n.append("newDestination:");
        MVLocationDescriptor mVLocationDescriptor2 = this.newDestination;
        if (mVLocationDescriptor2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor2);
        }
        n.append(", ");
        n.append("newEta:");
        C25541a.m63889t(n, this.newEta, ", ", "previousEta:");
        n.append(this.previousEta);
        if (mo33762j()) {
            n.append(", ");
            n.append("newPrice:");
            MVCurrencyAmount mVCurrencyAmount = this.newPrice;
            if (mVCurrencyAmount == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount);
            }
        }
        if (mo33765m()) {
            n.append(", ");
            n.append("previousPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.previousPrice;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        n.append(", ");
        n.append("expirationTime:");
        return C25541a.m63884o(n, this.expirationTime, ")");
    }
}
