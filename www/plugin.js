var exec = require('cordova/exec');

var PLUGIN_NAME = 'installReferrer';

var installReferrer = {
    getCampaignParameterInfo: function (onSuccess, onError) {
        exec(onSuccess, onError, PLUGIN_NAME, "getCampaignParameterInfo", ["getCampaignParameterInfo"]);
    },
    clearCampaignParameterInfo: function (onSuccess, onError) {
        exec(onSuccess, onError, PLUGIN_NAME, "clearCampaignParameterInfo", ["clearCampaignParameterInfo"]);
    },
}

module.exports = installReferrer;