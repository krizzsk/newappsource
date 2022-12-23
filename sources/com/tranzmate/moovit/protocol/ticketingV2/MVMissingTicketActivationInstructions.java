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

public class MVMissingTicketActivationInstructions extends TUnion<MVMissingTicketActivationInstructions, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f28749c = new C17394d0("MVMissingTicketActivationInstructions");

    /* renamed from: d */
    public static final C25113c f28750d = new C25113c("confirmationInstructions", (byte) 12, 1);

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28751e;

    public enum _Fields implements C25085c {
        CONFIRMATION_INSTRUCTIONS(1, "confirmationInstructions");
        
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
            if (i != 1) {
                return null;
            }
            return CONFIRMATION_INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVMissingTicketActivationInstructions$a */
    public static /* synthetic */ class C10831a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28752a;

        static {
            int[] iArr = new int[_Fields.values().length];
            f28752a = iArr;
            try {
                iArr[_Fields.CONFIRMATION_INSTRUCTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONFIRMATION_INSTRUCTIONS, new FieldMetaData("confirmationInstructions", (byte) 3, new StructMetaData(MVMissingTicketActivationConfirmationInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28751e = unmodifiableMap;
        FieldMetaData.m61947a(MVMissingTicketActivationInstructions.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static void m27711k(_Fields _fields) {
        if (C10831a.f28752a[_fields.ordinal()] != 1) {
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
        m27711k((_Fields) cVar);
        return f28750d;
    }

    public final int compareTo(Object obj) {
        MVMissingTicketActivationInstructions mVMissingTicketActivationInstructions = (MVMissingTicketActivationInstructions) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVMissingTicketActivationInstructions.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVMissingTicketActivationInstructions.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVMissingTicketActivationInstructions mVMissingTicketActivationInstructions;
        if (!(obj instanceof MVMissingTicketActivationInstructions) || (mVMissingTicketActivationInstructions = (MVMissingTicketActivationInstructions) obj) == null || this.setField_ != mVMissingTicketActivationInstructions.setField_ || !this.value_.equals(mVMissingTicketActivationInstructions.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f28749c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId == null) {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        } else if (C10831a.f28752a[findByThriftId.ordinal()] == 1) {
            byte b = cVar.f63356b;
            if (b == 12) {
                MVMissingTicketActivationConfirmationInstructions mVMissingTicketActivationConfirmationInstructions = new MVMissingTicketActivationConfirmationInstructions();
                mVMissingTicketActivationConfirmationInstructions.mo25201C1(gVar);
                return mVMissingTicketActivationConfirmationInstructions;
            }
            C25122h.m63098a(gVar, b);
            return null;
        } else {
            throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        if (C10831a.f28752a[((_Fields) this.setField_).ordinal()] == 1) {
            ((MVMissingTicketActivationConfirmationInstructions) this.value_).mo25202X0(gVar);
            return;
        }
        StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
        k.append(this.setField_);
        throw new IllegalStateException(k.toString());
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final Object mo25512i(C25121g gVar, short s) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(s);
        if (findByThriftId == null) {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        } else if (C10831a.f28752a[findByThriftId.ordinal()] == 1) {
            MVMissingTicketActivationConfirmationInstructions mVMissingTicketActivationConfirmationInstructions = new MVMissingTicketActivationConfirmationInstructions();
            mVMissingTicketActivationConfirmationInstructions.mo25201C1(gVar);
            return mVMissingTicketActivationConfirmationInstructions;
        } else {
            throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        if (C10831a.f28752a[((_Fields) this.setField_).ordinal()] == 1) {
            ((MVMissingTicketActivationConfirmationInstructions) this.value_).mo25202X0(gVar);
            return;
        }
        StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
        k.append(this.setField_);
        throw new IllegalStateException(k.toString());
    }
}
