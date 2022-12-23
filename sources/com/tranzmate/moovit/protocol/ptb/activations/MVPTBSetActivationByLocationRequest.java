package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.common.MVRouteType;
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

public class MVPTBSetActivationByLocationRequest implements TBase<MVPTBSetActivationByLocationRequest, _Fields>, Serializable, Cloneable, Comparable<MVPTBSetActivationByLocationRequest> {

    /* renamed from: b */
    public static final C25113c f27948b = new C25113c(AppActionRequest.KEY_CONTEXT, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27949c = new C25113c("userLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27950d = new C25113c("numberOfTickets", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f27951e = new C25113c("appOriginType", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f27952f = new C25113c("transitType", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f27953g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27954h;
    private byte __isset_bitfield = 0;
    public MVPTBAppOriginType appOriginType;
    public String context;
    public int numberOfTickets;
    private _Fields[] optionals = {_Fields.APP_ORIGIN_TYPE};
    public MVRouteType transitType;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        CONTEXT(1, AppActionRequest.KEY_CONTEXT),
        USER_LOCATION(2, "userLocation"),
        NUMBER_OF_TICKETS(3, "numberOfTickets"),
        APP_ORIGIN_TYPE(4, "appOriginType"),
        TRANSIT_TYPE(5, "transitType");
        
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
                return CONTEXT;
            }
            if (i == 2) {
                return USER_LOCATION;
            }
            if (i == 3) {
                return NUMBER_OF_TICKETS;
            }
            if (i == 4) {
                return APP_ORIGIN_TYPE;
            }
            if (i != 5) {
                return null;
            }
            return TRANSIT_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationByLocationRequest$a */
    public static class C10250a extends C25239c<MVPTBSetActivationByLocationRequest> {
        public C10250a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationByLocationRequest mVPTBSetActivationByLocationRequest = (MVPTBSetActivationByLocationRequest) tBase;
            MVLatLon mVLatLon = mVPTBSetActivationByLocationRequest.userLocation;
            C25113c cVar = MVPTBSetActivationByLocationRequest.f27948b;
            gVar.mo61687K();
            if (mVPTBSetActivationByLocationRequest.context != null) {
                gVar.mo61711x(MVPTBSetActivationByLocationRequest.f27948b);
                gVar.mo61686J(mVPTBSetActivationByLocationRequest.context);
                gVar.mo61712y();
            }
            if (mVPTBSetActivationByLocationRequest.userLocation != null) {
                gVar.mo61711x(MVPTBSetActivationByLocationRequest.f27949c);
                mVPTBSetActivationByLocationRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPTBSetActivationByLocationRequest.f27950d);
            gVar.mo61678B(mVPTBSetActivationByLocationRequest.numberOfTickets);
            gVar.mo61712y();
            if (mVPTBSetActivationByLocationRequest.appOriginType != null && mVPTBSetActivationByLocationRequest.mo31049f()) {
                gVar.mo61711x(MVPTBSetActivationByLocationRequest.f27951e);
                gVar.mo61678B(mVPTBSetActivationByLocationRequest.appOriginType.getValue());
                gVar.mo61712y();
            }
            if (mVPTBSetActivationByLocationRequest.transitType != null) {
                gVar.mo61711x(MVPTBSetActivationByLocationRequest.f27952f);
                gVar.mo61678B(mVPTBSetActivationByLocationRequest.transitType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationByLocationRequest mVPTBSetActivationByLocationRequest = (MVPTBSetActivationByLocationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVPTBSetActivationByLocationRequest.userLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVPTBSetActivationByLocationRequest.transitType = MVRouteType.findByValue(gVar.mo61696i());
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVPTBSetActivationByLocationRequest.appOriginType = MVPTBAppOriginType.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVPTBSetActivationByLocationRequest.numberOfTickets = gVar.mo61696i();
                            mVPTBSetActivationByLocationRequest.mo31055k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVPTBSetActivationByLocationRequest.userLocation = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPTBSetActivationByLocationRequest.context = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationByLocationRequest$b */
    public static class C10251b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10250a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationByLocationRequest$c */
    public static class C10252c extends C25240d<MVPTBSetActivationByLocationRequest> {
        public C10252c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationByLocationRequest mVPTBSetActivationByLocationRequest = (MVPTBSetActivationByLocationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBSetActivationByLocationRequest.mo31050g()) {
                bitSet.set(0);
            }
            if (mVPTBSetActivationByLocationRequest.mo31054j()) {
                bitSet.set(1);
            }
            if (mVPTBSetActivationByLocationRequest.mo31051h()) {
                bitSet.set(2);
            }
            if (mVPTBSetActivationByLocationRequest.mo31049f()) {
                bitSet.set(3);
            }
            if (mVPTBSetActivationByLocationRequest.mo31053i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPTBSetActivationByLocationRequest.mo31050g()) {
                jVar.mo61686J(mVPTBSetActivationByLocationRequest.context);
            }
            if (mVPTBSetActivationByLocationRequest.mo31054j()) {
                mVPTBSetActivationByLocationRequest.userLocation.mo25202X0(jVar);
            }
            if (mVPTBSetActivationByLocationRequest.mo31051h()) {
                jVar.mo61678B(mVPTBSetActivationByLocationRequest.numberOfTickets);
            }
            if (mVPTBSetActivationByLocationRequest.mo31049f()) {
                jVar.mo61678B(mVPTBSetActivationByLocationRequest.appOriginType.getValue());
            }
            if (mVPTBSetActivationByLocationRequest.mo31053i()) {
                jVar.mo61678B(mVPTBSetActivationByLocationRequest.transitType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBSetActivationByLocationRequest mVPTBSetActivationByLocationRequest = (MVPTBSetActivationByLocationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVPTBSetActivationByLocationRequest.context = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPTBSetActivationByLocationRequest.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVPTBSetActivationByLocationRequest.numberOfTickets = jVar.mo61696i();
                mVPTBSetActivationByLocationRequest.mo31055k();
            }
            if (T.get(3)) {
                mVPTBSetActivationByLocationRequest.appOriginType = MVPTBAppOriginType.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVPTBSetActivationByLocationRequest.transitType = MVRouteType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationByLocationRequest$d */
    public static class C10253d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10252c(0);
        }
    }

    static {
        new C17394d0("MVPTBSetActivationByLocationRequest");
        HashMap hashMap = new HashMap();
        f27953g = hashMap;
        hashMap.put(C25239c.class, new C10251b());
        hashMap.put(C25240d.class, new C10253d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT, new FieldMetaData(AppActionRequest.KEY_CONTEXT, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.NUMBER_OF_TICKETS, new FieldMetaData("numberOfTickets", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.APP_ORIGIN_TYPE, new FieldMetaData("appOriginType", (byte) 2, new EnumMetaData(MVPTBAppOriginType.class)));
        enumMap.put(_Fields.TRANSIT_TYPE, new FieldMetaData("transitType", (byte) 3, new EnumMetaData(MVRouteType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27954h = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBSetActivationByLocationRequest.class, unmodifiableMap);
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
        ((C25238b) f27953g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27953g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBSetActivationByLocationRequest mVPTBSetActivationByLocationRequest = (MVPTBSetActivationByLocationRequest) obj;
        if (!getClass().equals(mVPTBSetActivationByLocationRequest.getClass())) {
            return getClass().getName().compareTo(mVPTBSetActivationByLocationRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31050g()).compareTo(Boolean.valueOf(mVPTBSetActivationByLocationRequest.mo31050g()));
        if (compareTo2 != 0 || ((mo31050g() && (compareTo2 = this.context.compareTo(mVPTBSetActivationByLocationRequest.context)) != 0) || (compareTo2 = Boolean.valueOf(mo31054j()).compareTo(Boolean.valueOf(mVPTBSetActivationByLocationRequest.mo31054j()))) != 0 || ((mo31054j() && (compareTo2 = this.userLocation.compareTo(mVPTBSetActivationByLocationRequest.userLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo31051h()).compareTo(Boolean.valueOf(mVPTBSetActivationByLocationRequest.mo31051h()))) != 0 || ((mo31051h() && (compareTo2 = C25082a.m62839c(this.numberOfTickets, mVPTBSetActivationByLocationRequest.numberOfTickets)) != 0) || (compareTo2 = Boolean.valueOf(mo31049f()).compareTo(Boolean.valueOf(mVPTBSetActivationByLocationRequest.mo31049f()))) != 0 || ((mo31049f() && (compareTo2 = this.appOriginType.compareTo(mVPTBSetActivationByLocationRequest.appOriginType)) != 0) || (compareTo2 = Boolean.valueOf(mo31053i()).compareTo(Boolean.valueOf(mVPTBSetActivationByLocationRequest.mo31053i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo31053i() || (compareTo = this.transitType.compareTo(mVPTBSetActivationByLocationRequest.transitType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBSetActivationByLocationRequest)) {
            return false;
        }
        MVPTBSetActivationByLocationRequest mVPTBSetActivationByLocationRequest = (MVPTBSetActivationByLocationRequest) obj;
        boolean g = mo31050g();
        boolean g2 = mVPTBSetActivationByLocationRequest.mo31050g();
        if ((g || g2) && (!g || !g2 || !this.context.equals(mVPTBSetActivationByLocationRequest.context))) {
            return false;
        }
        boolean j = mo31054j();
        boolean j2 = mVPTBSetActivationByLocationRequest.mo31054j();
        if (((j || j2) && (!j || !j2 || !this.userLocation.mo26290a(mVPTBSetActivationByLocationRequest.userLocation))) || this.numberOfTickets != mVPTBSetActivationByLocationRequest.numberOfTickets) {
            return false;
        }
        boolean f = mo31049f();
        boolean f2 = mVPTBSetActivationByLocationRequest.mo31049f();
        if ((f || f2) && (!f || !f2 || !this.appOriginType.equals(mVPTBSetActivationByLocationRequest.appOriginType))) {
            return false;
        }
        boolean i = mo31053i();
        boolean i2 = mVPTBSetActivationByLocationRequest.mo31053i();
        if ((i || i2) && (!i || !i2 || !this.transitType.equals(mVPTBSetActivationByLocationRequest.transitType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31049f() {
        return this.appOriginType != null;
    }

    /* renamed from: g */
    public final boolean mo31050g() {
        return this.context != null;
    }

    /* renamed from: h */
    public final boolean mo31051h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31053i() {
        return this.transitType != null;
    }

    /* renamed from: j */
    public final boolean mo31054j() {
        return this.userLocation != null;
    }

    /* renamed from: k */
    public final void mo31055k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBSetActivationByLocationRequest(", "context:");
        String str = this.context;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("userLocation:");
        MVLatLon mVLatLon = this.userLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("numberOfTickets:");
        n.append(this.numberOfTickets);
        if (mo31049f()) {
            n.append(", ");
            n.append("appOriginType:");
            MVPTBAppOriginType mVPTBAppOriginType = this.appOriginType;
            if (mVPTBAppOriginType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPTBAppOriginType);
            }
        }
        n.append(", ");
        n.append("transitType:");
        MVRouteType mVRouteType = this.transitType;
        if (mVRouteType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRouteType);
        }
        n.append(")");
        return n.toString();
    }
}
