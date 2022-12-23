package org.xmlpull.p982v1;

import java.io.PrintStream;

/* renamed from: org.xmlpull.v1.XmlPullParserException */
public class XmlPullParserException extends Exception {
    public int column;
    public Throwable detail;
    public int row;

    public XmlPullParserException(String str) {
        super(str);
        this.row = -1;
        this.column = -1;
    }

    public int getColumnNumber() {
        return this.column;
    }

    public Throwable getDetail() {
        return this.detail;
    }

    public int getLineNumber() {
        return this.row;
    }

    public void printStackTrace() {
        if (this.detail == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(super.getMessage());
            stringBuffer.append("; nested exception is:");
            printStream.println(stringBuffer.toString());
            this.detail.printStackTrace();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XmlPullParserException(java.lang.String r4, org.xmlpull.p982v1.XmlPullParser r5, java.lang.Throwable r6) {
        /*
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = ""
            if (r4 != 0) goto L_0x000b
            r4 = r1
            goto L_0x001c
        L_0x000b:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " "
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L_0x001c:
            r0.append(r4)
            if (r5 != 0) goto L_0x0023
            r4 = r1
            goto L_0x0039
        L_0x0023:
            java.lang.String r4 = "(position:"
            java.lang.StringBuffer r4 = p001a0.C0016g.m33q(r4)
            java.lang.String r2 = r5.getPositionDescription()
            r4.append(r2)
            java.lang.String r2 = ") "
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L_0x0039:
            r0.append(r4)
            if (r6 != 0) goto L_0x003f
            goto L_0x0050
        L_0x003f:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.String r1 = "caused by: "
            r4.append(r1)
            r4.append(r6)
            java.lang.String r1 = r4.toString()
        L_0x0050:
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            r4 = -1
            r3.row = r4
            r3.column = r4
            if (r5 == 0) goto L_0x006d
            int r4 = r5.getLineNumber()
            r3.row = r4
            int r4 = r5.getColumnNumber()
            r3.column = r4
        L_0x006d:
            r3.detail = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xmlpull.p982v1.XmlPullParserException.<init>(java.lang.String, org.xmlpull.v1.XmlPullParser, java.lang.Throwable):void");
    }
}
