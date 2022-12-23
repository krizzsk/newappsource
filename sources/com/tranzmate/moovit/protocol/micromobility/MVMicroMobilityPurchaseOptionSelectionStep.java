package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType;
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
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
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

public class MVMicroMobilityPurchaseOptionSelectionStep implements TBase<MVMicroMobilityPurchaseOptionSelectionStep, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseOptionSelectionStep> {

    /* renamed from: b */
    public static final C25113c f26658b = new C25113c("type", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26659c = new C25113c("options", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f26660d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26661e = new C25113c("instructions", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26662f = new C25113c("buttonText", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f26663g = new C25113c("selectedIndex", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f26664h = new C25113c("presentationType", (byte) 8, 7);

    /* renamed from: i */
    public static final HashMap f26665i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f26666j;
    private byte __isset_bitfield = 0;
    public String buttonText;
    public String instructions;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.INSTRUCTIONS, _Fields.SELECTED_INDEX};
    public List<MVMicroMobilityPurchaseOption> options;
    public MVOptionSelectionPresentationType presentationType;
    public int selectedIndex;
    public String title;
    public String type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        OPTIONS(2, "options"),
        TITLE(3, "title"),
        INSTRUCTIONS(4, "instructions"),
        BUTTON_TEXT(5, "buttonText"),
        SELECTED_INDEX(6, "selectedIndex"),
        PRESENTATION_TYPE(7, "presentationType");
        
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
                    return TYPE;
                case 2:
                    return OPTIONS;
                case 3:
                    return TITLE;
                case 4:
                    return INSTRUCTIONS;
                case 5:
                    return BUTTON_TEXT;
                case 6:
                    return SELECTED_INDEX;
                case 7:
                    return PRESENTATION_TYPE;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOptionSelectionStep$a */
    public static class C9298a extends C25239c<MVMicroMobilityPurchaseOptionSelectionStep> {
        public C9298a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseOptionSelectionStep mVMicroMobilityPurchaseOptionSelectionStep = (MVMicroMobilityPurchaseOptionSelectionStep) tBase;
            mVMicroMobilityPurchaseOptionSelectionStep.getClass();
            C25113c cVar = MVMicroMobilityPurchaseOptionSelectionStep.f26658b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseOptionSelectionStep.type != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseOptionSelectionStep.f26658b);
                gVar.mo61686J(mVMicroMobilityPurchaseOptionSelectionStep.type);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.options != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseOptionSelectionStep.f26659c);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityPurchaseOptionSelectionStep.options.size()));
                for (MVMicroMobilityPurchaseOption X0 : mVMicroMobilityPurchaseOptionSelectionStep.options) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.title != null && mVMicroMobilityPurchaseOptionSelectionStep.mo28883k()) {
                gVar.mo61711x(MVMicroMobilityPurchaseOptionSelectionStep.f26660d);
                gVar.mo61686J(mVMicroMobilityPurchaseOptionSelectionStep.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.instructions != null && mVMicroMobilityPurchaseOptionSelectionStep.mo28878g()) {
                gVar.mo61711x(MVMicroMobilityPurchaseOptionSelectionStep.f26661e);
                gVar.mo61686J(mVMicroMobilityPurchaseOptionSelectionStep.instructions);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.buttonText != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseOptionSelectionStep.f26662f);
                gVar.mo61686J(mVMicroMobilityPurchaseOptionSelectionStep.buttonText);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28882j()) {
                gVar.mo61711x(MVMicroMobilityPurchaseOptionSelectionStep.f26663g);
                gVar.mo61678B(mVMicroMobilityPurchaseOptionSelectionStep.selectedIndex);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.presentationType != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseOptionSelectionStep.f26664h);
                gVar.mo61678B(mVMicroMobilityPurchaseOptionSelectionStep.presentationType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseOptionSelectionStep mVMicroMobilityPurchaseOptionSelectionStep = (MVMicroMobilityPurchaseOptionSelectionStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchaseOptionSelectionStep.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseOptionSelectionStep.type = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVMicroMobilityPurchaseOptionSelectionStep.options = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVMicroMobilityPurchaseOption mVMicroMobilityPurchaseOption = new MVMicroMobilityPurchaseOption();
                                mVMicroMobilityPurchaseOption.mo25201C1(gVar);
                                mVMicroMobilityPurchaseOptionSelectionStep.options.add(mVMicroMobilityPurchaseOption);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseOptionSelectionStep.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseOptionSelectionStep.instructions = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseOptionSelectionStep.buttonText = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseOptionSelectionStep.selectedIndex = gVar.mo61696i();
                            mVMicroMobilityPurchaseOptionSelectionStep.mo28885m();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseOptionSelectionStep.presentationType = MVOptionSelectionPresentationType.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOptionSelectionStep$b */
    public static class C9299b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9298a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOptionSelectionStep$c */
    public static class C9300c extends C25240d<MVMicroMobilityPurchaseOptionSelectionStep> {
        public C9300c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseOptionSelectionStep mVMicroMobilityPurchaseOptionSelectionStep = (MVMicroMobilityPurchaseOptionSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28884l()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28879h()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28883k()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28878g()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28877f()) {
                bitSet.set(4);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28882j()) {
                bitSet.set(5);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28881i()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28884l()) {
                jVar.mo61686J(mVMicroMobilityPurchaseOptionSelectionStep.type);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28879h()) {
                jVar.mo61678B(mVMicroMobilityPurchaseOptionSelectionStep.options.size());
                for (MVMicroMobilityPurchaseOption X0 : mVMicroMobilityPurchaseOptionSelectionStep.options) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28883k()) {
                jVar.mo61686J(mVMicroMobilityPurchaseOptionSelectionStep.title);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28878g()) {
                jVar.mo61686J(mVMicroMobilityPurchaseOptionSelectionStep.instructions);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28877f()) {
                jVar.mo61686J(mVMicroMobilityPurchaseOptionSelectionStep.buttonText);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28882j()) {
                jVar.mo61678B(mVMicroMobilityPurchaseOptionSelectionStep.selectedIndex);
            }
            if (mVMicroMobilityPurchaseOptionSelectionStep.mo28881i()) {
                jVar.mo61678B(mVMicroMobilityPurchaseOptionSelectionStep.presentationType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseOptionSelectionStep mVMicroMobilityPurchaseOptionSelectionStep = (MVMicroMobilityPurchaseOptionSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVMicroMobilityPurchaseOptionSelectionStep.type = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVMicroMobilityPurchaseOptionSelectionStep.options = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVMicroMobilityPurchaseOption mVMicroMobilityPurchaseOption = new MVMicroMobilityPurchaseOption();
                    mVMicroMobilityPurchaseOption.mo25201C1(jVar);
                    mVMicroMobilityPurchaseOptionSelectionStep.options.add(mVMicroMobilityPurchaseOption);
                }
            }
            if (T.get(2)) {
                mVMicroMobilityPurchaseOptionSelectionStep.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVMicroMobilityPurchaseOptionSelectionStep.instructions = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVMicroMobilityPurchaseOptionSelectionStep.buttonText = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVMicroMobilityPurchaseOptionSelectionStep.selectedIndex = jVar.mo61696i();
                mVMicroMobilityPurchaseOptionSelectionStep.mo28885m();
            }
            if (T.get(6)) {
                mVMicroMobilityPurchaseOptionSelectionStep.presentationType = MVOptionSelectionPresentationType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseOptionSelectionStep$d */
    public static class C9301d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9300c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseOptionSelectionStep");
        HashMap hashMap = new HashMap();
        f26665i = hashMap;
        hashMap.put(C25239c.class, new C9299b());
        hashMap.put(C25240d.class, new C9301d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.OPTIONS, new FieldMetaData("options", (byte) 3, new ListMetaData(new StructMetaData(MVMicroMobilityPurchaseOption.class))));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BUTTON_TEXT, new FieldMetaData("buttonText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SELECTED_INDEX, new FieldMetaData("selectedIndex", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PRESENTATION_TYPE, new FieldMetaData("presentationType", (byte) 3, new EnumMetaData(MVOptionSelectionPresentationType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26666j = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseOptionSelectionStep.class, unmodifiableMap);
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
        ((C25238b) f26665i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26665i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchaseOptionSelectionStep mVMicroMobilityPurchaseOptionSelectionStep = (MVMicroMobilityPurchaseOptionSelectionStep) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseOptionSelectionStep.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseOptionSelectionStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28884l()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOptionSelectionStep.mo28884l()));
        if (compareTo2 != 0 || ((mo28884l() && (compareTo2 = this.type.compareTo(mVMicroMobilityPurchaseOptionSelectionStep.type)) != 0) || (compareTo2 = Boolean.valueOf(mo28879h()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOptionSelectionStep.mo28879h()))) != 0 || ((mo28879h() && (compareTo2 = C25082a.m62844h(this.options, mVMicroMobilityPurchaseOptionSelectionStep.options)) != 0) || (compareTo2 = Boolean.valueOf(mo28883k()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOptionSelectionStep.mo28883k()))) != 0 || ((mo28883k() && (compareTo2 = this.title.compareTo(mVMicroMobilityPurchaseOptionSelectionStep.title)) != 0) || (compareTo2 = Boolean.valueOf(mo28878g()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOptionSelectionStep.mo28878g()))) != 0 || ((mo28878g() && (compareTo2 = this.instructions.compareTo(mVMicroMobilityPurchaseOptionSelectionStep.instructions)) != 0) || (compareTo2 = Boolean.valueOf(mo28877f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOptionSelectionStep.mo28877f()))) != 0 || ((mo28877f() && (compareTo2 = this.buttonText.compareTo(mVMicroMobilityPurchaseOptionSelectionStep.buttonText)) != 0) || (compareTo2 = Boolean.valueOf(mo28882j()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOptionSelectionStep.mo28882j()))) != 0 || ((mo28882j() && (compareTo2 = C25082a.m62839c(this.selectedIndex, mVMicroMobilityPurchaseOptionSelectionStep.selectedIndex)) != 0) || (compareTo2 = Boolean.valueOf(mo28881i()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseOptionSelectionStep.mo28881i()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo28881i() || (compareTo = this.presentationType.compareTo(mVMicroMobilityPurchaseOptionSelectionStep.presentationType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchaseOptionSelectionStep)) {
            return false;
        }
        MVMicroMobilityPurchaseOptionSelectionStep mVMicroMobilityPurchaseOptionSelectionStep = (MVMicroMobilityPurchaseOptionSelectionStep) obj;
        boolean l = mo28884l();
        boolean l2 = mVMicroMobilityPurchaseOptionSelectionStep.mo28884l();
        if ((l || l2) && (!l || !l2 || !this.type.equals(mVMicroMobilityPurchaseOptionSelectionStep.type))) {
            return false;
        }
        boolean h = mo28879h();
        boolean h2 = mVMicroMobilityPurchaseOptionSelectionStep.mo28879h();
        if ((h || h2) && (!h || !h2 || !this.options.equals(mVMicroMobilityPurchaseOptionSelectionStep.options))) {
            return false;
        }
        boolean k = mo28883k();
        boolean k2 = mVMicroMobilityPurchaseOptionSelectionStep.mo28883k();
        if ((k || k2) && (!k || !k2 || !this.title.equals(mVMicroMobilityPurchaseOptionSelectionStep.title))) {
            return false;
        }
        boolean g = mo28878g();
        boolean g2 = mVMicroMobilityPurchaseOptionSelectionStep.mo28878g();
        if ((g || g2) && (!g || !g2 || !this.instructions.equals(mVMicroMobilityPurchaseOptionSelectionStep.instructions))) {
            return false;
        }
        boolean f = mo28877f();
        boolean f2 = mVMicroMobilityPurchaseOptionSelectionStep.mo28877f();
        if ((f || f2) && (!f || !f2 || !this.buttonText.equals(mVMicroMobilityPurchaseOptionSelectionStep.buttonText))) {
            return false;
        }
        boolean j = mo28882j();
        boolean j2 = mVMicroMobilityPurchaseOptionSelectionStep.mo28882j();
        if ((j || j2) && (!j || !j2 || this.selectedIndex != mVMicroMobilityPurchaseOptionSelectionStep.selectedIndex)) {
            return false;
        }
        boolean i = mo28881i();
        boolean i2 = mVMicroMobilityPurchaseOptionSelectionStep.mo28881i();
        if ((i || i2) && (!i || !i2 || !this.presentationType.equals(mVMicroMobilityPurchaseOptionSelectionStep.presentationType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28877f() {
        return this.buttonText != null;
    }

    /* renamed from: g */
    public final boolean mo28878g() {
        return this.instructions != null;
    }

    /* renamed from: h */
    public final boolean mo28879h() {
        return this.options != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28881i() {
        return this.presentationType != null;
    }

    /* renamed from: j */
    public final boolean mo28882j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo28883k() {
        return this.title != null;
    }

    /* renamed from: l */
    public final boolean mo28884l() {
        return this.type != null;
    }

    /* renamed from: m */
    public final void mo28885m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchaseOptionSelectionStep(", "type:");
        String str = this.type;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("options:");
        List<MVMicroMobilityPurchaseOption> list = this.options;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo28883k()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo28878g()) {
            n.append(", ");
            n.append("instructions:");
            String str3 = this.instructions;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("buttonText:");
        String str4 = this.buttonText;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        if (mo28882j()) {
            n.append(", ");
            n.append("selectedIndex:");
            n.append(this.selectedIndex);
        }
        n.append(", ");
        n.append("presentationType:");
        MVOptionSelectionPresentationType mVOptionSelectionPresentationType = this.presentationType;
        if (mVOptionSelectionPresentationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVOptionSelectionPresentationType);
        }
        n.append(")");
        return n.toString();
    }
}
