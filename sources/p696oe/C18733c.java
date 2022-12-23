package p696oe;

import android.content.SharedPreferences;
import com.amazonaws.http.HttpHeader;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.C14454a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;
import p069e3.C4544g;
import p208p6.C6094b;
import p406cg.C13815e;
import p609km.C18097c;
import p625le.C18199a;

/* renamed from: oe.c */
public final class C18733c implements SuccessContinuation<Void, Void> {

    /* renamed from: b */
    public final /* synthetic */ C14454a f47648b;

    public C18733c(C14454a aVar) {
        this.f47648b = aVar;
    }

    public final Task then(Object obj) throws Exception {
        JSONObject jSONObject;
        C18735e eVar;
        FileWriter fileWriter;
        Void voidR = (Void) obj;
        C14454a aVar = this.f47648b;
        C6094b bVar = aVar.f36508f;
        C18737g gVar = aVar.f36504b;
        bVar.getClass();
        FileWriter fileWriter2 = null;
        try {
            HashMap c = C6094b.m14629c(gVar);
            ((C13815e) bVar.f19355c).getClass();
            C18199a aVar2 = new C18199a((String) bVar.f19354b, c);
            aVar2.f46449c.put(HttpHeader.USER_AGENT, "Crashlytics Android SDK/18.2.13");
            aVar2.f46449c.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            C6094b.m14627a(aVar2, gVar);
            ((C18097c) bVar.f19356d).getClass();
            c.toString();
            ((C18097c) bVar.f19356d).getClass();
            jSONObject = bVar.mo22064d(aVar2.mo50609b());
        } catch (IOException unused) {
            ((C18097c) bVar.f19356d).getClass();
            jSONObject = null;
        }
        if (jSONObject != null) {
            C18734d dVar = this.f47648b.f36505c;
            dVar.getClass();
            if (jSONObject.getInt("settings_version") != 3) {
                eVar = new C18729a();
            } else {
                eVar = new C18738h();
            }
            C18730b a = eVar.mo51094a(dVar.f47649a, jSONObject);
            C4544g gVar2 = this.f47648b.f36507e;
            long j = a.f47641c;
            gVar2.getClass();
            try {
                jSONObject.put("expires_at", j);
                fileWriter = new FileWriter((File) gVar2.f15660c);
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    CommonUtils.m35963a(fileWriter2);
                    throw th;
                }
            } catch (Exception unused3) {
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.m35963a(fileWriter2);
                throw th;
            }
            CommonUtils.m35963a(fileWriter);
            this.f47648b.getClass();
            jSONObject.toString();
            C14454a aVar3 = this.f47648b;
            String str = aVar3.f36504b.f47655f;
            SharedPreferences.Editor edit = aVar3.f36503a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit.putString("existing_instance_identifier", str);
            edit.apply();
            this.f47648b.f36510h.set(a);
            this.f47648b.f36511i.get().trySetResult(a);
        }
        return Tasks.forResult(null);
    }
}
