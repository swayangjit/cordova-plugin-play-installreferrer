var exec = require('cordova/exec');

var PLUGIN_NAME = 'sbutility';

var sbutility = {
    getCampaignParameterInfo: function (onSuccess, onError) {
        exec(onSuccess, onError, PLUGIN_NAME, "getCampaignParameterInfo", ["getCampaignParameterInfo"]);
    },
    clearCampaignParameterInfo: function (onSuccess, onError) {
        exec(onSuccess, onError, PLUGIN_NAME, "clearCampaignParameterInfo", ["clearCampaignParameterInfo"]);
    },
}