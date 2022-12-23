package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.C0836f;
import androidx.emoji2.text.C0857n;
import p003a2.C0046a;

/* renamed from: androidx.emoji2.text.j */
public final class C0849j {

    /* renamed from: a */
    public final C0836f.C0845i f3518a;

    /* renamed from: b */
    public final C0857n f3519b;

    /* renamed from: c */
    public C0836f.C0840d f3520c;

    /* renamed from: androidx.emoji2.text.j$a */
    public static final class C0850a {

        /* renamed from: a */
        public int f3521a = 1;

        /* renamed from: b */
        public final C0857n.C0858a f3522b;

        /* renamed from: c */
        public C0857n.C0858a f3523c;

        /* renamed from: d */
        public C0857n.C0858a f3524d;

        /* renamed from: e */
        public int f3525e;

        /* renamed from: f */
        public int f3526f;

        public C0850a(C0857n.C0858a aVar) {
            this.f3522b = aVar;
            this.f3523c = aVar;
        }

        /* renamed from: a */
        public final int mo3632a(int i) {
            C0857n.C0858a aVar;
            boolean z;
            SparseArray<C0857n.C0858a> sparseArray = this.f3523c.f3544a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i);
            }
            int i2 = 3;
            if (this.f3521a != 2) {
                if (aVar == null) {
                    mo3633b();
                    i2 = 1;
                    this.f3525e = i;
                    return i2;
                }
                this.f3521a = 2;
                this.f3523c = aVar;
                this.f3526f = 1;
            } else if (aVar != null) {
                this.f3523c = aVar;
                this.f3526f++;
            } else {
                boolean z2 = false;
                if (i == 65038) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    mo3633b();
                } else {
                    if (i == 65039) {
                        z2 = true;
                    }
                    if (!z2) {
                        C0857n.C0858a aVar2 = this.f3523c;
                        if (aVar2.f3545b != null) {
                            if (this.f3526f != 1) {
                                this.f3524d = aVar2;
                                mo3633b();
                            } else if (mo3634c()) {
                                this.f3524d = this.f3523c;
                                mo3633b();
                            } else {
                                mo3633b();
                            }
                            this.f3525e = i;
                            return i2;
                        }
                        mo3633b();
                    }
                }
                i2 = 1;
                this.f3525e = i;
                return i2;
            }
            i2 = 2;
            this.f3525e = i;
            return i2;
        }

        /* renamed from: b */
        public final void mo3633b() {
            this.f3521a = 1;
            this.f3523c = this.f3522b;
            this.f3526f = 0;
        }

        /* renamed from: c */
        public final boolean mo3634c() {
            boolean z;
            boolean z2;
            C0046a c = this.f3523c.f3545b.mo3629c();
            int a = c.mo24a(6);
            if (a == 0 || c.f51b.get(a + c.f50a) == 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
            if (this.f3525e == 65039) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            return false;
        }
    }

    public C0849j(C0857n nVar, C0836f.C0845i iVar, C0834d dVar) {
        this.f3518a = iVar;
        this.f3519b = nVar;
        this.f3520c = dVar;
    }

    /* renamed from: a */
    public static boolean m2545a(Editable editable, KeyEvent keyEvent, boolean z) {
        boolean z2;
        C0851k[] kVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && (kVarArr = (C0851k[]) editable.getSpans(selectionStart, selectionEnd, C0851k.class)) != null && kVarArr.length > 0) {
            int length = kVarArr.length;
            int i = 0;
            while (i < length) {
                C0851k kVar = kVarArr[i];
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (r6 >= r7) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0108  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3631b(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.C0848i r13) {
        /*
            r9 = this;
            int r0 = r13.f3517c
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x010b
            androidx.emoji2.text.f$d r0 = r9.f3520c
            a2.a r4 = r13.mo3629c()
            r5 = 8
            int r5 = r4.mo24a(r5)
            if (r5 == 0) goto L_0x001f
            java.nio.ByteBuffer r6 = r4.f51b
            int r4 = r4.f50a
            int r5 = r5 + r4
            short r4 = r6.getShort(r5)
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            androidx.emoji2.text.d r0 = (androidx.emoji2.text.C0834d) r0
            r0.getClass()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 >= r6) goto L_0x002f
            if (r4 <= r5) goto L_0x002f
            goto L_0x00b8
        L_0x002f:
            java.lang.ThreadLocal<java.lang.StringBuilder> r4 = androidx.emoji2.text.C0834d.f3487b
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L_0x003f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4.set(r5)
        L_0x003f:
            java.lang.Object r4 = r4.get()
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.setLength(r2)
        L_0x0048:
            if (r11 >= r12) goto L_0x0054
            char r5 = r10.charAt(r11)
            r4.append(r5)
            int r11 = r11 + 1
            goto L_0x0048
        L_0x0054:
            android.text.TextPaint r10 = r0.f3488a
            java.lang.String r11 = r4.toString()
            java.lang.ThreadLocal<r1.c<android.graphics.Rect, android.graphics.Rect>> r12 = p129j1.C5351c.f17650a
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r6) goto L_0x0066
            boolean r10 = p129j1.C5351c.C5352a.m13422a(r10, r11)
            goto L_0x0104
        L_0x0066:
            int r12 = r11.length()
            if (r12 != r3) goto L_0x0077
            char r0 = r11.charAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0077
            goto L_0x00be
        L_0x0077:
            java.lang.String r0 = "󟿽"
            float r4 = r10.measureText(r0)
            java.lang.String r5 = "m"
            float r5 = r10.measureText(r5)
            float r6 = r10.measureText(r11)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 != 0) goto L_0x008e
            goto L_0x00b8
        L_0x008e:
            int r8 = r11.length()
            int r8 = r11.codePointCount(r2, r8)
            if (r8 <= r3) goto L_0x00ba
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r8
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a1
            goto L_0x00b8
        L_0x00a1:
            r5 = 0
        L_0x00a2:
            if (r5 >= r12) goto L_0x00b4
            int r8 = r11.codePointAt(r5)
            int r8 = java.lang.Character.charCount(r8)
            int r8 = r8 + r5
            float r5 = r10.measureText(r11, r5, r8)
            float r7 = r7 + r5
            r5 = r8
            goto L_0x00a2
        L_0x00b4:
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x00ba
        L_0x00b8:
            r10 = 0
            goto L_0x0104
        L_0x00ba:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00c0
        L_0x00be:
            r10 = 1
            goto L_0x0104
        L_0x00c0:
            java.lang.ThreadLocal<r1.c<android.graphics.Rect, android.graphics.Rect>> r4 = p129j1.C5351c.f17650a
            java.lang.Object r5 = r4.get()
            r1.c r5 = (p229r1.C6233c) r5
            if (r5 != 0) goto L_0x00dd
            r1.c r5 = new r1.c
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r5.<init>(r6, r7)
            r4.set(r5)
            goto L_0x00eb
        L_0x00dd:
            F r4 = r5.f19679a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
            S r4 = r5.f19680b
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
        L_0x00eb:
            F r4 = r5.f19679a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r10.getTextBounds(r0, r2, r1, r4)
            S r0 = r5.f19680b
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.getTextBounds(r11, r2, r12, r0)
            F r10 = r5.f19679a
            android.graphics.Rect r10 = (android.graphics.Rect) r10
            S r11 = r5.f19680b
            boolean r10 = r10.equals(r11)
            r10 = r10 ^ r3
        L_0x0104:
            if (r10 == 0) goto L_0x0108
            r10 = 2
            goto L_0x0109
        L_0x0108:
            r10 = 1
        L_0x0109:
            r13.f3517c = r10
        L_0x010b:
            int r10 = r13.f3517c
            if (r10 != r1) goto L_0x0110
            r2 = 1
        L_0x0110:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0849j.mo3631b(java.lang.CharSequence, int, int, androidx.emoji2.text.i):boolean");
    }
}
