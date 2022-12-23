package com.tranzmate.moovit.protocol.micromobility;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
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

public class MVMicroMobilityPurchaseConfirmationStep implements TBase<MVMicroMobilityPurchaseConfirmationStep, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseConfirmationStep> {

    /* renamed from: b */
    public static final C25113c f26602b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26603c = new C25113c("actionText", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26604d = new C25113c("rideTitle", (byte) 11, 4);

    /* renamed from: e */
    public static final C25113c f26605e = new C25113c("rideSubtitle", (byte) 11, 5);

    /* renamed from: f */
    public static final C25113c f26606f = new C25113c("rideDescription", (byte) 11, 6);

    /* renamed from: g */
    public static final C25113c f26607g = new C25113c("vehicleCondition", (byte) 12, 7);

    /* renamed from: h */
    public static final C25113c f26608h = new C25113c("appliedOptions", (byte) 15, 8);

    /* renamed from: i */
    public static final C25113c f26609i = new C25113c("disclaimer", (byte) 12, 9);

    /* renamed from: j */
    public static final C25113c f26610j = new C25113c("discountContextId", (byte) 11, 10);

    /* renamed from: k */
    public static final C25113c f26611k = new C25113c("paymentContext", (byte) 11, 11);

    /* renamed from: l */
    public static final HashMap f26612l;

    /* renamed from: m */
    public static final Map<_Fields, FieldMetaData> f26613m;
    public String actionText;
    public List<MVOption> appliedOptions;
    public MVRideDisclaimer disclaimer;
    public String discountContextId;
    private _Fields[] optionals = {_Fields.RIDE_SUBTITLE, _Fields.RIDE_DESCRIPTION, _Fields.VEHICLE_CONDITION, _Fields.APPLIED_OPTIONS, _Fields.DISCLAIMER, _Fields.DISCOUNT_CONTEXT_ID};
    public String paymentContext;
    public String rideDescription;
    public String rideSubtitle;
    public String rideTitle;
    public String title;
    public MVMicroMobilityVehicleCondition vehicleCondition;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        ACTION_TEXT(2, "actionText"),
        RIDE_TITLE(4, "rideTitle"),
        RIDE_SUBTITLE(5, "rideSubtitle"),
        RIDE_DESCRIPTION(6, "rideDescription"),
        VEHICLE_CONDITION(7, "vehicleCondition"),
        APPLIED_OPTIONS(8, "appliedOptions"),
        DISCLAIMER(9, "disclaimer"),
        DISCOUNT_CONTEXT_ID(10, "discountContextId"),
        PAYMENT_CONTEXT(11, "paymentContext");
        
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
                    return TITLE;
                case 2:
                    return ACTION_TEXT;
                case 4:
                    return RIDE_TITLE;
                case 5:
                    return RIDE_SUBTITLE;
                case 6:
                    return RIDE_DESCRIPTION;
                case 7:
                    return VEHICLE_CONDITION;
                case 8:
                    return APPLIED_OPTIONS;
                case 9:
                    return DISCLAIMER;
                case 10:
                    return DISCOUNT_CONTEXT_ID;
                case 11:
                    return PAYMENT_CONTEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationStep$a */
    public static class C9265a extends C25239c<MVMicroMobilityPurchaseConfirmationStep> {
        public C9265a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseConfirmationStep mVMicroMobilityPurchaseConfirmationStep = (MVMicroMobilityPurchaseConfirmationStep) tBase;
            mVMicroMobilityPurchaseConfirmationStep.getClass();
            C25113c cVar = MVMicroMobilityPurchaseConfirmationStep.f26602b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseConfirmationStep.title != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26602b);
                gVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationStep.actionText != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26603c);
                gVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.actionText);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationStep.rideTitle != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26604d);
                gVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.rideTitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationStep.rideSubtitle != null && mVMicroMobilityPurchaseConfirmationStep.mo28809l()) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26605e);
                gVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.rideSubtitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationStep.rideDescription != null && mVMicroMobilityPurchaseConfirmationStep.mo28808k()) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26606f);
                gVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.rideDescription);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationStep.vehicleCondition != null && mVMicroMobilityPurchaseConfirmationStep.mo28812p()) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26607g);
                mVMicroMobilityPurchaseConfirmationStep.vehicleCondition.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationStep.appliedOptions != null && mVMicroMobilityPurchaseConfirmationStep.mo28803g()) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26608h);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityPurchaseConfirmationStep.appliedOptions.size()));
                for (MVOption X0 : mVMicroMobilityPurchaseConfirmationStep.appliedOptions) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationStep.disclaimer != null && mVMicroMobilityPurchaseConfirmationStep.mo28804h()) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26609i);
                mVMicroMobilityPurchaseConfirmationStep.disclaimer.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationStep.discountContextId != null && mVMicroMobilityPurchaseConfirmationStep.mo28806i()) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26610j);
                gVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.discountContextId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationStep.paymentContext != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationStep.f26611k);
                gVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseConfirmationStep mVMicroMobilityPurchaseConfirmationStep = (MVMicroMobilityPurchaseConfirmationStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchaseConfirmationStep.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseConfirmationStep.title = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseConfirmationStep.actionText = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseConfirmationStep.rideTitle = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseConfirmationStep.rideSubtitle = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseConfirmationStep.rideDescription = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = new MVMicroMobilityVehicleCondition();
                            mVMicroMobilityPurchaseConfirmationStep.vehicleCondition = mVMicroMobilityVehicleCondition;
                            mVMicroMobilityVehicleCondition.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVMicroMobilityPurchaseConfirmationStep.appliedOptions = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVOption mVOption = new MVOption();
                                mVOption.mo25201C1(gVar);
                                mVMicroMobilityPurchaseConfirmationStep.appliedOptions.add(mVOption);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVRideDisclaimer mVRideDisclaimer = new MVRideDisclaimer();
                            mVMicroMobilityPurchaseConfirmationStep.disclaimer = mVRideDisclaimer;
                            mVRideDisclaimer.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseConfirmationStep.discountContextId = gVar.mo61704q();
                            break;
                        }
                    case 11:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseConfirmationStep.paymentContext = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationStep$b */
    public static class C9266b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9265a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationStep$c */
    public static class C9267c extends C25240d<MVMicroMobilityPurchaseConfirmationStep> {
        public C9267c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseConfirmationStep mVMicroMobilityPurchaseConfirmationStep = (MVMicroMobilityPurchaseConfirmationStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseConfirmationStep.mo28811o()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28802f()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28810m()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28809l()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28808k()) {
                bitSet.set(4);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28812p()) {
                bitSet.set(5);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28803g()) {
                bitSet.set(6);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28804h()) {
                bitSet.set(7);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28806i()) {
                bitSet.set(8);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28807j()) {
                bitSet.set(9);
            }
            jVar.mo61738U(bitSet, 10);
            if (mVMicroMobilityPurchaseConfirmationStep.mo28811o()) {
                jVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.title);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28802f()) {
                jVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.actionText);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28810m()) {
                jVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.rideTitle);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28809l()) {
                jVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.rideSubtitle);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28808k()) {
                jVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.rideDescription);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28812p()) {
                mVMicroMobilityPurchaseConfirmationStep.vehicleCondition.mo25202X0(jVar);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28803g()) {
                jVar.mo61678B(mVMicroMobilityPurchaseConfirmationStep.appliedOptions.size());
                for (MVOption X0 : mVMicroMobilityPurchaseConfirmationStep.appliedOptions) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28804h()) {
                mVMicroMobilityPurchaseConfirmationStep.disclaimer.mo25202X0(jVar);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28806i()) {
                jVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.discountContextId);
            }
            if (mVMicroMobilityPurchaseConfirmationStep.mo28807j()) {
                jVar.mo61686J(mVMicroMobilityPurchaseConfirmationStep.paymentContext);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseConfirmationStep mVMicroMobilityPurchaseConfirmationStep = (MVMicroMobilityPurchaseConfirmationStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(10);
            if (T.get(0)) {
                mVMicroMobilityPurchaseConfirmationStep.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVMicroMobilityPurchaseConfirmationStep.actionText = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityPurchaseConfirmationStep.rideTitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVMicroMobilityPurchaseConfirmationStep.rideSubtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVMicroMobilityPurchaseConfirmationStep.rideDescription = jVar.mo61704q();
            }
            if (T.get(5)) {
                MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = new MVMicroMobilityVehicleCondition();
                mVMicroMobilityPurchaseConfirmationStep.vehicleCondition = mVMicroMobilityVehicleCondition;
                mVMicroMobilityVehicleCondition.mo25201C1(jVar);
            }
            if (T.get(6)) {
                int i = jVar.mo61696i();
                mVMicroMobilityPurchaseConfirmationStep.appliedOptions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVOption mVOption = new MVOption();
                    mVOption.mo25201C1(jVar);
                    mVMicroMobilityPurchaseConfirmationStep.appliedOptions.add(mVOption);
                }
            }
            if (T.get(7)) {
                MVRideDisclaimer mVRideDisclaimer = new MVRideDisclaimer();
                mVMicroMobilityPurchaseConfirmationStep.disclaimer = mVRideDisclaimer;
                mVRideDisclaimer.mo25201C1(jVar);
            }
            if (T.get(8)) {
                mVMicroMobilityPurchaseConfirmationStep.discountContextId = jVar.mo61704q();
            }
            if (T.get(9)) {
                mVMicroMobilityPurchaseConfirmationStep.paymentContext = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationStep$d */
    public static class C9268d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9267c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseConfirmationStep");
        HashMap hashMap = new HashMap();
        f26612l = hashMap;
        hashMap.put(C25239c.class, new C9266b());
        hashMap.put(C25240d.class, new C9268d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_TEXT, new FieldMetaData("actionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RIDE_TITLE, new FieldMetaData("rideTitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RIDE_SUBTITLE, new FieldMetaData("rideSubtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RIDE_DESCRIPTION, new FieldMetaData("rideDescription", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VEHICLE_CONDITION, new FieldMetaData("vehicleCondition", (byte) 2, new StructMetaData(MVMicroMobilityVehicleCondition.class)));
        enumMap.put(_Fields.APPLIED_OPTIONS, new FieldMetaData("appliedOptions", (byte) 2, new ListMetaData(new StructMetaData(MVOption.class))));
        enumMap.put(_Fields.DISCLAIMER, new FieldMetaData("disclaimer", (byte) 2, new StructMetaData(MVRideDisclaimer.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26613m = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseConfirmationStep.class, unmodifiableMap);
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
        ((C25238b) f26612l.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26612l.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchaseConfirmationStep mVMicroMobilityPurchaseConfirmationStep = (MVMicroMobilityPurchaseConfirmationStep) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseConfirmationStep.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseConfirmationStep.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28811o()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28811o()));
        if (compareTo2 != 0 || ((mo28811o() && (compareTo2 = this.title.compareTo(mVMicroMobilityPurchaseConfirmationStep.title)) != 0) || (compareTo2 = Boolean.valueOf(mo28802f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28802f()))) != 0 || ((mo28802f() && (compareTo2 = this.actionText.compareTo(mVMicroMobilityPurchaseConfirmationStep.actionText)) != 0) || (compareTo2 = Boolean.valueOf(mo28810m()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28810m()))) != 0 || ((mo28810m() && (compareTo2 = this.rideTitle.compareTo(mVMicroMobilityPurchaseConfirmationStep.rideTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo28809l()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28809l()))) != 0 || ((mo28809l() && (compareTo2 = this.rideSubtitle.compareTo(mVMicroMobilityPurchaseConfirmationStep.rideSubtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo28808k()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28808k()))) != 0 || ((mo28808k() && (compareTo2 = this.rideDescription.compareTo(mVMicroMobilityPurchaseConfirmationStep.rideDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo28812p()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28812p()))) != 0 || ((mo28812p() && (compareTo2 = this.vehicleCondition.compareTo(mVMicroMobilityPurchaseConfirmationStep.vehicleCondition)) != 0) || (compareTo2 = Boolean.valueOf(mo28803g()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28803g()))) != 0 || ((mo28803g() && (compareTo2 = C25082a.m62844h(this.appliedOptions, mVMicroMobilityPurchaseConfirmationStep.appliedOptions)) != 0) || (compareTo2 = Boolean.valueOf(mo28804h()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28804h()))) != 0 || ((mo28804h() && (compareTo2 = this.disclaimer.compareTo(mVMicroMobilityPurchaseConfirmationStep.disclaimer)) != 0) || (compareTo2 = Boolean.valueOf(mo28806i()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28806i()))) != 0 || ((mo28806i() && (compareTo2 = this.discountContextId.compareTo(mVMicroMobilityPurchaseConfirmationStep.discountContextId)) != 0) || (compareTo2 = Boolean.valueOf(mo28807j()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationStep.mo28807j()))) != 0)))))))))) {
            return compareTo2;
        }
        if (!mo28807j() || (compareTo = this.paymentContext.compareTo(mVMicroMobilityPurchaseConfirmationStep.paymentContext)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchaseConfirmationStep)) {
            return false;
        }
        MVMicroMobilityPurchaseConfirmationStep mVMicroMobilityPurchaseConfirmationStep = (MVMicroMobilityPurchaseConfirmationStep) obj;
        boolean o = mo28811o();
        boolean o2 = mVMicroMobilityPurchaseConfirmationStep.mo28811o();
        if ((o || o2) && (!o || !o2 || !this.title.equals(mVMicroMobilityPurchaseConfirmationStep.title))) {
            return false;
        }
        boolean f = mo28802f();
        boolean f2 = mVMicroMobilityPurchaseConfirmationStep.mo28802f();
        if ((f || f2) && (!f || !f2 || !this.actionText.equals(mVMicroMobilityPurchaseConfirmationStep.actionText))) {
            return false;
        }
        boolean m = mo28810m();
        boolean m2 = mVMicroMobilityPurchaseConfirmationStep.mo28810m();
        if ((m || m2) && (!m || !m2 || !this.rideTitle.equals(mVMicroMobilityPurchaseConfirmationStep.rideTitle))) {
            return false;
        }
        boolean l = mo28809l();
        boolean l2 = mVMicroMobilityPurchaseConfirmationStep.mo28809l();
        if ((l || l2) && (!l || !l2 || !this.rideSubtitle.equals(mVMicroMobilityPurchaseConfirmationStep.rideSubtitle))) {
            return false;
        }
        boolean k = mo28808k();
        boolean k2 = mVMicroMobilityPurchaseConfirmationStep.mo28808k();
        if ((k || k2) && (!k || !k2 || !this.rideDescription.equals(mVMicroMobilityPurchaseConfirmationStep.rideDescription))) {
            return false;
        }
        boolean p = mo28812p();
        boolean p2 = mVMicroMobilityPurchaseConfirmationStep.mo28812p();
        if ((p || p2) && (!p || !p2 || !this.vehicleCondition.mo29026a(mVMicroMobilityPurchaseConfirmationStep.vehicleCondition))) {
            return false;
        }
        boolean g = mo28803g();
        boolean g2 = mVMicroMobilityPurchaseConfirmationStep.mo28803g();
        if ((g || g2) && (!g || !g2 || !this.appliedOptions.equals(mVMicroMobilityPurchaseConfirmationStep.appliedOptions))) {
            return false;
        }
        boolean h = mo28804h();
        boolean h2 = mVMicroMobilityPurchaseConfirmationStep.mo28804h();
        if ((h || h2) && (!h || !h2 || !this.disclaimer.mo29063a(mVMicroMobilityPurchaseConfirmationStep.disclaimer))) {
            return false;
        }
        boolean i = mo28806i();
        boolean i2 = mVMicroMobilityPurchaseConfirmationStep.mo28806i();
        if ((i || i2) && (!i || !i2 || !this.discountContextId.equals(mVMicroMobilityPurchaseConfirmationStep.discountContextId))) {
            return false;
        }
        boolean j = mo28807j();
        boolean j2 = mVMicroMobilityPurchaseConfirmationStep.mo28807j();
        if ((j || j2) && (!j || !j2 || !this.paymentContext.equals(mVMicroMobilityPurchaseConfirmationStep.paymentContext))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28802f() {
        return this.actionText != null;
    }

    /* renamed from: g */
    public final boolean mo28803g() {
        return this.appliedOptions != null;
    }

    /* renamed from: h */
    public final boolean mo28804h() {
        return this.disclaimer != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28806i() {
        return this.discountContextId != null;
    }

    /* renamed from: j */
    public final boolean mo28807j() {
        return this.paymentContext != null;
    }

    /* renamed from: k */
    public final boolean mo28808k() {
        return this.rideDescription != null;
    }

    /* renamed from: l */
    public final boolean mo28809l() {
        return this.rideSubtitle != null;
    }

    /* renamed from: m */
    public final boolean mo28810m() {
        return this.rideTitle != null;
    }

    /* renamed from: o */
    public final boolean mo28811o() {
        return this.title != null;
    }

    /* renamed from: p */
    public final boolean mo28812p() {
        return this.vehicleCondition != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchaseConfirmationStep(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("actionText:");
        String str2 = this.actionText;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("rideTitle:");
        String str3 = this.rideTitle;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo28809l()) {
            n.append(", ");
            n.append("rideSubtitle:");
            String str4 = this.rideSubtitle;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        if (mo28808k()) {
            n.append(", ");
            n.append("rideDescription:");
            String str5 = this.rideDescription;
            if (str5 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str5);
            }
        }
        if (mo28812p()) {
            n.append(", ");
            n.append("vehicleCondition:");
            MVMicroMobilityVehicleCondition mVMicroMobilityVehicleCondition = this.vehicleCondition;
            if (mVMicroMobilityVehicleCondition == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMicroMobilityVehicleCondition);
            }
        }
        if (mo28803g()) {
            n.append(", ");
            n.append("appliedOptions:");
            List<MVOption> list = this.appliedOptions;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        if (mo28804h()) {
            n.append(", ");
            n.append("disclaimer:");
            MVRideDisclaimer mVRideDisclaimer = this.disclaimer;
            if (mVRideDisclaimer == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVRideDisclaimer);
            }
        }
        if (mo28806i()) {
            n.append(", ");
            n.append("discountContextId:");
            String str6 = this.discountContextId;
            if (str6 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str6);
            }
        }
        n.append(", ");
        n.append("paymentContext:");
        String str7 = this.paymentContext;
        if (str7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str7);
        }
        n.append(")");
        return n.toString();
    }
}
