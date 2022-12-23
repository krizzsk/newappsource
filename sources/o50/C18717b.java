package o50;

import android.content.Context;
import android.os.AsyncTask;
import com.cubic.umo.pass.model.BillingAddress;
import com.cubic.umo.pass.model.CreditCard;
import com.cubic.umo.pass.model.CreditCardType;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.internal.C14080o;
import com.moovit.MoovitExecutors;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.view.address.Address;
import com.moovit.view.p340cc.C7959a;
import java.util.Map;
import m60.C18342b;
import p009a8.C0111k;
import p041ca.C1832r;
import p176n0.C5788g;
import p176n0.C5789h;
import p304x.C7038d0;
import p373au.C13533e;
import p977zz.C20964s0;
import w90.C13222b;
import w90.C13225c;

/* renamed from: o50.b */
public class C18717b extends C18342b {

    /* renamed from: u */
    public static final /* synthetic */ int f47627u = 0;

    /* renamed from: o50.b$a */
    public static /* synthetic */ class C18718a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47628a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.view.cc.CreditCardType[] r0 = com.moovit.view.p340cc.CreditCardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47628a = r0
                com.moovit.view.cc.CreditCardType r1 = com.moovit.view.p340cc.CreditCardType.VISA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47628a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.view.cc.CreditCardType r1 = com.moovit.view.p340cc.CreditCardType.MASTERCARD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47628a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.view.cc.CreditCardType r1 = com.moovit.view.p340cc.CreditCardType.AMERICAN_EXPRESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47628a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.view.cc.CreditCardType r1 = com.moovit.view.p340cc.CreditCardType.DISCOVER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f47628a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.view.cc.CreditCardType r1 = com.moovit.view.p340cc.CreditCardType.JCB     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o50.C18717b.C18718a.<clinit>():void");
        }
    }

    /* renamed from: u2 */
    public static BillingAddress m45719u2(Address address) {
        return new BillingAddress(C20964s0.m49097o(address.f24017b, C20964s0.m49106x(address.f24018c)).toString(), address.f24019d, C20964s0.m49106x(address.f24020e), address.f24021f, address.f24022g);
    }

    /* renamed from: v2 */
    public static CreditCard m45720v2(C7959a aVar) {
        CreditCardType creditCardType;
        String str = aVar.f24093b;
        String str2 = aVar.f24097f;
        String str3 = aVar.f24094c;
        if (str3.length() == 1) {
            str3 = C25541a.m63881k("0", str3);
        }
        String str4 = aVar.f24095d;
        if (str4.length() > 2) {
            str4 = str4.substring(str4.length() - 2);
        }
        String k = C25541a.m63881k(str3, str4);
        String str5 = aVar.f24096e;
        com.moovit.view.p340cc.CreditCardType creditCardType2 = aVar.f24092a;
        int i = C18718a.f47628a[creditCardType2.ordinal()];
        if (i == 1) {
            creditCardType = CreditCardType.VISA;
        } else if (i == 2) {
            creditCardType = CreditCardType.MASTERCARD;
        } else if (i == 3) {
            creditCardType = CreditCardType.AMEX;
        } else if (i == 4) {
            creditCardType = CreditCardType.DISCOVER;
        } else if (i == 5) {
            creditCardType = CreditCardType.JCB;
        } else {
            throw new IllegalArgumentException("Unknown creditCardType: " + creditCardType2);
        }
        return new CreditCard(str, str2, k, str5, creditCardType);
    }

    /* renamed from: s2 */
    public final Task mo50798s2(Context context, C7959a aVar, Map map) {
        String str = (String) map.get("TPEnvironment");
        if (str == null) {
            return Tasks.forException(new RuntimeException("Environment not provided!"));
        }
        String str2 = (String) map.get("umoClientId");
        if (C20964s0.m49090h(str2)) {
            return Tasks.forException(new RuntimeException("Cubic client id not provided!"));
        }
        String str3 = (String) map.get("umoClientSecret");
        if (C20964s0.m49090h(str3)) {
            return Tasks.forException(new RuntimeException("Cubic client secret not provided!"));
        }
        String str4 = (String) map.get("agencyId");
        if (C20964s0.m49090h(str4)) {
            return Tasks.forException(new RuntimeException("Cubic agency id not provided!"));
        }
        Address address = aVar.f24101j;
        if (address == null) {
            return Tasks.forException(new RuntimeException("Billing address not provided!"));
        }
        C14080o oVar = new C14080o(context);
        C13222b a = C13222b.m33316a(context);
        CreditCard v2 = m45720v2(aVar);
        BillingAddress u2 = m45719u2(address);
        a.mo40092b(str, str2, str3, oVar);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a.f32798c.mo11669f(str4, new C13225c(taskCompletionSource));
        return taskCompletionSource.getTask().onSuccessTask(AsyncTask.THREAD_POOL_EXECUTOR, new C13533e(a, 16)).onSuccessTask(AsyncTask.THREAD_POOL_EXECUTOR, new C7038d0(a, 21)).onSuccessTask(AsyncTask.THREAD_POOL_EXECUTOR, new C5788g(a, v2, u2)).onSuccessTask(MoovitExecutors.COMPUTATION, new C0111k(5));
    }

    /* renamed from: t2 */
    public final Task<CreditCardToken> mo50791t2(Context context, String str, C7959a aVar, Map<String, String> map) {
        String str2 = map.get("TPEnvironment");
        if (str2 == null) {
            return Tasks.forException(new RuntimeException("Environment not provided!"));
        }
        String str3 = map.get("umoClientId");
        if (C20964s0.m49090h(str3)) {
            return Tasks.forException(new RuntimeException("Cubic client id not provided!"));
        }
        String str4 = map.get("umoClientSecret");
        if (C20964s0.m49090h(str4)) {
            return Tasks.forException(new RuntimeException("Cubic client secret not provided!"));
        }
        String str5 = map.get("agencyId");
        if (C20964s0.m49090h(str5)) {
            return Tasks.forException(new RuntimeException("Cubic agency id not provided!"));
        }
        Address address = aVar.f24101j;
        if (address == null) {
            return Tasks.forException(new RuntimeException("Billing address not provided!"));
        }
        C14080o oVar = new C14080o(context);
        C13222b a = C13222b.m33316a(context);
        CreditCard v2 = m45720v2(aVar);
        BillingAddress u2 = m45719u2(address);
        a.mo40092b(str2, str3, str4, oVar);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a.f32798c.mo11669f(str5, new C13225c(taskCompletionSource));
        return taskCompletionSource.getTask().onSuccessTask(AsyncTask.THREAD_POOL_EXECUTOR, new C5789h(2, a, v2, u2)).onSuccessTask(MoovitExecutors.COMPUTATION, new C1832r(7));
    }
}
