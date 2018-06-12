const https = require('https')

exports.handler = (event, context, callback) => {
  const path = `/build_hooks/${process.env.NETLIFY_HOOK_ID}`
  console.log('requesting:', path)
  https.request({
    method: 'POST',
    host: 'api.netlify.com',
    path,
  }, res => {
    if (res.statusCode !== 200) console.error(res.statusMessage)
    callback(null, {
      statusCode: 200,
      body: 'ok',
    })
  }).end()
}
