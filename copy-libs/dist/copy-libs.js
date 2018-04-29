(function (_, Kotlin, $module$_jetbrains_kotlin_webpack_plugin_libraries_lookup, $module$______package_json, $module$node_path, $module$node_fs) {
  'use strict';
  var Unit = Kotlin.kotlin.Unit;
  var basename = $module$node_path.basename;
  var join = $module$node_path.join;
  var copyFile = $module$node_fs.copyFile;
  var mkdir = $module$node_fs.mkdir;
  function rethrow$lambda(it) {
    if (it != null)
      throw it;
    return Unit;
  }
  var rethrow;
  function main$lambda(closure$dest) {
    return function (it) {
      var $receiver = $module$_jetbrains_kotlin_webpack_plugin_libraries_lookup.lookupKotlinLibraries([$module$______package_json]);
      var tmp$;
      for (tmp$ = 0; tmp$ !== $receiver.length; ++tmp$) {
        var element = $receiver[tmp$];
        copyFile(element, join(closure$dest, basename(element)), rethrow);
      }
      return Unit;
    };
  }
  function main(args) {
    var dest = 'dist/node_modules';
    mkdir(dest, main$lambda(dest));
  }
  Object.defineProperty(_, 'rethrow', {
    get: function () {
      return rethrow;
    }
  });
  _.main_kand9s$ = main;
  rethrow = rethrow$lambda;
  main([]);
  Kotlin.defineModule('copy-libs', _);
  return _;
}(module.exports, require('kotlin'), require('@jetbrains/kotlin-webpack-plugin/libraries-lookup'), require('../../package.json'), require('node/path'), require('node/fs')));
