package p935yg;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.oned.Code128Writer;
import java.util.Map;
import p043ch.C13831b;
import p486fh.C17002b;
import p486fh.C17005e;
import p486fh.C17007g;
import p486fh.C17009i;
import p486fh.C17010j;
import p486fh.C17011k;
import p486fh.C17013m;
import p486fh.C17017q;
import p510gh.C17190a;
import p558ih.C17600b;
import p626lf.C18201b;

/* renamed from: yg.d */
public final class C20721d implements C20727i {

    /* renamed from: yg.d$a */
    public static /* synthetic */ class C20722a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52317a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.BarcodeFormat[] r0 = com.google.zxing.BarcodeFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52317a = r0
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f52317a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p935yg.C20721d.C20722a.<clinit>():void");
        }
    }

    /* renamed from: i */
    public final C13831b mo22696i(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        C20727i iVar;
        switch (C20722a.f52317a[barcodeFormat.ordinal()]) {
            case 1:
                iVar = new C17010j();
                break;
            case 2:
                iVar = new C17017q();
                break;
            case 3:
                iVar = new C17009i();
                break;
            case 4:
                iVar = new C17013m();
                break;
            case 5:
                iVar = new C17600b();
                break;
            case 6:
                iVar = new C17005e();
                break;
            case 7:
                iVar = new C17007g();
                break;
            case 8:
                iVar = new Code128Writer();
                break;
            case 9:
                iVar = new C17011k();
                break;
            case 10:
                iVar = new C17190a();
                break;
            case 11:
                iVar = new C17002b();
                break;
            case 12:
                new C18201b
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0023: CONSTRUCTOR  (r0v14 ? I:lf.b) =  call: lf.b.<init>():void type: CONSTRUCTOR in method: yg.d.i(java.lang.String, com.google.zxing.BarcodeFormat, int, int, java.util.Map):ch.b, dex: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v14 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 34 more
                    */
                /*
                    this = this;
                    int[] r0 = p935yg.C20721d.C20722a.f52317a
                    int r1 = r9.ordinal()
                    r0 = r0[r1]
                    switch(r0) {
                        case 1: goto L_0x0063;
                        case 2: goto L_0x005d;
                        case 3: goto L_0x0057;
                        case 4: goto L_0x0051;
                        case 5: goto L_0x004b;
                        case 6: goto L_0x0045;
                        case 7: goto L_0x003f;
                        case 8: goto L_0x0039;
                        case 9: goto L_0x0033;
                        case 10: goto L_0x002d;
                        case 11: goto L_0x0027;
                        case 12: goto L_0x0021;
                        case 13: goto L_0x001b;
                        default: goto L_0x000b;
                    }
                L_0x000b:
                    java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                    java.lang.String r9 = java.lang.String.valueOf(r9)
                    java.lang.String r10 = "No encoder available for format "
                    java.lang.String r9 = r10.concat(r9)
                    r8.<init>(r9)
                    throw r8
                L_0x001b:
                    t4.a r0 = new t4.a
                    r0.<init>()
                    goto L_0x0068
                L_0x0021:
                    lf.b r0 = new lf.b
                    r0.<init>()
                    goto L_0x0068
                L_0x0027:
                    fh.b r0 = new fh.b
                    r0.<init>()
                    goto L_0x0068
                L_0x002d:
                    gh.a r0 = new gh.a
                    r0.<init>()
                    goto L_0x0068
                L_0x0033:
                    fh.k r0 = new fh.k
                    r0.<init>()
                    goto L_0x0068
                L_0x0039:
                    com.google.zxing.oned.Code128Writer r0 = new com.google.zxing.oned.Code128Writer
                    r0.<init>()
                    goto L_0x0068
                L_0x003f:
                    fh.g r0 = new fh.g
                    r0.<init>()
                    goto L_0x0068
                L_0x0045:
                    fh.e r0 = new fh.e
                    r0.<init>()
                    goto L_0x0068
                L_0x004b:
                    ih.b r0 = new ih.b
                    r0.<init>()
                    goto L_0x0068
                L_0x0051:
                    fh.m r0 = new fh.m
                    r0.<init>()
                    goto L_0x0068
                L_0x0057:
                    fh.i r0 = new fh.i
                    r0.<init>()
                    goto L_0x0068
                L_0x005d:
                    fh.q r0 = new fh.q
                    r0.<init>()
                    goto L_0x0068
                L_0x0063:
                    fh.j r0 = new fh.j
                    r0.<init>()
                L_0x0068:
                    r1 = r0
                    r2 = r8
                    r3 = r9
                    r4 = r10
                    r5 = r11
                    r6 = r12
                    ch.b r8 = r1.mo22696i(r2, r3, r4, r5, r6)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p935yg.C20721d.mo22696i(java.lang.String, com.google.zxing.BarcodeFormat, int, int, java.util.Map):ch.b");
            }
        }
