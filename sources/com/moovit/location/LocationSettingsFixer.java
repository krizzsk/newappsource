package com.moovit.location;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.widget.Toast;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.C1044w;
import androidx.lifecycle.LiveData;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.location.C16202a;
import i20.C17546h;
import i20.C17547i;
import i20.C17548j;
import i20.C17549k;
import i20.C17550l;
import i20.C17551m;
import i20.C17552n;
import i20.C17553o;
import i20.C17554p;
import java.lang.ref.WeakReference;
import p054d0.C4267a0;
import p054d0.C4314v;
import p102h0.C5021e;
import p304x.C7038d0;
import p304x.C7070l;
import p304x.C7071l0;
import p373au.C13533e;
import p484ff.C16978i0;
import p664mu.C18459n;
import p824tp.C19746x;
import p926xv.C20621b;
import p977zz.C20935e;
import p977zz.C20943i;
import p977zz.C20961r;

public final class LocationSettingsFixer {

    /* renamed from: a */
    public final C1043v<C20961r<Location>> f42247a = new C1043v<>();

    /* renamed from: b */
    public final CharSequence f42248b;

    /* renamed from: c */
    public final CharSequence f42249c;

    /* renamed from: d */
    public final Boolean f42250d;

    /* renamed from: e */
    public final boolean f42251e;

    /* renamed from: f */
    public final boolean f42252f;

    /* renamed from: g */
    public final boolean f42253g;

    public static class LocationSettingFixerException extends ApplicationBugException {
        private final int errorCode;

        public LocationSettingFixerException(int i) {
            this.errorCode = i;
        }

        /* renamed from: a */
        public final int mo48527a() {
            return this.errorCode;
        }
    }

    /* renamed from: com.moovit.location.LocationSettingsFixer$b */
    public static class C16200b implements C20935e<C20961r<Location>> {

        /* renamed from: b */
        public final WeakReference<Context> f42263b;

        /* renamed from: c */
        public final int f42264c;

        public C16200b(Context context) {
            this(context, C19746x.location_services_not_permitted_message);
        }

        /* renamed from: a */
        public void mo45589a(Exception exc) {
            Context context;
            int i;
            if ((exc instanceof LocationSettingFixerException) && (context = this.f42263b.get()) != null) {
                switch (((LocationSettingFixerException) exc).mo48527a()) {
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                        i = this.f42264c;
                        break;
                    case 4:
                        i = C19746x.location_services_unavailable_message;
                        break;
                    case 5:
                        i = C19746x.location_services_disabled_message;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != 0) {
                    Toast.makeText(context, i, 1).show();
                }
            }
        }

        /* renamed from: b */
        public void mo23896b(Location location) {
            throw null;
        }

        public final void invoke(Object obj) {
            C20961r rVar = (C20961r) obj;
            if (rVar.f52711a) {
                mo23896b((Location) rVar.f52712b);
            } else {
                mo45589a(rVar.f52713c);
            }
        }

        public C16200b(Context context, int i) {
            this.f42263b = new WeakReference<>(context);
            this.f42264c = i;
        }
    }

    public LocationSettingsFixer(CharSequence charSequence, CharSequence charSequence2, Boolean bool, boolean z, boolean z2) {
        this.f42248b = charSequence;
        this.f42249c = charSequence2;
        this.f42251e = z;
        this.f42250d = bool;
        this.f42252f = z2;
        this.f42253g = false;
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: a */
    public final void mo48520a(MoovitActivity moovitActivity, C15682c<?> cVar, int i, boolean z) {
        boolean z2;
        C16202a aVar = C16202a.get(moovitActivity);
        if (i == 3) {
            i = !aVar.hasBackgroundLocationPermissions();
        }
        if (i == 0) {
            aVar.requestLocationSettings().addOnSuccessListener((Activity) moovitActivity, new C18459n(this, moovitActivity));
        } else if (i == 1) {
            this.f42247a.postValue(new C20961r((Exception) new LocationSettingFixerException(3)));
        } else if (i == 2) {
            CharSequence charSequence = this.f42248b;
            if (charSequence == null || this.f42249c == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || z) {
                mo48521b(moovitActivity, cVar, 0);
            } else if (cVar != null) {
                aVar.requestLocationPrePermissions(cVar, charSequence, this.f42249c, (C16202a.C16205c<C15682c<?>>) new C17546h(this, 1));
            } else {
                aVar.requestLocationPrePermissions(moovitActivity, charSequence, this.f42249c, (C16202a.C16205c<MoovitActivity>) new C4314v(this, 12));
            }
        }
    }

    /* renamed from: b */
    public final void mo48521b(MoovitActivity moovitActivity, C15682c<?> cVar, int i) {
        if (i != 0) {
            this.f42247a.postValue(new C20961r((Exception) new LocationSettingFixerException(1)));
            return;
        }
        C16202a aVar = C16202a.get(moovitActivity);
        if (cVar != null) {
            aVar.requestPermissionSettings(cVar, (C16202a.C16205c<C15682c<?>>) new C7070l(this, 14));
        } else {
            aVar.requestPermissionSettings(moovitActivity, (C16202a.C16205c<MoovitActivity>) new C4267a0(this, 11));
        }
    }

    /* renamed from: c */
    public final void mo48522c(MoovitActivity moovitActivity, C15682c<?> cVar, int i, boolean z) {
        if (i != 0) {
            this.f42247a.postValue(new C20961r((Exception) new LocationSettingFixerException(1)));
            return;
        }
        C16202a aVar = C16202a.get(moovitActivity);
        Boolean bool = this.f42250d;
        if (bool == null) {
            if (cVar != null) {
                aVar.requestLocationPermissions(cVar, (C16202a.C16205c<C15682c<?>>) new C17549k(this, z));
            } else {
                aVar.requestLocationPermissions(moovitActivity, (C16202a.C16205c<MoovitActivity>) new C17550l(this, z));
            }
        } else if (cVar != null) {
            aVar.requestLocationPermissions(cVar, bool.booleanValue(), (C16202a.C16205c<C15682c<?>>) new C17551m(this, z));
        } else {
            aVar.requestLocationPermissions(moovitActivity, bool.booleanValue(), (C16202a.C16205c<MoovitActivity>) new C17552n(this, z));
        }
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: d */
    public final void mo48523d(MoovitActivity moovitActivity, C15682c<?> cVar, int i, boolean z) {
        C16202a aVar = C16202a.get(moovitActivity);
        boolean z2 = true;
        if (i == 3) {
            i = !aVar.hasLocationPermissions();
        }
        if (i != 0) {
            if (i == 1) {
                this.f42247a.postValue(new C20961r((Exception) new LocationSettingFixerException(2)));
            } else if (i == 2) {
                CharSequence charSequence = this.f42248b;
                if (charSequence == null || this.f42249c == null) {
                    z2 = false;
                }
                if (!z2 || z) {
                    mo48524e(moovitActivity, cVar, 0);
                } else if (cVar != null) {
                    aVar.requestLocationPrePermissions(cVar, charSequence, this.f42249c, (C16202a.C16205c<C15682c<?>>) new C7038d0(this, 18));
                } else {
                    aVar.requestLocationPrePermissions(moovitActivity, charSequence, this.f42249c, (C16202a.C16205c<MoovitActivity>) new C5021e(this, 14));
                }
            }
        } else if (this.f42251e && !aVar.hasPreciseLocationPermissions()) {
            this.f42247a.postValue(new C20961r((Exception) new LocationSettingFixerException(6)));
        } else if (!Boolean.TRUE.equals(this.f42250d) || aVar.hasBackgroundLocationPermissions()) {
            aVar.requestLocationSettings().addOnSuccessListener((Activity) moovitActivity, new C20621b(1, this, moovitActivity));
        } else if (!C20943i.m49051d(30)) {
            this.f42247a.postValue(new C20961r((Exception) new LocationSettingFixerException(3)));
        } else if (cVar != null) {
            aVar.requestBackgroundLocationPermissions(cVar, (C16202a.C16205c<C15682c<?>>) new C17547i(this, z));
        } else {
            aVar.requestBackgroundLocationPermissions(moovitActivity, (C16202a.C16205c<MoovitActivity>) new C17548j(this, z));
        }
    }

    /* renamed from: e */
    public final void mo48524e(MoovitActivity moovitActivity, C15682c<?> cVar, int i) {
        if (i != 0) {
            this.f42247a.postValue(new C20961r((Exception) new LocationSettingFixerException(1)));
            return;
        }
        C16202a aVar = C16202a.get(moovitActivity);
        if (cVar != null) {
            aVar.requestPermissionSettings(cVar, (C16202a.C16205c<C15682c<?>>) new C7071l0(this, 11));
        } else {
            aVar.requestPermissionSettings(moovitActivity, (C16202a.C16205c<MoovitActivity>) new C13533e(this, 11));
        }
    }

    /* renamed from: f */
    public final void mo48525f(MoovitActivity moovitActivity) {
        if (this.f42252f) {
            C16202a.get(moovitActivity).getHighAccuracyFrequentUpdates().mo50016n().addOnCompleteListener((Activity) moovitActivity, new C16978i0(this, 3));
        } else if (this.f42253g) {
            C16202a.get(moovitActivity).getHighAccuracyFrequentUpdates().mo50015m(new C17554p(this));
        } else {
            this.f42247a.postValue(new C20961r(null));
        }
    }

    /* renamed from: g */
    public final void mo48526g(MoovitActivity moovitActivity, C16202a.C16203a aVar) {
        if (aVar == null) {
            this.f42247a.postValue(new C20961r((Exception) new LocationSettingFixerException(4)));
            return;
        }
        aVar.mo48507a();
        aVar.mo48509c();
        aVar.mo48508b();
        if (aVar.mo48507a() && aVar.mo48509c()) {
            mo48525f(moovitActivity);
        } else if (!aVar.mo48508b()) {
            this.f42247a.postValue(new C20961r((Exception) new LocationSettingFixerException(4)));
        } else {
            aVar.mo48510d(moovitActivity, new C17553o(this, moovitActivity));
        }
    }

    /* renamed from: com.moovit.location.LocationSettingsFixer$a */
    public static class C16198a {

        /* renamed from: a */
        public final MoovitActivity f42254a;

        /* renamed from: b */
        public final C15682c<?> f42255b;

        /* renamed from: c */
        public CharSequence f42256c = null;

        /* renamed from: d */
        public CharSequence f42257d = null;

        /* renamed from: e */
        public Boolean f42258e = null;

        /* renamed from: f */
        public boolean f42259f = false;

        /* renamed from: g */
        public boolean f42260g = false;

        /* renamed from: com.moovit.location.LocationSettingsFixer$a$a */
        public class C16199a implements C1044w<C20961r<Location>> {

            /* renamed from: a */
            public final /* synthetic */ LiveData f42261a;

            /* renamed from: b */
            public final /* synthetic */ C20935e f42262b;

            public C16199a(C1043v vVar, C20935e eVar) {
                this.f42261a = vVar;
                this.f42262b = eVar;
            }

            public final void onChanged(Object obj) {
                this.f42261a.removeObserver(this);
                this.f42262b.invoke((C20961r) obj);
            }
        }

        public C16198a(MoovitActivity moovitActivity) {
            C21100e.m49373x(moovitActivity, "activity");
            this.f42254a = moovitActivity;
            this.f42255b = null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo48528a(p977zz.C20935e<p977zz.C20961r<android.location.Location>> r10) {
            /*
                r9 = this;
                r0 = 1
                ce0.C21100e.m49369v(r0)
                com.moovit.MoovitActivity r1 = r9.f42254a
                if (r1 != 0) goto L_0x001a
                if (r10 == 0) goto L_0x0019
                zz.r r0 = new zz.r
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Missing host activity reference."
                r1.<init>(r2)
                r0.<init>((java.lang.Exception) r1)
                r10.invoke(r0)
            L_0x0019:
                return
            L_0x001a:
                com.moovit.location.LocationSettingsFixer r1 = new com.moovit.location.LocationSettingsFixer
                java.lang.CharSequence r4 = r9.f42256c
                java.lang.CharSequence r5 = r9.f42257d
                java.lang.Boolean r6 = r9.f42258e
                boolean r7 = r9.f42259f
                boolean r8 = r9.f42260g
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                com.moovit.MoovitActivity r2 = r9.f42254a
                com.moovit.c<?> r3 = r9.f42255b
                com.moovit.location.a r4 = com.moovit.location.C16202a.get(r2)
                java.lang.CharSequence r5 = r1.f42248b
                r6 = 0
                if (r5 == 0) goto L_0x003c
                java.lang.CharSequence r5 = r1.f42249c
                if (r5 == 0) goto L_0x003c
                goto L_0x003d
            L_0x003c:
                r0 = 0
            L_0x003d:
                if (r0 == 0) goto L_0x0087
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.lang.Boolean r5 = r1.f42250d
                boolean r0 = r0.equals(r5)
                if (r0 == 0) goto L_0x0054
                boolean r0 = r4.hasBackgroundLocationPermissions()
                if (r0 != 0) goto L_0x0054
                boolean r0 = r4.shouldShowBackgroundLocationPermissionRationale(r2)
                goto L_0x0067
            L_0x0054:
                boolean r0 = r1.f42251e
                if (r0 == 0) goto L_0x0063
                boolean r0 = r4.hasPreciseLocationPermissions()
                if (r0 != 0) goto L_0x0063
                boolean r0 = r4.shouldShowPreciseLocationPermissionRationale(r2)
                goto L_0x0067
            L_0x0063:
                boolean r0 = r4.shouldShowCoarseLocationPermissionRationale(r2)
            L_0x0067:
                if (r0 == 0) goto L_0x0087
                if (r3 == 0) goto L_0x007a
                java.lang.CharSequence r0 = r1.f42248b
                java.lang.CharSequence r2 = r1.f42249c
                b0.m r5 = new b0.m
                r6 = 9
                r5.<init>(r1, r6)
                r4.requestLocationPrePermissions((com.moovit.C15682c<?>) r3, (java.lang.CharSequence) r0, (java.lang.CharSequence) r2, (com.moovit.location.C16202a.C16205c<com.moovit.C15682c<?>>) r5)
                goto L_0x00b1
            L_0x007a:
                java.lang.CharSequence r0 = r1.f42248b
                java.lang.CharSequence r3 = r1.f42249c
                i20.h r5 = new i20.h
                r5.<init>(r1, r6)
                r4.requestLocationPrePermissions((com.moovit.MoovitActivity) r2, (java.lang.CharSequence) r0, (java.lang.CharSequence) r3, (com.moovit.location.C16202a.C16205c<com.moovit.MoovitActivity>) r5)
                goto L_0x00b1
            L_0x0087:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                java.lang.Boolean r5 = r1.f42250d
                boolean r0 = r0.equals(r5)
                if (r0 == 0) goto L_0x0098
                boolean r0 = r4.hasBackgroundLocationPermissions()
                if (r0 != 0) goto L_0x0098
                goto L_0x00a2
            L_0x0098:
                boolean r0 = r1.f42251e
                if (r0 == 0) goto L_0x00a4
                boolean r0 = r4.hasPreciseLocationPermissions()
                if (r0 != 0) goto L_0x00a4
            L_0x00a2:
                r0 = 0
                goto L_0x00a8
            L_0x00a4:
                boolean r0 = r4.hasCoarseLocationPermissions()
            L_0x00a8:
                if (r0 != 0) goto L_0x00ae
                r1.mo48522c(r2, r3, r6, r6)
                goto L_0x00b1
            L_0x00ae:
                r1.mo48523d(r2, r3, r6, r6)
            L_0x00b1:
                androidx.lifecycle.v<zz.r<android.location.Location>> r0 = r1.f42247a
                if (r10 == 0) goto L_0x00c4
                com.moovit.c<?> r1 = r9.f42255b
                if (r1 == 0) goto L_0x00ba
                goto L_0x00bc
            L_0x00ba:
                com.moovit.MoovitActivity r1 = r9.f42254a
            L_0x00bc:
                com.moovit.location.LocationSettingsFixer$a$a r2 = new com.moovit.location.LocationSettingsFixer$a$a
                r2.<init>(r0, r10)
                r0.observe(r1, r2)
            L_0x00c4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.location.LocationSettingsFixer.C16198a.mo48528a(zz.e):void");
        }

        /* renamed from: b */
        public final void mo48529b(int i, int i2) {
            CharSequence charSequence;
            Context context = this.f42254a;
            if (context == null) {
                C15682c<?> cVar = this.f42255b;
                C21100e.m49371w(cVar);
                context = cVar.requireContext();
            }
            CharSequence charSequence2 = null;
            if (i == 0) {
                charSequence = null;
            } else {
                charSequence = context.getText(i);
            }
            if (i2 != 0) {
                charSequence2 = context.getText(i2);
            }
            this.f42256c = charSequence;
            this.f42257d = charSequence2;
        }

        public C16198a(C15682c<?> cVar) {
            C21100e.m49373x(cVar, "fragment");
            this.f42255b = cVar;
            this.f42254a = cVar.f40822c;
        }
    }
}
