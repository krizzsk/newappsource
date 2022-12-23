
//JavaScript Document
function AdImpression() {	
	invokeNativeFromMRaidJS('AdImpression');
}

function AdClickThru() {
	invokeNativeFromMRaidJS('AdClickThru');
}

function AdVideoFirstQuartile() {
	invokeNativeFromMRaidJS('AdVideoFirstQuartile');
}

function AdVideoMidpoint() {
	invokeNativeFromMRaidJS('AdVideoMidpoint');
}

function AdVideoThirdQuartile() {
	invokeNativeFromMRaidJS('AdVideoThirdQuartile');
}

function AdVideoComplete() {
	invokeNativeFromMRaidJS('AdVideoComplete');
}

function AdVideoStart() {
	invokeNativeFromMRaidJS('AdVideoStart');
}

function AdPlaying() {
	invokeNativeFromMRaidJS('AdPlaying');
}

function AdError() {
	invokeNativeFromMRaidJS('AdError');
}

function invokeNativeFromMRaidJS(comment) {
	 var invoke = "mraid://"+comment;
     window.mraid.JSToNativeHandler(invoke);
}

if(window['getVPAIDAd']) {
	var adEvents = window['getVPAIDAd']();
	adEvents.subscribe(AdImpression, 'AdImpression');
	adEvents.subscribe(AdClickThru, 'AdClickThru');
	adEvents.subscribe(AdVideoFirstQuartile, 'AdVideoFirstQuartile');
	adEvents.subscribe(AdVideoMidpoint, 'AdVideoMidpoint');
	adEvents.subscribe(AdVideoThirdQuartile, 'AdVideoThirdQuartile');
	adEvents.subscribe(AdVideoComplete, 'AdVideoComplete');
	adEvents.subscribe(AdVideoStart, 'AdVideoStart');
	adEvents.subscribe(AdPlaying, 'AdPlaying');
	adEvents.subscribe(AdError, 'AdError');
}
