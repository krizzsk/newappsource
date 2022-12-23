package com.tranzmate.moovit.protocol.mapitems;

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

public class MVCategoryMetaData extends TUnion<MVCategoryMetaData, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f26240c = new C17394d0("MVCategoryMetaData");

    /* renamed from: d */
    public static final C25113c f26241d = new C25113c("basicProviderMetaData", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f26242e = new C25113c("docklessVehicleMetaData", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f26243f = new C25113c("docklessCarMetaData", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f26244g = new C25113c("microMobilityMetaData", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f26245h = new C25113c("directAdMetaData", (byte) 12, 5);

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26246i;

    public enum _Fields implements C25085c {
        BASIC_PROVIDER_META_DATA(1, "basicProviderMetaData"),
        DOCKLESS_VEHICLE_META_DATA(2, "docklessVehicleMetaData"),
        DOCKLESS_CAR_META_DATA(3, "docklessCarMetaData"),
        MICRO_MOBILITY_META_DATA(4, "microMobilityMetaData"),
        DIRECT_AD_META_DATA(5, "directAdMetaData");
        
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
                return BASIC_PROVIDER_META_DATA;
            }
            if (i == 2) {
                return DOCKLESS_VEHICLE_META_DATA;
            }
            if (i == 3) {
                return DOCKLESS_CAR_META_DATA;
            }
            if (i == 4) {
                return MICRO_MOBILITY_META_DATA;
            }
            if (i != 5) {
                return null;
            }
            return DIRECT_AD_META_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$a */
    public static /* synthetic */ class C9052a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26247a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields[] r0 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26247a = r0
                com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.BASIC_PROVIDER_META_DATA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26247a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.DOCKLESS_VEHICLE_META_DATA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26247a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.DOCKLESS_CAR_META_DATA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26247a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.MICRO_MOBILITY_META_DATA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26247a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData$_Fields r1 = com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData._Fields.DIRECT_AD_META_DATA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.mapitems.MVCategoryMetaData.C9052a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.BASIC_PROVIDER_META_DATA, new FieldMetaData("basicProviderMetaData", (byte) 3, new StructMetaData(MVBikeProviderMetaData.class)));
        enumMap.put(_Fields.DOCKLESS_VEHICLE_META_DATA, new FieldMetaData("docklessVehicleMetaData", (byte) 3, new StructMetaData(MVDocklessVehicleProviderMetaData.class)));
        enumMap.put(_Fields.DOCKLESS_CAR_META_DATA, new FieldMetaData("docklessCarMetaData", (byte) 3, new StructMetaData(MVDocklessCarMetaData.class)));
        enumMap.put(_Fields.MICRO_MOBILITY_META_DATA, new FieldMetaData("microMobilityMetaData", (byte) 3, new StructMetaData(MVMicroMobilityMetaData.class)));
        enumMap.put(_Fields.DIRECT_AD_META_DATA, new FieldMetaData("directAdMetaData", (byte) 3, new StructMetaData(MVDirectAdCategoryMetaData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26246i = unmodifiableMap;
        FieldMetaData.m61947a(MVCategoryMetaData.class, unmodifiableMap);
    }

    /* renamed from: l */
    public static C25113c m22078l(_Fields _fields) {
        int i = C9052a.f26247a[_fields.ordinal()];
        if (i == 1) {
            return f26241d;
        }
        if (i == 2) {
            return f26242e;
        }
        if (i == 3) {
            return f26243f;
        }
        if (i == 4) {
            return f26244g;
        }
        if (i == 5) {
            return f26245h;
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
        return m22078l((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVCategoryMetaData mVCategoryMetaData = (MVCategoryMetaData) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVCategoryMetaData.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVCategoryMetaData.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVCategoryMetaData mVCategoryMetaData;
        if (!(obj instanceof MVCategoryMetaData) || (mVCategoryMetaData = (MVCategoryMetaData) obj) == null || this.setField_ != mVCategoryMetaData.setField_ || !this.value_.equals(mVCategoryMetaData.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f26240c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C9052a.f26247a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVBikeProviderMetaData mVBikeProviderMetaData = new MVBikeProviderMetaData();
                    mVBikeProviderMetaData.mo25201C1(gVar);
                    return mVBikeProviderMetaData;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVDocklessVehicleProviderMetaData mVDocklessVehicleProviderMetaData = new MVDocklessVehicleProviderMetaData();
                    mVDocklessVehicleProviderMetaData.mo25201C1(gVar);
                    return mVDocklessVehicleProviderMetaData;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVDocklessCarMetaData mVDocklessCarMetaData = new MVDocklessCarMetaData();
                    mVDocklessCarMetaData.mo25201C1(gVar);
                    return mVDocklessCarMetaData;
                }
                C25122h.m63098a(gVar, b3);
                return null;
            } else if (i == 4) {
                byte b4 = cVar.f63356b;
                if (b4 == 12) {
                    MVMicroMobilityMetaData mVMicroMobilityMetaData = new MVMicroMobilityMetaData();
                    mVMicroMobilityMetaData.mo25201C1(gVar);
                    return mVMicroMobilityMetaData;
                }
                C25122h.m63098a(gVar, b4);
                return null;
            } else if (i == 5) {
                byte b5 = cVar.f63356b;
                if (b5 == 12) {
                    MVDirectAdCategoryMetaData mVDirectAdCategoryMetaData = new MVDirectAdCategoryMetaData();
                    mVDirectAdCategoryMetaData.mo25201C1(gVar);
                    return mVDirectAdCategoryMetaData;
                }
                C25122h.m63098a(gVar, b5);
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
        int i = C9052a.f26247a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVBikeProviderMetaData) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVDocklessVehicleProviderMetaData) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVDocklessCarMetaData) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVMicroMobilityMetaData) this.value_).mo25202X0(gVar);
        } else if (i == 5) {
            ((MVDirectAdCategoryMetaData) this.value_).mo25202X0(gVar);
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
            int i = C9052a.f26247a[findByThriftId.ordinal()];
            if (i == 1) {
                MVBikeProviderMetaData mVBikeProviderMetaData = new MVBikeProviderMetaData();
                mVBikeProviderMetaData.mo25201C1(gVar);
                return mVBikeProviderMetaData;
            } else if (i == 2) {
                MVDocklessVehicleProviderMetaData mVDocklessVehicleProviderMetaData = new MVDocklessVehicleProviderMetaData();
                mVDocklessVehicleProviderMetaData.mo25201C1(gVar);
                return mVDocklessVehicleProviderMetaData;
            } else if (i == 3) {
                MVDocklessCarMetaData mVDocklessCarMetaData = new MVDocklessCarMetaData();
                mVDocklessCarMetaData.mo25201C1(gVar);
                return mVDocklessCarMetaData;
            } else if (i == 4) {
                MVMicroMobilityMetaData mVMicroMobilityMetaData = new MVMicroMobilityMetaData();
                mVMicroMobilityMetaData.mo25201C1(gVar);
                return mVMicroMobilityMetaData;
            } else if (i == 5) {
                MVDirectAdCategoryMetaData mVDirectAdCategoryMetaData = new MVDirectAdCategoryMetaData();
                mVDirectAdCategoryMetaData.mo25201C1(gVar);
                return mVDirectAdCategoryMetaData;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C9052a.f26247a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVBikeProviderMetaData) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVDocklessVehicleProviderMetaData) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVDocklessCarMetaData) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVMicroMobilityMetaData) this.value_).mo25202X0(gVar);
        } else if (i == 5) {
            ((MVDirectAdCategoryMetaData) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: k */
    public final MVDocklessVehicleProviderMetaData mo28210k() {
        if (this.setField_ == _Fields.DOCKLESS_VEHICLE_META_DATA) {
            return (MVDocklessVehicleProviderMetaData) this.value_;
        }
        StringBuilder k = C13555b.m33972k("Cannot get field 'docklessVehicleMetaData' because union is currently set to ");
        k.append(m22078l((_Fields) this.setField_).f63355a);
        throw new RuntimeException(k.toString());
    }
}
