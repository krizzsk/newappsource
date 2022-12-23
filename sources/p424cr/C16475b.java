package p424cr;

import android.content.Context;
import android.content.Intent;
import com.moovit.app.appwidgets.FavoritesWidget;
import com.moovit.app.appwidgets.MoovitWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p172m9.C5720b;

/* renamed from: cr.b */
public final class C16475b {

    /* renamed from: c */
    public static WeakHashMap<Context, C16475b> f43069c = new WeakHashMap<>();

    /* renamed from: a */
    public WeakReference<Context> f43070a;

    /* renamed from: b */
    public ArrayList f43071b;

    public C16475b(Context context) {
        this.f43070a = new WeakReference<>(context);
        ArrayList arrayList = new ArrayList();
        this.f43071b = arrayList;
        arrayList.add(FavoritesWidget.class);
    }

    /* renamed from: a */
    public static synchronized C16475b m41968a(Context context) {
        C16475b bVar;
        synchronized (C16475b.class) {
            bVar = f43069c.get(context);
            if (bVar == null) {
                bVar = new C16475b(context);
                f43069c.put(context, bVar);
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public final void mo49293b() {
        Iterator it = this.f43071b.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            Intent intent = new Intent(this.f43070a.get(), cls);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", C5720b.m14066q(this.f43070a.get(), cls));
            this.f43070a.get().sendBroadcast(intent);
        }
    }

    /* renamed from: c */
    public final void mo49294c() {
        Iterator it = this.f43071b.iterator();
        while (it.hasNext()) {
            try {
                ((MoovitWidget) ((Class) it.next()).newInstance()).mo44778d();
            } catch (Exception unused) {
            }
        }
    }
}
