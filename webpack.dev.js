const {merge} = require('webpack-merge');
const common = require('./webpack.common.js');

module.exports = (env) => {
    return merge (common(env, "development"), {
        devtool: 'eval-cheap-module-source-map',
        cache: true
    })
};
