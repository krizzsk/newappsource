package p145k5;

import aa0.C7530f;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.location.Location;
import com.appboy.Appboy;
import com.google.android.gms.wallet.WalletConstants;
import com.moovit.app.tod.shuttle.model.TodShuttleStop;
import com.moovit.app.tod.shuttle.model.TodShuttleTrip;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.moovit.payment.clearance.model.ClearanceProviderInstructions;
import e50.C25719a;
import e50.C25720b;
import java.util.List;
import java.util.concurrent.Callable;
import m60.C18341a;
import org.json.JSONObject;
import p484ff.C16958a0;
import p484ff.C16980j0;
import p484ff.C16981k;
import p644lx.C18289f;
import p874vr.C20199a;
import q00.C19047a;
import w40.C25761d;

/* renamed from: k5.f */
public final /* synthetic */ class C5487f implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f18017b;

    /* renamed from: c */
    public final /* synthetic */ Object f18018c;

    /* renamed from: d */
    public final /* synthetic */ Object f18019d;

    public /* synthetic */ C5487f(int i, Object obj, Object obj2) {
        this.f18017b = i;
        this.f18018c = obj;
        this.f18019d = obj2;
    }

    public final Object call() {
        ComponentName componentName;
        int i = -1;
        String str = null;
        switch (this.f18017b) {
            case 0:
                return ((Appboy) this.f18018c).m5380a((JSONObject) this.f18019d);
            case 1:
                Context context = (Context) this.f18018c;
                Object obj = C16981k.f44081c;
                C16958a0 a = C16958a0.m42795a();
                a.f44018d.offer((Intent) this.f18019d);
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(context.getPackageName());
                synchronized (a) {
                    String str2 = a.f44015a;
                    if (str2 != null) {
                        str = str2;
                    } else {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
                        if (resolveService != null) {
                            ServiceInfo serviceInfo = resolveService.serviceInfo;
                            if (serviceInfo != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName)) {
                                    String str3 = serviceInfo.name;
                                    if (str3 != null) {
                                        if (str3.startsWith(".")) {
                                            a.f44015a = context.getPackageName() + serviceInfo.name;
                                        } else {
                                            a.f44015a = serviceInfo.name;
                                        }
                                        str = a.f44015a;
                                    }
                                }
                            }
                        }
                    }
                }
                if (str != null) {
                    intent.setClassName(context.getPackageName(), str);
                }
                try {
                    if (a.mo49582c(context)) {
                        componentName = C16980j0.m42819b(context, intent);
                    } else {
                        componentName = context.startService(intent);
                    }
                    if (componentName == null) {
                        i = WalletConstants.ERROR_CODE_INVALID_PARAMETERS;
                    }
                } catch (SecurityException unused) {
                    i = 401;
                } catch (IllegalStateException e) {
                    e.toString();
                    i = WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE;
                }
                return Integer.valueOf(i);
            case 2:
                C18289f fVar = (C18289f) this.f18018c;
                C19047a aVar = (C19047a) this.f18019d;
                TodShuttleTrip todShuttleTrip = fVar.f46628t;
                Location O1 = fVar.mo46780O1();
                if (O1 != null) {
                    List<TodShuttleStop> list = todShuttleTrip.f40432c.f40420d;
                    int intValue = ((Integer) aVar.mo51505b(C20199a.f51259U0)).intValue();
                    float f = Float.MAX_VALUE;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        float d = list.get(i2).f40428c.mo46918d(O1);
                        if (d <= ((float) intValue) && d < f) {
                            i = i2;
                            f = d;
                        }
                    }
                }
                return Integer.valueOf(i);
            case 3:
                int i3 = TripPlannerActivity.f40505q0;
                return C7530f.m17268a((LatLonE6) this.f18018c, (LatLonE6) this.f18019d);
            default:
                C18341a aVar2 = (C18341a) this.f18018c;
                PaymentMethodToken paymentMethodToken = (PaymentMethodToken) this.f18019d;
                CreditCardRequest creditCardRequest = aVar2.f46768n;
                if (paymentMethodToken == null) {
                    C25761d.m64299a().mo83591f();
                    return null;
                }
                ClearanceProviderInstructions clearanceProviderInstructions = creditCardRequest.f42590b.f42774c;
                return ((C25720b) new C25719a(aVar2.mo46783R1(), clearanceProviderInstructions.f42605c, paymentMethodToken, creditCardRequest.f42593e, creditCardRequest.f42590b.f42773b).mo52626J()).f64150m;
        }
    }
}
