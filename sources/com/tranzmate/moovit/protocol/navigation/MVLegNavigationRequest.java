package com.tranzmate.moovit.protocol.navigation;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLegType;
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

public class MVLegNavigationRequest implements TBase<MVLegNavigationRequest, _Fields>, Serializable, Cloneable, Comparable<MVLegNavigationRequest> {

    /* renamed from: b */
    public static final C25113c f26834b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26835c = new C25113c("lineId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26836d = new C25113c("firstStopId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26837e = new C25113c("lastStopId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26838f = new C25113c("walkEncodedPolylines", (byte) 15, 5);

    /* renamed from: g */
    public static final HashMap f26839g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26840h;
    private byte __isset_bitfield;
    public int firstStopId;
    public int lastStopId;
    public int lineId;
    private _Fields[] optionals;
    public MVLegType type;
    public List<String> walkEncodedPolylines;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        LINE_ID(2, "lineId"),
        FIRST_STOP_ID(3, "firstStopId"),
        LAST_STOP_ID(4, "lastStopId"),
        WALK_ENCODED_POLYLINES(5, "walkEncodedPolylines");
        
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
                return TYPE;
            }
            if (i == 2) {
                return LINE_ID;
            }
            if (i == 3) {
                return FIRST_STOP_ID;
            }
            if (i == 4) {
                return LAST_STOP_ID;
            }
            if (i != 5) {
                return null;
            }
            return WALK_ENCODED_POLYLINES;
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

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVLegNavigationRequest$a */
    public static class C9420a extends C25239c<MVLegNavigationRequest> {
        public C9420a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLegNavigationRequest mVLegNavigationRequest = (MVLegNavigationRequest) tBase;
            mVLegNavigationRequest.getClass();
            C25113c cVar = MVLegNavigationRequest.f26834b;
            gVar.mo61687K();
            if (mVLegNavigationRequest.type != null) {
                gVar.mo61711x(MVLegNavigationRequest.f26834b);
                gVar.mo61678B(mVLegNavigationRequest.type.getValue());
                gVar.mo61712y();
            }
            if (mVLegNavigationRequest.mo29166h()) {
                gVar.mo61711x(MVLegNavigationRequest.f26835c);
                gVar.mo61678B(mVLegNavigationRequest.lineId);
                gVar.mo61712y();
            }
            if (mVLegNavigationRequest.mo29164f()) {
                gVar.mo61711x(MVLegNavigationRequest.f26836d);
                gVar.mo61678B(mVLegNavigationRequest.firstStopId);
                gVar.mo61712y();
            }
            if (mVLegNavigationRequest.mo29165g()) {
                gVar.mo61711x(MVLegNavigationRequest.f26837e);
                gVar.mo61678B(mVLegNavigationRequest.lastStopId);
                gVar.mo61712y();
            }
            if (mVLegNavigationRequest.walkEncodedPolylines != null && mVLegNavigationRequest.mo29169j()) {
                gVar.mo61711x(MVLegNavigationRequest.f26838f);
                gVar.mo61680D(new C25119e((byte) 11, mVLegNavigationRequest.walkEncodedPolylines.size()));
                for (String J : mVLegNavigationRequest.walkEncodedPolylines) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLegNavigationRequest mVLegNavigationRequest = (MVLegNavigationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLegNavigationRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 15) {
                                    C25119e k = gVar.mo61698k();
                                    mVLegNavigationRequest.walkEncodedPolylines = new ArrayList(k.f63395b);
                                    for (int i = 0; i < k.f63395b; i++) {
                                        mVLegNavigationRequest.walkEncodedPolylines.add(gVar.mo61704q());
                                    }
                                    gVar.mo61699l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVLegNavigationRequest.lastStopId = gVar.mo61696i();
                                mVLegNavigationRequest.mo29171l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVLegNavigationRequest.firstStopId = gVar.mo61696i();
                            mVLegNavigationRequest.mo29170k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVLegNavigationRequest.lineId = gVar.mo61696i();
                        mVLegNavigationRequest.mo29172m();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVLegNavigationRequest.type = MVLegType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVLegNavigationRequest$b */
    public static class C9421b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9420a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVLegNavigationRequest$c */
    public static class C9422c extends C25240d<MVLegNavigationRequest> {
        public C9422c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLegNavigationRequest mVLegNavigationRequest = (MVLegNavigationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLegNavigationRequest.mo29168i()) {
                bitSet.set(0);
            }
            if (mVLegNavigationRequest.mo29166h()) {
                bitSet.set(1);
            }
            if (mVLegNavigationRequest.mo29164f()) {
                bitSet.set(2);
            }
            if (mVLegNavigationRequest.mo29165g()) {
                bitSet.set(3);
            }
            if (mVLegNavigationRequest.mo29169j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVLegNavigationRequest.mo29168i()) {
                jVar.mo61678B(mVLegNavigationRequest.type.getValue());
            }
            if (mVLegNavigationRequest.mo29166h()) {
                jVar.mo61678B(mVLegNavigationRequest.lineId);
            }
            if (mVLegNavigationRequest.mo29164f()) {
                jVar.mo61678B(mVLegNavigationRequest.firstStopId);
            }
            if (mVLegNavigationRequest.mo29165g()) {
                jVar.mo61678B(mVLegNavigationRequest.lastStopId);
            }
            if (mVLegNavigationRequest.mo29169j()) {
                jVar.mo61678B(mVLegNavigationRequest.walkEncodedPolylines.size());
                for (String J : mVLegNavigationRequest.walkEncodedPolylines) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLegNavigationRequest mVLegNavigationRequest = (MVLegNavigationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVLegNavigationRequest.type = MVLegType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVLegNavigationRequest.lineId = jVar.mo61696i();
                mVLegNavigationRequest.mo29172m();
            }
            if (T.get(2)) {
                mVLegNavigationRequest.firstStopId = jVar.mo61696i();
                mVLegNavigationRequest.mo29170k();
            }
            if (T.get(3)) {
                mVLegNavigationRequest.lastStopId = jVar.mo61696i();
                mVLegNavigationRequest.mo29171l();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVLegNavigationRequest.walkEncodedPolylines = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVLegNavigationRequest.walkEncodedPolylines.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVLegNavigationRequest$d */
    public static class C9423d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9422c(0);
        }
    }

    static {
        new C17394d0("MVLegNavigationRequest");
        HashMap hashMap = new HashMap();
        f26839g = hashMap;
        hashMap.put(C25239c.class, new C9421b());
        hashMap.put(C25240d.class, new C9423d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVLegType.class)));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.FIRST_STOP_ID, new FieldMetaData("firstStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LAST_STOP_ID, new FieldMetaData("lastStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.WALK_ENCODED_POLYLINES, new FieldMetaData("walkEncodedPolylines", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon"))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26840h = unmodifiableMap;
        FieldMetaData.m61947a(MVLegNavigationRequest.class, unmodifiableMap);
    }

    public MVLegNavigationRequest() {
        this.__isset_bitfield = 0;
        this.optionals = new _Fields[]{_Fields.LINE_ID, _Fields.FIRST_STOP_ID, _Fields.LAST_STOP_ID, _Fields.WALK_ENCODED_POLYLINES};
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
        ((C25238b) f26839g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26839g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVLegNavigationRequest mVLegNavigationRequest = (MVLegNavigationRequest) obj;
        if (!getClass().equals(mVLegNavigationRequest.getClass())) {
            return getClass().getName().compareTo(mVLegNavigationRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29168i()).compareTo(Boolean.valueOf(mVLegNavigationRequest.mo29168i()));
        if (compareTo != 0 || ((mo29168i() && (compareTo = this.type.compareTo(mVLegNavigationRequest.type)) != 0) || (compareTo = Boolean.valueOf(mo29166h()).compareTo(Boolean.valueOf(mVLegNavigationRequest.mo29166h()))) != 0 || ((mo29166h() && (compareTo = C25082a.m62839c(this.lineId, mVLegNavigationRequest.lineId)) != 0) || (compareTo = Boolean.valueOf(mo29164f()).compareTo(Boolean.valueOf(mVLegNavigationRequest.mo29164f()))) != 0 || ((mo29164f() && (compareTo = C25082a.m62839c(this.firstStopId, mVLegNavigationRequest.firstStopId)) != 0) || (compareTo = Boolean.valueOf(mo29165g()).compareTo(Boolean.valueOf(mVLegNavigationRequest.mo29165g()))) != 0 || ((mo29165g() && (compareTo = C25082a.m62839c(this.lastStopId, mVLegNavigationRequest.lastStopId)) != 0) || (compareTo = Boolean.valueOf(mo29169j()).compareTo(Boolean.valueOf(mVLegNavigationRequest.mo29169j()))) != 0))))) {
            return compareTo;
        }
        if (!mo29169j() || (h = C25082a.m62844h(this.walkEncodedPolylines, mVLegNavigationRequest.walkEncodedPolylines)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLegNavigationRequest)) {
            return false;
        }
        MVLegNavigationRequest mVLegNavigationRequest = (MVLegNavigationRequest) obj;
        boolean i = mo29168i();
        boolean i2 = mVLegNavigationRequest.mo29168i();
        if ((i || i2) && (!i || !i2 || !this.type.equals(mVLegNavigationRequest.type))) {
            return false;
        }
        boolean h = mo29166h();
        boolean h2 = mVLegNavigationRequest.mo29166h();
        if ((h || h2) && (!h || !h2 || this.lineId != mVLegNavigationRequest.lineId)) {
            return false;
        }
        boolean f = mo29164f();
        boolean f2 = mVLegNavigationRequest.mo29164f();
        if ((f || f2) && (!f || !f2 || this.firstStopId != mVLegNavigationRequest.firstStopId)) {
            return false;
        }
        boolean g = mo29165g();
        boolean g2 = mVLegNavigationRequest.mo29165g();
        if ((g || g2) && (!g || !g2 || this.lastStopId != mVLegNavigationRequest.lastStopId)) {
            return false;
        }
        boolean j = mo29169j();
        boolean j2 = mVLegNavigationRequest.mo29169j();
        if ((j || j2) && (!j || !j2 || !this.walkEncodedPolylines.equals(mVLegNavigationRequest.walkEncodedPolylines))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29164f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo29165g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo29166h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29168i() {
        return this.type != null;
    }

    /* renamed from: j */
    public final boolean mo29169j() {
        return this.walkEncodedPolylines != null;
    }

    /* renamed from: k */
    public final void mo29170k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: l */
    public final void mo29171l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: m */
    public final void mo29172m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLegNavigationRequest(", "type:");
        MVLegType mVLegType = this.type;
        if (mVLegType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLegType);
        }
        if (mo29166h()) {
            n.append(", ");
            n.append("lineId:");
            n.append(this.lineId);
        }
        if (mo29164f()) {
            n.append(", ");
            n.append("firstStopId:");
            n.append(this.firstStopId);
        }
        if (mo29165g()) {
            n.append(", ");
            n.append("lastStopId:");
            n.append(this.lastStopId);
        }
        if (mo29169j()) {
            n.append(", ");
            n.append("walkEncodedPolylines:");
            List<String> list = this.walkEncodedPolylines;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        n.append(")");
        return n.toString();
    }

    public MVLegNavigationRequest(MVLegType mVLegType) {
        this();
        this.type = mVLegType;
    }
}
