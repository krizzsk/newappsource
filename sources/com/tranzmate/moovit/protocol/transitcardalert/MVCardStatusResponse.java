package com.tranzmate.moovit.protocol.transitcardalert;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVCardStatusResponse implements TBase<MVCardStatusResponse, _Fields>, Serializable, Cloneable, Comparable<MVCardStatusResponse> {

    /* renamed from: b */
    public static final C25113c f29804b = new C25113c("cardTypeDescription", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f29805c = new C25113c("balanceStat", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29806d = new C25113c("cardPublisher", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29807e = new C25113c("lastCardCheck", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f29808f = new C25113c("cardImage", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f29809g = new C25113c("urlToTopup", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f29810h = new C25113c("presentationType", (byte) 8, 7);

    /* renamed from: i */
    public static final HashMap f29811i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f29812j;
    private byte __isset_bitfield = 0;
    public MVBalanceStat balanceStat;
    public MVImageReferenceWithParams cardImage;
    public String cardPublisher;
    public String cardTypeDescription;
    public long lastCardCheck;
    private _Fields[] optionals = {_Fields.BALANCE_STAT};
    public MVCardPresentationType presentationType;
    public String urlToTopup;

    public enum _Fields implements C25085c {
        CARD_TYPE_DESCRIPTION(1, "cardTypeDescription"),
        BALANCE_STAT(2, "balanceStat"),
        CARD_PUBLISHER(3, "cardPublisher"),
        LAST_CARD_CHECK(4, "lastCardCheck"),
        CARD_IMAGE(5, "cardImage"),
        URL_TO_TOPUP(6, "urlToTopup"),
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
                    return CARD_TYPE_DESCRIPTION;
                case 2:
                    return BALANCE_STAT;
                case 3:
                    return CARD_PUBLISHER;
                case 4:
                    return LAST_CARD_CHECK;
                case 5:
                    return CARD_IMAGE;
                case 6:
                    return URL_TO_TOPUP;
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

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVCardStatusResponse$a */
    public static class C11481a extends C25239c<MVCardStatusResponse> {
        public C11481a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCardStatusResponse mVCardStatusResponse = (MVCardStatusResponse) tBase;
            mVCardStatusResponse.getClass();
            C25113c cVar = MVCardStatusResponse.f29804b;
            gVar.mo61687K();
            if (mVCardStatusResponse.cardTypeDescription != null) {
                gVar.mo61711x(MVCardStatusResponse.f29804b);
                gVar.mo61686J(mVCardStatusResponse.cardTypeDescription);
                gVar.mo61712y();
            }
            if (mVCardStatusResponse.balanceStat != null && mVCardStatusResponse.mo34115f()) {
                gVar.mo61711x(MVCardStatusResponse.f29805c);
                mVCardStatusResponse.balanceStat.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCardStatusResponse.cardPublisher != null) {
                gVar.mo61711x(MVCardStatusResponse.f29806d);
                gVar.mo61686J(mVCardStatusResponse.cardPublisher);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCardStatusResponse.f29807e);
            gVar.mo61679C(mVCardStatusResponse.lastCardCheck);
            gVar.mo61712y();
            if (mVCardStatusResponse.cardImage != null) {
                gVar.mo61711x(MVCardStatusResponse.f29808f);
                mVCardStatusResponse.cardImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCardStatusResponse.urlToTopup != null) {
                gVar.mo61711x(MVCardStatusResponse.f29809g);
                gVar.mo61686J(mVCardStatusResponse.urlToTopup);
                gVar.mo61712y();
            }
            if (mVCardStatusResponse.presentationType != null) {
                gVar.mo61711x(MVCardStatusResponse.f29810h);
                gVar.mo61678B(mVCardStatusResponse.presentationType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCardStatusResponse mVCardStatusResponse = (MVCardStatusResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCardStatusResponse.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCardStatusResponse.cardTypeDescription = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVBalanceStat mVBalanceStat = new MVBalanceStat();
                            mVCardStatusResponse.balanceStat = mVBalanceStat;
                            mVBalanceStat.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCardStatusResponse.cardPublisher = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCardStatusResponse.lastCardCheck = gVar.mo61697j();
                            mVCardStatusResponse.mo34123m();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVCardStatusResponse.cardImage = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCardStatusResponse.urlToTopup = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCardStatusResponse.presentationType = MVCardPresentationType.findByValue(gVar.mo61696i());
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

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVCardStatusResponse$b */
    public static class C11482b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11481a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVCardStatusResponse$c */
    public static class C11483c extends C25240d<MVCardStatusResponse> {
        public C11483c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCardStatusResponse mVCardStatusResponse = (MVCardStatusResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCardStatusResponse.mo34119i()) {
                bitSet.set(0);
            }
            if (mVCardStatusResponse.mo34115f()) {
                bitSet.set(1);
            }
            if (mVCardStatusResponse.mo34117h()) {
                bitSet.set(2);
            }
            if (mVCardStatusResponse.mo34120j()) {
                bitSet.set(3);
            }
            if (mVCardStatusResponse.mo34116g()) {
                bitSet.set(4);
            }
            if (mVCardStatusResponse.mo34122l()) {
                bitSet.set(5);
            }
            if (mVCardStatusResponse.mo34121k()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVCardStatusResponse.mo34119i()) {
                jVar.mo61686J(mVCardStatusResponse.cardTypeDescription);
            }
            if (mVCardStatusResponse.mo34115f()) {
                mVCardStatusResponse.balanceStat.mo25202X0(jVar);
            }
            if (mVCardStatusResponse.mo34117h()) {
                jVar.mo61686J(mVCardStatusResponse.cardPublisher);
            }
            if (mVCardStatusResponse.mo34120j()) {
                jVar.mo61679C(mVCardStatusResponse.lastCardCheck);
            }
            if (mVCardStatusResponse.mo34116g()) {
                mVCardStatusResponse.cardImage.mo25202X0(jVar);
            }
            if (mVCardStatusResponse.mo34122l()) {
                jVar.mo61686J(mVCardStatusResponse.urlToTopup);
            }
            if (mVCardStatusResponse.mo34121k()) {
                jVar.mo61678B(mVCardStatusResponse.presentationType.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCardStatusResponse mVCardStatusResponse = (MVCardStatusResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVCardStatusResponse.cardTypeDescription = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVBalanceStat mVBalanceStat = new MVBalanceStat();
                mVCardStatusResponse.balanceStat = mVBalanceStat;
                mVBalanceStat.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVCardStatusResponse.cardPublisher = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCardStatusResponse.lastCardCheck = jVar.mo61697j();
                mVCardStatusResponse.mo34123m();
            }
            if (T.get(4)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVCardStatusResponse.cardImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVCardStatusResponse.urlToTopup = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVCardStatusResponse.presentationType = MVCardPresentationType.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.transitcardalert.MVCardStatusResponse$d */
    public static class C11484d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11483c(0);
        }
    }

    static {
        new C17394d0("MVCardStatusResponse");
        HashMap hashMap = new HashMap();
        f29811i = hashMap;
        hashMap.put(C25239c.class, new C11482b());
        hashMap.put(C25240d.class, new C11484d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CARD_TYPE_DESCRIPTION, new FieldMetaData("cardTypeDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BALANCE_STAT, new FieldMetaData("balanceStat", (byte) 2, new StructMetaData(MVBalanceStat.class)));
        enumMap.put(_Fields.CARD_PUBLISHER, new FieldMetaData("cardPublisher", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LAST_CARD_CHECK, new FieldMetaData("lastCardCheck", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        enumMap.put(_Fields.CARD_IMAGE, new FieldMetaData("cardImage", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.URL_TO_TOPUP, new FieldMetaData("urlToTopup", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRESENTATION_TYPE, new FieldMetaData("presentationType", (byte) 3, new EnumMetaData(MVCardPresentationType.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29812j = unmodifiableMap;
        FieldMetaData.m61947a(MVCardStatusResponse.class, unmodifiableMap);
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
        ((C25238b) f29811i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29811i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCardStatusResponse mVCardStatusResponse = (MVCardStatusResponse) obj;
        if (!getClass().equals(mVCardStatusResponse.getClass())) {
            return getClass().getName().compareTo(mVCardStatusResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34119i()).compareTo(Boolean.valueOf(mVCardStatusResponse.mo34119i()));
        if (compareTo2 != 0 || ((mo34119i() && (compareTo2 = this.cardTypeDescription.compareTo(mVCardStatusResponse.cardTypeDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo34115f()).compareTo(Boolean.valueOf(mVCardStatusResponse.mo34115f()))) != 0 || ((mo34115f() && (compareTo2 = this.balanceStat.compareTo(mVCardStatusResponse.balanceStat)) != 0) || (compareTo2 = Boolean.valueOf(mo34117h()).compareTo(Boolean.valueOf(mVCardStatusResponse.mo34117h()))) != 0 || ((mo34117h() && (compareTo2 = this.cardPublisher.compareTo(mVCardStatusResponse.cardPublisher)) != 0) || (compareTo2 = Boolean.valueOf(mo34120j()).compareTo(Boolean.valueOf(mVCardStatusResponse.mo34120j()))) != 0 || ((mo34120j() && (compareTo2 = C25082a.m62840d(this.lastCardCheck, mVCardStatusResponse.lastCardCheck)) != 0) || (compareTo2 = Boolean.valueOf(mo34116g()).compareTo(Boolean.valueOf(mVCardStatusResponse.mo34116g()))) != 0 || ((mo34116g() && (compareTo2 = this.cardImage.compareTo(mVCardStatusResponse.cardImage)) != 0) || (compareTo2 = Boolean.valueOf(mo34122l()).compareTo(Boolean.valueOf(mVCardStatusResponse.mo34122l()))) != 0 || ((mo34122l() && (compareTo2 = this.urlToTopup.compareTo(mVCardStatusResponse.urlToTopup)) != 0) || (compareTo2 = Boolean.valueOf(mo34121k()).compareTo(Boolean.valueOf(mVCardStatusResponse.mo34121k()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo34121k() || (compareTo = this.presentationType.compareTo(mVCardStatusResponse.presentationType)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCardStatusResponse)) {
            return false;
        }
        MVCardStatusResponse mVCardStatusResponse = (MVCardStatusResponse) obj;
        boolean i = mo34119i();
        boolean i2 = mVCardStatusResponse.mo34119i();
        if ((i || i2) && (!i || !i2 || !this.cardTypeDescription.equals(mVCardStatusResponse.cardTypeDescription))) {
            return false;
        }
        boolean f = mo34115f();
        boolean f2 = mVCardStatusResponse.mo34115f();
        if ((f || f2) && (!f || !f2 || !this.balanceStat.mo34102a(mVCardStatusResponse.balanceStat))) {
            return false;
        }
        boolean h = mo34117h();
        boolean h2 = mVCardStatusResponse.mo34117h();
        if (((h || h2) && (!h || !h2 || !this.cardPublisher.equals(mVCardStatusResponse.cardPublisher))) || this.lastCardCheck != mVCardStatusResponse.lastCardCheck) {
            return false;
        }
        boolean g = mo34116g();
        boolean g2 = mVCardStatusResponse.mo34116g();
        if ((g || g2) && (!g || !g2 || !this.cardImage.mo26245a(mVCardStatusResponse.cardImage))) {
            return false;
        }
        boolean l = mo34122l();
        boolean l2 = mVCardStatusResponse.mo34122l();
        if ((l || l2) && (!l || !l2 || !this.urlToTopup.equals(mVCardStatusResponse.urlToTopup))) {
            return false;
        }
        boolean k = mo34121k();
        boolean k2 = mVCardStatusResponse.mo34121k();
        if ((k || k2) && (!k || !k2 || !this.presentationType.equals(mVCardStatusResponse.presentationType))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34115f() {
        return this.balanceStat != null;
    }

    /* renamed from: g */
    public final boolean mo34116g() {
        return this.cardImage != null;
    }

    /* renamed from: h */
    public final boolean mo34117h() {
        return this.cardPublisher != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo34119i() {
        return this.cardTypeDescription != null;
    }

    /* renamed from: j */
    public final boolean mo34120j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo34121k() {
        return this.presentationType != null;
    }

    /* renamed from: l */
    public final boolean mo34122l() {
        return this.urlToTopup != null;
    }

    /* renamed from: m */
    public final void mo34123m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCardStatusResponse(", "cardTypeDescription:");
        String str = this.cardTypeDescription;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo34115f()) {
            n.append(", ");
            n.append("balanceStat:");
            MVBalanceStat mVBalanceStat = this.balanceStat;
            if (mVBalanceStat == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVBalanceStat);
            }
        }
        n.append(", ");
        n.append("cardPublisher:");
        String str2 = this.cardPublisher;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("lastCardCheck:");
        C25541a.m63889t(n, this.lastCardCheck, ", ", "cardImage:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.cardImage;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("urlToTopup:");
        String str3 = this.urlToTopup;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("presentationType:");
        MVCardPresentationType mVCardPresentationType = this.presentationType;
        if (mVCardPresentationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCardPresentationType);
        }
        n.append(")");
        return n.toString();
    }
}
