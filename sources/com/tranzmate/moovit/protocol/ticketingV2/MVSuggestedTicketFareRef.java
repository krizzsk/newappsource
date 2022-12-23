package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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

public class MVSuggestedTicketFareRef implements TBase<MVSuggestedTicketFareRef, _Fields>, Serializable, Cloneable, Comparable<MVSuggestedTicketFareRef> {

    /* renamed from: b */
    public static final C25113c f29112b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f29113c = new C25113c("fareId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f29114d = new C25113c("name", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29115e = new C25113c("agencyId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f29116f = new C25113c(InAppPurchaseMetaData.KEY_PRICE, (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f29117g = new C25113c("appliedFilters", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f29118h = new C25113c("agencyKey", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f29119i = new C25113c("data", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f29120j = new C25113c("metroId", (byte) 8, 9);

    /* renamed from: k */
    public static final C25113c f29121k = new C25113c("agencyName", (byte) 11, 10);

    /* renamed from: l */
    public static final HashMap f29122l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f29123m;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public String agencyKey;
    public String agencyName;
    public List<MVFilter> appliedFilters;
    public MVProviderSpecificData data;
    public String fareId;
    public int metroId;
    public String name;
    private _Fields[] optionals = {_Fields.AGENCY_ID, _Fields.APPLIED_FILTERS, _Fields.DATA};
    public MVCurrencyAmount price;
    public int providerId;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        FARE_ID(2, "fareId"),
        NAME(3, "name"),
        AGENCY_ID(4, "agencyId"),
        PRICE(5, InAppPurchaseMetaData.KEY_PRICE),
        APPLIED_FILTERS(6, "appliedFilters"),
        AGENCY_KEY(7, "agencyKey"),
        DATA(8, "data"),
        METRO_ID(9, "metroId"),
        AGENCY_NAME(10, "agencyName");
        
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
                    return PROVIDER_ID;
                case 2:
                    return FARE_ID;
                case 3:
                    return NAME;
                case 4:
                    return AGENCY_ID;
                case 5:
                    return PRICE;
                case 6:
                    return APPLIED_FILTERS;
                case 7:
                    return AGENCY_KEY;
                case 8:
                    return DATA;
                case 9:
                    return METRO_ID;
                case 10:
                    return AGENCY_NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareRef$a */
    public static class C11042a extends C25239c<MVSuggestedTicketFareRef> {
        public C11042a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareRef mVSuggestedTicketFareRef = (MVSuggestedTicketFareRef) tBase;
            MVCurrencyAmount mVCurrencyAmount = mVSuggestedTicketFareRef.price;
            C25113c cVar = MVSuggestedTicketFareRef.f29112b;
            gVar.mo61687K();
            gVar.mo61711x(MVSuggestedTicketFareRef.f29112b);
            gVar.mo61678B(mVSuggestedTicketFareRef.providerId);
            gVar.mo61712y();
            if (mVSuggestedTicketFareRef.fareId != null) {
                gVar.mo61711x(MVSuggestedTicketFareRef.f29113c);
                gVar.mo61686J(mVSuggestedTicketFareRef.fareId);
                gVar.mo61712y();
            }
            if (mVSuggestedTicketFareRef.name != null) {
                gVar.mo61711x(MVSuggestedTicketFareRef.f29114d);
                gVar.mo61686J(mVSuggestedTicketFareRef.name);
                gVar.mo61712y();
            }
            if (mVSuggestedTicketFareRef.mo32972f()) {
                gVar.mo61711x(MVSuggestedTicketFareRef.f29115e);
                gVar.mo61678B(mVSuggestedTicketFareRef.agencyId);
                gVar.mo61712y();
            }
            if (mVSuggestedTicketFareRef.price != null) {
                gVar.mo61711x(MVSuggestedTicketFareRef.f29116f);
                mVSuggestedTicketFareRef.price.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVSuggestedTicketFareRef.appliedFilters != null && mVSuggestedTicketFareRef.mo32976i()) {
                gVar.mo61711x(MVSuggestedTicketFareRef.f29117g);
                gVar.mo61680D(new C25119e((byte) 12, mVSuggestedTicketFareRef.appliedFilters.size()));
                for (MVFilter X0 : mVSuggestedTicketFareRef.appliedFilters) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVSuggestedTicketFareRef.agencyKey != null) {
                gVar.mo61711x(MVSuggestedTicketFareRef.f29118h);
                gVar.mo61686J(mVSuggestedTicketFareRef.agencyKey);
                gVar.mo61712y();
            }
            if (mVSuggestedTicketFareRef.data != null && mVSuggestedTicketFareRef.mo32977j()) {
                gVar.mo61711x(MVSuggestedTicketFareRef.f29119i);
                mVSuggestedTicketFareRef.data.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVSuggestedTicketFareRef.f29120j);
            gVar.mo61678B(mVSuggestedTicketFareRef.metroId);
            gVar.mo61712y();
            if (mVSuggestedTicketFareRef.agencyName != null) {
                gVar.mo61711x(MVSuggestedTicketFareRef.f29121k);
                gVar.mo61686J(mVSuggestedTicketFareRef.agencyName);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareRef mVSuggestedTicketFareRef = (MVSuggestedTicketFareRef) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVCurrencyAmount mVCurrencyAmount = mVSuggestedTicketFareRef.price;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSuggestedTicketFareRef.providerId = gVar.mo61696i();
                            mVSuggestedTicketFareRef.mo32985s();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSuggestedTicketFareRef.fareId = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSuggestedTicketFareRef.name = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSuggestedTicketFareRef.agencyId = gVar.mo61696i();
                            mVSuggestedTicketFareRef.mo32983q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVSuggestedTicketFareRef.price = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVSuggestedTicketFareRef.appliedFilters = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVFilter mVFilter = new MVFilter();
                                mVFilter.mo25201C1(gVar);
                                mVSuggestedTicketFareRef.appliedFilters.add(mVFilter);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSuggestedTicketFareRef.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVProviderSpecificData mVProviderSpecificData = new MVProviderSpecificData();
                            mVSuggestedTicketFareRef.data = mVProviderSpecificData;
                            mVProviderSpecificData.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSuggestedTicketFareRef.metroId = gVar.mo61696i();
                            mVSuggestedTicketFareRef.mo32984r();
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVSuggestedTicketFareRef.agencyName = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareRef$b */
    public static class C11043b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11042a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareRef$c */
    public static class C11044c extends C25240d<MVSuggestedTicketFareRef> {
        public C11044c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareRef mVSuggestedTicketFareRef = (MVSuggestedTicketFareRef) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSuggestedTicketFareRef.mo32982p()) {
                bitSet.set(0);
            }
            if (mVSuggestedTicketFareRef.mo32978k()) {
                bitSet.set(1);
            }
            if (mVSuggestedTicketFareRef.mo32980m()) {
                bitSet.set(2);
            }
            if (mVSuggestedTicketFareRef.mo32972f()) {
                bitSet.set(3);
            }
            if (mVSuggestedTicketFareRef.mo32981o()) {
                bitSet.set(4);
            }
            if (mVSuggestedTicketFareRef.mo32976i()) {
                bitSet.set(5);
            }
            if (mVSuggestedTicketFareRef.mo32973g()) {
                bitSet.set(6);
            }
            if (mVSuggestedTicketFareRef.mo32977j()) {
                bitSet.set(7);
            }
            if (mVSuggestedTicketFareRef.mo32979l()) {
                bitSet.set(8);
            }
            if (mVSuggestedTicketFareRef.mo32974h()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVSuggestedTicketFareRef.mo32982p()) {
                jVar.mo61678B(mVSuggestedTicketFareRef.providerId);
            }
            if (mVSuggestedTicketFareRef.mo32978k()) {
                jVar.mo61686J(mVSuggestedTicketFareRef.fareId);
            }
            if (mVSuggestedTicketFareRef.mo32980m()) {
                jVar.mo61686J(mVSuggestedTicketFareRef.name);
            }
            if (mVSuggestedTicketFareRef.mo32972f()) {
                jVar.mo61678B(mVSuggestedTicketFareRef.agencyId);
            }
            if (mVSuggestedTicketFareRef.mo32981o()) {
                mVSuggestedTicketFareRef.price.mo25202X0(jVar);
            }
            if (mVSuggestedTicketFareRef.mo32976i()) {
                jVar.mo61678B(mVSuggestedTicketFareRef.appliedFilters.size());
                for (MVFilter X0 : mVSuggestedTicketFareRef.appliedFilters) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVSuggestedTicketFareRef.mo32973g()) {
                jVar.mo61686J(mVSuggestedTicketFareRef.agencyKey);
            }
            if (mVSuggestedTicketFareRef.mo32977j()) {
                mVSuggestedTicketFareRef.data.mo25202X0(jVar);
            }
            if (mVSuggestedTicketFareRef.mo32979l()) {
                jVar.mo61678B(mVSuggestedTicketFareRef.metroId);
            }
            if (mVSuggestedTicketFareRef.mo32974h()) {
                jVar.mo61686J(mVSuggestedTicketFareRef.agencyName);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSuggestedTicketFareRef mVSuggestedTicketFareRef = (MVSuggestedTicketFareRef) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                mVSuggestedTicketFareRef.providerId = jVar.mo61696i();
                mVSuggestedTicketFareRef.mo32985s();
            }
            if (T.get(1)) {
                mVSuggestedTicketFareRef.fareId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVSuggestedTicketFareRef.name = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVSuggestedTicketFareRef.agencyId = jVar.mo61696i();
                mVSuggestedTicketFareRef.mo32983q();
            }
            if (T.get(4)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVSuggestedTicketFareRef.price = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVSuggestedTicketFareRef.appliedFilters = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVFilter mVFilter = new MVFilter();
                    mVFilter.mo25201C1(jVar);
                    mVSuggestedTicketFareRef.appliedFilters.add(mVFilter);
                }
            }
            if (T.get(6)) {
                mVSuggestedTicketFareRef.agencyKey = jVar.mo61704q();
            }
            if (T.get(7)) {
                MVProviderSpecificData mVProviderSpecificData = new MVProviderSpecificData();
                mVSuggestedTicketFareRef.data = mVProviderSpecificData;
                mVProviderSpecificData.mo25201C1(jVar);
            }
            if (T.get(8)) {
                mVSuggestedTicketFareRef.metroId = jVar.mo61696i();
                mVSuggestedTicketFareRef.mo32984r();
            }
            if (T.get(9)) {
                mVSuggestedTicketFareRef.agencyName = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareRef$d */
    public static class C11045d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11044c(0);
        }
    }

    static {
        new C17394d0("MVSuggestedTicketFareRef");
        HashMap hashMap = new HashMap();
        f29122l = hashMap;
        hashMap.put(C25239c.class, new C11043b());
        hashMap.put(C25240d.class, new C11045d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FARE_ID, new FieldMetaData("fareId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PRICE, new FieldMetaData(InAppPurchaseMetaData.KEY_PRICE, (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.APPLIED_FILTERS, new FieldMetaData("appliedFilters", (byte) 2, new ListMetaData(new StructMetaData(MVFilter.class))));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 2, new StructMetaData(MVProviderSpecificData.class)));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_NAME, new FieldMetaData("agencyName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29123m = unmodifiableMap;
        FieldMetaData.m61947a(MVSuggestedTicketFareRef.class, unmodifiableMap);
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
        ((C25238b) f29122l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29122l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSuggestedTicketFareRef mVSuggestedTicketFareRef = (MVSuggestedTicketFareRef) obj;
        if (!getClass().equals(mVSuggestedTicketFareRef.getClass())) {
            return getClass().getName().compareTo(mVSuggestedTicketFareRef.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32982p()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32982p()));
        if (compareTo2 != 0 || ((mo32982p() && (compareTo2 = C25082a.m62839c(this.providerId, mVSuggestedTicketFareRef.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32978k()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32978k()))) != 0 || ((mo32978k() && (compareTo2 = this.fareId.compareTo(mVSuggestedTicketFareRef.fareId)) != 0) || (compareTo2 = Boolean.valueOf(mo32980m()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32980m()))) != 0 || ((mo32980m() && (compareTo2 = this.name.compareTo(mVSuggestedTicketFareRef.name)) != 0) || (compareTo2 = Boolean.valueOf(mo32972f()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32972f()))) != 0 || ((mo32972f() && (compareTo2 = C25082a.m62839c(this.agencyId, mVSuggestedTicketFareRef.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo32981o()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32981o()))) != 0 || ((mo32981o() && (compareTo2 = this.price.compareTo(mVSuggestedTicketFareRef.price)) != 0) || (compareTo2 = Boolean.valueOf(mo32976i()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32976i()))) != 0 || ((mo32976i() && (compareTo2 = C25082a.m62844h(this.appliedFilters, mVSuggestedTicketFareRef.appliedFilters)) != 0) || (compareTo2 = Boolean.valueOf(mo32973g()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32973g()))) != 0 || ((mo32973g() && (compareTo2 = this.agencyKey.compareTo(mVSuggestedTicketFareRef.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32977j()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32977j()))) != 0 || ((mo32977j() && (compareTo2 = this.data.compareTo(mVSuggestedTicketFareRef.data)) != 0) || (compareTo2 = Boolean.valueOf(mo32979l()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32979l()))) != 0 || ((mo32979l() && (compareTo2 = C25082a.m62839c(this.metroId, mVSuggestedTicketFareRef.metroId)) != 0) || (compareTo2 = Boolean.valueOf(mo32974h()).compareTo(Boolean.valueOf(mVSuggestedTicketFareRef.mo32974h()))) != 0)))))))))) {
            return compareTo2;
        }
        if (!mo32974h() || (compareTo = this.agencyName.compareTo(mVSuggestedTicketFareRef.agencyName)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSuggestedTicketFareRef)) {
            return false;
        }
        MVSuggestedTicketFareRef mVSuggestedTicketFareRef = (MVSuggestedTicketFareRef) obj;
        if (this.providerId != mVSuggestedTicketFareRef.providerId) {
            return false;
        }
        boolean k = mo32978k();
        boolean k2 = mVSuggestedTicketFareRef.mo32978k();
        if ((k || k2) && (!k || !k2 || !this.fareId.equals(mVSuggestedTicketFareRef.fareId))) {
            return false;
        }
        boolean m = mo32980m();
        boolean m2 = mVSuggestedTicketFareRef.mo32980m();
        if ((m || m2) && (!m || !m2 || !this.name.equals(mVSuggestedTicketFareRef.name))) {
            return false;
        }
        boolean f = mo32972f();
        boolean f2 = mVSuggestedTicketFareRef.mo32972f();
        if ((f || f2) && (!f || !f2 || this.agencyId != mVSuggestedTicketFareRef.agencyId)) {
            return false;
        }
        boolean o = mo32981o();
        boolean o2 = mVSuggestedTicketFareRef.mo32981o();
        if ((o || o2) && (!o || !o2 || !this.price.mo26102a(mVSuggestedTicketFareRef.price))) {
            return false;
        }
        boolean i = mo32976i();
        boolean i2 = mVSuggestedTicketFareRef.mo32976i();
        if ((i || i2) && (!i || !i2 || !this.appliedFilters.equals(mVSuggestedTicketFareRef.appliedFilters))) {
            return false;
        }
        boolean g = mo32973g();
        boolean g2 = mVSuggestedTicketFareRef.mo32973g();
        if ((g || g2) && (!g || !g2 || !this.agencyKey.equals(mVSuggestedTicketFareRef.agencyKey))) {
            return false;
        }
        boolean j = mo32977j();
        boolean j2 = mVSuggestedTicketFareRef.mo32977j();
        if (((j || j2) && (!j || !j2 || !this.data.mo32463a(mVSuggestedTicketFareRef.data))) || this.metroId != mVSuggestedTicketFareRef.metroId) {
            return false;
        }
        boolean h = mo32974h();
        boolean h2 = mVSuggestedTicketFareRef.mo32974h();
        if ((h || h2) && (!h || !h2 || !this.agencyName.equals(mVSuggestedTicketFareRef.agencyName))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32972f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo32973g() {
        return this.agencyKey != null;
    }

    /* renamed from: h */
    public final boolean mo32974h() {
        return this.agencyName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32976i() {
        return this.appliedFilters != null;
    }

    /* renamed from: j */
    public final boolean mo32977j() {
        return this.data != null;
    }

    /* renamed from: k */
    public final boolean mo32978k() {
        return this.fareId != null;
    }

    /* renamed from: l */
    public final boolean mo32979l() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: m */
    public final boolean mo32980m() {
        return this.name != null;
    }

    /* renamed from: o */
    public final boolean mo32981o() {
        return this.price != null;
    }

    /* renamed from: p */
    public final boolean mo32982p() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: q */
    public final void mo32983q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: r */
    public final void mo32984r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: s */
    public final void mo32985s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSuggestedTicketFareRef(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "fareId:");
        String str = this.fareId;
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
        if (mo32972f()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        n.append(", ");
        n.append("price:");
        MVCurrencyAmount mVCurrencyAmount = this.price;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo32976i()) {
            n.append(", ");
            n.append("appliedFilters:");
            List<MVFilter> list = this.appliedFilters;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        n.append(", ");
        n.append("agencyKey:");
        String str3 = this.agencyKey;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo32977j()) {
            n.append(", ");
            n.append("data:");
            MVProviderSpecificData mVProviderSpecificData = this.data;
            if (mVProviderSpecificData == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVProviderSpecificData);
            }
        }
        n.append(", ");
        n.append("metroId:");
        C0016g.m42z(n, this.metroId, ", ", "agencyName:");
        String str4 = this.agencyName;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }
}
