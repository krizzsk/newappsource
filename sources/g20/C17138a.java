package g20;

import a00.C13382a;
import android.content.Context;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import p824tp.C19746x;

/* renamed from: g20.a */
public final class C17138a<O> extends C17142d<O, CharSequence> {

    /* renamed from: b */
    public final C17142d<O, CharSequence> f44368b;

    /* renamed from: c */
    public final C17142d<O, String> f44369c;

    /* renamed from: d */
    public final C17142d<O, CharSequence> f44370d;

    public C17138a(C17145e eVar, C17145e eVar2, C17141c cVar) {
        this.f44368b = eVar;
        this.f44369c = eVar2;
        this.f44370d = cVar;
    }

    /* renamed from: a */
    public final Object mo49725a(Context context, Object obj) {
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        CharSequence b = this.f44368b.mo49727b(context, obj);
        String b2 = this.f44369c.mo49727b(context, obj);
        CharSequence b3 = this.f44370d.mo49727b(context, obj);
        if (!TextUtils.isEmpty(b)) {
            C13382a.m33666b(sb, context.getString(C19746x.voice_over_line, new Object[]{b}));
            z = true;
        } else {
            z = false;
        }
        if (!TextUtils.isEmpty(b2)) {
            if (z) {
                C13382a.m33666b(sb, context.getString(C19746x.voice_over_towards, new Object[]{b2}));
            } else {
                C13382a.m33666b(sb, context.getString(C19746x.voice_over_line, new Object[]{b2}));
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (!TextUtils.isEmpty(b3)) {
            if (z) {
                sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                if (z2) {
                    C13382a.m33666b(sb, b3);
                } else {
                    C13382a.m33666b(sb, context.getString(C19746x.voice_over_towards, new Object[]{b3}));
                }
            } else {
                if (z2) {
                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
                C13382a.m33666b(sb, b3);
            }
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("(icon = ");
        k.append(this.f44368b);
        k.append(" title = ");
        k.append(this.f44369c);
        k.append(" sub-title = ");
        k.append(this.f44370d);
        k.append(")");
        return k.toString();
    }
}
