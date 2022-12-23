package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityVehicleCondition implements TBase<MVMicroMobilityVehicleCondition, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityVehicleCondition> {

    /* renamed from: b */
    public static final C25113c f26757b = new C25113c("icon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26758c = new C25113c("primaryActionText", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26759d = new C25113c("primaryActionUrl", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26760e = new C25113c("secondaryActionText", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26761f = new C25113c("secondaryActionUrl", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f26762g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26763h;
    public MVImageReferenceWithParams icon;
    private _Fields[] optionals = {_Fields.ICON, _Fields.PRIMARY_ACTION_URL, _Fields.SECONDARY_ACTION_TEXT, _Fields.SECONDARY_ACTION_URL};
    public String primaryActionText;
    public String primaryActionUrl;
    public String secondaryActionText;
    public String secondaryActionUrl;

    public enum _Fields implements C25085c {
        ICON(1, "icon"),
        PRIMARY_ACTION_TEXT(2, "primaryActionText"),
        PRIMARY_ACTION_URL(3, "primaryActionUrl"),
        SECONDARY_ACTION_TEXT(4, "secondaryActionText"),
        SECONDARY_ACTION_URL(5, "secondaryActionUrl");
        
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
                return ICON;
            }
            if (i == 2) {
                return PRIMARY_ACTION_TEXT;
            }
            if (i == 3) {
                return PRIMARY_ACTION_URL;
            }
            if (i == 4) {
                return SECONDARY_ACTION_TEXT;
            }
            if (i != 5) {
                return null;
            }
            return SECONDARY_ACTION_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityVehicleCondition$a */
    public static class C9356a extends C25239c<MVMicroMobilityVehicleCondition> {
        public C9356a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = (MVMicroMobilityVehicleCondition) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVMicroMobilityVehicleCondition.icon;
            C25113c cVar = MVMicroMobilityVehicleCondition.f26757b;
            gVar.mo61687K();
            if (mVMicroMobilityVehicleCondition.icon != null && mVMicroMobilityVehicleCondition.mo29029f()) {
                gVar.mo61711x(MVMicroMobilityVehicleCondition.f26757b);
                mVMicroMobilityVehicleCondition.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityVehicleCondition.primaryActionText != null) {
                gVar.mo61711x(MVMicroMobilityVehicleCondition.f26758c);
                gVar.mo61686J(mVMicroMobilityVehicleCondition.primaryActionText);
                gVar.mo61712y();
            }
            if (mVMicroMobilityVehicleCondition.primaryActionUrl != null && mVMicroMobilityVehicleCondition.mo29031h()) {
                gVar.mo61711x(MVMicroMobilityVehicleCondition.f26759d);
                gVar.mo61686J(mVMicroMobilityVehicleCondition.primaryActionUrl);
                gVar.mo61712y();
            }
            if (mVMicroMobilityVehicleCondition.secondaryActionText != null && mVMicroMobilityVehicleCondition.mo29033i()) {
                gVar.mo61711x(MVMicroMobilityVehicleCondition.f26760e);
                gVar.mo61686J(mVMicroMobilityVehicleCondition.secondaryActionText);
                gVar.mo61712y();
            }
            if (mVMicroMobilityVehicleCondition.secondaryActionUrl != null && mVMicroMobilityVehicleCondition.mo29034j()) {
                gVar.mo61711x(MVMicroMobilityVehicleCondition.f26761f);
                gVar.mo61686J(mVMicroMobilityVehicleCondition.secondaryActionUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = (MVMicroMobilityVehicleCondition) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVMicroMobilityVehicleCondition.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVMicroMobilityVehicleCondition.secondaryActionUrl = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVMicroMobilityVehicleCondition.secondaryActionText = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVMicroMobilityVehicleCondition.primaryActionUrl = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityVehicleCondition.primaryActionText = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                    mVMicroMobilityVehicleCondition.icon = mVImageReferenceWithParams2;
                    mVImageReferenceWithParams2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityVehicleCondition$b */
    public static class C9357b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9356a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityVehicleCondition$c */
    public static class C9358c extends C25240d<MVMicroMobilityVehicleCondition> {
        public C9358c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = (MVMicroMobilityVehicleCondition) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityVehicleCondition.mo29029f()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityVehicleCondition.mo29030g()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityVehicleCondition.mo29031h()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityVehicleCondition.mo29033i()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityVehicleCondition.mo29034j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMicroMobilityVehicleCondition.mo29029f()) {
                mVMicroMobilityVehicleCondition.icon.mo25202X0(jVar);
            }
            if (mVMicroMobilityVehicleCondition.mo29030g()) {
                jVar.mo61686J(mVMicroMobilityVehicleCondition.primaryActionText);
            }
            if (mVMicroMobilityVehicleCondition.mo29031h()) {
                jVar.mo61686J(mVMicroMobilityVehicleCondition.primaryActionUrl);
            }
            if (mVMicroMobilityVehicleCondition.mo29033i()) {
                jVar.mo61686J(mVMicroMobilityVehicleCondition.secondaryActionText);
            }
            if (mVMicroMobilityVehicleCondition.mo29034j()) {
                jVar.mo61686J(mVMicroMobilityVehicleCondition.secondaryActionUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = (MVMicroMobilityVehicleCondition) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVMicroMobilityVehicleCondition.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVMicroMobilityVehicleCondition.primaryActionText = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityVehicleCondition.primaryActionUrl = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVMicroMobilityVehicleCondition.secondaryActionText = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVMicroMobilityVehicleCondition.secondaryActionUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityVehicleCondition$d */
    public static class C9359d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9358c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityVehicleCondition");
        HashMap hashMap = new HashMap();
        f26762g = hashMap;
        hashMap.put(C25239c.class, new C9357b());
        hashMap.put(C25240d.class, new C9359d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.PRIMARY_ACTION_TEXT, new FieldMetaData("primaryActionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRIMARY_ACTION_URL, new FieldMetaData("primaryActionUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SECONDARY_ACTION_TEXT, new FieldMetaData("secondaryActionText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SECONDARY_ACTION_URL, new FieldMetaData("secondaryActionUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26763h = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityVehicleCondition.class, unmodifiableMap);
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
        ((C25238b) f26762g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26762g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29026a(MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition) {
        if (mVMicroMobilityVehicleCondition == null) {
            return false;
        }
        boolean f = mo29029f();
        boolean f2 = mVMicroMobilityVehicleCondition.mo29029f();
        if ((f || f2) && (!f || !f2 || !this.icon.mo26245a(mVMicroMobilityVehicleCondition.icon))) {
            return false;
        }
        boolean g = mo29030g();
        boolean g2 = mVMicroMobilityVehicleCondition.mo29030g();
        if ((g || g2) && (!g || !g2 || !this.primaryActionText.equals(mVMicroMobilityVehicleCondition.primaryActionText))) {
            return false;
        }
        boolean h = mo29031h();
        boolean h2 = mVMicroMobilityVehicleCondition.mo29031h();
        if ((h || h2) && (!h || !h2 || !this.primaryActionUrl.equals(mVMicroMobilityVehicleCondition.primaryActionUrl))) {
            return false;
        }
        boolean i = mo29033i();
        boolean i2 = mVMicroMobilityVehicleCondition.mo29033i();
        if ((i || i2) && (!i || !i2 || !this.secondaryActionText.equals(mVMicroMobilityVehicleCondition.secondaryActionText))) {
            return false;
        }
        boolean j = mo29034j();
        boolean j2 = mVMicroMobilityVehicleCondition.mo29034j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.secondaryActionUrl.equals(mVMicroMobilityVehicleCondition.secondaryActionUrl)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = (MVMicroMobilityVehicleCondition) obj;
        if (!getClass().equals(mVMicroMobilityVehicleCondition.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityVehicleCondition.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29029f()).compareTo(Boolean.valueOf(mVMicroMobilityVehicleCondition.mo29029f()));
        if (compareTo2 != 0 || ((mo29029f() && (compareTo2 = this.icon.compareTo(mVMicroMobilityVehicleCondition.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo29030g()).compareTo(Boolean.valueOf(mVMicroMobilityVehicleCondition.mo29030g()))) != 0 || ((mo29030g() && (compareTo2 = this.primaryActionText.compareTo(mVMicroMobilityVehicleCondition.primaryActionText)) != 0) || (compareTo2 = Boolean.valueOf(mo29031h()).compareTo(Boolean.valueOf(mVMicroMobilityVehicleCondition.mo29031h()))) != 0 || ((mo29031h() && (compareTo2 = this.primaryActionUrl.compareTo(mVMicroMobilityVehicleCondition.primaryActionUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo29033i()).compareTo(Boolean.valueOf(mVMicroMobilityVehicleCondition.mo29033i()))) != 0 || ((mo29033i() && (compareTo2 = this.secondaryActionText.compareTo(mVMicroMobilityVehicleCondition.secondaryActionText)) != 0) || (compareTo2 = Boolean.valueOf(mo29034j()).compareTo(Boolean.valueOf(mVMicroMobilityVehicleCondition.mo29034j()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29034j() || (compareTo = this.secondaryActionUrl.compareTo(mVMicroMobilityVehicleCondition.secondaryActionUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMicroMobilityVehicleCondition)) {
            return mo29026a((MVMicroMobilityVehicleCondition) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29029f() {
        return this.icon != null;
    }

    /* renamed from: g */
    public final boolean mo29030g() {
        return this.primaryActionText != null;
    }

    /* renamed from: h */
    public final boolean mo29031h() {
        return this.primaryActionUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29033i() {
        return this.secondaryActionText != null;
    }

    /* renamed from: j */
    public final boolean mo29034j() {
        return this.secondaryActionUrl != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVMicroMobilityVehicleCondition(");
        if (mo29029f()) {
            sb.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("primaryActionText:");
        String str = this.primaryActionText;
        if (str == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str);
        }
        if (mo29031h()) {
            sb.append(", ");
            sb.append("primaryActionUrl:");
            String str2 = this.primaryActionUrl;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        if (mo29033i()) {
            sb.append(", ");
            sb.append("secondaryActionText:");
            String str3 = this.secondaryActionText;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
        }
        if (mo29034j()) {
            sb.append(", ");
            sb.append("secondaryActionUrl:");
            String str4 = this.secondaryActionUrl;
            if (str4 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str4);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
