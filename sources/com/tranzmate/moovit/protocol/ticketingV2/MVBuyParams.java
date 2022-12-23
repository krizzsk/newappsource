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

public class MVBuyParams extends TUnion<MVBuyParams, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f28686c = new C17394d0("MVBuyParams");

    /* renamed from: d */
    public static final C25113c f28687d = new C25113c("masabi", (byte) 12, 1);

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28688e;

    public enum _Fields implements C25085c {
        MASABI(1, "masabi");
        
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
            return MASABI;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVBuyParams$a */
    public static /* synthetic */ class C10785a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28689a;

        static {
            int[] iArr = new int[_Fields.values().length];
            f28689a = iArr;
            try {
                iArr[_Fields.MASABI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MASABI, new FieldMetaData("masabi", (byte) 3, new StructMetaData(MVMasabiBuyRequest.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28688e = unmodifiableMap;
        FieldMetaData.m61947a(MVBuyParams.class, unmodifiableMap);
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
        if (C10785a.f28689a[_fields.ordinal()] == 1) {
            return f28687d;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
    }

    public final int compareTo(Object obj) {
        MVBuyParams mVBuyParams = (MVBuyParams) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVBuyParams.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVBuyParams.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVBuyParams mVBuyParams;
        if (!(obj instanceof MVBuyParams) || (mVBuyParams = (MVBuyParams) obj) == null || this.setField_ != mVBuyParams.setField_ || !this.value_.equals(mVBuyParams.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f28686c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId == null) {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        } else if (C10785a.f28689a[findByThriftId.ordinal()] == 1) {
            byte b = cVar.f63356b;
            if (b == 12) {
                MVMasabiBuyRequest mVMasabiBuyRequest = new MVMasabiBuyRequest();
                mVMasabiBuyRequest.mo25201C1(gVar);
                return mVMasabiBuyRequest;
            }
            C25122h.m63098a(gVar, b);
            return null;
        } else {
            throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        if (C10785a.f28689a[((_Fields) this.setField_).ordinal()] == 1) {
            ((MVMasabiBuyRequest) this.value_).mo25202X0(gVar);
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
        } else if (C10785a.f28689a[findByThriftId.ordinal()] == 1) {
            MVMasabiBuyRequest mVMasabiBuyRequest = new MVMasabiBuyRequest();
            mVMasabiBuyRequest.mo25201C1(gVar);
            return mVMasabiBuyRequest;
        } else {
            throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        if (C10785a.f28689a[((_Fields) this.setField_).ordinal()] == 1) {
            ((MVMasabiBuyRequest) this.value_).mo25202X0(gVar);
            return;
        }
        StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
        k.append(this.setField_);
        throw new IllegalStateException(k.toString());
    }
}
