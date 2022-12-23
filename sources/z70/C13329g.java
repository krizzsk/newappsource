package z70;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.view.View;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.search.C7604a;
import com.moovit.search.C7606b;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p241s0.C6306f;
import p543hq.C17474b;
import p977zz.C20936e0;
import p977zz.C20964s0;

/* renamed from: z70.g */
public final class C13329g {

    /* renamed from: a */
    public static final StyleSpan f33089a = new StyleSpan(1);

    /* renamed from: b */
    public static final C6306f<String, Pattern> f33090b = new C6306f<>(10);

    /* renamed from: z70.g$a */
    public static class C13330a implements View.OnClickListener {

        /* renamed from: b */
        public final C7604a<?> f33091b;

        /* renamed from: c */
        public final WeakReference<SearchLocationActivity> f33092c;

        /* renamed from: d */
        public final List<C13321a> f33093d;

        public C13330a(C7604a aVar, WeakReference weakReference, ArrayList arrayList) {
            C21100e.m49373x(aVar, "provider");
            this.f33091b = aVar;
            C21100e.m49373x(weakReference, "hostRef");
            this.f33092c = weakReference;
            this.f33093d = arrayList;
        }

        public final void onClick(View view) {
            SearchLocationActivity searchLocationActivity = this.f33092c.get();
            if (searchLocationActivity != null) {
                C7604a<?> aVar = this.f33091b;
                List<C13321a> list = this.f33093d;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "show_on_map_clicked");
                searchLocationActivity.mo44545v2(aVar2.mo49933a());
                C13334k kVar = searchLocationActivity.f23131r0;
                if (kVar != null) {
                    kVar.cancel(false);
                    searchLocationActivity.f23131r0 = null;
                }
                C13334k kVar2 = new C13334k(searchLocationActivity, aVar, list);
                kVar2.executeOnExecutor(C7606b.f23156p, new Void[0]);
                searchLocationActivity.f23131r0 = kVar2;
            }
        }
    }

    /* renamed from: a */
    public static Map<LocationDescriptor, Integer> m33602a(List<LocationDescriptor> list, LatLonE6 latLonE6) {
        if (latLonE6 == null || C13717b.m34258e(list)) {
            return Collections.emptyMap();
        }
        IdentityHashMap identityHashMap = new IdentityHashMap(list.size());
        for (LocationDescriptor next : list) {
            LatLonE6 d = next.mo24310d();
            if (d != null) {
                identityHashMap.put(next, Integer.valueOf(Math.round(LatLonE6.m40174c(latLonE6, d))));
            }
        }
        return identityHashMap;
    }

    /* renamed from: b */
    public static String m33603b(LatLonE6 latLonE6) {
        int c = C20936e0.m49037c(latLonE6.f40980b, 1000);
        int c2 = C20936e0.m49037c(latLonE6.f40981c, 1000);
        return c + "_" + c2;
    }

    /* renamed from: c */
    public static CharSequence m33604c(CharSequence charSequence, String str) {
        if (C20964s0.m49090h(charSequence)) {
            return charSequence;
        }
        Pattern pattern = null;
        if (!C20964s0.m49090h(str)) {
            Pattern pattern2 = f33090b.get(str);
            if (pattern2 == null) {
                try {
                    pattern = Pattern.compile(str, 82);
                } catch (Throwable unused) {
                }
                if (pattern != null) {
                    f33090b.put(str, pattern);
                }
            } else {
                pattern = pattern2;
            }
        }
        if (pattern == null) {
            return charSequence;
        }
        Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.find()) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(CharacterStyle.wrap(f33089a), matcher.start(), matcher.end(), 33);
        return spannableString;
    }
}
