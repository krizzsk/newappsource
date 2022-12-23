package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: androidx.emoji2.text.c */
public final class C0830c {

    /* renamed from: androidx.emoji2.text.c$a */
    public static class C0831a {
        /* renamed from: a */
        public Signature[] mo3616a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    public static class C0832b extends C0831a {
    }

    /* renamed from: androidx.emoji2.text.c$c */
    public static class C0833c extends C0832b {
        /* renamed from: a */
        public final Signature[] mo3616a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.emoji2.text.C0852l m2523a(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000c
            androidx.emoji2.text.c$c r0 = new androidx.emoji2.text.c$c
            r0.<init>()
            goto L_0x0011
        L_0x000c:
            androidx.emoji2.text.c$b r0 = new androidx.emoji2.text.c$b
            r0.<init>()
        L_0x0011:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            mf0.C24361g.m61185s(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x004a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            r6 = 1
            if (r4 == 0) goto L_0x0046
            android.content.pm.ApplicationInfo r7 = r4.applicationInfo
            if (r7 == 0) goto L_0x0046
            int r7 = r7.flags
            r7 = r7 & r6
            if (r7 != r6) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            if (r6 == 0) goto L_0x002a
            goto L_0x004b
        L_0x004a:
            r4 = r5
        L_0x004b:
            if (r4 != 0) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            java.lang.String r2 = r4.authority     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0076 }
            android.content.pm.Signature[] r0 = r0.mo3616a(r1, r4)     // Catch:{ NameNotFoundException -> 0x0076 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0076 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0076 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0076 }
        L_0x005c:
            if (r3 >= r6) goto L_0x006a
            r7 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0076 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0076 }
            r1.add(r7)     // Catch:{ NameNotFoundException -> 0x0076 }
            int r3 = r3 + 1
            goto L_0x005c
        L_0x006a:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ NameNotFoundException -> 0x0076 }
            o1.f r1 = new o1.f     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x007d
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
        L_0x007c:
            r1 = r5
        L_0x007d:
            if (r1 != 0) goto L_0x0080
            goto L_0x0085
        L_0x0080:
            androidx.emoji2.text.l r5 = new androidx.emoji2.text.l
            r5.<init>(r8, r1)
        L_0x0085:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0830c.m2523a(android.content.Context):androidx.emoji2.text.l");
    }
}
