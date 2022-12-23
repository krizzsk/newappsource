package com.tranzmate.moovit.protocol.navigation;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.checkin.MVShape;
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

public class MVNavigationLeg implements TBase<MVNavigationLeg, _Fields>, Serializable, Cloneable, Comparable<MVNavigationLeg> {

    /* renamed from: b */
    public static final C25113c f26841b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26842c = new C25113c("destinationStopId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26843d = new C25113c("lineId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26844e = new C25113c("shapes", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f26845f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26846g;
    private byte __isset_bitfield = 0;
    public int destinationStopId;
    public int lineId;
    private _Fields[] optionals = {_Fields.DESTINATION_STOP_ID, _Fields.LINE_ID};
    public List<MVShape> shapes;
    public MVNavigationLegType type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        DESTINATION_STOP_ID(2, "destinationStopId"),
        LINE_ID(3, "lineId"),
        SHAPES(4, "shapes");
        
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
                return DESTINATION_STOP_ID;
            }
            if (i == 3) {
                return LINE_ID;
            }
            if (i != 4) {
                return null;
            }
            return SHAPES;
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

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationLeg$a */
    public static class C9424a extends C25239c<MVNavigationLeg> {
        public C9424a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNavigationLeg mVNavigationLeg = (MVNavigationLeg) tBase;
            mVNavigationLeg.getClass();
            C25113c cVar = MVNavigationLeg.f26841b;
            gVar.mo61687K();
            if (mVNavigationLeg.type != null) {
                gVar.mo61711x(MVNavigationLeg.f26841b);
                gVar.mo61678B(mVNavigationLeg.type.getValue());
                gVar.mo61712y();
            }
            if (mVNavigationLeg.mo29177f()) {
                gVar.mo61711x(MVNavigationLeg.f26842c);
                gVar.mo61678B(mVNavigationLeg.destinationStopId);
                gVar.mo61712y();
            }
            if (mVNavigationLeg.mo29178g()) {
                gVar.mo61711x(MVNavigationLeg.f26843d);
                gVar.mo61678B(mVNavigationLeg.lineId);
                gVar.mo61712y();
            }
            if (mVNavigationLeg.shapes != null) {
                gVar.mo61711x(MVNavigationLeg.f26844e);
                gVar.mo61680D(new C25119e((byte) 12, mVNavigationLeg.shapes.size()));
                for (MVShape X0 : mVNavigationLeg.shapes) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNavigationLeg mVNavigationLeg = (MVNavigationLeg) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVNavigationLeg.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVNavigationLeg.shapes = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVShape mVShape = new MVShape();
                                    mVShape.mo25201C1(gVar);
                                    mVNavigationLeg.shapes.add(mVShape);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVNavigationLeg.lineId = gVar.mo61696i();
                            mVNavigationLeg.mo29183k();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVNavigationLeg.destinationStopId = gVar.mo61696i();
                        mVNavigationLeg.mo29182j();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVNavigationLeg.type = MVNavigationLegType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationLeg$b */
    public static class C9425b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9424a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationLeg$c */
    public static class C9426c extends C25240d<MVNavigationLeg> {
        public C9426c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVNavigationLeg mVNavigationLeg = (MVNavigationLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVNavigationLeg.mo29181i()) {
                bitSet.set(0);
            }
            if (mVNavigationLeg.mo29177f()) {
                bitSet.set(1);
            }
            if (mVNavigationLeg.mo29178g()) {
                bitSet.set(2);
            }
            if (mVNavigationLeg.mo29179h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVNavigationLeg.mo29181i()) {
                jVar.mo61678B(mVNavigationLeg.type.getValue());
            }
            if (mVNavigationLeg.mo29177f()) {
                jVar.mo61678B(mVNavigationLeg.destinationStopId);
            }
            if (mVNavigationLeg.mo29178g()) {
                jVar.mo61678B(mVNavigationLeg.lineId);
            }
            if (mVNavigationLeg.mo29179h()) {
                jVar.mo61678B(mVNavigationLeg.shapes.size());
                for (MVShape X0 : mVNavigationLeg.shapes) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVNavigationLeg mVNavigationLeg = (MVNavigationLeg) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVNavigationLeg.type = MVNavigationLegType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVNavigationLeg.destinationStopId = jVar.mo61696i();
                mVNavigationLeg.mo29182j();
            }
            if (T.get(2)) {
                mVNavigationLeg.lineId = jVar.mo61696i();
                mVNavigationLeg.mo29183k();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVNavigationLeg.shapes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVShape mVShape = new MVShape();
                    mVShape.mo25201C1(jVar);
                    mVNavigationLeg.shapes.add(mVShape);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.navigation.MVNavigationLeg$d */
    public static class C9427d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9426c(0);
        }
    }

    static {
        new C17394d0("MVNavigationLeg");
        HashMap hashMap = new HashMap();
        f26845f = hashMap;
        hashMap.put(C25239c.class, new C9425b());
        hashMap.put(C25240d.class, new C9427d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVNavigationLegType.class)));
        enumMap.put(_Fields.DESTINATION_STOP_ID, new FieldMetaData("destinationStopId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LINE_ID, new FieldMetaData("lineId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SHAPES, new FieldMetaData("shapes", (byte) 3, new ListMetaData(new StructMetaData(MVShape.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26846g = unmodifiableMap;
        FieldMetaData.m61947a(MVNavigationLeg.class, unmodifiableMap);
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
        ((C25238b) f26845f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26845f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVNavigationLeg mVNavigationLeg = (MVNavigationLeg) obj;
        if (!getClass().equals(mVNavigationLeg.getClass())) {
            return getClass().getName().compareTo(mVNavigationLeg.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29181i()).compareTo(Boolean.valueOf(mVNavigationLeg.mo29181i()));
        if (compareTo != 0 || ((mo29181i() && (compareTo = this.type.compareTo(mVNavigationLeg.type)) != 0) || (compareTo = Boolean.valueOf(mo29177f()).compareTo(Boolean.valueOf(mVNavigationLeg.mo29177f()))) != 0 || ((mo29177f() && (compareTo = C25082a.m62839c(this.destinationStopId, mVNavigationLeg.destinationStopId)) != 0) || (compareTo = Boolean.valueOf(mo29178g()).compareTo(Boolean.valueOf(mVNavigationLeg.mo29178g()))) != 0 || ((mo29178g() && (compareTo = C25082a.m62839c(this.lineId, mVNavigationLeg.lineId)) != 0) || (compareTo = Boolean.valueOf(mo29179h()).compareTo(Boolean.valueOf(mVNavigationLeg.mo29179h()))) != 0)))) {
            return compareTo;
        }
        if (!mo29179h() || (h = C25082a.m62844h(this.shapes, mVNavigationLeg.shapes)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVNavigationLeg)) {
            return false;
        }
        MVNavigationLeg mVNavigationLeg = (MVNavigationLeg) obj;
        boolean i = mo29181i();
        boolean i2 = mVNavigationLeg.mo29181i();
        if ((i || i2) && (!i || !i2 || !this.type.equals(mVNavigationLeg.type))) {
            return false;
        }
        boolean f = mo29177f();
        boolean f2 = mVNavigationLeg.mo29177f();
        if ((f || f2) && (!f || !f2 || this.destinationStopId != mVNavigationLeg.destinationStopId)) {
            return false;
        }
        boolean g = mo29178g();
        boolean g2 = mVNavigationLeg.mo29178g();
        if ((g || g2) && (!g || !g2 || this.lineId != mVNavigationLeg.lineId)) {
            return false;
        }
        boolean h = mo29179h();
        boolean h2 = mVNavigationLeg.mo29179h();
        if ((h || h2) && (!h || !h2 || !this.shapes.equals(mVNavigationLeg.shapes))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29177f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29178g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo29179h() {
        return this.shapes != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29181i() {
        return this.type != null;
    }

    /* renamed from: j */
    public final void mo29182j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo29183k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVNavigationLeg(", "type:");
        MVNavigationLegType mVNavigationLegType = this.type;
        if (mVNavigationLegType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVNavigationLegType);
        }
        if (mo29177f()) {
            n.append(", ");
            n.append("destinationStopId:");
            n.append(this.destinationStopId);
        }
        if (mo29178g()) {
            n.append(", ");
            n.append("lineId:");
            n.append(this.lineId);
        }
        n.append(", ");
        n.append("shapes:");
        List<MVShape> list = this.shapes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
