package p074e8;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import mf0.C24362h;
import p074e8.C4596a;
import p074e8.C4605d;
import p085f8.C4714d;
import p135j8.C5398d;
import p262t8.C6606a;

/* renamed from: e8.c */
public final class C4600c {

    /* renamed from: f */
    public static final C4601a f15809f = new C4601a();

    /* renamed from: g */
    public static C4600c f15810g;

    /* renamed from: a */
    public final Handler f15811a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Set<Activity> f15812b;

    /* renamed from: c */
    public final LinkedHashSet f15813c;

    /* renamed from: d */
    public HashSet<String> f15814d;

    /* renamed from: e */
    public final HashMap<Integer, HashSet<String>> f15815e;

    /* renamed from: e8.c$a */
    public static final class C4601a {
        /* renamed from: b */
        public static Bundle m11915b(EventBinding eventBinding, View view, View view2) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            Bundle bundle = new Bundle();
            if (eventBinding == null) {
                return bundle;
            }
            List<T> unmodifiableList = Collections.unmodifiableList(eventBinding.f8511c);
            C24362h.m61210e(unmodifiableList, "unmodifiableList(parameters)");
            for (T t : unmodifiableList) {
                String str = t.f15995b;
                if (str != null) {
                    if (str.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        bundle.putString(t.f15994a, t.f15995b);
                    }
                }
                if (t.f15996c.size() > 0) {
                    if (C24362h.m61206a(t.f15997d, "relative")) {
                        arrayList = C4603c.C4604a.m11922a(view2, t.f15996c, 0, -1, view2.getClass().getSimpleName());
                    } else {
                        arrayList = C4603c.C4604a.m11922a(view, t.f15996c, 0, -1, view.getClass().getSimpleName());
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C4602b bVar = (C4602b) it.next();
                        if (bVar.mo20124a() != null) {
                            C4714d dVar = C4714d.f16001a;
                            String i = C4714d.m12019i(bVar.mo20124a());
                            if (i.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                bundle.putString(t.f15994a, i);
                                break;
                            }
                        }
                    }
                }
            }
            return bundle;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0016 A[Catch:{ all -> 0x000f, all -> 0x002a }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[SYNTHETIC, Splitter:B:24:0x0033] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x003c A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x003e A[SYNTHETIC, Splitter:B:32:0x003e] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized p074e8.C4600c mo20123a() {
            /*
                r4 = this;
                java.lang.Class<e8.c> r0 = p074e8.C4600c.class
                monitor-enter(r4)
                boolean r1 = p262t8.C6606a.m15601b(r0)     // Catch:{ all -> 0x002a }
                r2 = 0
                if (r1 == 0) goto L_0x000c
            L_0x000a:
                r1 = r2
                goto L_0x0014
            L_0x000c:
                e8.c r1 = p074e8.C4600c.f15810g     // Catch:{ all -> 0x000f }
                goto L_0x0014
            L_0x000f:
                r1 = move-exception
                p262t8.C6606a.m15600a(r0, r1)     // Catch:{ all -> 0x002a }
                goto L_0x000a
            L_0x0014:
                if (r1 != 0) goto L_0x002c
                e8.c r1 = new e8.c     // Catch:{ all -> 0x002a }
                r1.<init>()     // Catch:{ all -> 0x002a }
                boolean r3 = p262t8.C6606a.m15601b(r0)     // Catch:{ all -> 0x002a }
                if (r3 == 0) goto L_0x0022
                goto L_0x002c
            L_0x0022:
                p074e8.C4600c.f15810g = r1     // Catch:{ all -> 0x0025 }
                goto L_0x002c
            L_0x0025:
                r1 = move-exception
                p262t8.C6606a.m15600a(r0, r1)     // Catch:{ all -> 0x002a }
                goto L_0x002c
            L_0x002a:
                r0 = move-exception
                goto L_0x0046
            L_0x002c:
                boolean r1 = p262t8.C6606a.m15601b(r0)     // Catch:{ all -> 0x002a }
                if (r1 == 0) goto L_0x0033
                goto L_0x003a
            L_0x0033:
                e8.c r2 = p074e8.C4600c.f15810g     // Catch:{ all -> 0x0036 }
                goto L_0x003a
            L_0x0036:
                r1 = move-exception
                p262t8.C6606a.m15600a(r0, r1)     // Catch:{ all -> 0x002a }
            L_0x003a:
                if (r2 == 0) goto L_0x003e
                monitor-exit(r4)
                return r2
            L_0x003e:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x002a }
                java.lang.String r1 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher"
                r0.<init>(r1)     // Catch:{ all -> 0x002a }
                throw r0     // Catch:{ all -> 0x002a }
            L_0x0046:
                monitor-exit(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p074e8.C4600c.C4601a.mo20123a():e8.c");
        }
    }

    /* renamed from: e8.c$b */
    public static final class C4602b {

        /* renamed from: a */
        public final WeakReference<View> f15816a;

        /* renamed from: b */
        public final String f15817b;

        public C4602b(View view, String str) {
            C24362h.m61211f(view, Promotion.ACTION_VIEW);
            C24362h.m61211f(str, "viewMapKey");
            this.f15816a = new WeakReference<>(view);
            this.f15817b = str;
        }

        /* renamed from: a */
        public final View mo20124a() {
            WeakReference<View> weakReference = this.f15816a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    /* renamed from: e8.c$c */
    public static final class C4603c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: b */
        public final WeakReference<View> f15818b;

        /* renamed from: c */
        public ArrayList f15819c;

        /* renamed from: d */
        public final HashSet<String> f15820d;

        /* renamed from: e */
        public final String f15821e;

        /* renamed from: e8.c$c$a */
        public static final class C4604a {
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d7, code lost:
                if (mf0.C24362h.m61206a(r7.getClass().getSimpleName(), (java.lang.String) r10.get(r10.size() - 1)) == false) goto L_0x01a1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0115, code lost:
                if (mf0.C24362h.m61206a(r10, r6) == false) goto L_0x01a1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x0148, code lost:
                if (mf0.C24362h.m61206a(r10, r6) == false) goto L_0x01a1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:56:0x016e, code lost:
                if (mf0.C24362h.m61206a(r10, r6) == false) goto L_0x01a1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:65:0x019f, code lost:
                if (mf0.C24362h.m61206a(r10, r1) == false) goto L_0x01a1;
             */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x01a6 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:70:0x01a7  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static java.util.ArrayList m11922a(android.view.View r7, java.util.List r8, int r9, int r10, java.lang.String r11) {
                /*
                    java.lang.String r0 = "path"
                    mf0.C24362h.m61211f(r8, r0)
                    java.lang.String r0 = "mapKey"
                    mf0.C24362h.m61211f(r11, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r11)
                    r11 = 46
                    r0.append(r11)
                    r0.append(r10)
                    java.lang.String r11 = r0.toString()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    if (r7 != 0) goto L_0x0026
                    return r0
                L_0x0026:
                    int r1 = r8.size()
                    r2 = 0
                    r3 = 1
                    if (r9 < r1) goto L_0x0038
                    e8.c$b r10 = new e8.c$b
                    r10.<init>(r7, r11)
                    r0.add(r10)
                    goto L_0x01b6
                L_0x0038:
                    java.lang.Object r1 = r8.get(r9)
                    com.facebook.appevents.codeless.internal.PathComponent r1 = (com.facebook.appevents.codeless.internal.PathComponent) r1
                    java.lang.String r4 = r1.f8513a
                    java.lang.String r5 = ".."
                    boolean r4 = mf0.C24362h.m61206a(r4, r5)
                    if (r4 == 0) goto L_0x0073
                    android.view.ViewParent r7 = r7.getParent()
                    boolean r10 = r7 instanceof android.view.ViewGroup
                    if (r10 == 0) goto L_0x0072
                    android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                    java.util.ArrayList r7 = m11923b(r7)
                    int r10 = r7.size()
                    if (r10 <= 0) goto L_0x0072
                L_0x005c:
                    int r1 = r2 + 1
                    java.lang.Object r4 = r7.get(r2)
                    android.view.View r4 = (android.view.View) r4
                    int r5 = r9 + 1
                    java.util.ArrayList r2 = m11922a(r4, r8, r5, r2, r11)
                    r0.addAll(r2)
                    if (r1 < r10) goto L_0x0070
                    goto L_0x0072
                L_0x0070:
                    r2 = r1
                    goto L_0x005c
                L_0x0072:
                    return r0
                L_0x0073:
                    java.lang.String r4 = r1.f8513a
                    java.lang.String r5 = "."
                    boolean r4 = mf0.C24362h.m61206a(r4, r5)
                    if (r4 == 0) goto L_0x0086
                    e8.c$b r8 = new e8.c$b
                    r8.<init>(r7, r11)
                    r0.add(r8)
                    return r0
                L_0x0086:
                    int r4 = r1.f8514b
                    r6 = -1
                    if (r4 == r6) goto L_0x008f
                    if (r10 == r4) goto L_0x008f
                    goto L_0x01a1
                L_0x008f:
                    java.lang.Class r10 = r7.getClass()
                    java.lang.String r10 = r10.getCanonicalName()
                    java.lang.String r4 = r1.f8513a
                    boolean r10 = mf0.C24362h.m61206a(r10, r4)
                    if (r10 != 0) goto L_0x00db
                    java.lang.String r10 = r1.f8513a
                    kotlin.text.Regex r4 = new kotlin.text.Regex
                    java.lang.String r6 = ".*android\\..*"
                    r4.<init>((java.lang.String) r6)
                    boolean r10 = r4.mo60283b(r10)
                    if (r10 == 0) goto L_0x01a1
                    java.lang.String r10 = r1.f8513a
                    java.lang.String[] r4 = new java.lang.String[]{r5}
                    r5 = 6
                    java.util.List r10 = kotlin.text.C24179b.m60577Y(r10, r4, r2, r5)
                    boolean r4 = r10.isEmpty()
                    r4 = r4 ^ r3
                    if (r4 == 0) goto L_0x01a1
                    int r4 = r10.size()
                    int r4 = r4 - r3
                    java.lang.Object r10 = r10.get(r4)
                    java.lang.String r10 = (java.lang.String) r10
                    java.lang.Class r4 = r7.getClass()
                    java.lang.String r4 = r4.getSimpleName()
                    boolean r10 = mf0.C24362h.m61206a(r4, r10)
                    if (r10 != 0) goto L_0x00db
                    goto L_0x01a1
                L_0x00db:
                    int r10 = r1.f8520h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r4 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.ID
                    int r4 = r4.getValue()
                    r10 = r10 & r4
                    if (r10 <= 0) goto L_0x00f0
                    int r10 = r1.f8515c
                    int r4 = r7.getId()
                    if (r10 == r4) goto L_0x00f0
                    goto L_0x01a1
                L_0x00f0:
                    int r10 = r1.f8520h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r4 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TEXT
                    int r4 = r4.getValue()
                    r10 = r10 & r4
                    java.lang.String r4 = ""
                    if (r10 <= 0) goto L_0x0119
                    java.lang.String r10 = r1.f8516d
                    java.lang.String r5 = p085f8.C4714d.m12019i(r7)
                    java.lang.String r6 = com.facebook.internal.C2397f0.m6305N(r5)
                    java.lang.String r6 = com.facebook.internal.C2397f0.m6312f(r6)
                    boolean r5 = mf0.C24362h.m61206a(r10, r5)
                    if (r5 != 0) goto L_0x0119
                    boolean r10 = mf0.C24362h.m61206a(r10, r6)
                    if (r10 != 0) goto L_0x0119
                    goto L_0x01a1
                L_0x0119:
                    int r10 = r1.f8520h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r5 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.DESCRIPTION
                    int r5 = r5.getValue()
                    r10 = r10 & r5
                    if (r10 <= 0) goto L_0x014b
                    java.lang.String r10 = r1.f8518f
                    java.lang.CharSequence r5 = r7.getContentDescription()
                    if (r5 != 0) goto L_0x012e
                    r5 = r4
                    goto L_0x0136
                L_0x012e:
                    java.lang.CharSequence r5 = r7.getContentDescription()
                    java.lang.String r5 = r5.toString()
                L_0x0136:
                    java.lang.String r6 = com.facebook.internal.C2397f0.m6305N(r5)
                    java.lang.String r6 = com.facebook.internal.C2397f0.m6312f(r6)
                    boolean r5 = mf0.C24362h.m61206a(r10, r5)
                    if (r5 != 0) goto L_0x014b
                    boolean r10 = mf0.C24362h.m61206a(r10, r6)
                    if (r10 != 0) goto L_0x014b
                    goto L_0x01a1
                L_0x014b:
                    int r10 = r1.f8520h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r5 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.HINT
                    int r5 = r5.getValue()
                    r10 = r10 & r5
                    if (r10 <= 0) goto L_0x0171
                    java.lang.String r10 = r1.f8519g
                    java.lang.String r5 = p085f8.C4714d.m12017g(r7)
                    java.lang.String r6 = com.facebook.internal.C2397f0.m6305N(r5)
                    java.lang.String r6 = com.facebook.internal.C2397f0.m6312f(r6)
                    boolean r5 = mf0.C24362h.m61206a(r10, r5)
                    if (r5 != 0) goto L_0x0171
                    boolean r10 = mf0.C24362h.m61206a(r10, r6)
                    if (r10 != 0) goto L_0x0171
                    goto L_0x01a1
                L_0x0171:
                    int r10 = r1.f8520h
                    com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType r5 = com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TAG
                    int r5 = r5.getValue()
                    r10 = r10 & r5
                    if (r10 <= 0) goto L_0x01a3
                    java.lang.String r10 = r1.f8517e
                    java.lang.Object r1 = r7.getTag()
                    if (r1 != 0) goto L_0x0185
                    goto L_0x018d
                L_0x0185:
                    java.lang.Object r1 = r7.getTag()
                    java.lang.String r4 = r1.toString()
                L_0x018d:
                    java.lang.String r1 = com.facebook.internal.C2397f0.m6305N(r4)
                    java.lang.String r1 = com.facebook.internal.C2397f0.m6312f(r1)
                    boolean r4 = mf0.C24362h.m61206a(r10, r4)
                    if (r4 != 0) goto L_0x01a3
                    boolean r10 = mf0.C24362h.m61206a(r10, r1)
                    if (r10 != 0) goto L_0x01a3
                L_0x01a1:
                    r10 = 0
                    goto L_0x01a4
                L_0x01a3:
                    r10 = 1
                L_0x01a4:
                    if (r10 != 0) goto L_0x01a7
                    return r0
                L_0x01a7:
                    int r10 = r8.size()
                    int r10 = r10 - r3
                    if (r9 != r10) goto L_0x01b6
                    e8.c$b r10 = new e8.c$b
                    r10.<init>(r7, r11)
                    r0.add(r10)
                L_0x01b6:
                    boolean r10 = r7 instanceof android.view.ViewGroup
                    if (r10 == 0) goto L_0x01dc
                    android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                    java.util.ArrayList r7 = m11923b(r7)
                    int r10 = r7.size()
                    if (r10 <= 0) goto L_0x01dc
                L_0x01c6:
                    int r1 = r2 + 1
                    java.lang.Object r4 = r7.get(r2)
                    android.view.View r4 = (android.view.View) r4
                    int r5 = r9 + 1
                    java.util.ArrayList r2 = m11922a(r4, r8, r5, r2, r11)
                    r0.addAll(r2)
                    if (r1 < r10) goto L_0x01da
                    goto L_0x01dc
                L_0x01da:
                    r2 = r1
                    goto L_0x01c6
                L_0x01dc:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p074e8.C4600c.C4603c.C4604a.m11922a(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
            }

            /* renamed from: b */
            public static ArrayList m11923b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt.getVisibility() == 0) {
                            arrayList.add(childAt);
                        }
                        if (i2 >= childCount) {
                            break;
                        }
                        i = i2;
                    }
                }
                return arrayList;
            }
        }

        public C4603c(View view, Handler handler, HashSet<String> hashSet, String str) {
            C24362h.m61211f(handler, "handler");
            C24362h.m61211f(hashSet, "listenerSet");
            this.f15818b = new WeakReference<>(view);
            this.f15820d = hashSet;
            this.f15821e = str;
            handler.postDelayed(this, 200);
        }

        /* renamed from: a */
        public final void mo20125a(C4602b bVar, View view, EventBinding eventBinding) {
            boolean z;
            View a = bVar.mo20124a();
            if (a != null) {
                String str = bVar.f15817b;
                View.OnClickListener e = C4714d.m12015e(a);
                if (e instanceof C4596a.C4597a) {
                    if (e == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    } else if (((C4596a.C4597a) e).f15795f) {
                        z = true;
                        if (!this.f15820d.contains(str) && !z) {
                            C4596a aVar = C4596a.f15790a;
                            Class<C4596a> cls = C4596a.class;
                            C4596a.C4597a aVar2 = null;
                            if (!C6606a.m15601b(cls)) {
                                try {
                                    aVar2 = new C4596a.C4597a(eventBinding, view, a);
                                } catch (Throwable th) {
                                    C6606a.m15600a(cls, th);
                                }
                            }
                            a.setOnClickListener(aVar2);
                            this.f15820d.add(str);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.f15820d.contains(str)) {
                }
            }
        }

        /* renamed from: b */
        public final void mo20126b(C4602b bVar, View view, EventBinding eventBinding) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.mo20124a();
            if (adapterView != null) {
                String str = bVar.f15817b;
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof C4596a.C4598b) {
                    if (onItemClickListener == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    } else if (((C4596a.C4598b) onItemClickListener).f15800f) {
                        z = true;
                        if (!this.f15820d.contains(str) && !z) {
                            C4596a aVar = C4596a.f15790a;
                            Class<C4596a> cls = C4596a.class;
                            C4596a.C4598b bVar2 = null;
                            if (!C6606a.m15601b(cls)) {
                                try {
                                    bVar2 = new C4596a.C4598b(eventBinding, view, adapterView);
                                } catch (Throwable th) {
                                    C6606a.m15600a(cls, th);
                                }
                            }
                            adapterView.setOnItemClickListener(bVar2);
                            this.f15820d.add(str);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.f15820d.contains(str)) {
                }
            }
        }

        /* renamed from: c */
        public final void mo20127c(C4602b bVar, View view, EventBinding eventBinding) {
            boolean z;
            View a = bVar.mo20124a();
            if (a != null) {
                String str = bVar.f15817b;
                View.OnTouchListener f = C4714d.m12016f(a);
                if (f instanceof C4605d.C4606a) {
                    if (f == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    } else if (((C4605d.C4606a) f).f15827f) {
                        z = true;
                        if (!this.f15820d.contains(str) && !z) {
                            int i = C4605d.f15822a;
                            Class<C4605d> cls = C4605d.class;
                            C4605d.C4606a aVar = null;
                            if (!C6606a.m15601b(cls)) {
                                try {
                                    aVar = new C4605d.C4606a(eventBinding, view, a);
                                } catch (Throwable th) {
                                    C6606a.m15600a(cls, th);
                                }
                            }
                            a.setOnTouchListener(aVar);
                            this.f15820d.add(str);
                            return;
                        }
                    }
                }
                z = false;
                if (!this.f15820d.contains(str)) {
                }
            }
        }

        /* JADX WARNING: type inference failed for: r0v31, types: [android.view.ViewParent] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6 A[Catch:{ all -> 0x00ad, all -> 0x00c3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x00b4 A[SYNTHETIC] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo20128d() {
            /*
                r16 = this;
                r1 = r16
                java.util.ArrayList r2 = r1.f15819c
                if (r2 != 0) goto L_0x0008
                goto L_0x0109
            L_0x0008:
                java.lang.ref.WeakReference<android.view.View> r0 = r1.f15818b
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L_0x0109
                int r0 = r2.size()
                r3 = -1
                int r4 = r0 + -1
                if (r4 < 0) goto L_0x0109
                r5 = 0
                r0 = 0
            L_0x001b:
                int r6 = r0 + 1
                java.lang.Object r0 = r2.get(r0)
                r7 = r0
                com.facebook.appevents.codeless.internal.EventBinding r7 = (com.facebook.appevents.codeless.internal.EventBinding) r7
                java.lang.ref.WeakReference<android.view.View> r0 = r1.f15818b
                java.lang.Object r0 = r0.get()
                r8 = r0
                android.view.View r8 = (android.view.View) r8
                if (r7 == 0) goto L_0x0102
                if (r8 != 0) goto L_0x0033
                goto L_0x0102
            L_0x0033:
                java.lang.String r0 = r7.f8512d
                if (r0 == 0) goto L_0x0040
                int r0 = r0.length()
                if (r0 != 0) goto L_0x003e
                goto L_0x0040
            L_0x003e:
                r0 = 0
                goto L_0x0041
            L_0x0040:
                r0 = 1
            L_0x0041:
                if (r0 != 0) goto L_0x004f
                java.lang.String r0 = r7.f8512d
                java.lang.String r9 = r1.f15821e
                boolean r0 = mf0.C24362h.m61206a(r0, r9)
                if (r0 != 0) goto L_0x004f
                goto L_0x0102
            L_0x004f:
                java.util.List<com.facebook.appevents.codeless.internal.PathComponent> r0 = r7.f8510b
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                java.lang.String r9 = "unmodifiableList(path)"
                mf0.C24362h.m61210e(r0, r9)
                int r9 = r0.size()
                r10 = 25
                if (r9 <= r10) goto L_0x0065
                goto L_0x0102
            L_0x0065:
                java.lang.String r9 = r1.f15821e
                java.util.ArrayList r0 = p074e8.C4600c.C4603c.C4604a.m11922a(r8, r0, r5, r3, r9)
                java.util.Iterator r9 = r0.iterator()
            L_0x006f:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L_0x0102
                java.lang.Object r0 = r9.next()
                r10 = r0
                e8.c$b r10 = (p074e8.C4600c.C4602b) r10
                android.view.View r11 = r10.mo20124a()     // Catch:{ Exception -> 0x00f6 }
                if (r11 != 0) goto L_0x0083
                goto L_0x006f
            L_0x0083:
                f8.d r0 = p085f8.C4714d.f16001a     // Catch:{ Exception -> 0x00f6 }
                java.lang.Class<f8.d> r12 = p085f8.C4714d.class
                boolean r0 = p262t8.C6606a.m15601b(r12)     // Catch:{ Exception -> 0x00f6 }
                r13 = 0
                if (r0 == 0) goto L_0x008f
                goto L_0x00c7
            L_0x008f:
                r14 = r11
            L_0x0090:
                if (r14 == 0) goto L_0x00c7
                f8.d r15 = p085f8.C4714d.f16001a     // Catch:{ all -> 0x00c3 }
                r15.getClass()     // Catch:{ all -> 0x00c3 }
                boolean r0 = p262t8.C6606a.m15601b(r15)     // Catch:{ all -> 0x00c3 }
                if (r0 == 0) goto L_0x009e
                goto L_0x00b1
            L_0x009e:
                java.lang.Class r0 = r14.getClass()     // Catch:{ all -> 0x00ad }
                java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00ad }
                java.lang.String r3 = "com.facebook.react.ReactRootView"
                boolean r0 = mf0.C24362h.m61206a(r0, r3)     // Catch:{ all -> 0x00ad }
                goto L_0x00b2
            L_0x00ad:
                r0 = move-exception
                p262t8.C6606a.m15600a(r15, r0)     // Catch:{ all -> 0x00c3 }
            L_0x00b1:
                r0 = 0
            L_0x00b2:
                if (r0 == 0) goto L_0x00b6
                r13 = r14
                goto L_0x00c7
            L_0x00b6:
                android.view.ViewParent r0 = r14.getParent()     // Catch:{ all -> 0x00c3 }
                boolean r3 = r0 instanceof android.view.View     // Catch:{ all -> 0x00c3 }
                if (r3 == 0) goto L_0x00c7
                r14 = r0
                android.view.View r14 = (android.view.View) r14     // Catch:{ all -> 0x00c3 }
                r3 = -1
                goto L_0x0090
            L_0x00c3:
                r0 = move-exception
                p262t8.C6606a.m15600a(r12, r0)     // Catch:{ Exception -> 0x00f6 }
            L_0x00c7:
                if (r13 == 0) goto L_0x00d5
                f8.d r0 = p085f8.C4714d.f16001a     // Catch:{ Exception -> 0x00f6 }
                boolean r0 = r0.mo20223l(r11, r13)     // Catch:{ Exception -> 0x00f6 }
                if (r0 == 0) goto L_0x00d5
                r1.mo20127c(r10, r8, r7)     // Catch:{ Exception -> 0x00f6 }
                goto L_0x00ff
            L_0x00d5:
                java.lang.Class r0 = r11.getClass()     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x00f6 }
                java.lang.String r3 = "com.facebook.react"
                boolean r0 = uh0.C25081h.m62835F(r0, r3)     // Catch:{ Exception -> 0x00f6 }
                if (r0 == 0) goto L_0x00e6
                goto L_0x00ff
            L_0x00e6:
                boolean r0 = r11 instanceof android.widget.AdapterView     // Catch:{ Exception -> 0x00f6 }
                if (r0 != 0) goto L_0x00ee
                r1.mo20125a(r10, r8, r7)     // Catch:{ Exception -> 0x00f6 }
                goto L_0x00ff
            L_0x00ee:
                boolean r0 = r11 instanceof android.widget.ListView     // Catch:{ Exception -> 0x00f6 }
                if (r0 == 0) goto L_0x00ff
                r1.mo20126b(r10, r8, r7)     // Catch:{ Exception -> 0x00f6 }
                goto L_0x00ff
            L_0x00f6:
                com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a
                java.lang.Class<e8.c> r0 = p074e8.C4600c.class
                p262t8.C6606a.m15601b(r0)
                a8.o r0 = p009a8.C0115o.f331a
            L_0x00ff:
                r3 = -1
                goto L_0x006f
            L_0x0102:
                if (r6 <= r4) goto L_0x0105
                goto L_0x0109
            L_0x0105:
                r0 = r6
                r3 = -1
                goto L_0x001b
            L_0x0109:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p074e8.C4600c.C4603c.mo20128d():void");
        }

        public final void onGlobalLayout() {
            mo20128d();
        }

        public final void onScrollChanged() {
            mo20128d();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:13|(4:15|16|17|(3:(2:19|(1:21)(0))|23|(1:25)(4:26|(1:28)|29|39))(0))(0)|22|23|(0)(0)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0044 */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[Catch:{ all -> 0x0065, all -> 0x006c }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0051 A[Catch:{ all -> 0x0065, all -> 0x006c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                boolean r0 = p262t8.C6606a.m15601b(r6)
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                boolean r0 = p262t8.C6606a.m15601b(r6)     // Catch:{ all -> 0x006c }
                if (r0 == 0) goto L_0x000e
                return
            L_0x000e:
                java.lang.String r0 = p009a8.C0115o.m211b()     // Catch:{ all -> 0x0065 }
                com.facebook.internal.s r0 = com.facebook.internal.FetchedAppSettingsManager.m6261b(r0)     // Catch:{ all -> 0x0065 }
                if (r0 == 0) goto L_0x0067
                boolean r1 = r0.f8715h     // Catch:{ all -> 0x0065 }
                if (r1 != 0) goto L_0x001d
                goto L_0x0067
            L_0x001d:
                org.json.JSONArray r0 = r0.f8716i     // Catch:{ all -> 0x0065 }
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0065 }
                r1.<init>()     // Catch:{ all -> 0x0065 }
                if (r0 == 0) goto L_0x0044
                r2 = 0
                int r3 = r0.length()     // Catch:{ IllegalArgumentException | JSONException -> 0x0044 }
                if (r3 <= 0) goto L_0x0044
            L_0x002d:
                int r4 = r2 + 1
                org.json.JSONObject r2 = r0.getJSONObject(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x0044 }
                java.lang.String r5 = "array.getJSONObject(i)"
                mf0.C24362h.m61210e(r2, r5)     // Catch:{ IllegalArgumentException | JSONException -> 0x0044 }
                com.facebook.appevents.codeless.internal.EventBinding r2 = com.facebook.appevents.codeless.internal.EventBinding.C2331a.m6194a(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x0044 }
                r1.add(r2)     // Catch:{ IllegalArgumentException | JSONException -> 0x0044 }
                if (r4 < r3) goto L_0x0042
                goto L_0x0044
            L_0x0042:
                r2 = r4
                goto L_0x002d
            L_0x0044:
                r6.f15819c = r1     // Catch:{ all -> 0x0065 }
                java.lang.ref.WeakReference<android.view.View> r0 = r6.f15818b     // Catch:{ all -> 0x0065 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0065 }
                android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0065 }
                if (r0 != 0) goto L_0x0051
                return
            L_0x0051:
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()     // Catch:{ all -> 0x0065 }
                boolean r1 = r0.isAlive()     // Catch:{ all -> 0x0065 }
                if (r1 == 0) goto L_0x0061
                r0.addOnGlobalLayoutListener(r6)     // Catch:{ all -> 0x0065 }
                r0.addOnScrollChangedListener(r6)     // Catch:{ all -> 0x0065 }
            L_0x0061:
                r6.mo20128d()     // Catch:{ all -> 0x0065 }
                goto L_0x0067
            L_0x0065:
                r0 = move-exception
                goto L_0x0068
            L_0x0067:
                return
            L_0x0068:
                p262t8.C6606a.m15600a(r6, r0)     // Catch:{ all -> 0x006c }
                return
            L_0x006c:
                r0 = move-exception
                p262t8.C6606a.m15600a(r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p074e8.C4600c.C4603c.run():void");
        }
    }

    public C4600c() {
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C24362h.m61210e(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f15812b = newSetFromMap;
        this.f15813c = new LinkedHashSet();
        this.f15814d = new HashSet<>();
        this.f15815e = new HashMap<>();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20120a(android.app.Activity r3) {
        /*
            r2 = this;
            boolean r0 = p262t8.C6606a.m15601b(r2)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "activity"
            mf0.C24362h.m61211f(r3, r0)     // Catch:{ all -> 0x0075 }
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0075 }
            boolean r0 = mf0.C24362h.m61206a(r0, r1)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0016
            return
        L_0x0016:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0075 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0075 }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x0075 }
            if (r0 != r1) goto L_0x006d
            java.util.Set<android.app.Activity> r0 = r2.f15812b     // Catch:{ all -> 0x0075 }
            r0.add(r3)     // Catch:{ all -> 0x0075 }
            java.util.HashSet<java.lang.String> r0 = r2.f15814d     // Catch:{ all -> 0x0075 }
            r0.clear()     // Catch:{ all -> 0x0075 }
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.String>> r0 = r2.f15815e     // Catch:{ all -> 0x0075 }
            int r3 = r3.hashCode()     // Catch:{ all -> 0x0075 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0075 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0075 }
            java.util.HashSet r3 = (java.util.HashSet) r3     // Catch:{ all -> 0x0075 }
            if (r3 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r2.f15814d = r3     // Catch:{ all -> 0x0075 }
        L_0x0043:
            boolean r3 = p262t8.C6606a.m15601b(r2)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x004a
            goto L_0x006c
        L_0x004a:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0068 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0068 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0068 }
            if (r3 != r0) goto L_0x005c
            r2.mo20121b()     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x005c:
            android.os.Handler r3 = r2.f15811a     // Catch:{ all -> 0x0068 }
            x.r1 r0 = new x.r1     // Catch:{ all -> 0x0068 }
            r1 = 5
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0068 }
            r3.post(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r3 = move-exception
            p262t8.C6606a.m15600a(r2, r3)     // Catch:{ all -> 0x0075 }
        L_0x006c:
            return
        L_0x006d:
            com.facebook.FacebookException r3 = new com.facebook.FacebookException     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "Can't add activity to CodelessMatcher on non-UI thread"
            r3.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0075 }
            throw r3     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r3 = move-exception
            p262t8.C6606a.m15600a(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p074e8.C4600c.mo20120a(android.app.Activity):void");
    }

    /* renamed from: b */
    public final void mo20121b() {
        if (!C6606a.m15601b(this)) {
            try {
                for (Activity next : this.f15812b) {
                    if (next != null) {
                        this.f15813c.add(new C4603c(C5398d.m13501b(next), this.f15811a, this.f15814d, next.getClass().getSimpleName()));
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: c */
    public final void mo20122c(Activity activity) {
        if (!C6606a.m15601b(this)) {
            try {
                C24362h.m61211f(activity, "activity");
                if (!C24362h.m61206a((Object) null, Boolean.TRUE)) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.f15812b.remove(activity);
                        this.f15813c.clear();
                        this.f15815e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f15814d.clone());
                        this.f15814d.clear();
                        return;
                    }
                    throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
