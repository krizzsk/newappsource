package p358af;

import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0592p;
import androidx.camera.core.impl.Config;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.impl.ImageReaderProxy;
import java.util.List;
import java.util.Set;
import mf0.C24362h;
import oh0.C24618g;
import p032c0.C1754d;
import p404ce.C13791f;
import p404ce.C13806s;
import p584jl.C17885a;
import vi0.C25121g;

/* renamed from: af.d */
public final /* synthetic */ class C13437d implements C13791f, ImageReaderProxy.OnImageAvailableListener, Continuation {
    /* renamed from: a */
    public static boolean m33696a(C0592p pVar, C0572a aVar) {
        return pVar.getConfig().mo2425e(aVar);
    }

    /* renamed from: b */
    public static void m33697b(C0592p pVar, C1754d dVar) {
        pVar.getConfig().mo2430l(dVar);
    }

    /* renamed from: c */
    public static Set m33698c(C0592p pVar) {
        return pVar.getConfig().listOptions();
    }

    /* renamed from: d */
    public static Object m33699d(C0592p pVar, Config.C0564a aVar) {
        return pVar.getConfig().mo2422a(aVar);
    }

    /* renamed from: e */
    public static Object m33700e(C0592p pVar, Config.C0564a aVar, Object obj) {
        return pVar.getConfig().mo2423b(aVar, obj);
    }

    /* renamed from: f */
    public static int m33701f(int i, List list, int i2, int i3) {
        list.add(Integer.valueOf(i));
        return i2 + i3;
    }

    /* renamed from: g */
    public static MVMissingPaymentRegistrationSteps m33702g(C25121g gVar) {
        MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
        mVMissingPaymentRegistrationSteps.mo25201C1(gVar);
        return mVMissingPaymentRegistrationSteps;
    }

    /* renamed from: h */
    public static String m33703h(int i, String str) {
        return C17885a.m44405I0(new StringBuilder(i), str);
    }

    /* renamed from: i */
    public static String m33704i(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.mo4684z());
        return sb.toString();
    }

    /* renamed from: j */
    public static String m33705j(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getSimpleName());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: k */
    public static String m33706k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: l */
    public static String m33707l(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: n */
    public static StringBuilder m33708n(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    /* renamed from: o */
    public static StringBuilder m33709o(String str, C24618g gVar, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(gVar);
        sb.append(str2);
        return sb;
    }

    /* renamed from: p */
    public static void m33710p(zzfy zzfy, String str) {
        zzfy.zzay().zzj().zza(str);
    }

    /* renamed from: q */
    public static void m33711q(String str, String str2, String str3, String str4, String str5, String str6) {
        C24362h.m61211f(str, str2);
        C24362h.m61211f(str3, str4);
        C24362h.m61211f(str5, str6);
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(sVar);
    }

    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        ImageCapture.lambda$new$0(imageReaderProxy);
    }

    public Object then(Task task) {
        return 403;
    }
}
