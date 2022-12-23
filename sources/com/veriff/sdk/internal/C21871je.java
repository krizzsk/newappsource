package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000e¨\u0006\u001d"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/KotshiFeatureFlagsJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "Lcom/squareup/moshi/k;", "Lcom/veriff/sdk/internal/data/AudioConfig;", "audioConfigAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/veriff/sdk/internal/data/Resolution;", "resolutionAdapter", "", "", "stringListAdapter", "Lcom/veriff/sdk/internal/data/VideoConfig;", "videoConfigAdapter", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.je */
public final class C21871je extends aed<C21789ix> {

    /* renamed from: a */
    private final C21420av<C21886js> f55285a;

    /* renamed from: b */
    private final C21420av<C21903ka> f55286b;

    /* renamed from: c */
    private final C21420av<C21787iw> f55287c;

    /* renamed from: d */
    private final C21420av<List<String>> f55288d;

    /* renamed from: e */
    private final C21430ba.C21431a f55289e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21871je(C21450bi biVar) {
        super("KotshiJsonAdapter(FeatureFlags)");
        C21450bi biVar2 = biVar;
        C24362h.m61211f(biVar2, "moshi");
        C21420av<C21886js> a = biVar2.mo54334a(C21886js.class);
        C24362h.m61210e(a, "moshi.adapter(Resolution::class.javaObjectType)");
        this.f55285a = a;
        C21420av<C21903ka> a2 = biVar2.mo54334a(C21903ka.class);
        C24362h.m61210e(a2, "moshi.adapter(VideoConfig::class.javaObjectType)");
        this.f55286b = a2;
        C21420av<C21787iw> a3 = biVar2.mo54334a(C21787iw.class);
        C24362h.m61210e(a3, "moshi.adapter(AudioConfig::class.javaObjectType)");
        this.f55287c = a3;
        C21420av<List<String>> a4 = biVar2.mo54335a((Type) C21468bk.m51261a((Type) List.class, String.class));
        C24362h.m61210e(a4, "moshi.adapter(Types.newP…g::class.javaObjectType))");
        this.f55288d = a4;
        C21430ba.C21431a a5 = C21430ba.C21431a.m51080a("video_enabled", "video_required", "portrait_document", "portrait_document_video_failure", "inflow_feedback_dark_room", "inflow_feedback_face_detection", "android_picture_resolution_1100", "barcode_picture", "whitelabel_enabled", "portrait_picture", "leave_user_waiting_decision", "nfc_enabled", "nfc_required", "disable_document_pictures", "no_intro_screen_android", "sdk_ui_customization_enabled", "hide_language_change_temp_android", "merged_ui_temp_android", "selfie_auto_capture_temp_android", "capture_hud_dev_android", "decision_step_delay_ms", "decision_check_delay_ms", "inflow_timeout_ms", "inflow_retry_count", "mrz_timeout_ms", "nfc_scan_retry_count", "nfc_scan_timeout_ms", "nfc_connect_time_min_threshold_ms", "nfc_connection_lost_delay_ms", "nfc_chunk_size_min", "nfc_chunk_size_max", "nfc_chunk_size_default", "barcode_scan_timeout_ms", "barcode_scan_retry_count", "barcode_result_delay_ms", "barcode_resolution", "dark_room_threshold_android", "video_config_android", "audio_config_android", "nfc_supported_countries", "autocapture_manual_fallback_timeout_ms", "autocapture_face_translation_error", "autocapture_min_face_size", "autocapture_face_orientation_error", "poa_enable_liveness_android", "poa_enable_multi_files_android", "poa_file_max_size_mb_android");
        C24362h.m61210e(a5, "JsonReader.Options.of(\n …_max_size_mb_android\"\n  )");
        this.f55289e = a5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.internal.C21789ix mo54204a(com.veriff.sdk.internal.C21430ba r168) throws java.io.IOException {
        /*
            r167 = this;
            r0 = r167
            r1 = r168
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0018
            java.lang.Object r1 = r168.mo54253l()
            com.veriff.sdk.internal.ix r1 = (com.veriff.sdk.internal.C21789ix) r1
            return r1
        L_0x0018:
            r2 = 0
            r168.mo54246e()
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r8 = r5
            r9 = r8
            r10 = r6
            r12 = r10
            r14 = r12
            r16 = r14
            r18 = r16
            r20 = r18
            r22 = r20
            r24 = r22
            r26 = r24
            r28 = r26
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            r75 = 0
            r76 = 0
            r77 = 0
            r78 = 0
            r79 = 0
            r80 = 0
            r81 = 0
            r82 = 0
            r83 = 0
            r84 = 0
            r85 = 0
            r86 = 0
            r87 = 0
            r88 = 0
            r89 = 0
            r90 = 0
            r91 = 0
            r92 = 0
            r93 = 0
            r94 = 0
            r95 = 0
            r96 = 0
            r97 = 0
            r98 = 0
            r99 = 0
            r100 = 0
            r101 = 0
            r102 = 0
            r6 = r9
            r7 = r6
            r5 = 0
        L_0x00ca:
            boolean r103 = r168.mo54248g()
            if (r103 == 0) goto L_0x0535
            r103 = r2
            com.veriff.sdk.internal.ba$a r2 = r0.f55289e
            int r2 = r1.mo54236a((com.veriff.sdk.internal.C21430ba.C21431a) r2)
            switch(r2) {
                case -1: goto L_0x052b;
                case 0: goto L_0x0513;
                case 1: goto L_0x04fb;
                case 2: goto L_0x04e3;
                case 3: goto L_0x04cb;
                case 4: goto L_0x04b2;
                case 5: goto L_0x0499;
                case 6: goto L_0x0480;
                case 7: goto L_0x0467;
                case 8: goto L_0x044e;
                case 9: goto L_0x0435;
                case 10: goto L_0x041c;
                case 11: goto L_0x0403;
                case 12: goto L_0x03ea;
                case 13: goto L_0x03d1;
                case 14: goto L_0x03b8;
                case 15: goto L_0x039f;
                case 16: goto L_0x0386;
                case 17: goto L_0x036d;
                case 18: goto L_0x0354;
                case 19: goto L_0x033b;
                case 20: goto L_0x0323;
                case 21: goto L_0x030b;
                case 22: goto L_0x02f3;
                case 23: goto L_0x02da;
                case 24: goto L_0x02c1;
                case 25: goto L_0x02a8;
                case 26: goto L_0x028f;
                case 27: goto L_0x0276;
                case 28: goto L_0x025d;
                case 29: goto L_0x0244;
                case 30: goto L_0x022b;
                case 31: goto L_0x0212;
                case 32: goto L_0x01f9;
                case 33: goto L_0x01e0;
                case 34: goto L_0x01c7;
                case 35: goto L_0x01bc;
                case 36: goto L_0x01a7;
                case 37: goto L_0x019c;
                case 38: goto L_0x0191;
                case 39: goto L_0x0186;
                case 40: goto L_0x016d;
                case 41: goto L_0x0155;
                case 42: goto L_0x013d;
                case 43: goto L_0x0125;
                case 44: goto L_0x010d;
                case 45: goto L_0x00f5;
                case 46: goto L_0x00dd;
                default: goto L_0x00db;
            }
        L_0x00db:
            goto L_0x0531
        L_0x00dd:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x00ea
            r168.mo54257p()
            goto L_0x0531
        L_0x00ea:
            int r2 = r168.mo54256o()
            r102 = r2
            r2 = r103
            r101 = 1
            goto L_0x00ca
        L_0x00f5:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0102
            r168.mo54257p()
            goto L_0x0531
        L_0x0102:
            boolean r2 = r168.mo54252k()
            r100 = r2
            r2 = r103
            r99 = 1
            goto L_0x00ca
        L_0x010d:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x011a
            r168.mo54257p()
            goto L_0x0531
        L_0x011a:
            boolean r2 = r168.mo54252k()
            r98 = r2
            r2 = r103
            r97 = 1
            goto L_0x00ca
        L_0x0125:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0132
            r168.mo54257p()
            goto L_0x0531
        L_0x0132:
            int r2 = r168.mo54256o()
            r96 = r2
            r2 = r103
            r95 = 1
            goto L_0x00ca
        L_0x013d:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x014a
            r168.mo54257p()
            goto L_0x0531
        L_0x014a:
            float r2 = com.veriff.sdk.internal.aec.m50901a(r168)
            r5 = r2
            r2 = r103
            r94 = 1
            goto L_0x00ca
        L_0x0155:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0162
            r168.mo54257p()
            goto L_0x0531
        L_0x0162:
            float r2 = com.veriff.sdk.internal.aec.m50901a(r168)
            r4 = r2
            r2 = r103
            r93 = 1
            goto L_0x00ca
        L_0x016d:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x017a
            r168.mo54257p()
            goto L_0x0531
        L_0x017a:
            long r2 = r168.mo54255n()
            r28 = r2
            r2 = r103
            r92 = 1
            goto L_0x00ca
        L_0x0186:
            com.veriff.sdk.internal.av<java.util.List<java.lang.String>> r2 = r0.f55288d
            java.lang.Object r2 = r2.mo54204a((com.veriff.sdk.internal.C21430ba) r1)
            java.util.List r2 = (java.util.List) r2
            r9 = r2
            goto L_0x0531
        L_0x0191:
            com.veriff.sdk.internal.av<com.veriff.sdk.internal.iw> r2 = r0.f55287c
            java.lang.Object r2 = r2.mo54204a((com.veriff.sdk.internal.C21430ba) r1)
            com.veriff.sdk.internal.iw r2 = (com.veriff.sdk.internal.C21787iw) r2
            r8 = r2
            goto L_0x0531
        L_0x019c:
            com.veriff.sdk.internal.av<com.veriff.sdk.internal.ka> r2 = r0.f55286b
            java.lang.Object r2 = r2.mo54204a((com.veriff.sdk.internal.C21430ba) r1)
            com.veriff.sdk.internal.ka r2 = (com.veriff.sdk.internal.C21903ka) r2
            r7 = r2
            goto L_0x0531
        L_0x01a7:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x01b4
            r168.mo54257p()
            goto L_0x0531
        L_0x01b4:
            double r2 = r168.mo54254m()
            r91 = 1
            goto L_0x00ca
        L_0x01bc:
            com.veriff.sdk.internal.av<com.veriff.sdk.internal.js> r2 = r0.f55285a
            java.lang.Object r2 = r2.mo54204a((com.veriff.sdk.internal.C21430ba) r1)
            com.veriff.sdk.internal.js r2 = (com.veriff.sdk.internal.C21886js) r2
            r6 = r2
            goto L_0x0531
        L_0x01c7:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x01d4
            r168.mo54257p()
            goto L_0x0531
        L_0x01d4:
            long r2 = r168.mo54255n()
            r26 = r2
            r2 = r103
            r90 = 1
            goto L_0x00ca
        L_0x01e0:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x01ed
            r168.mo54257p()
            goto L_0x0531
        L_0x01ed:
            int r2 = r168.mo54256o()
            r89 = r2
            r2 = r103
            r88 = 1
            goto L_0x00ca
        L_0x01f9:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0206
            r168.mo54257p()
            goto L_0x0531
        L_0x0206:
            long r2 = r168.mo54255n()
            r24 = r2
            r2 = r103
            r87 = 1
            goto L_0x00ca
        L_0x0212:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x021f
            r168.mo54257p()
            goto L_0x0531
        L_0x021f:
            int r2 = r168.mo54256o()
            r86 = r2
            r2 = r103
            r85 = 1
            goto L_0x00ca
        L_0x022b:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0238
            r168.mo54257p()
            goto L_0x0531
        L_0x0238:
            int r2 = r168.mo54256o()
            r84 = r2
            r2 = r103
            r83 = 1
            goto L_0x00ca
        L_0x0244:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0251
            r168.mo54257p()
            goto L_0x0531
        L_0x0251:
            int r2 = r168.mo54256o()
            r82 = r2
            r2 = r103
            r81 = 1
            goto L_0x00ca
        L_0x025d:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x026a
            r168.mo54257p()
            goto L_0x0531
        L_0x026a:
            long r2 = r168.mo54255n()
            r22 = r2
            r2 = r103
            r80 = 1
            goto L_0x00ca
        L_0x0276:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0283
            r168.mo54257p()
            goto L_0x0531
        L_0x0283:
            long r2 = r168.mo54255n()
            r20 = r2
            r2 = r103
            r79 = 1
            goto L_0x00ca
        L_0x028f:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x029c
            r168.mo54257p()
            goto L_0x0531
        L_0x029c:
            long r2 = r168.mo54255n()
            r18 = r2
            r2 = r103
            r78 = 1
            goto L_0x00ca
        L_0x02a8:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x02b5
            r168.mo54257p()
            goto L_0x0531
        L_0x02b5:
            int r2 = r168.mo54256o()
            r77 = r2
            r2 = r103
            r76 = 1
            goto L_0x00ca
        L_0x02c1:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x02ce
            r168.mo54257p()
            goto L_0x0531
        L_0x02ce:
            long r2 = r168.mo54255n()
            r16 = r2
            r2 = r103
            r75 = 1
            goto L_0x00ca
        L_0x02da:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x02e7
            r168.mo54257p()
            goto L_0x0531
        L_0x02e7:
            int r2 = r168.mo54256o()
            r74 = r2
            r2 = r103
            r73 = 1
            goto L_0x00ca
        L_0x02f3:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0300
            r168.mo54257p()
            goto L_0x0531
        L_0x0300:
            long r2 = r168.mo54255n()
            r14 = r2
            r2 = r103
            r72 = 1
            goto L_0x00ca
        L_0x030b:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0318
            r168.mo54257p()
            goto L_0x0531
        L_0x0318:
            long r2 = r168.mo54255n()
            r12 = r2
            r2 = r103
            r71 = 1
            goto L_0x00ca
        L_0x0323:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0330
            r168.mo54257p()
            goto L_0x0531
        L_0x0330:
            long r2 = r168.mo54255n()
            r10 = r2
            r2 = r103
            r70 = 1
            goto L_0x00ca
        L_0x033b:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0348
            r168.mo54257p()
            goto L_0x0531
        L_0x0348:
            boolean r2 = r168.mo54252k()
            r69 = r2
            r2 = r103
            r68 = 1
            goto L_0x00ca
        L_0x0354:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0361
            r168.mo54257p()
            goto L_0x0531
        L_0x0361:
            boolean r2 = r168.mo54252k()
            r67 = r2
            r2 = r103
            r66 = 1
            goto L_0x00ca
        L_0x036d:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x037a
            r168.mo54257p()
            goto L_0x0531
        L_0x037a:
            boolean r2 = r168.mo54252k()
            r65 = r2
            r2 = r103
            r64 = 1
            goto L_0x00ca
        L_0x0386:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0393
            r168.mo54257p()
            goto L_0x0531
        L_0x0393:
            boolean r2 = r168.mo54252k()
            r63 = r2
            r2 = r103
            r62 = 1
            goto L_0x00ca
        L_0x039f:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x03ac
            r168.mo54257p()
            goto L_0x0531
        L_0x03ac:
            boolean r2 = r168.mo54252k()
            r61 = r2
            r2 = r103
            r60 = 1
            goto L_0x00ca
        L_0x03b8:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x03c5
            r168.mo54257p()
            goto L_0x0531
        L_0x03c5:
            boolean r2 = r168.mo54252k()
            r59 = r2
            r2 = r103
            r58 = 1
            goto L_0x00ca
        L_0x03d1:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x03de
            r168.mo54257p()
            goto L_0x0531
        L_0x03de:
            boolean r2 = r168.mo54252k()
            r57 = r2
            r2 = r103
            r56 = 1
            goto L_0x00ca
        L_0x03ea:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x03f7
            r168.mo54257p()
            goto L_0x0531
        L_0x03f7:
            boolean r2 = r168.mo54252k()
            r55 = r2
            r2 = r103
            r54 = 1
            goto L_0x00ca
        L_0x0403:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0410
            r168.mo54257p()
            goto L_0x0531
        L_0x0410:
            boolean r2 = r168.mo54252k()
            r53 = r2
            r2 = r103
            r52 = 1
            goto L_0x00ca
        L_0x041c:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0429
            r168.mo54257p()
            goto L_0x0531
        L_0x0429:
            boolean r2 = r168.mo54252k()
            r51 = r2
            r2 = r103
            r50 = 1
            goto L_0x00ca
        L_0x0435:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0442
            r168.mo54257p()
            goto L_0x0531
        L_0x0442:
            boolean r2 = r168.mo54252k()
            r49 = r2
            r2 = r103
            r48 = 1
            goto L_0x00ca
        L_0x044e:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x045b
            r168.mo54257p()
            goto L_0x0531
        L_0x045b:
            boolean r2 = r168.mo54252k()
            r47 = r2
            r2 = r103
            r46 = 1
            goto L_0x00ca
        L_0x0467:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0474
            r168.mo54257p()
            goto L_0x0531
        L_0x0474:
            boolean r2 = r168.mo54252k()
            r45 = r2
            r2 = r103
            r44 = 1
            goto L_0x00ca
        L_0x0480:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x048d
            r168.mo54257p()
            goto L_0x0531
        L_0x048d:
            boolean r2 = r168.mo54252k()
            r43 = r2
            r2 = r103
            r42 = 1
            goto L_0x00ca
        L_0x0499:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x04a6
            r168.mo54257p()
            goto L_0x0531
        L_0x04a6:
            boolean r2 = r168.mo54252k()
            r41 = r2
            r2 = r103
            r40 = 1
            goto L_0x00ca
        L_0x04b2:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x04bf
            r168.mo54257p()
            goto L_0x0531
        L_0x04bf:
            boolean r2 = r168.mo54252k()
            r39 = r2
            r2 = r103
            r38 = 1
            goto L_0x00ca
        L_0x04cb:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x04d7
            r168.mo54257p()
            goto L_0x0531
        L_0x04d7:
            boolean r2 = r168.mo54252k()
            r37 = r2
            r2 = r103
            r36 = 1
            goto L_0x00ca
        L_0x04e3:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x04ef
            r168.mo54257p()
            goto L_0x0531
        L_0x04ef:
            boolean r2 = r168.mo54252k()
            r35 = r2
            r2 = r103
            r34 = 1
            goto L_0x00ca
        L_0x04fb:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x0507
            r168.mo54257p()
            goto L_0x0531
        L_0x0507:
            boolean r2 = r168.mo54252k()
            r33 = r2
            r2 = r103
            r32 = 1
            goto L_0x00ca
        L_0x0513:
            com.veriff.sdk.internal.ba$b r2 = r168.mo54249h()
            com.veriff.sdk.internal.ba$b r3 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r2 != r3) goto L_0x051f
            r168.mo54257p()
            goto L_0x0531
        L_0x051f:
            boolean r2 = r168.mo54252k()
            r31 = r2
            r2 = r103
            r30 = 1
            goto L_0x00ca
        L_0x052b:
            r168.mo54250i()
            r168.mo54257p()
        L_0x0531:
            r2 = r103
            goto L_0x00ca
        L_0x0535:
            r103 = r2
            r168.mo54247f()
            com.veriff.sdk.internal.ix r1 = new com.veriff.sdk.internal.ix
            r105 = r1
            r106 = 0
            r107 = 0
            r108 = 0
            r109 = 0
            r110 = 0
            r111 = 0
            r112 = 0
            r113 = 0
            r114 = 0
            r115 = 0
            r116 = 0
            r117 = 0
            r118 = 0
            r119 = 0
            r120 = 0
            r121 = 0
            r122 = 0
            r123 = 0
            r124 = 0
            r125 = 0
            r126 = 0
            r128 = 0
            r130 = 0
            r132 = 0
            r133 = 0
            r135 = 0
            r136 = 0
            r138 = 0
            r140 = 0
            r142 = 0
            r143 = 0
            r144 = 0
            r145 = 0
            r147 = 0
            r148 = 0
            r150 = 0
            r151 = 0
            r153 = 0
            r154 = 0
            r155 = 0
            r156 = 0
            r158 = 0
            r159 = 0
            r160 = 0
            r161 = 0
            r162 = 0
            r163 = 0
            r164 = -1
            r165 = 32767(0x7fff, float:4.5916E-41)
            r166 = 0
            r105.<init>(r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r128, r130, r132, r133, r135, r136, r138, r140, r142, r143, r144, r145, r147, r148, r150, r151, r153, r154, r155, r156, r158, r159, r160, r161, r162, r163, r164, r165, r166)
            if (r30 == 0) goto L_0x05a8
            goto L_0x05ac
        L_0x05a8:
            boolean r31 = r1.mo55446a()
        L_0x05ac:
            if (r32 == 0) goto L_0x05af
            goto L_0x05b3
        L_0x05af:
            boolean r33 = r1.mo55447b()
        L_0x05b3:
            r105 = r33
            if (r34 == 0) goto L_0x05b8
            goto L_0x05bc
        L_0x05b8:
            boolean r35 = r1.mo55448c()
        L_0x05bc:
            r106 = r35
            if (r36 == 0) goto L_0x05c1
            goto L_0x05c5
        L_0x05c1:
            boolean r37 = r1.mo55449d()
        L_0x05c5:
            r107 = r37
            if (r38 == 0) goto L_0x05ca
            goto L_0x05ce
        L_0x05ca:
            boolean r39 = r1.mo55451e()
        L_0x05ce:
            r108 = r39
            if (r40 == 0) goto L_0x05d3
            goto L_0x05d7
        L_0x05d3:
            boolean r41 = r1.mo55453f()
        L_0x05d7:
            r109 = r41
            if (r42 == 0) goto L_0x05dc
            goto L_0x05e0
        L_0x05dc:
            boolean r43 = r1.mo55454g()
        L_0x05e0:
            r110 = r43
            if (r44 == 0) goto L_0x05e5
            goto L_0x05e9
        L_0x05e5:
            boolean r45 = r1.mo55455h()
        L_0x05e9:
            r111 = r45
            if (r46 == 0) goto L_0x05ee
            goto L_0x05f2
        L_0x05ee:
            boolean r47 = r1.mo55457i()
        L_0x05f2:
            r112 = r47
            if (r48 == 0) goto L_0x05f7
            goto L_0x05fb
        L_0x05f7:
            boolean r49 = r1.mo55458j()
        L_0x05fb:
            r113 = r49
            if (r50 == 0) goto L_0x0600
            goto L_0x0604
        L_0x0600:
            boolean r51 = r1.mo55459k()
        L_0x0604:
            r114 = r51
            if (r52 == 0) goto L_0x0609
            goto L_0x060d
        L_0x0609:
            boolean r53 = r1.mo55460l()
        L_0x060d:
            r115 = r53
            if (r54 == 0) goto L_0x0612
            goto L_0x0616
        L_0x0612:
            boolean r55 = r1.mo55461m()
        L_0x0616:
            r116 = r55
            if (r56 == 0) goto L_0x061b
            goto L_0x061f
        L_0x061b:
            boolean r57 = r1.mo55462n()
        L_0x061f:
            r117 = r57
            if (r58 == 0) goto L_0x0624
            goto L_0x0628
        L_0x0624:
            boolean r59 = r1.mo55463o()
        L_0x0628:
            r118 = r59
            if (r60 == 0) goto L_0x062d
            goto L_0x0631
        L_0x062d:
            boolean r61 = r1.mo55464p()
        L_0x0631:
            r119 = r61
            if (r62 == 0) goto L_0x0636
            goto L_0x063a
        L_0x0636:
            boolean r63 = r1.mo55465q()
        L_0x063a:
            r120 = r63
            if (r64 == 0) goto L_0x063f
            goto L_0x0643
        L_0x063f:
            boolean r65 = r1.mo55466r()
        L_0x0643:
            r121 = r65
            if (r66 == 0) goto L_0x0648
            goto L_0x064c
        L_0x0648:
            boolean r67 = r1.mo55467s()
        L_0x064c:
            r122 = r67
            if (r68 == 0) goto L_0x0651
            goto L_0x0655
        L_0x0651:
            boolean r69 = r1.mo55468t()
        L_0x0655:
            r123 = r69
            if (r70 == 0) goto L_0x065a
            goto L_0x065e
        L_0x065a:
            long r10 = r1.mo55470u()
        L_0x065e:
            r124 = r10
            if (r71 == 0) goto L_0x0663
            goto L_0x0667
        L_0x0663:
            long r12 = r1.mo55471v()
        L_0x0667:
            r126 = r12
            if (r72 == 0) goto L_0x066c
            goto L_0x0670
        L_0x066c:
            long r14 = r1.mo55472w()
        L_0x0670:
            r128 = r14
            if (r73 == 0) goto L_0x0675
            goto L_0x0679
        L_0x0675:
            int r74 = r1.mo55474x()
        L_0x0679:
            r130 = r74
            if (r75 == 0) goto L_0x067e
            goto L_0x0682
        L_0x067e:
            long r16 = r1.mo55475y()
        L_0x0682:
            r131 = r16
            if (r76 == 0) goto L_0x0687
            goto L_0x068b
        L_0x0687:
            int r77 = r1.mo55476z()
        L_0x068b:
            r133 = r77
            if (r78 == 0) goto L_0x0690
            goto L_0x0694
        L_0x0690:
            long r18 = r1.mo55424A()
        L_0x0694:
            r134 = r18
            if (r79 == 0) goto L_0x0699
            goto L_0x069d
        L_0x0699:
            long r20 = r1.mo55425B()
        L_0x069d:
            r136 = r20
            if (r80 == 0) goto L_0x06a2
            goto L_0x06a6
        L_0x06a2:
            long r22 = r1.mo55426C()
        L_0x06a6:
            r138 = r22
            if (r81 == 0) goto L_0x06ab
            goto L_0x06af
        L_0x06ab:
            int r82 = r1.mo55427D()
        L_0x06af:
            r140 = r82
            if (r83 == 0) goto L_0x06b4
            goto L_0x06b8
        L_0x06b4:
            int r84 = r1.mo55428E()
        L_0x06b8:
            r141 = r84
            if (r85 == 0) goto L_0x06bd
            goto L_0x06c1
        L_0x06bd:
            int r86 = r1.mo55429F()
        L_0x06c1:
            r142 = r86
            if (r87 == 0) goto L_0x06c6
            goto L_0x06ca
        L_0x06c6:
            long r24 = r1.mo55430G()
        L_0x06ca:
            r143 = r24
            if (r88 == 0) goto L_0x06cf
            goto L_0x06d3
        L_0x06cf:
            int r89 = r1.mo55431H()
        L_0x06d3:
            r145 = r89
            if (r90 == 0) goto L_0x06d8
            goto L_0x06dc
        L_0x06d8:
            long r26 = r1.mo55432I()
        L_0x06dc:
            r146 = r26
            if (r6 == 0) goto L_0x06e1
            goto L_0x06e5
        L_0x06e1:
            com.veriff.sdk.internal.js r6 = r1.mo55433J()
        L_0x06e5:
            r148 = r6
            if (r91 == 0) goto L_0x06ec
            r149 = r103
            goto L_0x06f2
        L_0x06ec:
            double r2 = r1.mo55434K()
            r149 = r2
        L_0x06f2:
            if (r7 == 0) goto L_0x06f5
            goto L_0x06f9
        L_0x06f5:
            com.veriff.sdk.internal.ka r7 = r1.mo55435L()
        L_0x06f9:
            r151 = r7
            if (r8 == 0) goto L_0x06fe
            goto L_0x0702
        L_0x06fe:
            com.veriff.sdk.internal.iw r8 = r1.mo55436M()
        L_0x0702:
            r152 = r8
            if (r9 == 0) goto L_0x0707
            goto L_0x070b
        L_0x0707:
            java.util.List r9 = r1.mo55437N()
        L_0x070b:
            r153 = r9
            if (r92 == 0) goto L_0x0710
            goto L_0x0714
        L_0x0710:
            long r28 = r1.mo55438O()
        L_0x0714:
            r154 = r28
            if (r93 == 0) goto L_0x0719
            goto L_0x071d
        L_0x0719:
            float r4 = r1.mo55439P()
        L_0x071d:
            r156 = r4
            if (r94 == 0) goto L_0x0722
            goto L_0x0726
        L_0x0722:
            float r5 = r1.mo55440Q()
        L_0x0726:
            r157 = r5
            if (r95 == 0) goto L_0x072b
            goto L_0x072f
        L_0x072b:
            int r96 = r1.mo55441R()
        L_0x072f:
            r158 = r96
            if (r97 == 0) goto L_0x0734
            goto L_0x0738
        L_0x0734:
            boolean r98 = r1.mo55442S()
        L_0x0738:
            r159 = r98
            if (r99 == 0) goto L_0x073d
            goto L_0x0741
        L_0x073d:
            boolean r100 = r1.mo55443T()
        L_0x0741:
            r160 = r100
            if (r101 == 0) goto L_0x0746
            goto L_0x074a
        L_0x0746:
            int r102 = r1.mo55444U()
        L_0x074a:
            r161 = r102
            r103 = r1
            r104 = r31
            com.veriff.sdk.internal.ix r1 = r103.mo55445a(r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r126, r128, r130, r131, r133, r134, r136, r138, r140, r141, r142, r143, r145, r146, r148, r149, r151, r152, r153, r154, r156, r157, r158, r159, r160, r161)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21871je.mo54204a(com.veriff.sdk.internal.ba):com.veriff.sdk.internal.ix");
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C21789ix ixVar) throws IOException {
        C24362h.m61211f(bfVar, "writer");
        if (ixVar == null) {
            bfVar.mo54276e();
            return;
        }
        bfVar.mo54273c();
        bfVar.mo54269a("video_enabled");
        bfVar.mo54270a(ixVar.mo55446a());
        bfVar.mo54269a("video_required");
        bfVar.mo54270a(ixVar.mo55447b());
        bfVar.mo54269a("portrait_document");
        bfVar.mo54270a(ixVar.mo55448c());
        bfVar.mo54269a("portrait_document_video_failure");
        bfVar.mo54270a(ixVar.mo55449d());
        bfVar.mo54269a("inflow_feedback_dark_room");
        bfVar.mo54270a(ixVar.mo55451e());
        bfVar.mo54269a("inflow_feedback_face_detection");
        bfVar.mo54270a(ixVar.mo55453f());
        bfVar.mo54269a("android_picture_resolution_1100");
        bfVar.mo54270a(ixVar.mo55454g());
        bfVar.mo54269a("barcode_picture");
        bfVar.mo54270a(ixVar.mo55455h());
        bfVar.mo54269a("whitelabel_enabled");
        bfVar.mo54270a(ixVar.mo55457i());
        bfVar.mo54269a("portrait_picture");
        bfVar.mo54270a(ixVar.mo55458j());
        bfVar.mo54269a("leave_user_waiting_decision");
        bfVar.mo54270a(ixVar.mo55459k());
        bfVar.mo54269a("nfc_enabled");
        bfVar.mo54270a(ixVar.mo55460l());
        bfVar.mo54269a("nfc_required");
        bfVar.mo54270a(ixVar.mo55461m());
        bfVar.mo54269a("disable_document_pictures");
        bfVar.mo54270a(ixVar.mo55462n());
        bfVar.mo54269a("no_intro_screen_android");
        bfVar.mo54270a(ixVar.mo55463o());
        bfVar.mo54269a("sdk_ui_customization_enabled");
        bfVar.mo54270a(ixVar.mo55464p());
        bfVar.mo54269a("hide_language_change_temp_android");
        bfVar.mo54270a(ixVar.mo55465q());
        bfVar.mo54269a("merged_ui_temp_android");
        bfVar.mo54270a(ixVar.mo55466r());
        bfVar.mo54269a("selfie_auto_capture_temp_android");
        bfVar.mo54270a(ixVar.mo55467s());
        bfVar.mo54269a("capture_hud_dev_android");
        bfVar.mo54270a(ixVar.mo55468t());
        bfVar.mo54269a("decision_step_delay_ms");
        bfVar.mo54266a(ixVar.mo55470u());
        bfVar.mo54269a("decision_check_delay_ms");
        bfVar.mo54266a(ixVar.mo55471v());
        bfVar.mo54269a("inflow_timeout_ms");
        bfVar.mo54266a(ixVar.mo55472w());
        bfVar.mo54269a("inflow_retry_count");
        bfVar.mo54268a((Number) Integer.valueOf(ixVar.mo55474x()));
        bfVar.mo54269a("mrz_timeout_ms");
        bfVar.mo54266a(ixVar.mo55475y());
        bfVar.mo54269a("nfc_scan_retry_count");
        bfVar.mo54268a((Number) Integer.valueOf(ixVar.mo55476z()));
        bfVar.mo54269a("nfc_scan_timeout_ms");
        bfVar.mo54266a(ixVar.mo55424A());
        bfVar.mo54269a("nfc_connect_time_min_threshold_ms");
        bfVar.mo54266a(ixVar.mo55425B());
        bfVar.mo54269a("nfc_connection_lost_delay_ms");
        bfVar.mo54266a(ixVar.mo55426C());
        bfVar.mo54269a("nfc_chunk_size_min");
        bfVar.mo54268a((Number) Integer.valueOf(ixVar.mo55427D()));
        bfVar.mo54269a("nfc_chunk_size_max");
        bfVar.mo54268a((Number) Integer.valueOf(ixVar.mo55428E()));
        bfVar.mo54269a("nfc_chunk_size_default");
        bfVar.mo54268a((Number) Integer.valueOf(ixVar.mo55429F()));
        bfVar.mo54269a("barcode_scan_timeout_ms");
        bfVar.mo54266a(ixVar.mo55430G());
        bfVar.mo54269a("barcode_scan_retry_count");
        bfVar.mo54268a((Number) Integer.valueOf(ixVar.mo55431H()));
        bfVar.mo54269a("barcode_result_delay_ms");
        bfVar.mo54266a(ixVar.mo55432I());
        bfVar.mo54269a("barcode_resolution");
        this.f55285a.mo54205a(bfVar, ixVar.mo55433J());
        bfVar.mo54269a("dark_room_threshold_android");
        bfVar.mo54265a(ixVar.mo55434K());
        bfVar.mo54269a("video_config_android");
        this.f55286b.mo54205a(bfVar, ixVar.mo55435L());
        bfVar.mo54269a("audio_config_android");
        this.f55287c.mo54205a(bfVar, ixVar.mo55436M());
        bfVar.mo54269a("nfc_supported_countries");
        this.f55288d.mo54205a(bfVar, ixVar.mo55437N());
        bfVar.mo54269a("autocapture_manual_fallback_timeout_ms");
        bfVar.mo54266a(ixVar.mo55438O());
        bfVar.mo54269a("autocapture_face_translation_error");
        bfVar.mo54268a((Number) Float.valueOf(ixVar.mo55439P()));
        bfVar.mo54269a("autocapture_min_face_size");
        bfVar.mo54268a((Number) Float.valueOf(ixVar.mo55440Q()));
        bfVar.mo54269a("autocapture_face_orientation_error");
        bfVar.mo54268a((Number) Integer.valueOf(ixVar.mo55441R()));
        bfVar.mo54269a("poa_enable_liveness_android");
        bfVar.mo54270a(ixVar.mo55442S());
        bfVar.mo54269a("poa_enable_multi_files_android");
        bfVar.mo54270a(ixVar.mo55443T());
        bfVar.mo54269a("poa_file_max_size_mb_android");
        bfVar.mo54268a((Number) Integer.valueOf(ixVar.mo55444U()));
        bfVar.mo54275d();
    }
}
