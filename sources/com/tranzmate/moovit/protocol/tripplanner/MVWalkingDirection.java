package com.tranzmate.moovit.protocol.tripplanner;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.protocol.TProtocolException;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import xi0.C25276a;

public class MVWalkingDirection extends TUnion<MVWalkingDirection, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f30286c = new C17394d0("MVWalkingDirection");

    /* renamed from: d */
    public static final C25113c f30287d = new C25113c("relative", (byte) 8, 1);

    /* renamed from: e */
    public static final C25113c f30288e = new C25113c("absolute", (byte) 8, 2);

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30289f;

    public enum _Fields implements C25085c {
        RELATIVE(1, "relative"),
        ABSOLUTE(2, "absolute");
        
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
                return RELATIVE;
            }
            if (i != 2) {
                return null;
            }
            return ABSOLUTE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection$a */
    public static /* synthetic */ class C11734a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30290a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection$_Fields[] r0 = com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30290a = r0
                com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection._Fields.RELATIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30290a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection$_Fields r1 = com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection._Fields.ABSOLUTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tripplanner.MVWalkingDirection.C11734a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RELATIVE, new FieldMetaData("relative", (byte) 3, new EnumMetaData(MVRelativeDirection.class)));
        enumMap.put(_Fields.ABSOLUTE, new FieldMetaData("absolute", (byte) 3, new EnumMetaData(MVAbsoluteDirection.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30289f = unmodifiableMap;
        FieldMetaData.m61947a(MVWalkingDirection.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static MVWalkingDirection m30918k(MVAbsoluteDirection mVAbsoluteDirection) {
        MVWalkingDirection mVWalkingDirection = new MVWalkingDirection();
        mVAbsoluteDirection.getClass();
        mVWalkingDirection.setField_ = _Fields.ABSOLUTE;
        mVWalkingDirection.value_ = mVAbsoluteDirection;
        return mVWalkingDirection;
    }

    /* renamed from: l */
    public static C25113c m30919l(_Fields _fields) {
        int i = C11734a.f30290a[_fields.ordinal()];
        if (i == 1) {
            return f30287d;
        }
        if (i == 2) {
            return f30288e;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
    }

    /* renamed from: m */
    public static MVWalkingDirection m30920m(MVRelativeDirection mVRelativeDirection) {
        MVWalkingDirection mVWalkingDirection = new MVWalkingDirection();
        mVRelativeDirection.getClass();
        mVWalkingDirection.setField_ = _Fields.RELATIVE;
        mVWalkingDirection.value_ = mVRelativeDirection;
        return mVWalkingDirection;
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
        return m30919l((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVWalkingDirection mVWalkingDirection = (MVWalkingDirection) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVWalkingDirection.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVWalkingDirection.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVWalkingDirection mVWalkingDirection;
        if (!(obj instanceof MVWalkingDirection) || (mVWalkingDirection = (MVWalkingDirection) obj) == null || this.setField_ != mVWalkingDirection.setField_ || !this.value_.equals(mVWalkingDirection.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f30286c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C11734a.f30290a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 8) {
                    return MVRelativeDirection.findByValue(gVar.mo61696i());
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 8) {
                    return MVAbsoluteDirection.findByValue(gVar.mo61696i());
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
        int i = C11734a.f30290a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            gVar.mo61678B(((MVRelativeDirection) this.value_).getValue());
        } else if (i == 2) {
            gVar.mo61678B(((MVAbsoluteDirection) this.value_).getValue());
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
            int i = C11734a.f30290a[findByThriftId.ordinal()];
            if (i == 1) {
                return MVRelativeDirection.findByValue(gVar.mo61696i());
            }
            if (i == 2) {
                return MVAbsoluteDirection.findByValue(gVar.mo61696i());
            }
            throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
        }
        throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C11734a.f30290a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            gVar.mo61678B(((MVRelativeDirection) this.value_).getValue());
        } else if (i == 2) {
            gVar.mo61678B(((MVAbsoluteDirection) this.value_).getValue());
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }
}
