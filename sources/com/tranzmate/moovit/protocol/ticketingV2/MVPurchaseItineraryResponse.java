package com.tranzmate.moovit.protocol.ticketingV2;

import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TException;
import org.apache.thrift.TUnion;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TProtocolException;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import xi0.C25276a;

public class MVPurchaseItineraryResponse extends TUnion<MVPurchaseItineraryResponse, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f28911c = new C17394d0("MVPurchaseItineraryResponse");

    /* renamed from: d */
    public static final C25113c f28912d = new C25113c("tickets", (byte) 15, 1);

    /* renamed from: e */
    public static final C25113c f28913e = new C25113c("missingSteps", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f28914f = new C25113c("verificationType", (byte) 8, 3);

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28915g;

    public enum _Fields implements C25085c {
        TICKETS(1, "tickets"),
        MISSING_STEPS(2, "missingSteps"),
        VERIFICATION_TYPE(3, "verificationType");
        
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
                return TICKETS;
            }
            if (i == 2) {
                return MISSING_STEPS;
            }
            if (i != 3) {
                return null;
            }
            return VERIFICATION_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse$a */
    public static /* synthetic */ class C10928a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28916a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse$_Fields[] r0 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28916a = r0
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse._Fields.TICKETS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28916a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse._Fields.MISSING_STEPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28916a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse._Fields.VERIFICATION_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse.C10928a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TICKETS, new FieldMetaData("tickets", (byte) 2, new ListMetaData(new StructMetaData(MVTicket.class))));
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 3, new StructMetaData(MVMissingPaymentRegistrationSteps.class)));
        enumMap.put(_Fields.VERIFICATION_TYPE, new FieldMetaData("verificationType", (byte) 3, new EnumMetaData(MVPurchaseVerifacationType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28915g = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseItineraryResponse.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static C25113c m28031k(_Fields _fields) {
        int i = C10928a.f28916a[_fields.ordinal()];
        if (i == 1) {
            return f28912d;
        }
        if (i == 2) {
            return f28913e;
        }
        if (i == 3) {
            return f28914f;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
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
        return m28031k((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVPurchaseItineraryResponse mVPurchaseItineraryResponse = (MVPurchaseItineraryResponse) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVPurchaseItineraryResponse.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVPurchaseItineraryResponse.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVPurchaseItineraryResponse mVPurchaseItineraryResponse;
        if (!(obj instanceof MVPurchaseItineraryResponse) || (mVPurchaseItineraryResponse = (MVPurchaseItineraryResponse) obj) == null || this.setField_ != mVPurchaseItineraryResponse.setField_ || !this.value_.equals(mVPurchaseItineraryResponse.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f28911c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C10928a.f28916a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    ArrayList arrayList = new ArrayList(k.f63395b);
                    for (int i2 = 0; i2 < k.f63395b; i2++) {
                        MVTicket mVTicket = new MVTicket();
                        mVTicket.mo25201C1(gVar);
                        arrayList.add(mVTicket);
                    }
                    gVar.mo61699l();
                    return arrayList;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    return C13437d.m33702g(gVar);
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 8) {
                    return MVPurchaseVerifacationType.findByValue(gVar.mo61696i());
                }
                C25122h.m63098a(gVar, b3);
                return null;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        int i = C10928a.f28916a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            List<MVTicket> list = (List) this.value_;
            gVar.mo61680D(new C25119e((byte) 12, list.size()));
            for (MVTicket X0 : list) {
                X0.mo25202X0(gVar);
            }
            gVar.mo61681E();
        } else if (i == 2) {
            ((MVMissingPaymentRegistrationSteps) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            gVar.mo61678B(((MVPurchaseVerifacationType) this.value_).getValue());
        } else {
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
            int i = C10928a.f28916a[findByThriftId.ordinal()];
            if (i == 1) {
                C25119e k = gVar.mo61698k();
                ArrayList arrayList = new ArrayList(k.f63395b);
                for (int i2 = 0; i2 < k.f63395b; i2++) {
                    MVTicket mVTicket = new MVTicket();
                    mVTicket.mo25201C1(gVar);
                    arrayList.add(mVTicket);
                }
                gVar.mo61699l();
                return arrayList;
            } else if (i == 2) {
                return C13437d.m33702g(gVar);
            } else {
                if (i == 3) {
                    return MVPurchaseVerifacationType.findByValue(gVar.mo61696i());
                }
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C10928a.f28916a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            List<MVTicket> list = (List) this.value_;
            gVar.mo61680D(new C25119e((byte) 12, list.size()));
            for (MVTicket X0 : list) {
                X0.mo25202X0(gVar);
            }
            gVar.mo61681E();
        } else if (i == 2) {
            ((MVMissingPaymentRegistrationSteps) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            gVar.mo61678B(((MVPurchaseVerifacationType) this.value_).getValue());
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }
}
