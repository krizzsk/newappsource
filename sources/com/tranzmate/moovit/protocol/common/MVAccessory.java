package com.tranzmate.moovit.protocol.common;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVAccessory implements TBase<MVAccessory, _Fields>, Serializable, Cloneable, Comparable<MVAccessory> {

    /* renamed from: b */
    public static final C25113c f24967b = new C25113c("accessabilityText", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24968c = new C25113c("accessoryIcon", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24969d = new C25113c("accessoryText", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24970e = new C25113c("color", (byte) 8, 4);

    /* renamed from: f */
    public static final HashMap f24971f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24972g;
    public String accessabilityText;
    public MVImageReferenceWithParams accessoryIcon;
    public String accessoryText;
    public MVClientColorScheme color;
    private _Fields[] optionals = {_Fields.ACCESSABILITY_TEXT, _Fields.ACCESSORY_ICON, _Fields.ACCESSORY_TEXT};

    public enum _Fields implements C25085c {
        ACCESSABILITY_TEXT(1, "accessabilityText"),
        ACCESSORY_ICON(2, "accessoryIcon"),
        ACCESSORY_TEXT(3, "accessoryText"),
        COLOR(4, "color");
        
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
                return ACCESSABILITY_TEXT;
            }
            if (i == 2) {
                return ACCESSORY_ICON;
            }
            if (i == 3) {
                return ACCESSORY_TEXT;
            }
            if (i != 4) {
                return null;
            }
            return COLOR;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVAccessory$a */
    public static class C8364a extends C25239c<MVAccessory> {
        public C8364a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccessory mVAccessory = (MVAccessory) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVAccessory.accessoryIcon;
            C25113c cVar = MVAccessory.f24967b;
            gVar.mo61687K();
            if (mVAccessory.accessabilityText != null && mVAccessory.mo26069f()) {
                gVar.mo61711x(MVAccessory.f24967b);
                gVar.mo61686J(mVAccessory.accessabilityText);
                gVar.mo61712y();
            }
            if (mVAccessory.accessoryIcon != null && mVAccessory.mo26070g()) {
                gVar.mo61711x(MVAccessory.f24968c);
                mVAccessory.accessoryIcon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccessory.accessoryText != null && mVAccessory.mo26071h()) {
                gVar.mo61711x(MVAccessory.f24969d);
                gVar.mo61686J(mVAccessory.accessoryText);
                gVar.mo61712y();
            }
            if (mVAccessory.color != null) {
                gVar.mo61711x(MVAccessory.f24970e);
                gVar.mo61678B(mVAccessory.color.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccessory mVAccessory = (MVAccessory) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVAccessory.accessoryIcon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 8) {
                                mVAccessory.color = MVClientColorScheme.findByValue(gVar.mo61696i());
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVAccessory.accessoryText = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                        mVAccessory.accessoryIcon = mVImageReferenceWithParams2;
                        mVImageReferenceWithParams2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAccessory.accessabilityText = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVAccessory$b */
    public static class C8365b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8364a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVAccessory$c */
    public static class C8366c extends C25240d<MVAccessory> {
        public C8366c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccessory mVAccessory = (MVAccessory) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccessory.mo26069f()) {
                bitSet.set(0);
            }
            if (mVAccessory.mo26070g()) {
                bitSet.set(1);
            }
            if (mVAccessory.mo26071h()) {
                bitSet.set(2);
            }
            if (mVAccessory.mo26073i()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVAccessory.mo26069f()) {
                jVar.mo61686J(mVAccessory.accessabilityText);
            }
            if (mVAccessory.mo26070g()) {
                mVAccessory.accessoryIcon.mo25202X0(jVar);
            }
            if (mVAccessory.mo26071h()) {
                jVar.mo61686J(mVAccessory.accessoryText);
            }
            if (mVAccessory.mo26073i()) {
                jVar.mo61678B(mVAccessory.color.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccessory mVAccessory = (MVAccessory) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVAccessory.accessabilityText = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVAccessory.accessoryIcon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVAccessory.accessoryText = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVAccessory.color = MVClientColorScheme.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVAccessory$d */
    public static class C8367d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8366c(0);
        }
    }

    static {
        new C17394d0("MVAccessory");
        HashMap hashMap = new HashMap();
        f24971f = hashMap;
        hashMap.put(C25239c.class, new C8365b());
        hashMap.put(C25240d.class, new C8367d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACCESSABILITY_TEXT, new FieldMetaData("accessabilityText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACCESSORY_ICON, new FieldMetaData("accessoryIcon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.ACCESSORY_TEXT, new FieldMetaData("accessoryText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.COLOR, new FieldMetaData("color", (byte) 3, new EnumMetaData(MVClientColorScheme.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24972g = unmodifiableMap;
        FieldMetaData.m61947a(MVAccessory.class, unmodifiableMap);
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
        ((C25238b) f24971f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24971f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26066a(MVAccessory mVAccessory) {
        if (mVAccessory == null) {
            return false;
        }
        boolean f = mo26069f();
        boolean f2 = mVAccessory.mo26069f();
        if ((f || f2) && (!f || !f2 || !this.accessabilityText.equals(mVAccessory.accessabilityText))) {
            return false;
        }
        boolean g = mo26070g();
        boolean g2 = mVAccessory.mo26070g();
        if ((g || g2) && (!g || !g2 || !this.accessoryIcon.mo26245a(mVAccessory.accessoryIcon))) {
            return false;
        }
        boolean h = mo26071h();
        boolean h2 = mVAccessory.mo26071h();
        if ((h || h2) && (!h || !h2 || !this.accessoryText.equals(mVAccessory.accessoryText))) {
            return false;
        }
        boolean i = mo26073i();
        boolean i2 = mVAccessory.mo26073i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.color.equals(mVAccessory.color)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccessory mVAccessory = (MVAccessory) obj;
        if (!getClass().equals(mVAccessory.getClass())) {
            return getClass().getName().compareTo(mVAccessory.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26069f()).compareTo(Boolean.valueOf(mVAccessory.mo26069f()));
        if (compareTo2 != 0 || ((mo26069f() && (compareTo2 = this.accessabilityText.compareTo(mVAccessory.accessabilityText)) != 0) || (compareTo2 = Boolean.valueOf(mo26070g()).compareTo(Boolean.valueOf(mVAccessory.mo26070g()))) != 0 || ((mo26070g() && (compareTo2 = this.accessoryIcon.compareTo(mVAccessory.accessoryIcon)) != 0) || (compareTo2 = Boolean.valueOf(mo26071h()).compareTo(Boolean.valueOf(mVAccessory.mo26071h()))) != 0 || ((mo26071h() && (compareTo2 = this.accessoryText.compareTo(mVAccessory.accessoryText)) != 0) || (compareTo2 = Boolean.valueOf(mo26073i()).compareTo(Boolean.valueOf(mVAccessory.mo26073i()))) != 0)))) {
            return compareTo2;
        }
        if (!mo26073i() || (compareTo = this.color.compareTo(mVAccessory.color)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVAccessory)) {
            return mo26066a((MVAccessory) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26069f() {
        return this.accessabilityText != null;
    }

    /* renamed from: g */
    public final boolean mo26070g() {
        return this.accessoryIcon != null;
    }

    /* renamed from: h */
    public final boolean mo26071h() {
        return this.accessoryText != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26073i() {
        return this.color != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVAccessory(");
        boolean z2 = false;
        if (mo26069f()) {
            sb.append("accessabilityText:");
            String str = this.accessabilityText;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo26070g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("accessoryIcon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.accessoryIcon;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
            z = false;
        }
        if (mo26071h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("accessoryText:");
            String str2 = this.accessoryText;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("color:");
        MVClientColorScheme mVClientColorScheme = this.color;
        if (mVClientColorScheme == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVClientColorScheme);
        }
        sb.append(")");
        return sb.toString();
    }
}
