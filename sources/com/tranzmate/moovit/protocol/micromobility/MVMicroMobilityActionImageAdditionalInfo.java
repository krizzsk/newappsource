package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
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

public class MVMicroMobilityActionImageAdditionalInfo implements TBase<MVMicroMobilityActionImageAdditionalInfo, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityActionImageAdditionalInfo> {

    /* renamed from: b */
    public static final C25113c f26480b = new C25113c("data", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f26481c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26482d;
    public ByteBuffer data;

    public enum _Fields implements C25085c {
        DATA(1, "data");
        
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
            return DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionImageAdditionalInfo$a */
    public static class C9177a extends C25239c<MVMicroMobilityActionImageAdditionalInfo> {
        public C9177a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionImageAdditionalInfo mVMicroMobilityActionImageAdditionalInfo = (MVMicroMobilityActionImageAdditionalInfo) tBase;
            mVMicroMobilityActionImageAdditionalInfo.getClass();
            C25113c cVar = MVMicroMobilityActionImageAdditionalInfo.f26480b;
            gVar.mo61687K();
            if (mVMicroMobilityActionImageAdditionalInfo.data != null) {
                gVar.mo61711x(MVMicroMobilityActionImageAdditionalInfo.f26480b);
                gVar.mo61707t(mVMicroMobilityActionImageAdditionalInfo.data);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionImageAdditionalInfo mVMicroMobilityActionImageAdditionalInfo = (MVMicroMobilityActionImageAdditionalInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityActionImageAdditionalInfo.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVMicroMobilityActionImageAdditionalInfo.data = gVar.mo61689b();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionImageAdditionalInfo$b */
    public static class C9178b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9177a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionImageAdditionalInfo$c */
    public static class C9179c extends C25240d<MVMicroMobilityActionImageAdditionalInfo> {
        public C9179c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionImageAdditionalInfo mVMicroMobilityActionImageAdditionalInfo = (MVMicroMobilityActionImageAdditionalInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityActionImageAdditionalInfo.mo28603f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityActionImageAdditionalInfo.mo28603f()) {
                jVar.mo61707t(mVMicroMobilityActionImageAdditionalInfo.data);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityActionImageAdditionalInfo mVMicroMobilityActionImageAdditionalInfo = (MVMicroMobilityActionImageAdditionalInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVMicroMobilityActionImageAdditionalInfo.data = jVar.mo61689b();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionImageAdditionalInfo$d */
    public static class C9180d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9179c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityActionImageAdditionalInfo");
        HashMap hashMap = new HashMap();
        f26481c = hashMap;
        hashMap.put(C25239c.class, new C9178b());
        hashMap.put(C25240d.class, new C9180d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 3, new FieldValueMetaData((byte) 11, true)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26482d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityActionImageAdditionalInfo.class, unmodifiableMap);
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
        ((C25238b) f26481c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26481c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityActionImageAdditionalInfo mVMicroMobilityActionImageAdditionalInfo = (MVMicroMobilityActionImageAdditionalInfo) obj;
        if (!getClass().equals(mVMicroMobilityActionImageAdditionalInfo.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityActionImageAdditionalInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28603f()).compareTo(Boolean.valueOf(mVMicroMobilityActionImageAdditionalInfo.mo28603f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo28603f() || (compareTo = this.data.compareTo(mVMicroMobilityActionImageAdditionalInfo.data)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityActionImageAdditionalInfo)) {
            return false;
        }
        MVMicroMobilityActionImageAdditionalInfo mVMicroMobilityActionImageAdditionalInfo = (MVMicroMobilityActionImageAdditionalInfo) obj;
        boolean f = mo28603f();
        boolean f2 = mVMicroMobilityActionImageAdditionalInfo.mo28603f();
        if ((f || f2) && (!f || !f2 || !this.data.equals(mVMicroMobilityActionImageAdditionalInfo.data))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28603f() {
        return this.data != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityActionImageAdditionalInfo(", "data:");
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            C25082a.m62851o(byteBuffer, n);
        }
        n.append(")");
        return n.toString();
    }
}
