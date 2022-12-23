package com.moovit.app.surveys;

import android.content.DialogInterface;
import android.os.Bundle;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.MoovitAppApplication;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p646lz.C18299a;
import p646lz.C18304b;

public class SurveyContainerActivity extends MoovitAppActivity implements DialogInterface.OnDismissListener {

    /* renamed from: U */
    public static final /* synthetic */ int f39827U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        Set<String> s1 = super.mo19438s1();
        C18299a aVar = MoovitAppApplication.m37038x().f37321e;
        Iterator it = ((HashSet) s1).iterator();
        while (it.hasNext()) {
            aVar.mo50698j((String) it.next(), (C18304b) null, true);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        finish();
    }

    /* renamed from: r2 */
    public final void mo19769r2() {
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.clear();
        hashSet.add("USER_CONTEXT");
        return s1;
    }
}
