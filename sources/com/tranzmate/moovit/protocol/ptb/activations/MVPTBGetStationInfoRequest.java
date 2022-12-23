package com.tranzmate.moovit.protocol.ptb.activations;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.common.MVRouteType;
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

public class MVPTBGetStationInfoRequest implements TBase<MVPTBGetStationInfoRequest, _Fields>, Serializable, Cloneable, Comparable<MVPTBGetStationInfoRequest> {

    /* renamed from: b */
    public static final C25113c f27926b = new C25113c("userLocation", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27927c = new C25113c("transitType", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f27928d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27929e;
    public MVRouteType transitType;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        USER_LOCATION(1, "userLocation"),
        TRANSIT_TYPE(2, "transitType");
        
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
                return USER_LOCATION;
            }
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoRequest$a */
    public static class C10230a extends C25239c<MVPTBGetStationInfoRequest> {
        public C10230a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetStationInfoRequest mVPTBGetStationInfoRequest = (MVPTBGetStationInfoRequest) tBase;
            MVLatLon mVLatLon = mVPTBGetStationInfoRequest.userLocation;
            C25113c cVar = MVPTBGetStationInfoRequest.f27926b;
            gVar.mo61687K();
            if (mVPTBGetStationInfoRequest.userLocation != null) {
                gVar.mo61711x(MVPTBGetStationInfoRequest.f27926b);
                mVPTBGetStationInfoRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPTBGetStationInfoRequest.transitType != null) {
                gVar.mo61711x(MVPTBGetStationInfoRequest.f27927c);
                gVar.mo61678B(mVPTBGetStationInfoRequest.transitType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetStationInfoRequest mVPTBGetStationInfoRequest = (MVPTBGetStationInfoRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVPTBGetStationInfoRequest.userLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVPTBGetStationInfoRequest.transitType = MVRouteType.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLatLon mVLatLon2 = new MVLatLon();
                    mVPTBGetStationInfoRequest.userLocation = mVLatLon2;
                    mVLatLon2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoRequest$b */
    public static class C10231b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10230a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoRequest$c */
    public static class C10232c extends C25240d<MVPTBGetStationInfoRequest> {
        public C10232c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetStationInfoRequest mVPTBGetStationInfoRequest = (MVPTBGetStationInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBGetStationInfoRequest.mo31008g()) {
                bitSet.set(0);
            }
            if (mVPTBGetStationInfoRequest.mo31007f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPTBGetStationInfoRequest.mo31008g()) {
                mVPTBGetStationInfoRequest.userLocation.mo25202X0(jVar);
            }
            if (mVPTBGetStationInfoRequest.mo31007f()) {
                jVar.mo61678B(mVPTBGetStationInfoRequest.transitType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetStationInfoRequest mVPTBGetStationInfoRequest = (MVPTBGetStationInfoRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVPTBGetStationInfoRequest.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVPTBGetStationInfoRequest.transitType = MVRouteType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetStationInfoRequest$d */
    public static class C10233d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10232c(0);
        }
    }

    static {
        new C17394d0("MVPTBGetStationInfoRequest");
        HashMap hashMap = new HashMap();
        f27928d = hashMap;
        hashMap.put(C25239c.class, new C10231b());
        hashMap.put(C25240d.class, new C10233d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.TRANSIT_TYPE, new FieldMetaData("transitType", (byte) 3, new EnumMetaData(MVRouteType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27929e = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBGetStationInfoRequest.class, unmodifiableMap);
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
        ((C25238b) f27928d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27928d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBGetStationInfoRequest mVPTBGetStationInfoRequest = (MVPTBGetStationInfoRequest) obj;
        if (!getClass().equals(mVPTBGetStationInfoRequest.getClass())) {
            return getClass().getName().compareTo(mVPTBGetStationInfoRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31008g()).compareTo(Boolean.valueOf(mVPTBGetStationInfoRequest.mo31008g()));
        if (compareTo2 != 0 || ((mo31008g() && (compareTo2 = this.userLocation.compareTo(mVPTBGetStationInfoRequest.userLocation)) != 0) || (compareTo2 = Boolean.valueOf(mo31007f()).compareTo(Boolean.valueOf(mVPTBGetStationInfoRequest.mo31007f()))) != 0)) {
            return compareTo2;
        }
        if (!mo31007f() || (compareTo = this.transitType.compareTo(mVPTBGetStationInfoRequest.transitType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBGetStationInfoRequest)) {
            return false;
        }
        MVPTBGetStationInfoRequest mVPTBGetStationInfoRequest = (MVPTBGetStationInfoRequest) obj;
        boolean g = mo31008g();
        boolean g2 = mVPTBGetStationInfoRequest.mo31008g();
        if ((g || g2) && (!g || !g2 || !this.userLocation.mo26290a(mVPTBGetStationInfoRequest.userLocation))) {
            return false;
        }
        boolean f = mo31007f();
        boolean f2 = mVPTBGetStationInfoRequest.mo31007f();
        if ((f || f2) && (!f || !f2 || !this.transitType.equals(mVPTBGetStationInfoRequest.transitType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31007f() {
        return this.transitType != null;
    }

    /* renamed from: g */
    public final boolean mo31008g() {
        return this.userLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBGetStationInfoRequest(", "userLocation:");
        MVLatLon mVLatLon = this.userLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
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
