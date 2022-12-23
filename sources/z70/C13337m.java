package z70;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import p543hq.C17474b;
import p977zz.C20964s0;
import p977zz.C20975x0;

/* renamed from: z70.m */
public final class C13337m extends RecyclerView.C1142q {

    /* renamed from: a */
    public String f33107a = "";

    /* renamed from: b */
    public int f33108b = -1;

    /* renamed from: c */
    public Map<AnalyticsAttributeKey, String> f33109c;

    /* renamed from: d */
    public int f33110d = 0;

    /* renamed from: e */
    public int f33111e = 0;

    /* renamed from: f */
    public int f33112f = 0;

    /* renamed from: g */
    public int f33113g = 0;

    /* renamed from: h */
    public boolean f33114h = false;

    /* renamed from: i */
    public boolean f33115i = false;

    /* renamed from: j */
    public final TreeSet f33116j = new TreeSet();

    /* renamed from: a */
    public final void mo4913a(int i, RecyclerView recyclerView) {
        if (!this.f33114h) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            this.f33114h = z;
        }
    }

    /* renamed from: c */
    public final C17474b mo40228c() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SEARCH_BOX);
        aVar.mo49935c(AnalyticsAttributeKey.COUNT, this.f33110d);
        aVar.mo49935c(AnalyticsAttributeKey.BACKSPACES_COUNT, this.f33111e);
        aVar.mo49935c(AnalyticsAttributeKey.CLEAR_TEXT_COUNT, this.f33112f);
        aVar.mo49935c(AnalyticsAttributeKey.MAX, this.f33113g);
        aVar.mo49939g(AnalyticsAttributeKey.QUERY_STRING, this.f33107a);
        aVar.mo49935c(AnalyticsAttributeKey.NUMBER_OF_RESULTS, this.f33108b);
        aVar.mo49941i(AnalyticsAttributeKey.IS_SCROLLED, this.f33114h);
        aVar.mo49941i(AnalyticsAttributeKey.IS_USER_VISIBLE, this.f33115i);
        aVar.mo49939g(AnalyticsAttributeKey.TAGS, C20964s0.m49100r(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, this.f33116j));
        Map<AnalyticsAttributeKey, String> map = this.f33109c;
        if (map != null) {
            aVar.f44998b.putAll(map);
        }
        C17474b a = aVar.mo49933a();
        this.f33107a = "";
        this.f33108b = -1;
        this.f33109c = null;
        this.f33110d = 0;
        this.f33111e = 0;
        this.f33112f = 0;
        this.f33113g = 0;
        this.f33114h = false;
        this.f33116j.clear();
        return a;
    }

    /* renamed from: d */
    public final void mo40229d(CharSequence charSequence) {
        String str;
        boolean z;
        if (charSequence != null) {
            str = charSequence.toString().trim();
        } else {
            str = "";
        }
        if (!this.f33107a.equals(str)) {
            String str2 = this.f33107a;
            this.f33110d++;
            boolean z2 = false;
            if (str2.length() != str.length() + 1 || !str2.startsWith(str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f33111e++;
            }
            if (str.isEmpty() && str2.length() > 1) {
                z2 = true;
            }
            if (z2) {
                this.f33112f++;
            }
        }
        this.f33107a = str;
        this.f33108b = -1;
        this.f33109c = null;
        this.f33113g = Math.max(this.f33113g, str.length());
    }

    /* renamed from: e */
    public final void mo40230e(String str, int i, Map<AnalyticsAttributeKey, String> map, Set<String> set) {
        if (C20975x0.m49118e(this.f33107a, str)) {
            this.f33108b = i;
            this.f33109c = map;
            if (set != null) {
                this.f33116j.addAll(set);
            }
        }
    }

    /* renamed from: f */
    public final void mo40231f(CharSequence charSequence) {
        String str;
        if (charSequence != null) {
            str = charSequence.toString().trim();
        } else {
            str = "";
        }
        this.f33107a = str;
        this.f33108b = -1;
        this.f33109c = null;
        this.f33113g = Math.max(this.f33113g, str.length());
    }
}
