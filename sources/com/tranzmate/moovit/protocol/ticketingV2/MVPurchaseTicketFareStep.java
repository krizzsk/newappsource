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

public class MVPurchaseTicketFareStep extends TUnion<MVPurchaseTicketFareStep, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f29031c = new C17394d0("MVPurchaseTicketFareStep");

    /* renamed from: d */
    public static final C25113c f29032d = new C25113c("filterSelection", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f29033e = new C25113c("fareSelection", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f29034f = new C25113c("massabi", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f29035g = new C25113c("suggestedFares", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f29036h = new C25113c("purchaseFare", (byte) 12, 5);

    /* renamed from: i */
    public static final C25113c f29037i = new C25113c("purchaseTypeSelection", (byte) 12, 6);

    /* renamed from: j */
    public static final C25113c f29038j = new C25113c("storedValueSelection", (byte) 12, 7);

    /* renamed from: k */
    public static final C25113c f29039k = new C25113c("purchaseItinerary", (byte) 12, 8);

    /* renamed from: l */
    public static final C25113c f29040l = new C25113c("itineraryLegSelection", (byte) 12, 9);

    /* renamed from: m */
    public static final C25113c f29041m = new C25113c("purchaseStoredValue", (byte) 12, 10);

    /* renamed from: n */
    public static final C25113c f29042n = new C25113c("purchaseCartStep", (byte) 12, 11);

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f29043o;

    public enum _Fields implements C25085c {
        FILTER_SELECTION(1, "filterSelection"),
        FARE_SELECTION(2, "fareSelection"),
        MASSABI(3, "massabi"),
        SUGGESTED_FARES(4, "suggestedFares"),
        PURCHASE_FARE(5, "purchaseFare"),
        PURCHASE_TYPE_SELECTION(6, "purchaseTypeSelection"),
        STORED_VALUE_SELECTION(7, "storedValueSelection"),
        PURCHASE_ITINERARY(8, "purchaseItinerary"),
        ITINERARY_LEG_SELECTION(9, "itineraryLegSelection"),
        PURCHASE_STORED_VALUE(10, "purchaseStoredValue"),
        PURCHASE_CART_STEP(11, "purchaseCartStep");
        
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
                    return FILTER_SELECTION;
                case 2:
                    return FARE_SELECTION;
                case 3:
                    return MASSABI;
                case 4:
                    return SUGGESTED_FARES;
                case 5:
                    return PURCHASE_FARE;
                case 6:
                    return PURCHASE_TYPE_SELECTION;
                case 7:
                    return STORED_VALUE_SELECTION;
                case 8:
                    return PURCHASE_ITINERARY;
                case 9:
                    return ITINERARY_LEG_SELECTION;
                case 10:
                    return PURCHASE_STORED_VALUE;
                case 11:
                    return PURCHASE_CART_STEP;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$a */
    public static /* synthetic */ class C10995a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29044a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields[] r0 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29044a = r0
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.FILTER_SELECTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.FARE_SELECTION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.MASSABI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.SUGGESTED_FARES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_FARE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_TYPE_SELECTION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.STORED_VALUE_SELECTION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_ITINERARY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.ITINERARY_LEG_SELECTION     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_STORED_VALUE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f29044a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep._Fields.PURCHASE_CART_STEP     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStep.C10995a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FILTER_SELECTION, new FieldMetaData("filterSelection", (byte) 3, new StructMetaData(MVPurchaseFilterListSelectionStep.class)));
        enumMap.put(_Fields.FARE_SELECTION, new FieldMetaData("fareSelection", (byte) 3, new StructMetaData(MVPurchaseTicketFareSelectionStep.class)));
        enumMap.put(_Fields.MASSABI, new FieldMetaData("massabi", (byte) 3, new StructMetaData(MVPurchaseMassabiStep.class)));
        enumMap.put(_Fields.SUGGESTED_FARES, new FieldMetaData("suggestedFares", (byte) 3, new StructMetaData(MVSuggestedTicketFareSelectionStep.class)));
        enumMap.put(_Fields.PURCHASE_FARE, new FieldMetaData("purchaseFare", (byte) 3, new StructMetaData(MVPurchaseFareStep.class)));
        enumMap.put(_Fields.PURCHASE_TYPE_SELECTION, new FieldMetaData("purchaseTypeSelection", (byte) 3, new StructMetaData(MVPurchaseTypeSelectionStep.class)));
        enumMap.put(_Fields.STORED_VALUE_SELECTION, new FieldMetaData("storedValueSelection", (byte) 3, new StructMetaData(MVPurchaseStoredValueSelectionStep.class)));
        enumMap.put(_Fields.PURCHASE_ITINERARY, new FieldMetaData("purchaseItinerary", (byte) 3, new StructMetaData(MVPurchaseItineraryStep.class)));
        enumMap.put(_Fields.ITINERARY_LEG_SELECTION, new FieldMetaData("itineraryLegSelection", (byte) 3, new StructMetaData(MVPurchaseItineraryLegSelectionStep.class)));
        enumMap.put(_Fields.PURCHASE_STORED_VALUE, new FieldMetaData("purchaseStoredValue", (byte) 3, new StructMetaData(MVPurchaseStoredValueStep.class)));
        enumMap.put(_Fields.PURCHASE_CART_STEP, new FieldMetaData("purchaseCartStep", (byte) 3, new StructMetaData(MVPurchaseCartStep.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29043o = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseTicketFareStep.class, unmodifiableMap);
    }

    /* renamed from: l */
    public static C25113c m28269l(_Fields _fields) {
        switch (C10995a.f29044a[_fields.ordinal()]) {
            case 1:
                return f29032d;
            case 2:
                return f29033e;
            case 3:
                return f29034f;
            case 4:
                return f29035g;
            case 5:
                return f29036h;
            case 6:
                return f29037i;
            case 7:
                return f29038j;
            case 8:
                return f29039k;
            case 9:
                return f29040l;
            case 10:
                return f29041m;
            case 11:
                return f29042n;
            default:
                throw new IllegalArgumentException("Unknown field id " + _fields);
        }
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
    public final /* bridge */ /* synthetic */ C25113c mo25505b(C25085c cVar) {
        return m28269l((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVPurchaseTicketFareStep mVPurchaseTicketFareStep = (MVPurchaseTicketFareStep) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVPurchaseTicketFareStep.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVPurchaseTicketFareStep.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MVPurchaseTicketFareStep) {
            return mo32865k((MVPurchaseTicketFareStep) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f29031c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            switch (C10995a.f29044a[findByThriftId.ordinal()]) {
                case 1:
                    byte b = cVar.f63356b;
                    if (b == 12) {
                        MVPurchaseFilterListSelectionStep mVPurchaseFilterListSelectionStep = new MVPurchaseFilterListSelectionStep();
                        mVPurchaseFilterListSelectionStep.mo25201C1(gVar);
                        return mVPurchaseFilterListSelectionStep;
                    }
                    C25122h.m63098a(gVar, b);
                    return null;
                case 2:
                    byte b2 = cVar.f63356b;
                    if (b2 == 12) {
                        MVPurchaseTicketFareSelectionStep mVPurchaseTicketFareSelectionStep = new MVPurchaseTicketFareSelectionStep();
                        mVPurchaseTicketFareSelectionStep.mo25201C1(gVar);
                        return mVPurchaseTicketFareSelectionStep;
                    }
                    C25122h.m63098a(gVar, b2);
                    return null;
                case 3:
                    byte b3 = cVar.f63356b;
                    if (b3 == 12) {
                        MVPurchaseMassabiStep mVPurchaseMassabiStep = new MVPurchaseMassabiStep();
                        mVPurchaseMassabiStep.mo25201C1(gVar);
                        return mVPurchaseMassabiStep;
                    }
                    C25122h.m63098a(gVar, b3);
                    return null;
                case 4:
                    byte b4 = cVar.f63356b;
                    if (b4 == 12) {
                        MVSuggestedTicketFareSelectionStep mVSuggestedTicketFareSelectionStep = new MVSuggestedTicketFareSelectionStep();
                        mVSuggestedTicketFareSelectionStep.mo25201C1(gVar);
                        return mVSuggestedTicketFareSelectionStep;
                    }
                    C25122h.m63098a(gVar, b4);
                    return null;
                case 5:
                    byte b5 = cVar.f63356b;
                    if (b5 == 12) {
                        MVPurchaseFareStep mVPurchaseFareStep = new MVPurchaseFareStep();
                        mVPurchaseFareStep.mo25201C1(gVar);
                        return mVPurchaseFareStep;
                    }
                    C25122h.m63098a(gVar, b5);
                    return null;
                case 6:
                    byte b6 = cVar.f63356b;
                    if (b6 == 12) {
                        MVPurchaseTypeSelectionStep mVPurchaseTypeSelectionStep = new MVPurchaseTypeSelectionStep();
                        mVPurchaseTypeSelectionStep.mo25201C1(gVar);
                        return mVPurchaseTypeSelectionStep;
                    }
                    C25122h.m63098a(gVar, b6);
                    return null;
                case 7:
                    byte b7 = cVar.f63356b;
                    if (b7 == 12) {
                        MVPurchaseStoredValueSelectionStep mVPurchaseStoredValueSelectionStep = new MVPurchaseStoredValueSelectionStep();
                        mVPurchaseStoredValueSelectionStep.mo25201C1(gVar);
                        return mVPurchaseStoredValueSelectionStep;
                    }
                    C25122h.m63098a(gVar, b7);
                    return null;
                case 8:
                    byte b8 = cVar.f63356b;
                    if (b8 == 12) {
                        MVPurchaseItineraryStep mVPurchaseItineraryStep = new MVPurchaseItineraryStep();
                        mVPurchaseItineraryStep.mo25201C1(gVar);
                        return mVPurchaseItineraryStep;
                    }
                    C25122h.m63098a(gVar, b8);
                    return null;
                case 9:
                    byte b9 = cVar.f63356b;
                    if (b9 == 12) {
                        MVPurchaseItineraryLegSelectionStep mVPurchaseItineraryLegSelectionStep = new MVPurchaseItineraryLegSelectionStep();
                        mVPurchaseItineraryLegSelectionStep.mo25201C1(gVar);
                        return mVPurchaseItineraryLegSelectionStep;
                    }
                    C25122h.m63098a(gVar, b9);
                    return null;
                case 10:
                    byte b11 = cVar.f63356b;
                    if (b11 == 12) {
                        MVPurchaseStoredValueStep mVPurchaseStoredValueStep = new MVPurchaseStoredValueStep();
                        mVPurchaseStoredValueStep.mo25201C1(gVar);
                        return mVPurchaseStoredValueStep;
                    }
                    C25122h.m63098a(gVar, b11);
                    return null;
                case 11:
                    byte b12 = cVar.f63356b;
                    if (b12 == 12) {
                        MVPurchaseCartStep mVPurchaseCartStep = new MVPurchaseCartStep();
                        mVPurchaseCartStep.mo25201C1(gVar);
                        return mVPurchaseCartStep;
                    }
                    C25122h.m63098a(gVar, b12);
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
        switch (C10995a.f29044a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVPurchaseFilterListSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVPurchaseTicketFareSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVPurchaseMassabiStep) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVSuggestedTicketFareSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVPurchaseFareStep) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVPurchaseTypeSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVPurchaseStoredValueSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVPurchaseItineraryStep) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVPurchaseItineraryLegSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVPurchaseStoredValueStep) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVPurchaseCartStep) this.value_).mo25202X0(gVar);
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
            switch (C10995a.f29044a[findByThriftId.ordinal()]) {
                case 1:
                    MVPurchaseFilterListSelectionStep mVPurchaseFilterListSelectionStep = new MVPurchaseFilterListSelectionStep();
                    mVPurchaseFilterListSelectionStep.mo25201C1(gVar);
                    return mVPurchaseFilterListSelectionStep;
                case 2:
                    MVPurchaseTicketFareSelectionStep mVPurchaseTicketFareSelectionStep = new MVPurchaseTicketFareSelectionStep();
                    mVPurchaseTicketFareSelectionStep.mo25201C1(gVar);
                    return mVPurchaseTicketFareSelectionStep;
                case 3:
                    MVPurchaseMassabiStep mVPurchaseMassabiStep = new MVPurchaseMassabiStep();
                    mVPurchaseMassabiStep.mo25201C1(gVar);
                    return mVPurchaseMassabiStep;
                case 4:
                    MVSuggestedTicketFareSelectionStep mVSuggestedTicketFareSelectionStep = new MVSuggestedTicketFareSelectionStep();
                    mVSuggestedTicketFareSelectionStep.mo25201C1(gVar);
                    return mVSuggestedTicketFareSelectionStep;
                case 5:
                    MVPurchaseFareStep mVPurchaseFareStep = new MVPurchaseFareStep();
                    mVPurchaseFareStep.mo25201C1(gVar);
                    return mVPurchaseFareStep;
                case 6:
                    MVPurchaseTypeSelectionStep mVPurchaseTypeSelectionStep = new MVPurchaseTypeSelectionStep();
                    mVPurchaseTypeSelectionStep.mo25201C1(gVar);
                    return mVPurchaseTypeSelectionStep;
                case 7:
                    MVPurchaseStoredValueSelectionStep mVPurchaseStoredValueSelectionStep = new MVPurchaseStoredValueSelectionStep();
                    mVPurchaseStoredValueSelectionStep.mo25201C1(gVar);
                    return mVPurchaseStoredValueSelectionStep;
                case 8:
                    MVPurchaseItineraryStep mVPurchaseItineraryStep = new MVPurchaseItineraryStep();
                    mVPurchaseItineraryStep.mo25201C1(gVar);
                    return mVPurchaseItineraryStep;
                case 9:
                    MVPurchaseItineraryLegSelectionStep mVPurchaseItineraryLegSelectionStep = new MVPurchaseItineraryLegSelectionStep();
                    mVPurchaseItineraryLegSelectionStep.mo25201C1(gVar);
                    return mVPurchaseItineraryLegSelectionStep;
                case 10:
                    MVPurchaseStoredValueStep mVPurchaseStoredValueStep = new MVPurchaseStoredValueStep();
                    mVPurchaseStoredValueStep.mo25201C1(gVar);
                    return mVPurchaseStoredValueStep;
                case 11:
                    MVPurchaseCartStep mVPurchaseCartStep = new MVPurchaseCartStep();
                    mVPurchaseCartStep.mo25201C1(gVar);
                    return mVPurchaseCartStep;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        switch (C10995a.f29044a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVPurchaseFilterListSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVPurchaseTicketFareSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVPurchaseMassabiStep) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVSuggestedTicketFareSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVPurchaseFareStep) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVPurchaseTypeSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 7:
                ((MVPurchaseStoredValueSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 8:
                ((MVPurchaseItineraryStep) this.value_).mo25202X0(gVar);
                return;
            case 9:
                ((MVPurchaseItineraryLegSelectionStep) this.value_).mo25202X0(gVar);
                return;
            case 10:
                ((MVPurchaseStoredValueStep) this.value_).mo25202X0(gVar);
                return;
            case 11:
                ((MVPurchaseCartStep) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: k */
    public final boolean mo32865k(MVPurchaseTicketFareStep mVPurchaseTicketFareStep) {
        if (mVPurchaseTicketFareStep == null || this.setField_ != mVPurchaseTicketFareStep.setField_ || !this.value_.equals(mVPurchaseTicketFareStep.value_)) {
            return false;
        }
        return true;
    }
}
