package androidx.viewpager2.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.cubic.umo.Environment;
import com.google.android.play.core.appupdate.C14228f;
import com.google.android.play.core.appupdate.C14229g;
import com.google.android.play.core.appupdate.C14232j;
import com.google.android.play.core.appupdate.C14238p;
import com.moovit.view.pickers.WheelView;
import ia0.C12763a;
import ia0.C12764b;
import java.util.LinkedList;
import java.util.List;
import kj0.C23811f;
import mf0.C24362h;
import p434dd.C16552f0;
import p584jl.C17885a;

/* renamed from: androidx.viewpager2.widget.d */
public final class C1373d implements C16552f0, C23811f {

    /* renamed from: b */
    public Object f5105b;

    /* renamed from: c */
    public Object f5106c;

    /* renamed from: d */
    public Object f5107d;

    public /* synthetic */ C1373d(Object obj, Object obj2, Object obj3) {
        this.f5105b = obj;
        this.f5106c = obj2;
        this.f5107d = obj3;
    }

    /* renamed from: a */
    public final boolean mo5645a() {
        return true;
    }

    /* renamed from: b */
    public final int mo5646b(LinearLayout linearLayout, int i, C12764b bVar) {
        boolean z;
        int i2 = i;
        int i3 = 0;
        while (i3 < linearLayout.getChildCount()) {
            int i4 = bVar.f31535a;
            if (i2 < i4 || i2 > (i4 + bVar.f31536b) - 1) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                View childAt = linearLayout.getChildAt(i3);
                int a = ((C12763a) ((WheelView) this.f5107d).getViewAdapter()).mo39614a();
                if ((i2 < 0 || i2 >= a) && !((WheelView) this.f5107d).f24130i) {
                    List list = (List) this.f5106c;
                    if (list == null) {
                        list = new LinkedList();
                    }
                    list.add(childAt);
                    this.f5106c = list;
                } else {
                    int i5 = i2;
                    while (i5 < 0) {
                        i5 += a;
                    }
                    int i6 = i5 % a;
                    List list2 = (List) this.f5105b;
                    if (list2 == null) {
                        list2 = new LinkedList();
                    }
                    list2.add(childAt);
                    this.f5105b = list2;
                }
                linearLayout.removeViewAt(i3);
                if (i3 == 0) {
                    i++;
                }
            } else {
                i3++;
            }
            i2++;
        }
        return i;
    }

    public final int getLength() {
        return 0;
    }

    public final Class getType() {
        Object obj = this.f5106c;
        if (obj != null) {
            return obj.getClass();
        }
        return (Class) this.f5107d;
    }

    public final Object getValue() {
        return this.f5106c;
    }

    public final void setValue(Object obj) {
        Object obj2 = this.f5105b;
        if (((C23811f) obj2) != null) {
            ((C23811f) obj2).setValue(obj);
        }
        this.f5106c = obj;
    }

    public final Object zza() {
        Object zza = ((C16552f0) this.f5105b).zza();
        Context context = (Context) ((C14232j) ((C16552f0) this.f5107d)).f35765b.f35762a;
        C17885a.m44409K0(context);
        return new C14229g((C14238p) zza, (C14228f) ((C16552f0) this.f5106c).zza(), context);
    }

    public /* synthetic */ C1373d() {
        this.f5105b = "<!DOCTYPE html><html style=\"height: 100%\"><head><title>Default</title></head><body style=\"min-height: 100%; margin: 0; background-size: 50% auto; background-repeat: no-repeat; background-position: center; background-image:url(justride-logo.png)\"></body></html>";
        this.f5106c = "file:///android_asset/";
        this.f5107d = 150;
    }

    public /* synthetic */ C1373d(WheelView wheelView) {
        this.f5107d = wheelView;
    }

    public /* synthetic */ C1373d(Environment environment) {
        this.f5105b = environment;
        this.f5106c = C24362h.m61216k("api/pass/rest/v1/", environment.getBaseUrl());
        this.f5107d = C24362h.m61216k("api/pass/media?id=", ((Environment) this.f5105b).getBaseUrl());
    }
}
