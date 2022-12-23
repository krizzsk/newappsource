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

public class MVPurchaseTicketFareStepResult extends TUnion<MVPurchaseTicketFareStepResult, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f29054c = new C17394d0("MVPurchaseTicketFareStepResult");

    /* renamed from: d */
    public static final C25113c f29055d = new C25113c("filterResult", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f29056e = new C25113c("suggestedFareResult", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f29057f = new C25113c("purchaseTypeResult", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f29058g = new C25113c("itineraryLegSelectionResult", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f29059h = new C25113c("fareSelectedStepResult", (byte) 12, 5);

    /* renamed from: i */
    public static final C25113c f29060i = new C25113c("storedValueStepResult", (byte) 12, 6);

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f29061j;

    public enum _Fields implements C25085c {
        FILTER_RESULT(1, "filterResult"),
        SUGGESTED_FARE_RESULT(2, "suggestedFareResult"),
        PURCHASE_TYPE_RESULT(3, "purchaseTypeResult"),
        ITINERARY_LEG_SELECTION_RESULT(4, "itineraryLegSelectionResult"),
        FARE_SELECTED_STEP_RESULT(5, "fareSelectedStepResult"),
        STORED_VALUE_STEP_RESULT(6, "storedValueStepResult");
        
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
                    return FILTER_RESULT;
                case 2:
                    return SUGGESTED_FARE_RESULT;
                case 3:
                    return PURCHASE_TYPE_RESULT;
                case 4:
                    return ITINERARY_LEG_SELECTION_RESULT;
                case 5:
                    return FARE_SELECTED_STEP_RESULT;
                case 6:
                    return STORED_VALUE_STEP_RESULT;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult$a */
    public static /* synthetic */ class C11004a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29062a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult$_Fields[] r0 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29062a = r0
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult._Fields.FILTER_RESULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29062a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult._Fields.SUGGESTED_FARE_RESULT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29062a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult._Fields.PURCHASE_TYPE_RESULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29062a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult._Fields.ITINERARY_LEG_SELECTION_RESULT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f29062a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult._Fields.FARE_SELECTED_STEP_RESULT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f29062a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult._Fields.STORED_VALUE_STEP_RESULT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult.C11004a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.FILTER_RESULT, new FieldMetaData("filterResult", (byte) 3, new StructMetaData(MVPurchaseFilterSelectionStepResult.class)));
        enumMap.put(_Fields.SUGGESTED_FARE_RESULT, new FieldMetaData("suggestedFareResult", (byte) 3, new StructMetaData(MVSuggestedTicketFareSelectionStepResult.class)));
        enumMap.put(_Fields.PURCHASE_TYPE_RESULT, new FieldMetaData("purchaseTypeResult", (byte) 3, new StructMetaData(MVPurchaseTypeSelectionStepResult.class)));
        enumMap.put(_Fields.ITINERARY_LEG_SELECTION_RESULT, new FieldMetaData("itineraryLegSelectionResult", (byte) 3, new StructMetaData(MVPurchaseItineraryLegSelectionStepResult.class)));
        enumMap.put(_Fields.FARE_SELECTED_STEP_RESULT, new FieldMetaData("fareSelectedStepResult", (byte) 3, new StructMetaData(MVPurchaseTicketFareSelectionStepResult.class)));
        enumMap.put(_Fields.STORED_VALUE_STEP_RESULT, new FieldMetaData("storedValueStepResult", (byte) 3, new StructMetaData(MVPurchaseStoredValueSelectionStepResult.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29061j = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseTicketFareStepResult.class, unmodifiableMap);
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
        switch (C11004a.f29062a[_fields.ordinal()]) {
            case 1:
                return f29055d;
            case 2:
                return f29056e;
            case 3:
                return f29057f;
            case 4:
                return f29058g;
            case 5:
                return f29059h;
            case 6:
                return f29060i;
            default:
                throw new IllegalArgumentException("Unknown field id " + _fields);
        }
    }

    public final int compareTo(Object obj) {
        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = (MVPurchaseTicketFareStepResult) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVPurchaseTicketFareStepResult.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVPurchaseTicketFareStepResult.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult;
        if (!(obj instanceof MVPurchaseTicketFareStepResult) || (mVPurchaseTicketFareStepResult = (MVPurchaseTicketFareStepResult) obj) == null || this.setField_ != mVPurchaseTicketFareStepResult.setField_ || !this.value_.equals(mVPurchaseTicketFareStepResult.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f29054c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            switch (C11004a.f29062a[findByThriftId.ordinal()]) {
                case 1:
                    byte b = cVar.f63356b;
                    if (b == 12) {
                        MVPurchaseFilterSelectionStepResult mVPurchaseFilterSelectionStepResult = new MVPurchaseFilterSelectionStepResult();
                        mVPurchaseFilterSelectionStepResult.mo25201C1(gVar);
                        return mVPurchaseFilterSelectionStepResult;
                    }
                    C25122h.m63098a(gVar, b);
                    return null;
                case 2:
                    byte b2 = cVar.f63356b;
                    if (b2 == 12) {
                        MVSuggestedTicketFareSelectionStepResult mVSuggestedTicketFareSelectionStepResult = new MVSuggestedTicketFareSelectionStepResult();
                        mVSuggestedTicketFareSelectionStepResult.mo25201C1(gVar);
                        return mVSuggestedTicketFareSelectionStepResult;
                    }
                    C25122h.m63098a(gVar, b2);
                    return null;
                case 3:
                    byte b3 = cVar.f63356b;
                    if (b3 == 12) {
                        MVPurchaseTypeSelectionStepResult mVPurchaseTypeSelectionStepResult = new MVPurchaseTypeSelectionStepResult();
                        mVPurchaseTypeSelectionStepResult.mo25201C1(gVar);
                        return mVPurchaseTypeSelectionStepResult;
                    }
                    C25122h.m63098a(gVar, b3);
                    return null;
                case 4:
                    byte b4 = cVar.f63356b;
                    if (b4 == 12) {
                        MVPurchaseItineraryLegSelectionStepResult mVPurchaseItineraryLegSelectionStepResult = new MVPurchaseItineraryLegSelectionStepResult();
                        mVPurchaseItineraryLegSelectionStepResult.mo25201C1(gVar);
                        return mVPurchaseItineraryLegSelectionStepResult;
                    }
                    C25122h.m63098a(gVar, b4);
                    return null;
                case 5:
                    byte b5 = cVar.f63356b;
                    if (b5 == 12) {
                        MVPurchaseTicketFareSelectionStepResult mVPurchaseTicketFareSelectionStepResult = new MVPurchaseTicketFareSelectionStepResult();
                        mVPurchaseTicketFareSelectionStepResult.mo25201C1(gVar);
                        return mVPurchaseTicketFareSelectionStepResult;
                    }
                    C25122h.m63098a(gVar, b5);
                    return null;
                case 6:
                    byte b6 = cVar.f63356b;
                    if (b6 == 12) {
                        MVPurchaseStoredValueSelectionStepResult mVPurchaseStoredValueSelectionStepResult = new MVPurchaseStoredValueSelectionStepResult();
                        mVPurchaseStoredValueSelectionStepResult.mo25201C1(gVar);
                        return mVPurchaseStoredValueSelectionStepResult;
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
        switch (C11004a.f29062a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVPurchaseFilterSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVSuggestedTicketFareSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVPurchaseTypeSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVPurchaseItineraryLegSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVPurchaseTicketFareSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVPurchaseStoredValueSelectionStepResult) this.value_).mo25202X0(gVar);
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
            switch (C11004a.f29062a[findByThriftId.ordinal()]) {
                case 1:
                    MVPurchaseFilterSelectionStepResult mVPurchaseFilterSelectionStepResult = new MVPurchaseFilterSelectionStepResult();
                    mVPurchaseFilterSelectionStepResult.mo25201C1(gVar);
                    return mVPurchaseFilterSelectionStepResult;
                case 2:
                    MVSuggestedTicketFareSelectionStepResult mVSuggestedTicketFareSelectionStepResult = new MVSuggestedTicketFareSelectionStepResult();
                    mVSuggestedTicketFareSelectionStepResult.mo25201C1(gVar);
                    return mVSuggestedTicketFareSelectionStepResult;
                case 3:
                    MVPurchaseTypeSelectionStepResult mVPurchaseTypeSelectionStepResult = new MVPurchaseTypeSelectionStepResult();
                    mVPurchaseTypeSelectionStepResult.mo25201C1(gVar);
                    return mVPurchaseTypeSelectionStepResult;
                case 4:
                    MVPurchaseItineraryLegSelectionStepResult mVPurchaseItineraryLegSelectionStepResult = new MVPurchaseItineraryLegSelectionStepResult();
                    mVPurchaseItineraryLegSelectionStepResult.mo25201C1(gVar);
                    return mVPurchaseItineraryLegSelectionStepResult;
                case 5:
                    MVPurchaseTicketFareSelectionStepResult mVPurchaseTicketFareSelectionStepResult = new MVPurchaseTicketFareSelectionStepResult();
                    mVPurchaseTicketFareSelectionStepResult.mo25201C1(gVar);
                    return mVPurchaseTicketFareSelectionStepResult;
                case 6:
                    MVPurchaseStoredValueSelectionStepResult mVPurchaseStoredValueSelectionStepResult = new MVPurchaseStoredValueSelectionStepResult();
                    mVPurchaseStoredValueSelectionStepResult.mo25201C1(gVar);
                    return mVPurchaseStoredValueSelectionStepResult;
                default:
                    throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        switch (C11004a.f29062a[((_Fields) this.setField_).ordinal()]) {
            case 1:
                ((MVPurchaseFilterSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 2:
                ((MVSuggestedTicketFareSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 3:
                ((MVPurchaseTypeSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 4:
                ((MVPurchaseItineraryLegSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 5:
                ((MVPurchaseTicketFareSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            case 6:
                ((MVPurchaseStoredValueSelectionStepResult) this.value_).mo25202X0(gVar);
                return;
            default:
                StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
                k.append(this.setField_);
                throw new IllegalStateException(k.toString());
        }
    }
}
