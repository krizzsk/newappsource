package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b */
public final class C3310b {

    /* renamed from: a */
    public static final Pattern f11879a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b */
    public static final Pattern f11880b = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");

    /* renamed from: a */
    public static long m8357a(String str) throws NumberFormatException {
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        return (Long.parseLong(split[1]) + (j * 1000)) * 1000;
    }
}
