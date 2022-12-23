package com.tranzmate.moovit.protocol.ticketingV2;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TException;
import org.apache.thrift.TUnion;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TProtocolException;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import xi0.C25276a;

public class MVPurchaseIntent extends TUnion<MVPurchaseIntent, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f28857c = new C17394d0("MVPurchaseIntent");

    /* renamed from: d */
    public static final C25113c f28858d = new C25113c("generic", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f28859e = new C25113c("storedValue", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f28860f = new C25113c("ticketValue", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f28861g = new C25113c("itineraryValue", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f28862h = new C25113c("autoLoadIntent", (byte) 12, 5);

    /* renamed from: i */
    public static final C25113c f28863i = new C25113c("cart", (byte) 12, 6);

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f28864j;

    public enum _Fields implements C25085c {
        GENERIC(1, "generic"),
        STORED_VALUE(2, "storedValue"),
        TICKET_VALUE(3, "ticketValue"),
        ITINERARY_VALUE(4, "itineraryValue"),
        AUTO_LOAD_INTENT(5, "autoLoadIntent"),
        CART(6, "cart");
        
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
                    return GENERIC;
                case 2:
                    return STORED_VALUE;
                case 3:
                    return TICKET_VALUE;
                case 4:
                    return ITINERARY_VALUE;
                case 5:
                    return AUTO_LOAD_INTENT;
                case 6:
                    return CART;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent$a */
    public static /* synthetic */ class C10898a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28865a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent$_Fields[] r0 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28865a = r0
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent._Fields.GENERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28865a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent._Fields.STORED_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28865a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent._Fields.TICKET_VALUE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28865a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent._Fields.ITINERARY_VALUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28865a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent._Fields.AUTO_LOAD_INTENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f28865a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent._Fields.CART     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseIntent.C10898a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GENERIC, new FieldMetaData("generic", (byte) 3, new StructMetaData(MVPurchaseGenericIntent.class)));
        enumMap.put(_Fields.STORED_VALUE, new FieldMetaData("storedValue", (byte) 3, new StructMetaData(MVPurchaseStoredValueIntent.class)));
        enumMap.put(_Fields.TICKET_VALUE, new FieldMetaData("ticketValue", (byte) 3, new StructMetaData(MVPurchaseTicketIntent.class)));
        enumMap.put(_Fields.ITINERARY_VALUE, new FieldMetaData("itineraryValue", (byte) 3, new StructMetaData(MVPurchaseItineraryIntent.class)));
        enumMap.put(_Fields.AUTO_LOAD_INTENT, new FieldMetaData("autoLoadIntent", (byte) 3, new StructMetaData(MVPurchaseStoredValueAutoLoadIntent.class)));
        enumMap.put(_Fields.CART, new FieldMetaData("cart", (byte) 3, new StructMetaData(MVPurchaseCartIntent.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28864j = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseIntent.class, unmodifiableMap);
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

    /* renamed from: a */
    public final C25085c mo25504a(short s) {
        return _Fields.findByThriftIdOrThrow(s);
    }

    /* renamed from: b */
    public final C25113c mo25505b(C25085c cVar) {
        _Fields _fields = (_Fields) cVar;
        switch (C10898a.f28865a[_fields.ordinal()]) {
            case 1:
                return f28858d;
            case 2:
                return f28859e;
            case 3:
                return f28860f;
            case 4:
                return f28861g;
            case 5:
                return f28862h;
            case 6:
                return f28863i;
            default:
                throw new IllegalArgumentException("Unknown field id " + _fields);
        }
    }

    public final int compareTo(Object obj) {
        MVPurchaseIntent mVPurchaseIntent = (MVPurchaseIntent) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVPurchaseIntent.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVPurchaseIntent.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVPurchaseIntent mVPurchaseIntent;
        if (!(obj instanceof MVPurchaseIntent) || (mVPurchaseIntent = (MVPurchaseIntent) obj) == null || this.setField_ != mVPurchaseIntent.setField_ || !this.value_.equals(mVPurchaseIntent.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f28857c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            switch (C10898a.f28865a[findByThriftId.ordinal()]) {
                case 1:
                    byte b = cVar.f63356b;
                    if (b == 12) {
                        MVPurchaseGenericIntent mVPurchaseGenericIntent = new MVPurchaseGenericIntent();
                        mVPurchaseGenericIntent.mo25201C1(gVar);
                        return mVPurchaseGenericIntent;
                    }
                    C25122h.m63098a(gVar, b);
                    return null;
                case 2:
                    byte b2 = cVar.f63356b;
                    if (b2 == 12) {
                        MVPurchaseStoredValueIntent mVPurchaseStoredValueIntent = new MVPurchaseStoredValueIntent();
                        mVPurchaseStoredValueIntent.mo25201C1(gVar);
                        return mVPurchaseStoredValueIntent;
                    }
                    C25122h.m63098a(gVar, b2);
                    return null;
                case 3:
                    byte b3 = cVar.f63356b;
                    if (b3 == 12) {
                        MVPurchaseTicketIntent mVPurchaseTicketIntent = new MVPurchaseTicketIntent();
                        mVPurchaseTicketIntent.mo25201C1(gVar);
                        return mVPurchaseTicketIntent;
                    }
                    C25122h.m63098a(gVar, b3);
                    return null;
                case 4:
                    byte b4 = cVar.f63356b;
                    if (b4 == 12) {
                        MVPurchaseItineraryIntent mVPurchaseItineraryIntent = new MVPurchaseItineraryIntent();
                        mVPurchaseItineraryIntent.mo25201C1(gVar);
                        return mVPurchaseItineraryIntent;
                    }
                    C25122h.m63098a(gVar, b4);
                    return null;
                case 5:
                    byte b5 = cVar.f63356b;
                    if (b5 == 12) {
                        MVPurchaseStoredValueAutoLoadIntent mVPurchaseStoredValueAutoLoadIntent = new MVPurchaseStoredValueAutoLoadIntent();
                        mVPurchaseStoredValueAutoLoadIntent.mo25201C1(gVar);
                        return mVPurchaseStoredValueAutoLoadIntent;
                    }
                    C25122h.m63098a(gVar, b5);
                    return null;
                case 6:
                    byte b6 = cVar.f63356b;
                    if (b6 == 12) {
                        MVPurchaseCartIntent mVPurchaseCartIntent = new MVPurchaseCartIntent();
                        mVPurchaseCartIntent.mo25201C1(gVar);
                        return mVPurchaseCartIntent;
                    }
                    C25122h.m63098a(gVar, b6);
                    return null;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        switch (C10898a.f28865a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVPurchaseGenericIntent) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVPurchaseStoredValueIntent) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVPurchaseTicketIntent) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVPurchaseItineraryIntent) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVPurchaseStoredValueAutoLoadIntent) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVPurchaseCartIntent) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final Object mo25512i(C25121g gVar, short s) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(s);
        if (findByThriftId != null) {
            switch (C10898a.f28865a[findByThriftId.ordinal()]) {
                case 1:
                    MVPurchaseGenericIntent mVPurchaseGenericIntent = new MVPurchaseGenericIntent();
                    mVPurchaseGenericIntent.mo25201C1(gVar);
                    return mVPurchaseGenericIntent;
                case 2:
                    MVPurchaseStoredValueIntent mVPurchaseStoredValueIntent = new MVPurchaseStoredValueIntent();
                    mVPurchaseStoredValueIntent.mo25201C1(gVar);
                    return mVPurchaseStoredValueIntent;
                case 3:
                    MVPurchaseTicketIntent mVPurchaseTicketIntent = new MVPurchaseTicketIntent();
                    mVPurchaseTicketIntent.mo25201C1(gVar);
                    return mVPurchaseTicketIntent;
                case 4:
                    MVPurchaseItineraryIntent mVPurchaseItineraryIntent = new MVPurchaseItineraryIntent();
                    mVPurchaseItineraryIntent.mo25201C1(gVar);
                    return mVPurchaseItineraryIntent;
                case 5:
                    MVPurchaseStoredValueAutoLoadIntent mVPurchaseStoredValueAutoLoadIntent = new MVPurchaseStoredValueAutoLoadIntent();
                    mVPurchaseStoredValueAutoLoadIntent.mo25201C1(gVar);
                    return mVPurchaseStoredValueAutoLoadIntent;
                case 6:
                    MVPurchaseCartIntent mVPurchaseCartIntent = new MVPurchaseCartIntent();
                    mVPurchaseCartIntent.mo25201C1(gVar);
                    return mVPurchaseCartIntent;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        switch (C10898a.f28865a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVPurchaseGenericIntent) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVPurchaseStoredValueIntent) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVPurchaseTicketIntent) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVPurchaseItineraryIntent) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVPurchaseStoredValueAutoLoadIntent) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVPurchaseCartIntent) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }
}
