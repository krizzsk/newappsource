package p069e3;

import android.content.res.Resources;
import java.io.File;
import java.lang.annotation.Annotation;
import kj0.C23810e;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p025b6.C1492e;
import p060d6.C4397l;
import p146k6.C5512q;
import p208p6.C6095c;
import p648me.C18365c;
import yi0.C25328a;

/* renamed from: e3.g */
public final class C4544g implements C4543f, C6095c, C23810e {

    /* renamed from: b */
    public final /* synthetic */ int f15659b;

    /* renamed from: c */
    public final Object f15660c;

    public /* synthetic */ C4544g(Object obj, int i) {
        this.f15659b = i;
        this.f15660c = obj;
    }

    /* renamed from: d */
    public final String[] mo20045d() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f15660c).getSupportedFeatures();
    }

    public final Annotation getAnnotation(Class cls) {
        return null;
    }

    public final Class getType() {
        return (Class) this.f15660c;
    }

    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C25328a.m63628a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f15660c).getWebkitToCompatConverter());
    }

    /* renamed from: h */
    public final C4397l mo20049h(C4397l lVar, C1492e eVar) {
        Resources resources = (Resources) this.f15660c;
        if (lVar == null) {
            return null;
        }
        return new C5512q(resources, lVar);
    }

    public final String toString() {
        switch (this.f15659b) {
            case 6:
                return ((Class) this.f15660c).toString();
            default:
                return super.toString();
        }
    }

    public C4544g(C18365c cVar) {
        this.f15659b = 2;
        this.f15660c = new File(cVar.f46821b, "com.crashlytics.settings.json");
    }

    public C4544g(Resources resources) {
        this.f15659b = 1;
        this.f15660c = resources;
    }
}
