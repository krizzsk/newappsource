package com.tranzmate.moovit.protocol.gtfs;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import p001a0.C0016g;
import p001a0.C0017h;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVBicycleProvider implements TBase<MVBicycleProvider, _Fields>, Serializable, Cloneable, Comparable<MVBicycleProvider> {

    /* renamed from: b */
    public static final C25113c f25680b = new C25113c("providerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25681c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25682d = new C25113c("providerImage", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f25683e = new C25113c("primaryColor", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f25684f = new C25113c("secondaryColor", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f25685g = new C25113c("isRealTimeDataSupported", (byte) 2, 6);

    /* renamed from: h */
    public static final HashMap f25686h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f25687i;
    private byte __isset_bitfield = 0;
    public boolean isRealTimeDataSupported;
    public String name;
    private _Fields[] optionals = {_Fields.PROVIDER_IMAGE};
    public int primaryColor;
    public int providerId;
    public int providerImage;
    public int secondaryColor;

    public enum _Fields implements C25085c {
        PROVIDER_ID(1, "providerId"),
        NAME(2, "name"),
        PROVIDER_IMAGE(3, "providerImage"),
        PRIMARY_COLOR(4, "primaryColor"),
        SECONDARY_COLOR(5, "secondaryColor"),
        IS_REAL_TIME_DATA_SUPPORTED(6, "isRealTimeDataSupported");
        
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
            switch (i) {
                case 1:
                    return PROVIDER_ID;
                case 2:
                    return NAME;
                case 3:
                    return PROVIDER_IMAGE;
                case 4:
                    return PRIMARY_COLOR;
                case 5:
                    return SECONDARY_COLOR;
                case 6:
                    return IS_REAL_TIME_DATA_SUPPORTED;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVBicycleProvider$a */
    public static class C8767a extends C25239c<MVBicycleProvider> {
        public C8767a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBicycleProvider mVBicycleProvider = (MVBicycleProvider) tBase;
            mVBicycleProvider.getClass();
            C25113c cVar = MVBicycleProvider.f25680b;
            gVar.mo61687K();
            gVar.mo61711x(MVBicycleProvider.f25680b);
            gVar.mo61678B(mVBicycleProvider.providerId);
            gVar.mo61712y();
            if (mVBicycleProvider.name != null) {
                gVar.mo61711x(MVBicycleProvider.f25681c);
                gVar.mo61686J(mVBicycleProvider.name);
                gVar.mo61712y();
            }
            if (mVBicycleProvider.mo27317j()) {
                gVar.mo61711x(MVBicycleProvider.f25682d);
                gVar.mo61678B(mVBicycleProvider.providerImage);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVBicycleProvider.f25683e);
            gVar.mo61678B(mVBicycleProvider.primaryColor);
            gVar.mo61712y();
            gVar.mo61711x(MVBicycleProvider.f25684f);
            gVar.mo61678B(mVBicycleProvider.secondaryColor);
            gVar.mo61712y();
            gVar.mo61711x(MVBicycleProvider.f25685g);
            C0017h.m62S(gVar, mVBicycleProvider.isRealTimeDataSupported);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBicycleProvider mVBicycleProvider = (MVBicycleProvider) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVBicycleProvider.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBicycleProvider.providerId = gVar.mo61696i();
                            mVBicycleProvider.mo27321o();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBicycleProvider.name = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBicycleProvider.providerImage = gVar.mo61696i();
                            mVBicycleProvider.mo27322p();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBicycleProvider.primaryColor = gVar.mo61696i();
                            mVBicycleProvider.mo27320m();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBicycleProvider.secondaryColor = gVar.mo61696i();
                            mVBicycleProvider.mo27323q();
                            break;
                        }
                    case 6:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVBicycleProvider.isRealTimeDataSupported = gVar.mo61690c();
                            mVBicycleProvider.mo27319l();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVBicycleProvider$b */
    public static class C8768b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8767a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVBicycleProvider$c */
    public static class C8769c extends C25240d<MVBicycleProvider> {
        public C8769c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVBicycleProvider mVBicycleProvider = (MVBicycleProvider) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVBicycleProvider.mo27316i()) {
                bitSet.set(0);
            }
            if (mVBicycleProvider.mo27313g()) {
                bitSet.set(1);
            }
            if (mVBicycleProvider.mo27317j()) {
                bitSet.set(2);
            }
            if (mVBicycleProvider.mo27314h()) {
                bitSet.set(3);
            }
            if (mVBicycleProvider.mo27318k()) {
                bitSet.set(4);
            }
            if (mVBicycleProvider.mo27312f()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVBicycleProvider.mo27316i()) {
                jVar.mo61678B(mVBicycleProvider.providerId);
            }
            if (mVBicycleProvider.mo27313g()) {
                jVar.mo61686J(mVBicycleProvider.name);
            }
            if (mVBicycleProvider.mo27317j()) {
                jVar.mo61678B(mVBicycleProvider.providerImage);
            }
            if (mVBicycleProvider.mo27314h()) {
                jVar.mo61678B(mVBicycleProvider.primaryColor);
            }
            if (mVBicycleProvider.mo27318k()) {
                jVar.mo61678B(mVBicycleProvider.secondaryColor);
            }
            if (mVBicycleProvider.mo27312f()) {
                jVar.mo61708u(mVBicycleProvider.isRealTimeDataSupported);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVBicycleProvider mVBicycleProvider = (MVBicycleProvider) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVBicycleProvider.providerId = jVar.mo61696i();
                mVBicycleProvider.mo27321o();
            }
            if (T.get(1)) {
                mVBicycleProvider.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVBicycleProvider.providerImage = jVar.mo61696i();
                mVBicycleProvider.mo27322p();
            }
            if (T.get(3)) {
                mVBicycleProvider.primaryColor = jVar.mo61696i();
                mVBicycleProvider.mo27320m();
            }
            if (T.get(4)) {
                mVBicycleProvider.secondaryColor = jVar.mo61696i();
                mVBicycleProvider.mo27323q();
            }
            if (T.get(5)) {
                mVBicycleProvider.isRealTimeDataSupported = jVar.mo61690c();
                mVBicycleProvider.mo27319l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.gtfs.MVBicycleProvider$d */
    public static class C8770d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8769c(0);
        }
    }

    static {
        new C17394d0("MVBicycleProvider");
        HashMap hashMap = new HashMap();
        f25686h = hashMap;
        hashMap.put(C25239c.class, new C8768b());
        hashMap.put(C25240d.class, new C8770d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROVIDER_IMAGE, new FieldMetaData("providerImage", (byte) 2, new FieldValueMetaData((byte) 8, "MVImageReference")));
        enumMap.put(_Fields.PRIMARY_COLOR, new FieldMetaData("primaryColor", (byte) 3, new FieldValueMetaData((byte) 8, "Color")));
        enumMap.put(_Fields.SECONDARY_COLOR, new FieldMetaData("secondaryColor", (byte) 3, new FieldValueMetaData((byte) 8, "Color")));
        enumMap.put(_Fields.IS_REAL_TIME_DATA_SUPPORTED, new FieldMetaData("isRealTimeDataSupported", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25687i = unmodifiableMap;
        FieldMetaData.m61947a(MVBicycleProvider.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f25686h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25686h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVBicycleProvider mVBicycleProvider = (MVBicycleProvider) obj;
        if (!getClass().equals(mVBicycleProvider.getClass())) {
            return getClass().getName().compareTo(mVBicycleProvider.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27316i()).compareTo(Boolean.valueOf(mVBicycleProvider.mo27316i()));
        if (compareTo != 0 || ((mo27316i() && (compareTo = C25082a.m62839c(this.providerId, mVBicycleProvider.providerId)) != 0) || (compareTo = Boolean.valueOf(mo27313g()).compareTo(Boolean.valueOf(mVBicycleProvider.mo27313g()))) != 0 || ((mo27313g() && (compareTo = this.name.compareTo(mVBicycleProvider.name)) != 0) || (compareTo = Boolean.valueOf(mo27317j()).compareTo(Boolean.valueOf(mVBicycleProvider.mo27317j()))) != 0 || ((mo27317j() && (compareTo = C25082a.m62839c(this.providerImage, mVBicycleProvider.providerImage)) != 0) || (compareTo = Boolean.valueOf(mo27314h()).compareTo(Boolean.valueOf(mVBicycleProvider.mo27314h()))) != 0 || ((mo27314h() && (compareTo = C25082a.m62839c(this.primaryColor, mVBicycleProvider.primaryColor)) != 0) || (compareTo = Boolean.valueOf(mo27318k()).compareTo(Boolean.valueOf(mVBicycleProvider.mo27318k()))) != 0 || ((mo27318k() && (compareTo = C25082a.m62839c(this.secondaryColor, mVBicycleProvider.secondaryColor)) != 0) || (compareTo = Boolean.valueOf(mo27312f()).compareTo(Boolean.valueOf(mVBicycleProvider.mo27312f()))) != 0)))))) {
            return compareTo;
        }
        if (!mo27312f() || (l = C25082a.m62848l(this.isRealTimeDataSupported, mVBicycleProvider.isRealTimeDataSupported)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVBicycleProvider)) {
            return false;
        }
        MVBicycleProvider mVBicycleProvider = (MVBicycleProvider) obj;
        if (this.providerId != mVBicycleProvider.providerId) {
            return false;
        }
        boolean g = mo27313g();
        boolean g2 = mVBicycleProvider.mo27313g();
        if ((g || g2) && (!g || !g2 || !this.name.equals(mVBicycleProvider.name))) {
            return false;
        }
        boolean j = mo27317j();
        boolean j2 = mVBicycleProvider.mo27317j();
        if (((!j && !j2) || (j && j2 && this.providerImage == mVBicycleProvider.providerImage)) && this.primaryColor == mVBicycleProvider.primaryColor && this.secondaryColor == mVBicycleProvider.secondaryColor && this.isRealTimeDataSupported == mVBicycleProvider.isRealTimeDataSupported) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo27312f() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: g */
    public final boolean mo27313g() {
        return this.name != null;
    }

    /* renamed from: h */
    public final boolean mo27314h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27316i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo27317j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo27318k() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: l */
    public final void mo27319l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: m */
    public final void mo27320m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo27321o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: p */
    public final void mo27322p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: q */
    public final void mo27323q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVBicycleProvider(", "providerId:");
        C0016g.m42z(n, this.providerId, ", ", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo27317j()) {
            n.append(", ");
            n.append("providerImage:");
            n.append(this.providerImage);
        }
        n.append(", ");
        n.append("primaryColor:");
        C0016g.m42z(n, this.primaryColor, ", ", "secondaryColor:");
        C0016g.m42z(n, this.secondaryColor, ", ", "isRealTimeDataSupported:");
        return C25541a.m63885p(n, this.isRealTimeDataSupported, ")");
    }
}
