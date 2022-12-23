package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParams;
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

public class MVMicroMobilityMarker implements TBase<MVMicroMobilityMarker, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityMarker> {

    /* renamed from: b */
    public static final C25113c f26563b = new C25113c(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26564c = new C25113c("imageRefSet", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f26565d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26566e;
    public MVImageReferenceSetWithParams imageRefSet;
    public MVLatLon location;

    public enum _Fields implements C25085c {
        LOCATION(1, FacebookUser.LOCATION_OUTER_OBJECT_KEY),
        IMAGE_REF_SET(2, "imageRefSet");
        
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
                return LOCATION;
            }
            if (i != 2) {
                return null;
            }
            return IMAGE_REF_SET;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityMarker$a */
    public static class C9239a extends C25239c<MVMicroMobilityMarker> {
        public C9239a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityMarker mVMicroMobilityMarker = (MVMicroMobilityMarker) tBase;
            MVLatLon mVLatLon = mVMicroMobilityMarker.location;
            C25113c cVar = MVMicroMobilityMarker.f26563b;
            gVar.mo61687K();
            if (mVMicroMobilityMarker.location != null) {
                gVar.mo61711x(MVMicroMobilityMarker.f26563b);
                mVMicroMobilityMarker.location.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityMarker.imageRefSet != null) {
                gVar.mo61711x(MVMicroMobilityMarker.f26564c);
                mVMicroMobilityMarker.imageRefSet.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityMarker mVMicroMobilityMarker = (MVMicroMobilityMarker) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVMicroMobilityMarker.location;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVImageReferenceSetWithParams mVImageReferenceSetWithParams = new MVImageReferenceSetWithParams();
                        mVMicroMobilityMarker.imageRefSet = mVImageReferenceSetWithParams;
                        mVImageReferenceSetWithParams.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVLatLon mVLatLon2 = new MVLatLon();
                    mVMicroMobilityMarker.location = mVLatLon2;
                    mVLatLon2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityMarker$b */
    public static class C9240b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9239a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityMarker$c */
    public static class C9241c extends C25240d<MVMicroMobilityMarker> {
        public C9241c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityMarker mVMicroMobilityMarker = (MVMicroMobilityMarker) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityMarker.mo28743g()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityMarker.mo28742f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMicroMobilityMarker.mo28743g()) {
                mVMicroMobilityMarker.location.mo25202X0(jVar);
            }
            if (mVMicroMobilityMarker.mo28742f()) {
                mVMicroMobilityMarker.imageRefSet.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityMarker mVMicroMobilityMarker = (MVMicroMobilityMarker) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMicroMobilityMarker.location = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVImageReferenceSetWithParams mVImageReferenceSetWithParams = new MVImageReferenceSetWithParams();
                mVMicroMobilityMarker.imageRefSet = mVImageReferenceSetWithParams;
                mVImageReferenceSetWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityMarker$d */
    public static class C9242d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9241c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityMarker");
        HashMap hashMap = new HashMap();
        f26565d = hashMap;
        hashMap.put(C25239c.class, new C9240b());
        hashMap.put(C25240d.class, new C9242d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LOCATION, new FieldMetaData(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.IMAGE_REF_SET, new FieldMetaData("imageRefSet", (byte) 3, new StructMetaData(MVImageReferenceSetWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26566e = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityMarker.class, unmodifiableMap);
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
        ((C25238b) f26565d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26565d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28739a(MVMicroMobilityMarker mVMicroMobilityMarker) {
        if (mVMicroMobilityMarker == null) {
            return false;
        }
        boolean g = mo28743g();
        boolean g2 = mVMicroMobilityMarker.mo28743g();
        if ((g || g2) && (!g || !g2 || !this.location.mo26290a(mVMicroMobilityMarker.location))) {
            return false;
        }
        boolean f = mo28742f();
        boolean f2 = mVMicroMobilityMarker.mo28742f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.imageRefSet.mo26230a(mVMicroMobilityMarker.imageRefSet)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityMarker mVMicroMobilityMarker = (MVMicroMobilityMarker) obj;
        if (!getClass().equals(mVMicroMobilityMarker.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityMarker.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28743g()).compareTo(Boolean.valueOf(mVMicroMobilityMarker.mo28743g()));
        if (compareTo2 != 0 || ((mo28743g() && (compareTo2 = this.location.compareTo(mVMicroMobilityMarker.location)) != 0) || (compareTo2 = Boolean.valueOf(mo28742f()).compareTo(Boolean.valueOf(mVMicroMobilityMarker.mo28742f()))) != 0)) {
            return compareTo2;
        }
        if (!mo28742f() || (compareTo = this.imageRefSet.compareTo(mVMicroMobilityMarker.imageRefSet)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMicroMobilityMarker)) {
            return mo28739a((MVMicroMobilityMarker) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28742f() {
        return this.imageRefSet != null;
    }

    /* renamed from: g */
    public final boolean mo28743g() {
        return this.location != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityMarker(", "location:");
        MVLatLon mVLatLon = this.location;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("imageRefSet:");
        MVImageReferenceSetWithParams mVImageReferenceSetWithParams = this.imageRefSet;
        if (mVImageReferenceSetWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceSetWithParams);
        }
        n.append(")");
        return n.toString();
    }
}
