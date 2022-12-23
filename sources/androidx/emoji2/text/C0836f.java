package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import mf0.C24361g;
import p241s0.C6304d;

/* renamed from: androidx.emoji2.text.f */
public final class C0836f {

    /* renamed from: i */
    public static final Object f3490i = new Object();

    /* renamed from: j */
    public static volatile C0836f f3491j;

    /* renamed from: a */
    public final ReentrantReadWriteLock f3492a;

    /* renamed from: b */
    public final C6304d f3493b;

    /* renamed from: c */
    public volatile int f3494c = 3;

    /* renamed from: d */
    public final Handler f3495d;

    /* renamed from: e */
    public final C0837a f3496e;

    /* renamed from: f */
    public final C0843g f3497f;

    /* renamed from: g */
    public final int f3498g;

    /* renamed from: h */
    public final C0834d f3499h;

    /* renamed from: androidx.emoji2.text.f$a */
    public static final class C0837a extends C0838b {

        /* renamed from: b */
        public volatile C0849j f3500b;

        /* renamed from: c */
        public volatile C0857n f3501c;

        public C0837a(C0836f fVar) {
            super(fVar);
        }
    }

    /* renamed from: androidx.emoji2.text.f$b */
    public static class C0838b {

        /* renamed from: a */
        public final C0836f f3502a;

        public C0838b(C0836f fVar) {
            this.f3502a = fVar;
        }
    }

    /* renamed from: androidx.emoji2.text.f$c */
    public static abstract class C0839c {

        /* renamed from: a */
        public final C0843g f3503a;

        /* renamed from: b */
        public int f3504b = 0;

        /* renamed from: c */
        public C0834d f3505c = new C0834d();

        public C0839c(C0843g gVar) {
            this.f3503a = gVar;
        }
    }

    /* renamed from: androidx.emoji2.text.f$d */
    public interface C0840d {
    }

    /* renamed from: androidx.emoji2.text.f$e */
    public static abstract class C0841e {
        /* renamed from: a */
        public void mo1909a() {
        }

        /* renamed from: b */
        public void mo1910b() {
        }
    }

    /* renamed from: androidx.emoji2.text.f$f */
    public static class C0842f implements Runnable {

        /* renamed from: b */
        public final ArrayList f3506b;

        /* renamed from: c */
        public final int f3507c;

        public C0842f(List list, int i, Throwable th) {
            C24361g.m61185s(list, "initCallbacks cannot be null");
            this.f3506b = new ArrayList(list);
            this.f3507c = i;
        }

        public final void run() {
            int size = this.f3506b.size();
            int i = 0;
            if (this.f3507c != 1) {
                while (i < size) {
                    ((C0841e) this.f3506b.get(i)).mo1909a();
                    i++;
                }
                return;
            }
            while (i < size) {
                ((C0841e) this.f3506b.get(i)).mo1910b();
                i++;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.f$g */
    public interface C0843g {
        /* renamed from: a */
        void mo3613a(C0844h hVar);
    }

    /* renamed from: androidx.emoji2.text.f$h */
    public static abstract class C0844h {
        /* renamed from: a */
        public abstract void mo3617a(Throwable th);

        /* renamed from: b */
        public abstract void mo3618b(C0857n nVar);
    }

    /* renamed from: androidx.emoji2.text.f$i */
    public static class C0845i {
    }

    public C0836f(EmojiCompatInitializer.C0825a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f3492a = reentrantReadWriteLock;
        C0843g gVar = aVar.f3503a;
        this.f3497f = gVar;
        int i = aVar.f3504b;
        this.f3498g = i;
        this.f3499h = aVar.f3505c;
        this.f3495d = new Handler(Looper.getMainLooper());
        this.f3493b = new C6304d();
        C0837a aVar2 = new C0837a(this);
        this.f3496e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f3494c = 0;
            } catch (Throwable th) {
                this.f3492a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (mo3619b() == 0) {
            try {
                gVar.mo3613a(new C0835e(aVar2));
            } catch (Throwable th2) {
                aVar2.f3502a.mo3621d(th2);
            }
        }
    }

    /* renamed from: a */
    public static C0836f m2528a() {
        C0836f fVar;
        boolean z;
        synchronized (f3490i) {
            fVar = f3491j;
            if (fVar != null) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61193w("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z);
        }
        return fVar;
    }

    /* renamed from: b */
    public final int mo3619b() {
        this.f3492a.readLock().lock();
        try {
            return this.f3494c;
        } finally {
            this.f3492a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void mo3620c() {
        boolean z;
        boolean z2 = true;
        if (this.f3498g == 1) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z);
        if (mo3619b() != 1) {
            z2 = false;
        }
        if (!z2) {
            this.f3492a.writeLock().lock();
            try {
                if (this.f3494c != 0) {
                    this.f3494c = 0;
                    this.f3492a.writeLock().unlock();
                    C0837a aVar = this.f3496e;
                    aVar.getClass();
                    try {
                        aVar.f3502a.f3497f.mo3613a(new C0835e(aVar));
                    } catch (Throwable th) {
                        aVar.f3502a.mo3621d(th);
                    }
                }
            } finally {
                this.f3492a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final void mo3621d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3492a.writeLock().lock();
        try {
            this.f3494c = 2;
            arrayList.addAll(this.f3493b);
            this.f3493b.clear();
            this.f3492a.writeLock().unlock();
            this.f3495d.post(new C0842f(arrayList, this.f3494c, th));
        } catch (Throwable th2) {
            this.f3492a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final void mo3622e() {
        ArrayList arrayList = new ArrayList();
        this.f3492a.writeLock().lock();
        try {
            this.f3494c = 1;
            arrayList.addAll(this.f3493b);
            this.f3493b.clear();
            this.f3492a.writeLock().unlock();
            this.f3495d.post(new C0842f(arrayList, this.f3494c, (Throwable) null));
        } catch (Throwable th) {
            this.f3492a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017c, code lost:
        ((androidx.emoji2.text.C0859o) r2).mo3647b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ed, code lost:
        if (r7.mo3631b(r2, r11, r0, r10.f3524d.f3545b) != false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ef, code lost:
        if (r3 != null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f1, code lost:
        r3 = new androidx.emoji2.text.C0864s((android.text.Spannable) new android.text.SpannableString(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fb, code lost:
        r4 = r10.f3524d.f3545b;
        r7.f3518a.getClass();
        r3.setSpan(new androidx.emoji2.text.C0861p(r4), r11, r0, 33);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0177, code lost:
        if (r8 != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017a, code lost:
        if (r8 == false) goto L_0x0182;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009b A[Catch:{ all -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b7 A[Catch:{ all -> 0x0184 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence mo3623f(int r17, int r18, java.lang.CharSequence r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r16.mo3619b()
            r5 = 1
            if (r3 != r5) goto L_0x000f
            r3 = 1
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            java.lang.String r6 = "Not initialized yet"
            mf0.C24361g.m61193w(r6, r3)
            if (r0 < 0) goto L_0x019b
            if (r1 < 0) goto L_0x0191
            if (r0 > r1) goto L_0x001d
            r3 = 1
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            java.lang.String r6 = "start should be <= than end"
            mf0.C24361g.m61177o(r3, r6)
            r3 = 0
            if (r2 != 0) goto L_0x0027
            return r3
        L_0x0027:
            int r6 = r19.length()
            if (r0 > r6) goto L_0x002f
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            java.lang.String r7 = "start should be < than charSequence length"
            mf0.C24361g.m61177o(r6, r7)
            int r6 = r19.length()
            if (r1 > r6) goto L_0x003d
            r6 = 1
            goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            java.lang.String r7 = "end should be < than charSequence length"
            mf0.C24361g.m61177o(r6, r7)
            int r6 = r19.length()
            if (r6 == 0) goto L_0x018e
            if (r0 != r1) goto L_0x004d
            goto L_0x018e
        L_0x004d:
            r6 = r16
            androidx.emoji2.text.f$a r7 = r6.f3496e
            androidx.emoji2.text.j r7 = r7.f3500b
            r7.getClass()
            boolean r8 = r2 instanceof androidx.emoji2.text.C0859o
            if (r8 == 0) goto L_0x0060
            r9 = r2
            androidx.emoji2.text.o r9 = (androidx.emoji2.text.C0859o) r9
            r9.mo3642a()
        L_0x0060:
            if (r8 != 0) goto L_0x0080
            boolean r9 = r2 instanceof android.text.Spannable     // Catch:{ all -> 0x0184 }
            if (r9 == 0) goto L_0x0067
            goto L_0x0080
        L_0x0067:
            boolean r9 = r2 instanceof android.text.Spanned     // Catch:{ all -> 0x0184 }
            if (r9 == 0) goto L_0x0088
            r9 = r2
            android.text.Spanned r9 = (android.text.Spanned) r9     // Catch:{ all -> 0x0184 }
            int r10 = r0 + -1
            int r11 = r1 + 1
            java.lang.Class<androidx.emoji2.text.k> r12 = androidx.emoji2.text.C0851k.class
            int r9 = r9.nextSpanTransition(r10, r11, r12)     // Catch:{ all -> 0x0184 }
            if (r9 > r1) goto L_0x0088
            androidx.emoji2.text.s r3 = new androidx.emoji2.text.s     // Catch:{ all -> 0x0184 }
            r3.<init>((java.lang.CharSequence) r2)     // Catch:{ all -> 0x0184 }
            goto L_0x0088
        L_0x0080:
            androidx.emoji2.text.s r3 = new androidx.emoji2.text.s     // Catch:{ all -> 0x0184 }
            r9 = r2
            android.text.Spannable r9 = (android.text.Spannable) r9     // Catch:{ all -> 0x0184 }
            r3.<init>((android.text.Spannable) r9)     // Catch:{ all -> 0x0184 }
        L_0x0088:
            if (r3 == 0) goto L_0x00b5
            java.lang.Class<androidx.emoji2.text.k> r9 = androidx.emoji2.text.C0851k.class
            java.lang.Object[] r9 = r3.getSpans(r0, r1, r9)     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.k[] r9 = (androidx.emoji2.text.C0851k[]) r9     // Catch:{ all -> 0x0184 }
            if (r9 == 0) goto L_0x00b5
            int r10 = r9.length     // Catch:{ all -> 0x0184 }
            if (r10 <= 0) goto L_0x00b5
            int r10 = r9.length     // Catch:{ all -> 0x0184 }
            r11 = 0
        L_0x0099:
            if (r11 >= r10) goto L_0x00b5
            r12 = r9[r11]     // Catch:{ all -> 0x0184 }
            int r13 = r3.getSpanStart(r12)     // Catch:{ all -> 0x0184 }
            int r14 = r3.getSpanEnd(r12)     // Catch:{ all -> 0x0184 }
            if (r13 == r1) goto L_0x00aa
            r3.removeSpan(r12)     // Catch:{ all -> 0x0184 }
        L_0x00aa:
            int r0 = java.lang.Math.min(r13, r0)     // Catch:{ all -> 0x0184 }
            int r1 = java.lang.Math.max(r14, r1)     // Catch:{ all -> 0x0184 }
            int r11 = r11 + 1
            goto L_0x0099
        L_0x00b5:
            if (r0 == r1) goto L_0x017a
            int r9 = r19.length()     // Catch:{ all -> 0x0184 }
            if (r0 < r9) goto L_0x00bf
            goto L_0x017a
        L_0x00bf:
            r9 = 2147483647(0x7fffffff, float:NaN)
            androidx.emoji2.text.j$a r10 = new androidx.emoji2.text.j$a     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.n r11 = r7.f3519b     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.n$a r11 = r11.f3542c     // Catch:{ all -> 0x0184 }
            r10.<init>(r11)     // Catch:{ all -> 0x0184 }
            int r11 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0184 }
            r12 = 0
        L_0x00d0:
            r13 = r11
        L_0x00d1:
            r11 = r0
        L_0x00d2:
            r14 = 2
            r15 = 33
            if (r0 >= r1) goto L_0x012c
            if (r12 >= r9) goto L_0x012c
            int r4 = r10.mo3632a(r13)     // Catch:{ all -> 0x0184 }
            if (r4 == r5) goto L_0x011c
            if (r4 == r14) goto L_0x0110
            r14 = 3
            if (r4 == r14) goto L_0x00e5
            goto L_0x00d2
        L_0x00e5:
            androidx.emoji2.text.n$a r4 = r10.f3524d     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.i r4 = r4.f3545b     // Catch:{ all -> 0x0184 }
            boolean r4 = r7.mo3631b(r2, r11, r0, r4)     // Catch:{ all -> 0x0184 }
            if (r4 != 0) goto L_0x010e
            if (r3 != 0) goto L_0x00fb
            androidx.emoji2.text.s r3 = new androidx.emoji2.text.s     // Catch:{ all -> 0x0184 }
            android.text.SpannableString r4 = new android.text.SpannableString     // Catch:{ all -> 0x0184 }
            r4.<init>(r2)     // Catch:{ all -> 0x0184 }
            r3.<init>((android.text.Spannable) r4)     // Catch:{ all -> 0x0184 }
        L_0x00fb:
            androidx.emoji2.text.n$a r4 = r10.f3524d     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.i r4 = r4.f3545b     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.f$i r14 = r7.f3518a     // Catch:{ all -> 0x0184 }
            r14.getClass()     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.p r14 = new androidx.emoji2.text.p     // Catch:{ all -> 0x0184 }
            r14.<init>(r4)     // Catch:{ all -> 0x0184 }
            r3.setSpan(r14, r11, r0, r15)     // Catch:{ all -> 0x0184 }
            int r12 = r12 + 1
        L_0x010e:
            r11 = r13
            goto L_0x00d0
        L_0x0110:
            int r4 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x0184 }
            int r0 = r0 + r4
            if (r0 >= r1) goto L_0x00d2
            int r13 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0184 }
            goto L_0x00d2
        L_0x011c:
            int r0 = java.lang.Character.codePointAt(r2, r11)     // Catch:{ all -> 0x0184 }
            int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x0184 }
            int r0 = r0 + r11
            if (r0 >= r1) goto L_0x00d1
            int r13 = java.lang.Character.codePointAt(r2, r0)     // Catch:{ all -> 0x0184 }
            goto L_0x00d1
        L_0x012c:
            int r1 = r10.f3521a     // Catch:{ all -> 0x0184 }
            if (r1 != r14) goto L_0x0142
            androidx.emoji2.text.n$a r1 = r10.f3523c     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.i r1 = r1.f3545b     // Catch:{ all -> 0x0184 }
            if (r1 == 0) goto L_0x0142
            int r1 = r10.f3526f     // Catch:{ all -> 0x0184 }
            if (r1 > r5) goto L_0x0140
            boolean r1 = r10.mo3634c()     // Catch:{ all -> 0x0184 }
            if (r1 == 0) goto L_0x0142
        L_0x0140:
            r4 = 1
            goto L_0x0143
        L_0x0142:
            r4 = 0
        L_0x0143:
            if (r4 == 0) goto L_0x016a
            if (r12 >= r9) goto L_0x016a
            androidx.emoji2.text.n$a r1 = r10.f3523c     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.i r1 = r1.f3545b     // Catch:{ all -> 0x0184 }
            boolean r1 = r7.mo3631b(r2, r11, r0, r1)     // Catch:{ all -> 0x0184 }
            if (r1 != 0) goto L_0x016a
            if (r3 != 0) goto L_0x0159
            androidx.emoji2.text.s r1 = new androidx.emoji2.text.s     // Catch:{ all -> 0x0184 }
            r1.<init>((java.lang.CharSequence) r2)     // Catch:{ all -> 0x0184 }
            r3 = r1
        L_0x0159:
            androidx.emoji2.text.n$a r1 = r10.f3523c     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.i r1 = r1.f3545b     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.f$i r4 = r7.f3518a     // Catch:{ all -> 0x0184 }
            r4.getClass()     // Catch:{ all -> 0x0184 }
            androidx.emoji2.text.p r4 = new androidx.emoji2.text.p     // Catch:{ all -> 0x0184 }
            r4.<init>(r1)     // Catch:{ all -> 0x0184 }
            r3.setSpan(r4, r11, r0, r15)     // Catch:{ all -> 0x0184 }
        L_0x016a:
            if (r3 == 0) goto L_0x0177
            android.text.Spannable r0 = r3.f3551c     // Catch:{ all -> 0x0184 }
            if (r8 == 0) goto L_0x0183
            r1 = r2
            androidx.emoji2.text.o r1 = (androidx.emoji2.text.C0859o) r1
            r1.mo3647b()
            goto L_0x0183
        L_0x0177:
            if (r8 == 0) goto L_0x0182
            goto L_0x017c
        L_0x017a:
            if (r8 == 0) goto L_0x0182
        L_0x017c:
            r0 = r2
            androidx.emoji2.text.o r0 = (androidx.emoji2.text.C0859o) r0
            r0.mo3647b()
        L_0x0182:
            r0 = r2
        L_0x0183:
            return r0
        L_0x0184:
            r0 = move-exception
            if (r8 == 0) goto L_0x018d
            r1 = r2
            androidx.emoji2.text.o r1 = (androidx.emoji2.text.C0859o) r1
            r1.mo3647b()
        L_0x018d:
            throw r0
        L_0x018e:
            r6 = r16
            return r2
        L_0x0191:
            r6 = r16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "end cannot be negative"
            r0.<init>(r1)
            throw r0
        L_0x019b:
            r6 = r16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "start cannot be negative"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0836f.mo3623f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* renamed from: g */
    public final void mo3624g(C0841e eVar) {
        C24361g.m61185s(eVar, "initCallback cannot be null");
        this.f3492a.writeLock().lock();
        try {
            if (this.f3494c != 1) {
                if (this.f3494c != 2) {
                    this.f3493b.add(eVar);
                }
            }
            this.f3495d.post(new C0842f(Arrays.asList(new C0841e[]{eVar}), this.f3494c, (Throwable) null));
        } finally {
            this.f3492a.writeLock().unlock();
        }
    }
}
