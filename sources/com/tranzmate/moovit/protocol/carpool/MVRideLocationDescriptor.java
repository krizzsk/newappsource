package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVRideLocationDescriptor implements TBase<MVRideLocationDescriptor, _Fields>, Serializable, Cloneable, Comparable<MVRideLocationDescriptor> {

    /* renamed from: b */
    public static final C25113c f24859b = new C25113c("latlon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24860c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24861d = new C25113c("address", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24862e = new C25113c("streetViewDetails", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f24863f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24864g;
    public String address;
    public MVLatLon latlon;
    public String name;
    private _Fields[] optionals = {_Fields.STREET_VIEW_DETAILS};
    public MVStreetViewDetails streetViewDetails;

    public enum _Fields implements C25085c {
        LATLON(1, "latlon"),
        NAME(2, "name"),
        ADDRESS(3, "address"),
        STREET_VIEW_DETAILS(4, "streetViewDetails");
        
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
                return LATLON;
            }
            if (i == 2) {
                return NAME;
            }
            if (i == 3) {
                return ADDRESS;
            }
            if (i != 4) {
                return null;
            }
            return STREET_VIEW_DETAILS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor$a */
    public static class C8303a extends C25239c<MVRideLocationDescriptor> {
        public C8303a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideLocationDescriptor mVRideLocationDescriptor = (MVRideLocationDescriptor) tBase;
            mVRideLocationDescriptor.mo25878j();
            C25113c cVar = MVRideLocationDescriptor.f24859b;
            gVar.mo61687K();
            if (mVRideLocationDescriptor.latlon != null) {
                gVar.mo61711x(MVRideLocationDescriptor.f24859b);
                mVRideLocationDescriptor.latlon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRideLocationDescriptor.name != null) {
                gVar.mo61711x(MVRideLocationDescriptor.f24860c);
                gVar.mo61686J(mVRideLocationDescriptor.name);
                gVar.mo61712y();
            }
            if (mVRideLocationDescriptor.address != null) {
                gVar.mo61711x(MVRideLocationDescriptor.f24861d);
                gVar.mo61686J(mVRideLocationDescriptor.address);
                gVar.mo61712y();
            }
            if (mVRideLocationDescriptor.streetViewDetails != null && mVRideLocationDescriptor.mo25877i()) {
                gVar.mo61711x(MVRideLocationDescriptor.f24862e);
                mVRideLocationDescriptor.streetViewDetails.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideLocationDescriptor mVRideLocationDescriptor = (MVRideLocationDescriptor) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRideLocationDescriptor.mo25878j();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVStreetViewDetails mVStreetViewDetails = new MVStreetViewDetails();
                                mVRideLocationDescriptor.streetViewDetails = mVStreetViewDetails;
                                mVStreetViewDetails.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVRideLocationDescriptor.address = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVRideLocationDescriptor.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLatLon mVLatLon = new MVLatLon();
                    mVRideLocationDescriptor.latlon = mVLatLon;
                    mVLatLon.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor$b */
    public static class C8304b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8303a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor$c */
    public static class C8305c extends C25240d<MVRideLocationDescriptor> {
        public C8305c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideLocationDescriptor mVRideLocationDescriptor = (MVRideLocationDescriptor) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRideLocationDescriptor.mo25874g()) {
                bitSet.set(0);
            }
            if (mVRideLocationDescriptor.mo25875h()) {
                bitSet.set(1);
            }
            if (mVRideLocationDescriptor.mo25873f()) {
                bitSet.set(2);
            }
            if (mVRideLocationDescriptor.mo25877i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVRideLocationDescriptor.mo25874g()) {
                mVRideLocationDescriptor.latlon.mo25202X0(jVar);
            }
            if (mVRideLocationDescriptor.mo25875h()) {
                jVar.mo61686J(mVRideLocationDescriptor.name);
            }
            if (mVRideLocationDescriptor.mo25873f()) {
                jVar.mo61686J(mVRideLocationDescriptor.address);
            }
            if (mVRideLocationDescriptor.mo25877i()) {
                mVRideLocationDescriptor.streetViewDetails.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideLocationDescriptor mVRideLocationDescriptor = (MVRideLocationDescriptor) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVRideLocationDescriptor.latlon = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVRideLocationDescriptor.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVRideLocationDescriptor.address = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVStreetViewDetails mVStreetViewDetails = new MVStreetViewDetails();
                mVRideLocationDescriptor.streetViewDetails = mVStreetViewDetails;
                mVStreetViewDetails.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideLocationDescriptor$d */
    public static class C8306d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8305c(0);
        }
    }

    static {
        new C17394d0("MVRideLocationDescriptor");
        HashMap hashMap = new HashMap();
        f24863f = hashMap;
        hashMap.put(C25239c.class, new C8304b());
        hashMap.put(C25240d.class, new C8306d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LATLON, new FieldMetaData("latlon", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ADDRESS, new FieldMetaData("address", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.STREET_VIEW_DETAILS, new FieldMetaData("streetViewDetails", (byte) 2, new StructMetaData(MVStreetViewDetails.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24864g = unmodifiableMap;
        FieldMetaData.m61947a(MVRideLocationDescriptor.class, unmodifiableMap);
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
        ((C25238b) f24863f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24863f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25870a(MVRideLocationDescriptor mVRideLocationDescriptor) {
        if (mVRideLocationDescriptor == null) {
            return false;
        }
        boolean g = mo25874g();
        boolean g2 = mVRideLocationDescriptor.mo25874g();
        if ((g || g2) && (!g || !g2 || !this.latlon.mo26290a(mVRideLocationDescriptor.latlon))) {
            return false;
        }
        boolean h = mo25875h();
        boolean h2 = mVRideLocationDescriptor.mo25875h();
        if ((h || h2) && (!h || !h2 || !this.name.equals(mVRideLocationDescriptor.name))) {
            return false;
        }
        boolean f = mo25873f();
        boolean f2 = mVRideLocationDescriptor.mo25873f();
        if ((f || f2) && (!f || !f2 || !this.address.equals(mVRideLocationDescriptor.address))) {
            return false;
        }
        boolean i = mo25877i();
        boolean i2 = mVRideLocationDescriptor.mo25877i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.streetViewDetails.mo25935a(mVRideLocationDescriptor.streetViewDetails)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRideLocationDescriptor mVRideLocationDescriptor = (MVRideLocationDescriptor) obj;
        if (!getClass().equals(mVRideLocationDescriptor.getClass())) {
            return getClass().getName().compareTo(mVRideLocationDescriptor.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25874g()).compareTo(Boolean.valueOf(mVRideLocationDescriptor.mo25874g()));
        if (compareTo2 != 0 || ((mo25874g() && (compareTo2 = this.latlon.compareTo(mVRideLocationDescriptor.latlon)) != 0) || (compareTo2 = Boolean.valueOf(mo25875h()).compareTo(Boolean.valueOf(mVRideLocationDescriptor.mo25875h()))) != 0 || ((mo25875h() && (compareTo2 = this.name.compareTo(mVRideLocationDescriptor.name)) != 0) || (compareTo2 = Boolean.valueOf(mo25873f()).compareTo(Boolean.valueOf(mVRideLocationDescriptor.mo25873f()))) != 0 || ((mo25873f() && (compareTo2 = this.address.compareTo(mVRideLocationDescriptor.address)) != 0) || (compareTo2 = Boolean.valueOf(mo25877i()).compareTo(Boolean.valueOf(mVRideLocationDescriptor.mo25877i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo25877i() || (compareTo = this.streetViewDetails.compareTo(mVRideLocationDescriptor.streetViewDetails)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVRideLocationDescriptor)) {
            return mo25870a((MVRideLocationDescriptor) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25873f() {
        return this.address != null;
    }

    /* renamed from: g */
    public final boolean mo25874g() {
        return this.latlon != null;
    }

    /* renamed from: h */
    public final boolean mo25875h() {
        return this.name != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25877i() {
        return this.streetViewDetails != null;
    }

    /* renamed from: j */
    public final void mo25878j() throws TException {
        MVLatLon mVLatLon = this.latlon;
        if (mVLatLon != null) {
            mVLatLon.getClass();
        }
        MVStreetViewDetails mVStreetViewDetails = this.streetViewDetails;
        if (mVStreetViewDetails != null) {
            mVStreetViewDetails.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRideLocationDescriptor(", "latlon:");
        MVLatLon mVLatLon = this.latlon;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("address:");
        String str2 = this.address;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo25877i()) {
            n.append(", ");
            n.append("streetViewDetails:");
            MVStreetViewDetails mVStreetViewDetails = this.streetViewDetails;
            if (mVStreetViewDetails == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVStreetViewDetails);
            }
        }
        n.append(")");
        return n.toString();
    }
}
