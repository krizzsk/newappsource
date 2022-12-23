package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVMicroMobilityWalletResponse implements TBase<MVMicroMobilityWalletResponse, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityWalletResponse> {

    /* renamed from: b */
    public static final C25113c f26764b = new C25113c("rides", (byte) 15, 1);

    /* renamed from: c */
    public static final HashMap f26765c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26766d;
    public List<MVMicroMobilityRide> rides;

    public enum _Fields implements C25085c {
        RIDES(1, "rides");
        
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
            if (i != 1) {
                return null;
            }
            return RIDES;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityWalletResponse$a */
    public static class C9360a extends C25239c<MVMicroMobilityWalletResponse> {
        public C9360a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityWalletResponse mVMicroMobilityWalletResponse = (MVMicroMobilityWalletResponse) tBase;
            mVMicroMobilityWalletResponse.getClass();
            C25113c cVar = MVMicroMobilityWalletResponse.f26764b;
            gVar.mo61687K();
            if (mVMicroMobilityWalletResponse.rides != null) {
                gVar.mo61711x(MVMicroMobilityWalletResponse.f26764b);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityWalletResponse.rides.size()));
                for (MVMicroMobilityRide X0 : mVMicroMobilityWalletResponse.rides) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityWalletResponse mVMicroMobilityWalletResponse = (MVMicroMobilityWalletResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityWalletResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 15) {
                    C25119e k = gVar.mo61698k();
                    mVMicroMobilityWalletResponse.rides = new ArrayList(k.f63395b);
                    for (int i = 0; i < k.f63395b; i++) {
                        MVMicroMobilityRide mVMicroMobilityRide = new MVMicroMobilityRide();
                        mVMicroMobilityRide.mo25201C1(gVar);
                        mVMicroMobilityWalletResponse.rides.add(mVMicroMobilityRide);
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityWalletResponse$b */
    public static class C9361b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9360a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityWalletResponse$c */
    public static class C9362c extends C25240d<MVMicroMobilityWalletResponse> {
        public C9362c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityWalletResponse mVMicroMobilityWalletResponse = (MVMicroMobilityWalletResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityWalletResponse.mo29039f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityWalletResponse.mo29039f()) {
                jVar.mo61678B(mVMicroMobilityWalletResponse.rides.size());
                for (MVMicroMobilityRide X0 : mVMicroMobilityWalletResponse.rides) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityWalletResponse mVMicroMobilityWalletResponse = (MVMicroMobilityWalletResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                int i = jVar.mo61696i();
                mVMicroMobilityWalletResponse.rides = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVMicroMobilityRide mVMicroMobilityRide = new MVMicroMobilityRide();
                    mVMicroMobilityRide.mo25201C1(jVar);
                    mVMicroMobilityWalletResponse.rides.add(mVMicroMobilityRide);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityWalletResponse$d */
    public static class C9363d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9362c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityWalletResponse");
        HashMap hashMap = new HashMap();
        f26765c = hashMap;
        hashMap.put(C25239c.class, new C9361b());
        hashMap.put(C25240d.class, new C9363d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDES, new FieldMetaData("rides", (byte) 3, new ListMetaData(new StructMetaData(MVMicroMobilityRide.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26766d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityWalletResponse.class, unmodifiableMap);
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
        ((C25238b) f26765c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26765c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVMicroMobilityWalletResponse mVMicroMobilityWalletResponse = (MVMicroMobilityWalletResponse) obj;
        if (!getClass().equals(mVMicroMobilityWalletResponse.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityWalletResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29039f()).compareTo(Boolean.valueOf(mVMicroMobilityWalletResponse.mo29039f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo29039f() || (h = C25082a.m62844h(this.rides, mVMicroMobilityWalletResponse.rides)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityWalletResponse)) {
            return false;
        }
        MVMicroMobilityWalletResponse mVMicroMobilityWalletResponse = (MVMicroMobilityWalletResponse) obj;
        boolean f = mo29039f();
        boolean f2 = mVMicroMobilityWalletResponse.mo29039f();
        if ((f || f2) && (!f || !f2 || !this.rides.equals(mVMicroMobilityWalletResponse.rides))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29039f() {
        return this.rides != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityWalletResponse(", "rides:");
        List<MVMicroMobilityRide> list = this.rides;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
