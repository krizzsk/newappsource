package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.Constants;
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

public class MVTodVehicleActionInfo extends TUnion<MVTodVehicleActionInfo, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f29659c = new C17394d0("MVTodVehicleActionInfo");

    /* renamed from: d */
    public static final C25113c f29660d = new C25113c("colorBar", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f29661e = new C25113c(Constants.APPBOY_PUSH_ACCENT_KEY, (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f29662f = new C25113c("audio", (byte) 12, 3);

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29663g;

    public enum _Fields implements C25085c {
        COLOR_BAR(1, "colorBar"),
        AC(2, Constants.APPBOY_PUSH_ACCENT_KEY),
        AUDIO(3, "audio");
        
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
                return COLOR_BAR;
            }
            if (i == 2) {
                return AC;
            }
            if (i != 3) {
                return null;
            }
            return AUDIO;
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

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo$a */
    public static /* synthetic */ class C11369a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29665a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo$_Fields[] r0 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29665a = r0
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo$_Fields r1 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo._Fields.COLOR_BAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29665a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo$_Fields r1 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo._Fields.AC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29665a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo$_Fields r1 = com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo._Fields.AUDIO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo.C11369a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.COLOR_BAR, new FieldMetaData("colorBar", (byte) 3, new StructMetaData(MVTodVehicleColorBar.class)));
        enumMap.put(_Fields.AC, new FieldMetaData(Constants.APPBOY_PUSH_ACCENT_KEY, (byte) 3, new StructMetaData(MVTodVehicleAC.class)));
        enumMap.put(_Fields.AUDIO, new FieldMetaData("audio", (byte) 3, new StructMetaData(MVTodVehicleAudio.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29663g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodVehicleActionInfo.class, unmodifiableMap);
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
        int i = C11369a.f29665a[_fields.ordinal()];
        if (i == 1) {
            return f29660d;
        }
        if (i == 2) {
            return f29661e;
        }
        if (i == 3) {
            return f29662f;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
    }

    public final int compareTo(Object obj) {
        MVTodVehicleActionInfo mVTodVehicleActionInfo = (MVTodVehicleActionInfo) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVTodVehicleActionInfo.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVTodVehicleActionInfo.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVTodVehicleActionInfo mVTodVehicleActionInfo;
        if (!(obj instanceof MVTodVehicleActionInfo) || (mVTodVehicleActionInfo = (MVTodVehicleActionInfo) obj) == null || this.setField_ != mVTodVehicleActionInfo.setField_ || !this.value_.equals(mVTodVehicleActionInfo.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f29659c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C11369a.f29665a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVTodVehicleColorBar mVTodVehicleColorBar = new MVTodVehicleColorBar();
                    mVTodVehicleColorBar.mo25201C1(gVar);
                    return mVTodVehicleColorBar;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVTodVehicleAC mVTodVehicleAC = new MVTodVehicleAC();
                    mVTodVehicleAC.mo25201C1(gVar);
                    return mVTodVehicleAC;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVTodVehicleAudio mVTodVehicleAudio = new MVTodVehicleAudio();
                    mVTodVehicleAudio.mo25201C1(gVar);
                    return mVTodVehicleAudio;
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
        int i = C11369a.f29665a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVTodVehicleColorBar) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVTodVehicleAC) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVTodVehicleAudio) this.value_).mo25202X0(gVar);
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
            int i = C11369a.f29665a[findByThriftId.ordinal()];
            if (i == 1) {
                MVTodVehicleColorBar mVTodVehicleColorBar = new MVTodVehicleColorBar();
                mVTodVehicleColorBar.mo25201C1(gVar);
                return mVTodVehicleColorBar;
            } else if (i == 2) {
                MVTodVehicleAC mVTodVehicleAC = new MVTodVehicleAC();
                mVTodVehicleAC.mo25201C1(gVar);
                return mVTodVehicleAC;
            } else if (i == 3) {
                MVTodVehicleAudio mVTodVehicleAudio = new MVTodVehicleAudio();
                mVTodVehicleAudio.mo25201C1(gVar);
                return mVTodVehicleAudio;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C11369a.f29665a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVTodVehicleColorBar) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVTodVehicleAC) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVTodVehicleAudio) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }
}
