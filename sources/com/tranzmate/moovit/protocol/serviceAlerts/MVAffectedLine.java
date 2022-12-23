package com.tranzmate.moovit.protocol.serviceAlerts;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVAffectedLine implements TBase<MVAffectedLine, _Fields>, Serializable, Cloneable, Comparable<MVAffectedLine> {

    /* renamed from: b */
    public static final C25113c f28226b = new C25113c("lineGroupId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28227c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28228d = new C25113c("icon", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28229e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28230f;
    private byte __isset_bitfield = 0;
    public MVImageReferenceWithParams icon;
    public int lineGroupId;
    public String name;
    private _Fields[] optionals = {_Fields.LINE_GROUP_ID, _Fields.ICON};

    public enum _Fields implements C25085c {
        LINE_GROUP_ID(1, "lineGroupId"),
        NAME(2, "name"),
        ICON(3, "icon");
        
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
                return LINE_GROUP_ID;
            }
            if (i == 2) {
                return NAME;
            }
            if (i != 3) {
                return null;
            }
            return ICON;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVAffectedLine$a */
    public static class C10451a extends C25239c<MVAffectedLine> {
        public C10451a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAffectedLine mVAffectedLine = (MVAffectedLine) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVAffectedLine.icon;
            C25113c cVar = MVAffectedLine.f28226b;
            gVar.mo61687K();
            if (mVAffectedLine.mo31557g()) {
                gVar.mo61711x(MVAffectedLine.f28226b);
                gVar.mo61678B(mVAffectedLine.lineGroupId);
                gVar.mo61712y();
            }
            if (mVAffectedLine.name != null) {
                gVar.mo61711x(MVAffectedLine.f28227c);
                gVar.mo61686J(mVAffectedLine.name);
                gVar.mo61712y();
            }
            if (mVAffectedLine.icon != null && mVAffectedLine.mo31556f()) {
                gVar.mo61711x(MVAffectedLine.f28228d);
                mVAffectedLine.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAffectedLine mVAffectedLine = (MVAffectedLine) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVAffectedLine.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVAffectedLine.icon = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAffectedLine.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAffectedLine.lineGroupId = gVar.mo61696i();
                    mVAffectedLine.mo31560i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVAffectedLine$b */
    public static class C10452b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10451a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVAffectedLine$c */
    public static class C10453c extends C25240d<MVAffectedLine> {
        public C10453c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAffectedLine mVAffectedLine = (MVAffectedLine) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAffectedLine.mo31557g()) {
                bitSet.set(0);
            }
            if (mVAffectedLine.mo31558h()) {
                bitSet.set(1);
            }
            if (mVAffectedLine.mo31556f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAffectedLine.mo31557g()) {
                jVar.mo61678B(mVAffectedLine.lineGroupId);
            }
            if (mVAffectedLine.mo31558h()) {
                jVar.mo61686J(mVAffectedLine.name);
            }
            if (mVAffectedLine.mo31556f()) {
                mVAffectedLine.icon.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAffectedLine mVAffectedLine = (MVAffectedLine) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVAffectedLine.lineGroupId = jVar.mo61696i();
                mVAffectedLine.mo31560i();
            }
            if (T.get(1)) {
                mVAffectedLine.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVAffectedLine.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVAffectedLine$d */
    public static class C10454d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10453c(0);
        }
    }

    static {
        new C17394d0("MVAffectedLine");
        HashMap hashMap = new HashMap();
        f28229e = hashMap;
        hashMap.put(C25239c.class, new C10452b());
        hashMap.put(C25240d.class, new C10454d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_GROUP_ID, new FieldMetaData("lineGroupId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28230f = unmodifiableMap;
        FieldMetaData.m61947a(MVAffectedLine.class, unmodifiableMap);
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
        ((C25238b) f28229e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28229e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31553a(MVAffectedLine mVAffectedLine) {
        if (mVAffectedLine == null) {
            return false;
        }
        boolean g = mo31557g();
        boolean g2 = mVAffectedLine.mo31557g();
        if ((g || g2) && (!g || !g2 || this.lineGroupId != mVAffectedLine.lineGroupId)) {
            return false;
        }
        boolean h = mo31558h();
        boolean h2 = mVAffectedLine.mo31558h();
        if ((h || h2) && (!h || !h2 || !this.name.equals(mVAffectedLine.name))) {
            return false;
        }
        boolean f = mo31556f();
        boolean f2 = mVAffectedLine.mo31556f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.icon.mo26245a(mVAffectedLine.icon)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAffectedLine mVAffectedLine = (MVAffectedLine) obj;
        if (!getClass().equals(mVAffectedLine.getClass())) {
            return getClass().getName().compareTo(mVAffectedLine.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31557g()).compareTo(Boolean.valueOf(mVAffectedLine.mo31557g()));
        if (compareTo2 != 0 || ((mo31557g() && (compareTo2 = C25082a.m62839c(this.lineGroupId, mVAffectedLine.lineGroupId)) != 0) || (compareTo2 = Boolean.valueOf(mo31558h()).compareTo(Boolean.valueOf(mVAffectedLine.mo31558h()))) != 0 || ((mo31558h() && (compareTo2 = this.name.compareTo(mVAffectedLine.name)) != 0) || (compareTo2 = Boolean.valueOf(mo31556f()).compareTo(Boolean.valueOf(mVAffectedLine.mo31556f()))) != 0))) {
            return compareTo2;
        }
        if (!mo31556f() || (compareTo = this.icon.compareTo(mVAffectedLine.icon)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVAffectedLine)) {
            return mo31553a((MVAffectedLine) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31556f() {
        return this.icon != null;
    }

    /* renamed from: g */
    public final boolean mo31557g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo31558h() {
        return this.name != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31560i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVAffectedLine(");
        if (mo31557g()) {
            sb.append("lineGroupId:");
            sb.append(this.lineGroupId);
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("name:");
        String str = this.name;
        if (str == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str);
        }
        if (mo31556f()) {
            sb.append(", ");
            sb.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
