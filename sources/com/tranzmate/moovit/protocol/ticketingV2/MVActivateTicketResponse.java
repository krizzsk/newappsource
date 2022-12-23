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

public class MVActivateTicketResponse extends TUnion<MVActivateTicketResponse, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f28664c = new C17394d0("MVActivateTicketResponse");

    /* renamed from: d */
    public static final C25113c f28665d = new C25113c("ticketInfo", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f28666e = new C25113c("missingActivationInstructions", (byte) 12, 2);

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28667f;

    public enum _Fields implements C25085c {
        TICKET_INFO(1, "ticketInfo"),
        MISSING_ACTIVATION_INSTRUCTIONS(2, "missingActivationInstructions");
        
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
                return TICKET_INFO;
            }
            if (i != 2) {
                return null;
            }
            return MISSING_ACTIVATION_INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketResponse$a */
    public static /* synthetic */ class C10768a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28668a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketResponse$_Fields[] r0 = com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketResponse._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28668a = r0
                com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketResponse$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketResponse._Fields.TICKET_INFO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28668a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketResponse$_Fields r1 = com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketResponse._Fields.MISSING_ACTIVATION_INSTRUCTIONS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketResponse.C10768a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TICKET_INFO, new FieldMetaData("ticketInfo", (byte) 3, new StructMetaData(MVTicketActivationResponseInfo.class)));
        enumMap.put(_Fields.MISSING_ACTIVATION_INSTRUCTIONS, new FieldMetaData("missingActivationInstructions", (byte) 3, new StructMetaData(MVMissingTicketActivationInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28667f = unmodifiableMap;
        FieldMetaData.m61947a(MVActivateTicketResponse.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static C25113c m27516k(_Fields _fields) {
        int i = C10768a.f28668a[_fields.ordinal()];
        if (i == 1) {
            return f28665d;
        }
        if (i == 2) {
            return f28666e;
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
        return m27516k((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVActivateTicketResponse mVActivateTicketResponse = (MVActivateTicketResponse) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVActivateTicketResponse.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVActivateTicketResponse.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVActivateTicketResponse mVActivateTicketResponse;
        if (!(obj instanceof MVActivateTicketResponse) || (mVActivateTicketResponse = (MVActivateTicketResponse) obj) == null || this.setField_ != mVActivateTicketResponse.setField_ || !this.value_.equals(mVActivateTicketResponse.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f28664c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C10768a.f28668a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVTicketActivationResponseInfo mVTicketActivationResponseInfo = new MVTicketActivationResponseInfo();
                    mVTicketActivationResponseInfo.mo25201C1(gVar);
                    return mVTicketActivationResponseInfo;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVMissingTicketActivationInstructions mVMissingTicketActivationInstructions = new MVMissingTicketActivationInstructions();
                    mVMissingTicketActivationInstructions.mo25201C1(gVar);
                    return mVMissingTicketActivationInstructions;
                }
                C25122h.m63098a(gVar, b2);
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
        int i = C10768a.f28668a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVTicketActivationResponseInfo) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMissingTicketActivationInstructions) this.value_).mo25202X0(gVar);
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
            int i = C10768a.f28668a[findByThriftId.ordinal()];
            if (i == 1) {
                MVTicketActivationResponseInfo mVTicketActivationResponseInfo = new MVTicketActivationResponseInfo();
                mVTicketActivationResponseInfo.mo25201C1(gVar);
                return mVTicketActivationResponseInfo;
            } else if (i == 2) {
                MVMissingTicketActivationInstructions mVMissingTicketActivationInstructions = new MVMissingTicketActivationInstructions();
                mVMissingTicketActivationInstructions.mo25201C1(gVar);
                return mVMissingTicketActivationInstructions;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C10768a.f28668a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVTicketActivationResponseInfo) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMissingTicketActivationInstructions) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: l */
    public final MVTicketActivationResponseInfo mo32313l() {
        if (this.setField_ == _Fields.TICKET_INFO) {
            return (MVTicketActivationResponseInfo) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'ticketInfo' because union is currently set to ");
        k.append(m27516k((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }
}
