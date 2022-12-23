package p528gz;

import android.content.SharedPreferences;
import com.braze.BrazeUser;
import com.moovit.MoovitApplication;
import com.moovit.appdata.UserContextLoader;
import f30.C4676c;
import g30.C4776h;
import p528gz.C17272g;
import p646lz.C18299a;
import p824tp.C19722a0;
import p824tp.C19728f;
import p977zz.C20975x0;

/* renamed from: gz.i */
public class C17290i extends C17289h {
    public C17290i(MoovitApplication<?, ?, ?> moovitApplication) {
        super(moovitApplication);
    }

    /* renamed from: b */
    public void onSuccess(C17272g.C17277e eVar) {
        C19722a0 a0Var;
        MoovitApplication<?, ?, ?> moovitApplication = this.f44667b;
        C18299a aVar = moovitApplication.f37321e;
        if (UserContextLoader.m40004l(moovitApplication)) {
            a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
        } else {
            a0Var = null;
        }
        if (a0Var != null) {
            MoovitApplication moovitApplication2 = this.f44667b;
            C17272g.C17274b bVar = C17272g.f44642b;
            String str = a0Var.f50160a.f32925a;
            SharedPreferences sharedPreferences = eVar.f44662a;
            if (eVar.f44664c == null) {
                eVar.f44664c = sharedPreferences.edit();
            }
            SharedPreferences.Editor editor = eVar.f44664c;
            BrazeUser brazeUser = eVar.f44663b;
            if (!C20975x0.m49118e(sharedPreferences.getString(bVar.f44660b, (String) null), str) && brazeUser.addAlias(str, bVar.f44659a)) {
                editor.putString(bVar.f44660b, str);
            }
            eVar.mo49818a(C17272g.f44643c, a0Var.f50160a.f32925a);
            eVar.mo49818a(C17272g.f44644d, Integer.valueOf(a0Var.f50160a.f32926b));
            eVar.mo49818a(C17272g.f44647g, moovitApplication2.mo44558j().f50171a.f50152c);
            eVar.mo49818a(C17272g.f44648h, Long.valueOf(C4676c.m11987a().f15926d));
        }
        C19728f fVar = (C19728f) aVar.mo50695h("METRO_CONTEXT", false);
        if (fVar != null) {
            C4776h hVar = fVar.f50165a;
            eVar.mo49818a(C17272g.f44645e, Integer.valueOf(hVar.f16126a.f15142b));
            eVar.mo49818a(C17272g.f44646f, hVar.f16129d);
            eVar.mo49818a(C17272g.f44649i, Integer.valueOf(hVar.f16140o.f15142b));
        }
    }
}
