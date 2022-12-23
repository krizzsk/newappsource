package com.tranzmate.moovit.protocol.common;

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

public class MVUserReportCategoryType extends TUnion<MVUserReportCategoryType, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f25163c = new C17394d0("MVUserReportCategoryType");

    /* renamed from: d */
    public static final C25113c f25164d = new C25113c("stopCateogry", (byte) 8, 1);

    /* renamed from: e */
    public static final C25113c f25165e = new C25113c("lineCategory", (byte) 8, 2);

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25166f;

    public enum _Fields implements C25085c {
        STOP_CATEOGRY(1, "stopCateogry"),
        LINE_CATEGORY(2, "lineCategory");
        
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
                return STOP_CATEOGRY;
            }
            if (i != 2) {
                return null;
            }
            return LINE_CATEGORY;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVUserReportCategoryType$a */
    public static /* synthetic */ class C8508a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25167a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.common.MVUserReportCategoryType$_Fields[] r0 = com.tranzmate.moovit.protocol.common.MVUserReportCategoryType._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25167a = r0
                com.tranzmate.moovit.protocol.common.MVUserReportCategoryType$_Fields r1 = com.tranzmate.moovit.protocol.common.MVUserReportCategoryType._Fields.STOP_CATEOGRY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25167a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.common.MVUserReportCategoryType$_Fields r1 = com.tranzmate.moovit.protocol.common.MVUserReportCategoryType._Fields.LINE_CATEGORY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.common.MVUserReportCategoryType.C8508a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_CATEOGRY, new FieldMetaData("stopCateogry", (byte) 3, new EnumMetaData(MVUserReportStopCategoryType.class)));
        enumMap.put(_Fields.LINE_CATEGORY, new FieldMetaData("lineCategory", (byte) 3, new EnumMetaData(MVUserReportLineCategoryType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25166f = unmodifiableMap;
        FieldMetaData.m61947a(MVUserReportCategoryType.class, unmodifiableMap);
    }

    /* renamed from: l */
    public static C25113c m19933l(_Fields _fields) {
        int i = C8508a.f25167a[_fields.ordinal()];
        if (i == 1) {
            return f25164d;
        }
        if (i == 2) {
            return f25165e;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
    }

    /* renamed from: o */
    public static MVUserReportCategoryType m19934o(MVUserReportLineCategoryType mVUserReportLineCategoryType) {
        MVUserReportCategoryType mVUserReportCategoryType = new MVUserReportCategoryType();
        mVUserReportLineCategoryType.getClass();
        mVUserReportCategoryType.setField_ = _Fields.LINE_CATEGORY;
        mVUserReportCategoryType.value_ = mVUserReportLineCategoryType;
        return mVUserReportCategoryType;
    }

    /* renamed from: p */
    public static MVUserReportCategoryType m19935p(MVUserReportStopCategoryType mVUserReportStopCategoryType) {
        MVUserReportCategoryType mVUserReportCategoryType = new MVUserReportCategoryType();
        mVUserReportStopCategoryType.getClass();
        mVUserReportCategoryType.setField_ = _Fields.STOP_CATEOGRY;
        mVUserReportCategoryType.value_ = mVUserReportStopCategoryType;
        return mVUserReportCategoryType;
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
        return m19933l((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVUserReportCategoryType mVUserReportCategoryType = (MVUserReportCategoryType) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVUserReportCategoryType.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVUserReportCategoryType.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MVUserReportCategoryType) {
            return mo26435k((MVUserReportCategoryType) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f25163c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C8508a.f25167a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 8) {
                    return MVUserReportStopCategoryType.findByValue(gVar.mo61696i());
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 8) {
                    return MVUserReportLineCategoryType.findByValue(gVar.mo61696i());
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
        int i = C8508a.f25167a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            gVar.mo61678B(((MVUserReportStopCategoryType) this.value_).getValue());
        } else if (i == 2) {
            gVar.mo61678B(((MVUserReportLineCategoryType) this.value_).getValue());
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
            int i = C8508a.f25167a[findByThriftId.ordinal()];
            if (i == 1) {
                return MVUserReportStopCategoryType.findByValue(gVar.mo61696i());
            }
            if (i == 2) {
                return MVUserReportLineCategoryType.findByValue(gVar.mo61696i());
            }
            throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
        }
        throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C8508a.f25167a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            gVar.mo61678B(((MVUserReportStopCategoryType) this.value_).getValue());
        } else if (i == 2) {
            gVar.mo61678B(((MVUserReportLineCategoryType) this.value_).getValue());
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: k */
    public final boolean mo26435k(MVUserReportCategoryType mVUserReportCategoryType) {
        if (mVUserReportCategoryType == null || this.setField_ != mVUserReportCategoryType.setField_ || !this.value_.equals(mVUserReportCategoryType.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final MVUserReportLineCategoryType mo26436m() {
        if (this.setField_ == _Fields.LINE_CATEGORY) {
            return (MVUserReportLineCategoryType) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'lineCategory' because union is currently set to ");
        k.append(m19933l((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }

    /* renamed from: n */
    public final MVUserReportStopCategoryType mo26437n() {
        if (this.setField_ == _Fields.STOP_CATEOGRY) {
            return (MVUserReportStopCategoryType) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'stopCateogry' because union is currently set to ");
        k.append(m19933l((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }
}
