package com.tranzmate.moovit.protocol.mobileeditor;

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

public class MVMobileEditorDeleteStopRequest implements TBase<MVMobileEditorDeleteStopRequest, _Fields>, Serializable, Cloneable, Comparable<MVMobileEditorDeleteStopRequest> {

    /* renamed from: b */
    public static final C25113c f26797b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26798c = new C25113c("userLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f26799d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26800e;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.USER_LOCATION};
    public int stopId;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId"),
        USER_LOCATION(2, "userLocation");
        
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
                return STOP_ID;
            }
            if (i != 2) {
                return null;
            }
            return USER_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteStopRequest$a */
    public static class C9392a extends C25239c<MVMobileEditorDeleteStopRequest> {
        public C9392a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorDeleteStopRequest mVMobileEditorDeleteStopRequest = (MVMobileEditorDeleteStopRequest) tBase;
            MVLatLon mVLatLon = mVMobileEditorDeleteStopRequest.userLocation;
            C25113c cVar = MVMobileEditorDeleteStopRequest.f26797b;
            gVar.mo61687K();
            gVar.mo61711x(MVMobileEditorDeleteStopRequest.f26797b);
            gVar.mo61678B(mVMobileEditorDeleteStopRequest.stopId);
            gVar.mo61712y();
            if (mVMobileEditorDeleteStopRequest.userLocation != null && mVMobileEditorDeleteStopRequest.mo29100g()) {
                gVar.mo61711x(MVMobileEditorDeleteStopRequest.f26798c);
                mVMobileEditorDeleteStopRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorDeleteStopRequest mVMobileEditorDeleteStopRequest = (MVMobileEditorDeleteStopRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVMobileEditorDeleteStopRequest.userLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVLatLon mVLatLon2 = new MVLatLon();
                        mVMobileEditorDeleteStopRequest.userLocation = mVLatLon2;
                        mVLatLon2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVMobileEditorDeleteStopRequest.stopId = gVar.mo61696i();
                    mVMobileEditorDeleteStopRequest.mo29101h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteStopRequest$b */
    public static class C9393b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9392a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteStopRequest$c */
    public static class C9394c extends C25240d<MVMobileEditorDeleteStopRequest> {
        public C9394c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorDeleteStopRequest mVMobileEditorDeleteStopRequest = (MVMobileEditorDeleteStopRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMobileEditorDeleteStopRequest.mo29099f()) {
                bitSet.set(0);
            }
            if (mVMobileEditorDeleteStopRequest.mo29100g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMobileEditorDeleteStopRequest.mo29099f()) {
                jVar.mo61678B(mVMobileEditorDeleteStopRequest.stopId);
            }
            if (mVMobileEditorDeleteStopRequest.mo29100g()) {
                mVMobileEditorDeleteStopRequest.userLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMobileEditorDeleteStopRequest mVMobileEditorDeleteStopRequest = (MVMobileEditorDeleteStopRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVMobileEditorDeleteStopRequest.stopId = jVar.mo61696i();
                mVMobileEditorDeleteStopRequest.mo29101h();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMobileEditorDeleteStopRequest.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mobileeditor.MVMobileEditorDeleteStopRequest$d */
    public static class C9395d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9394c(0);
        }
    }

    static {
        new C17394d0("MVMobileEditorDeleteStopRequest");
        HashMap hashMap = new HashMap();
        f26799d = hashMap;
        hashMap.put(C25239c.class, new C9393b());
        hashMap.put(C25240d.class, new C9395d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26800e = unmodifiableMap;
        FieldMetaData.m61947a(MVMobileEditorDeleteStopRequest.class, unmodifiableMap);
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
        ((C25238b) f26799d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26799d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMobileEditorDeleteStopRequest mVMobileEditorDeleteStopRequest = (MVMobileEditorDeleteStopRequest) obj;
        if (!getClass().equals(mVMobileEditorDeleteStopRequest.getClass())) {
            return getClass().getName().compareTo(mVMobileEditorDeleteStopRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29099f()).compareTo(Boolean.valueOf(mVMobileEditorDeleteStopRequest.mo29099f()));
        if (compareTo2 != 0 || ((mo29099f() && (compareTo2 = C25082a.m62839c(this.stopId, mVMobileEditorDeleteStopRequest.stopId)) != 0) || (compareTo2 = Boolean.valueOf(mo29100g()).compareTo(Boolean.valueOf(mVMobileEditorDeleteStopRequest.mo29100g()))) != 0)) {
            return compareTo2;
        }
        if (!mo29100g() || (compareTo = this.userLocation.compareTo(mVMobileEditorDeleteStopRequest.userLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMobileEditorDeleteStopRequest)) {
            return false;
        }
        MVMobileEditorDeleteStopRequest mVMobileEditorDeleteStopRequest = (MVMobileEditorDeleteStopRequest) obj;
        if (this.stopId != mVMobileEditorDeleteStopRequest.stopId) {
            return false;
        }
        boolean g = mo29100g();
        boolean g2 = mVMobileEditorDeleteStopRequest.mo29100g();
        if ((g || g2) && (!g || !g2 || !this.userLocation.mo26290a(mVMobileEditorDeleteStopRequest.userLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29099f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29100g() {
        return this.userLocation != null;
    }

    /* renamed from: h */
    public final void mo29101h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMobileEditorDeleteStopRequest(", "stopId:");
        n.append(this.stopId);
        if (mo29100g()) {
            n.append(", ");
            n.append("userLocation:");
            MVLatLon mVLatLon = this.userLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        n.append(")");
        return n.toString();
    }
}
