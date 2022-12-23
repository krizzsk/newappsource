package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityActionAdditionalInfo extends TUnion<MVMicroMobilityActionAdditionalInfo, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f26474c = new C17394d0("MVMicroMobilityActionAdditionalInfo");

    /* renamed from: d */
    public static final C25113c f26475d = new C25113c("image", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f26476e = new C25113c("qrCode", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f26477f = new C25113c("rating", (byte) 12, 3);

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26478g;

    public enum _Fields implements C25085c {
        IMAGE(1, "image"),
        QR_CODE(2, "qrCode"),
        RATING(3, "rating");
        
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
                return IMAGE;
            }
            if (i == 2) {
                return QR_CODE;
            }
            if (i != 3) {
                return null;
            }
            return RATING;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo$a */
    public static /* synthetic */ class C9176a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26479a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo$_Fields[] r0 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26479a = r0
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo._Fields.IMAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26479a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo._Fields.QR_CODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26479a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo._Fields.RATING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionAdditionalInfo.C9176a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVMicroMobilityActionImageAdditionalInfo.class)));
        enumMap.put(_Fields.QR_CODE, new FieldMetaData("qrCode", (byte) 3, new StructMetaData(MVMicroMobilityActionQrCodeAdditionalInfo.class)));
        enumMap.put(_Fields.RATING, new FieldMetaData("rating", (byte) 3, new StructMetaData(MVMicroMobilityActionRatingAdditionalInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26478g = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityActionAdditionalInfo.class, unmodifiableMap);
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
        int i = C9176a.f26479a[_fields.ordinal()];
        if (i == 1) {
            return f26475d;
        }
        if (i == 2) {
            return f26476e;
        }
        if (i == 3) {
            return f26477f;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
    }

    public final int compareTo(Object obj) {
        MVMicroMobilityActionAdditionalInfo mVMicroMobilityActionAdditionalInfo = (MVMicroMobilityActionAdditionalInfo) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVMicroMobilityActionAdditionalInfo.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVMicroMobilityActionAdditionalInfo.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVMicroMobilityActionAdditionalInfo mVMicroMobilityActionAdditionalInfo;
        if (!(obj instanceof MVMicroMobilityActionAdditionalInfo) || (mVMicroMobilityActionAdditionalInfo = (MVMicroMobilityActionAdditionalInfo) obj) == null || this.setField_ != mVMicroMobilityActionAdditionalInfo.setField_ || !this.value_.equals(mVMicroMobilityActionAdditionalInfo.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f26474c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C9176a.f26479a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVMicroMobilityActionImageAdditionalInfo mVMicroMobilityActionImageAdditionalInfo = new MVMicroMobilityActionImageAdditionalInfo();
                    mVMicroMobilityActionImageAdditionalInfo.mo25201C1(gVar);
                    return mVMicroMobilityActionImageAdditionalInfo;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVMicroMobilityActionQrCodeAdditionalInfo mVMicroMobilityActionQrCodeAdditionalInfo = new MVMicroMobilityActionQrCodeAdditionalInfo();
                    mVMicroMobilityActionQrCodeAdditionalInfo.mo25201C1(gVar);
                    return mVMicroMobilityActionQrCodeAdditionalInfo;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVMicroMobilityActionRatingAdditionalInfo mVMicroMobilityActionRatingAdditionalInfo = new MVMicroMobilityActionRatingAdditionalInfo();
                    mVMicroMobilityActionRatingAdditionalInfo.mo25201C1(gVar);
                    return mVMicroMobilityActionRatingAdditionalInfo;
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
        int i = C9176a.f26479a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVMicroMobilityActionImageAdditionalInfo) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMicroMobilityActionQrCodeAdditionalInfo) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVMicroMobilityActionRatingAdditionalInfo) this.value_).mo25202X0(gVar);
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
            int i = C9176a.f26479a[findByThriftId.ordinal()];
            if (i == 1) {
                MVMicroMobilityActionImageAdditionalInfo mVMicroMobilityActionImageAdditionalInfo = new MVMicroMobilityActionImageAdditionalInfo();
                mVMicroMobilityActionImageAdditionalInfo.mo25201C1(gVar);
                return mVMicroMobilityActionImageAdditionalInfo;
            } else if (i == 2) {
                MVMicroMobilityActionQrCodeAdditionalInfo mVMicroMobilityActionQrCodeAdditionalInfo = new MVMicroMobilityActionQrCodeAdditionalInfo();
                mVMicroMobilityActionQrCodeAdditionalInfo.mo25201C1(gVar);
                return mVMicroMobilityActionQrCodeAdditionalInfo;
            } else if (i == 3) {
                MVMicroMobilityActionRatingAdditionalInfo mVMicroMobilityActionRatingAdditionalInfo = new MVMicroMobilityActionRatingAdditionalInfo();
                mVMicroMobilityActionRatingAdditionalInfo.mo25201C1(gVar);
                return mVMicroMobilityActionRatingAdditionalInfo;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C9176a.f26479a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVMicroMobilityActionImageAdditionalInfo) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMicroMobilityActionQrCodeAdditionalInfo) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVMicroMobilityActionRatingAdditionalInfo) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }
}
