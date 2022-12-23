package com.moovit.dynamiclink;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import c10.C13740a;
import c10.C13741b;
import c10.C13742c;
import c10.C13743d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p067e1.C4503l0;
import p090g1.C4732a;
import p578jf.C17843u;
import p578jf.C17844v;
import p824tp.C19731i;
import p977zz.C20975x0;

public class DynamicLinkActivity extends AppCompatActivity {

    /* renamed from: x */
    public static final long f41471x = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: y */
    public static final /* synthetic */ int f41472y = 0;

    /* renamed from: b1 */
    public final void mo47919b1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Intent.makeMainActivity(C19731i.m47197a(this).f50171a.f50151b));
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(this, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                startActivity(intent);
            }
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: d1 */
    public final void mo47920d1(C13740a aVar) {
        Intent intent;
        if (!isFinishing()) {
            if (aVar == null) {
                mo47919b1();
                return;
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", aVar.f33814b);
            intent2.setPackage(getPackageName());
            ComponentName resolveActivity = intent2.resolveActivity(getPackageManager());
            if (resolveActivity == null) {
                intent = null;
            } else {
                intent = intent2.setComponent(resolveActivity);
            }
            if (intent == null) {
                mo47919b1();
                return;
            }
            if (Boolean.TRUE.equals(Boolean.valueOf(aVar.f33813a))) {
                C19731i.m47197a(this).f50172b.mo42913b(new C13741b(this, aVar.f33814b.toString(), System.currentTimeMillis()), true);
            }
            C4503l0 l0Var = new C4503l0(this);
            ComponentName componentName = C19731i.m47197a(this).f50171a.f50151b;
            if (!C20975x0.m49118e(intent.getComponent(), componentName)) {
                l0Var.mo20021a(Intent.makeMainActivity(componentName));
            }
            l0Var.mo20021a(intent);
            l0Var.mo20024e();
            finish();
            overridePendingTransition(0, 0);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13743d dVar = C13743d.f33820d;
        long j = f41471x;
        dVar.getClass();
        Tasks.call(MoovitExecutors.COMPUTATION, new C13742c(dVar, j)).addOnSuccessListener((Activity) this, new C17843u(this, 6)).addOnFailureListener((Activity) this, (OnFailureListener) new C17844v(this, 3));
    }
}
