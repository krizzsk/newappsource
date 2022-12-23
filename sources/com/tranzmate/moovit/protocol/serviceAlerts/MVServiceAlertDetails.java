package com.tranzmate.moovit.protocol.serviceAlerts;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVText;
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

public class MVServiceAlertDetails implements TBase<MVServiceAlertDetails, _Fields>, Serializable, Cloneable, Comparable<MVServiceAlertDetails> {

    /* renamed from: b */
    public static final C25113c f28262b = new C25113c("alertId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28263c = new C25113c("agencyId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28264d = new C25113c("serviceStatus", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f28265e = new C25113c("affectedLines", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f28266f = new C25113c("publicationDate", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f28267g = new C25113c("activeFrom", (byte) 10, 6);

    /* renamed from: h */
    public static final C25113c f28268h = new C25113c("activeTo", (byte) 10, 7);

    /* renamed from: i */
    public static final C25113c f28269i = new C25113c("title", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f28270j = new C25113c("desc", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f28271k = new C25113c("infoUrl", (byte) 11, 10);

    /* renamed from: l */
    public static final C25113c f28272l = new C25113c("alertPreviewText", (byte) 11, 11);

    /* renamed from: m */
    public static final C25113c f28273m = new C25113c("shareUrl", (byte) 11, 12);

    /* renamed from: n */
    public static final HashMap f28274n;

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f28275o;
    private byte __isset_bitfield = 0;
    public long activeFrom;
    public long activeTo;
    public List<MVAffectedLine> affectedLines;
    public int agencyId;
    public String alertId;
    public String alertPreviewText;
    public MVText desc;
    public String infoUrl;
    private _Fields[] optionals = {_Fields.AGENCY_ID, _Fields.AFFECTED_LINES, _Fields.PUBLICATION_DATE, _Fields.ACTIVE_FROM, _Fields.ACTIVE_TO, _Fields.DESC, _Fields.INFO_URL, _Fields.SHARE_URL};
    public long publicationDate;
    public MVServiceStatus serviceStatus;
    public String shareUrl;
    public String title;

    public enum _Fields implements C25085c {
        ALERT_ID(1, "alertId"),
        AGENCY_ID(2, "agencyId"),
        SERVICE_STATUS(3, "serviceStatus"),
        AFFECTED_LINES(4, "affectedLines"),
        PUBLICATION_DATE(5, "publicationDate"),
        ACTIVE_FROM(6, "activeFrom"),
        ACTIVE_TO(7, "activeTo"),
        TITLE(8, "title"),
        DESC(9, "desc"),
        INFO_URL(10, "infoUrl"),
        ALERT_PREVIEW_TEXT(11, "alertPreviewText"),
        SHARE_URL(12, "shareUrl");
        
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
                    return ALERT_ID;
                case 2:
                    return AGENCY_ID;
                case 3:
                    return SERVICE_STATUS;
                case 4:
                    return AFFECTED_LINES;
                case 5:
                    return PUBLICATION_DATE;
                case 6:
                    return ACTIVE_FROM;
                case 7:
                    return ACTIVE_TO;
                case 8:
                    return TITLE;
                case 9:
                    return DESC;
                case 10:
                    return INFO_URL;
                case 11:
                    return ALERT_PREVIEW_TEXT;
                case 12:
                    return SHARE_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails$a */
    public static class C10491a extends C25239c<MVServiceAlertDetails> {
        public C10491a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertDetails mVServiceAlertDetails = (MVServiceAlertDetails) tBase;
            mVServiceAlertDetails.mo31644w();
            C25113c cVar = MVServiceAlertDetails.f28262b;
            gVar.mo61687K();
            if (mVServiceAlertDetails.alertId != null) {
                gVar.mo61711x(MVServiceAlertDetails.f28262b);
                gVar.mo61686J(mVServiceAlertDetails.alertId);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.mo31630i()) {
                gVar.mo61711x(MVServiceAlertDetails.f28263c);
                gVar.mo61678B(mVServiceAlertDetails.agencyId);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.serviceStatus != null) {
                gVar.mo61711x(MVServiceAlertDetails.f28264d);
                mVServiceAlertDetails.serviceStatus.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.affectedLines != null && mVServiceAlertDetails.mo31628h()) {
                gVar.mo61711x(MVServiceAlertDetails.f28265e);
                gVar.mo61680D(new C25119e((byte) 12, mVServiceAlertDetails.affectedLines.size()));
                for (MVAffectedLine X0 : mVServiceAlertDetails.affectedLines) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.mo31635o()) {
                gVar.mo61711x(MVServiceAlertDetails.f28266f);
                gVar.mo61679C(mVServiceAlertDetails.publicationDate);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.mo31626f()) {
                gVar.mo61711x(MVServiceAlertDetails.f28267g);
                gVar.mo61679C(mVServiceAlertDetails.activeFrom);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.mo31627g()) {
                gVar.mo61711x(MVServiceAlertDetails.f28268h);
                gVar.mo61679C(mVServiceAlertDetails.activeTo);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.title != null) {
                gVar.mo61711x(MVServiceAlertDetails.f28269i);
                gVar.mo61686J(mVServiceAlertDetails.title);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.desc != null && mVServiceAlertDetails.mo31633l()) {
                gVar.mo61711x(MVServiceAlertDetails.f28270j);
                mVServiceAlertDetails.desc.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.infoUrl != null && mVServiceAlertDetails.mo31634m()) {
                gVar.mo61711x(MVServiceAlertDetails.f28271k);
                gVar.mo61686J(mVServiceAlertDetails.infoUrl);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.alertPreviewText != null) {
                gVar.mo61711x(MVServiceAlertDetails.f28272l);
                gVar.mo61686J(mVServiceAlertDetails.alertPreviewText);
                gVar.mo61712y();
            }
            if (mVServiceAlertDetails.shareUrl != null && mVServiceAlertDetails.mo31637q()) {
                gVar.mo61711x(MVServiceAlertDetails.f28273m);
                gVar.mo61686J(mVServiceAlertDetails.shareUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertDetails mVServiceAlertDetails = (MVServiceAlertDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVServiceAlertDetails.mo31644w();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDetails.alertId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDetails.agencyId = gVar.mo61696i();
                            mVServiceAlertDetails.mo31642u();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVServiceStatus mVServiceStatus = new MVServiceStatus();
                            mVServiceAlertDetails.serviceStatus = mVServiceStatus;
                            mVServiceStatus.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVServiceAlertDetails.affectedLines = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVAffectedLine mVAffectedLine = new MVAffectedLine();
                                mVAffectedLine.mo25201C1(gVar);
                                mVServiceAlertDetails.affectedLines.add(mVAffectedLine);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDetails.publicationDate = gVar.mo61697j();
                            mVServiceAlertDetails.mo31643v();
                            break;
                        }
                    case 6:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDetails.activeFrom = gVar.mo61697j();
                            mVServiceAlertDetails.mo31639s();
                            break;
                        }
                    case 7:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDetails.activeTo = gVar.mo61697j();
                            mVServiceAlertDetails.mo31640t();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDetails.title = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVText mVText = new MVText();
                            mVServiceAlertDetails.desc = mVText;
                            mVText.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDetails.infoUrl = gVar.mo61704q();
                            break;
                        }
                    case 11:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDetails.alertPreviewText = gVar.mo61704q();
                            break;
                        }
                    case 12:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVServiceAlertDetails.shareUrl = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails$b */
    public static class C10492b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10491a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails$c */
    public static class C10493c extends C25240d<MVServiceAlertDetails> {
        public C10493c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertDetails mVServiceAlertDetails = (MVServiceAlertDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVServiceAlertDetails.mo31631j()) {
                bitSet.set(0);
            }
            if (mVServiceAlertDetails.mo31630i()) {
                bitSet.set(1);
            }
            if (mVServiceAlertDetails.mo31636p()) {
                bitSet.set(2);
            }
            if (mVServiceAlertDetails.mo31628h()) {
                bitSet.set(3);
            }
            if (mVServiceAlertDetails.mo31635o()) {
                bitSet.set(4);
            }
            if (mVServiceAlertDetails.mo31626f()) {
                bitSet.set(5);
            }
            if (mVServiceAlertDetails.mo31627g()) {
                bitSet.set(6);
            }
            if (mVServiceAlertDetails.mo31638r()) {
                bitSet.set(7);
            }
            if (mVServiceAlertDetails.mo31633l()) {
                bitSet.set(8);
            }
            if (mVServiceAlertDetails.mo31634m()) {
                bitSet.set(9);
            }
            if (mVServiceAlertDetails.mo31632k()) {
                bitSet.set(10);
            }
            if (mVServiceAlertDetails.mo31637q()) {
                bitSet.set(11);
            }
            jVar.mo61738U(bitSet, 12);
            if (mVServiceAlertDetails.mo31631j()) {
                jVar.mo61686J(mVServiceAlertDetails.alertId);
            }
            if (mVServiceAlertDetails.mo31630i()) {
                jVar.mo61678B(mVServiceAlertDetails.agencyId);
            }
            if (mVServiceAlertDetails.mo31636p()) {
                mVServiceAlertDetails.serviceStatus.mo25202X0(jVar);
            }
            if (mVServiceAlertDetails.mo31628h()) {
                jVar.mo61678B(mVServiceAlertDetails.affectedLines.size());
                for (MVAffectedLine X0 : mVServiceAlertDetails.affectedLines) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVServiceAlertDetails.mo31635o()) {
                jVar.mo61679C(mVServiceAlertDetails.publicationDate);
            }
            if (mVServiceAlertDetails.mo31626f()) {
                jVar.mo61679C(mVServiceAlertDetails.activeFrom);
            }
            if (mVServiceAlertDetails.mo31627g()) {
                jVar.mo61679C(mVServiceAlertDetails.activeTo);
            }
            if (mVServiceAlertDetails.mo31638r()) {
                jVar.mo61686J(mVServiceAlertDetails.title);
            }
            if (mVServiceAlertDetails.mo31633l()) {
                mVServiceAlertDetails.desc.mo25202X0(jVar);
            }
            if (mVServiceAlertDetails.mo31634m()) {
                jVar.mo61686J(mVServiceAlertDetails.infoUrl);
            }
            if (mVServiceAlertDetails.mo31632k()) {
                jVar.mo61686J(mVServiceAlertDetails.alertPreviewText);
            }
            if (mVServiceAlertDetails.mo31637q()) {
                jVar.mo61686J(mVServiceAlertDetails.shareUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceAlertDetails mVServiceAlertDetails = (MVServiceAlertDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(12);
            if (T.get(0)) {
                mVServiceAlertDetails.alertId = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVServiceAlertDetails.agencyId = jVar.mo61696i();
                mVServiceAlertDetails.mo31642u();
            }
            if (T.get(2)) {
                MVServiceStatus mVServiceStatus = new MVServiceStatus();
                mVServiceAlertDetails.serviceStatus = mVServiceStatus;
                mVServiceStatus.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVServiceAlertDetails.affectedLines = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAffectedLine mVAffectedLine = new MVAffectedLine();
                    mVAffectedLine.mo25201C1(jVar);
                    mVServiceAlertDetails.affectedLines.add(mVAffectedLine);
                }
            }
            if (T.get(4)) {
                mVServiceAlertDetails.publicationDate = jVar.mo61697j();
                mVServiceAlertDetails.mo31643v();
            }
            if (T.get(5)) {
                mVServiceAlertDetails.activeFrom = jVar.mo61697j();
                mVServiceAlertDetails.mo31639s();
            }
            if (T.get(6)) {
                mVServiceAlertDetails.activeTo = jVar.mo61697j();
                mVServiceAlertDetails.mo31640t();
            }
            if (T.get(7)) {
                mVServiceAlertDetails.title = jVar.mo61704q();
            }
            if (T.get(8)) {
                MVText mVText = new MVText();
                mVServiceAlertDetails.desc = mVText;
                mVText.mo25201C1(jVar);
            }
            if (T.get(9)) {
                mVServiceAlertDetails.infoUrl = jVar.mo61704q();
            }
            if (T.get(10)) {
                mVServiceAlertDetails.alertPreviewText = jVar.mo61704q();
            }
            if (T.get(11)) {
                mVServiceAlertDetails.shareUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails$d */
    public static class C10494d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10493c(0);
        }
    }

    static {
        new C17394d0("MVServiceAlertDetails");
        HashMap hashMap = new HashMap();
        f28274n = hashMap;
        hashMap.put(C25239c.class, new C10492b());
        hashMap.put(C25240d.class, new C10494d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ALERT_ID, new FieldMetaData("alertId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AGENCY_ID, new FieldMetaData("agencyId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.SERVICE_STATUS, new FieldMetaData("serviceStatus", (byte) 3, new StructMetaData(MVServiceStatus.class)));
        enumMap.put(_Fields.AFFECTED_LINES, new FieldMetaData("affectedLines", (byte) 2, new ListMetaData(new StructMetaData(MVAffectedLine.class))));
        enumMap.put(_Fields.PUBLICATION_DATE, new FieldMetaData("publicationDate", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ACTIVE_FROM, new FieldMetaData("activeFrom", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.ACTIVE_TO, new FieldMetaData("activeTo", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DESC, new FieldMetaData("desc", (byte) 2, new StructMetaData(MVText.class)));
        enumMap.put(_Fields.INFO_URL, new FieldMetaData("infoUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ALERT_PREVIEW_TEXT, new FieldMetaData("alertPreviewText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SHARE_URL, new FieldMetaData("shareUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28275o = unmodifiableMap;
        FieldMetaData.m61947a(MVServiceAlertDetails.class, unmodifiableMap);
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
        ((C25238b) f28274n.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28274n.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31623a(MVServiceAlertDetails mVServiceAlertDetails) {
        if (mVServiceAlertDetails == null) {
            return false;
        }
        boolean j = mo31631j();
        boolean j2 = mVServiceAlertDetails.mo31631j();
        if ((j || j2) && (!j || !j2 || !this.alertId.equals(mVServiceAlertDetails.alertId))) {
            return false;
        }
        boolean i = mo31630i();
        boolean i2 = mVServiceAlertDetails.mo31630i();
        if ((i || i2) && (!i || !i2 || this.agencyId != mVServiceAlertDetails.agencyId)) {
            return false;
        }
        boolean p = mo31636p();
        boolean p2 = mVServiceAlertDetails.mo31636p();
        if ((p || p2) && (!p || !p2 || !this.serviceStatus.mo31678a(mVServiceAlertDetails.serviceStatus))) {
            return false;
        }
        boolean h = mo31628h();
        boolean h2 = mVServiceAlertDetails.mo31628h();
        if ((h || h2) && (!h || !h2 || !this.affectedLines.equals(mVServiceAlertDetails.affectedLines))) {
            return false;
        }
        boolean o = mo31635o();
        boolean o2 = mVServiceAlertDetails.mo31635o();
        if ((o || o2) && (!o || !o2 || this.publicationDate != mVServiceAlertDetails.publicationDate)) {
            return false;
        }
        boolean f = mo31626f();
        boolean f2 = mVServiceAlertDetails.mo31626f();
        if ((f || f2) && (!f || !f2 || this.activeFrom != mVServiceAlertDetails.activeFrom)) {
            return false;
        }
        boolean g = mo31627g();
        boolean g2 = mVServiceAlertDetails.mo31627g();
        if ((g || g2) && (!g || !g2 || this.activeTo != mVServiceAlertDetails.activeTo)) {
            return false;
        }
        boolean r = mo31638r();
        boolean r2 = mVServiceAlertDetails.mo31638r();
        if ((r || r2) && (!r || !r2 || !this.title.equals(mVServiceAlertDetails.title))) {
            return false;
        }
        boolean l = mo31633l();
        boolean l2 = mVServiceAlertDetails.mo31633l();
        if ((l || l2) && (!l || !l2 || !this.desc.mo26402a(mVServiceAlertDetails.desc))) {
            return false;
        }
        boolean m = mo31634m();
        boolean m2 = mVServiceAlertDetails.mo31634m();
        if ((m || m2) && (!m || !m2 || !this.infoUrl.equals(mVServiceAlertDetails.infoUrl))) {
            return false;
        }
        boolean k = mo31632k();
        boolean k2 = mVServiceAlertDetails.mo31632k();
        if ((k || k2) && (!k || !k2 || !this.alertPreviewText.equals(mVServiceAlertDetails.alertPreviewText))) {
            return false;
        }
        boolean q = mo31637q();
        boolean q2 = mVServiceAlertDetails.mo31637q();
        if (!q && !q2) {
            return true;
        }
        if (!q || !q2 || !this.shareUrl.equals(mVServiceAlertDetails.shareUrl)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVServiceAlertDetails mVServiceAlertDetails = (MVServiceAlertDetails) obj;
        if (!getClass().equals(mVServiceAlertDetails.getClass())) {
            return getClass().getName().compareTo(mVServiceAlertDetails.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31631j()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31631j()));
        if (compareTo2 != 0 || ((mo31631j() && (compareTo2 = this.alertId.compareTo(mVServiceAlertDetails.alertId)) != 0) || (compareTo2 = Boolean.valueOf(mo31630i()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31630i()))) != 0 || ((mo31630i() && (compareTo2 = C25082a.m62839c(this.agencyId, mVServiceAlertDetails.agencyId)) != 0) || (compareTo2 = Boolean.valueOf(mo31636p()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31636p()))) != 0 || ((mo31636p() && (compareTo2 = this.serviceStatus.compareTo(mVServiceAlertDetails.serviceStatus)) != 0) || (compareTo2 = Boolean.valueOf(mo31628h()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31628h()))) != 0 || ((mo31628h() && (compareTo2 = C25082a.m62844h(this.affectedLines, mVServiceAlertDetails.affectedLines)) != 0) || (compareTo2 = Boolean.valueOf(mo31635o()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31635o()))) != 0 || ((mo31635o() && (compareTo2 = C25082a.m62840d(this.publicationDate, mVServiceAlertDetails.publicationDate)) != 0) || (compareTo2 = Boolean.valueOf(mo31626f()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31626f()))) != 0 || ((mo31626f() && (compareTo2 = C25082a.m62840d(this.activeFrom, mVServiceAlertDetails.activeFrom)) != 0) || (compareTo2 = Boolean.valueOf(mo31627g()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31627g()))) != 0 || ((mo31627g() && (compareTo2 = C25082a.m62840d(this.activeTo, mVServiceAlertDetails.activeTo)) != 0) || (compareTo2 = Boolean.valueOf(mo31638r()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31638r()))) != 0 || ((mo31638r() && (compareTo2 = this.title.compareTo(mVServiceAlertDetails.title)) != 0) || (compareTo2 = Boolean.valueOf(mo31633l()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31633l()))) != 0 || ((mo31633l() && (compareTo2 = this.desc.compareTo(mVServiceAlertDetails.desc)) != 0) || (compareTo2 = Boolean.valueOf(mo31634m()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31634m()))) != 0 || ((mo31634m() && (compareTo2 = this.infoUrl.compareTo(mVServiceAlertDetails.infoUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo31632k()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31632k()))) != 0 || ((mo31632k() && (compareTo2 = this.alertPreviewText.compareTo(mVServiceAlertDetails.alertPreviewText)) != 0) || (compareTo2 = Boolean.valueOf(mo31637q()).compareTo(Boolean.valueOf(mVServiceAlertDetails.mo31637q()))) != 0)))))))))))) {
            return compareTo2;
        }
        if (!mo31637q() || (compareTo = this.shareUrl.compareTo(mVServiceAlertDetails.shareUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVServiceAlertDetails)) {
            return mo31623a((MVServiceAlertDetails) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31626f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo31627g() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: h */
    public final boolean mo31628h() {
        return this.affectedLines != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31630i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo31631j() {
        return this.alertId != null;
    }

    /* renamed from: k */
    public final boolean mo31632k() {
        return this.alertPreviewText != null;
    }

    /* renamed from: l */
    public final boolean mo31633l() {
        return this.desc != null;
    }

    /* renamed from: m */
    public final boolean mo31634m() {
        return this.infoUrl != null;
    }

    /* renamed from: o */
    public final boolean mo31635o() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: p */
    public final boolean mo31636p() {
        return this.serviceStatus != null;
    }

    /* renamed from: q */
    public final boolean mo31637q() {
        return this.shareUrl != null;
    }

    /* renamed from: r */
    public final boolean mo31638r() {
        return this.title != null;
    }

    /* renamed from: s */
    public final void mo31639s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: t */
    public final void mo31640t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVServiceAlertDetails(", "alertId:");
        String str = this.alertId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo31630i()) {
            n.append(", ");
            n.append("agencyId:");
            n.append(this.agencyId);
        }
        n.append(", ");
        n.append("serviceStatus:");
        MVServiceStatus mVServiceStatus = this.serviceStatus;
        if (mVServiceStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVServiceStatus);
        }
        if (mo31628h()) {
            n.append(", ");
            n.append("affectedLines:");
            List<MVAffectedLine> list = this.affectedLines;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo31635o()) {
            n.append(", ");
            n.append("publicationDate:");
            n.append(this.publicationDate);
        }
        if (mo31626f()) {
            n.append(", ");
            n.append("activeFrom:");
            n.append(this.activeFrom);
        }
        if (mo31627g()) {
            n.append(", ");
            n.append("activeTo:");
            n.append(this.activeTo);
        }
        n.append(", ");
        n.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo31633l()) {
            n.append(", ");
            n.append("desc:");
            MVText mVText = this.desc;
            if (mVText == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVText);
            }
        }
        if (mo31634m()) {
            n.append(", ");
            n.append("infoUrl:");
            String str3 = this.infoUrl;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("alertPreviewText:");
        String str4 = this.alertPreviewText;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        if (mo31637q()) {
            n.append(", ");
            n.append("shareUrl:");
            String str5 = this.shareUrl;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo31642u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: v */
    public final void mo31643v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: w */
    public final void mo31644w() throws TException {
        MVServiceStatus mVServiceStatus = this.serviceStatus;
        if (mVServiceStatus != null) {
            mVServiceStatus.getClass();
        }
        MVText mVText = this.desc;
        if (mVText != null) {
            mVText.getClass();
        }
    }
}
