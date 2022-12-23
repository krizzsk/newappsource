package com.tranzmate.moovit.protocol.ptb.activations;

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
import p001a0.C0016g;
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

public class MVPTBGetStationInfoResponse implements TBase<MVPTBGetStationInfoResponse, _Fields>, Serializable, Cloneable, Comparable<MVPTBGetStationInfoResponse> {

    /* renamed from: b */
    public static final C25113c f27930b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27931c = new C25113c("stationName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27932d = new C25113c("agencyImage", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27933e = new C25113c("activationPrice", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f27934f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27935g;
    private byte __isset_bitfield = 0;
    public MVPTBActivationPrice activationPrice;
    public MVImageReferenceWithParams agencyImage;
    private _Fields[] optionals = {_Fields.ACTIVATION_PRICE};
    public String stationName;
    public int stopId;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        STATION_NAME(2, "stationName"),
        AGENCY_IMAGE(3, "agencyImage"),
        ACTIVATION_PRICE(4, "activationPrice");
        
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
                return STOP_ID;
            }
            if (i == 2) {
                return STATION_NAME;
            }
            if (i == 3) {
                return AGENCY_IMAGE;
            }
            if (i != 4) {
                return null;
            }
            return ACTIVATION_PRICE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoResponse$a */
    public static class C10234a extends C25239c<MVPTBGetStationInfoResponse> {
        public C10234a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetStationInfoResponse mVPTBGetStationInfoResponse = (MVPTBGetStationInfoResponse) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVPTBGetStationInfoResponse.agencyImage;
            MVPTBActivationPrice mVPTBActivationPrice = mVPTBGetStationInfoResponse.activationPrice;
            if (mVPTBActivationPrice != null) {
                mVPTBActivationPrice.mo30836i();
            }
            C25113c cVar = MVPTBGetStationInfoResponse.f27930b;
            gVar.mo61687K();
            gVar.mo61711x(MVPTBGetStationInfoResponse.f27930b);
            gVar.mo61678B(mVPTBGetStationInfoResponse.stopId);
            gVar.mo61712y();
            if (mVPTBGetStationInfoResponse.stationName != null) {
                gVar.mo61711x(MVPTBGetStationInfoResponse.f27931c);
                gVar.mo61686J(mVPTBGetStationInfoResponse.stationName);
                gVar.mo61712y();
            }
            if (mVPTBGetStationInfoResponse.agencyImage != null) {
                gVar.mo61711x(MVPTBGetStationInfoResponse.f27932d);
                mVPTBGetStationInfoResponse.agencyImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBGetStationInfoResponse.activationPrice != null && mVPTBGetStationInfoResponse.mo31014f()) {
                gVar.mo61711x(MVPTBGetStationInfoResponse.f27933e);
                mVPTBGetStationInfoResponse.activationPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetStationInfoResponse mVPTBGetStationInfoResponse = (MVPTBGetStationInfoResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVPTBActivationPrice mVPTBActivationPrice = new MVPTBActivationPrice();
                                mVPTBGetStationInfoResponse.activationPrice = mVPTBActivationPrice;
                                mVPTBActivationPrice.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVPTBGetStationInfoResponse.agencyImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPTBGetStationInfoResponse.stationName = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPTBGetStationInfoResponse.stopId = gVar.mo61696i();
                    mVPTBGetStationInfoResponse.mo31019j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVImageReferenceWithParams mVImageReferenceWithParams2 = mVPTBGetStationInfoResponse.agencyImage;
            MVPTBActivationPrice mVPTBActivationPrice2 = mVPTBGetStationInfoResponse.activationPrice;
            if (mVPTBActivationPrice2 != null) {
                mVPTBActivationPrice2.mo30836i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoResponse$b */
    public static class C10235b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10234a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoResponse$c */
    public static class C10236c extends C25240d<MVPTBGetStationInfoResponse> {
        public C10236c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetStationInfoResponse mVPTBGetStationInfoResponse = (MVPTBGetStationInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBGetStationInfoResponse.mo31018i()) {
                bitSet.set(0);
            }
            if (mVPTBGetStationInfoResponse.mo31016h()) {
                bitSet.set(1);
            }
            if (mVPTBGetStationInfoResponse.mo31015g()) {
                bitSet.set(2);
            }
            if (mVPTBGetStationInfoResponse.mo31014f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVPTBGetStationInfoResponse.mo31018i()) {
                jVar.mo61678B(mVPTBGetStationInfoResponse.stopId);
            }
            if (mVPTBGetStationInfoResponse.mo31016h()) {
                jVar.mo61686J(mVPTBGetStationInfoResponse.stationName);
            }
            if (mVPTBGetStationInfoResponse.mo31015g()) {
                mVPTBGetStationInfoResponse.agencyImage.mo25202X0(jVar);
            }
            if (mVPTBGetStationInfoResponse.mo31014f()) {
                mVPTBGetStationInfoResponse.activationPrice.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetStationInfoResponse mVPTBGetStationInfoResponse = (MVPTBGetStationInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVPTBGetStationInfoResponse.stopId = jVar.mo61696i();
                mVPTBGetStationInfoResponse.mo31019j();
            }
            if (T.get(1)) {
                mVPTBGetStationInfoResponse.stationName = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVPTBGetStationInfoResponse.agencyImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVPTBActivationPrice mVPTBActivationPrice = new MVPTBActivationPrice();
                mVPTBGetStationInfoResponse.activationPrice = mVPTBActivationPrice;
                mVPTBActivationPrice.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoResponse$d */
    public static class C10237d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10236c(0);
        }
    }

    static {
        new C17394d0("MVPTBGetStationInfoResponse");
        HashMap hashMap = new HashMap();
        f27934f = hashMap;
        hashMap.put(C25239c.class, new C10235b());
        hashMap.put(C25240d.class, new C10237d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STATION_NAME, new FieldMetaData("stationName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_IMAGE, new FieldMetaData("agencyImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.ACTIVATION_PRICE, new FieldMetaData("activationPrice", (byte) 2, new StructMetaData(MVPTBActivationPrice.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27935g = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBGetStationInfoResponse.class, unmodifiableMap);
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
        ((C25238b) f27934f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27934f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBGetStationInfoResponse mVPTBGetStationInfoResponse = (MVPTBGetStationInfoResponse) obj;
        if (!getClass().equals(mVPTBGetStationInfoResponse.getClass())) {
            return getClass().getName().compareTo(mVPTBGetStationInfoResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31018i()).compareTo(Boolean.valueOf(mVPTBGetStationInfoResponse.mo31018i()));
        if (compareTo2 != 0 || ((mo31018i() && (compareTo2 = C25082a.m62839c(this.stopId, mVPTBGetStationInfoResponse.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo31016h()).compareTo(Boolean.valueOf(mVPTBGetStationInfoResponse.mo31016h()))) != 0 || ((mo31016h() && (compareTo2 = this.stationName.compareTo(mVPTBGetStationInfoResponse.stationName)) != 0) || (compareTo2 = Boolean.valueOf(mo31015g()).compareTo(Boolean.valueOf(mVPTBGetStationInfoResponse.mo31015g()))) != 0 || ((mo31015g() && (compareTo2 = this.agencyImage.compareTo(mVPTBGetStationInfoResponse.agencyImage)) != 0) || (compareTo2 = Boolean.valueOf(mo31014f()).compareTo(Boolean.valueOf(mVPTBGetStationInfoResponse.mo31014f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo31014f() || (compareTo = this.activationPrice.compareTo(mVPTBGetStationInfoResponse.activationPrice)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBGetStationInfoResponse)) {
            return false;
        }
        MVPTBGetStationInfoResponse mVPTBGetStationInfoResponse = (MVPTBGetStationInfoResponse) obj;
        if (this.stopId != mVPTBGetStationInfoResponse.stopId) {
            return false;
        }
        boolean h = mo31016h();
        boolean h2 = mVPTBGetStationInfoResponse.mo31016h();
        if ((h || h2) && (!h || !h2 || !this.stationName.equals(mVPTBGetStationInfoResponse.stationName))) {
            return false;
        }
        boolean g = mo31015g();
        boolean g2 = mVPTBGetStationInfoResponse.mo31015g();
        if ((g || g2) && (!g || !g2 || !this.agencyImage.mo26245a(mVPTBGetStationInfoResponse.agencyImage))) {
            return false;
        }
        boolean f = mo31014f();
        boolean f2 = mVPTBGetStationInfoResponse.mo31014f();
        if ((f || f2) && (!f || !f2 || !this.activationPrice.mo30829a(mVPTBGetStationInfoResponse.activationPrice))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31014f() {
        return this.activationPrice != null;
    }

    /* renamed from: g */
    public final boolean mo31015g() {
        return this.agencyImage != null;
    }

    /* renamed from: h */
    public final boolean mo31016h() {
        return this.stationName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31018i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final void mo31019j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBGetStationInfoResponse(", "stopId:");
        C0016g.m42z(n, this.stopId, ", ", "stationName:");
        String str = this.stationName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("agencyImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.agencyImage;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        if (mo31014f()) {
            n.append(", ");
            n.append("activationPrice:");
            MVPTBActivationPrice mVPTBActivationPrice = this.activationPrice;
            if (mVPTBActivationPrice == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPTBActivationPrice);
            }
        }
        n.append(")");
        return n.toString();
    }
}
