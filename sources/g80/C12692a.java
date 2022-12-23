package g80;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import c00.C13717b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.ResourceImage;
import com.moovit.search.C7604a;
import com.moovit.search.SearchAction;
import com.moovit.search.specialactions.SearchLocationSpecialActions;
import com.moovit.transit.LocationDescriptor;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19746x;
import p977zz.C20944i0;
import p977zz.C20964s0;
import z70.C13321a;
import z70.C13327e;

/* renamed from: g80.a */
public final class C12692a extends C7604a<SearchLocationSpecialActions> {

    /* renamed from: d */
    public final SearchLocationSpecialActions f31344d;

    public C12692a(Context context, SearchLocationSpecialActions searchLocationSpecialActions) {
        super(context, "special_actions");
        this.f31344d = searchLocationSpecialActions;
    }

    /* renamed from: i */
    public static C13327e m32433i(Context context, String str, String str2, SearchLocationSpecialActions searchLocationSpecialActions) {
        Context context2 = context;
        String str3 = str2;
        SearchLocationSpecialActions searchLocationSpecialActions2 = searchLocationSpecialActions;
        if (C13717b.m34258e(searchLocationSpecialActions2.f23182b)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(searchLocationSpecialActions2.f23182b.size());
        for (String next : searchLocationSpecialActions2.f23182b) {
            next.getClass();
            char c = 65535;
            switch (next.hashCode()) {
                case -415415205:
                    if (next.equals("deep_search")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1126443963:
                    if (next.equals("current_location")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1578960927:
                    if (next.equals("chose_on_map")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    String string = context2.getString(C19746x.search_for, new Object[]{str3});
                    int indexOf = string.indexOf(str3);
                    SpannableString spannableString = new SpannableString(string);
                    spannableString.setSpan(new StyleSpan(1), indexOf, str2.length() + indexOf, 33);
                    arrayList.add(new C13321a("special_actions", "deep_search", "deep_search", new ResourceImage(C19739q.ic_search_circle_36_critical, new String[0]), (CharSequence) spannableString, (String) null, (SearchAction) null, -1));
                    break;
                case 1:
                    ResourceImage resourceImage = new ResourceImage(C19739q.ic_navigation_24_primary, new String[0]);
                    String string2 = context2.getString(C19746x.current_location);
                    SpannableString spannableString2 = new SpannableString(string2);
                    spannableString2.setSpan(C20964s0.m49084b(context2, C19735m.textAppearanceBodyStrong, C19735m.colorPrimary), 0, string2.length(), 33);
                    arrayList.add(new C13321a("special_actions", "current_location", "current_location", resourceImage, (CharSequence) spannableString2, (String) null, (SearchAction) null, -1));
                    break;
                case 2:
                    ResourceImage resourceImage2 = new ResourceImage(C19739q.ic_map_24_primary, new String[0]);
                    String string3 = context2.getString(C19746x.choose_map);
                    SpannableString spannableString3 = new SpannableString(string3);
                    spannableString3.setSpan(C20964s0.m49084b(context2, C19735m.textAppearanceBodyStrong, C19735m.colorPrimary), 0, string3.length(), 33);
                    arrayList.add(new C13321a("special_actions", "chose_on_map", "chose_on_map", resourceImage2, (CharSequence) spannableString3, (String) null, (SearchAction) null, -1));
                    break;
            }
        }
        return new C13327e(str, (String) null, arrayList, (C20944i0) null, (View) null);
    }

    /* renamed from: a */
    public final String mo23775a(String str, LatLonE6 latLonE6) {
        return "special_actions";
    }

    /* renamed from: b */
    public final C13327e mo23836b(Context context, String str, String str2, Object obj) {
        return m32433i(context, str, str2, (SearchLocationSpecialActions) obj);
    }

    /* renamed from: c */
    public final Task mo23776c(ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6) {
        return Tasks.forResult(this.f31344d);
    }

    /* renamed from: d */
    public final Task mo23837d(ThreadPoolExecutor threadPoolExecutor, C13321a aVar) {
        String str = aVar.f33070b;
        str.getClass();
        if (str.equals("current_location")) {
            return Tasks.forResult(LocationDescriptor.m17772m(this.f23152a));
        }
        throw new IllegalStateException(C25541a.m63881k("Unsupported location descriptor for action: ", str));
    }

    /* renamed from: e */
    public final boolean mo23777e() {
        return false;
    }
}
