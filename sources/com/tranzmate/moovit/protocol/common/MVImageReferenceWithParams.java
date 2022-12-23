package com.tranzmate.moovit.protocol.common;

import com.appboy.support.StringUtils;
import com.usebutton.sdk.internal.models.Configuration;
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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import p001a0.C0016g;
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

public class MVImageReferenceWithParams implements TBase<MVImageReferenceWithParams, _Fields>, Serializable, Cloneable, Comparable<MVImageReferenceWithParams> {

    /* renamed from: b */
    public static final C25113c f25056b = new C25113c("imageId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25057c = new C25113c(Configuration.KEY_PARAMETERS, (byte) 15, 2);

    /* renamed from: d */
    public static final HashMap f25058d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f25059e;
    private byte __isset_bitfield = 0;
    public int imageId;
    public List<String> parameters;

    public enum _Fields implements C25085c {
        IMAGE_ID(1, "imageId"),
        PARAMETERS(2, Configuration.KEY_PARAMETERS);
        
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
                return IMAGE_ID;
            }
            if (i != 2) {
                return null;
            }
            return PARAMETERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams$a */
    public static class C8436a extends C25239c<MVImageReferenceWithParams> {
        public C8436a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithParams mVImageReferenceWithParams = (MVImageReferenceWithParams) tBase;
            mVImageReferenceWithParams.getClass();
            C25113c cVar = MVImageReferenceWithParams.f25056b;
            gVar.mo61687K();
            gVar.mo61711x(MVImageReferenceWithParams.f25056b);
            gVar.mo61678B(mVImageReferenceWithParams.imageId);
            gVar.mo61712y();
            if (mVImageReferenceWithParams.parameters != null) {
                gVar.mo61711x(MVImageReferenceWithParams.f25057c);
                gVar.mo61680D(new C25119e((byte) 11, mVImageReferenceWithParams.parameters.size()));
                for (String J : mVImageReferenceWithParams.parameters) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithParams mVImageReferenceWithParams = (MVImageReferenceWithParams) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVImageReferenceWithParams.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVImageReferenceWithParams.parameters = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVImageReferenceWithParams.parameters.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVImageReferenceWithParams.imageId = gVar.mo61696i();
                    mVImageReferenceWithParams.mo26250h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams$b */
    public static class C8437b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8436a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams$c */
    public static class C8438c extends C25240d<MVImageReferenceWithParams> {
        public C8438c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithParams mVImageReferenceWithParams = (MVImageReferenceWithParams) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVImageReferenceWithParams.mo26248f()) {
                bitSet.set(0);
            }
            if (mVImageReferenceWithParams.mo26249g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVImageReferenceWithParams.mo26248f()) {
                jVar.mo61678B(mVImageReferenceWithParams.imageId);
            }
            if (mVImageReferenceWithParams.mo26249g()) {
                jVar.mo61678B(mVImageReferenceWithParams.parameters.size());
                for (String J : mVImageReferenceWithParams.parameters) {
                    jVar.mo61686J(J);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVImageReferenceWithParams mVImageReferenceWithParams = (MVImageReferenceWithParams) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVImageReferenceWithParams.imageId = jVar.mo61696i();
                mVImageReferenceWithParams.mo26250h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVImageReferenceWithParams.parameters = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVImageReferenceWithParams.parameters.add(jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams$d */
    public static class C8439d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8438c(0);
        }
    }

    static {
        new C17394d0("MVImageReferenceWithParams");
        HashMap hashMap = new HashMap();
        f25058d = hashMap;
        hashMap.put(C25239c.class, new C8437b());
        hashMap.put(C25240d.class, new C8439d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE_ID, new FieldMetaData("imageId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PARAMETERS, new FieldMetaData(Configuration.KEY_PARAMETERS, (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25059e = unmodifiableMap;
        FieldMetaData.m61947a(MVImageReferenceWithParams.class, unmodifiableMap);
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
        ((C25238b) f25058d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25058d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26245a(MVImageReferenceWithParams mVImageReferenceWithParams) {
        if (mVImageReferenceWithParams == null || this.imageId != mVImageReferenceWithParams.imageId) {
            return false;
        }
        boolean g = mo26249g();
        boolean g2 = mVImageReferenceWithParams.mo26249g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.parameters.equals(mVImageReferenceWithParams.parameters)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVImageReferenceWithParams mVImageReferenceWithParams = (MVImageReferenceWithParams) obj;
        if (!getClass().equals(mVImageReferenceWithParams.getClass())) {
            return getClass().getName().compareTo(mVImageReferenceWithParams.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26248f()).compareTo(Boolean.valueOf(mVImageReferenceWithParams.mo26248f()));
        if (compareTo != 0 || ((mo26248f() && (compareTo = C25082a.m62839c(this.imageId, mVImageReferenceWithParams.imageId)) != 0) || (compareTo = Boolean.valueOf(mo26249g()).compareTo(Boolean.valueOf(mVImageReferenceWithParams.mo26249g()))) != 0)) {
            return compareTo;
        }
        if (!mo26249g() || (h = C25082a.m62844h(this.parameters, mVImageReferenceWithParams.parameters)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVImageReferenceWithParams)) {
            return mo26245a((MVImageReferenceWithParams) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26248f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo26249g() {
        return this.parameters != null;
    }

    /* renamed from: h */
    public final void mo26250h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVImageReferenceWithParams(", "imageId:");
        C0016g.m42z(n, this.imageId, ", ", "parameters:");
        List<String> list = this.parameters;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
