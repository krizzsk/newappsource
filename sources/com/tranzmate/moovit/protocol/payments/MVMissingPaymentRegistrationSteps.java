package com.tranzmate.moovit.protocol.payments;

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

public class MVMissingPaymentRegistrationSteps implements TBase<MVMissingPaymentRegistrationSteps, _Fields>, Serializable, Cloneable, Comparable<MVMissingPaymentRegistrationSteps> {

    /* renamed from: b */
    public static final C25113c f27361b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27362c = new C25113c("missingSteps", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f27363d = new C25113c("creditCardInstructions", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27364e = new C25113c("termsOfUseInstructions", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27365f = new C25113c("motPaymentMethodInstruction", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f27366g = new C25113c("profilesInstructions", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f27367h = new C25113c("externalAccountInstructions", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f27368i = new C25113c("reconnectInstructions", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f27369j = new C25113c("phoneInstructions", (byte) 12, 9);

    /* renamed from: k */
    public static final C25113c f27370k = new C25113c("emailInstructions", (byte) 12, 10);

    /* renamed from: l */
    public static final C25113c f27371l = new C25113c("questionInstructions", (byte) 12, 11);

    /* renamed from: m */
    public static final C25113c f27372m = new C25113c("inputInstructions", (byte) 12, 12);

    /* renamed from: n */
    public static final HashMap f27373n;

    /* renamed from: o */
    public static final Map<_Fields, FieldMetaData> f27374o;
    public MVCreditCardInstructions creditCardInstructions;
    public MVEmailVerificationInstructions emailInstructions;
    public MVExternalPaymentMethodInstructions externalAccountInstructions;
    public MVInputInstructions inputInstructions;
    public List<MVPaymentRegistrationStep> missingSteps;
    public MVMotPaymentMethodInstructions motPaymentMethodInstruction;
    private _Fields[] optionals = {_Fields.CREDIT_CARD_INSTRUCTIONS, _Fields.TERMS_OF_USE_INSTRUCTIONS, _Fields.MOT_PAYMENT_METHOD_INSTRUCTION, _Fields.PROFILES_INSTRUCTIONS, _Fields.EXTERNAL_ACCOUNT_INSTRUCTIONS, _Fields.RECONNECT_INSTRUCTIONS, _Fields.PHONE_INSTRUCTIONS, _Fields.EMAIL_INSTRUCTIONS, _Fields.QUESTION_INSTRUCTIONS, _Fields.INPUT_INSTRUCTIONS};
    public String paymentContext;
    public MVPhoneInstructions phoneInstructions;
    public MVProfilesInstructions profilesInstructions;
    public MVQuestionInstructions questionInstructions;
    public MVReconnectInstructions reconnectInstructions;
    public MVTermsOfUseInstructions termsOfUseInstructions;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        MISSING_STEPS(2, "missingSteps"),
        CREDIT_CARD_INSTRUCTIONS(3, "creditCardInstructions"),
        TERMS_OF_USE_INSTRUCTIONS(4, "termsOfUseInstructions"),
        MOT_PAYMENT_METHOD_INSTRUCTION(5, "motPaymentMethodInstruction"),
        PROFILES_INSTRUCTIONS(6, "profilesInstructions"),
        EXTERNAL_ACCOUNT_INSTRUCTIONS(7, "externalAccountInstructions"),
        RECONNECT_INSTRUCTIONS(8, "reconnectInstructions"),
        PHONE_INSTRUCTIONS(9, "phoneInstructions"),
        EMAIL_INSTRUCTIONS(10, "emailInstructions"),
        QUESTION_INSTRUCTIONS(11, "questionInstructions"),
        INPUT_INSTRUCTIONS(12, "inputInstructions");
        
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
                    return PAYMENT_CONTEXT;
                case 2:
                    return MISSING_STEPS;
                case 3:
                    return CREDIT_CARD_INSTRUCTIONS;
                case 4:
                    return TERMS_OF_USE_INSTRUCTIONS;
                case 5:
                    return MOT_PAYMENT_METHOD_INSTRUCTION;
                case 6:
                    return PROFILES_INSTRUCTIONS;
                case 7:
                    return EXTERNAL_ACCOUNT_INSTRUCTIONS;
                case 8:
                    return RECONNECT_INSTRUCTIONS;
                case 9:
                    return PHONE_INSTRUCTIONS;
                case 10:
                    return EMAIL_INSTRUCTIONS;
                case 11:
                    return QUESTION_INSTRUCTIONS;
                case 12:
                    return INPUT_INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps$a */
    public static class C9821a extends C25239c<MVMissingPaymentRegistrationSteps> {
        public C9821a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = (MVMissingPaymentRegistrationSteps) tBase;
            mVMissingPaymentRegistrationSteps.mo30045s();
            C25113c cVar = MVMissingPaymentRegistrationSteps.f27361b;
            gVar.mo61687K();
            if (mVMissingPaymentRegistrationSteps.paymentContext != null) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27361b);
                gVar.mo61686J(mVMissingPaymentRegistrationSteps.paymentContext);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.missingSteps != null) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27362c);
                gVar.mo61680D(new C25119e((byte) 8, mVMissingPaymentRegistrationSteps.missingSteps.size()));
                for (MVPaymentRegistrationStep value : mVMissingPaymentRegistrationSteps.missingSteps) {
                    gVar.mo61678B(value.getValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.creditCardInstructions != null && mVMissingPaymentRegistrationSteps.mo30032f()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27363d);
                mVMissingPaymentRegistrationSteps.creditCardInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.termsOfUseInstructions != null && mVMissingPaymentRegistrationSteps.mo30044r()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27364e);
                mVMissingPaymentRegistrationSteps.termsOfUseInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.motPaymentMethodInstruction != null && mVMissingPaymentRegistrationSteps.mo30038k()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27365f);
                mVMissingPaymentRegistrationSteps.motPaymentMethodInstruction.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.profilesInstructions != null && mVMissingPaymentRegistrationSteps.mo30041o()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27366g);
                mVMissingPaymentRegistrationSteps.profilesInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.externalAccountInstructions != null && mVMissingPaymentRegistrationSteps.mo30034h()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27367h);
                mVMissingPaymentRegistrationSteps.externalAccountInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.reconnectInstructions != null && mVMissingPaymentRegistrationSteps.mo30043q()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27368i);
                mVMissingPaymentRegistrationSteps.reconnectInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.phoneInstructions != null && mVMissingPaymentRegistrationSteps.mo30040m()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27369j);
                mVMissingPaymentRegistrationSteps.phoneInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.emailInstructions != null && mVMissingPaymentRegistrationSteps.mo30033g()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27370k);
                mVMissingPaymentRegistrationSteps.emailInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.questionInstructions != null && mVMissingPaymentRegistrationSteps.mo30042p()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27371l);
                mVMissingPaymentRegistrationSteps.questionInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMissingPaymentRegistrationSteps.inputInstructions != null && mVMissingPaymentRegistrationSteps.mo30036i()) {
                gVar.mo61711x(MVMissingPaymentRegistrationSteps.f27372m);
                mVMissingPaymentRegistrationSteps.inputInstructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = (MVMissingPaymentRegistrationSteps) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMissingPaymentRegistrationSteps.mo30045s();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMissingPaymentRegistrationSteps.paymentContext = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVMissingPaymentRegistrationSteps.missingSteps = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                mVMissingPaymentRegistrationSteps.missingSteps.add(MVPaymentRegistrationStep.findByValue(gVar.mo61696i()));
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                            mVMissingPaymentRegistrationSteps.creditCardInstructions = mVCreditCardInstructions;
                            mVCreditCardInstructions.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVTermsOfUseInstructions mVTermsOfUseInstructions = new MVTermsOfUseInstructions();
                            mVMissingPaymentRegistrationSteps.termsOfUseInstructions = mVTermsOfUseInstructions;
                            mVTermsOfUseInstructions.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = new MVMotPaymentMethodInstructions();
                            mVMissingPaymentRegistrationSteps.motPaymentMethodInstruction = mVMotPaymentMethodInstructions;
                            mVMotPaymentMethodInstructions.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVProfilesInstructions mVProfilesInstructions = new MVProfilesInstructions();
                            mVMissingPaymentRegistrationSteps.profilesInstructions = mVProfilesInstructions;
                            mVProfilesInstructions.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVExternalPaymentMethodInstructions mVExternalPaymentMethodInstructions = new MVExternalPaymentMethodInstructions();
                            mVMissingPaymentRegistrationSteps.externalAccountInstructions = mVExternalPaymentMethodInstructions;
                            mVExternalPaymentMethodInstructions.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVReconnectInstructions mVReconnectInstructions = new MVReconnectInstructions();
                            mVMissingPaymentRegistrationSteps.reconnectInstructions = mVReconnectInstructions;
                            mVReconnectInstructions.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPhoneInstructions mVPhoneInstructions = new MVPhoneInstructions();
                            mVMissingPaymentRegistrationSteps.phoneInstructions = mVPhoneInstructions;
                            mVPhoneInstructions.mo25201C1(gVar);
                            break;
                        }
                    case 10:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVEmailVerificationInstructions mVEmailVerificationInstructions = new MVEmailVerificationInstructions();
                            mVMissingPaymentRegistrationSteps.emailInstructions = mVEmailVerificationInstructions;
                            mVEmailVerificationInstructions.mo25201C1(gVar);
                            break;
                        }
                    case 11:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVQuestionInstructions mVQuestionInstructions = new MVQuestionInstructions();
                            mVMissingPaymentRegistrationSteps.questionInstructions = mVQuestionInstructions;
                            mVQuestionInstructions.mo25201C1(gVar);
                            break;
                        }
                    case 12:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVInputInstructions mVInputInstructions = new MVInputInstructions();
                            mVMissingPaymentRegistrationSteps.inputInstructions = mVInputInstructions;
                            mVInputInstructions.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps$b */
    public static class C9822b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9821a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps$c */
    public static class C9823c extends C25240d<MVMissingPaymentRegistrationSteps> {
        public C9823c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = (MVMissingPaymentRegistrationSteps) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMissingPaymentRegistrationSteps.mo30039l()) {
                bitSet.set(0);
            }
            if (mVMissingPaymentRegistrationSteps.mo30037j()) {
                bitSet.set(1);
            }
            if (mVMissingPaymentRegistrationSteps.mo30032f()) {
                bitSet.set(2);
            }
            if (mVMissingPaymentRegistrationSteps.mo30044r()) {
                bitSet.set(3);
            }
            if (mVMissingPaymentRegistrationSteps.mo30038k()) {
                bitSet.set(4);
            }
            if (mVMissingPaymentRegistrationSteps.mo30041o()) {
                bitSet.set(5);
            }
            if (mVMissingPaymentRegistrationSteps.mo30034h()) {
                bitSet.set(6);
            }
            if (mVMissingPaymentRegistrationSteps.mo30043q()) {
                bitSet.set(7);
            }
            if (mVMissingPaymentRegistrationSteps.mo30040m()) {
                bitSet.set(8);
            }
            if (mVMissingPaymentRegistrationSteps.mo30033g()) {
                bitSet.set(9);
            }
            if (mVMissingPaymentRegistrationSteps.mo30042p()) {
                bitSet.set(10);
            }
            if (mVMissingPaymentRegistrationSteps.mo30036i()) {
                bitSet.set(11);
            }
            jVar.mo61738U(bitSet, 12);
            if (mVMissingPaymentRegistrationSteps.mo30039l()) {
                jVar.mo61686J(mVMissingPaymentRegistrationSteps.paymentContext);
            }
            if (mVMissingPaymentRegistrationSteps.mo30037j()) {
                jVar.mo61678B(mVMissingPaymentRegistrationSteps.missingSteps.size());
                for (MVPaymentRegistrationStep value : mVMissingPaymentRegistrationSteps.missingSteps) {
                    jVar.mo61678B(value.getValue());
                }
            }
            if (mVMissingPaymentRegistrationSteps.mo30032f()) {
                mVMissingPaymentRegistrationSteps.creditCardInstructions.mo25202X0(jVar);
            }
            if (mVMissingPaymentRegistrationSteps.mo30044r()) {
                mVMissingPaymentRegistrationSteps.termsOfUseInstructions.mo25202X0(jVar);
            }
            if (mVMissingPaymentRegistrationSteps.mo30038k()) {
                mVMissingPaymentRegistrationSteps.motPaymentMethodInstruction.mo25202X0(jVar);
            }
            if (mVMissingPaymentRegistrationSteps.mo30041o()) {
                mVMissingPaymentRegistrationSteps.profilesInstructions.mo25202X0(jVar);
            }
            if (mVMissingPaymentRegistrationSteps.mo30034h()) {
                mVMissingPaymentRegistrationSteps.externalAccountInstructions.mo25202X0(jVar);
            }
            if (mVMissingPaymentRegistrationSteps.mo30043q()) {
                mVMissingPaymentRegistrationSteps.reconnectInstructions.mo25202X0(jVar);
            }
            if (mVMissingPaymentRegistrationSteps.mo30040m()) {
                mVMissingPaymentRegistrationSteps.phoneInstructions.mo25202X0(jVar);
            }
            if (mVMissingPaymentRegistrationSteps.mo30033g()) {
                mVMissingPaymentRegistrationSteps.emailInstructions.mo25202X0(jVar);
            }
            if (mVMissingPaymentRegistrationSteps.mo30042p()) {
                mVMissingPaymentRegistrationSteps.questionInstructions.mo25202X0(jVar);
            }
            if (mVMissingPaymentRegistrationSteps.mo30036i()) {
                mVMissingPaymentRegistrationSteps.inputInstructions.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = (MVMissingPaymentRegistrationSteps) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(12);
            if (T.get(0)) {
                mVMissingPaymentRegistrationSteps.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVMissingPaymentRegistrationSteps.missingSteps = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVMissingPaymentRegistrationSteps.missingSteps.add(MVPaymentRegistrationStep.findByValue(jVar.mo61696i()));
                }
            }
            if (T.get(2)) {
                MVCreditCardInstructions mVCreditCardInstructions = new MVCreditCardInstructions();
                mVMissingPaymentRegistrationSteps.creditCardInstructions = mVCreditCardInstructions;
                mVCreditCardInstructions.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVTermsOfUseInstructions mVTermsOfUseInstructions = new MVTermsOfUseInstructions();
                mVMissingPaymentRegistrationSteps.termsOfUseInstructions = mVTermsOfUseInstructions;
                mVTermsOfUseInstructions.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = new MVMotPaymentMethodInstructions();
                mVMissingPaymentRegistrationSteps.motPaymentMethodInstruction = mVMotPaymentMethodInstructions;
                mVMotPaymentMethodInstructions.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVProfilesInstructions mVProfilesInstructions = new MVProfilesInstructions();
                mVMissingPaymentRegistrationSteps.profilesInstructions = mVProfilesInstructions;
                mVProfilesInstructions.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVExternalPaymentMethodInstructions mVExternalPaymentMethodInstructions = new MVExternalPaymentMethodInstructions();
                mVMissingPaymentRegistrationSteps.externalAccountInstructions = mVExternalPaymentMethodInstructions;
                mVExternalPaymentMethodInstructions.mo25201C1(jVar);
            }
            if (T.get(7)) {
                MVReconnectInstructions mVReconnectInstructions = new MVReconnectInstructions();
                mVMissingPaymentRegistrationSteps.reconnectInstructions = mVReconnectInstructions;
                mVReconnectInstructions.mo25201C1(jVar);
            }
            if (T.get(8)) {
                MVPhoneInstructions mVPhoneInstructions = new MVPhoneInstructions();
                mVMissingPaymentRegistrationSteps.phoneInstructions = mVPhoneInstructions;
                mVPhoneInstructions.mo25201C1(jVar);
            }
            if (T.get(9)) {
                MVEmailVerificationInstructions mVEmailVerificationInstructions = new MVEmailVerificationInstructions();
                mVMissingPaymentRegistrationSteps.emailInstructions = mVEmailVerificationInstructions;
                mVEmailVerificationInstructions.mo25201C1(jVar);
            }
            if (T.get(10)) {
                MVQuestionInstructions mVQuestionInstructions = new MVQuestionInstructions();
                mVMissingPaymentRegistrationSteps.questionInstructions = mVQuestionInstructions;
                mVQuestionInstructions.mo25201C1(jVar);
            }
            if (T.get(11)) {
                MVInputInstructions mVInputInstructions = new MVInputInstructions();
                mVMissingPaymentRegistrationSteps.inputInstructions = mVInputInstructions;
                mVInputInstructions.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps$d */
    public static class C9824d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9823c(0);
        }
    }

    static {
        new C17394d0("MVMissingPaymentRegistrationSteps");
        HashMap hashMap = new HashMap();
        f27373n = hashMap;
        hashMap.put(C25239c.class, new C9822b());
        hashMap.put(C25240d.class, new C9824d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 3, new ListMetaData(new EnumMetaData(MVPaymentRegistrationStep.class))));
        enumMap.put(_Fields.CREDIT_CARD_INSTRUCTIONS, new FieldMetaData("creditCardInstructions", (byte) 2, new StructMetaData(MVCreditCardInstructions.class)));
        enumMap.put(_Fields.TERMS_OF_USE_INSTRUCTIONS, new FieldMetaData("termsOfUseInstructions", (byte) 2, new StructMetaData(MVTermsOfUseInstructions.class)));
        enumMap.put(_Fields.MOT_PAYMENT_METHOD_INSTRUCTION, new FieldMetaData("motPaymentMethodInstruction", (byte) 2, new StructMetaData(MVMotPaymentMethodInstructions.class)));
        enumMap.put(_Fields.PROFILES_INSTRUCTIONS, new FieldMetaData("profilesInstructions", (byte) 2, new StructMetaData(MVProfilesInstructions.class)));
        enumMap.put(_Fields.EXTERNAL_ACCOUNT_INSTRUCTIONS, new FieldMetaData("externalAccountInstructions", (byte) 2, new StructMetaData(MVExternalPaymentMethodInstructions.class)));
        enumMap.put(_Fields.RECONNECT_INSTRUCTIONS, new FieldMetaData("reconnectInstructions", (byte) 2, new StructMetaData(MVReconnectInstructions.class)));
        enumMap.put(_Fields.PHONE_INSTRUCTIONS, new FieldMetaData("phoneInstructions", (byte) 2, new StructMetaData(MVPhoneInstructions.class)));
        enumMap.put(_Fields.EMAIL_INSTRUCTIONS, new FieldMetaData("emailInstructions", (byte) 2, new StructMetaData(MVEmailVerificationInstructions.class)));
        enumMap.put(_Fields.QUESTION_INSTRUCTIONS, new FieldMetaData("questionInstructions", (byte) 2, new StructMetaData(MVQuestionInstructions.class)));
        enumMap.put(_Fields.INPUT_INSTRUCTIONS, new FieldMetaData("inputInstructions", (byte) 2, new StructMetaData(MVInputInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27374o = unmodifiableMap;
        FieldMetaData.m61947a(MVMissingPaymentRegistrationSteps.class, unmodifiableMap);
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
        ((C25238b) f27373n.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27373n.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30029a(MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps) {
        if (mVMissingPaymentRegistrationSteps == null) {
            return false;
        }
        boolean l = mo30039l();
        boolean l2 = mVMissingPaymentRegistrationSteps.mo30039l();
        if ((l || l2) && (!l || !l2 || !this.paymentContext.equals(mVMissingPaymentRegistrationSteps.paymentContext))) {
            return false;
        }
        boolean j = mo30037j();
        boolean j2 = mVMissingPaymentRegistrationSteps.mo30037j();
        if ((j || j2) && (!j || !j2 || !this.missingSteps.equals(mVMissingPaymentRegistrationSteps.missingSteps))) {
            return false;
        }
        boolean f = mo30032f();
        boolean f2 = mVMissingPaymentRegistrationSteps.mo30032f();
        if ((f || f2) && (!f || !f2 || !this.creditCardInstructions.mo29766a(mVMissingPaymentRegistrationSteps.creditCardInstructions))) {
            return false;
        }
        boolean r = mo30044r();
        boolean r2 = mVMissingPaymentRegistrationSteps.mo30044r();
        if ((r || r2) && (!r || !r2 || !this.termsOfUseInstructions.mo30619a(mVMissingPaymentRegistrationSteps.termsOfUseInstructions))) {
            return false;
        }
        boolean k = mo30038k();
        boolean k2 = mVMissingPaymentRegistrationSteps.mo30038k();
        if ((k || k2) && (!k || !k2 || !this.motPaymentMethodInstruction.mo30060a(mVMissingPaymentRegistrationSteps.motPaymentMethodInstruction))) {
            return false;
        }
        boolean o = mo30041o();
        boolean o2 = mVMissingPaymentRegistrationSteps.mo30041o();
        if ((o || o2) && (!o || !o2 || !this.profilesInstructions.mo30517a(mVMissingPaymentRegistrationSteps.profilesInstructions))) {
            return false;
        }
        boolean h = mo30034h();
        boolean h2 = mVMissingPaymentRegistrationSteps.mo30034h();
        if ((h || h2) && (!h || !h2 || !this.externalAccountInstructions.mo29848a(mVMissingPaymentRegistrationSteps.externalAccountInstructions))) {
            return false;
        }
        boolean q = mo30043q();
        boolean q2 = mVMissingPaymentRegistrationSteps.mo30043q();
        if ((q || q2) && (!q || !q2 || !this.reconnectInstructions.mo30556a(mVMissingPaymentRegistrationSteps.reconnectInstructions))) {
            return false;
        }
        boolean m = mo30040m();
        boolean m2 = mVMissingPaymentRegistrationSteps.mo30040m();
        if ((m || m2) && (!m || !m2 || !this.phoneInstructions.mo30471a(mVMissingPaymentRegistrationSteps.phoneInstructions))) {
            return false;
        }
        boolean g = mo30033g();
        boolean g2 = mVMissingPaymentRegistrationSteps.mo30033g();
        if ((g || g2) && (!g || !g2 || !this.emailInstructions.mo29824a(mVMissingPaymentRegistrationSteps.emailInstructions))) {
            return false;
        }
        boolean p = mo30042p();
        boolean p2 = mVMissingPaymentRegistrationSteps.mo30042p();
        if ((p || p2) && (!p || !p2 || !this.questionInstructions.mo30543a(mVMissingPaymentRegistrationSteps.questionInstructions))) {
            return false;
        }
        boolean i = mo30036i();
        boolean i2 = mVMissingPaymentRegistrationSteps.mo30036i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.inputInstructions.mo29998a(mVMissingPaymentRegistrationSteps.inputInstructions)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = (MVMissingPaymentRegistrationSteps) obj;
        if (!getClass().equals(mVMissingPaymentRegistrationSteps.getClass())) {
            return getClass().getName().compareTo(mVMissingPaymentRegistrationSteps.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30039l()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30039l()));
        if (compareTo2 != 0 || ((mo30039l() && (compareTo2 = this.paymentContext.compareTo(mVMissingPaymentRegistrationSteps.paymentContext)) != 0) || (compareTo2 = Boolean.valueOf(mo30037j()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30037j()))) != 0 || ((mo30037j() && (compareTo2 = C25082a.m62844h(this.missingSteps, mVMissingPaymentRegistrationSteps.missingSteps)) != 0) || (compareTo2 = Boolean.valueOf(mo30032f()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30032f()))) != 0 || ((mo30032f() && (compareTo2 = this.creditCardInstructions.compareTo(mVMissingPaymentRegistrationSteps.creditCardInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30044r()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30044r()))) != 0 || ((mo30044r() && (compareTo2 = this.termsOfUseInstructions.compareTo(mVMissingPaymentRegistrationSteps.termsOfUseInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30038k()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30038k()))) != 0 || ((mo30038k() && (compareTo2 = this.motPaymentMethodInstruction.compareTo(mVMissingPaymentRegistrationSteps.motPaymentMethodInstruction)) != 0) || (compareTo2 = Boolean.valueOf(mo30041o()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30041o()))) != 0 || ((mo30041o() && (compareTo2 = this.profilesInstructions.compareTo(mVMissingPaymentRegistrationSteps.profilesInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30034h()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30034h()))) != 0 || ((mo30034h() && (compareTo2 = this.externalAccountInstructions.compareTo(mVMissingPaymentRegistrationSteps.externalAccountInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30043q()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30043q()))) != 0 || ((mo30043q() && (compareTo2 = this.reconnectInstructions.compareTo(mVMissingPaymentRegistrationSteps.reconnectInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30040m()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30040m()))) != 0 || ((mo30040m() && (compareTo2 = this.phoneInstructions.compareTo(mVMissingPaymentRegistrationSteps.phoneInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30033g()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30033g()))) != 0 || ((mo30033g() && (compareTo2 = this.emailInstructions.compareTo(mVMissingPaymentRegistrationSteps.emailInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30042p()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30042p()))) != 0 || ((mo30042p() && (compareTo2 = this.questionInstructions.compareTo(mVMissingPaymentRegistrationSteps.questionInstructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30036i()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationSteps.mo30036i()))) != 0)))))))))))) {
            return compareTo2;
        }
        if (!mo30036i() || (compareTo = this.inputInstructions.compareTo(mVMissingPaymentRegistrationSteps.inputInstructions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMissingPaymentRegistrationSteps)) {
            return mo30029a((MVMissingPaymentRegistrationSteps) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30032f() {
        return this.creditCardInstructions != null;
    }

    /* renamed from: g */
    public final boolean mo30033g() {
        return this.emailInstructions != null;
    }

    /* renamed from: h */
    public final boolean mo30034h() {
        return this.externalAccountInstructions != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30036i() {
        return this.inputInstructions != null;
    }

    /* renamed from: j */
    public final boolean mo30037j() {
        return this.missingSteps != null;
    }

    /* renamed from: k */
    public final boolean mo30038k() {
        return this.motPaymentMethodInstruction != null;
    }

    /* renamed from: l */
    public final boolean mo30039l() {
        return this.paymentContext != null;
    }

    /* renamed from: m */
    public final boolean mo30040m() {
        return this.phoneInstructions != null;
    }

    /* renamed from: o */
    public final boolean mo30041o() {
        return this.profilesInstructions != null;
    }

    /* renamed from: p */
    public final boolean mo30042p() {
        return this.questionInstructions != null;
    }

    /* renamed from: q */
    public final boolean mo30043q() {
        return this.reconnectInstructions != null;
    }

    /* renamed from: r */
    public final boolean mo30044r() {
        return this.termsOfUseInstructions != null;
    }

    /* renamed from: s */
    public final void mo30045s() throws TException {
        MVInputFieldsInstructions mVInputFieldsInstructions;
        MVInputFieldsInstructions mVInputFieldsInstructions2;
        MVCreditCardInstructions mVCreditCardInstructions = this.creditCardInstructions;
        if (mVCreditCardInstructions != null) {
            mVCreditCardInstructions.mo29771h();
        }
        MVTermsOfUseInstructions mVTermsOfUseInstructions = this.termsOfUseInstructions;
        MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = this.motPaymentMethodInstruction;
        if (mVMotPaymentMethodInstructions != null) {
            mVMotPaymentMethodInstructions.mo30067i();
        }
        MVExternalPaymentMethodInstructions mVExternalPaymentMethodInstructions = this.externalAccountInstructions;
        if (!(mVExternalPaymentMethodInstructions == null || (mVInputFieldsInstructions2 = mVExternalPaymentMethodInstructions.inputInstructions) == null)) {
            mVInputFieldsInstructions2.mo29995o();
        }
        MVReconnectInstructions mVReconnectInstructions = this.reconnectInstructions;
        MVPhoneInstructions mVPhoneInstructions = this.phoneInstructions;
        MVQuestionInstructions mVQuestionInstructions = this.questionInstructions;
        if (mVQuestionInstructions != null) {
            mVQuestionInstructions.mo30553l();
        }
        MVInputInstructions mVInputInstructions = this.inputInstructions;
        if (mVInputInstructions != null && (mVInputFieldsInstructions = mVInputInstructions.inputInstructions) != null) {
            mVInputFieldsInstructions.mo29995o();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMissingPaymentRegistrationSteps(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("missingSteps:");
        List<MVPaymentRegistrationStep> list = this.missingSteps;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo30032f()) {
            n.append(", ");
            n.append("creditCardInstructions:");
            MVCreditCardInstructions mVCreditCardInstructions = this.creditCardInstructions;
            if (mVCreditCardInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCreditCardInstructions);
            }
        }
        if (mo30044r()) {
            n.append(", ");
            n.append("termsOfUseInstructions:");
            MVTermsOfUseInstructions mVTermsOfUseInstructions = this.termsOfUseInstructions;
            if (mVTermsOfUseInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVTermsOfUseInstructions);
            }
        }
        if (mo30038k()) {
            n.append(", ");
            n.append("motPaymentMethodInstruction:");
            MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = this.motPaymentMethodInstruction;
            if (mVMotPaymentMethodInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVMotPaymentMethodInstructions);
            }
        }
        if (mo30041o()) {
            n.append(", ");
            n.append("profilesInstructions:");
            MVProfilesInstructions mVProfilesInstructions = this.profilesInstructions;
            if (mVProfilesInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVProfilesInstructions);
            }
        }
        if (mo30034h()) {
            n.append(", ");
            n.append("externalAccountInstructions:");
            MVExternalPaymentMethodInstructions mVExternalPaymentMethodInstructions = this.externalAccountInstructions;
            if (mVExternalPaymentMethodInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVExternalPaymentMethodInstructions);
            }
        }
        if (mo30043q()) {
            n.append(", ");
            n.append("reconnectInstructions:");
            MVReconnectInstructions mVReconnectInstructions = this.reconnectInstructions;
            if (mVReconnectInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVReconnectInstructions);
            }
        }
        if (mo30040m()) {
            n.append(", ");
            n.append("phoneInstructions:");
            MVPhoneInstructions mVPhoneInstructions = this.phoneInstructions;
            if (mVPhoneInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPhoneInstructions);
            }
        }
        if (mo30033g()) {
            n.append(", ");
            n.append("emailInstructions:");
            MVEmailVerificationInstructions mVEmailVerificationInstructions = this.emailInstructions;
            if (mVEmailVerificationInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVEmailVerificationInstructions);
            }
        }
        if (mo30042p()) {
            n.append(", ");
            n.append("questionInstructions:");
            MVQuestionInstructions mVQuestionInstructions = this.questionInstructions;
            if (mVQuestionInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVQuestionInstructions);
            }
        }
        if (mo30036i()) {
            n.append(", ");
            n.append("inputInstructions:");
            MVInputInstructions mVInputInstructions = this.inputInstructions;
            if (mVInputInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVInputInstructions);
            }
        }
        n.append(")");
        return n.toString();
    }
}
