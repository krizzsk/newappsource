package com.tranzmate.moovit.protocol.presentation;

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
import p001a0.C0016g;
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

public class MVPresentationLineTemplate implements TBase<MVPresentationLineTemplate, _Fields>, Serializable, Cloneable, Comparable<MVPresentationLineTemplate> {

    /* renamed from: b */
    public static final C25113c f27793b = new C25113c("presentationType", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27794c = new C25113c("imageIndex", (byte) 3, 2);

    /* renamed from: d */
    public static final C25113c f27795d = new C25113c("lineTemplateId", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f27796e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27797f;
    private byte __isset_bitfield = 0;
    public byte imageIndex;
    public int lineTemplateId;
    public MVPresentationType presentationType;

    public enum _Fields implements C25085c {
        PRESENTATION_TYPE(1, "presentationType"),
        IMAGE_INDEX(2, "imageIndex"),
        LINE_TEMPLATE_ID(3, "lineTemplateId");
        
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
                return PRESENTATION_TYPE;
            }
            if (i == 2) {
                return IMAGE_INDEX;
            }
            if (i != 3) {
                return null;
            }
            return LINE_TEMPLATE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVPresentationLineTemplate$a */
    public static class C10137a extends C25239c<MVPresentationLineTemplate> {
        public C10137a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPresentationLineTemplate mVPresentationLineTemplate = (MVPresentationLineTemplate) tBase;
            mVPresentationLineTemplate.getClass();
            C25113c cVar = MVPresentationLineTemplate.f27793b;
            gVar.mo61687K();
            if (mVPresentationLineTemplate.presentationType != null) {
                gVar.mo61711x(MVPresentationLineTemplate.f27793b);
                gVar.mo61678B(mVPresentationLineTemplate.presentationType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPresentationLineTemplate.f27794c);
            gVar.mo61709v(mVPresentationLineTemplate.imageIndex);
            gVar.mo61712y();
            gVar.mo61711x(MVPresentationLineTemplate.f27795d);
            C16530d.m42020n(gVar, mVPresentationLineTemplate.lineTemplateId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPresentationLineTemplate mVPresentationLineTemplate = (MVPresentationLineTemplate) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPresentationLineTemplate.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVPresentationLineTemplate.lineTemplateId = gVar.mo61696i();
                            mVPresentationLineTemplate.mo30764j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 3) {
                        mVPresentationLineTemplate.imageIndex = gVar.mo61691d();
                        mVPresentationLineTemplate.mo30763i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVPresentationLineTemplate.presentationType = MVPresentationType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVPresentationLineTemplate$b */
    public static class C10138b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10137a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVPresentationLineTemplate$c */
    public static class C10139c extends C25240d<MVPresentationLineTemplate> {
        public C10139c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPresentationLineTemplate mVPresentationLineTemplate = (MVPresentationLineTemplate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPresentationLineTemplate.mo30761h()) {
                bitSet.set(0);
            }
            if (mVPresentationLineTemplate.mo30759f()) {
                bitSet.set(1);
            }
            if (mVPresentationLineTemplate.mo30760g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVPresentationLineTemplate.mo30761h()) {
                jVar.mo61678B(mVPresentationLineTemplate.presentationType.getValue());
            }
            if (mVPresentationLineTemplate.mo30759f()) {
                jVar.mo61716P(mVPresentationLineTemplate.imageIndex);
            }
            if (mVPresentationLineTemplate.mo30760g()) {
                jVar.mo61678B(mVPresentationLineTemplate.lineTemplateId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPresentationLineTemplate mVPresentationLineTemplate = (MVPresentationLineTemplate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVPresentationLineTemplate.presentationType = MVPresentationType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVPresentationLineTemplate.imageIndex = jVar.mo61691d();
                mVPresentationLineTemplate.mo30763i();
            }
            if (T.get(2)) {
                mVPresentationLineTemplate.lineTemplateId = jVar.mo61696i();
                mVPresentationLineTemplate.mo30764j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVPresentationLineTemplate$d */
    public static class C10140d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10139c(0);
        }
    }

    static {
        new C17394d0("MVPresentationLineTemplate");
        HashMap hashMap = new HashMap();
        f27796e = hashMap;
        hashMap.put(C25239c.class, new C10138b());
        hashMap.put(C25240d.class, new C10140d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PRESENTATION_TYPE, new FieldMetaData("presentationType", (byte) 3, new EnumMetaData(MVPresentationType.class)));
        enumMap.put(_Fields.IMAGE_INDEX, new FieldMetaData("imageIndex", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.LINE_TEMPLATE_ID, new FieldMetaData("lineTemplateId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27797f = unmodifiableMap;
        FieldMetaData.m61947a(MVPresentationLineTemplate.class, unmodifiableMap);
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
        ((C25238b) f27796e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27796e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVPresentationLineTemplate mVPresentationLineTemplate = (MVPresentationLineTemplate) obj;
        if (!getClass().equals(mVPresentationLineTemplate.getClass())) {
            return getClass().getName().compareTo(mVPresentationLineTemplate.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30761h()).compareTo(Boolean.valueOf(mVPresentationLineTemplate.mo30761h()));
        if (compareTo != 0 || ((mo30761h() && (compareTo = this.presentationType.compareTo(mVPresentationLineTemplate.presentationType)) != 0) || (compareTo = Boolean.valueOf(mo30759f()).compareTo(Boolean.valueOf(mVPresentationLineTemplate.mo30759f()))) != 0 || ((mo30759f() && (compareTo = C25082a.m62837a(this.imageIndex, mVPresentationLineTemplate.imageIndex)) != 0) || (compareTo = Boolean.valueOf(mo30760g()).compareTo(Boolean.valueOf(mVPresentationLineTemplate.mo30760g()))) != 0))) {
            return compareTo;
        }
        if (!mo30760g() || (c = C25082a.m62839c(this.lineTemplateId, mVPresentationLineTemplate.lineTemplateId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPresentationLineTemplate)) {
            return false;
        }
        MVPresentationLineTemplate mVPresentationLineTemplate = (MVPresentationLineTemplate) obj;
        boolean h = mo30761h();
        boolean h2 = mVPresentationLineTemplate.mo30761h();
        if (((!h && !h2) || (h && h2 && this.presentationType.equals(mVPresentationLineTemplate.presentationType))) && this.imageIndex == mVPresentationLineTemplate.imageIndex && this.lineTemplateId == mVPresentationLineTemplate.lineTemplateId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30759f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30760g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo30761h() {
        return this.presentationType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo30763i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: j */
    public final void mo30764j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPresentationLineTemplate(", "presentationType:");
        MVPresentationType mVPresentationType = this.presentationType;
        if (mVPresentationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPresentationType);
        }
        n.append(", ");
        n.append("imageIndex:");
        C0016g.m42z(n, this.imageIndex, ", ", "lineTemplateId:");
        return C13437d.m33707l(n, this.lineTemplateId, ")");
    }
}
