package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVAccessory;
import com.tranzmate.moovit.protocol.common.MVClientColorScheme;
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

public class MVMicroMobilityGenericProperty implements TBase<MVMicroMobilityGenericProperty, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityGenericProperty> {

    /* renamed from: b */
    public static final C25113c f26533b = new C25113c("color", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26534c = new C25113c("icon", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26535d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26536e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26537f = new C25113c("accessory", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f26538g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26539h;
    public MVAccessory accessory;
    public MVClientColorScheme color;
    public MVImageReferenceWithParams icon;
    private _Fields[] optionals = {_Fields.COLOR, _Fields.ICON, _Fields.TITLE, _Fields.SUBTITLE, _Fields.ACCESSORY};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        COLOR(1, "color"),
        ICON(2, "icon"),
        TITLE(3, "title"),
        SUBTITLE(4, "subtitle"),
        ACCESSORY(5, "accessory");
        
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
                return COLOR;
            }
            if (i == 2) {
                return ICON;
            }
            if (i == 3) {
                return TITLE;
            }
            if (i == 4) {
                return SUBTITLE;
            }
            if (i != 5) {
                return null;
            }
            return ACCESSORY;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityGenericProperty$a */
    public static class C9223a extends C25239c<MVMicroMobilityGenericProperty> {
        public C9223a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityGenericProperty mVMicroMobilityGenericProperty = (MVMicroMobilityGenericProperty) tBase;
            mVMicroMobilityGenericProperty.getClass();
            C25113c cVar = MVMicroMobilityGenericProperty.f26533b;
            gVar.mo61687K();
            if (mVMicroMobilityGenericProperty.color != null && mVMicroMobilityGenericProperty.mo28696g()) {
                gVar.mo61711x(MVMicroMobilityGenericProperty.f26533b);
                gVar.mo61678B(mVMicroMobilityGenericProperty.color.getValue());
                gVar.mo61712y();
            }
            if (mVMicroMobilityGenericProperty.icon != null && mVMicroMobilityGenericProperty.mo28697h()) {
                gVar.mo61711x(MVMicroMobilityGenericProperty.f26534c);
                mVMicroMobilityGenericProperty.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityGenericProperty.title != null && mVMicroMobilityGenericProperty.mo28700j()) {
                gVar.mo61711x(MVMicroMobilityGenericProperty.f26535d);
                gVar.mo61686J(mVMicroMobilityGenericProperty.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityGenericProperty.subtitle != null && mVMicroMobilityGenericProperty.mo28699i()) {
                gVar.mo61711x(MVMicroMobilityGenericProperty.f26536e);
                gVar.mo61686J(mVMicroMobilityGenericProperty.subtitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityGenericProperty.accessory != null && mVMicroMobilityGenericProperty.mo28695f()) {
                gVar.mo61711x(MVMicroMobilityGenericProperty.f26537f);
                mVMicroMobilityGenericProperty.accessory.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityGenericProperty mVMicroMobilityGenericProperty = (MVMicroMobilityGenericProperty) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityGenericProperty.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVAccessory mVAccessory = new MVAccessory();
                                    mVMicroMobilityGenericProperty.accessory = mVAccessory;
                                    mVAccessory.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVMicroMobilityGenericProperty.subtitle = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVMicroMobilityGenericProperty.title = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                        mVMicroMobilityGenericProperty.icon = mVImageReferenceWithParams;
                        mVImageReferenceWithParams.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVMicroMobilityGenericProperty.color = MVClientColorScheme.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityGenericProperty$b */
    public static class C9224b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9223a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityGenericProperty$c */
    public static class C9225c extends C25240d<MVMicroMobilityGenericProperty> {
        public C9225c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityGenericProperty mVMicroMobilityGenericProperty = (MVMicroMobilityGenericProperty) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityGenericProperty.mo28696g()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityGenericProperty.mo28697h()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityGenericProperty.mo28700j()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityGenericProperty.mo28699i()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityGenericProperty.mo28695f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMicroMobilityGenericProperty.mo28696g()) {
                jVar.mo61678B(mVMicroMobilityGenericProperty.color.getValue());
            }
            if (mVMicroMobilityGenericProperty.mo28697h()) {
                mVMicroMobilityGenericProperty.icon.mo25202X0(jVar);
            }
            if (mVMicroMobilityGenericProperty.mo28700j()) {
                jVar.mo61686J(mVMicroMobilityGenericProperty.title);
            }
            if (mVMicroMobilityGenericProperty.mo28699i()) {
                jVar.mo61686J(mVMicroMobilityGenericProperty.subtitle);
            }
            if (mVMicroMobilityGenericProperty.mo28695f()) {
                mVMicroMobilityGenericProperty.accessory.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityGenericProperty mVMicroMobilityGenericProperty = (MVMicroMobilityGenericProperty) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVMicroMobilityGenericProperty.color = MVClientColorScheme.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVMicroMobilityGenericProperty.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVMicroMobilityGenericProperty.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVMicroMobilityGenericProperty.subtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVAccessory mVAccessory = new MVAccessory();
                mVMicroMobilityGenericProperty.accessory = mVAccessory;
                mVAccessory.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityGenericProperty$d */
    public static class C9226d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9225c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityGenericProperty");
        HashMap hashMap = new HashMap();
        f26538g = hashMap;
        hashMap.put(C25239c.class, new C9224b());
        hashMap.put(C25240d.class, new C9226d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.COLOR, new FieldMetaData("color", (byte) 2, new EnumMetaData(MVClientColorScheme.class)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACCESSORY, new FieldMetaData("accessory", (byte) 2, new StructMetaData(MVAccessory.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26539h = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityGenericProperty.class, unmodifiableMap);
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
        ((C25238b) f26538g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26538g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityGenericProperty mVMicroMobilityGenericProperty = (MVMicroMobilityGenericProperty) obj;
        if (!getClass().equals(mVMicroMobilityGenericProperty.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityGenericProperty.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28696g()).compareTo(Boolean.valueOf(mVMicroMobilityGenericProperty.mo28696g()));
        if (compareTo2 != 0 || ((mo28696g() && (compareTo2 = this.color.compareTo(mVMicroMobilityGenericProperty.color)) != 0) || (compareTo2 = Boolean.valueOf(mo28697h()).compareTo(Boolean.valueOf(mVMicroMobilityGenericProperty.mo28697h()))) != 0 || ((mo28697h() && (compareTo2 = this.icon.compareTo(mVMicroMobilityGenericProperty.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo28700j()).compareTo(Boolean.valueOf(mVMicroMobilityGenericProperty.mo28700j()))) != 0 || ((mo28700j() && (compareTo2 = this.title.compareTo(mVMicroMobilityGenericProperty.title)) != 0) || (compareTo2 = Boolean.valueOf(mo28699i()).compareTo(Boolean.valueOf(mVMicroMobilityGenericProperty.mo28699i()))) != 0 || ((mo28699i() && (compareTo2 = this.subtitle.compareTo(mVMicroMobilityGenericProperty.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo28695f()).compareTo(Boolean.valueOf(mVMicroMobilityGenericProperty.mo28695f()))) != 0))))) {
            return compareTo2;
        }
        if (!mo28695f() || (compareTo = this.accessory.compareTo(mVMicroMobilityGenericProperty.accessory)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityGenericProperty)) {
            return false;
        }
        MVMicroMobilityGenericProperty mVMicroMobilityGenericProperty = (MVMicroMobilityGenericProperty) obj;
        boolean g = mo28696g();
        boolean g2 = mVMicroMobilityGenericProperty.mo28696g();
        if ((g || g2) && (!g || !g2 || !this.color.equals(mVMicroMobilityGenericProperty.color))) {
            return false;
        }
        boolean h = mo28697h();
        boolean h2 = mVMicroMobilityGenericProperty.mo28697h();
        if ((h || h2) && (!h || !h2 || !this.icon.mo26245a(mVMicroMobilityGenericProperty.icon))) {
            return false;
        }
        boolean j = mo28700j();
        boolean j2 = mVMicroMobilityGenericProperty.mo28700j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVMicroMobilityGenericProperty.title))) {
            return false;
        }
        boolean i = mo28699i();
        boolean i2 = mVMicroMobilityGenericProperty.mo28699i();
        if ((i || i2) && (!i || !i2 || !this.subtitle.equals(mVMicroMobilityGenericProperty.subtitle))) {
            return false;
        }
        boolean f = mo28695f();
        boolean f2 = mVMicroMobilityGenericProperty.mo28695f();
        if ((f || f2) && (!f || !f2 || !this.accessory.mo26066a(mVMicroMobilityGenericProperty.accessory))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28695f() {
        return this.accessory != null;
    }

    /* renamed from: g */
    public final boolean mo28696g() {
        return this.color != null;
    }

    /* renamed from: h */
    public final boolean mo28697h() {
        return this.icon != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28699i() {
        return this.subtitle != null;
    }

    /* renamed from: j */
    public final boolean mo28700j() {
        return this.title != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVMicroMobilityGenericProperty(");
        boolean z2 = false;
        if (mo28696g()) {
            sb.append("color:");
            MVClientColorScheme mVClientColorScheme = this.color;
            if (mVClientColorScheme == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVClientColorScheme);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo28697h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
            z = false;
        }
        if (mo28700j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("title:");
            String str = this.title;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        }
        if (mo28699i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("subtitle:");
            String str2 = this.subtitle;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        } else {
            z2 = z;
        }
        if (mo28695f()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("accessory:");
            MVAccessory mVAccessory = this.accessory;
            if (mVAccessory == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVAccessory);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
