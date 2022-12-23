package com.tranzmate.moovit.protocol.subscriptions;

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

public class MVStoreProduct extends TUnion<MVStoreProduct, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f28372c = new C17394d0("MVStoreProduct");

    /* renamed from: d */
    public static final C25113c f28373d = new C25113c("google", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f28374e = new C25113c("apple", (byte) 12, 2);

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28375f;

    public enum _Fields implements C25085c {
        GOOGLE(1, "google"),
        APPLE(2, "apple");
        
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
                return GOOGLE;
            }
            if (i != 2) {
                return null;
            }
            return APPLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.subscriptions.MVStoreProduct$a */
    public static /* synthetic */ class C10576a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28376a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.subscriptions.MVStoreProduct$_Fields[] r0 = com.tranzmate.moovit.protocol.subscriptions.MVStoreProduct._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28376a = r0
                com.tranzmate.moovit.protocol.subscriptions.MVStoreProduct$_Fields r1 = com.tranzmate.moovit.protocol.subscriptions.MVStoreProduct._Fields.GOOGLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28376a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.subscriptions.MVStoreProduct$_Fields r1 = com.tranzmate.moovit.protocol.subscriptions.MVStoreProduct._Fields.APPLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.subscriptions.MVStoreProduct.C10576a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GOOGLE, new FieldMetaData("google", (byte) 3, new StructMetaData(MVGoogleProduct.class)));
        enumMap.put(_Fields.APPLE, new FieldMetaData("apple", (byte) 3, new StructMetaData(MVAppleProduct.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28375f = unmodifiableMap;
        FieldMetaData.m61947a(MVStoreProduct.class, unmodifiableMap);
    }

    /* renamed from: l */
    public static C25113c m26876l(_Fields _fields) {
        int i = C10576a.f28376a[_fields.ordinal()];
        if (i == 1) {
            return f28373d;
        }
        if (i == 2) {
            return f28374e;
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
        return m26876l((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVStoreProduct mVStoreProduct = (MVStoreProduct) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVStoreProduct.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVStoreProduct.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MVStoreProduct) {
            return mo31822k((MVStoreProduct) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f28372c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C10576a.f28376a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVGoogleProduct mVGoogleProduct = new MVGoogleProduct();
                    mVGoogleProduct.mo25201C1(gVar);
                    return mVGoogleProduct;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVAppleProduct mVAppleProduct = new MVAppleProduct();
                    mVAppleProduct.mo25201C1(gVar);
                    return mVAppleProduct;
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
        int i = C10576a.f28376a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVGoogleProduct) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVAppleProduct) this.value_).mo25202X0(gVar);
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
            int i = C10576a.f28376a[findByThriftId.ordinal()];
            if (i == 1) {
                MVGoogleProduct mVGoogleProduct = new MVGoogleProduct();
                mVGoogleProduct.mo25201C1(gVar);
                return mVGoogleProduct;
            } else if (i == 2) {
                MVAppleProduct mVAppleProduct = new MVAppleProduct();
                mVAppleProduct.mo25201C1(gVar);
                return mVAppleProduct;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C10576a.f28376a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVGoogleProduct) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVAppleProduct) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: k */
    public final boolean mo31822k(MVStoreProduct mVStoreProduct) {
        if (mVStoreProduct == null || this.setField_ != mVStoreProduct.setField_ || !this.value_.equals(mVStoreProduct.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final MVGoogleProduct mo31823m() {
        if (this.setField_ == _Fields.GOOGLE) {
            return (MVGoogleProduct) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'google' because union is currently set to ");
        k.append(m26876l((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }
}
