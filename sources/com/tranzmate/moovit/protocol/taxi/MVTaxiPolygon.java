package com.tranzmate.moovit.protocol.taxi;

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

public class MVTaxiPolygon implements TBase<MVTaxiPolygon, _Fields>, Serializable, Cloneable, Comparable<MVTaxiPolygon> {

    /* renamed from: b */
    public static final C25113c f28615b = new C25113c("polygon", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28616c = new C25113c("settings", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f28617d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28618e;
    public String polygon;
    public MVTaxiPolygonSettings settings;

    public enum _Fields implements C25085c {
        POLYGON(1, "polygon"),
        SETTINGS(2, "settings");
        
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
            return SETTINGS;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPolygon$a */
    public static class C10732a extends C25239c<MVTaxiPolygon> {
        public C10732a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPolygon mVTaxiPolygon = (MVTaxiPolygon) tBase;
            MVTaxiPolygonSettings mVTaxiPolygonSettings = mVTaxiPolygon.settings;
            C25113c cVar = MVTaxiPolygon.f28615b;
            gVar.mo61687K();
            if (mVTaxiPolygon.polygon != null) {
                gVar.mo61711x(MVTaxiPolygon.f28615b);
                gVar.mo61686J(mVTaxiPolygon.polygon);
                gVar.mo61712y();
            }
            if (mVTaxiPolygon.settings != null) {
                gVar.mo61711x(MVTaxiPolygon.f28616c);
                mVTaxiPolygon.settings.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPolygon mVTaxiPolygon = (MVTaxiPolygon) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTaxiPolygonSettings mVTaxiPolygonSettings = mVTaxiPolygon.settings;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVTaxiPolygonSettings mVTaxiPolygonSettings2 = new MVTaxiPolygonSettings();
                        mVTaxiPolygon.settings = mVTaxiPolygonSettings2;
                        mVTaxiPolygonSettings2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTaxiPolygon.polygon = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPolygon$b */
    public static class C10733b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10732a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPolygon$c */
    public static class C10734c extends C25240d<MVTaxiPolygon> {
        public C10734c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPolygon mVTaxiPolygon = (MVTaxiPolygon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiPolygon.mo32220f()) {
                bitSet.set(0);
            }
            if (mVTaxiPolygon.mo32221g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTaxiPolygon.mo32220f()) {
                jVar.mo61686J(mVTaxiPolygon.polygon);
            }
            if (mVTaxiPolygon.mo32221g()) {
                mVTaxiPolygon.settings.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPolygon mVTaxiPolygon = (MVTaxiPolygon) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTaxiPolygon.polygon = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVTaxiPolygonSettings mVTaxiPolygonSettings = new MVTaxiPolygonSettings();
                mVTaxiPolygon.settings = mVTaxiPolygonSettings;
                mVTaxiPolygonSettings.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPolygon$d */
    public static class C10735d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10734c(0);
        }
    }

    static {
        new C17394d0("MVTaxiPolygon");
        HashMap hashMap = new HashMap();
        f28617d = hashMap;
        hashMap.put(C25239c.class, new C10733b());
        hashMap.put(C25240d.class, new C10735d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.POLYGON, new FieldMetaData("polygon", (byte) 3, new FieldValueMetaData((byte) 11, "GoogleEncodedPolygon")));
        enumMap.put(_Fields.SETTINGS, new FieldMetaData("settings", (byte) 3, new StructMetaData(MVTaxiPolygonSettings.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28618e = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiPolygon.class, unmodifiableMap);
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
        ((C25238b) f28617d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28617d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiPolygon mVTaxiPolygon = (MVTaxiPolygon) obj;
        if (!getClass().equals(mVTaxiPolygon.getClass())) {
            return getClass().getName().compareTo(mVTaxiPolygon.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32220f()).compareTo(Boolean.valueOf(mVTaxiPolygon.mo32220f()));
        if (compareTo2 != 0 || ((mo32220f() && (compareTo2 = this.polygon.compareTo(mVTaxiPolygon.polygon)) != 0) || (compareTo2 = Boolean.valueOf(mo32221g()).compareTo(Boolean.valueOf(mVTaxiPolygon.mo32221g()))) != 0)) {
            return compareTo2;
        }
        if (!mo32221g() || (compareTo = this.settings.compareTo(mVTaxiPolygon.settings)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTaxiPolygon)) {
            return false;
        }
        MVTaxiPolygon mVTaxiPolygon = (MVTaxiPolygon) obj;
        boolean f = mo32220f();
        boolean f2 = mVTaxiPolygon.mo32220f();
        if ((f || f2) && (!f || !f2 || !this.polygon.equals(mVTaxiPolygon.polygon))) {
            return false;
        }
        boolean g = mo32221g();
        boolean g2 = mVTaxiPolygon.mo32221g();
        if ((g || g2) && (!g || !g2 || !this.settings.mo32225a(mVTaxiPolygon.settings))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32220f() {
        return this.polygon != null;
    }

    /* renamed from: g */
    public final boolean mo32221g() {
        return this.settings != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiPolygon(", "polygon:");
        String str = this.polygon;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("settings:");
        MVTaxiPolygonSettings mVTaxiPolygonSettings = this.settings;
        if (mVTaxiPolygonSettings == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTaxiPolygonSettings);
        }
        n.append(")");
        return n.toString();
    }
}
