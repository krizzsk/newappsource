package com.google.firebase.messaging.reporting;

import p861ve.C20111b;

public final class MessagingClientEvent {

    /* renamed from: p */
    public static final /* synthetic */ int f36602p = 0;

    /* renamed from: a */
    public final long f36603a;

    /* renamed from: b */
    public final String f36604b;

    /* renamed from: c */
    public final String f36605c;

    /* renamed from: d */
    public final MessageType f36606d;

    /* renamed from: e */
    public final SDKPlatform f36607e;

    /* renamed from: f */
    public final String f36608f;

    /* renamed from: g */
    public final String f36609g;

    /* renamed from: h */
    public final int f36610h = 0;

    /* renamed from: i */
    public final int f36611i;

    /* renamed from: j */
    public final String f36612j;

    /* renamed from: k */
    public final long f36613k;

    /* renamed from: l */
    public final Event f36614l;

    /* renamed from: m */
    public final String f36615m;

    /* renamed from: n */
    public final long f36616n;

    /* renamed from: o */
    public final String f36617o;

    public enum Event implements C20111b {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        private Event(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements C20111b {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        private MessageType(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements C20111b {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        private SDKPlatform(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    static {
        MessageType messageType = MessageType.UNKNOWN;
        SDKPlatform sDKPlatform = SDKPlatform.UNKNOWN_OS;
        Event event = Event.UNKNOWN_EVENT;
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, String str5, Event event, String str6, String str7) {
        this.f36603a = j;
        this.f36604b = str;
        this.f36605c = str2;
        this.f36606d = messageType;
        this.f36607e = sDKPlatform;
        this.f36608f = str3;
        this.f36609g = str4;
        this.f36611i = i;
        this.f36612j = str5;
        this.f36613k = 0;
        this.f36614l = event;
        this.f36615m = str6;
        this.f36616n = 0;
        this.f36617o = str7;
    }
}
