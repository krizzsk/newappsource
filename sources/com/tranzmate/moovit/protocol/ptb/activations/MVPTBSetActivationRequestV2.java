package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.usebutton.sdk.internal.api.AppActionRequest;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVPTBSetActivationRequestV2 implements TBase<MVPTBSetActivationRequestV2, _Fields>, Serializable, Cloneable, Comparable<MVPTBSetActivationRequestV2> {

    /* renamed from: b */
    public static final C25113c f27958b = new C25113c(AppActionRequest.KEY_CONTEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27959c = new C25113c("scanLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27960d = new C25113c("fareInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27961e = new C25113c("regionPrice", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27962f = new C25113c("numberOfTickets", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f27963g = new C25113c("appOriginType", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f27964h = new C25113c("lineId", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f27965i = new C25113c("destinationStopId", (byte) 8, 8);

    /* renamed from: j */
    public static final HashMap f27966j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f27967k;
    private byte __isset_bitfield = 0;
    public MVPTBAppOriginType appOriginType;
    public String context;
    public int destinationStopId;
    public MVPTBFareInfo fareInfo;
    public int lineId;
    public int numberOfTickets;
    private _Fields[] optionals = {_Fields.APP_ORIGIN_TYPE, _Fields.LINE_ID, _Fields.DESTINATION_STOP_ID};
    public MVPTBRegionPrice regionPrice;
    public MVLatLon scanLocation;

    public enum _Fields implements C25085c {
        CONTEXT(1, AppActionRequest.KEY_CONTEXT),
        SCAN_LOCATION(2, "scanLocation"),
        FARE_INFO(3, "fareInfo"),
        REGION_PRICE(4, "regionPrice"),
        NUMBER_OF_TICKETS(5, "numberOfTickets"),
        APP_ORIGIN_TYPE(6, "appOriginType"),
        LINE_ID(7, "lineId"),
        DESTINATION_STOP_ID(8, "destinationStopId");
        
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
                    return CONTEXT;
                case 2:
                    return SCAN_LOCATION;
                case 3:
                    return FARE_INFO;
                case 4:
                    return REGION_PRICE;
                case 5:
                    return NUMBER_OF_TICKETS;
                case 6:
                    return APP_ORIGIN_TYPE;
                case 7:
                    return LINE_ID;
                case 8:
                    return DESTINATION_STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationRequestV2$a */
    public static class C10258a extends C25239c<MVPTBSetActivationRequestV2> {
        public C10258a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivationPrice mVPTBActivationPrice;
            MVPTBSetActivationRequestV2 mVPTBSetActivationRequestV2 = (MVPTBSetActivationRequestV2) tBase;
            MVPTBRegionPrice mVPTBRegionPrice = mVPTBSetActivationRequestV2.regionPrice;
            if (!(mVPTBRegionPrice == null || (mVPTBActivationPrice = mVPTBRegionPrice.activationPrice) == null)) {
                mVPTBActivationPrice.mo30836i();
            }
            C25113c cVar = MVPTBSetActivationRequestV2.f27958b;
            gVar.mo61687K();
            if (mVPTBSetActivationRequestV2.context != null) {
                gVar.mo61711x(MVPTBSetActivationRequestV2.f27958b);
                gVar.mo61686J(mVPTBSetActivationRequestV2.context);
                gVar.mo61712y();
            }
            if (mVPTBSetActivationRequestV2.scanLocation != null) {
                gVar.mo61711x(MVPTBSetActivationRequestV2.f27959c);
                mVPTBSetActivationRequestV2.scanLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBSetActivationRequestV2.fareInfo != null) {
                gVar.mo61711x(MVPTBSetActivationRequestV2.f27960d);
                mVPTBSetActivationRequestV2.fareInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBSetActivationRequestV2.regionPrice != null) {
                gVar.mo61711x(MVPTBSetActivationRequestV2.f27961e);
                mVPTBSetActivationRequestV2.regionPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPTBSetActivationRequestV2.f27962f);
            gVar.mo61678B(mVPTBSetActivationRequestV2.numberOfTickets);
            gVar.mo61712y();
            if (mVPTBSetActivationRequestV2.appOriginType != null && mVPTBSetActivationRequestV2.mo31066f()) {
                gVar.mo61711x(MVPTBSetActivationRequestV2.f27963g);
                gVar.mo61678B(mVPTBSetActivationRequestV2.appOriginType.getValue());
                gVar.mo61712y();
            }
            if (mVPTBSetActivationRequestV2.mo31071j()) {
                gVar.mo61711x(MVPTBSetActivationRequestV2.f27964h);
                gVar.mo61678B(mVPTBSetActivationRequestV2.lineId);
                gVar.mo61712y();
            }
            if (mVPTBSetActivationRequestV2.mo31068h()) {
                gVar.mo61711x(MVPTBSetActivationRequestV2.f27965i);
                gVar.mo61678B(mVPTBSetActivationRequestV2.destinationStopId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBActivationPrice mVPTBActivationPrice;
            MVPTBSetActivationRequestV2 mVPTBSetActivationRequestV2 = (MVPTBSetActivationRequestV2) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPTBRegionPrice mVPTBRegionPrice = mVPTBSetActivationRequestV2.regionPrice;
                    if (mVPTBRegionPrice != null && (mVPTBActivationPrice = mVPTBRegionPrice.activationPrice) != null) {
                        mVPTBActivationPrice.mo30836i();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBSetActivationRequestV2.context = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon = new MVLatLon();
                            mVPTBSetActivationRequestV2.scanLocation = mVLatLon;
                            mVLatLon.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPTBFareInfo mVPTBFareInfo = new MVPTBFareInfo();
                            mVPTBSetActivationRequestV2.fareInfo = mVPTBFareInfo;
                            mVPTBFareInfo.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPTBRegionPrice mVPTBRegionPrice2 = new MVPTBRegionPrice();
                            mVPTBSetActivationRequestV2.regionPrice = mVPTBRegionPrice2;
                            mVPTBRegionPrice2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBSetActivationRequestV2.numberOfTickets = gVar.mo61696i();
                            mVPTBSetActivationRequestV2.mo31077q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBSetActivationRequestV2.appOriginType = MVPTBAppOriginType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBSetActivationRequestV2.lineId = gVar.mo61696i();
                            mVPTBSetActivationRequestV2.mo31076p();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPTBSetActivationRequestV2.destinationStopId = gVar.mo61696i();
                            mVPTBSetActivationRequestV2.mo31075o();
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationRequestV2$b */
    public static class C10259b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10258a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationRequestV2$c */
    public static class C10260c extends C25240d<MVPTBSetActivationRequestV2> {
        public C10260c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationRequestV2 mVPTBSetActivationRequestV2 = (MVPTBSetActivationRequestV2) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBSetActivationRequestV2.mo31067g()) {
                bitSet.set(0);
            }
            if (mVPTBSetActivationRequestV2.mo31074m()) {
                bitSet.set(1);
            }
            if (mVPTBSetActivationRequestV2.mo31070i()) {
                bitSet.set(2);
            }
            if (mVPTBSetActivationRequestV2.mo31073l()) {
                bitSet.set(3);
            }
            if (mVPTBSetActivationRequestV2.mo31072k()) {
                bitSet.set(4);
            }
            if (mVPTBSetActivationRequestV2.mo31066f()) {
                bitSet.set(5);
            }
            if (mVPTBSetActivationRequestV2.mo31071j()) {
                bitSet.set(6);
            }
            if (mVPTBSetActivationRequestV2.mo31068h()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVPTBSetActivationRequestV2.mo31067g()) {
                jVar.mo61686J(mVPTBSetActivationRequestV2.context);
            }
            if (mVPTBSetActivationRequestV2.mo31074m()) {
                mVPTBSetActivationRequestV2.scanLocation.mo25202X0(jVar);
            }
            if (mVPTBSetActivationRequestV2.mo31070i()) {
                mVPTBSetActivationRequestV2.fareInfo.mo25202X0(jVar);
            }
            if (mVPTBSetActivationRequestV2.mo31073l()) {
                mVPTBSetActivationRequestV2.regionPrice.mo25202X0(jVar);
            }
            if (mVPTBSetActivationRequestV2.mo31072k()) {
                jVar.mo61678B(mVPTBSetActivationRequestV2.numberOfTickets);
            }
            if (mVPTBSetActivationRequestV2.mo31066f()) {
                jVar.mo61678B(mVPTBSetActivationRequestV2.appOriginType.getValue());
            }
            if (mVPTBSetActivationRequestV2.mo31071j()) {
                jVar.mo61678B(mVPTBSetActivationRequestV2.lineId);
            }
            if (mVPTBSetActivationRequestV2.mo31068h()) {
                jVar.mo61678B(mVPTBSetActivationRequestV2.destinationStopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationRequestV2 mVPTBSetActivationRequestV2 = (MVPTBSetActivationRequestV2) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVPTBSetActivationRequestV2.context = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPTBSetActivationRequestV2.scanLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVPTBFareInfo mVPTBFareInfo = new MVPTBFareInfo();
                mVPTBSetActivationRequestV2.fareInfo = mVPTBFareInfo;
                mVPTBFareInfo.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVPTBRegionPrice mVPTBRegionPrice = new MVPTBRegionPrice();
                mVPTBSetActivationRequestV2.regionPrice = mVPTBRegionPrice;
                mVPTBRegionPrice.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVPTBSetActivationRequestV2.numberOfTickets = jVar.mo61696i();
                mVPTBSetActivationRequestV2.mo31077q();
            }
            if (T.get(5)) {
                mVPTBSetActivationRequestV2.appOriginType = MVPTBAppOriginType.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                mVPTBSetActivationRequestV2.lineId = jVar.mo61696i();
                mVPTBSetActivationRequestV2.mo31076p();
            }
            if (T.get(7)) {
                mVPTBSetActivationRequestV2.destinationStopId = jVar.mo61696i();
                mVPTBSetActivationRequestV2.mo31075o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationRequestV2$d */
    public static class C10261d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10260c(0);
        }
    }

    static {
        new C17394d0("MVPTBSetActivationRequestV2");
        HashMap hashMap = new HashMap();
        f27966j = hashMap;
        hashMap.put(C25239c.class, new C10259b());
        hashMap.put(C25240d.class, new C10261d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT, new FieldMetaData(AppActionRequest.KEY_CONTEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SCAN_LOCATION, new FieldMetaData("scanLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.FARE_INFO, new FieldMetaData("fareInfo", (byte) 3, new StructMetaData(MVPTBFareInfo.class)));
        enumMap.put(_Fields.REGION_PRICE, new FieldMetaData("regionPrice", (byte) 3, new StructMetaData(MVPTBRegionPrice.class)));
        enumMap.put(_Fields.NUMBER_OF_TICKETS, new FieldMetaData("numberOfTickets", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.APP_ORIGIN_TYPE, new FieldMetaData("appOriginType", (byte) 2, new EnumMetaData(MVPTBAppOriginType.class)));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DESTINATION_STOP_ID, new FieldMetaData("destinationStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27967k = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBSetActivationRequestV2.class, unmodifiableMap);
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
        ((C25238b) f27966j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27966j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVPTBSetActivationRequestV2 mVPTBSetActivationRequestV2 = (MVPTBSetActivationRequestV2) obj;
        if (!getClass().equals(mVPTBSetActivationRequestV2.getClass())) {
            return getClass().getName().compareTo(mVPTBSetActivationRequestV2.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31067g()).compareTo(Boolean.valueOf(mVPTBSetActivationRequestV2.mo31067g()));
        if (compareTo != 0 || ((mo31067g() && (compareTo = this.context.compareTo(mVPTBSetActivationRequestV2.context)) != 0) || (compareTo = Boolean.valueOf(mo31074m()).compareTo(Boolean.valueOf(mVPTBSetActivationRequestV2.mo31074m()))) != 0 || ((mo31074m() && (compareTo = this.scanLocation.compareTo(mVPTBSetActivationRequestV2.scanLocation)) != 0) || (compareTo = Boolean.valueOf(mo31070i()).compareTo(Boolean.valueOf(mVPTBSetActivationRequestV2.mo31070i()))) != 0 || ((mo31070i() && (compareTo = this.fareInfo.compareTo(mVPTBSetActivationRequestV2.fareInfo)) != 0) || (compareTo = Boolean.valueOf(mo31073l()).compareTo(Boolean.valueOf(mVPTBSetActivationRequestV2.mo31073l()))) != 0 || ((mo31073l() && (compareTo = this.regionPrice.compareTo(mVPTBSetActivationRequestV2.regionPrice)) != 0) || (compareTo = Boolean.valueOf(mo31072k()).compareTo(Boolean.valueOf(mVPTBSetActivationRequestV2.mo31072k()))) != 0 || ((mo31072k() && (compareTo = C25082a.m62839c(this.numberOfTickets, mVPTBSetActivationRequestV2.numberOfTickets)) != 0) || (compareTo = Boolean.valueOf(mo31066f()).compareTo(Boolean.valueOf(mVPTBSetActivationRequestV2.mo31066f()))) != 0 || ((mo31066f() && (compareTo = this.appOriginType.compareTo(mVPTBSetActivationRequestV2.appOriginType)) != 0) || (compareTo = Boolean.valueOf(mo31071j()).compareTo(Boolean.valueOf(mVPTBSetActivationRequestV2.mo31071j()))) != 0 || ((mo31071j() && (compareTo = C25082a.m62839c(this.lineId, mVPTBSetActivationRequestV2.lineId)) != 0) || (compareTo = Boolean.valueOf(mo31068h()).compareTo(Boolean.valueOf(mVPTBSetActivationRequestV2.mo31068h()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo31068h() || (c = C25082a.m62839c(this.destinationStopId, mVPTBSetActivationRequestV2.destinationStopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBSetActivationRequestV2)) {
            return false;
        }
        MVPTBSetActivationRequestV2 mVPTBSetActivationRequestV2 = (MVPTBSetActivationRequestV2) obj;
        boolean g = mo31067g();
        boolean g2 = mVPTBSetActivationRequestV2.mo31067g();
        if ((g || g2) && (!g || !g2 || !this.context.equals(mVPTBSetActivationRequestV2.context))) {
            return false;
        }
        boolean m = mo31074m();
        boolean m2 = mVPTBSetActivationRequestV2.mo31074m();
        if ((m || m2) && (!m || !m2 || !this.scanLocation.mo26290a(mVPTBSetActivationRequestV2.scanLocation))) {
            return false;
        }
        boolean i = mo31070i();
        boolean i2 = mVPTBSetActivationRequestV2.mo31070i();
        if ((i || i2) && (!i || !i2 || !this.fareInfo.mo30924a(mVPTBSetActivationRequestV2.fareInfo))) {
            return false;
        }
        boolean l = mo31073l();
        boolean l2 = mVPTBSetActivationRequestV2.mo31073l();
        if (((l || l2) && (!l || !l2 || !this.regionPrice.mo31038a(mVPTBSetActivationRequestV2.regionPrice))) || this.numberOfTickets != mVPTBSetActivationRequestV2.numberOfTickets) {
            return false;
        }
        boolean f = mo31066f();
        boolean f2 = mVPTBSetActivationRequestV2.mo31066f();
        if ((f || f2) && (!f || !f2 || !this.appOriginType.equals(mVPTBSetActivationRequestV2.appOriginType))) {
            return false;
        }
        boolean j = mo31071j();
        boolean j2 = mVPTBSetActivationRequestV2.mo31071j();
        if ((j || j2) && (!j || !j2 || this.lineId != mVPTBSetActivationRequestV2.lineId)) {
            return false;
        }
        boolean h = mo31068h();
        boolean h2 = mVPTBSetActivationRequestV2.mo31068h();
        if ((h || h2) && (!h || !h2 || this.destinationStopId != mVPTBSetActivationRequestV2.destinationStopId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31066f() {
        return this.appOriginType != null;
    }

    /* renamed from: g */
    public final boolean mo31067g() {
        return this.context != null;
    }

    /* renamed from: h */
    public final boolean mo31068h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31070i() {
        return this.fareInfo != null;
    }

    /* renamed from: j */
    public final boolean mo31071j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo31072k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final boolean mo31073l() {
        return this.regionPrice != null;
    }

    /* renamed from: m */
    public final boolean mo31074m() {
        return this.scanLocation != null;
    }

    /* renamed from: o */
    public final void mo31075o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: p */
    public final void mo31076p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: q */
    public final void mo31077q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBSetActivationRequestV2(", "context:");
        String str = this.context;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("scanLocation:");
        MVLatLon mVLatLon = this.scanLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("fareInfo:");
        MVPTBFareInfo mVPTBFareInfo = this.fareInfo;
        if (mVPTBFareInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBFareInfo);
        }
        n.append(", ");
        n.append("regionPrice:");
        MVPTBRegionPrice mVPTBRegionPrice = this.regionPrice;
        if (mVPTBRegionPrice == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPTBRegionPrice);
        }
        n.append(", ");
        n.append("numberOfTickets:");
        n.append(this.numberOfTickets);
        if (mo31066f()) {
            n.append(", ");
            n.append("appOriginType:");
            MVPTBAppOriginType mVPTBAppOriginType = this.appOriginType;
            if (mVPTBAppOriginType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPTBAppOriginType);
            }
        }
        if (mo31071j()) {
            n.append(", ");
            n.append("lineId:");
            n.append(this.lineId);
        }
        if (mo31068h()) {
            n.append(", ");
            n.append("destinationStopId:");
            n.append(this.destinationStopId);
        }
        n.append(")");
        return n.toString();
    }
}
