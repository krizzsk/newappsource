package p750ql;

import android.graphics.Bitmap;
import com.masabi.justride.sdk.p415ui.configuration.screens.ticket.BarcodeFormat;
import p258t4.C6587a;
import p364al.C13487h;
import p558ih.C17600b;
import p583jk.C17873f;

/* renamed from: ql.b */
public final class C19135b {

    /* renamed from: a */
    public final C17873f f48653a;

    /* renamed from: ql.b$a */
    public static /* synthetic */ class C19136a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48654a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.masabi.justride.sdk.ui.configuration.screens.ticket.BarcodeFormat[] r0 = com.masabi.justride.sdk.p415ui.configuration.screens.ticket.BarcodeFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48654a = r0
                com.masabi.justride.sdk.ui.configuration.screens.ticket.BarcodeFormat r1 = com.masabi.justride.sdk.p415ui.configuration.screens.ticket.BarcodeFormat.QR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f48654a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.masabi.justride.sdk.ui.configuration.screens.ticket.BarcodeFormat r1 = com.masabi.justride.sdk.p415ui.configuration.screens.ticket.BarcodeFormat.AZTEC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p750ql.C19135b.C19136a.<clinit>():void");
        }
    }

    public C19135b(C17873f fVar) {
        this.f48653a = fVar;
    }

    /* renamed from: a */
    public final C13487h<Bitmap> mo51574a(String str, BarcodeFormat barcodeFormat, int i) {
        C17600b bVar;
        com.google.zxing.BarcodeFormat barcodeFormat2;
        int i2;
        if (C19136a.f48654a[barcodeFormat.ordinal()] != 1) {
            new C6587a
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: CONSTRUCTOR  (r10v6 ? I:t4.a) =  call: t4.a.<init>():void type: CONSTRUCTOR in method: ql.b.a(java.lang.String, com.masabi.justride.sdk.ui.configuration.screens.ticket.BarcodeFormat, int):al.h<android.graphics.Bitmap>, dex: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v6 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                this = this;
                int[] r0 = p750ql.C19135b.C19136a.f48654a
                int r10 = r10.ordinal()
                r10 = r0[r10]
                r0 = 1
                if (r10 == r0) goto L_0x0013
                t4.a r10 = new t4.a
                r10.<init>()
                com.google.zxing.BarcodeFormat r0 = com.google.zxing.BarcodeFormat.AZTEC
                goto L_0x001a
            L_0x0013:
                ih.b r10 = new ih.b
                r10.<init>()
                com.google.zxing.BarcodeFormat r0 = com.google.zxing.BarcodeFormat.QR_CODE
            L_0x001a:
                r1 = r10
                r3 = r0
                r5 = 0
                r10 = 0
                java.util.HashMap r6 = new java.util.HashMap     // Catch:{ WriterException -> 0x006e }
                r6.<init>()     // Catch:{ WriterException -> 0x006e }
                com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.CHARACTER_SET     // Catch:{ WriterException -> 0x006e }
                java.lang.String r2 = "ISO_8859_1"
                r6.put(r0, r2)     // Catch:{ WriterException -> 0x006e }
                com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.MARGIN     // Catch:{ WriterException -> 0x006e }
                r7 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ WriterException -> 0x006e }
                r6.put(r0, r2)     // Catch:{ WriterException -> 0x006e }
                r2 = r9
                r4 = r5
                ch.b r9 = r1.mo22696i(r2, r3, r4, r5, r6)     // Catch:{ WriterException -> 0x006e }
                int r0 = r9.f34027b     // Catch:{ WriterException -> 0x006e }
                int r1 = r9.f34028c     // Catch:{ WriterException -> 0x006e }
                android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ WriterException -> 0x006e }
                android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)     // Catch:{ WriterException -> 0x006e }
                r3 = 0
            L_0x0045:
                if (r3 >= r0) goto L_0x005d
                r4 = 0
            L_0x0048:
                if (r4 >= r1) goto L_0x005a
                boolean r5 = r9.mo40764b(r3, r4)     // Catch:{ WriterException -> 0x006e }
                if (r5 == 0) goto L_0x0053
                r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                goto L_0x0054
            L_0x0053:
                r5 = -1
            L_0x0054:
                r2.setPixel(r3, r4, r5)     // Catch:{ WriterException -> 0x006e }
                int r4 = r4 + 1
                goto L_0x0048
            L_0x005a:
                int r3 = r3 + 1
                goto L_0x0045
            L_0x005d:
                int r9 = r11 / r0
                int r9 = r9 * r0
                int r11 = r11 / r1
                int r11 = r11 * r1
                android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r2, r9, r11, r7)     // Catch:{ WriterException -> 0x006e }
                al.h r11 = new al.h     // Catch:{ WriterException -> 0x006e }
                r11.<init>(r9, r10)     // Catch:{ WriterException -> 0x006e }
                goto L_0x0088
            L_0x006e:
                r9 = move-exception
                jk.f r11 = r8.f48653a
                r11.getClass()
                pj.a r9 = p583jk.C17873f.m44275b(r9)
                r11 = 108(0x6c, float:1.51E-43)
                ek.d r0 = new ek.d
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r0.<init>((java.lang.Integer) r11, (p725pj.C18926a) r9)
                al.h r11 = new al.h
                r11.<init>(r10, r0)
            L_0x0088:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p750ql.C19135b.mo51574a(java.lang.String, com.masabi.justride.sdk.ui.configuration.screens.ticket.BarcodeFormat, int):al.h");
        }
    }
