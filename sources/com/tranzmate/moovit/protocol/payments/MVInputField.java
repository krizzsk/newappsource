package com.tranzmate.moovit.protocol.payments;

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
import p358af.C13437d;
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

public class MVInputField implements TBase<MVInputField, _Fields>, Serializable, Cloneable, Comparable<MVInputField> {

    /* renamed from: b */
    public static final C25113c f27318b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27319c = new C25113c("type", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f27320d = new C25113c("hint", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27321e = new C25113c("error", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27322f = new C25113c("placeholderText", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f27323g = new C25113c("accessibilityText", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f27324h = new C25113c("maxCharacters", (byte) 8, 7);

    /* renamed from: i */
    public static final HashMap f27325i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f27326j;
    private byte __isset_bitfield = 0;
    public String accessibilityText;
    public String error;
    public String hint;

    /* renamed from: id */
    public String f27327id;
    public int maxCharacters;
    private _Fields[] optionals = {_Fields.PLACEHOLDER_TEXT, _Fields.ACCESSIBILITY_TEXT, _Fields.MAX_CHARACTERS};
    public String placeholderText;
    public MVInputFieldType type;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        TYPE(2, "type"),
        HINT(3, "hint"),
        ERROR(4, "error"),
        PLACEHOLDER_TEXT(5, "placeholderText"),
        ACCESSIBILITY_TEXT(6, "accessibilityText"),
        MAX_CHARACTERS(7, "maxCharacters");
        
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
                    return ID;
                case 2:
                    return TYPE;
                case 3:
                    return HINT;
                case 4:
                    return ERROR;
                case 5:
                    return PLACEHOLDER_TEXT;
                case 6:
                    return ACCESSIBILITY_TEXT;
                case 7:
                    return MAX_CHARACTERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputField$a */
    public static class C9797a extends C25239c<MVInputField> {
        public C9797a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInputField mVInputField = (MVInputField) tBase;
            mVInputField.getClass();
            C25113c cVar = MVInputField.f27318b;
            gVar.mo61687K();
            if (mVInputField.f27327id != null) {
                gVar.mo61711x(MVInputField.f27318b);
                gVar.mo61686J(mVInputField.f27327id);
                gVar.mo61712y();
            }
            if (mVInputField.type != null) {
                gVar.mo61711x(MVInputField.f27319c);
                gVar.mo61678B(mVInputField.type.getValue());
                gVar.mo61712y();
            }
            if (mVInputField.hint != null) {
                gVar.mo61711x(MVInputField.f27320d);
                gVar.mo61686J(mVInputField.hint);
                gVar.mo61712y();
            }
            if (mVInputField.error != null) {
                gVar.mo61711x(MVInputField.f27321e);
                gVar.mo61686J(mVInputField.error);
                gVar.mo61712y();
            }
            if (mVInputField.placeholderText != null && mVInputField.mo29970k()) {
                gVar.mo61711x(MVInputField.f27322f);
                gVar.mo61686J(mVInputField.placeholderText);
                gVar.mo61712y();
            }
            if (mVInputField.accessibilityText != null && mVInputField.mo29964f()) {
                gVar.mo61711x(MVInputField.f27323g);
                gVar.mo61686J(mVInputField.accessibilityText);
                gVar.mo61712y();
            }
            if (mVInputField.mo29969j()) {
                gVar.mo61711x(MVInputField.f27324h);
                gVar.mo61678B(mVInputField.maxCharacters);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInputField mVInputField = (MVInputField) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVInputField.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputField.f27327id = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputField.type = MVInputFieldType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputField.hint = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputField.error = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputField.placeholderText = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputField.accessibilityText = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputField.maxCharacters = gVar.mo61696i();
                            mVInputField.mo29972m();
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputField$b */
    public static class C9798b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9797a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputField$c */
    public static class C9799c extends C25240d<MVInputField> {
        public C9799c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInputField mVInputField = (MVInputField) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVInputField.mo29968i()) {
                bitSet.set(0);
            }
            if (mVInputField.mo29971l()) {
                bitSet.set(1);
            }
            if (mVInputField.mo29966h()) {
                bitSet.set(2);
            }
            if (mVInputField.mo29965g()) {
                bitSet.set(3);
            }
            if (mVInputField.mo29970k()) {
                bitSet.set(4);
            }
            if (mVInputField.mo29964f()) {
                bitSet.set(5);
            }
            if (mVInputField.mo29969j()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVInputField.mo29968i()) {
                jVar.mo61686J(mVInputField.f27327id);
            }
            if (mVInputField.mo29971l()) {
                jVar.mo61678B(mVInputField.type.getValue());
            }
            if (mVInputField.mo29966h()) {
                jVar.mo61686J(mVInputField.hint);
            }
            if (mVInputField.mo29965g()) {
                jVar.mo61686J(mVInputField.error);
            }
            if (mVInputField.mo29970k()) {
                jVar.mo61686J(mVInputField.placeholderText);
            }
            if (mVInputField.mo29964f()) {
                jVar.mo61686J(mVInputField.accessibilityText);
            }
            if (mVInputField.mo29969j()) {
                jVar.mo61678B(mVInputField.maxCharacters);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInputField mVInputField = (MVInputField) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVInputField.f27327id = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVInputField.type = MVInputFieldType.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVInputField.hint = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVInputField.error = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVInputField.placeholderText = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVInputField.accessibilityText = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVInputField.maxCharacters = jVar.mo61696i();
                mVInputField.mo29972m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputField$d */
    public static class C9800d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9799c(0);
        }
    }

    static {
        new C17394d0("MVInputField");
        HashMap hashMap = new HashMap();
        f27325i = hashMap;
        hashMap.put(C25239c.class, new C9798b());
        hashMap.put(C25240d.class, new C9800d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVInputFieldType.class)));
        enumMap.put(_Fields.HINT, new FieldMetaData("hint", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ERROR, new FieldMetaData("error", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PLACEHOLDER_TEXT, new FieldMetaData("placeholderText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACCESSIBILITY_TEXT, new FieldMetaData("accessibilityText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MAX_CHARACTERS, new FieldMetaData("maxCharacters", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27326j = unmodifiableMap;
        FieldMetaData.m61947a(MVInputField.class, unmodifiableMap);
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
        ((C25238b) f27325i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27325i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29961a(MVInputField mVInputField) {
        if (mVInputField == null) {
            return false;
        }
        boolean i = mo29968i();
        boolean i2 = mVInputField.mo29968i();
        if ((i || i2) && (!i || !i2 || !this.f27327id.equals(mVInputField.f27327id))) {
            return false;
        }
        boolean l = mo29971l();
        boolean l2 = mVInputField.mo29971l();
        if ((l || l2) && (!l || !l2 || !this.type.equals(mVInputField.type))) {
            return false;
        }
        boolean h = mo29966h();
        boolean h2 = mVInputField.mo29966h();
        if ((h || h2) && (!h || !h2 || !this.hint.equals(mVInputField.hint))) {
            return false;
        }
        boolean g = mo29965g();
        boolean g2 = mVInputField.mo29965g();
        if ((g || g2) && (!g || !g2 || !this.error.equals(mVInputField.error))) {
            return false;
        }
        boolean k = mo29970k();
        boolean k2 = mVInputField.mo29970k();
        if ((k || k2) && (!k || !k2 || !this.placeholderText.equals(mVInputField.placeholderText))) {
            return false;
        }
        boolean f = mo29964f();
        boolean f2 = mVInputField.mo29964f();
        if ((f || f2) && (!f || !f2 || !this.accessibilityText.equals(mVInputField.accessibilityText))) {
            return false;
        }
        boolean j = mo29969j();
        boolean j2 = mVInputField.mo29969j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || this.maxCharacters != mVInputField.maxCharacters) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVInputField mVInputField = (MVInputField) obj;
        if (!getClass().equals(mVInputField.getClass())) {
            return getClass().getName().compareTo(mVInputField.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29968i()).compareTo(Boolean.valueOf(mVInputField.mo29968i()));
        if (compareTo != 0 || ((mo29968i() && (compareTo = this.f27327id.compareTo(mVInputField.f27327id)) != 0) || (compareTo = Boolean.valueOf(mo29971l()).compareTo(Boolean.valueOf(mVInputField.mo29971l()))) != 0 || ((mo29971l() && (compareTo = this.type.compareTo(mVInputField.type)) != 0) || (compareTo = Boolean.valueOf(mo29966h()).compareTo(Boolean.valueOf(mVInputField.mo29966h()))) != 0 || ((mo29966h() && (compareTo = this.hint.compareTo(mVInputField.hint)) != 0) || (compareTo = Boolean.valueOf(mo29965g()).compareTo(Boolean.valueOf(mVInputField.mo29965g()))) != 0 || ((mo29965g() && (compareTo = this.error.compareTo(mVInputField.error)) != 0) || (compareTo = Boolean.valueOf(mo29970k()).compareTo(Boolean.valueOf(mVInputField.mo29970k()))) != 0 || ((mo29970k() && (compareTo = this.placeholderText.compareTo(mVInputField.placeholderText)) != 0) || (compareTo = Boolean.valueOf(mo29964f()).compareTo(Boolean.valueOf(mVInputField.mo29964f()))) != 0 || ((mo29964f() && (compareTo = this.accessibilityText.compareTo(mVInputField.accessibilityText)) != 0) || (compareTo = Boolean.valueOf(mo29969j()).compareTo(Boolean.valueOf(mVInputField.mo29969j()))) != 0))))))) {
            return compareTo;
        }
        if (!mo29969j() || (c = C25082a.m62839c(this.maxCharacters, mVInputField.maxCharacters)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVInputField)) {
            return mo29961a((MVInputField) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29964f() {
        return this.accessibilityText != null;
    }

    /* renamed from: g */
    public final boolean mo29965g() {
        return this.error != null;
    }

    /* renamed from: h */
    public final boolean mo29966h() {
        return this.hint != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29968i() {
        return this.f27327id != null;
    }

    /* renamed from: j */
    public final boolean mo29969j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo29970k() {
        return this.placeholderText != null;
    }

    /* renamed from: l */
    public final boolean mo29971l() {
        return this.type != null;
    }

    /* renamed from: m */
    public final void mo29972m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVInputField(", "id:");
        String str = this.f27327id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("type:");
        MVInputFieldType mVInputFieldType = this.type;
        if (mVInputFieldType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVInputFieldType);
        }
        n.append(", ");
        n.append("hint:");
        String str2 = this.hint;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("error:");
        String str3 = this.error;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo29970k()) {
            n.append(", ");
            n.append("placeholderText:");
            String str4 = this.placeholderText;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo29964f()) {
            n.append(", ");
            n.append("accessibilityText:");
            String str5 = this.accessibilityText;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        if (mo29969j()) {
            n.append(", ");
            n.append("maxCharacters:");
            n.append(this.maxCharacters);
        }
        n.append(")");
        return n.toString();
    }
}
