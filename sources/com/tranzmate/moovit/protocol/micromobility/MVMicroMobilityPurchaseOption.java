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

public class MVMicroMobilityPurchaseOption implements TBase<MVMicroMobilityPurchaseOption, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseOption> {

    /* renamed from: b */
    public static final C25113c f26651b = new C25113c("optionId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26652c = new C25113c("icon", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26653d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26654e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26655f = new C25113c("confirmation", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f26656g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26657h;
    public MVMicroMobilityConfirmation confirmation;
    public MVImageReferenceWithParams icon;
    public String optionId;
    private _Fields[] optionals = {_Fields.ICON, _Fields.TITLE, _Fields.SUBTITLE, _Fields.CONFIRMATION};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        OPTION_ID(1, "optionId"),
        ICON(2, "icon"),
        TITLE(3, "title"),
        SUBTITLE(4, "subtitle"),
        CONFIRMATION(5, "confirmation");
        
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
                return OPTION_ID;
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
            return CONFIRMATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOption$a */
    public static class C9294a extends C25239c<MVMicroMobilityPurchaseOption> {
        public C9294a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseOption mVMicroMobilityPurchaseOption = (MVMicroMobilityPurchaseOption) tBase;
            mVMicroMobilityPurchaseOption.getClass();
            C25113c cVar = MVMicroMobilityPurchaseOption.f26651b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseOption.optionId != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseOption.f26651b);
                gVar.mo61686J(mVMicroMobilityPurchaseOption.optionId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOption.icon != null && mVMicroMobilityPurchaseOption.mo28868g()) {
                gVar.mo61711x(MVMicroMobilityPurchaseOption.f26652c);
                mVMicroMobilityPurchaseOption.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOption.title != null && mVMicroMobilityPurchaseOption.mo28872j()) {
                gVar.mo61711x(MVMicroMobilityPurchaseOption.f26653d);
                gVar.mo61686J(mVMicroMobilityPurchaseOption.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOption.subtitle != null && mVMicroMobilityPurchaseOption.mo28871i()) {
                gVar.mo61711x(MVMicroMobilityPurchaseOption.f26654e);
                gVar.mo61686J(mVMicroMobilityPurchaseOption.subtitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOption.confirmation != null && mVMicroMobilityPurchaseOption.mo28867f()) {
                gVar.mo61711x(MVMicroMobilityPurchaseOption.f26655f);
                mVMicroMobilityPurchaseOption.confirmation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseOption mVMicroMobilityPurchaseOption = (MVMicroMobilityPurchaseOption) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchaseOption.getClass();
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
                                    MVMicroMobilityConfirmation mVMicroMobilityConfirmation = new MVMicroMobilityConfirmation();
                                    mVMicroMobilityPurchaseOption.confirmation = mVMicroMobilityConfirmation;
                                    mVMicroMobilityConfirmation.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVMicroMobilityPurchaseOption.subtitle = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVMicroMobilityPurchaseOption.title = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                        mVMicroMobilityPurchaseOption.icon = mVImageReferenceWithParams;
                        mVImageReferenceWithParams.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityPurchaseOption.optionId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOption$b */
    public static class C9295b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9294a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOption$c */
    public static class C9296c extends C25240d<MVMicroMobilityPurchaseOption> {
        public C9296c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseOption mVMicroMobilityPurchaseOption = (MVMicroMobilityPurchaseOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseOption.mo28869h()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPurchaseOption.mo28868g()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityPurchaseOption.mo28872j()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityPurchaseOption.mo28871i()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityPurchaseOption.mo28867f()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMicroMobilityPurchaseOption.mo28869h()) {
                jVar.mo61686J(mVMicroMobilityPurchaseOption.optionId);
            }
            if (mVMicroMobilityPurchaseOption.mo28868g()) {
                mVMicroMobilityPurchaseOption.icon.mo25202X0(jVar);
            }
            if (mVMicroMobilityPurchaseOption.mo28872j()) {
                jVar.mo61686J(mVMicroMobilityPurchaseOption.title);
            }
            if (mVMicroMobilityPurchaseOption.mo28871i()) {
                jVar.mo61686J(mVMicroMobilityPurchaseOption.subtitle);
            }
            if (mVMicroMobilityPurchaseOption.mo28867f()) {
                mVMicroMobilityPurchaseOption.confirmation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseOption mVMicroMobilityPurchaseOption = (MVMicroMobilityPurchaseOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVMicroMobilityPurchaseOption.optionId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVMicroMobilityPurchaseOption.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVMicroMobilityPurchaseOption.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVMicroMobilityPurchaseOption.subtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVMicroMobilityConfirmation mVMicroMobilityConfirmation = new MVMicroMobilityConfirmation();
                mVMicroMobilityPurchaseOption.confirmation = mVMicroMobilityConfirmation;
                mVMicroMobilityConfirmation.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOption$d */
    public static class C9297d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9296c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseOption");
        HashMap hashMap = new HashMap();
        f26656g = hashMap;
        hashMap.put(C25239c.class, new C9295b());
        hashMap.put(C25240d.class, new C9297d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OPTION_ID, new FieldMetaData("optionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CONFIRMATION, new FieldMetaData("confirmation", (byte) 2, new StructMetaData(MVMicroMobilityConfirmation.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26657h = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseOption.class, unmodifiableMap);
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
        ((C25238b) f26656g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26656g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchaseOption mVMicroMobilityPurchaseOption = (MVMicroMobilityPurchaseOption) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseOption.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseOption.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28869h()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOption.mo28869h()));
        if (compareTo2 != 0 || ((mo28869h() && (compareTo2 = this.optionId.compareTo(mVMicroMobilityPurchaseOption.optionId)) != 0) || (compareTo2 = Boolean.valueOf(mo28868g()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOption.mo28868g()))) != 0 || ((mo28868g() && (compareTo2 = this.icon.compareTo(mVMicroMobilityPurchaseOption.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo28872j()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOption.mo28872j()))) != 0 || ((mo28872j() && (compareTo2 = this.title.compareTo(mVMicroMobilityPurchaseOption.title)) != 0) || (compareTo2 = Boolean.valueOf(mo28871i()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOption.mo28871i()))) != 0 || ((mo28871i() && (compareTo2 = this.subtitle.compareTo(mVMicroMobilityPurchaseOption.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo28867f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOption.mo28867f()))) != 0))))) {
            return compareTo2;
        }
        if (!mo28867f() || (compareTo = this.confirmation.compareTo(mVMicroMobilityPurchaseOption.confirmation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchaseOption)) {
            return false;
        }
        MVMicroMobilityPurchaseOption mVMicroMobilityPurchaseOption = (MVMicroMobilityPurchaseOption) obj;
        boolean h = mo28869h();
        boolean h2 = mVMicroMobilityPurchaseOption.mo28869h();
        if ((h || h2) && (!h || !h2 || !this.optionId.equals(mVMicroMobilityPurchaseOption.optionId))) {
            return false;
        }
        boolean g = mo28868g();
        boolean g2 = mVMicroMobilityPurchaseOption.mo28868g();
        if ((g || g2) && (!g || !g2 || !this.icon.mo26245a(mVMicroMobilityPurchaseOption.icon))) {
            return false;
        }
        boolean j = mo28872j();
        boolean j2 = mVMicroMobilityPurchaseOption.mo28872j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVMicroMobilityPurchaseOption.title))) {
            return false;
        }
        boolean i = mo28871i();
        boolean i2 = mVMicroMobilityPurchaseOption.mo28871i();
        if ((i || i2) && (!i || !i2 || !this.subtitle.equals(mVMicroMobilityPurchaseOption.subtitle))) {
            return false;
        }
        boolean f = mo28867f();
        boolean f2 = mVMicroMobilityPurchaseOption.mo28867f();
        if ((f || f2) && (!f || !f2 || !this.confirmation.mo28661a(mVMicroMobilityPurchaseOption.confirmation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28867f() {
        return this.confirmation != null;
    }

    /* renamed from: g */
    public final boolean mo28868g() {
        return this.icon != null;
    }

    /* renamed from: h */
    public final boolean mo28869h() {
        return this.optionId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28871i() {
        return this.subtitle != null;
    }

    /* renamed from: j */
    public final boolean mo28872j() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchaseOption(", "optionId:");
        String str = this.optionId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo28868g()) {
            n.append(", ");
            n.append("icon:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo28872j()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo28871i()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo28867f()) {
            n.append(", ");
            n.append("confirmation:");
            MVMicroMobilityConfirmation mVMicroMobilityConfirmation = this.confirmation;
            if (mVMicroMobilityConfirmation == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMicroMobilityConfirmation);
            }
        }
        n.append(")");
        return n.toString();
    }
}
