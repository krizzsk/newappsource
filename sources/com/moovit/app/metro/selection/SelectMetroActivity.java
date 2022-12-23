package com.moovit.app.metro.selection;

import android.content.Intent;
import com.moovit.metro.selection.MetroArea;
import java.util.HashSet;
import java.util.Set;

public class SelectMetroActivity extends MetroListActivity {

    /* renamed from: p0 */
    public static final /* synthetic */ int f38970p0 = 0;

    /* renamed from: M1 */
    public final void mo44510M1() {
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.clear();
        hashSet.add("SUPPORTED_METROS");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45520y2(MetroArea metroArea) {
        Intent intent = new Intent();
        intent.putExtra("selected_metro", metroArea);
        setResult(-1, intent);
        finish();
    }
}
