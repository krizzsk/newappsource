
//Console Logging
console = {};
console.log = function(log) {
	UMOAKMRaidWebView.JSToNativeHandler("console://localhost: " + log);
};

console.debug = console.log;
console.info = console.log;
console.warn = console.log;
console.error = console.log;

window.mraid_init = function() {
    console.log("mraid_init");
    
    var mraid = window.mraid = {};
    
    mraid.returnResult = function(call) {
        console.log("mraid.returnResult");
        return call().toString();
    };
    
    mraid.returnInfo = function(call) {
        console.log("mraid.returnInfo");
        var info = '';
        var result = call();
        for (property in result) {
            if (info) {
                info += '&';
            }
            info += encodeURIComponent(property) + '=' + encodeURIComponent(result[property]);
        }
        return info;
    };
    
    mraid.invokeNativeFromMRaidJS = function(call) {
        console.log("mraid.invokeNativeFromMRaidJS: Call: " + call);
    	UMOAKMRaidWebView.JSToNativeHandler(call);
    };
    
    ////////////////////// MRAID Events & Event Listeners //////////////////////
    var EVENTS = mraid.EVENTS = {
        READY                   :"ready",
        ERROR                   :"error",
        STATE_CHANGE            :"stateChange",
        VIEWABLE_CHANGE         :"viewableChange",
        SIZE_CHANGE             :"sizeChange"
    };

    var listeners = {};

    mraid.addEventListener = function(event, listener) {
        console.log("mraid.addEventListener: Event: " + event);
        var handlers = listeners[event];
        
        //Create the listeners for the event if not already created
        if (!handlers) {
            listeners[event] = [];
            handlers = listeners[event];
        }
        
        // Don't add the same listener twice
        for (var i = 0; i < handlers.length; ++i) {
            if (listener === handlers[i]) {
                return;
            }
        }
        
        //Add the new listener
        handlers.push(listener);
    };
    
    mraid.removeEventListener = function(event, listener) {
        console.log("mraid.removeEventListener: Event: " + event);
        var handlers = listeners[event];
        if (handlers) {
            if (listener) {
                delete handlers[listener];
            } else {
                listeners[event] = null;
            }
        }
    };
    
    mraid.fireChangeEvent = function(event, newValue) {
        console.log("mraid.fireChangeEvent: " + event + ", with:" + newValue);
        var handlers = listeners[event];
        if (handlers) {
            for (var i = 0; i < handlers.length; ++i) {
                console.log("fireChangeEvent invoked handler");
                handlers[i](newValue);
            }
        }
    };
    
    mraid.fireErrorEvent = function(message, action) {
        console.log("mraid.fireErrorEvent: " + message + ", action:" + action);
        var handlers = listeners[EVENTS.ERROR];
        if (handlers) {
            for (var i = 0; i < handlers.length; ++i) {
                handlers[i](message, action);
            }
        }
    };
    
    mraid.fireEvent = function(event) {
        console.log("mraid.fireEvent: " + event);
        var handlers = listeners[event];
        if (handlers) {
            for (var i = 0; i < handlers.length; ++i) {
                handlers[i]();
            }
        }
    };
    
    ////////////////////// MRAID Version //////////////////////
    mraid.getVersion = function() {
        console.log("mraid.getVersion");
        return ("2.0");
    };
    
    ////////////////////// MRAID Native Features //////////////////////
    var FEATURES = mraid.FEATURES = {
        SMS             :"sms",
        TEL             :"tel",
        CALENDAR        :"calendar",
        STORE_PICTURE   :"storePicture",
        INLINE_VIDEO    :"inlineVideo"
    };
    
    var supportedFeatures = {};
    
    mraid.setSupports = function(feature, supported) {
        console.log("mraid.setSupports");
        supportedFeatures[feature] = supported;
    };
    
    mraid.supports = function(feature) {
        console.log("mraid.supports");
        return supportedFeatures[feature];
    };

    mraid.playVideo = function(url) {
        console.log("mraid.playVideo");
        var jsCommand = "mraid://playVideo?url=" + encodeURIComponent(url);
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };

    mraid.storePicture = function(url) {
        console.log("mraid.storePicture");
        var jsCommand = "mraid://storePicture?url=" + encodeURIComponent(url);
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };

    mraid.createCalendarEvent = function(parameters) {
        console.log("mraid.createCalendarEvent");
        var jsCommand = "mraid://createCalendarEvent?event=" + encodeURIComponent(JSON.stringify(parameters));
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };
    
    ////////////////////// MRAID States //////////////////////
    var STATES = mraid.STATES = {
        LOADING     :"loading",
        DEFAULT     :"default",
        EXPANDED    :"expanded",
        RESIZED     :"resized",
        HIDDEN      :"hidden"
    };
    
    var state = STATES.LOADING;
    
    mraid.setState = function(newState) {
        console.log("mraid.setState");
        var diff = state != newState;
        state = newState;
        if (diff) {
            mraid.fireChangeEvent(EVENTS.STATE_CHANGE, state);
        } else if (state === STATES.RESIZED) {
            //spec says resized -> resized fires an event
            mraid.fireChangeEvent(EVENTS.STATE_CHANGE, state);
        }
    };
    
    mraid.getState = function() {
        console.log("mraid.getState");
        return state;
    };
    
    ////////////////////// MRAID Placement Types //////////////////////
    var PLACEMENT_TYPES = mraid.PLACEMENT_TYPES = {
        INLINE          :"inline",
        INTERSTITIAL    :"interstitial"
    };
    
    var placementType = PLACEMENT_TYPES.INLINE;
    
    mraid.setPlacementType = function(newPlacementType) {
        console.log("mraid.setPlacementType");
        placementType = newPlacementType;
    };
    
    mraid.getPlacementType = function() {
        console.log("mraid.getPlacementType");
        return placementType;
    };

    ////////////////////// MRAID Viewability //////////////////////
    var isViewable = false;
    
    mraid.setViewable = function(viewable) {
        console.log("mraid.setViewable");
        var diff = isViewable != viewable;
        isViewable = viewable;
        if (diff) {
            mraid.fireChangeEvent(EVENTS.VIEWABLE_CHANGE, isViewable);
        }
    };
    
    mraid.isViewable = function() {
        console.log("mraid.isViewable");
        return isViewable;
    };
    
    ////////////////////// MRAID Expand //////////////////////
    var expandProperties = {
        width:0,
        height:0,
        useCustomClose:false,
        isModal:true
    };
    
    mraid.setExpandProperties = function(properties) {
        console.log("mraid.setExpandProperties: " + JSON.stringify(properties));
        var writableFields = ["width", "height", "useCustomClose"];
        for (wf in writableFields) {
            var field = writableFields[wf];
            if (properties[field] !== undefined) {
                expandProperties[field] = properties[field];
            }
        }
        //expandProperties["width"] = 500 //for testing
        //expandProperties["height"] = 800 //for testing
        var jsCommand = "mraid://setExpandProperties?" + mraid.returnInfo(mraid.getExpandProperties);
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };
    
    mraid.getExpandProperties = function() {
        console.log("mraid.getExpandProperties");
        return expandProperties;
    };

    mraid.expand = function(url) {
        console.log("mraid.expand");
        var jsCommand = "mraid://expand";
        if (url) {
            jsCommand += "?url=" + encodeURIComponent(url);
        }
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };

    ////////////////////// MRAID Close //////////////////////
    mraid.useCustomClose = function(useCustomClose) {
        console.log("mraid.useCustomClose");
        var property = { useCustomClose : useCustomClose };
        mraid.setExpandProperties(property);
    };
    
    ////////////////////// MRAID Resize //////////////////////
    var RESIZE_PROPERTIES_CUSTOM_CLOSE_POSITION = mraid.RESIZE_PROPERTIES_CUSTOM_CLOSE_POSITION = {
        TOP_LEFT        :"top-left",
        TOP_RIGHT       :"top-right",
        CENTER          :"center",
        BOTTOM_LEFT     :"bottom-left",
        BOTTOM_RIGHT    :"bottom-right"
    };
    
    var resizeProperties = {
        width:0,
        height:0,
        customClosePosition:RESIZE_PROPERTIES_CUSTOM_CLOSE_POSITION.TOP_RIGHT,
        offsetX:0,
        offsetY:0,
        allowOffscreen:false
    };
    
    mraid.setResizeProperties = function(properties) {
        console.log("mraid.setResizeProperties");
        var writableFields = ["width", "height", "customClosePosition", "offsetX", "offsetY", "allowOffscreen"];
        for (wf in writableFields) {
            var field = writableFields[wf];
            if (properties[field] !== undefined) {
                resizeProperties[field] = properties[field];
            }
        }
        var jsCommand = "mraid://setResizeProperties?" + mraid.returnInfo(mraid.getResizeProperties);
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };
    
    mraid.getResizeProperties = function() {
        console.log("mraid.getResizeProperties");
        return resizeProperties;
    };
    
    mraid.resize = function() {
        console.log("mraid.resize");
        var jsCommand = "mraid://resize";
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };
    
    
    ////////////////////// MRAID Orientation //////////////////////
    var ORIENTATION_PROPERTIES_FORCE_ORIENTATION = mraid.ORIENTATION_PROPERTIES_FORCE_ORIENTATION = {
        PORTRAIT    :"portrait",
        LANDSCAPE   :"landscape",
        NONE        :"none"
    };
    
    var orientationProperties = {
        allowOrientationChange:true,
        forceOrientation:ORIENTATION_PROPERTIES_FORCE_ORIENTATION.NONE
    };
    
    mraid.setOrientationProperties = function(properties) {
        console.log("mraid.setOrientationProperties");
        var writableFields = ["allowOrientationChange", "forceOrientation"];
        for (wf in writableFields) {
            var field = writableFields[wf];
            if (properties[field] !== undefined) {
                orientationProperties[field] = properties[field];
            }
        }
        var jsCommand = "mraid://setOrientationProperties?" + mraid.returnInfo(mraid.getOrientationProperties);
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };
    
    mraid.getOrientationProperties = function() {
        console.log("mraid.getOrientationProperties");
        return orientationProperties;
    };
    
    ////////////////////// MRAID Position & Size //////////////////////
    var currentPosition = {
        x:0,
        y:0,
        width:0,
        height:0
    };
    
    var maxSize = {
        width:0,
        height:0
    };
    
    var defaultPosition = {
        x:0,
        y:0,
        width:0,
        height:0
    };
    
    var screenSize = {
        width:0,
        height:0
    };
    
    var currentOrientation = 0;
    
    mraid.setCurrentPosition = function(position) {
        console.log("mraid.setCurrentPosition: " + JSON.stringify(position));
        var previousSize = mraid.getSize();
        currentPosition = position;
        var currentSize = mraid.getSize();

        console.log("mraid.setCurrentPosition: previousSize: " + JSON.stringify(previousSize));
        console.log("mraid.setCurrentPosition: currentSize: " + JSON.stringify(currentSize));

        // Only send the size changed event if the size in the position
        // was different from the previous position
        if ((previousSize.width === currentSize.width) && (previousSize.height === currentSize.height)) {
            console.log("mraid.setCurrentPosition: currentSize === previousSize");
            return;
        }
        console.log("mraid.setCurrentPosition: Updating --- 1 ");
        var handlers = listeners[EVENTS.SIZE_CHANGE];
        if (handlers) {
            console.log("mraid.setCurrentPosition: Updating --- 2 ");
            var width = currentPosition.width;
            var height = currentPosition.height;
            for (var i = 0; i < handlers.length; ++i) {
                console.log("mraid.setCurrentPosition: Updating --- 3 ");
                handlers[i](width, height);
            }
        }
    };
    
    mraid.getCurrentPosition = function() {
        console.log("mraid.getCurrentPosition");
        var jsCommand = "mraid://updateCurrentPosition";
        mraid.invokeNativeFromMRaidJS(jsCommand);
        return currentPosition;
    };
    
    mraid.getSize = function() {
        console.log("mraid.getSize");
        var size = {
            width:currentPosition.width,
            height:currentPosition.height
        };
        return size;
    };
    
    mraid.setMaxSize = function(size) {
        console.log("mraid.setMaxSize");
        maxSize = size;
    };
    
    mraid.getMaxSize = function() {
        console.log("mraid.getMaxSize");
        return maxSize;
    };
    
    mraid.setDefaultPosition = function(position) {
        console.log("mraid.setDefaultPosition");
        defaultPosition = position;
    };
    
    mraid.getDefaultPosition = function() {
        console.log("mraid.getDefaultPosition");
        return defaultPosition;
    };
    
    mraid.setScreenSize = function(size) {
        console.log("mraid.setScreenSize");
        screenSize = size;
    };
    
    mraid.getScreenSize = function() {
        console.log("mraid.getScreenSize");
        return screenSize;
    };

    ////////////////////// Other MRAID Methods //////////////////////
    mraid.open = function(url) {
        console.log("mraid.open");
        var jsCommand = "mraid://open?url=" + encodeURIComponent(url);
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };

    mraid.close = function() {
        console.log("mraid.close");
        var jsCommand = "mraid://close";
        mraid.invokeNativeFromMRaidJS(jsCommand);
    };

    mraid.invokeNativeFromMRaidJS("mraid://init");
};

////////////////////// MRAID Init //////////////////////
if (!window.mraid) {
    window.mraid_init();
}

