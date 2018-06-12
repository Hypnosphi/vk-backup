const http = require('http')

exports.handler = (event, context, callback) => {
  console.log('requesting')
  http.request({
    method: 'POST',
    host: 'api.netlify.com',
    path: `/build_hooks/${process.env.NETLIFY_HOOK_ID}`,
  }, e => {
    if (e) console.error(e)
    callback(null, {
      statusCode: 200,
      body: 'ok',
    })
  }).end()
}
