package p067e1;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import p090g1.C4732a;

/* renamed from: e1.l0 */
public final class C4503l0 implements Iterable<Intent> {

    /* renamed from: b */
    public final ArrayList<Intent> f15585b = new ArrayList<>();

    /* renamed from: c */
    public final Context f15586c;

    /* renamed from: e1.l0$a */
    public static class C4504a {
        /* renamed from: a */
        public static PendingIntent m11737a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    /* renamed from: e1.l0$b */
    public interface C4505b {
        Intent getSupportParentActivityIntent();
    }

    public C4503l0(Context context) {
        this.f15586c = context;
    }

    /* renamed from: a */
    public final void mo20021a(Intent intent) {
        this.f15585b.add(intent);
    }

    /* renamed from: b */
    public final void mo20022b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f15586c.getPackageManager());
        }
        if (component != null) {
            mo20023d(component);
        }
        mo20021a(intent);
    }

    /* renamed from: d */
    public final void mo20023d(ComponentName componentName) {
        int size = this.f15585b.size();
        try {
            Intent b = C4506m.m11739b(this.f15586c, componentName);
            while (b != null) {
                this.f15585b.add(size, b);
                b = C4506m.m11739b(this.f15586c, b.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: e */
    public final void mo20024e() {
        if (!this.f15585b.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f15585b.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(this.f15586c, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f15586c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f15585b.iterator();
    }
}
