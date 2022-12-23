package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import p358af.C13437d;
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

public class MVMicroMobilityReportDamageRequest implements TBase<MVMicroMobilityReportDamageRequest, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityReportDamageRequest> {

    /* renamed from: b */
    public static final C25113c f26713b = new C25113c("serviceId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26714c = new C25113c("itemId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26715d = new C25113c("damageDescription", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26716e = new C25113c("images", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f26717f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26718g;
    public String damageDescription;
    public List<ByteBuffer> images;
    public String itemId;
    public String serviceId;

    public enum _Fields implements C25085c {
        SERVICE_ID(1, "serviceId"),
        ITEM_ID(2, "itemId"),
        DAMAGE_DESCRIPTION(3, "damageDescription"),
        IMAGES(4, "images");
        
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
                return SERVICE_ID;
            }
            if (i == 2) {
                return ITEM_ID;
            }
            if (i == 3) {
                return DAMAGE_DESCRIPTION;
            }
            if (i != 4) {
                return null;
            }
            return IMAGES;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityReportDamageRequest$a */
    public static class C9336a extends C25239c<MVMicroMobilityReportDamageRequest> {
        public C9336a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityReportDamageRequest mVMicroMobilityReportDamageRequest = (MVMicroMobilityReportDamageRequest) tBase;
            mVMicroMobilityReportDamageRequest.getClass();
            C25113c cVar = MVMicroMobilityReportDamageRequest.f26713b;
            gVar.mo61687K();
            if (mVMicroMobilityReportDamageRequest.serviceId != null) {
                gVar.mo61711x(MVMicroMobilityReportDamageRequest.f26713b);
                gVar.mo61686J(mVMicroMobilityReportDamageRequest.serviceId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityReportDamageRequest.itemId != null) {
                gVar.mo61711x(MVMicroMobilityReportDamageRequest.f26714c);
                gVar.mo61686J(mVMicroMobilityReportDamageRequest.itemId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityReportDamageRequest.damageDescription != null) {
                gVar.mo61711x(MVMicroMobilityReportDamageRequest.f26715d);
                gVar.mo61686J(mVMicroMobilityReportDamageRequest.damageDescription);
                gVar.mo61712y();
            }
            if (mVMicroMobilityReportDamageRequest.images != null) {
                gVar.mo61711x(MVMicroMobilityReportDamageRequest.f26716e);
                gVar.mo61680D(new C25119e((byte) 11, mVMicroMobilityReportDamageRequest.images.size()));
                for (ByteBuffer t : mVMicroMobilityReportDamageRequest.images) {
                    gVar.mo61707t(t);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityReportDamageRequest mVMicroMobilityReportDamageRequest = (MVMicroMobilityReportDamageRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityReportDamageRequest.getClass();
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
                                mVMicroMobilityReportDamageRequest.images = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    mVMicroMobilityReportDamageRequest.images.add(gVar.mo61689b());
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVMicroMobilityReportDamageRequest.damageDescription = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityReportDamageRequest.itemId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityReportDamageRequest.serviceId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityReportDamageRequest$b */
    public static class C9337b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9336a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityReportDamageRequest$c */
    public static class C9338c extends C25240d<MVMicroMobilityReportDamageRequest> {
        public C9338c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityReportDamageRequest mVMicroMobilityReportDamageRequest = (MVMicroMobilityReportDamageRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityReportDamageRequest.mo28960i()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityReportDamageRequest.mo28958h()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityReportDamageRequest.mo28956f()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityReportDamageRequest.mo28957g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVMicroMobilityReportDamageRequest.mo28960i()) {
                jVar.mo61686J(mVMicroMobilityReportDamageRequest.serviceId);
            }
            if (mVMicroMobilityReportDamageRequest.mo28958h()) {
                jVar.mo61686J(mVMicroMobilityReportDamageRequest.itemId);
            }
            if (mVMicroMobilityReportDamageRequest.mo28956f()) {
                jVar.mo61686J(mVMicroMobilityReportDamageRequest.damageDescription);
            }
            if (mVMicroMobilityReportDamageRequest.mo28957g()) {
                jVar.mo61678B(mVMicroMobilityReportDamageRequest.images.size());
                for (ByteBuffer t : mVMicroMobilityReportDamageRequest.images) {
                    jVar.mo61707t(t);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityReportDamageRequest mVMicroMobilityReportDamageRequest = (MVMicroMobilityReportDamageRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVMicroMobilityReportDamageRequest.serviceId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityReportDamageRequest.itemId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityReportDamageRequest.damageDescription = jVar.mo61704q();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVMicroMobilityReportDamageRequest.images = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVMicroMobilityReportDamageRequest.images.add(jVar.mo61689b());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityReportDamageRequest$d */
    public static class C9339d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9338c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityReportDamageRequest");
        HashMap hashMap = new HashMap();
        f26717f = hashMap;
        hashMap.put(C25239c.class, new C9337b());
        hashMap.put(C25240d.class, new C9339d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SERVICE_ID, new FieldMetaData("serviceId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ITEM_ID, new FieldMetaData("itemId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DAMAGE_DESCRIPTION, new FieldMetaData("damageDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGES, new FieldMetaData("images", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, true))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26718g = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityReportDamageRequest.class, unmodifiableMap);
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
        ((C25238b) f26717f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26717f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVMicroMobilityReportDamageRequest mVMicroMobilityReportDamageRequest = (MVMicroMobilityReportDamageRequest) obj;
        if (!getClass().equals(mVMicroMobilityReportDamageRequest.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityReportDamageRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28960i()).compareTo(Boolean.valueOf(mVMicroMobilityReportDamageRequest.mo28960i()));
        if (compareTo != 0 || ((mo28960i() && (compareTo = this.serviceId.compareTo(mVMicroMobilityReportDamageRequest.serviceId)) != 0) || (compareTo = Boolean.valueOf(mo28958h()).compareTo(Boolean.valueOf(mVMicroMobilityReportDamageRequest.mo28958h()))) != 0 || ((mo28958h() && (compareTo = this.itemId.compareTo(mVMicroMobilityReportDamageRequest.itemId)) != 0) || (compareTo = Boolean.valueOf(mo28956f()).compareTo(Boolean.valueOf(mVMicroMobilityReportDamageRequest.mo28956f()))) != 0 || ((mo28956f() && (compareTo = this.damageDescription.compareTo(mVMicroMobilityReportDamageRequest.damageDescription)) != 0) || (compareTo = Boolean.valueOf(mo28957g()).compareTo(Boolean.valueOf(mVMicroMobilityReportDamageRequest.mo28957g()))) != 0)))) {
            return compareTo;
        }
        if (!mo28957g() || (h = C25082a.m62844h(this.images, mVMicroMobilityReportDamageRequest.images)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityReportDamageRequest)) {
            return false;
        }
        MVMicroMobilityReportDamageRequest mVMicroMobilityReportDamageRequest = (MVMicroMobilityReportDamageRequest) obj;
        boolean i = mo28960i();
        boolean i2 = mVMicroMobilityReportDamageRequest.mo28960i();
        if ((i || i2) && (!i || !i2 || !this.serviceId.equals(mVMicroMobilityReportDamageRequest.serviceId))) {
            return false;
        }
        boolean h = mo28958h();
        boolean h2 = mVMicroMobilityReportDamageRequest.mo28958h();
        if ((h || h2) && (!h || !h2 || !this.itemId.equals(mVMicroMobilityReportDamageRequest.itemId))) {
            return false;
        }
        boolean f = mo28956f();
        boolean f2 = mVMicroMobilityReportDamageRequest.mo28956f();
        if ((f || f2) && (!f || !f2 || !this.damageDescription.equals(mVMicroMobilityReportDamageRequest.damageDescription))) {
            return false;
        }
        boolean g = mo28957g();
        boolean g2 = mVMicroMobilityReportDamageRequest.mo28957g();
        if ((g || g2) && (!g || !g2 || !this.images.equals(mVMicroMobilityReportDamageRequest.images))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28956f() {
        return this.damageDescription != null;
    }

    /* renamed from: g */
    public final boolean mo28957g() {
        return this.images != null;
    }

    /* renamed from: h */
    public final boolean mo28958h() {
        return this.itemId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28960i() {
        return this.serviceId != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityReportDamageRequest(", "serviceId:");
        String str = this.serviceId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("itemId:");
        String str2 = this.itemId;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("damageDescription:");
        String str3 = this.damageDescription;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("images:");
        List<ByteBuffer> list = this.images;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
