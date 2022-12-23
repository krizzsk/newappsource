package com.tranzmate.moovit.protocol.ticketingV2;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import p389bl.C13637c;
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

public class MVPurchaseMassabiStep implements TBase<MVPurchaseMassabiStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseMassabiStep> {

    /* renamed from: b */
    public static final C25113c f28926b = new C25113c("selectionKeys", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f28927c = new C25113c("wizardType", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28928d = new C25113c("url", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28929e = new C25113c("agencyKey", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28930f = new C25113c("agencyId", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f28931g = new C25113c("agencyName", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f28932h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28933i;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public String agencyKey;
    public String agencyName;
    private _Fields[] optionals = {_Fields.SELECTION_KEYS, _Fields.AGENCY_ID};
    public List<String> selectionKeys;
    public String url;
    public MVWizardType wizardType;

    public enum _Fields implements C25085c {
        SELECTION_KEYS(1, "selectionKeys"),
        WIZARD_TYPE(2, "wizardType"),
        URL(3, "url"),
        AGENCY_KEY(4, "agencyKey"),
        AGENCY_ID(5, "agencyId"),
        AGENCY_NAME(6, "agencyName");
        
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
            switch (i) {
                case 1:
                    return SELECTION_KEYS;
                case 2:
                    return WIZARD_TYPE;
                case 3:
                    return URL;
                case 4:
                    return AGENCY_KEY;
                case 5:
                    return AGENCY_ID;
                case 6:
                    return AGENCY_NAME;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseMassabiStep$a */
    public static class C10933a extends C25239c<MVPurchaseMassabiStep> {
        public C10933a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseMassabiStep mVPurchaseMassabiStep = (MVPurchaseMassabiStep) tBase;
            mVPurchaseMassabiStep.getClass();
            C25113c cVar = MVPurchaseMassabiStep.f28926b;
            gVar.mo61687K();
            if (mVPurchaseMassabiStep.selectionKeys != null && mVPurchaseMassabiStep.mo32706i()) {
                gVar.mo61711x(MVPurchaseMassabiStep.f28926b);
                gVar.mo61680D(new C25119e((byte) 11, mVPurchaseMassabiStep.selectionKeys.size()));
                for (String J : mVPurchaseMassabiStep.selectionKeys) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseMassabiStep.wizardType != null) {
                gVar.mo61711x(MVPurchaseMassabiStep.f28927c);
                gVar.mo61678B(mVPurchaseMassabiStep.wizardType.getValue());
                gVar.mo61712y();
            }
            if (mVPurchaseMassabiStep.url != null) {
                gVar.mo61711x(MVPurchaseMassabiStep.f28928d);
                gVar.mo61686J(mVPurchaseMassabiStep.url);
                gVar.mo61712y();
            }
            if (mVPurchaseMassabiStep.agencyKey != null) {
                gVar.mo61711x(MVPurchaseMassabiStep.f28929e);
                gVar.mo61686J(mVPurchaseMassabiStep.agencyKey);
                gVar.mo61712y();
            }
            if (mVPurchaseMassabiStep.mo32702f()) {
                gVar.mo61711x(MVPurchaseMassabiStep.f28930f);
                gVar.mo61678B(mVPurchaseMassabiStep.agencyId);
                gVar.mo61712y();
            }
            if (mVPurchaseMassabiStep.agencyName != null) {
                gVar.mo61711x(MVPurchaseMassabiStep.f28931g);
                gVar.mo61686J(mVPurchaseMassabiStep.agencyName);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseMassabiStep mVPurchaseMassabiStep = (MVPurchaseMassabiStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPurchaseMassabiStep.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPurchaseMassabiStep.selectionKeys = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVPurchaseMassabiStep.selectionKeys.add(gVar.mo61704q());
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseMassabiStep.wizardType = MVWizardType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseMassabiStep.url = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseMassabiStep.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseMassabiStep.agencyId = gVar.mo61696i();
                            mVPurchaseMassabiStep.mo32709l();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseMassabiStep.agencyName = gVar.mo61704q();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseMassabiStep$b */
    public static class C10934b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10933a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseMassabiStep$c */
    public static class C10935c extends C25240d<MVPurchaseMassabiStep> {
        public C10935c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseMassabiStep mVPurchaseMassabiStep = (MVPurchaseMassabiStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseMassabiStep.mo32706i()) {
                bitSet.set(0);
            }
            if (mVPurchaseMassabiStep.mo32708k()) {
                bitSet.set(1);
            }
            if (mVPurchaseMassabiStep.mo32707j()) {
                bitSet.set(2);
            }
            if (mVPurchaseMassabiStep.mo32703g()) {
                bitSet.set(3);
            }
            if (mVPurchaseMassabiStep.mo32702f()) {
                bitSet.set(4);
            }
            if (mVPurchaseMassabiStep.mo32704h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVPurchaseMassabiStep.mo32706i()) {
                jVar.mo61678B(mVPurchaseMassabiStep.selectionKeys.size());
                for (String J : mVPurchaseMassabiStep.selectionKeys) {
                    jVar.mo61686J(J);
                }
            }
            if (mVPurchaseMassabiStep.mo32708k()) {
                jVar.mo61678B(mVPurchaseMassabiStep.wizardType.getValue());
            }
            if (mVPurchaseMassabiStep.mo32707j()) {
                jVar.mo61686J(mVPurchaseMassabiStep.url);
            }
            if (mVPurchaseMassabiStep.mo32703g()) {
                jVar.mo61686J(mVPurchaseMassabiStep.agencyKey);
            }
            if (mVPurchaseMassabiStep.mo32702f()) {
                jVar.mo61678B(mVPurchaseMassabiStep.agencyId);
            }
            if (mVPurchaseMassabiStep.mo32704h()) {
                jVar.mo61686J(mVPurchaseMassabiStep.agencyName);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseMassabiStep mVPurchaseMassabiStep = (MVPurchaseMassabiStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVPurchaseMassabiStep.selectionKeys = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVPurchaseMassabiStep.selectionKeys.add(jVar.mo61704q());
                }
            }
            if (T.get(1)) {
                mVPurchaseMassabiStep.wizardType = MVWizardType.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVPurchaseMassabiStep.url = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPurchaseMassabiStep.agencyKey = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVPurchaseMassabiStep.agencyId = jVar.mo61696i();
                mVPurchaseMassabiStep.mo32709l();
            }
            if (T.get(5)) {
                mVPurchaseMassabiStep.agencyName = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseMassabiStep$d */
    public static class C10936d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10935c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseMassabiStep");
        HashMap hashMap = new HashMap();
        f28932h = hashMap;
        hashMap.put(C25239c.class, new C10934b());
        hashMap.put(C25240d.class, new C10936d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SELECTION_KEYS, new FieldMetaData("selectionKeys", (byte) 2, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.WIZARD_TYPE, new FieldMetaData("wizardType", (byte) 3, new EnumMetaData(MVWizardType.class)));
        enumMap.put(_Fields.URL, new FieldMetaData("url", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_NAME, new FieldMetaData("agencyName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28933i = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseMassabiStep.class, unmodifiableMap);
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
        ((C25238b) f28932h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28932h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseMassabiStep mVPurchaseMassabiStep = (MVPurchaseMassabiStep) obj;
        if (!getClass().equals(mVPurchaseMassabiStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseMassabiStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32706i()).compareTo(Boolean.valueOf(mVPurchaseMassabiStep.mo32706i()));
        if (compareTo2 != 0 || ((mo32706i() && (compareTo2 = C25082a.m62844h(this.selectionKeys, mVPurchaseMassabiStep.selectionKeys)) != 0) || (compareTo2 = Boolean.valueOf(mo32708k()).compareTo(Boolean.valueOf(mVPurchaseMassabiStep.mo32708k()))) != 0 || ((mo32708k() && (compareTo2 = this.wizardType.compareTo(mVPurchaseMassabiStep.wizardType)) != 0) || (compareTo2 = Boolean.valueOf(mo32707j()).compareTo(Boolean.valueOf(mVPurchaseMassabiStep.mo32707j()))) != 0 || ((mo32707j() && (compareTo2 = this.url.compareTo(mVPurchaseMassabiStep.url)) != 0) || (compareTo2 = Boolean.valueOf(mo32703g()).compareTo(Boolean.valueOf(mVPurchaseMassabiStep.mo32703g()))) != 0 || ((mo32703g() && (compareTo2 = this.agencyKey.compareTo(mVPurchaseMassabiStep.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32702f()).compareTo(Boolean.valueOf(mVPurchaseMassabiStep.mo32702f()))) != 0 || ((mo32702f() && (compareTo2 = C25082a.m62839c(this.agencyId, mVPurchaseMassabiStep.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo32704h()).compareTo(Boolean.valueOf(mVPurchaseMassabiStep.mo32704h()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo32704h() || (compareTo = this.agencyName.compareTo(mVPurchaseMassabiStep.agencyName)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseMassabiStep)) {
            return false;
        }
        MVPurchaseMassabiStep mVPurchaseMassabiStep = (MVPurchaseMassabiStep) obj;
        boolean i = mo32706i();
        boolean i2 = mVPurchaseMassabiStep.mo32706i();
        if ((i || i2) && (!i || !i2 || !this.selectionKeys.equals(mVPurchaseMassabiStep.selectionKeys))) {
            return false;
        }
        boolean k = mo32708k();
        boolean k2 = mVPurchaseMassabiStep.mo32708k();
        if ((k || k2) && (!k || !k2 || !this.wizardType.equals(mVPurchaseMassabiStep.wizardType))) {
            return false;
        }
        boolean j = mo32707j();
        boolean j2 = mVPurchaseMassabiStep.mo32707j();
        if ((j || j2) && (!j || !j2 || !this.url.equals(mVPurchaseMassabiStep.url))) {
            return false;
        }
        boolean g = mo32703g();
        boolean g2 = mVPurchaseMassabiStep.mo32703g();
        if ((g || g2) && (!g || !g2 || !this.agencyKey.equals(mVPurchaseMassabiStep.agencyKey))) {
            return false;
        }
        boolean f = mo32702f();
        boolean f2 = mVPurchaseMassabiStep.mo32702f();
        if ((f || f2) && (!f || !f2 || this.agencyId != mVPurchaseMassabiStep.agencyId)) {
            return false;
        }
        boolean h = mo32704h();
        boolean h2 = mVPurchaseMassabiStep.mo32704h();
        if ((h || h2) && (!h || !h2 || !this.agencyName.equals(mVPurchaseMassabiStep.agencyName))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32702f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo32703g() {
        return this.agencyKey != null;
    }

    /* renamed from: h */
    public final boolean mo32704h() {
        return this.agencyName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32706i() {
        return this.selectionKeys != null;
    }

    /* renamed from: j */
    public final boolean mo32707j() {
        return this.url != null;
    }

    /* renamed from: k */
    public final boolean mo32708k() {
        return this.wizardType != null;
    }

    /* renamed from: l */
    public final void mo32709l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVPurchaseMassabiStep(");
        if (mo32706i()) {
            sb.append("selectionKeys:");
            List<String> list = this.selectionKeys;
            if (list == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(list);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("wizardType:");
        MVWizardType mVWizardType = this.wizardType;
        if (mVWizardType == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVWizardType);
        }
        sb.append(", ");
        sb.append("url:");
        String str = this.url;
        if (str == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("agencyKey:");
        String str2 = this.agencyKey;
        if (str2 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str2);
        }
        if (mo32702f()) {
            sb.append(", ");
            sb.append("agencyId:");
            sb.append(this.agencyId);
        }
        sb.append(", ");
        sb.append("agencyName:");
        String str3 = this.agencyName;
        if (str3 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str3);
        }
        sb.append(")");
        return sb.toString();
    }
}
