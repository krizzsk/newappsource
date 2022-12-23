package com.tranzmate.moovit.protocol.taxi;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
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

public class MVTaxiSuggestRoutes implements TBase<MVTaxiSuggestRoutes, _Fields>, Serializable, Cloneable, Comparable<MVTaxiSuggestRoutes> {

    /* renamed from: b */
    public static final C25113c f28644b = new C25113c("taxiPriceLabel", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28645c = new C25113c("pickupTimeText", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28646d = new C25113c("cta", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28647e = new C25113c("backdropImage", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28648f = new C25113c("futurePickupTimeText", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f28649g = new C25113c("mapMarker", (byte) 12, 6);

    /* renamed from: h */
    public static final HashMap f28650h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28651i;
    public MVImageReferenceWithParams backdropImage;
    public String cta;
    public String futurePickupTimeText;
    public MVImageReferenceWithParams mapMarker;
    private _Fields[] optionals = {_Fields.BACKDROP_IMAGE, _Fields.FUTURE_PICKUP_TIME_TEXT, _Fields.MAP_MARKER};
    public String pickupTimeText;
    public String taxiPriceLabel;

    public enum _Fields implements C25085c {
        TAXI_PRICE_LABEL(1, "taxiPriceLabel"),
        PICKUP_TIME_TEXT(2, "pickupTimeText"),
        CTA(3, "cta"),
        BACKDROP_IMAGE(4, "backdropImage"),
        FUTURE_PICKUP_TIME_TEXT(5, "futurePickupTimeText"),
        MAP_MARKER(6, "mapMarker");
        
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
                    return TAXI_PRICE_LABEL;
                case 2:
                    return PICKUP_TIME_TEXT;
                case 3:
                    return CTA;
                case 4:
                    return BACKDROP_IMAGE;
                case 5:
                    return FUTURE_PICKUP_TIME_TEXT;
                case 6:
                    return MAP_MARKER;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiSuggestRoutes$a */
    public static class C10752a extends C25239c<MVTaxiSuggestRoutes> {
        public C10752a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiSuggestRoutes mVTaxiSuggestRoutes = (MVTaxiSuggestRoutes) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTaxiSuggestRoutes.backdropImage;
            C25113c cVar = MVTaxiSuggestRoutes.f28644b;
            gVar.mo61687K();
            if (mVTaxiSuggestRoutes.taxiPriceLabel != null) {
                gVar.mo61711x(MVTaxiSuggestRoutes.f28644b);
                gVar.mo61686J(mVTaxiSuggestRoutes.taxiPriceLabel);
                gVar.mo61712y();
            }
            if (mVTaxiSuggestRoutes.pickupTimeText != null) {
                gVar.mo61711x(MVTaxiSuggestRoutes.f28645c);
                gVar.mo61686J(mVTaxiSuggestRoutes.pickupTimeText);
                gVar.mo61712y();
            }
            if (mVTaxiSuggestRoutes.cta != null) {
                gVar.mo61711x(MVTaxiSuggestRoutes.f28646d);
                gVar.mo61686J(mVTaxiSuggestRoutes.cta);
                gVar.mo61712y();
            }
            if (mVTaxiSuggestRoutes.backdropImage != null && mVTaxiSuggestRoutes.mo32277f()) {
                gVar.mo61711x(MVTaxiSuggestRoutes.f28647e);
                mVTaxiSuggestRoutes.backdropImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiSuggestRoutes.futurePickupTimeText != null && mVTaxiSuggestRoutes.mo32279h()) {
                gVar.mo61711x(MVTaxiSuggestRoutes.f28648f);
                gVar.mo61686J(mVTaxiSuggestRoutes.futurePickupTimeText);
                gVar.mo61712y();
            }
            if (mVTaxiSuggestRoutes.mapMarker != null && mVTaxiSuggestRoutes.mo32281i()) {
                gVar.mo61711x(MVTaxiSuggestRoutes.f28649g);
                mVTaxiSuggestRoutes.mapMarker.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiSuggestRoutes mVTaxiSuggestRoutes = (MVTaxiSuggestRoutes) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTaxiSuggestRoutes.backdropImage;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiSuggestRoutes.taxiPriceLabel = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiSuggestRoutes.pickupTimeText = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiSuggestRoutes.cta = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVTaxiSuggestRoutes.backdropImage = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVTaxiSuggestRoutes.futurePickupTimeText = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams3 = new MVImageReferenceWithParams();
                            mVTaxiSuggestRoutes.mapMarker = mVImageReferenceWithParams3;
                            mVImageReferenceWithParams3.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiSuggestRoutes$b */
    public static class C10753b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10752a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiSuggestRoutes$c */
    public static class C10754c extends C25240d<MVTaxiSuggestRoutes> {
        public C10754c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiSuggestRoutes mVTaxiSuggestRoutes = (MVTaxiSuggestRoutes) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiSuggestRoutes.mo32283k()) {
                bitSet.set(0);
            }
            if (mVTaxiSuggestRoutes.mo32282j()) {
                bitSet.set(1);
            }
            if (mVTaxiSuggestRoutes.mo32278g()) {
                bitSet.set(2);
            }
            if (mVTaxiSuggestRoutes.mo32277f()) {
                bitSet.set(3);
            }
            if (mVTaxiSuggestRoutes.mo32279h()) {
                bitSet.set(4);
            }
            if (mVTaxiSuggestRoutes.mo32281i()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVTaxiSuggestRoutes.mo32283k()) {
                jVar.mo61686J(mVTaxiSuggestRoutes.taxiPriceLabel);
            }
            if (mVTaxiSuggestRoutes.mo32282j()) {
                jVar.mo61686J(mVTaxiSuggestRoutes.pickupTimeText);
            }
            if (mVTaxiSuggestRoutes.mo32278g()) {
                jVar.mo61686J(mVTaxiSuggestRoutes.cta);
            }
            if (mVTaxiSuggestRoutes.mo32277f()) {
                mVTaxiSuggestRoutes.backdropImage.mo25202X0(jVar);
            }
            if (mVTaxiSuggestRoutes.mo32279h()) {
                jVar.mo61686J(mVTaxiSuggestRoutes.futurePickupTimeText);
            }
            if (mVTaxiSuggestRoutes.mo32281i()) {
                mVTaxiSuggestRoutes.mapMarker.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiSuggestRoutes mVTaxiSuggestRoutes = (MVTaxiSuggestRoutes) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVTaxiSuggestRoutes.taxiPriceLabel = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTaxiSuggestRoutes.pickupTimeText = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTaxiSuggestRoutes.cta = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTaxiSuggestRoutes.backdropImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVTaxiSuggestRoutes.futurePickupTimeText = jVar.mo61704q();
            }
            if (T.get(5)) {
                MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                mVTaxiSuggestRoutes.mapMarker = mVImageReferenceWithParams2;
                mVImageReferenceWithParams2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiSuggestRoutes$d */
    public static class C10755d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10754c(0);
        }
    }

    static {
        new C17394d0("MVTaxiSuggestRoutes");
        HashMap hashMap = new HashMap();
        f28650h = hashMap;
        hashMap.put(C25239c.class, new C10753b());
        hashMap.put(C25240d.class, new C10755d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TAXI_PRICE_LABEL, new FieldMetaData("taxiPriceLabel", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PICKUP_TIME_TEXT, new FieldMetaData("pickupTimeText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CTA, new FieldMetaData("cta", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BACKDROP_IMAGE, new FieldMetaData("backdropImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.FUTURE_PICKUP_TIME_TEXT, new FieldMetaData("futurePickupTimeText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MAP_MARKER, new FieldMetaData("mapMarker", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28651i = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiSuggestRoutes.class, unmodifiableMap);
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

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f28650h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28650h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32274a(MVTaxiSuggestRoutes mVTaxiSuggestRoutes) {
        if (mVTaxiSuggestRoutes == null) {
            return false;
        }
        boolean k = mo32283k();
        boolean k2 = mVTaxiSuggestRoutes.mo32283k();
        if ((k || k2) && (!k || !k2 || !this.taxiPriceLabel.equals(mVTaxiSuggestRoutes.taxiPriceLabel))) {
            return false;
        }
        boolean j = mo32282j();
        boolean j2 = mVTaxiSuggestRoutes.mo32282j();
        if ((j || j2) && (!j || !j2 || !this.pickupTimeText.equals(mVTaxiSuggestRoutes.pickupTimeText))) {
            return false;
        }
        boolean g = mo32278g();
        boolean g2 = mVTaxiSuggestRoutes.mo32278g();
        if ((g || g2) && (!g || !g2 || !this.cta.equals(mVTaxiSuggestRoutes.cta))) {
            return false;
        }
        boolean f = mo32277f();
        boolean f2 = mVTaxiSuggestRoutes.mo32277f();
        if ((f || f2) && (!f || !f2 || !this.backdropImage.mo26245a(mVTaxiSuggestRoutes.backdropImage))) {
            return false;
        }
        boolean h = mo32279h();
        boolean h2 = mVTaxiSuggestRoutes.mo32279h();
        if ((h || h2) && (!h || !h2 || !this.futurePickupTimeText.equals(mVTaxiSuggestRoutes.futurePickupTimeText))) {
            return false;
        }
        boolean i = mo32281i();
        boolean i2 = mVTaxiSuggestRoutes.mo32281i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.mapMarker.mo26245a(mVTaxiSuggestRoutes.mapMarker)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiSuggestRoutes mVTaxiSuggestRoutes = (MVTaxiSuggestRoutes) obj;
        if (!getClass().equals(mVTaxiSuggestRoutes.getClass())) {
            return getClass().getName().compareTo(mVTaxiSuggestRoutes.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32283k()).compareTo(Boolean.valueOf(mVTaxiSuggestRoutes.mo32283k()));
        if (compareTo2 != 0 || ((mo32283k() && (compareTo2 = this.taxiPriceLabel.compareTo(mVTaxiSuggestRoutes.taxiPriceLabel)) != 0) || (compareTo2 = Boolean.valueOf(mo32282j()).compareTo(Boolean.valueOf(mVTaxiSuggestRoutes.mo32282j()))) != 0 || ((mo32282j() && (compareTo2 = this.pickupTimeText.compareTo(mVTaxiSuggestRoutes.pickupTimeText)) != 0) || (compareTo2 = Boolean.valueOf(mo32278g()).compareTo(Boolean.valueOf(mVTaxiSuggestRoutes.mo32278g()))) != 0 || ((mo32278g() && (compareTo2 = this.cta.compareTo(mVTaxiSuggestRoutes.cta)) != 0) || (compareTo2 = Boolean.valueOf(mo32277f()).compareTo(Boolean.valueOf(mVTaxiSuggestRoutes.mo32277f()))) != 0 || ((mo32277f() && (compareTo2 = this.backdropImage.compareTo(mVTaxiSuggestRoutes.backdropImage)) != 0) || (compareTo2 = Boolean.valueOf(mo32279h()).compareTo(Boolean.valueOf(mVTaxiSuggestRoutes.mo32279h()))) != 0 || ((mo32279h() && (compareTo2 = this.futurePickupTimeText.compareTo(mVTaxiSuggestRoutes.futurePickupTimeText)) != 0) || (compareTo2 = Boolean.valueOf(mo32281i()).compareTo(Boolean.valueOf(mVTaxiSuggestRoutes.mo32281i()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo32281i() || (compareTo = this.mapMarker.compareTo(mVTaxiSuggestRoutes.mapMarker)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiSuggestRoutes)) {
            return mo32274a((MVTaxiSuggestRoutes) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32277f() {
        return this.backdropImage != null;
    }

    /* renamed from: g */
    public final boolean mo32278g() {
        return this.cta != null;
    }

    /* renamed from: h */
    public final boolean mo32279h() {
        return this.futurePickupTimeText != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32281i() {
        return this.mapMarker != null;
    }

    /* renamed from: j */
    public final boolean mo32282j() {
        return this.pickupTimeText != null;
    }

    /* renamed from: k */
    public final boolean mo32283k() {
        return this.taxiPriceLabel != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiSuggestRoutes(", "taxiPriceLabel:");
        String str = this.taxiPriceLabel;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("pickupTimeText:");
        String str2 = this.pickupTimeText;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("cta:");
        String str3 = this.cta;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo32277f()) {
            n.append(", ");
            n.append("backdropImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.backdropImage;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo32279h()) {
            n.append(", ");
            n.append("futurePickupTimeText:");
            String str4 = this.futurePickupTimeText;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo32281i()) {
            n.append(", ");
            n.append("mapMarker:");
            MVImageReferenceWithParams mVImageReferenceWithParams2 = this.mapMarker;
            if (mVImageReferenceWithParams2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
