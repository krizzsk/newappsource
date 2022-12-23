package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowOptionSelectionStep implements TBase<MVAccountFlowOptionSelectionStep, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowOptionSelectionStep> {

    /* renamed from: b */
    public static final C25113c f26945b = new C25113c("type", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26946c = new C25113c("options", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f26947d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26948e = new C25113c("instructions", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26949f = new C25113c("buttonText", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f26950g = new C25113c("selectedIndex", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f26951h = new C25113c("presentationType", (byte) 8, 7);

    /* renamed from: i */
    public static final HashMap f26952i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f26953j;
    private byte __isset_bitfield = 0;
    public String buttonText;
    public String instructions;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.INSTRUCTIONS, _Fields.SELECTED_INDEX};
    public List<MVAccountFlowOption> options;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStep$a */
    public static class C9498a extends C25239c<MVAccountFlowOptionSelectionStep> {
        public C9498a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOptionSelectionStep mVAccountFlowOptionSelectionStep = (MVAccountFlowOptionSelectionStep) tBase;
            mVAccountFlowOptionSelectionStep.getClass();
            C25113c cVar = MVAccountFlowOptionSelectionStep.f26945b;
            gVar.mo61687K();
            if (mVAccountFlowOptionSelectionStep.type != null) {
                gVar.mo61711x(MVAccountFlowOptionSelectionStep.f26945b);
                gVar.mo61686J(mVAccountFlowOptionSelectionStep.type);
                gVar.mo61712y();
            }
            if (mVAccountFlowOptionSelectionStep.options != null) {
                gVar.mo61711x(MVAccountFlowOptionSelectionStep.f26946c);
                gVar.mo61680D(new C25119e((byte) 12, mVAccountFlowOptionSelectionStep.options.size()));
                for (MVAccountFlowOption X0 : mVAccountFlowOptionSelectionStep.options) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVAccountFlowOptionSelectionStep.title != null && mVAccountFlowOptionSelectionStep.mo29350k()) {
                gVar.mo61711x(MVAccountFlowOptionSelectionStep.f26947d);
                gVar.mo61686J(mVAccountFlowOptionSelectionStep.title);
                gVar.mo61712y();
            }
            if (mVAccountFlowOptionSelectionStep.instructions != null && mVAccountFlowOptionSelectionStep.mo29345g()) {
                gVar.mo61711x(MVAccountFlowOptionSelectionStep.f26948e);
                gVar.mo61686J(mVAccountFlowOptionSelectionStep.instructions);
                gVar.mo61712y();
            }
            if (mVAccountFlowOptionSelectionStep.buttonText != null) {
                gVar.mo61711x(MVAccountFlowOptionSelectionStep.f26949f);
                gVar.mo61686J(mVAccountFlowOptionSelectionStep.buttonText);
                gVar.mo61712y();
            }
            if (mVAccountFlowOptionSelectionStep.mo29349j()) {
                gVar.mo61711x(MVAccountFlowOptionSelectionStep.f26950g);
                gVar.mo61678B(mVAccountFlowOptionSelectionStep.selectedIndex);
                gVar.mo61712y();
            }
            if (mVAccountFlowOptionSelectionStep.presentationType != null) {
                gVar.mo61711x(MVAccountFlowOptionSelectionStep.f26951h);
                gVar.mo61678B(mVAccountFlowOptionSelectionStep.presentationType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOptionSelectionStep mVAccountFlowOptionSelectionStep = (MVAccountFlowOptionSelectionStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAccountFlowOptionSelectionStep.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowOptionSelectionStep.type = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVAccountFlowOptionSelectionStep.options = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVAccountFlowOption mVAccountFlowOption = new MVAccountFlowOption();
                                mVAccountFlowOption.mo25201C1(gVar);
                                mVAccountFlowOptionSelectionStep.options.add(mVAccountFlowOption);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowOptionSelectionStep.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowOptionSelectionStep.instructions = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowOptionSelectionStep.buttonText = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowOptionSelectionStep.selectedIndex = gVar.mo61696i();
                            mVAccountFlowOptionSelectionStep.mo29352m();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowOptionSelectionStep.presentationType = MVOptionSelectionPresentationType.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStep$b */
    public static class C9499b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9498a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStep$c */
    public static class C9500c extends C25240d<MVAccountFlowOptionSelectionStep> {
        public C9500c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOptionSelectionStep mVAccountFlowOptionSelectionStep = (MVAccountFlowOptionSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowOptionSelectionStep.mo29351l()) {
                bitSet.set(0);
            }
            if (mVAccountFlowOptionSelectionStep.mo29346h()) {
                bitSet.set(1);
            }
            if (mVAccountFlowOptionSelectionStep.mo29350k()) {
                bitSet.set(2);
            }
            if (mVAccountFlowOptionSelectionStep.mo29345g()) {
                bitSet.set(3);
            }
            if (mVAccountFlowOptionSelectionStep.mo29344f()) {
                bitSet.set(4);
            }
            if (mVAccountFlowOptionSelectionStep.mo29349j()) {
                bitSet.set(5);
            }
            if (mVAccountFlowOptionSelectionStep.mo29348i()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVAccountFlowOptionSelectionStep.mo29351l()) {
                jVar.mo61686J(mVAccountFlowOptionSelectionStep.type);
            }
            if (mVAccountFlowOptionSelectionStep.mo29346h()) {
                jVar.mo61678B(mVAccountFlowOptionSelectionStep.options.size());
                for (MVAccountFlowOption X0 : mVAccountFlowOptionSelectionStep.options) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVAccountFlowOptionSelectionStep.mo29350k()) {
                jVar.mo61686J(mVAccountFlowOptionSelectionStep.title);
            }
            if (mVAccountFlowOptionSelectionStep.mo29345g()) {
                jVar.mo61686J(mVAccountFlowOptionSelectionStep.instructions);
            }
            if (mVAccountFlowOptionSelectionStep.mo29344f()) {
                jVar.mo61686J(mVAccountFlowOptionSelectionStep.buttonText);
            }
            if (mVAccountFlowOptionSelectionStep.mo29349j()) {
                jVar.mo61678B(mVAccountFlowOptionSelectionStep.selectedIndex);
            }
            if (mVAccountFlowOptionSelectionStep.mo29348i()) {
                jVar.mo61678B(mVAccountFlowOptionSelectionStep.presentationType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowOptionSelectionStep mVAccountFlowOptionSelectionStep = (MVAccountFlowOptionSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVAccountFlowOptionSelectionStep.type = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVAccountFlowOptionSelectionStep.options = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAccountFlowOption mVAccountFlowOption = new MVAccountFlowOption();
                    mVAccountFlowOption.mo25201C1(jVar);
                    mVAccountFlowOptionSelectionStep.options.add(mVAccountFlowOption);
                }
            }
            if (T.get(2)) {
                mVAccountFlowOptionSelectionStep.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVAccountFlowOptionSelectionStep.instructions = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVAccountFlowOptionSelectionStep.buttonText = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVAccountFlowOptionSelectionStep.selectedIndex = jVar.mo61696i();
                mVAccountFlowOptionSelectionStep.mo29352m();
            }
            if (T.get(6)) {
                mVAccountFlowOptionSelectionStep.presentationType = MVOptionSelectionPresentationType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStep$d */
    public static class C9501d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9500c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowOptionSelectionStep");
        HashMap hashMap = new HashMap();
        f26952i = hashMap;
        hashMap.put(C25239c.class, new C9499b());
        hashMap.put(C25240d.class, new C9501d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.OPTIONS, new FieldMetaData("options", (byte) 3, new ListMetaData(new StructMetaData(MVAccountFlowOption.class))));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BUTTON_TEXT, new FieldMetaData("buttonText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SELECTED_INDEX, new FieldMetaData("selectedIndex", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PRESENTATION_TYPE, new FieldMetaData("presentationType", (byte) 3, new EnumMetaData(MVOptionSelectionPresentationType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26953j = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowOptionSelectionStep.class, unmodifiableMap);
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
        ((C25238b) f26952i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26952i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowOptionSelectionStep mVAccountFlowOptionSelectionStep = (MVAccountFlowOptionSelectionStep) obj;
        if (!getClass().equals(mVAccountFlowOptionSelectionStep.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowOptionSelectionStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29351l()).compareTo(Boolean.valueOf(mVAccountFlowOptionSelectionStep.mo29351l()));
        if (compareTo2 != 0 || ((mo29351l() && (compareTo2 = this.type.compareTo(mVAccountFlowOptionSelectionStep.type)) != 0) || (compareTo2 = Boolean.valueOf(mo29346h()).compareTo(Boolean.valueOf(mVAccountFlowOptionSelectionStep.mo29346h()))) != 0 || ((mo29346h() && (compareTo2 = C25082a.m62844h(this.options, mVAccountFlowOptionSelectionStep.options)) != 0) || (compareTo2 = Boolean.valueOf(mo29350k()).compareTo(Boolean.valueOf(mVAccountFlowOptionSelectionStep.mo29350k()))) != 0 || ((mo29350k() && (compareTo2 = this.title.compareTo(mVAccountFlowOptionSelectionStep.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29345g()).compareTo(Boolean.valueOf(mVAccountFlowOptionSelectionStep.mo29345g()))) != 0 || ((mo29345g() && (compareTo2 = this.instructions.compareTo(mVAccountFlowOptionSelectionStep.instructions)) != 0) || (compareTo2 = Boolean.valueOf(mo29344f()).compareTo(Boolean.valueOf(mVAccountFlowOptionSelectionStep.mo29344f()))) != 0 || ((mo29344f() && (compareTo2 = this.buttonText.compareTo(mVAccountFlowOptionSelectionStep.buttonText)) != 0) || (compareTo2 = Boolean.valueOf(mo29349j()).compareTo(Boolean.valueOf(mVAccountFlowOptionSelectionStep.mo29349j()))) != 0 || ((mo29349j() && (compareTo2 = C25082a.m62839c(this.selectedIndex, mVAccountFlowOptionSelectionStep.selectedIndex)) != 0) || (compareTo2 = Boolean.valueOf(mo29348i()).compareTo(Boolean.valueOf(mVAccountFlowOptionSelectionStep.mo29348i()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo29348i() || (compareTo = this.presentationType.compareTo(mVAccountFlowOptionSelectionStep.presentationType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowOptionSelectionStep)) {
            return false;
        }
        MVAccountFlowOptionSelectionStep mVAccountFlowOptionSelectionStep = (MVAccountFlowOptionSelectionStep) obj;
        boolean l = mo29351l();
        boolean l2 = mVAccountFlowOptionSelectionStep.mo29351l();
        if ((l || l2) && (!l || !l2 || !this.type.equals(mVAccountFlowOptionSelectionStep.type))) {
            return false;
        }
        boolean h = mo29346h();
        boolean h2 = mVAccountFlowOptionSelectionStep.mo29346h();
        if ((h || h2) && (!h || !h2 || !this.options.equals(mVAccountFlowOptionSelectionStep.options))) {
            return false;
        }
        boolean k = mo29350k();
        boolean k2 = mVAccountFlowOptionSelectionStep.mo29350k();
        if ((k || k2) && (!k || !k2 || !this.title.equals(mVAccountFlowOptionSelectionStep.title))) {
            return false;
        }
        boolean g = mo29345g();
        boolean g2 = mVAccountFlowOptionSelectionStep.mo29345g();
        if ((g || g2) && (!g || !g2 || !this.instructions.equals(mVAccountFlowOptionSelectionStep.instructions))) {
            return false;
        }
        boolean f = mo29344f();
        boolean f2 = mVAccountFlowOptionSelectionStep.mo29344f();
        if ((f || f2) && (!f || !f2 || !this.buttonText.equals(mVAccountFlowOptionSelectionStep.buttonText))) {
            return false;
        }
        boolean j = mo29349j();
        boolean j2 = mVAccountFlowOptionSelectionStep.mo29349j();
        if ((j || j2) && (!j || !j2 || this.selectedIndex != mVAccountFlowOptionSelectionStep.selectedIndex)) {
            return false;
        }
        boolean i = mo29348i();
        boolean i2 = mVAccountFlowOptionSelectionStep.mo29348i();
        if ((i || i2) && (!i || !i2 || !this.presentationType.equals(mVAccountFlowOptionSelectionStep.presentationType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29344f() {
        return this.buttonText != null;
    }

    /* renamed from: g */
    public final boolean mo29345g() {
        return this.instructions != null;
    }

    /* renamed from: h */
    public final boolean mo29346h() {
        return this.options != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29348i() {
        return this.presentationType != null;
    }

    /* renamed from: j */
    public final boolean mo29349j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo29350k() {
        return this.title != null;
    }

    /* renamed from: l */
    public final boolean mo29351l() {
        return this.type != null;
    }

    /* renamed from: m */
    public final void mo29352m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowOptionSelectionStep(", "type:");
        String str = this.type;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("options:");
        List<MVAccountFlowOption> list = this.options;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo29350k()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo29345g()) {
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
        if (mo29349j()) {
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
