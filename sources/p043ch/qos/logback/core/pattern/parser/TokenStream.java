package p043ch.qos.logback.core.pattern.parser;

import com.google.android.gms.location.places.Place;
import java.util.ArrayList;
import p043ch.qos.logback.core.spi.ScanException;
import p245s4.C6461g;
import p258t4.C6588b;
import p258t4.C6589c;

/* renamed from: ch.qos.logback.core.pattern.parser.TokenStream */
public final class TokenStream {

    /* renamed from: a */
    public final String f6390a;

    /* renamed from: b */
    public final int f6391b;

    /* renamed from: c */
    public final C6588b f6392c;

    /* renamed from: d */
    public TokenizerState f6393d = TokenizerState.LITERAL_STATE;

    /* renamed from: e */
    public int f6394e = 0;

    /* renamed from: ch.qos.logback.core.pattern.parser.TokenStream$TokenizerState */
    public enum TokenizerState {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    /* renamed from: ch.qos.logback.core.pattern.parser.TokenStream$a */
    public static /* synthetic */ class C1850a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6395a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ch.qos.logback.core.pattern.parser.TokenStream$TokenizerState[] r0 = p043ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6395a = r0
                ch.qos.logback.core.pattern.parser.TokenStream$TokenizerState r1 = p043ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState.LITERAL_STATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6395a     // Catch:{ NoSuchFieldError -> 0x001d }
                ch.qos.logback.core.pattern.parser.TokenStream$TokenizerState r1 = p043ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState.FORMAT_MODIFIER_STATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6395a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ch.qos.logback.core.pattern.parser.TokenStream$TokenizerState r1 = p043ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState.OPTION_STATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6395a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ch.qos.logback.core.pattern.parser.TokenStream$TokenizerState r1 = p043ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState.KEYWORD_STATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6395a     // Catch:{ NoSuchFieldError -> 0x003e }
                ch.qos.logback.core.pattern.parser.TokenStream$TokenizerState r1 = p043ch.qos.logback.core.pattern.parser.TokenStream.TokenizerState.RIGHT_PARENTHESIS_STATE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p043ch.qos.logback.core.pattern.parser.TokenStream.C1850a.<clinit>():void");
        }
    }

    public TokenStream(String str, C6589c cVar) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.f6390a = str;
        this.f6391b = str.length();
        this.f6392c = cVar;
    }

    /* renamed from: a */
    public static void m5225a(int i, StringBuffer stringBuffer, ArrayList arrayList) {
        if (stringBuffer.length() > 0) {
            arrayList.add(new C6461g(i, (ArrayList) null, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    /* renamed from: b */
    public final ArrayList mo6680b() throws ScanException {
        TokenizerState tokenizerState;
        C6461g gVar;
        String str;
        TokenizerState tokenizerState2;
        TokenizerState tokenizerState3;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i = this.f6394e;
            char c = 2;
            if (i < this.f6391b) {
                char charAt = this.f6390a.charAt(i);
                this.f6394e++;
                int i2 = C1850a.f6395a[this.f6393d.ordinal()];
                if (i2 == 1) {
                    if (charAt == '%') {
                        m5225a(1000, stringBuffer, arrayList);
                        arrayList.add(C6461g.f20180f);
                        tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
                    } else if (charAt == ')') {
                        m5225a(1000, stringBuffer, arrayList);
                        tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
                    } else if (charAt != '\\') {
                        stringBuffer.append(charAt);
                    } else {
                        int i3 = this.f6394e;
                        if (i3 < this.f6391b) {
                            String str2 = this.f6390a;
                            this.f6394e = i3 + 1;
                            this.f6392c.mo22700p("%()", stringBuffer, str2.charAt(i3), this.f6394e);
                        }
                    }
                    this.f6393d = tokenizerState;
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        String str3 = this.f6390a;
                        int i4 = this.f6391b;
                        StringBuffer stringBuffer2 = new StringBuffer();
                        ArrayList arrayList2 = new ArrayList();
                        char c2 = 0;
                        char c3 = 0;
                        while (true) {
                            if (this.f6394e < i4) {
                                if (c2 == 0) {
                                    if (!(charAt == 9 || charAt == 10 || charAt == 13 || charAt == ' ')) {
                                        if (charAt != '\"' && charAt != '\'') {
                                            if (charAt != ',') {
                                                if (charAt == '}') {
                                                    gVar = new C6461g(Place.TYPE_FLOOR, arrayList2, (String) null);
                                                    break;
                                                }
                                                stringBuffer2.append(charAt);
                                                c2 = 1;
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            c3 = charAt;
                                            c2 = 2;
                                        }
                                    }
                                } else {
                                    if (c2 != 1) {
                                        if (c2 == c) {
                                            if (charAt == c3) {
                                                str = stringBuffer2.toString();
                                                arrayList2.add(str);
                                                stringBuffer2.setLength(0);
                                                c2 = 0;
                                            } else if (charAt == '\\') {
                                                String.valueOf(c3);
                                                int i5 = this.f6394e;
                                                if (i5 < i4) {
                                                    this.f6394e = i5 + 1;
                                                    char charAt2 = str3.charAt(i5);
                                                    stringBuffer2.append("\\");
                                                    stringBuffer2.append(charAt2);
                                                }
                                            }
                                        }
                                    } else if (charAt != ',') {
                                        if (charAt == '}') {
                                            arrayList2.add(stringBuffer2.toString().trim());
                                            gVar = new C6461g(Place.TYPE_FLOOR, arrayList2, (String) null);
                                            break;
                                        }
                                    } else {
                                        str = stringBuffer2.toString().trim();
                                        arrayList2.add(str);
                                        stringBuffer2.setLength(0);
                                        c2 = 0;
                                    }
                                    stringBuffer2.append(charAt);
                                }
                                charAt = str3.charAt(this.f6394e);
                                this.f6394e++;
                                c = 2;
                            } else if (charAt == '}') {
                                if (c2 != 0) {
                                    if (c2 == 1) {
                                        arrayList2.add(stringBuffer2.toString().trim());
                                    } else {
                                        throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
                                    }
                                }
                                gVar = new C6461g(Place.TYPE_FLOOR, arrayList2, (String) null);
                            } else {
                                throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
                            }
                        }
                        arrayList.add(gVar);
                        this.f6393d = TokenizerState.LITERAL_STATE;
                    } else if (i2 != 4) {
                        if (i2 == 5) {
                            arrayList.add(C6461g.f20178d);
                            if (charAt != ')') {
                                if (charAt == '\\') {
                                    int i6 = this.f6394e;
                                    if (i6 < this.f6391b) {
                                        String str4 = this.f6390a;
                                        this.f6394e = i6 + 1;
                                        this.f6392c.mo22700p("%{}", stringBuffer, str4.charAt(i6), this.f6394e);
                                    }
                                } else if (charAt != '{') {
                                    stringBuffer.append(charAt);
                                } else {
                                    tokenizerState3 = TokenizerState.OPTION_STATE;
                                    this.f6393d = tokenizerState3;
                                }
                                tokenizerState3 = TokenizerState.LITERAL_STATE;
                                this.f6393d = tokenizerState3;
                            }
                        }
                    } else if (Character.isJavaIdentifierPart(charAt)) {
                        stringBuffer.append(charAt);
                    } else {
                        if (charAt == '{') {
                            m5225a(1004, stringBuffer, arrayList);
                            tokenizerState2 = TokenizerState.OPTION_STATE;
                        } else {
                            if (charAt == '(') {
                                m5225a(1005, stringBuffer, arrayList);
                            } else {
                                m5225a(1004, stringBuffer, arrayList);
                                if (charAt == '%') {
                                    arrayList.add(C6461g.f20180f);
                                    tokenizerState2 = TokenizerState.FORMAT_MODIFIER_STATE;
                                } else if (charAt == ')') {
                                    tokenizerState2 = TokenizerState.RIGHT_PARENTHESIS_STATE;
                                } else if (charAt == '\\') {
                                    int i7 = this.f6394e;
                                    if (i7 < this.f6391b) {
                                        String str5 = this.f6390a;
                                        this.f6394e = i7 + 1;
                                        this.f6392c.mo22700p("%()", stringBuffer, str5.charAt(i7), this.f6394e);
                                    }
                                } else {
                                    stringBuffer.append(charAt);
                                }
                            }
                            tokenizerState2 = TokenizerState.LITERAL_STATE;
                        }
                        this.f6393d = tokenizerState2;
                    }
                } else if (charAt == '(') {
                    m5225a(1002, stringBuffer, arrayList);
                    arrayList.add(C6461g.f20179e);
                    this.f6393d = TokenizerState.LITERAL_STATE;
                } else {
                    if (Character.isJavaIdentifierStart(charAt)) {
                        m5225a(1002, stringBuffer, arrayList);
                        this.f6393d = TokenizerState.KEYWORD_STATE;
                    }
                    stringBuffer.append(charAt);
                }
            } else {
                int i8 = C1850a.f6395a[this.f6393d.ordinal()];
                if (i8 == 1) {
                    m5225a(1000, stringBuffer, arrayList);
                } else if (i8 == 2 || i8 == 3) {
                    throw new ScanException("Unexpected end of pattern string");
                } else if (i8 == 4) {
                    arrayList.add(new C6461g(1004, (ArrayList) null, stringBuffer.toString()));
                } else if (i8 == 5) {
                    arrayList.add(C6461g.f20178d);
                }
                return arrayList;
            }
        }
    }
}
