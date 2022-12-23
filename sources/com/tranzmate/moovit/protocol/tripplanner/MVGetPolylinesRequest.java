package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVGetPolylinesRequest implements TBase<MVGetPolylinesRequest, _Fields>, Serializable, Cloneable, Comparable<MVGetPolylinesRequest> {

    /* renamed from: b */
    public static final C25113c f29931b = new C25113c("locations", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29932c = new C25113c("modes", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f29933d = new C25113c("requestedTime", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f29934e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f29935f;
    private byte __isset_bitfield = 0;
    public List<MVLatLon> locations;
    public List<MVPolyLineMode> modes;
    public long requestedTime;

    public enum _Fields implements C25085c {
        LOCATIONS(1, "locations"),
        MODES(2, "modes"),
        REQUESTED_TIME(3, "requestedTime");
        
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
                return LOCATIONS;
            }
            if (i == 2) {
                return MODES;
            }
            if (i != 3) {
                return null;
            }
            return REQUESTED_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVGetPolylinesRequest$a */
    public static class C11542a extends C25239c<MVGetPolylinesRequest> {
        public C11542a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetPolylinesRequest mVGetPolylinesRequest = (MVGetPolylinesRequest) tBase;
            mVGetPolylinesRequest.getClass();
            C25113c cVar = MVGetPolylinesRequest.f29931b;
            gVar.mo61687K();
            if (mVGetPolylinesRequest.locations != null) {
                gVar.mo61711x(MVGetPolylinesRequest.f29931b);
                gVar.mo61680D(new C25119e((byte) 12, mVGetPolylinesRequest.locations.size()));
                for (MVLatLon X0 : mVGetPolylinesRequest.locations) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVGetPolylinesRequest.modes != null) {
                gVar.mo61711x(MVGetPolylinesRequest.f29932c);
                gVar.mo61680D(new C25119e((byte) 8, mVGetPolylinesRequest.modes.size()));
                for (MVPolyLineMode value : mVGetPolylinesRequest.modes) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVGetPolylinesRequest.f29933d);
            C25541a.m63891v(gVar, mVGetPolylinesRequest.requestedTime);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetPolylinesRequest mVGetPolylinesRequest = (MVGetPolylinesRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGetPolylinesRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVGetPolylinesRequest.requestedTime = gVar.mo61697j();
                            mVGetPolylinesRequest.mo34321i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVGetPolylinesRequest.modes = new ArrayList(k.f63395b);
                        while (i < k.f63395b) {
                            mVGetPolylinesRequest.modes.add(MVPolyLineMode.findByValue(gVar.mo61696i()));
                            i++;
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVGetPolylinesRequest.locations = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVLatLon mVLatLon = new MVLatLon();
                        mVLatLon.mo25201C1(gVar);
                        mVGetPolylinesRequest.locations.add(mVLatLon);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVGetPolylinesRequest$b */
    public static class C11543b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11542a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVGetPolylinesRequest$c */
    public static class C11544c extends C25240d<MVGetPolylinesRequest> {
        public C11544c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetPolylinesRequest mVGetPolylinesRequest = (MVGetPolylinesRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetPolylinesRequest.mo34317f()) {
                bitSet.set(0);
            }
            if (mVGetPolylinesRequest.mo34318g()) {
                bitSet.set(1);
            }
            if (mVGetPolylinesRequest.mo34319h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVGetPolylinesRequest.mo34317f()) {
                jVar.mo61678B(mVGetPolylinesRequest.locations.size());
                for (MVLatLon X0 : mVGetPolylinesRequest.locations) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVGetPolylinesRequest.mo34318g()) {
                jVar.mo61678B(mVGetPolylinesRequest.modes.size());
                for (MVPolyLineMode value : mVGetPolylinesRequest.modes) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVGetPolylinesRequest.mo34319h()) {
                jVar.mo61679C(mVGetPolylinesRequest.requestedTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetPolylinesRequest mVGetPolylinesRequest = (MVGetPolylinesRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVGetPolylinesRequest.locations = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVLatLon mVLatLon = new MVLatLon();
                    mVLatLon.mo25201C1(jVar);
                    mVGetPolylinesRequest.locations.add(mVLatLon);
                }
            }
            if (T.get(1)) {
                int i3 = jVar.mo61696i();
                mVGetPolylinesRequest.modes = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    mVGetPolylinesRequest.modes.add(MVPolyLineMode.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(2)) {
                mVGetPolylinesRequest.requestedTime = jVar.mo61697j();
                mVGetPolylinesRequest.mo34321i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVGetPolylinesRequest$d */
    public static class C11545d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11544c(0);
        }
    }

    static {
        new C17394d0("MVGetPolylinesRequest");
        HashMap hashMap = new HashMap();
        f29934e = hashMap;
        hashMap.put(C25239c.class, new C11543b());
        hashMap.put(C25240d.class, new C11545d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATIONS, new FieldMetaData("locations", (byte) 3, new ListMetaData(new StructMetaData(MVLatLon.class))));
        enumMap.put(_Fields.MODES, new FieldMetaData("modes", (byte) 3, new ListMetaData(new EnumMetaData(MVPolyLineMode.class))));
        enumMap.put(_Fields.REQUESTED_TIME, new FieldMetaData("requestedTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29935f = unmodifiableMap;
        FieldMetaData.m61947a(MVGetPolylinesRequest.class, unmodifiableMap);
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
        ((C25238b) f29934e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29934e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVGetPolylinesRequest mVGetPolylinesRequest = (MVGetPolylinesRequest) obj;
        if (!getClass().equals(mVGetPolylinesRequest.getClass())) {
            return getClass().getName().compareTo(mVGetPolylinesRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34317f()).compareTo(Boolean.valueOf(mVGetPolylinesRequest.mo34317f()));
        if (compareTo != 0 || ((mo34317f() && (compareTo = C25082a.m62844h(this.locations, mVGetPolylinesRequest.locations)) != 0) || (compareTo = Boolean.valueOf(mo34318g()).compareTo(Boolean.valueOf(mVGetPolylinesRequest.mo34318g()))) != 0 || ((mo34318g() && (compareTo = C25082a.m62844h(this.modes, mVGetPolylinesRequest.modes)) != 0) || (compareTo = Boolean.valueOf(mo34319h()).compareTo(Boolean.valueOf(mVGetPolylinesRequest.mo34319h()))) != 0))) {
            return compareTo;
        }
        if (!mo34319h() || (d = C25082a.m62840d(this.requestedTime, mVGetPolylinesRequest.requestedTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetPolylinesRequest)) {
            return false;
        }
        MVGetPolylinesRequest mVGetPolylinesRequest = (MVGetPolylinesRequest) obj;
        boolean f = mo34317f();
        boolean f2 = mVGetPolylinesRequest.mo34317f();
        if ((f || f2) && (!f || !f2 || !this.locations.equals(mVGetPolylinesRequest.locations))) {
            return false;
        }
        boolean g = mo34318g();
        boolean g2 = mVGetPolylinesRequest.mo34318g();
        if (((g || g2) && (!g || !g2 || !this.modes.equals(mVGetPolylinesRequest.modes))) || this.requestedTime != mVGetPolylinesRequest.requestedTime) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34317f() {
        return this.locations != null;
    }

    /* renamed from: g */
    public final boolean mo34318g() {
        return this.modes != null;
    }

    /* renamed from: h */
    public final boolean mo34319h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo34321i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetPolylinesRequest(", "locations:");
        List<MVLatLon> list = this.locations;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("modes:");
        List<MVPolyLineMode> list2 = this.modes;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("requestedTime:");
        return C25541a.m63884o(n, this.requestedTime, ")");
    }
}
