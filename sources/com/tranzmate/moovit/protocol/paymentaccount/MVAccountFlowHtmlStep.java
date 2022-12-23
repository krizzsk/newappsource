package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowHtmlStep implements TBase<MVAccountFlowHtmlStep, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowHtmlStep> {

    /* renamed from: b */
    public static final C25113c f26903b = new C25113c("identifier", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26904c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26905d = new C25113c("content", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f26906e = new C25113c("confirmButtonCaption", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f26907f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26908g;
    public String confirmButtonCaption;
    public MVAccountFlowHtmlSectionContent content;
    public String identifier;
    private _Fields[] optionals = {_Fields.TITLE};
    public String title;

    public enum _Fields implements C25085c {
        IDENTIFIER(1, "identifier"),
        TITLE(2, "title"),
        CONTENT(3, "content"),
        CONFIRM_BUTTON_CAPTION(4, "confirmButtonCaption");
        
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
                return IDENTIFIER;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i == 3) {
                return CONTENT;
            }
            if (i != 4) {
                return null;
            }
            return CONFIRM_BUTTON_CAPTION;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStep$a */
    public static class C9469a extends C25239c<MVAccountFlowHtmlStep> {
        public C9469a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowHtmlStep mVAccountFlowHtmlStep = (MVAccountFlowHtmlStep) tBase;
            MVAccountFlowHtmlSectionContent mVAccountFlowHtmlSectionContent = mVAccountFlowHtmlStep.content;
            C25113c cVar = MVAccountFlowHtmlStep.f26903b;
            gVar.mo61687K();
            if (mVAccountFlowHtmlStep.identifier != null) {
                gVar.mo61711x(MVAccountFlowHtmlStep.f26903b);
                gVar.mo61686J(mVAccountFlowHtmlStep.identifier);
                gVar.mo61712y();
            }
            if (mVAccountFlowHtmlStep.title != null && mVAccountFlowHtmlStep.mo29287i()) {
                gVar.mo61711x(MVAccountFlowHtmlStep.f26904c);
                gVar.mo61686J(mVAccountFlowHtmlStep.title);
                gVar.mo61712y();
            }
            if (mVAccountFlowHtmlStep.content != null) {
                gVar.mo61711x(MVAccountFlowHtmlStep.f26905d);
                mVAccountFlowHtmlStep.content.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccountFlowHtmlStep.confirmButtonCaption != null) {
                gVar.mo61711x(MVAccountFlowHtmlStep.f26906e);
                gVar.mo61686J(mVAccountFlowHtmlStep.confirmButtonCaption);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowHtmlStep mVAccountFlowHtmlStep = (MVAccountFlowHtmlStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVAccountFlowHtmlSectionContent mVAccountFlowHtmlSectionContent = mVAccountFlowHtmlStep.content;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVAccountFlowHtmlStep.confirmButtonCaption = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVAccountFlowHtmlSectionContent mVAccountFlowHtmlSectionContent2 = new MVAccountFlowHtmlSectionContent();
                            mVAccountFlowHtmlStep.content = mVAccountFlowHtmlSectionContent2;
                            mVAccountFlowHtmlSectionContent2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAccountFlowHtmlStep.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAccountFlowHtmlStep.identifier = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStep$b */
    public static class C9470b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9469a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStep$c */
    public static class C9471c extends C25240d<MVAccountFlowHtmlStep> {
        public C9471c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowHtmlStep mVAccountFlowHtmlStep = (MVAccountFlowHtmlStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowHtmlStep.mo29285h()) {
                bitSet.set(0);
            }
            if (mVAccountFlowHtmlStep.mo29287i()) {
                bitSet.set(1);
            }
            if (mVAccountFlowHtmlStep.mo29284g()) {
                bitSet.set(2);
            }
            if (mVAccountFlowHtmlStep.mo29283f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVAccountFlowHtmlStep.mo29285h()) {
                jVar.mo61686J(mVAccountFlowHtmlStep.identifier);
            }
            if (mVAccountFlowHtmlStep.mo29287i()) {
                jVar.mo61686J(mVAccountFlowHtmlStep.title);
            }
            if (mVAccountFlowHtmlStep.mo29284g()) {
                mVAccountFlowHtmlStep.content.mo25202X0(jVar);
            }
            if (mVAccountFlowHtmlStep.mo29283f()) {
                jVar.mo61686J(mVAccountFlowHtmlStep.confirmButtonCaption);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowHtmlStep mVAccountFlowHtmlStep = (MVAccountFlowHtmlStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVAccountFlowHtmlStep.identifier = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVAccountFlowHtmlStep.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVAccountFlowHtmlSectionContent mVAccountFlowHtmlSectionContent = new MVAccountFlowHtmlSectionContent();
                mVAccountFlowHtmlStep.content = mVAccountFlowHtmlSectionContent;
                mVAccountFlowHtmlSectionContent.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVAccountFlowHtmlStep.confirmButtonCaption = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStep$d */
    public static class C9472d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9471c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowHtmlStep");
        HashMap hashMap = new HashMap();
        f26907f = hashMap;
        hashMap.put(C25239c.class, new C9470b());
        hashMap.put(C25240d.class, new C9472d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IDENTIFIER, new FieldMetaData("identifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CONTENT, new FieldMetaData("content", (byte) 3, new StructMetaData(MVAccountFlowHtmlSectionContent.class)));
        enumMap.put(_Fields.CONFIRM_BUTTON_CAPTION, new FieldMetaData("confirmButtonCaption", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26908g = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowHtmlStep.class, unmodifiableMap);
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
        ((C25238b) f26907f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26907f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowHtmlStep mVAccountFlowHtmlStep = (MVAccountFlowHtmlStep) obj;
        if (!getClass().equals(mVAccountFlowHtmlStep.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowHtmlStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29285h()).compareTo(Boolean.valueOf(mVAccountFlowHtmlStep.mo29285h()));
        if (compareTo2 != 0 || ((mo29285h() && (compareTo2 = this.identifier.compareTo(mVAccountFlowHtmlStep.identifier)) != 0) || (compareTo2 = Boolean.valueOf(mo29287i()).compareTo(Boolean.valueOf(mVAccountFlowHtmlStep.mo29287i()))) != 0 || ((mo29287i() && (compareTo2 = this.title.compareTo(mVAccountFlowHtmlStep.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29284g()).compareTo(Boolean.valueOf(mVAccountFlowHtmlStep.mo29284g()))) != 0 || ((mo29284g() && (compareTo2 = this.content.compareTo(mVAccountFlowHtmlStep.content)) != 0) || (compareTo2 = Boolean.valueOf(mo29283f()).compareTo(Boolean.valueOf(mVAccountFlowHtmlStep.mo29283f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29283f() || (compareTo = this.confirmButtonCaption.compareTo(mVAccountFlowHtmlStep.confirmButtonCaption)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowHtmlStep)) {
            return false;
        }
        MVAccountFlowHtmlStep mVAccountFlowHtmlStep = (MVAccountFlowHtmlStep) obj;
        boolean h = mo29285h();
        boolean h2 = mVAccountFlowHtmlStep.mo29285h();
        if ((h || h2) && (!h || !h2 || !this.identifier.equals(mVAccountFlowHtmlStep.identifier))) {
            return false;
        }
        boolean i = mo29287i();
        boolean i2 = mVAccountFlowHtmlStep.mo29287i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVAccountFlowHtmlStep.title))) {
            return false;
        }
        boolean g = mo29284g();
        boolean g2 = mVAccountFlowHtmlStep.mo29284g();
        if ((g || g2) && (!g || !g2 || !this.content.mo29274a(mVAccountFlowHtmlStep.content))) {
            return false;
        }
        boolean f = mo29283f();
        boolean f2 = mVAccountFlowHtmlStep.mo29283f();
        if ((f || f2) && (!f || !f2 || !this.confirmButtonCaption.equals(mVAccountFlowHtmlStep.confirmButtonCaption))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29283f() {
        return this.confirmButtonCaption != null;
    }

    /* renamed from: g */
    public final boolean mo29284g() {
        return this.content != null;
    }

    /* renamed from: h */
    public final boolean mo29285h() {
        return this.identifier != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29287i() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowHtmlStep(", "identifier:");
        String str = this.identifier;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29287i()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("content:");
        MVAccountFlowHtmlSectionContent mVAccountFlowHtmlSectionContent = this.content;
        if (mVAccountFlowHtmlSectionContent == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVAccountFlowHtmlSectionContent);
        }
        n.append(", ");
        n.append("confirmButtonCaption:");
        String str3 = this.confirmButtonCaption;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(")");
        return n.toString();
    }
}
