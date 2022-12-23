package com.tranzmate.moovit.protocol.micromobility;

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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVMicroMobilityZone implements TBase<MVMicroMobilityZone, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityZone> {

    /* renamed from: b */
    public static final C25113c f26767b = new C25113c("polygon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26768c = new C25113c("marker", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f26769d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26770e;
    public MVMicroMobilityMarker marker;
    private _Fields[] optionals = {_Fields.POLYGON, _Fields.MARKER};
    public MVMicroMobilityPolygon polygon;

    public enum _Fields implements C25085c {
        POLYGON(1, "polygon"),
        MARKER(2, "marker");
        
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
                return POLYGON;
            }
            if (i != 2) {
                return null;
            }
            return MARKER;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZone$a */
    public static class C9364a extends C25239c<MVMicroMobilityZone> {
        public C9364a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityZone mVMicroMobilityZone = (MVMicroMobilityZone) tBase;
            mVMicroMobilityZone.getClass();
            C25113c cVar = MVMicroMobilityZone.f26767b;
            gVar.mo61687K();
            if (mVMicroMobilityZone.polygon != null && mVMicroMobilityZone.mo29046g()) {
                gVar.mo61711x(MVMicroMobilityZone.f26767b);
                mVMicroMobilityZone.polygon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityZone.marker != null && mVMicroMobilityZone.mo29045f()) {
                gVar.mo61711x(MVMicroMobilityZone.f26768c);
                mVMicroMobilityZone.marker.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityZone mVMicroMobilityZone = (MVMicroMobilityZone) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityZone.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVMicroMobilityMarker mVMicroMobilityMarker = new MVMicroMobilityMarker();
                        mVMicroMobilityZone.marker = mVMicroMobilityMarker;
                        mVMicroMobilityMarker.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVMicroMobilityPolygon mVMicroMobilityPolygon = new MVMicroMobilityPolygon();
                    mVMicroMobilityZone.polygon = mVMicroMobilityPolygon;
                    mVMicroMobilityPolygon.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZone$b */
    public static class C9365b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9364a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZone$c */
    public static class C9366c extends C25240d<MVMicroMobilityZone> {
        public C9366c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityZone mVMicroMobilityZone = (MVMicroMobilityZone) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityZone.mo29046g()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityZone.mo29045f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMicroMobilityZone.mo29046g()) {
                mVMicroMobilityZone.polygon.mo25202X0(jVar);
            }
            if (mVMicroMobilityZone.mo29045f()) {
                mVMicroMobilityZone.marker.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityZone mVMicroMobilityZone = (MVMicroMobilityZone) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVMicroMobilityPolygon mVMicroMobilityPolygon = new MVMicroMobilityPolygon();
                mVMicroMobilityZone.polygon = mVMicroMobilityPolygon;
                mVMicroMobilityPolygon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVMicroMobilityMarker mVMicroMobilityMarker = new MVMicroMobilityMarker();
                mVMicroMobilityZone.marker = mVMicroMobilityMarker;
                mVMicroMobilityMarker.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZone$d */
    public static class C9367d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9366c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityZone");
        HashMap hashMap = new HashMap();
        f26769d = hashMap;
        hashMap.put(C25239c.class, new C9365b());
        hashMap.put(C25240d.class, new C9367d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.POLYGON, new FieldMetaData("polygon", (byte) 2, new StructMetaData(MVMicroMobilityPolygon.class)));
        enumMap.put(_Fields.MARKER, new FieldMetaData("marker", (byte) 2, new StructMetaData(MVMicroMobilityMarker.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26770e = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityZone.class, unmodifiableMap);
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
        ((C25238b) f26769d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26769d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityZone mVMicroMobilityZone = (MVMicroMobilityZone) obj;
        if (!getClass().equals(mVMicroMobilityZone.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityZone.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29046g()).compareTo(Boolean.valueOf(mVMicroMobilityZone.mo29046g()));
        if (compareTo2 != 0 || ((mo29046g() && (compareTo2 = this.polygon.compareTo(mVMicroMobilityZone.polygon)) != 0) || (compareTo2 = Boolean.valueOf(mo29045f()).compareTo(Boolean.valueOf(mVMicroMobilityZone.mo29045f()))) != 0)) {
            return compareTo2;
        }
        if (!mo29045f() || (compareTo = this.marker.compareTo(mVMicroMobilityZone.marker)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityZone)) {
            return false;
        }
        MVMicroMobilityZone mVMicroMobilityZone = (MVMicroMobilityZone) obj;
        boolean g = mo29046g();
        boolean g2 = mVMicroMobilityZone.mo29046g();
        if ((g || g2) && (!g || !g2 || !this.polygon.mo28747a(mVMicroMobilityZone.polygon))) {
            return false;
        }
        boolean f = mo29045f();
        boolean f2 = mVMicroMobilityZone.mo29045f();
        if ((f || f2) && (!f || !f2 || !this.marker.mo28739a(mVMicroMobilityZone.marker))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29045f() {
        return this.marker != null;
    }

    /* renamed from: g */
    public final boolean mo29046g() {
        return this.polygon != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVMicroMobilityZone(");
        if (mo29046g()) {
            sb.append("polygon:");
            MVMicroMobilityPolygon mVMicroMobilityPolygon = this.polygon;
            if (mVMicroMobilityPolygon == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVMicroMobilityPolygon);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo29045f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("marker:");
            MVMicroMobilityMarker mVMicroMobilityMarker = this.marker;
            if (mVMicroMobilityMarker == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVMicroMobilityMarker);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
