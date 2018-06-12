const http = require('http')

exports.handler = (event, context, callback) => {
  const path = `/build_hooks/${process.env.NETLIFY_HOOK_ID}`
  console.log('requesting:', path)
  http.request({
    method: 'POST',
    host: 'api.netlify.com',
    path,
  }, res => {
    if (res.statusCode !== 200) console.error(res.statusMessage, res.url)
    callback(null, {
      statusCode: 200,
      body: 'ok',
    })
  }).end()
}
