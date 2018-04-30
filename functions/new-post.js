const http = require('http')

exports.handler = (event, context, callback) => {
  http.request({
    method: 'POST',
    host: 'api.netlify.com',
    path: `/build_hooks/${process.env.NETLIFY_HOOK_ID}`,
  }).end()
  callback(null, {
    statusCode: 200,
    body: 'ok',
  })
}
