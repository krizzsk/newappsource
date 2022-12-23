package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVCar implements TBase<MVCar, _Fields>, Serializable, Cloneable, Comparable<MVCar> {

    /* renamed from: b */
    public static final C25113c f24609b = new C25113c("number", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24610c = new C25113c(ServerParameters.MODEL, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24611d = new C25113c("color", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24612e = new C25113c("maxNumPassengers", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f24613f = new C25113c("imageUrl", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f24614g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f24615h;
    private byte __isset_bitfield = 0;
    public String color;
    public String imageUrl;
    public int maxNumPassengers;
    public String model;
    public String number;
    private _Fields[] optionals = {_Fields.IMAGE_URL};

    public enum _Fields implements C25085c {
        NUMBER(1, "number"),
        MODEL(2, ServerParameters.MODEL),
        COLOR(3, "color"),
        MAX_NUM_PASSENGERS(4, "maxNumPassengers"),
        IMAGE_URL(5, "imageUrl");
        
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
                return NUMBER;
            }
            if (i == 2) {
                return MODEL;
            }
            if (i == 3) {
                return COLOR;
            }
            if (i == 4) {
                return MAX_NUM_PASSENGERS;
            }
            if (i != 5) {
                return null;
            }
            return IMAGE_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCar$a */
    public static class C8145a extends C25239c<MVCar> {
        public C8145a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCar mVCar = (MVCar) tBase;
            mVCar.getClass();
            C25113c cVar = MVCar.f24609b;
            gVar.mo61687K();
            if (mVCar.number != null) {
                gVar.mo61711x(MVCar.f24609b);
                gVar.mo61686J(mVCar.number);
                gVar.mo61712y();
            }
            if (mVCar.model != null) {
                gVar.mo61711x(MVCar.f24610c);
                gVar.mo61686J(mVCar.model);
                gVar.mo61712y();
            }
            if (mVCar.color != null) {
                gVar.mo61711x(MVCar.f24611d);
                gVar.mo61686J(mVCar.color);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCar.f24612e);
            gVar.mo61678B(mVCar.maxNumPassengers);
            gVar.mo61712y();
            if (mVCar.imageUrl != null && mVCar.mo25412g()) {
                gVar.mo61711x(MVCar.f24613f);
                gVar.mo61686J(mVCar.imageUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCar mVCar = (MVCar) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCar.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVCar.imageUrl = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVCar.maxNumPassengers = gVar.mo61696i();
                                mVCar.mo25417k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVCar.color = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCar.model = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCar.number = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCar$b */
    public static class C8146b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8145a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCar$c */
    public static class C8147c extends C25240d<MVCar> {
        public C8147c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCar mVCar = (MVCar) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCar.mo25416j()) {
                bitSet.set(0);
            }
            if (mVCar.mo25415i()) {
                bitSet.set(1);
            }
            if (mVCar.mo25411f()) {
                bitSet.set(2);
            }
            if (mVCar.mo25413h()) {
                bitSet.set(3);
            }
            if (mVCar.mo25412g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVCar.mo25416j()) {
                jVar.mo61686J(mVCar.number);
            }
            if (mVCar.mo25415i()) {
                jVar.mo61686J(mVCar.model);
            }
            if (mVCar.mo25411f()) {
                jVar.mo61686J(mVCar.color);
            }
            if (mVCar.mo25413h()) {
                jVar.mo61678B(mVCar.maxNumPassengers);
            }
            if (mVCar.mo25412g()) {
                jVar.mo61686J(mVCar.imageUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCar mVCar = (MVCar) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVCar.number = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCar.model = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCar.color = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCar.maxNumPassengers = jVar.mo61696i();
                mVCar.mo25417k();
            }
            if (T.get(4)) {
                mVCar.imageUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCar$d */
    public static class C8148d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8147c(0);
        }
    }

    static {
        new C17394d0("MVCar");
        HashMap hashMap = new HashMap();
        f24614g = hashMap;
        hashMap.put(C25239c.class, new C8146b());
        hashMap.put(C25240d.class, new C8148d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NUMBER, new FieldMetaData("number", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MODEL, new FieldMetaData(ServerParameters.MODEL, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.COLOR, new FieldMetaData("color", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MAX_NUM_PASSENGERS, new FieldMetaData("maxNumPassengers", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.IMAGE_URL, new FieldMetaData("imageUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24615h = unmodifiableMap;
        FieldMetaData.m61947a(MVCar.class, unmodifiableMap);
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
        ((C25238b) f24614g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24614g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25408a(MVCar mVCar) {
        if (mVCar == null) {
            return false;
        }
        boolean j = mo25416j();
        boolean j2 = mVCar.mo25416j();
        if ((j || j2) && (!j || !j2 || !this.number.equals(mVCar.number))) {
            return false;
        }
        boolean i = mo25415i();
        boolean i2 = mVCar.mo25415i();
        if ((i || i2) && (!i || !i2 || !this.model.equals(mVCar.model))) {
            return false;
        }
        boolean f = mo25411f();
        boolean f2 = mVCar.mo25411f();
        if (((f || f2) && (!f || !f2 || !this.color.equals(mVCar.color))) || this.maxNumPassengers != mVCar.maxNumPassengers) {
            return false;
        }
        boolean g = mo25412g();
        boolean g2 = mVCar.mo25412g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.imageUrl.equals(mVCar.imageUrl)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCar mVCar = (MVCar) obj;
        if (!getClass().equals(mVCar.getClass())) {
            return getClass().getName().compareTo(mVCar.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25416j()).compareTo(Boolean.valueOf(mVCar.mo25416j()));
        if (compareTo2 != 0 || ((mo25416j() && (compareTo2 = this.number.compareTo(mVCar.number)) != 0) || (compareTo2 = Boolean.valueOf(mo25415i()).compareTo(Boolean.valueOf(mVCar.mo25415i()))) != 0 || ((mo25415i() && (compareTo2 = this.model.compareTo(mVCar.model)) != 0) || (compareTo2 = Boolean.valueOf(mo25411f()).compareTo(Boolean.valueOf(mVCar.mo25411f()))) != 0 || ((mo25411f() && (compareTo2 = this.color.compareTo(mVCar.color)) != 0) || (compareTo2 = Boolean.valueOf(mo25413h()).compareTo(Boolean.valueOf(mVCar.mo25413h()))) != 0 || ((mo25413h() && (compareTo2 = C25082a.m62839c(this.maxNumPassengers, mVCar.maxNumPassengers)) != 0) || (compareTo2 = Boolean.valueOf(mo25412g()).compareTo(Boolean.valueOf(mVCar.mo25412g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo25412g() || (compareTo = this.imageUrl.compareTo(mVCar.imageUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCar)) {
            return mo25408a((MVCar) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25411f() {
        return this.color != null;
    }

    /* renamed from: g */
    public final boolean mo25412g() {
        return this.imageUrl != null;
    }

    /* renamed from: h */
    public final boolean mo25413h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25415i() {
        return this.model != null;
    }

    /* renamed from: j */
    public final boolean mo25416j() {
        return this.number != null;
    }

    /* renamed from: k */
    public final void mo25417k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCar(", "number:");
        String str = this.number;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("model:");
        String str2 = this.model;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("color:");
        String str3 = this.color;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("maxNumPassengers:");
        n.append(this.maxNumPassengers);
        if (mo25412g()) {
            n.append(", ");
            n.append("imageUrl:");
            String str4 = this.imageUrl;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        n.append(")");
        return n.toString();
    }
}
