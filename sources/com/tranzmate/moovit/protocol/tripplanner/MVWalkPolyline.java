package com.tranzmate.moovit.protocol.tripplanner;

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

public class MVWalkPolyline implements TBase<MVWalkPolyline, _Fields>, Serializable, Cloneable, Comparable<MVWalkPolyline> {

    /* renamed from: b */
    public static final C25113c f30275b = new C25113c("polyline", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30276c = new C25113c("pathwayId", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f30277d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30278e;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.POLYLINE, _Fields.PATHWAY_ID};
    public int pathwayId;
    public String polyline;

    public enum _Fields implements C25085c {
        POLYLINE(1, "polyline"),
        PATHWAY_ID(2, "pathwayId");
        
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
                return POLYLINE;
            }
            if (i != 2) {
                return null;
            }
            return PATHWAY_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkPolyline$a */
    public static class C11726a extends C25239c<MVWalkPolyline> {
        public C11726a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWalkPolyline mVWalkPolyline = (MVWalkPolyline) tBase;
            mVWalkPolyline.getClass();
            C25113c cVar = MVWalkPolyline.f30275b;
            gVar.mo61687K();
            if (mVWalkPolyline.polyline != null && mVWalkPolyline.mo34911g()) {
                gVar.mo61711x(MVWalkPolyline.f30275b);
                gVar.mo61686J(mVWalkPolyline.polyline);
                gVar.mo61712y();
            }
            if (mVWalkPolyline.mo34910f()) {
                gVar.mo61711x(MVWalkPolyline.f30276c);
                gVar.mo61678B(mVWalkPolyline.pathwayId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWalkPolyline mVWalkPolyline = (MVWalkPolyline) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWalkPolyline.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVWalkPolyline.pathwayId = gVar.mo61696i();
                        mVWalkPolyline.mo34912h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVWalkPolyline.polyline = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkPolyline$b */
    public static class C11727b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11726a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkPolyline$c */
    public static class C11728c extends C25240d<MVWalkPolyline> {
        public C11728c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWalkPolyline mVWalkPolyline = (MVWalkPolyline) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWalkPolyline.mo34911g()) {
                bitSet.set(0);
            }
            if (mVWalkPolyline.mo34910f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVWalkPolyline.mo34911g()) {
                jVar.mo61686J(mVWalkPolyline.polyline);
            }
            if (mVWalkPolyline.mo34910f()) {
                jVar.mo61678B(mVWalkPolyline.pathwayId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWalkPolyline mVWalkPolyline = (MVWalkPolyline) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVWalkPolyline.polyline = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWalkPolyline.pathwayId = jVar.mo61696i();
                mVWalkPolyline.mo34912h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVWalkPolyline$d */
    public static class C11729d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11728c(0);
        }
    }

    static {
        new C17394d0("MVWalkPolyline");
        HashMap hashMap = new HashMap();
        f30277d = hashMap;
        hashMap.put(C25239c.class, new C11727b());
        hashMap.put(C25240d.class, new C11729d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.POLYLINE, new FieldMetaData("polyline", (byte) 2, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        enumMap.put(_Fields.PATHWAY_ID, new FieldMetaData("pathwayId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30278e = unmodifiableMap;
        FieldMetaData.m61947a(MVWalkPolyline.class, unmodifiableMap);
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
        ((C25238b) f30277d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30277d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVWalkPolyline mVWalkPolyline = (MVWalkPolyline) obj;
        if (!getClass().equals(mVWalkPolyline.getClass())) {
            return getClass().getName().compareTo(mVWalkPolyline.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo34911g()).compareTo(Boolean.valueOf(mVWalkPolyline.mo34911g()));
        if (compareTo != 0 || ((mo34911g() && (compareTo = this.polyline.compareTo(mVWalkPolyline.polyline)) != 0) || (compareTo = Boolean.valueOf(mo34910f()).compareTo(Boolean.valueOf(mVWalkPolyline.mo34910f()))) != 0)) {
            return compareTo;
        }
        if (!mo34910f() || (c = C25082a.m62839c(this.pathwayId, mVWalkPolyline.pathwayId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVWalkPolyline)) {
            return false;
        }
        MVWalkPolyline mVWalkPolyline = (MVWalkPolyline) obj;
        boolean g = mo34911g();
        boolean g2 = mVWalkPolyline.mo34911g();
        if ((g || g2) && (!g || !g2 || !this.polyline.equals(mVWalkPolyline.polyline))) {
            return false;
        }
        boolean f = mo34910f();
        boolean f2 = mVWalkPolyline.mo34910f();
        if ((f || f2) && (!f || !f2 || this.pathwayId != mVWalkPolyline.pathwayId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34910f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo34911g() {
        return this.polyline != null;
    }

    /* renamed from: h */
    public final void mo34912h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVWalkPolyline(");
        if (mo34911g()) {
            sb.append("polyline:");
            String str = this.polyline;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo34910f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("pathwayId:");
            sb.append(this.pathwayId);
        }
        sb.append(")");
        return sb.toString();
    }
}
