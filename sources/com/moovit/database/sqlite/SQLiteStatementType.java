package com.moovit.database.sqlite;

class SQLiteStatementType {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f0, code lost:
        if (r13.equals("ALT") == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getSqlStatementType(java.lang.String r13) {
        /*
            java.lang.String r13 = r13.trim()
            int r0 = r13.length()
            r1 = 99
            r2 = 3
            if (r0 >= r2) goto L_0x000e
            return r1
        L_0x000e:
            r0 = 0
            java.lang.String r13 = r13.substring(r0, r2)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r13 = r13.toUpperCase(r3)
            r13.getClass()
            r3 = -1
            int r4 = r13.hashCode()
            r5 = 9
            r6 = 8
            r7 = 7
            r8 = 6
            r9 = 4
            r10 = 2
            r11 = 1
            r12 = 5
            switch(r4) {
                case 64905: goto L_0x00ea;
                case 64948: goto L_0x00de;
                case 65153: goto L_0x00d2;
                case 65636: goto L_0x00c6;
                case 66913: goto L_0x00ba;
                case 66998: goto L_0x00ae;
                case 67563: goto L_0x00a3;
                case 67571: goto L_0x0098;
                case 67969: goto L_0x008c;
                case 68795: goto L_0x007f;
                case 72654: goto L_0x0072;
                case 79487: goto L_0x0065;
                case 81021: goto L_0x0058;
                case 81327: goto L_0x004b;
                case 81978: goto L_0x003e;
                case 84233: goto L_0x0031;
                default: goto L_0x002e;
            }
        L_0x002e:
            r0 = -1
            goto L_0x00f4
        L_0x0031:
            java.lang.String r0 = "UPD"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x003a
            goto L_0x002e
        L_0x003a:
            r0 = 15
            goto L_0x00f4
        L_0x003e:
            java.lang.String r0 = "SEL"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x0047
            goto L_0x002e
        L_0x0047:
            r0 = 14
            goto L_0x00f4
        L_0x004b:
            java.lang.String r0 = "ROL"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x0054
            goto L_0x002e
        L_0x0054:
            r0 = 13
            goto L_0x00f4
        L_0x0058:
            java.lang.String r0 = "REP"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x0061
            goto L_0x002e
        L_0x0061:
            r0 = 12
            goto L_0x00f4
        L_0x0065:
            java.lang.String r0 = "PRA"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x006e
            goto L_0x002e
        L_0x006e:
            r0 = 11
            goto L_0x00f4
        L_0x0072:
            java.lang.String r0 = "INS"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x007b
            goto L_0x002e
        L_0x007b:
            r0 = 10
            goto L_0x00f4
        L_0x007f:
            java.lang.String r0 = "END"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x0088
            goto L_0x002e
        L_0x0088:
            r0 = 9
            goto L_0x00f4
        L_0x008c:
            java.lang.String r0 = "DRO"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x0095
            goto L_0x002e
        L_0x0095:
            r0 = 8
            goto L_0x00f4
        L_0x0098:
            java.lang.String r0 = "DET"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00a1
            goto L_0x002e
        L_0x00a1:
            r0 = 7
            goto L_0x00f4
        L_0x00a3:
            java.lang.String r0 = "DEL"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00ac
            goto L_0x002e
        L_0x00ac:
            r0 = 6
            goto L_0x00f4
        L_0x00ae:
            java.lang.String r0 = "CRE"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00b8
            goto L_0x002e
        L_0x00b8:
            r0 = 5
            goto L_0x00f4
        L_0x00ba:
            java.lang.String r0 = "COM"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00c4
            goto L_0x002e
        L_0x00c4:
            r0 = 4
            goto L_0x00f4
        L_0x00c6:
            java.lang.String r0 = "BEG"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00d0
            goto L_0x002e
        L_0x00d0:
            r0 = 3
            goto L_0x00f4
        L_0x00d2:
            java.lang.String r0 = "ATT"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00dc
            goto L_0x002e
        L_0x00dc:
            r0 = 2
            goto L_0x00f4
        L_0x00de:
            java.lang.String r0 = "ANA"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto L_0x00e8
            goto L_0x002e
        L_0x00e8:
            r0 = 1
            goto L_0x00f4
        L_0x00ea:
            java.lang.String r4 = "ALT"
            boolean r13 = r13.equals(r4)
            if (r13 != 0) goto L_0x00f4
            goto L_0x002e
        L_0x00f4:
            switch(r0) {
                case 0: goto L_0x0101;
                case 1: goto L_0x0100;
                case 2: goto L_0x00ff;
                case 3: goto L_0x00fe;
                case 4: goto L_0x00fd;
                case 5: goto L_0x0101;
                case 6: goto L_0x00fc;
                case 7: goto L_0x0100;
                case 8: goto L_0x0101;
                case 9: goto L_0x00fb;
                case 10: goto L_0x00fc;
                case 11: goto L_0x00fa;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00f9;
                case 14: goto L_0x00f8;
                case 15: goto L_0x00fc;
                default: goto L_0x00f7;
            }
        L_0x00f7:
            return r1
        L_0x00f8:
            return r11
        L_0x00f9:
            return r8
        L_0x00fa:
            return r7
        L_0x00fb:
            return r12
        L_0x00fc:
            return r10
        L_0x00fd:
            return r12
        L_0x00fe:
            return r9
        L_0x00ff:
            return r2
        L_0x0100:
            return r5
        L_0x0101:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.database.sqlite.SQLiteStatementType.getSqlStatementType(java.lang.String):int");
    }
}
