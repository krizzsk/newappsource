package p009a8;

import com.facebook.GraphRequest;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import mf0.C24362h;

/* renamed from: a8.r */
public final class C0119r implements GraphRequest.C2283e {

    /* renamed from: a */
    public final /* synthetic */ ArrayList<String> f354a;

    public C0119r(ArrayList<String> arrayList) {
        this.f354a = arrayList;
    }

    /* renamed from: a */
    public final void mo261a(String str, String str2) throws IOException {
        C24362h.m61211f(str2, "value");
        ArrayList<String> arrayList = this.f354a;
        String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(str2, "UTF-8")}, 2));
        C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
        arrayList.add(format);
    }
}
