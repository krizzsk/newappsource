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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVPolylineDescriptor implements TBase<MVPolylineDescriptor, _Fields>, Serializable, Cloneable, Comparable<MVPolylineDescriptor> {

    /* renamed from: b */
    public static final C25113c f30031b = new C25113c("polyline", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30032c = new C25113c("mode", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f30033d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30034e;
    public MVPolyLineMode mode;
    public String polyline;

    public enum _Fields implements C25085c {
        POLYLINE(1, "polyline"),
        MODE(2, "mode");
        
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
            return MODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPolylineDescriptor$a */
    public static class C11610a extends C25239c<MVPolylineDescriptor> {
        public C11610a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPolylineDescriptor mVPolylineDescriptor = (MVPolylineDescriptor) tBase;
            mVPolylineDescriptor.getClass();
            C25113c cVar = MVPolylineDescriptor.f30031b;
            gVar.mo61687K();
            if (mVPolylineDescriptor.polyline != null) {
                gVar.mo61711x(MVPolylineDescriptor.f30031b);
                gVar.mo61686J(mVPolylineDescriptor.polyline);
                gVar.mo61712y();
            }
            if (mVPolylineDescriptor.mode != null) {
                gVar.mo61711x(MVPolylineDescriptor.f30032c);
                gVar.mo61678B(mVPolylineDescriptor.mode.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPolylineDescriptor mVPolylineDescriptor = (MVPolylineDescriptor) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPolylineDescriptor.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVPolylineDescriptor.mode = MVPolyLineMode.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPolylineDescriptor.polyline = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPolylineDescriptor$b */
    public static class C11611b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11610a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPolylineDescriptor$c */
    public static class C11612c extends C25240d<MVPolylineDescriptor> {
        public C11612c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPolylineDescriptor mVPolylineDescriptor = (MVPolylineDescriptor) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPolylineDescriptor.mo34506g()) {
                bitSet.set(0);
            }
            if (mVPolylineDescriptor.mo34505f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPolylineDescriptor.mo34506g()) {
                jVar.mo61686J(mVPolylineDescriptor.polyline);
            }
            if (mVPolylineDescriptor.mo34505f()) {
                jVar.mo61678B(mVPolylineDescriptor.mode.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPolylineDescriptor mVPolylineDescriptor = (MVPolylineDescriptor) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPolylineDescriptor.polyline = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPolylineDescriptor.mode = MVPolyLineMode.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVPolylineDescriptor$d */
    public static class C11613d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11612c(0);
        }
    }

    static {
        new C17394d0("MVPolylineDescriptor");
        HashMap hashMap = new HashMap();
        f30033d = hashMap;
        hashMap.put(C25239c.class, new C11611b());
        hashMap.put(C25240d.class, new C11613d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.POLYLINE, new FieldMetaData("polyline", (byte) 3, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        enumMap.put(_Fields.MODE, new FieldMetaData("mode", (byte) 3, new EnumMetaData(MVPolyLineMode.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30034e = unmodifiableMap;
        FieldMetaData.m61947a(MVPolylineDescriptor.class, unmodifiableMap);
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
        ((C25238b) f30033d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30033d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPolylineDescriptor mVPolylineDescriptor = (MVPolylineDescriptor) obj;
        if (!getClass().equals(mVPolylineDescriptor.getClass())) {
            return getClass().getName().compareTo(mVPolylineDescriptor.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34506g()).compareTo(Boolean.valueOf(mVPolylineDescriptor.mo34506g()));
        if (compareTo2 != 0 || ((mo34506g() && (compareTo2 = this.polyline.compareTo(mVPolylineDescriptor.polyline)) != 0) || (compareTo2 = Boolean.valueOf(mo34505f()).compareTo(Boolean.valueOf(mVPolylineDescriptor.mo34505f()))) != 0)) {
            return compareTo2;
        }
        if (!mo34505f() || (compareTo = this.mode.compareTo(mVPolylineDescriptor.mode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPolylineDescriptor)) {
            return false;
        }
        MVPolylineDescriptor mVPolylineDescriptor = (MVPolylineDescriptor) obj;
        boolean g = mo34506g();
        boolean g2 = mVPolylineDescriptor.mo34506g();
        if ((g || g2) && (!g || !g2 || !this.polyline.equals(mVPolylineDescriptor.polyline))) {
            return false;
        }
        boolean f = mo34505f();
        boolean f2 = mVPolylineDescriptor.mo34505f();
        if ((f || f2) && (!f || !f2 || !this.mode.equals(mVPolylineDescriptor.mode))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34505f() {
        return this.mode != null;
    }

    /* renamed from: g */
    public final boolean mo34506g() {
        return this.polyline != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPolylineDescriptor(", "polyline:");
        String str = this.polyline;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("mode:");
        MVPolyLineMode mVPolyLineMode = this.mode;
        if (mVPolyLineMode == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPolyLineMode);
        }
        n.append(")");
        return n.toString();
    }
}
