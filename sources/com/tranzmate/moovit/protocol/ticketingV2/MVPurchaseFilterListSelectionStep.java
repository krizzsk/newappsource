package com.tranzmate.moovit.protocol.ticketingV2;

import com.appboy.models.InAppMessageBase;
import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVPurchaseFilterListSelectionStep implements TBase<MVPurchaseFilterListSelectionStep, _Fields>, Serializable, Cloneable, Comparable<MVPurchaseFilterListSelectionStep> {

    /* renamed from: b */
    public static final C25113c f28838b = new C25113c("type", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28839c = new C25113c("filters", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f28840d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28841e = new C25113c("agencyId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28842f = new C25113c("agencyKey", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f28843g = new C25113c("providerId", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f28844h = new C25113c("presentationType", (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f28845i = new C25113c("messageHeader", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f28846j = new C25113c(InAppMessageBase.MESSAGE, (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f28847k = new C25113c("messageImage", (byte) 12, 10);

    /* renamed from: l */
    public static final HashMap f28848l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f28849m;
    private byte __isset_bitfield = 0;
    public int agencyId;
    public String agencyKey;
    public List<MVPurchaseFilter> filters;
    public String message;
    public String messageHeader;
    public MVImageReferenceWithParams messageImage;
    private _Fields[] optionals = {_Fields.TITLE, _Fields.AGENCY_ID, _Fields.AGENCY_KEY, _Fields.PROVIDER_ID, _Fields.MESSAGE_HEADER, _Fields.MESSAGE, _Fields.MESSAGE_IMAGE};
    public MVFilterSelectionPresentationType presentationType;
    public int providerId;
    public String title;
    public String type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        FILTERS(2, "filters"),
        TITLE(3, "title"),
        AGENCY_ID(4, "agencyId"),
        AGENCY_KEY(5, "agencyKey"),
        PROVIDER_ID(6, "providerId"),
        PRESENTATION_TYPE(7, "presentationType"),
        MESSAGE_HEADER(8, "messageHeader"),
        MESSAGE(9, InAppMessageBase.MESSAGE),
        MESSAGE_IMAGE(10, "messageImage");
        
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
                    return FILTERS;
                case 3:
                    return TITLE;
                case 4:
                    return AGENCY_ID;
                case 5:
                    return AGENCY_KEY;
                case 6:
                    return PROVIDER_ID;
                case 7:
                    return PRESENTATION_TYPE;
                case 8:
                    return MESSAGE_HEADER;
                case 9:
                    return MESSAGE;
                case 10:
                    return MESSAGE_IMAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilterListSelectionStep$a */
    public static class C10886a extends C25239c<MVPurchaseFilterListSelectionStep> {
        public C10886a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFilterListSelectionStep mVPurchaseFilterListSelectionStep = (MVPurchaseFilterListSelectionStep) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVPurchaseFilterListSelectionStep.messageImage;
            C25113c cVar = MVPurchaseFilterListSelectionStep.f28838b;
            gVar.mo61687K();
            if (mVPurchaseFilterListSelectionStep.type != null) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28838b);
                gVar.mo61686J(mVPurchaseFilterListSelectionStep.type);
                gVar.mo61712y();
            }
            if (mVPurchaseFilterListSelectionStep.filters != null) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28839c);
                gVar.mo61680D(new C25119e((byte) 12, mVPurchaseFilterListSelectionStep.filters.size()));
                for (MVPurchaseFilter X0 : mVPurchaseFilterListSelectionStep.filters) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPurchaseFilterListSelectionStep.title != null && mVPurchaseFilterListSelectionStep.mo32590o()) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28840d);
                gVar.mo61686J(mVPurchaseFilterListSelectionStep.title);
                gVar.mo61712y();
            }
            if (mVPurchaseFilterListSelectionStep.mo32581f()) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28841e);
                gVar.mo61678B(mVPurchaseFilterListSelectionStep.agencyId);
                gVar.mo61712y();
            }
            if (mVPurchaseFilterListSelectionStep.agencyKey != null && mVPurchaseFilterListSelectionStep.mo32582g()) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28842f);
                gVar.mo61686J(mVPurchaseFilterListSelectionStep.agencyKey);
                gVar.mo61712y();
            }
            if (mVPurchaseFilterListSelectionStep.mo32589m()) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28843g);
                gVar.mo61678B(mVPurchaseFilterListSelectionStep.providerId);
                gVar.mo61712y();
            }
            if (mVPurchaseFilterListSelectionStep.presentationType != null) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28844h);
                gVar.mo61678B(mVPurchaseFilterListSelectionStep.presentationType.getValue());
                gVar.mo61712y();
            }
            if (mVPurchaseFilterListSelectionStep.messageHeader != null && mVPurchaseFilterListSelectionStep.mo32586j()) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28845i);
                gVar.mo61686J(mVPurchaseFilterListSelectionStep.messageHeader);
                gVar.mo61712y();
            }
            if (mVPurchaseFilterListSelectionStep.message != null && mVPurchaseFilterListSelectionStep.mo32585i()) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28846j);
                gVar.mo61686J(mVPurchaseFilterListSelectionStep.message);
                gVar.mo61712y();
            }
            if (mVPurchaseFilterListSelectionStep.messageImage != null && mVPurchaseFilterListSelectionStep.mo32587k()) {
                gVar.mo61711x(MVPurchaseFilterListSelectionStep.f28847k);
                mVPurchaseFilterListSelectionStep.messageImage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFilterListSelectionStep mVPurchaseFilterListSelectionStep = (MVPurchaseFilterListSelectionStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVPurchaseFilterListSelectionStep.messageImage;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFilterListSelectionStep.type = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPurchaseFilterListSelectionStep.filters = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVPurchaseFilter mVPurchaseFilter = new MVPurchaseFilter();
                                mVPurchaseFilter.mo25201C1(gVar);
                                mVPurchaseFilterListSelectionStep.filters.add(mVPurchaseFilter);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFilterListSelectionStep.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFilterListSelectionStep.agencyId = gVar.mo61696i();
                            mVPurchaseFilterListSelectionStep.mo32592q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFilterListSelectionStep.agencyKey = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFilterListSelectionStep.providerId = gVar.mo61696i();
                            mVPurchaseFilterListSelectionStep.mo32593r();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFilterListSelectionStep.presentationType = MVFilterSelectionPresentationType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFilterListSelectionStep.messageHeader = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPurchaseFilterListSelectionStep.message = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVPurchaseFilterListSelectionStep.messageImage = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilterListSelectionStep$b */
    public static class C10887b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10886a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilterListSelectionStep$c */
    public static class C10888c extends C25240d<MVPurchaseFilterListSelectionStep> {
        public C10888c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFilterListSelectionStep mVPurchaseFilterListSelectionStep = (MVPurchaseFilterListSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPurchaseFilterListSelectionStep.mo32591p()) {
                bitSet.set(0);
            }
            if (mVPurchaseFilterListSelectionStep.mo32583h()) {
                bitSet.set(1);
            }
            if (mVPurchaseFilterListSelectionStep.mo32590o()) {
                bitSet.set(2);
            }
            if (mVPurchaseFilterListSelectionStep.mo32581f()) {
                bitSet.set(3);
            }
            if (mVPurchaseFilterListSelectionStep.mo32582g()) {
                bitSet.set(4);
            }
            if (mVPurchaseFilterListSelectionStep.mo32589m()) {
                bitSet.set(5);
            }
            if (mVPurchaseFilterListSelectionStep.mo32588l()) {
                bitSet.set(6);
            }
            if (mVPurchaseFilterListSelectionStep.mo32586j()) {
                bitSet.set(7);
            }
            if (mVPurchaseFilterListSelectionStep.mo32585i()) {
                bitSet.set(8);
            }
            if (mVPurchaseFilterListSelectionStep.mo32587k()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVPurchaseFilterListSelectionStep.mo32591p()) {
                jVar.mo61686J(mVPurchaseFilterListSelectionStep.type);
            }
            if (mVPurchaseFilterListSelectionStep.mo32583h()) {
                jVar.mo61678B(mVPurchaseFilterListSelectionStep.filters.size());
                for (MVPurchaseFilter X0 : mVPurchaseFilterListSelectionStep.filters) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPurchaseFilterListSelectionStep.mo32590o()) {
                jVar.mo61686J(mVPurchaseFilterListSelectionStep.title);
            }
            if (mVPurchaseFilterListSelectionStep.mo32581f()) {
                jVar.mo61678B(mVPurchaseFilterListSelectionStep.agencyId);
            }
            if (mVPurchaseFilterListSelectionStep.mo32582g()) {
                jVar.mo61686J(mVPurchaseFilterListSelectionStep.agencyKey);
            }
            if (mVPurchaseFilterListSelectionStep.mo32589m()) {
                jVar.mo61678B(mVPurchaseFilterListSelectionStep.providerId);
            }
            if (mVPurchaseFilterListSelectionStep.mo32588l()) {
                jVar.mo61678B(mVPurchaseFilterListSelectionStep.presentationType.getValue());
            }
            if (mVPurchaseFilterListSelectionStep.mo32586j()) {
                jVar.mo61686J(mVPurchaseFilterListSelectionStep.messageHeader);
            }
            if (mVPurchaseFilterListSelectionStep.mo32585i()) {
                jVar.mo61686J(mVPurchaseFilterListSelectionStep.message);
            }
            if (mVPurchaseFilterListSelectionStep.mo32587k()) {
                mVPurchaseFilterListSelectionStep.messageImage.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPurchaseFilterListSelectionStep mVPurchaseFilterListSelectionStep = (MVPurchaseFilterListSelectionStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                mVPurchaseFilterListSelectionStep.type = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPurchaseFilterListSelectionStep.filters = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPurchaseFilter mVPurchaseFilter = new MVPurchaseFilter();
                    mVPurchaseFilter.mo25201C1(jVar);
                    mVPurchaseFilterListSelectionStep.filters.add(mVPurchaseFilter);
                }
            }
            if (T.get(2)) {
                mVPurchaseFilterListSelectionStep.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVPurchaseFilterListSelectionStep.agencyId = jVar.mo61696i();
                mVPurchaseFilterListSelectionStep.mo32592q();
            }
            if (T.get(4)) {
                mVPurchaseFilterListSelectionStep.agencyKey = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVPurchaseFilterListSelectionStep.providerId = jVar.mo61696i();
                mVPurchaseFilterListSelectionStep.mo32593r();
            }
            if (T.get(6)) {
                mVPurchaseFilterListSelectionStep.presentationType = MVFilterSelectionPresentationType.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                mVPurchaseFilterListSelectionStep.messageHeader = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVPurchaseFilterListSelectionStep.message = jVar.mo61704q();
            }
            if (T.get(9)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVPurchaseFilterListSelectionStep.messageImage = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilterListSelectionStep$d */
    public static class C10889d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10888c(0);
        }
    }

    static {
        new C17394d0("MVPurchaseFilterListSelectionStep");
        HashMap hashMap = new HashMap();
        f28848l = hashMap;
        hashMap.put(C25239c.class, new C10887b());
        hashMap.put(C25240d.class, new C10889d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FILTERS, new FieldMetaData("filters", (byte) 3, new ListMetaData(new StructMetaData(MVPurchaseFilter.class))));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AGENCY_KEY, new FieldMetaData("agencyKey", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROVIDER_ID, new FieldMetaData("providerId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PRESENTATION_TYPE, new FieldMetaData("presentationType", (byte) 3, new EnumMetaData(MVFilterSelectionPresentationType.class)));
        enumMap.put(_Fields.MESSAGE_HEADER, new FieldMetaData("messageHeader", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MESSAGE, new FieldMetaData(InAppMessageBase.MESSAGE, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MESSAGE_IMAGE, new FieldMetaData("messageImage", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28849m = unmodifiableMap;
        FieldMetaData.m61947a(MVPurchaseFilterListSelectionStep.class, unmodifiableMap);
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
        ((C25238b) f28848l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28848l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPurchaseFilterListSelectionStep mVPurchaseFilterListSelectionStep = (MVPurchaseFilterListSelectionStep) obj;
        if (!getClass().equals(mVPurchaseFilterListSelectionStep.getClass())) {
            return getClass().getName().compareTo(mVPurchaseFilterListSelectionStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32591p()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32591p()));
        if (compareTo2 != 0 || ((mo32591p() && (compareTo2 = this.type.compareTo(mVPurchaseFilterListSelectionStep.type)) != 0) || (compareTo2 = Boolean.valueOf(mo32583h()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32583h()))) != 0 || ((mo32583h() && (compareTo2 = C25082a.m62844h(this.filters, mVPurchaseFilterListSelectionStep.filters)) != 0) || (compareTo2 = Boolean.valueOf(mo32590o()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32590o()))) != 0 || ((mo32590o() && (compareTo2 = this.title.compareTo(mVPurchaseFilterListSelectionStep.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32581f()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32581f()))) != 0 || ((mo32581f() && (compareTo2 = C25082a.m62839c(this.agencyId, mVPurchaseFilterListSelectionStep.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo32582g()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32582g()))) != 0 || ((mo32582g() && (compareTo2 = this.agencyKey.compareTo(mVPurchaseFilterListSelectionStep.agencyKey)) != 0) || (compareTo2 = Boolean.valueOf(mo32589m()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32589m()))) != 0 || ((mo32589m() && (compareTo2 = C25082a.m62839c(this.providerId, mVPurchaseFilterListSelectionStep.providerId)) != 0) || (compareTo2 = Boolean.valueOf(mo32588l()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32588l()))) != 0 || ((mo32588l() && (compareTo2 = this.presentationType.compareTo(mVPurchaseFilterListSelectionStep.presentationType)) != 0) || (compareTo2 = Boolean.valueOf(mo32586j()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32586j()))) != 0 || ((mo32586j() && (compareTo2 = this.messageHeader.compareTo(mVPurchaseFilterListSelectionStep.messageHeader)) != 0) || (compareTo2 = Boolean.valueOf(mo32585i()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32585i()))) != 0 || ((mo32585i() && (compareTo2 = this.message.compareTo(mVPurchaseFilterListSelectionStep.message)) != 0) || (compareTo2 = Boolean.valueOf(mo32587k()).compareTo(Boolean.valueOf(mVPurchaseFilterListSelectionStep.mo32587k()))) != 0)))))))))) {
            return compareTo2;
        }
        if (!mo32587k() || (compareTo = this.messageImage.compareTo(mVPurchaseFilterListSelectionStep.messageImage)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPurchaseFilterListSelectionStep)) {
            return false;
        }
        MVPurchaseFilterListSelectionStep mVPurchaseFilterListSelectionStep = (MVPurchaseFilterListSelectionStep) obj;
        boolean p = mo32591p();
        boolean p2 = mVPurchaseFilterListSelectionStep.mo32591p();
        if ((p || p2) && (!p || !p2 || !this.type.equals(mVPurchaseFilterListSelectionStep.type))) {
            return false;
        }
        boolean h = mo32583h();
        boolean h2 = mVPurchaseFilterListSelectionStep.mo32583h();
        if ((h || h2) && (!h || !h2 || !this.filters.equals(mVPurchaseFilterListSelectionStep.filters))) {
            return false;
        }
        boolean o = mo32590o();
        boolean o2 = mVPurchaseFilterListSelectionStep.mo32590o();
        if ((o || o2) && (!o || !o2 || !this.title.equals(mVPurchaseFilterListSelectionStep.title))) {
            return false;
        }
        boolean f = mo32581f();
        boolean f2 = mVPurchaseFilterListSelectionStep.mo32581f();
        if ((f || f2) && (!f || !f2 || this.agencyId != mVPurchaseFilterListSelectionStep.agencyId)) {
            return false;
        }
        boolean g = mo32582g();
        boolean g2 = mVPurchaseFilterListSelectionStep.mo32582g();
        if ((g || g2) && (!g || !g2 || !this.agencyKey.equals(mVPurchaseFilterListSelectionStep.agencyKey))) {
            return false;
        }
        boolean m = mo32589m();
        boolean m2 = mVPurchaseFilterListSelectionStep.mo32589m();
        if ((m || m2) && (!m || !m2 || this.providerId != mVPurchaseFilterListSelectionStep.providerId)) {
            return false;
        }
        boolean l = mo32588l();
        boolean l2 = mVPurchaseFilterListSelectionStep.mo32588l();
        if ((l || l2) && (!l || !l2 || !this.presentationType.equals(mVPurchaseFilterListSelectionStep.presentationType))) {
            return false;
        }
        boolean j = mo32586j();
        boolean j2 = mVPurchaseFilterListSelectionStep.mo32586j();
        if ((j || j2) && (!j || !j2 || !this.messageHeader.equals(mVPurchaseFilterListSelectionStep.messageHeader))) {
            return false;
        }
        boolean i = mo32585i();
        boolean i2 = mVPurchaseFilterListSelectionStep.mo32585i();
        if ((i || i2) && (!i || !i2 || !this.message.equals(mVPurchaseFilterListSelectionStep.message))) {
            return false;
        }
        boolean k = mo32587k();
        boolean k2 = mVPurchaseFilterListSelectionStep.mo32587k();
        if ((k || k2) && (!k || !k2 || !this.messageImage.mo26245a(mVPurchaseFilterListSelectionStep.messageImage))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo32581f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo32582g() {
        return this.agencyKey != null;
    }

    /* renamed from: h */
    public final boolean mo32583h() {
        return this.filters != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32585i() {
        return this.message != null;
    }

    /* renamed from: j */
    public final boolean mo32586j() {
        return this.messageHeader != null;
    }

    /* renamed from: k */
    public final boolean mo32587k() {
        return this.messageImage != null;
    }

    /* renamed from: l */
    public final boolean mo32588l() {
        return this.presentationType != null;
    }

    /* renamed from: m */
    public final boolean mo32589m() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: o */
    public final boolean mo32590o() {
        return this.title != null;
    }

    /* renamed from: p */
    public final boolean mo32591p() {
        return this.type != null;
    }

    /* renamed from: q */
    public final void mo32592q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: r */
    public final void mo32593r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPurchaseFilterListSelectionStep(", "type:");
        String str = this.type;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("filters:");
        List<MVPurchaseFilter> list = this.filters;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo32590o()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo32581f()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        if (mo32582g()) {
            n.append(", ");
            n.append("agencyKey:");
            String str3 = this.agencyKey;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo32589m()) {
            n.append(", ");
            n.append("providerId:");
            n.append(this.providerId);
        }
        n.append(", ");
        n.append("presentationType:");
        MVFilterSelectionPresentationType mVFilterSelectionPresentationType = this.presentationType;
        if (mVFilterSelectionPresentationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVFilterSelectionPresentationType);
        }
        if (mo32586j()) {
            n.append(", ");
            n.append("messageHeader:");
            String str4 = this.messageHeader;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo32585i()) {
            n.append(", ");
            n.append("message:");
            String str5 = this.message;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        if (mo32587k()) {
            n.append(", ");
            n.append("messageImage:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.messageImage;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        n.append(")");
        return n.toString();
    }
}
