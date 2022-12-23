package com.tranzmate.moovit.protocol.tripplanner;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolRideDetourDetails;
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

public class MVCarPoolDetourTPDetails implements TBase<MVCarPoolDetourTPDetails, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolDetourTPDetails> {

    /* renamed from: b */
    public static final C25113c f29847b = new C25113c("detourRelevant", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f29848c = new C25113c("details", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f29849d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f29850e;
    private byte __isset_bitfield = 0;
    public MVCarPoolRideDetourDetails details;
    public boolean detourRelevant;
    private _Fields[] optionals = {_Fields.DETAILS};

    public enum _Fields implements C25085c {
        DETOUR_RELEVANT(1, "detourRelevant"),
        DETAILS(2, "details");
        
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
                return DETOUR_RELEVANT;
            }
            if (i != 2) {
                return null;
            }
            return DETAILS;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarPoolDetourTPDetails$a */
    public static class C11509a extends C25239c<MVCarPoolDetourTPDetails> {
        public C11509a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails = (MVCarPoolDetourTPDetails) tBase;
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = mVCarPoolDetourTPDetails.details;
            if (mVCarPoolRideDetourDetails != null) {
                mVCarPoolRideDetourDetails.mo25488l();
            }
            C25113c cVar = MVCarPoolDetourTPDetails.f29847b;
            gVar.mo61687K();
            gVar.mo61711x(MVCarPoolDetourTPDetails.f29847b);
            gVar.mo61708u(mVCarPoolDetourTPDetails.detourRelevant);
            gVar.mo61712y();
            if (mVCarPoolDetourTPDetails.details != null && mVCarPoolDetourTPDetails.mo34188f()) {
                gVar.mo61711x(MVCarPoolDetourTPDetails.f29848c);
                mVCarPoolDetourTPDetails.details.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails = (MVCarPoolDetourTPDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = new MVCarPoolRideDetourDetails();
                        mVCarPoolDetourTPDetails.details = mVCarPoolRideDetourDetails;
                        mVCarPoolRideDetourDetails.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVCarPoolDetourTPDetails.detourRelevant = gVar.mo61690c();
                    mVCarPoolDetourTPDetails.mo34190h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails2 = mVCarPoolDetourTPDetails.details;
            if (mVCarPoolRideDetourDetails2 != null) {
                mVCarPoolRideDetourDetails2.mo25488l();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarPoolDetourTPDetails$b */
    public static class C11510b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11509a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarPoolDetourTPDetails$c */
    public static class C11511c extends C25240d<MVCarPoolDetourTPDetails> {
        public C11511c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails = (MVCarPoolDetourTPDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolDetourTPDetails.mo34189g()) {
                bitSet.set(0);
            }
            if (mVCarPoolDetourTPDetails.mo34188f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCarPoolDetourTPDetails.mo34189g()) {
                jVar.mo61708u(mVCarPoolDetourTPDetails.detourRelevant);
            }
            if (mVCarPoolDetourTPDetails.mo34188f()) {
                mVCarPoolDetourTPDetails.details.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails = (MVCarPoolDetourTPDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVCarPoolDetourTPDetails.detourRelevant = jVar.mo61690c();
                mVCarPoolDetourTPDetails.mo34190h();
            }
            if (T.get(1)) {
                MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = new MVCarPoolRideDetourDetails();
                mVCarPoolDetourTPDetails.details = mVCarPoolRideDetourDetails;
                mVCarPoolRideDetourDetails.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVCarPoolDetourTPDetails$d */
    public static class C11512d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11511c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolDetourTPDetails");
        HashMap hashMap = new HashMap();
        f29849d = hashMap;
        hashMap.put(C25239c.class, new C11510b());
        hashMap.put(C25240d.class, new C11512d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DETOUR_RELEVANT, new FieldMetaData("detourRelevant", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DETAILS, new FieldMetaData("details", (byte) 2, new StructMetaData(MVCarPoolRideDetourDetails.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29850e = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolDetourTPDetails.class, unmodifiableMap);
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
        ((C25238b) f29849d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29849d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo34185a(MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails) {
        if (mVCarPoolDetourTPDetails == null || this.detourRelevant != mVCarPoolDetourTPDetails.detourRelevant) {
            return false;
        }
        boolean f = mo34188f();
        boolean f2 = mVCarPoolDetourTPDetails.mo34188f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.details.mo25478a(mVCarPoolDetourTPDetails.details)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCarPoolDetourTPDetails mVCarPoolDetourTPDetails = (MVCarPoolDetourTPDetails) obj;
        if (!getClass().equals(mVCarPoolDetourTPDetails.getClass())) {
            return getClass().getName().compareTo(mVCarPoolDetourTPDetails.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34189g()).compareTo(Boolean.valueOf(mVCarPoolDetourTPDetails.mo34189g()));
        if (compareTo2 != 0 || ((mo34189g() && (compareTo2 = C25082a.m62848l(this.detourRelevant, mVCarPoolDetourTPDetails.detourRelevant)) != 0) || (compareTo2 = Boolean.valueOf(mo34188f()).compareTo(Boolean.valueOf(mVCarPoolDetourTPDetails.mo34188f()))) != 0)) {
            return compareTo2;
        }
        if (!mo34188f() || (compareTo = this.details.compareTo(mVCarPoolDetourTPDetails.details)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCarPoolDetourTPDetails)) {
            return mo34185a((MVCarPoolDetourTPDetails) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo34188f() {
        return this.details != null;
    }

    /* renamed from: g */
    public final boolean mo34189g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo34190h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarPoolDetourTPDetails(", "detourRelevant:");
        n.append(this.detourRelevant);
        if (mo34188f()) {
            n.append(", ");
            n.append("details:");
            MVCarPoolRideDetourDetails mVCarPoolRideDetourDetails = this.details;
            if (mVCarPoolRideDetourDetails == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCarPoolRideDetourDetails);
            }
        }
        n.append(")");
        return n.toString();
    }
}
