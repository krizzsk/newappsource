package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
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

public class MVMicroMobilityQrCodeActionInfo implements TBase<MVMicroMobilityQrCodeActionInfo, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityQrCodeActionInfo> {

    /* renamed from: b */
    public static final C25113c f26703b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26704c = new C25113c("instructions", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f26705d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26706e;
    public String instructions;
    private _Fields[] optionals = {_Fields.INSTRUCTIONS};
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        INSTRUCTIONS(2, "instructions");
        
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
                return TITLE;
            }
            if (i != 2) {
                return null;
            }
            return INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityQrCodeActionInfo$a */
    public static class C9324a extends C25239c<MVMicroMobilityQrCodeActionInfo> {
        public C9324a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityQrCodeActionInfo mVMicroMobilityQrCodeActionInfo = (MVMicroMobilityQrCodeActionInfo) tBase;
            mVMicroMobilityQrCodeActionInfo.getClass();
            C25113c cVar = MVMicroMobilityQrCodeActionInfo.f26703b;
            gVar.mo61687K();
            if (mVMicroMobilityQrCodeActionInfo.title != null) {
                gVar.mo61711x(MVMicroMobilityQrCodeActionInfo.f26703b);
                gVar.mo61686J(mVMicroMobilityQrCodeActionInfo.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityQrCodeActionInfo.instructions != null && mVMicroMobilityQrCodeActionInfo.mo28936f()) {
                gVar.mo61711x(MVMicroMobilityQrCodeActionInfo.f26704c);
                gVar.mo61686J(mVMicroMobilityQrCodeActionInfo.instructions);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityQrCodeActionInfo mVMicroMobilityQrCodeActionInfo = (MVMicroMobilityQrCodeActionInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityQrCodeActionInfo.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVMicroMobilityQrCodeActionInfo.instructions = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityQrCodeActionInfo.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityQrCodeActionInfo$b */
    public static class C9325b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9324a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityQrCodeActionInfo$c */
    public static class C9326c extends C25240d<MVMicroMobilityQrCodeActionInfo> {
        public C9326c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityQrCodeActionInfo mVMicroMobilityQrCodeActionInfo = (MVMicroMobilityQrCodeActionInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityQrCodeActionInfo.mo28937g()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityQrCodeActionInfo.mo28936f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVMicroMobilityQrCodeActionInfo.mo28937g()) {
                jVar.mo61686J(mVMicroMobilityQrCodeActionInfo.title);
            }
            if (mVMicroMobilityQrCodeActionInfo.mo28936f()) {
                jVar.mo61686J(mVMicroMobilityQrCodeActionInfo.instructions);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityQrCodeActionInfo mVMicroMobilityQrCodeActionInfo = (MVMicroMobilityQrCodeActionInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVMicroMobilityQrCodeActionInfo.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityQrCodeActionInfo.instructions = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityQrCodeActionInfo$d */
    public static class C9327d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9326c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityQrCodeActionInfo");
        HashMap hashMap = new HashMap();
        f26705d = hashMap;
        hashMap.put(C25239c.class, new C9325b());
        hashMap.put(C25240d.class, new C9327d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26706e = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityQrCodeActionInfo.class, unmodifiableMap);
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
        ((C25238b) f26705d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26705d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityQrCodeActionInfo mVMicroMobilityQrCodeActionInfo = (MVMicroMobilityQrCodeActionInfo) obj;
        if (!getClass().equals(mVMicroMobilityQrCodeActionInfo.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityQrCodeActionInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28937g()).compareTo(Boolean.valueOf(mVMicroMobilityQrCodeActionInfo.mo28937g()));
        if (compareTo2 != 0 || ((mo28937g() && (compareTo2 = this.title.compareTo(mVMicroMobilityQrCodeActionInfo.title)) != 0) || (compareTo2 = Boolean.valueOf(mo28936f()).compareTo(Boolean.valueOf(mVMicroMobilityQrCodeActionInfo.mo28936f()))) != 0)) {
            return compareTo2;
        }
        if (!mo28936f() || (compareTo = this.instructions.compareTo(mVMicroMobilityQrCodeActionInfo.instructions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityQrCodeActionInfo)) {
            return false;
        }
        MVMicroMobilityQrCodeActionInfo mVMicroMobilityQrCodeActionInfo = (MVMicroMobilityQrCodeActionInfo) obj;
        boolean g = mo28937g();
        boolean g2 = mVMicroMobilityQrCodeActionInfo.mo28937g();
        if ((g || g2) && (!g || !g2 || !this.title.equals(mVMicroMobilityQrCodeActionInfo.title))) {
            return false;
        }
        boolean f = mo28936f();
        boolean f2 = mVMicroMobilityQrCodeActionInfo.mo28936f();
        if ((f || f2) && (!f || !f2 || !this.instructions.equals(mVMicroMobilityQrCodeActionInfo.instructions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28936f() {
        return this.instructions != null;
    }

    /* renamed from: g */
    public final boolean mo28937g() {
        return this.title != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityQrCodeActionInfo(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo28936f()) {
            n.append(", ");
            n.append("instructions:");
            String str2 = this.instructions;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
