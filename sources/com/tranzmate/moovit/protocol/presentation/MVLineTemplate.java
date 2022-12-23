package com.tranzmate.moovit.protocol.presentation;

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
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVLineTemplate implements TBase<MVLineTemplate, _Fields>, Serializable, Cloneable, Comparable<MVLineTemplate> {

    /* renamed from: b */
    public static final C25113c f27784b = new C25113c("lineTemplateId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27785c = new C25113c("titleConditional", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27786d = new C25113c("imageConditional", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27787e = new C25113c("imageTextConditional", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27788f = new C25113c("agencyImageShown", (byte) 2, 5);

    /* renamed from: g */
    public static final C25113c f27789g = new C25113c("delimiterToken", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f27790h = new C25113c("detailsList", (byte) 15, 7);

    /* renamed from: i */
    public static final HashMap f27791i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f27792j;
    private byte __isset_bitfield = 0;
    public boolean agencyImageShown;
    public MVDelimiterToken delimiterToken;
    public List<MVLineTemplateToken> detailsList;
    public MVConditional imageConditional;
    public MVTokenConditional imageTextConditional;
    public int lineTemplateId;
    public MVTokenConditional titleConditional;

    public enum _Fields implements C25085c {
        LINE_TEMPLATE_ID(1, "lineTemplateId"),
        TITLE_CONDITIONAL(2, "titleConditional"),
        IMAGE_CONDITIONAL(3, "imageConditional"),
        IMAGE_TEXT_CONDITIONAL(4, "imageTextConditional"),
        AGENCY_IMAGE_SHOWN(5, "agencyImageShown"),
        DELIMITER_TOKEN(6, "delimiterToken"),
        DETAILS_LIST(7, "detailsList");
        
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
                    return LINE_TEMPLATE_ID;
                case 2:
                    return TITLE_CONDITIONAL;
                case 3:
                    return IMAGE_CONDITIONAL;
                case 4:
                    return IMAGE_TEXT_CONDITIONAL;
                case 5:
                    return AGENCY_IMAGE_SHOWN;
                case 6:
                    return DELIMITER_TOKEN;
                case 7:
                    return DETAILS_LIST;
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

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVLineTemplate$a */
    public static class C10133a extends C25239c<MVLineTemplate> {
        public C10133a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineTemplate mVLineTemplate = (MVLineTemplate) tBase;
            mVLineTemplate.getClass();
            C25113c cVar = MVLineTemplate.f27784b;
            gVar.mo61687K();
            gVar.mo61711x(MVLineTemplate.f27784b);
            gVar.mo61678B(mVLineTemplate.lineTemplateId);
            gVar.mo61712y();
            if (mVLineTemplate.titleConditional != null) {
                gVar.mo61711x(MVLineTemplate.f27785c);
                mVLineTemplate.titleConditional.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLineTemplate.imageConditional != null) {
                gVar.mo61711x(MVLineTemplate.f27786d);
                mVLineTemplate.imageConditional.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVLineTemplate.imageTextConditional != null) {
                gVar.mo61711x(MVLineTemplate.f27787e);
                mVLineTemplate.imageTextConditional.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVLineTemplate.f27788f);
            gVar.mo61708u(mVLineTemplate.agencyImageShown);
            gVar.mo61712y();
            if (mVLineTemplate.delimiterToken != null) {
                gVar.mo61711x(MVLineTemplate.f27789g);
                gVar.mo61678B(mVLineTemplate.delimiterToken.getValue());
                gVar.mo61712y();
            }
            if (mVLineTemplate.detailsList != null) {
                gVar.mo61711x(MVLineTemplate.f27790h);
                gVar.mo61680D(new C25119e((byte) 8, mVLineTemplate.detailsList.size()));
                for (MVLineTemplateToken value : mVLineTemplate.detailsList) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineTemplate mVLineTemplate = (MVLineTemplate) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVLineTemplate.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineTemplate.lineTemplateId = gVar.mo61696i();
                            mVLineTemplate.mo30753o();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTokenConditional mVTokenConditional = new MVTokenConditional();
                            mVLineTemplate.titleConditional = mVTokenConditional;
                            mVTokenConditional.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVConditional mVConditional = new MVConditional();
                            mVLineTemplate.imageConditional = mVConditional;
                            mVConditional.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTokenConditional mVTokenConditional2 = new MVTokenConditional();
                            mVLineTemplate.imageTextConditional = mVTokenConditional2;
                            mVTokenConditional2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineTemplate.agencyImageShown = gVar.mo61690c();
                            mVLineTemplate.mo30752m();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVLineTemplate.delimiterToken = MVDelimiterToken.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVLineTemplate.detailsList = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVLineTemplate.detailsList.add(MVLineTemplateToken.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
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

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVLineTemplate$b */
    public static class C10134b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10133a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVLineTemplate$c */
    public static class C10135c extends C25240d<MVLineTemplate> {
        public C10135c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVLineTemplate mVLineTemplate = (MVLineTemplate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVLineTemplate.mo30750k()) {
                bitSet.set(0);
            }
            if (mVLineTemplate.mo30751l()) {
                bitSet.set(1);
            }
            if (mVLineTemplate.mo30748i()) {
                bitSet.set(2);
            }
            if (mVLineTemplate.mo30749j()) {
                bitSet.set(3);
            }
            if (mVLineTemplate.mo30744f()) {
                bitSet.set(4);
            }
            if (mVLineTemplate.mo30745g()) {
                bitSet.set(5);
            }
            if (mVLineTemplate.mo30746h()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVLineTemplate.mo30750k()) {
                jVar.mo61678B(mVLineTemplate.lineTemplateId);
            }
            if (mVLineTemplate.mo30751l()) {
                mVLineTemplate.titleConditional.mo25202X0(jVar);
            }
            if (mVLineTemplate.mo30748i()) {
                mVLineTemplate.imageConditional.mo25202X0(jVar);
            }
            if (mVLineTemplate.mo30749j()) {
                mVLineTemplate.imageTextConditional.mo25202X0(jVar);
            }
            if (mVLineTemplate.mo30744f()) {
                jVar.mo61708u(mVLineTemplate.agencyImageShown);
            }
            if (mVLineTemplate.mo30745g()) {
                jVar.mo61678B(mVLineTemplate.delimiterToken.getValue());
            }
            if (mVLineTemplate.mo30746h()) {
                jVar.mo61678B(mVLineTemplate.detailsList.size());
                for (MVLineTemplateToken value : mVLineTemplate.detailsList) {
                    jVar.mo61678B(value.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVLineTemplate mVLineTemplate = (MVLineTemplate) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVLineTemplate.lineTemplateId = jVar.mo61696i();
                mVLineTemplate.mo30753o();
            }
            if (T.get(1)) {
                MVTokenConditional mVTokenConditional = new MVTokenConditional();
                mVLineTemplate.titleConditional = mVTokenConditional;
                mVTokenConditional.mo25201C1(jVar);
            }
            if (T.get(2)) {
                MVConditional mVConditional = new MVConditional();
                mVLineTemplate.imageConditional = mVConditional;
                mVConditional.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVTokenConditional mVTokenConditional2 = new MVTokenConditional();
                mVLineTemplate.imageTextConditional = mVTokenConditional2;
                mVTokenConditional2.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVLineTemplate.agencyImageShown = jVar.mo61690c();
                mVLineTemplate.mo30752m();
            }
            if (T.get(5)) {
                mVLineTemplate.delimiterToken = MVDelimiterToken.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                int i = jVar.mo61696i();
                mVLineTemplate.detailsList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVLineTemplate.detailsList.add(MVLineTemplateToken.findByValue(jVar.mo61696i()));
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVLineTemplate$d */
    public static class C10136d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10135c(0);
        }
    }

    static {
        new C17394d0("MVLineTemplate");
        HashMap hashMap = new HashMap();
        f27791i = hashMap;
        hashMap.put(C25239c.class, new C10134b());
        hashMap.put(C25240d.class, new C10136d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.LINE_TEMPLATE_ID, new FieldMetaData("lineTemplateId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TITLE_CONDITIONAL, new FieldMetaData("titleConditional", (byte) 3, new StructMetaData(MVTokenConditional.class)));
        enumMap.put(_Fields.IMAGE_CONDITIONAL, new FieldMetaData("imageConditional", (byte) 3, new StructMetaData(MVConditional.class)));
        enumMap.put(_Fields.IMAGE_TEXT_CONDITIONAL, new FieldMetaData("imageTextConditional", (byte) 3, new StructMetaData(MVTokenConditional.class)));
        enumMap.put(_Fields.AGENCY_IMAGE_SHOWN, new FieldMetaData("agencyImageShown", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.DELIMITER_TOKEN, new FieldMetaData("delimiterToken", (byte) 3, new EnumMetaData(MVDelimiterToken.class)));
        enumMap.put(_Fields.DETAILS_LIST, new FieldMetaData("detailsList", (byte) 3, new ListMetaData(new EnumMetaData(MVLineTemplateToken.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27792j = unmodifiableMap;
        FieldMetaData.m61947a(MVLineTemplate.class, unmodifiableMap);
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
        ((C25238b) f27791i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27791i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVLineTemplate mVLineTemplate = (MVLineTemplate) obj;
        if (!getClass().equals(mVLineTemplate.getClass())) {
            return getClass().getName().compareTo(mVLineTemplate.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30750k()).compareTo(Boolean.valueOf(mVLineTemplate.mo30750k()));
        if (compareTo != 0 || ((mo30750k() && (compareTo = C25082a.m62839c(this.lineTemplateId, mVLineTemplate.lineTemplateId)) != 0) || (compareTo = Boolean.valueOf(mo30751l()).compareTo(Boolean.valueOf(mVLineTemplate.mo30751l()))) != 0 || ((mo30751l() && (compareTo = this.titleConditional.compareTo(mVLineTemplate.titleConditional)) != 0) || (compareTo = Boolean.valueOf(mo30748i()).compareTo(Boolean.valueOf(mVLineTemplate.mo30748i()))) != 0 || ((mo30748i() && (compareTo = this.imageConditional.compareTo(mVLineTemplate.imageConditional)) != 0) || (compareTo = Boolean.valueOf(mo30749j()).compareTo(Boolean.valueOf(mVLineTemplate.mo30749j()))) != 0 || ((mo30749j() && (compareTo = this.imageTextConditional.compareTo(mVLineTemplate.imageTextConditional)) != 0) || (compareTo = Boolean.valueOf(mo30744f()).compareTo(Boolean.valueOf(mVLineTemplate.mo30744f()))) != 0 || ((mo30744f() && (compareTo = C25082a.m62848l(this.agencyImageShown, mVLineTemplate.agencyImageShown)) != 0) || (compareTo = Boolean.valueOf(mo30745g()).compareTo(Boolean.valueOf(mVLineTemplate.mo30745g()))) != 0 || ((mo30745g() && (compareTo = this.delimiterToken.compareTo(mVLineTemplate.delimiterToken)) != 0) || (compareTo = Boolean.valueOf(mo30746h()).compareTo(Boolean.valueOf(mVLineTemplate.mo30746h()))) != 0))))))) {
            return compareTo;
        }
        if (!mo30746h() || (h = C25082a.m62844h(this.detailsList, mVLineTemplate.detailsList)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVLineTemplate)) {
            return false;
        }
        MVLineTemplate mVLineTemplate = (MVLineTemplate) obj;
        if (this.lineTemplateId != mVLineTemplate.lineTemplateId) {
            return false;
        }
        boolean l = mo30751l();
        boolean l2 = mVLineTemplate.mo30751l();
        if ((l || l2) && (!l || !l2 || !this.titleConditional.mo30768a(mVLineTemplate.titleConditional))) {
            return false;
        }
        boolean i = mo30748i();
        boolean i2 = mVLineTemplate.mo30748i();
        if ((i || i2) && (!i || !i2 || !this.imageConditional.mo30732a(mVLineTemplate.imageConditional))) {
            return false;
        }
        boolean j = mo30749j();
        boolean j2 = mVLineTemplate.mo30749j();
        if (((j || j2) && (!j || !j2 || !this.imageTextConditional.mo30768a(mVLineTemplate.imageTextConditional))) || this.agencyImageShown != mVLineTemplate.agencyImageShown) {
            return false;
        }
        boolean g = mo30745g();
        boolean g2 = mVLineTemplate.mo30745g();
        if ((g || g2) && (!g || !g2 || !this.delimiterToken.equals(mVLineTemplate.delimiterToken))) {
            return false;
        }
        boolean h = mo30746h();
        boolean h2 = mVLineTemplate.mo30746h();
        if ((h || h2) && (!h || !h2 || !this.detailsList.equals(mVLineTemplate.detailsList))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30744f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo30745g() {
        return this.delimiterToken != null;
    }

    /* renamed from: h */
    public final boolean mo30746h() {
        return this.detailsList != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30748i() {
        return this.imageConditional != null;
    }

    /* renamed from: j */
    public final boolean mo30749j() {
        return this.imageTextConditional != null;
    }

    /* renamed from: k */
    public final boolean mo30750k() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: l */
    public final boolean mo30751l() {
        return this.titleConditional != null;
    }

    /* renamed from: m */
    public final void mo30752m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo30753o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVLineTemplate(", "lineTemplateId:");
        C0016g.m42z(n, this.lineTemplateId, ", ", "titleConditional:");
        MVTokenConditional mVTokenConditional = this.titleConditional;
        if (mVTokenConditional == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTokenConditional);
        }
        n.append(", ");
        n.append("imageConditional:");
        MVConditional mVConditional = this.imageConditional;
        if (mVConditional == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVConditional);
        }
        n.append(", ");
        n.append("imageTextConditional:");
        MVTokenConditional mVTokenConditional2 = this.imageTextConditional;
        if (mVTokenConditional2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTokenConditional2);
        }
        n.append(", ");
        n.append("agencyImageShown:");
        C13555b.m33977q(n, this.agencyImageShown, ", ", "delimiterToken:");
        MVDelimiterToken mVDelimiterToken = this.delimiterToken;
        if (mVDelimiterToken == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDelimiterToken);
        }
        n.append(", ");
        n.append("detailsList:");
        List<MVLineTemplateToken> list = this.detailsList;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
