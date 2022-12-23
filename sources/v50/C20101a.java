package v50;

import q00.C19053d;
import r00.C19209a;
import r00.C19216h;

/* renamed from: v50.a */
public interface C20101a extends C19053d {

    /* renamed from: S */
    public static final C19209a f51006S;

    /* renamed from: T */
    public static final C19216h f51007T = new C19216h("DEFAULT_PAYMENT_CONTEXT", "Login");

    /* renamed from: U */
    public static final C19216h f51008U = new C19216h("DEFAULT_PROFILES_PAYMENT_CONTEXT", (String) null);

    /* renamed from: V */
    public static final C19209a f51009V;

    /* renamed from: W */
    public static final C19209a f51010W;

    /* renamed from: X */
    public static final C19216h f51011X = new C19216h("ACCESSIBLE_TAXIES_PAYMENT_CONTEXT", "AccessibleTaxi");

    /* renamed from: Y */
    public static final C19209a f51012Y;

    /* renamed from: Z */
    public static final C19209a f51013Z;

    /* renamed from: a0 */
    public static final C19209a f51014a0;

    static {
        Boolean bool = Boolean.FALSE;
        f51006S = new C19209a("IS_PAYMENT_SUPPORTED", bool);
        f51009V = new C19209a("SHOULD_DISPLAY_ACCOUNT_CREDIT_CARDS", bool);
        f51010W = new C19209a("SHOULD_DISPLAY_ACCOUNT_CREDIT_CARDS_EMPTY_STATE", bool);
        f51012Y = new C19209a("IS_PAYMENT_ACCOUNT_REDEEM_BENEFIT_SUPPORTED", bool);
        f51013Z = new C19209a("IS_ACCOUNT_SUBSCRIPTION_SUPPORTED", bool);
        f51014a0 = new C19209a("FORMAT_USER_LAST_NAME_FIRST", bool);
    }
}
