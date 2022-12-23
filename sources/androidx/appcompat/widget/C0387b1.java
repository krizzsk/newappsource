package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p114i.C5220f;
import p293w1.C6968c;

/* renamed from: androidx.appcompat.widget.b1 */
public final class C0387b1 extends C6968c implements View.OnClickListener {

    /* renamed from: y */
    public static final /* synthetic */ int f1441y = 0;

    /* renamed from: l */
    public final SearchView f1442l;

    /* renamed from: m */
    public final SearchableInfo f1443m;

    /* renamed from: n */
    public final Context f1444n;

    /* renamed from: o */
    public final WeakHashMap<String, Drawable.ConstantState> f1445o;

    /* renamed from: p */
    public final int f1446p;

    /* renamed from: q */
    public int f1447q = 1;

    /* renamed from: r */
    public ColorStateList f1448r;

    /* renamed from: s */
    public int f1449s = -1;

    /* renamed from: t */
    public int f1450t = -1;

    /* renamed from: u */
    public int f1451u = -1;

    /* renamed from: v */
    public int f1452v = -1;

    /* renamed from: w */
    public int f1453w = -1;

    /* renamed from: x */
    public int f1454x = -1;

    /* renamed from: androidx.appcompat.widget.b1$a */
    public static final class C0388a {

        /* renamed from: a */
        public final TextView f1455a;

        /* renamed from: b */
        public final TextView f1456b;

        /* renamed from: c */
        public final ImageView f1457c;

        /* renamed from: d */
        public final ImageView f1458d;

        /* renamed from: e */
        public final ImageView f1459e;

        public C0388a(View view) {
            this.f1455a = (TextView) view.findViewById(16908308);
            this.f1456b = (TextView) view.findViewById(16908309);
            this.f1457c = (ImageView) view.findViewById(16908295);
            this.f1458d = (ImageView) view.findViewById(16908296);
            this.f1459e = (ImageView) view.findViewById(C5220f.edit_query);
        }
    }

    public C0387b1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f1442l = searchView;
        this.f1443m = searchableInfo;
        this.f1446p = searchView.getSuggestionCommitIconResId();
        this.f1444n = context;
        this.f1445o = weakHashMap;
    }

    /* renamed from: i */
    public static String m956i(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2041a(android.view.View r19, android.database.Cursor r20) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            java.lang.Object r0 = r19.getTag()
            r3 = r0
            androidx.appcompat.widget.b1$a r3 = (androidx.appcompat.widget.C0387b1.C0388a) r3
            int r0 = r1.f1454x
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            android.widget.TextView r0 = r3.f1455a
            r7 = 8
            if (r0 == 0) goto L_0x0036
            int r0 = r1.f1449s
            java.lang.String r0 = m956i(r2, r0)
            android.widget.TextView r8 = r3.f1455a
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
            r8.setVisibility(r7)
            goto L_0x0036
        L_0x0033:
            r8.setVisibility(r5)
        L_0x0036:
            android.widget.TextView r0 = r3.f1456b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00be
            int r0 = r1.f1451u
            java.lang.String r0 = m956i(r2, r0)
            if (r0 == 0) goto L_0x0087
            android.content.res.ColorStateList r10 = r1.f1448r
            if (r10 != 0) goto L_0x0066
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.f1444n
            android.content.res.Resources$Theme r11 = r11.getTheme()
            int r12 = p114i.C5215a.textColorSearchUrl
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.f1444n
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.f1448r = r10
        L_0x0066:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.f1448r
            r16 = 0
            r17 = r11
            r11 = r15
            r4 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r4, r5, r0, r11)
            goto L_0x008d
        L_0x0087:
            int r0 = r1.f1450t
            java.lang.String r10 = m956i(r2, r0)
        L_0x008d:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x00a0
            android.widget.TextView r0 = r3.f1455a
            if (r0 == 0) goto L_0x00ac
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.f1455a
            r0.setMaxLines(r8)
            goto L_0x00ac
        L_0x00a0:
            android.widget.TextView r0 = r3.f1455a
            if (r0 == 0) goto L_0x00ac
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r3.f1455a
            r0.setMaxLines(r9)
        L_0x00ac:
            android.widget.TextView r0 = r3.f1456b
            r0.setText(r10)
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x00bb
            r0.setVisibility(r7)
            goto L_0x00be
        L_0x00bb:
            r0.setVisibility(r5)
        L_0x00be:
            android.widget.ImageView r4 = r3.f1457c
            r10 = 0
            if (r4 == 0) goto L_0x0157
            int r0 = r1.f1452v
            r11 = -1
            if (r0 != r11) goto L_0x00cb
            r0 = r10
            goto L_0x0144
        L_0x00cb:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.mo2046g(r0)
            if (r0 == 0) goto L_0x00d7
            goto L_0x0144
        L_0x00d7:
            android.app.SearchableInfo r0 = r1.f1443m
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.f1445o
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x0100
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f1445o
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f5
            r0 = r10
            goto L_0x0137
        L_0x00f5:
            android.content.Context r11 = r1.f1444n
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r11)
            goto L_0x0137
        L_0x0100:
            android.content.Context r12 = r1.f1444n
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x0123 }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x0113
            goto L_0x0128
        L_0x0113:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x0129
            r0.flattenToShortString()
            goto L_0x0128
        L_0x0123:
            r0 = move-exception
            r12 = r0
            r12.toString()
        L_0x0128:
            r12 = r10
        L_0x0129:
            if (r12 != 0) goto L_0x012d
            r0 = r10
            goto L_0x0131
        L_0x012d:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x0131:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r1.f1445o
            r13.put(r11, r0)
            r0 = r12
        L_0x0137:
            if (r0 == 0) goto L_0x013a
            goto L_0x0144
        L_0x013a:
            android.content.Context r0 = r1.f1444n
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0144:
            r11 = 4
            r4.setImageDrawable(r0)
            if (r0 != 0) goto L_0x014e
            r4.setVisibility(r11)
            goto L_0x0157
        L_0x014e:
            r4.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r9, r5)
        L_0x0157:
            android.widget.ImageView r0 = r3.f1458d
            if (r0 == 0) goto L_0x017b
            int r4 = r1.f1453w
            r11 = -1
            if (r4 != r11) goto L_0x0161
            goto L_0x0169
        L_0x0161:
            java.lang.String r2 = r2.getString(r4)
            android.graphics.drawable.Drawable r10 = r1.mo2046g(r2)
        L_0x0169:
            r0.setImageDrawable(r10)
            if (r10 != 0) goto L_0x0172
            r0.setVisibility(r7)
            goto L_0x017b
        L_0x0172:
            r0.setVisibility(r5)
            r10.setVisible(r5, r5)
            r10.setVisible(r9, r5)
        L_0x017b:
            int r0 = r1.f1447q
            if (r0 == r8) goto L_0x018c
            if (r0 != r9) goto L_0x0186
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0186
            goto L_0x018c
        L_0x0186:
            android.widget.ImageView r0 = r3.f1459e
            r0.setVisibility(r7)
            goto L_0x01a1
        L_0x018c:
            android.widget.ImageView r0 = r3.f1459e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.f1459e
            android.widget.TextView r2 = r3.f1455a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f1459e
            r0.setOnClickListener(r1)
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0387b1.mo2041a(android.view.View, android.database.Cursor):void");
    }

    /* renamed from: b */
    public final void mo2042b(Cursor cursor) {
        try {
            super.mo2042b(cursor);
            if (cursor != null) {
                this.f1449s = cursor.getColumnIndex("suggest_text_1");
                this.f1450t = cursor.getColumnIndex("suggest_text_2");
                this.f1451u = cursor.getColumnIndex("suggest_text_2_url");
                this.f1452v = cursor.getColumnIndex("suggest_icon_1");
                this.f1453w = cursor.getColumnIndex("suggest_icon_2");
                this.f1454x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final String mo2043c(Cursor cursor) {
        String i;
        String i2;
        if (cursor == null) {
            return null;
        }
        String i3 = m956i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i3 != null) {
            return i3;
        }
        if (this.f1443m.shouldRewriteQueryFromData() && (i2 = m956i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i2;
        }
        if (!this.f1443m.shouldRewriteQueryFromText() || (i = m956i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i;
    }

    /* renamed from: d */
    public final View mo2044d(ViewGroup viewGroup) {
        View inflate = this.f21731k.inflate(this.f21729i, viewGroup, false);
        inflate.setTag(new C0388a(inflate));
        ((ImageView) inflate.findViewById(C5220f.edit_query)).setImageResource(this.f1446p);
        return inflate;
    }

    /* renamed from: f */
    public final Drawable mo2045f(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1444n.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:44|45|46|47|48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:37|38|39|40|41|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00af */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x00b9=Splitter:B:47:0x00b9, B:30:0x007f=Splitter:B:30:0x007f, B:41:0x00af=Splitter:B:41:0x00af} */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo2046g(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x00e6
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x00e6
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0013
            goto L_0x00e6
        L_0x0013:
            int r1 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r3 = "android.resource://"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.content.Context r3 = r5.f1444n     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r2.append(r1)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f1445o     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            if (r3 != 0) goto L_0x0042
            r3 = r0
            goto L_0x0046
        L_0x0042:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
        L_0x0046:
            if (r3 == 0) goto L_0x0049
            return r3
        L_0x0049:
            android.content.Context r3 = r5.f1444n     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.graphics.drawable.Drawable r1 = p090g1.C4732a.getDrawable(r3, r1)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            if (r1 == 0) goto L_0x005a
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r3 = r5.f1445o     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            android.graphics.drawable.Drawable$ConstantState r4 = r1.getConstantState()     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
            r3.put(r2, r4)     // Catch:{ NumberFormatException -> 0x005c, NotFoundException -> 0x005b }
        L_0x005a:
            return r1
        L_0x005b:
            return r0
        L_0x005c:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f1445o
            java.lang.Object r1 = r1.get(r6)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 != 0) goto L_0x0068
            r1 = r0
            goto L_0x006c
        L_0x0068:
            android.graphics.drawable.Drawable r1 = r1.newDrawable()
        L_0x006c:
            if (r1 == 0) goto L_0x006f
            return r1
        L_0x006f:
            android.net.Uri r1 = android.net.Uri.parse(r6)
            java.lang.String r2 = r1.getScheme()     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)     // Catch:{ FileNotFoundException -> 0x00d4 }
            if (r2 == 0) goto L_0x009b
            android.graphics.drawable.Drawable r0 = r5.mo2045f(r1)     // Catch:{ NotFoundException -> 0x0084 }
            goto L_0x00db
        L_0x0084:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d4 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00d4 }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00d4 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d4 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x009b:
            android.content.Context r2 = r5.f1444n     // Catch:{ FileNotFoundException -> 0x00d4 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.io.InputStream r2 = r2.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x00d4 }
            if (r2 == 0) goto L_0x00bd
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r2, r0)     // Catch:{ all -> 0x00b4 }
            r2.close()     // Catch:{ IOException -> 0x00af }
            goto L_0x00b2
        L_0x00af:
            r1.toString()     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x00b2:
            r0 = r3
            goto L_0x00db
        L_0x00b4:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00bc
        L_0x00b9:
            r1.toString()     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x00bc:
            throw r3     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x00bd:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d4 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x00d4 }
            r3.append(r1)     // Catch:{ FileNotFoundException -> 0x00d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x00d4 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00d4 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00d4 }
        L_0x00d4:
            r2 = move-exception
            java.util.Objects.toString(r1)
            r2.getMessage()
        L_0x00db:
            if (r0 == 0) goto L_0x00e6
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r5.f1445o
            android.graphics.drawable.Drawable$ConstantState r2 = r0.getConstantState()
            r1.put(r6, r2)
        L_0x00e6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0387b1.mo2046g(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.f21731k.inflate(this.f21730j, viewGroup, false);
            if (inflate != null) {
                ((C0388a) inflate.getTag()).f1455a.setText(e.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View d = mo2044d(viewGroup);
            ((C0388a) d.getTag()).f1455a.setText(e.toString());
            return d;
        }
    }

    /* renamed from: h */
    public final Cursor mo2049h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        Uri build = fragment.build();
        return this.f1444n.getContentResolver().query(build, (String[]) null, suggestSelection, strArr, (String) null);
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f21721d;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f21721d;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1442l.mo1786p((CharSequence) tag);
        }
    }
}
