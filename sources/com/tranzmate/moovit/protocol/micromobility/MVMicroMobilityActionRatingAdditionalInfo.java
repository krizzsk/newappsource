package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityActionRatingAdditionalInfo implements TBase<MVMicroMobilityActionRatingAdditionalInfo, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityActionRatingAdditionalInfo> {

    /* renamed from: b */
    public static final C25113c f26486b = new C25113c("rating", (byte) 8, 1);

    /* renamed from: c */
    public static final HashMap f26487c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26488d;
    private byte __isset_bitfield = 0;
    private _Fields[] optionals = {_Fields.RATING};
    public int rating;

    public enum _Fields implements C25085c {
        RATING(1, "rating");
        
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
            return RATING;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRatingAdditionalInfo$a */
    public static class C9185a extends C25239c<MVMicroMobilityActionRatingAdditionalInfo> {
        public C9185a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionRatingAdditionalInfo mVMicroMobilityActionRatingAdditionalInfo = (MVMicroMobilityActionRatingAdditionalInfo) tBase;
            mVMicroMobilityActionRatingAdditionalInfo.getClass();
            C25113c cVar = MVMicroMobilityActionRatingAdditionalInfo.f26486b;
            gVar.mo61687K();
            if (mVMicroMobilityActionRatingAdditionalInfo.mo28615f()) {
                gVar.mo61711x(MVMicroMobilityActionRatingAdditionalInfo.f26486b);
                gVar.mo61678B(mVMicroMobilityActionRatingAdditionalInfo.rating);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionRatingAdditionalInfo mVMicroMobilityActionRatingAdditionalInfo = (MVMicroMobilityActionRatingAdditionalInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityActionRatingAdditionalInfo.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 8) {
                    mVMicroMobilityActionRatingAdditionalInfo.rating = gVar.mo61696i();
                    mVMicroMobilityActionRatingAdditionalInfo.mo28616g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRatingAdditionalInfo$b */
    public static class C9186b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9185a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRatingAdditionalInfo$c */
    public static class C9187c extends C25240d<MVMicroMobilityActionRatingAdditionalInfo> {
        public C9187c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionRatingAdditionalInfo mVMicroMobilityActionRatingAdditionalInfo = (MVMicroMobilityActionRatingAdditionalInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityActionRatingAdditionalInfo.mo28615f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityActionRatingAdditionalInfo.mo28615f()) {
                jVar.mo61678B(mVMicroMobilityActionRatingAdditionalInfo.rating);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionRatingAdditionalInfo mVMicroMobilityActionRatingAdditionalInfo = (MVMicroMobilityActionRatingAdditionalInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVMicroMobilityActionRatingAdditionalInfo.rating = jVar.mo61696i();
                mVMicroMobilityActionRatingAdditionalInfo.mo28616g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRatingAdditionalInfo$d */
    public static class C9188d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9187c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityActionRatingAdditionalInfo");
        HashMap hashMap = new HashMap();
        f26487c = hashMap;
        hashMap.put(C25239c.class, new C9186b());
        hashMap.put(C25240d.class, new C9188d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RATING, new FieldMetaData("rating", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26488d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityActionRatingAdditionalInfo.class, unmodifiableMap);
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
        ((C25238b) f26487c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26487c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVMicroMobilityActionRatingAdditionalInfo mVMicroMobilityActionRatingAdditionalInfo = (MVMicroMobilityActionRatingAdditionalInfo) obj;
        if (!getClass().equals(mVMicroMobilityActionRatingAdditionalInfo.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityActionRatingAdditionalInfo.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28615f()).compareTo(Boolean.valueOf(mVMicroMobilityActionRatingAdditionalInfo.mo28615f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo28615f() || (c = C25082a.m62839c(this.rating, mVMicroMobilityActionRatingAdditionalInfo.rating)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityActionRatingAdditionalInfo)) {
            return false;
        }
        MVMicroMobilityActionRatingAdditionalInfo mVMicroMobilityActionRatingAdditionalInfo = (MVMicroMobilityActionRatingAdditionalInfo) obj;
        boolean f = mo28615f();
        boolean f2 = mVMicroMobilityActionRatingAdditionalInfo.mo28615f();
        if ((f || f2) && (!f || !f2 || this.rating != mVMicroMobilityActionRatingAdditionalInfo.rating)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28615f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo28616g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVMicroMobilityActionRatingAdditionalInfo(");
        if (mo28615f()) {
            sb.append("rating:");
            sb.append(this.rating);
        }
        sb.append(")");
        return sb.toString();
    }
}
