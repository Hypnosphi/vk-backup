(function (_, Kotlin, $module$kotlin_extensions, $module$node_vk_sdk, $module$dotenv, $module$kotlinx_html_js, $module$fs) {
  'use strict';
  var $$importsForInline$$ = _.$$importsForInline$$ || (_.$$importsForInline$$ = {});
  var Unit = Kotlin.kotlin.Unit;
  var VKApi = $module$node_vk_sdk.VKApi;
  var addAll = Kotlin.kotlin.collections.addAll_ye1y7v$;
  var numberToInt = Kotlin.numberToInt;
  var equals = Kotlin.equals;
  var listOf = Kotlin.kotlin.collections.listOf_i5x0yv$;
  var filterNotNull = Kotlin.kotlin.collections.filterNotNull_m3lr2h$;
  var joinToString = Kotlin.kotlin.collections.joinToString_fmv235$;
  var config = $module$dotenv.config;
  var ConsoleLogger = $module$node_vk_sdk.ConsoleLogger;
  var toList = Kotlin.kotlin.collections.toList_us0mfu$;
  var chunked = Kotlin.kotlin.collections.chunked_ba2ldo$;
  var appendHTML = $module$kotlinx_html_js.kotlinx.html.stream.appendHTML_9kwp7w$;
  var set_lang = $module$kotlinx_html_js.kotlinx.html.set_lang_ueiko3$;
  var meta = $module$kotlinx_html_js.kotlinx.html.meta_xvdp3k$;
  var link = $module$kotlinx_html_js.kotlinx.html.link_gyx145$;
  var trimIndent = Kotlin.kotlin.text.trimIndent_pdl1vz$;
  var unsafe = $module$kotlinx_html_js.kotlinx.html.unsafe_vdrn79$;
  var script = $module$kotlinx_html_js.kotlinx.html.script_fglb7v$;
  var head = $module$kotlinx_html_js.kotlinx.html.head_cwj6vx$;
  var h1 = $module$kotlinx_html_js.kotlinx.html.h1_vmej1w$;
  var Regex_init = Kotlin.kotlin.text.Regex_init_61zpoe$;
  var h4 = $module$kotlinx_html_js.kotlinx.html.h4_zdyoc7$;
  var p = $module$kotlinx_html_js.kotlinx.html.p_8pggrc$;
  var ensureNotNull = Kotlin.ensureNotNull;
  var img = $module$kotlinx_html_js.kotlinx.html.img_evw26v$;
  var div = $module$kotlinx_html_js.kotlinx.html.div_ri36nr$;
  var a = $module$kotlinx_html_js.kotlinx.html.a_gu26kr$;
  var iframe = $module$kotlinx_html_js.kotlinx.html.iframe_rz24s4$;
  var article = $module$kotlinx_html_js.kotlinx.html.article_hpv6ge$;
  var hr = $module$kotlinx_html_js.kotlinx.html.hr_17yvwq$;
  var body = $module$kotlinx_html_js.kotlinx.html.body_qwuuhi$;
  var html = $module$kotlinx_html_js.kotlinx.html.html_dq808k$;
  var writeFile = $module$fs.writeFile;
  function vkApi$lambda($receiver) {
    return Unit;
  }
  function vkApi(init) {
    if (init === void 0)
      init = vkApi$lambda;
    var obj = {};
    init(obj);
    return new VKApi(obj);
  }
  function wallGet$lambda($receiver) {
    return Unit;
  }
  function wallGet($receiver, init) {
    if (init === void 0)
      init = wallGet$lambda;
    var obj = {};
    init(obj);
    return $receiver.wallGet(obj);
  }
  function photosGetById$lambda($receiver) {
    return Unit;
  }
  function photosGetById($receiver, init) {
    if (init === void 0)
      init = photosGetById$lambda;
    var obj = {};
    init(obj);
    return $receiver.photosGetById(obj);
  }
  function videoGet$lambda($receiver) {
    return Unit;
  }
  function videoGet($receiver, init) {
    if (init === void 0)
      init = videoGet$lambda;
    var obj = {};
    init(obj);
    return $receiver.videoGet(obj);
  }
  var PAGE_SIZE;
  function getAllPosts$lambda($receiver) {
    return Unit;
  }
  function getAllPosts$getAll$lambda(closure$init, closure$offset) {
    return function ($receiver) {
      closure$init($receiver);
      $receiver.offset = closure$offset;
      $receiver.count = 100;
      return Unit;
    };
  }
  function getAllPosts$getAll$lambda_0(closure$offset, closure$posts, closure$getAll) {
    return function (it) {
      console.log(closure$offset);
      addAll(closure$posts, it.items);
      var nextOffset = closure$offset + 100 | 0;
      if (nextOffset <= numberToInt(it.count)) {
        return closure$getAll(nextOffset);
      }
       else {
        return Promise.resolve(closure$posts);
      }
    };
  }
  function getAllPosts$getAll$lambda_1(it) {
    return it;
  }
  function getAllPosts$getAll(closure$init, this$getAllPosts, closure$posts) {
    return function closure$getAll(offset) {
      if (offset === void 0)
        offset = 0;
      return wallGet(this$getAllPosts, getAllPosts$getAll$lambda(closure$init, offset)).then(getAllPosts$getAll$lambda_0(offset, closure$posts, closure$getAll)).then(getAllPosts$getAll$lambda_1);
    };
  }
  var ArrayList_init = Kotlin.kotlin.collections.ArrayList_init_ww73n8$;
  function getAllPosts($receiver, init) {
    if (init === void 0)
      init = getAllPosts$lambda;
    var posts = ArrayList_init();
    var getAll = getAllPosts$getAll(init, $receiver, posts);
    return getAll();
  }
  function ownerId($receiver, groupId) {
    return equals($receiver.owner_id, 100) ? groupId : $receiver.owner_id;
  }
  function request($receiver, groupId) {
    return joinToString(filterNotNull(listOf([ownerId($receiver, groupId), $receiver.id, $receiver.access_key])), '_');
  }
  function get_request($receiver) {
    return joinToString(filterNotNull(listOf([$receiver.owner_id, $receiver.id, $receiver.access_key])), '_');
  }
  var MAX_VIDEOS;
  function main$lambda($receiver) {
    $receiver.logger = new ConsoleLogger();
    $receiver.token = process.env.VK_TOKEN;
    $receiver.useQueue = true;
    return Unit;
  }
  function main$lambda_0(closure$groupId) {
    return function ($receiver) {
      $receiver.owner_id = closure$groupId;
      $receiver.photo_sizes = 1;
      return Unit;
    };
  }
  var collectionSizeOrDefault = Kotlin.kotlin.collections.collectionSizeOrDefault_ba2ldo$;
  var copyToArray = Kotlin.kotlin.collections.copyToArray;
  function main$lambda$lambda$lambda(closure$vids) {
    return function ($receiver) {
      $receiver.count = 50;
      var $receiver_0 = closure$vids;
      var destination = ArrayList_init(collectionSizeOrDefault($receiver_0, 10));
      var tmp$;
      tmp$ = $receiver_0.iterator();
      while (tmp$.hasNext()) {
        var item = tmp$.next();
        destination.add_11rb$(get_request(item));
      }
      $receiver.videos = copyToArray(destination);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda_0(closure$videoAttachments) {
    return function (it) {
      console.log(it.items.length);
      var $receiver = it.items;
      var tmp$;
      for (tmp$ = 0; tmp$ !== $receiver.length; ++tmp$) {
        var element = $receiver[tmp$];
        var $receiver_0 = closure$videoAttachments;
        var destination = ArrayList_init();
        var tmp$_0;
        tmp$_0 = $receiver_0.iterator();
        while (tmp$_0.hasNext()) {
          var element_0 = tmp$_0.next();
          if (equals(element_0.video.id, element.id))
            destination.add_11rb$(element_0);
        }
        var tmp$_1;
        tmp$_1 = destination.iterator();
        while (tmp$_1.hasNext()) {
          var element_1 = tmp$_1.next();
          element_1.video = element;
        }
      }
      return Unit;
    };
  }
  function main$lambda$lambda$lambda_1(it) {
    console.error(it);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda($receiver) {
    $receiver.charset = 'utf-8';
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$(trimIndent("\n                                    document.addEventListener('keydown', function(event) {\n                                        if (event.key === 'g') {\n                                            document.body.classList.toggle('grid');\n                                        }\n                                    });\n                                "));
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_0($receiver) {
    unsafe($receiver, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda($receiver) {
    meta($receiver, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda);
    link($receiver, 'index.css', 'stylesheet');
    script($receiver, void 0, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_0);
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda_1($receiver) {
    $receiver.unaryPlus_pdl1vz$('\u041A\u043E\u043C\u0438\u0442\u0435\u0442 \u041E\u0431\u0449\u0435\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0439 \u0421\u0430\u043C\u043E\u0437\u0430\u0449\u0438\u0442\u044B');
    return Unit;
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(closure$paragraph) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$(closure$paragraph);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0(closure$paragraph) {
    return function ($receiver) {
      $receiver.unaryPlus_pdl1vz$(closure$paragraph);
      return Unit;
    };
  }
  var get_lastIndex = Kotlin.kotlin.collections.get_lastIndex_m7z4lg$;
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(closure$it) {
    return function ($receiver) {
      var $receiver_0 = closure$it.sizes;
      var maxBy$result;
      maxBy$break: do {
        var tmp$;
        if ($receiver_0.length === 0) {
          maxBy$result = null;
          break maxBy$break;
        }
        var maxElem = $receiver_0[0];
        var it = maxElem;
        var maxValue = numberToInt(it.width) + numberToInt(it.height) | 0;
        tmp$ = get_lastIndex($receiver_0);
        for (var i = 1; i <= tmp$; i++) {
          var e = $receiver_0[i];
          var v = numberToInt(e.width) + numberToInt(e.height) | 0;
          if (Kotlin.compareTo(maxValue, v) < 0) {
            maxElem = e;
            maxValue = v;
          }
        }
        maxBy$result = maxElem;
      }
       while (false);
      $receiver.src = ensureNotNull(maxBy$result).src;
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(closure$it) {
    return function ($receiver) {
      var $receiver_0 = closure$it.sizes;
      var maxBy$result;
      maxBy$break: do {
        var tmp$;
        if ($receiver_0.length === 0) {
          maxBy$result = null;
          break maxBy$break;
        }
        var maxElem = $receiver_0[0];
        var it = maxElem;
        var maxValue = numberToInt(it.width) + numberToInt(it.height) | 0;
        tmp$ = get_lastIndex($receiver_0);
        for (var i = 1; i <= tmp$; i++) {
          var e = $receiver_0[i];
          var v = numberToInt(e.width) + numberToInt(e.height) | 0;
          if (Kotlin.compareTo(maxValue, v) < 0) {
            maxElem = e;
            maxValue = v;
          }
        }
        maxBy$result = maxElem;
      }
       while (false);
      $receiver.src = ensureNotNull(maxBy$result).src;
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(closure$it) {
    return function ($receiver) {
      img($receiver, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(closure$it));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0(closure$it) {
    return function ($receiver) {
      var tmp$;
      if ((tmp$ = closure$it.photo) != null) {
        div($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(tmp$));
      }
      $receiver.unaryPlus_pdl1vz$(closure$it.title);
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(closure$it) {
    return function ($receiver) {
      $receiver.src = closure$it;
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_1(closure$it) {
    return function ($receiver) {
      $receiver.src = closure$it.player;
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0(closure$post) {
    return function ($receiver) {
      var tmp$;
      var $receiver_0 = closure$post.text;
      var tmp$_0, tmp$_0_0;
      var index = 0;
      tmp$_0 = Regex_init('\\n+').split_905azu$($receiver_0, 0).iterator();
      while (tmp$_0.hasNext()) {
        var item = tmp$_0.next();
        if ((tmp$_0_0 = index, index = tmp$_0_0 + 1 | 0, tmp$_0_0) === 0 && item.length <= 100) {
          h4($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(item));
        }
         else {
          p($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0(item));
        }
      }
      if ((tmp$ = closure$post.attachments) != null) {
        var tmp$_1;
        for (tmp$_1 = 0; tmp$_1 !== tmp$.length; ++tmp$_1) {
          var element = tmp$[tmp$_1];
          var tmp$_2, tmp$_3, tmp$_4;
          if ((tmp$_2 = element.photo) != null) {
            img($receiver, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(tmp$_2));
          }
          if ((tmp$_3 = element.link) != null) {
            a($receiver, tmp$_3.url, void 0, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0(tmp$_3));
          }
          if ((tmp$_4 = element.video) != null) {
            var tmp$_5;
            if (tmp$_4.player == null) {
              console.error('No player:', tmp$_4);
              if ((tmp$_5 = tmp$_4.photo_800) != null) {
                img($receiver, void 0, void 0, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda(tmp$_5));
              }
            }
             else {
              iframe($receiver, void 0, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda$lambda_1(tmp$_4));
            }
          }
        }
      }
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda$lambda_0(closure$posts) {
    return function ($receiver) {
      h1($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda_1);
      var tmp$;
      tmp$ = closure$posts.iterator();
      while (tmp$.hasNext()) {
        var element = tmp$.next();
        article($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda$lambda$lambda_0(element));
        hr($receiver);
      }
      return Unit;
    };
  }
  function main$lambda$lambda$lambda$lambda(closure$posts) {
    return function ($receiver) {
      set_lang($receiver, 'ru');
      head($receiver, main$lambda$lambda$lambda$lambda$lambda);
      body($receiver, void 0, main$lambda$lambda$lambda$lambda$lambda_0(closure$posts));
      return Unit;
    };
  }
  function main$lambda$lambda$lambda_2(it) {
    if (it != null)
      throw it;
    process.exit(0);
    return Unit;
  }
  var StringBuilder_init = Kotlin.kotlin.text.StringBuilder;
  function main$lambda$lambda(closure$posts) {
    return function (it) {
      var $receiver = new StringBuilder_init();
      var closure$posts_0 = closure$posts;
      $receiver.append_gw00v9$('<!DOCTYPE html>');
      html(appendHTML($receiver), main$lambda$lambda$lambda$lambda(closure$posts_0));
      var htmlString = $receiver.toString();
      writeFile('public/index.html', htmlString, main$lambda$lambda$lambda_2);
      return Unit;
    };
  }
  var wrapFunction = Kotlin.wrapFunction;
  var mapNotNullTo$lambda = wrapFunction(function () {
    return function (closure$transform, closure$destination) {
      return function (element) {
        var tmp$;
        if ((tmp$ = closure$transform(element)) != null) {
          closure$destination.add_11rb$(tmp$);
        }
        return Unit;
      };
    };
  });
  var addAll_0 = Kotlin.kotlin.collections.addAll_ipc267$;
  var HashSet_init = Kotlin.kotlin.collections.HashSet_init_287e2$;
  function main$lambda_1(closure$api) {
    return function (posts) {
      var destination = ArrayList_init();
      var tmp$;
      tmp$ = posts.iterator();
      while (tmp$.hasNext()) {
        var element = tmp$.next();
        var tmp$_0;
        if ((tmp$_0 = element.attachments) != null) {
          destination.add_11rb$(tmp$_0);
        }
      }
      var destination_0 = ArrayList_init();
      var tmp$_1;
      tmp$_1 = destination.iterator();
      while (tmp$_1.hasNext()) {
        var element_0 = tmp$_1.next();
        var list = toList(element_0);
        addAll_0(destination_0, list);
      }
      var destination_1 = ArrayList_init();
      var tmp$_2;
      tmp$_2 = destination_0.iterator();
      while (tmp$_2.hasNext()) {
        var element_1 = tmp$_2.next();
        if (equals(element_1.type, 'video'))
          destination_1.add_11rb$(element_1);
      }
      var videoAttachments = destination_1;
      var destination_2 = ArrayList_init(collectionSizeOrDefault(videoAttachments, 10));
      var tmp$_3;
      tmp$_3 = videoAttachments.iterator();
      while (tmp$_3.hasNext()) {
        var item = tmp$_3.next();
        destination_2.add_11rb$(item.video);
      }
      var tmp$_4;
      var set = HashSet_init();
      var list_0 = ArrayList_init();
      tmp$_4 = destination_2.iterator();
      while (tmp$_4.hasNext()) {
        var e = tmp$_4.next();
        var key = e.id;
        if (set.add_11rb$(key))
          list_0.add_11rb$(e);
      }
      var $receiver = chunked(list_0, 50);
      var destination_3 = ArrayList_init(collectionSizeOrDefault($receiver, 10));
      var tmp$_5;
      tmp$_5 = $receiver.iterator();
      while (tmp$_5.hasNext()) {
        var item_0 = tmp$_5.next();
        var tmp$_6 = destination_3.add_11rb$;
        var closure$api_0 = closure$api;
        console.log(item_0.size);
        tmp$_6.call(destination_3, videoGet(closure$api_0, main$lambda$lambda$lambda(item_0)).then(main$lambda$lambda$lambda_0(videoAttachments)).catch(main$lambda$lambda$lambda_1));
      }
      var videoPromises = copyToArray(destination_3);
      return Promise.all(videoPromises).then(main$lambda$lambda(posts));
    };
  }
  function main$lambda_2(it) {
    console.error(it);
    process.exit(1);
    return Unit;
  }
  function main(args) {
    config();
    var groupId = process.env.VK_GROUP_ID;
    var api = vkApi(main$lambda);
    getAllPosts(api, main$lambda_0(groupId)).then(main$lambda_1(api)).catch(main$lambda_2);
  }
  $$importsForInline$$['kotlin-extensions'] = $module$kotlin_extensions;
  var package$vk = _.vk || (_.vk = {});
  var package$sdk = package$vk.sdk || (package$vk.sdk = {});
  package$sdk.vkApi_4nqw45$ = vkApi;
  package$sdk.wallGet_l0xrdn$ = wallGet;
  package$sdk.photosGetById_sdao5c$ = photosGetById;
  package$sdk.videoGet_29c1wa$ = videoGet;
  Object.defineProperty(package$sdk, 'PAGE_SIZE', {
    get: function () {
      return PAGE_SIZE;
    }
  });
  package$sdk.getAllPosts_l0xrdn$ = getAllPosts;
  package$sdk.ownerId_n7npo5$ = ownerId;
  package$sdk.request_n7npo5$ = request;
  package$sdk.get_request_c1jsyq$ = get_request;
  Object.defineProperty(_, 'MAX_VIDEOS', {
    get: function () {
      return MAX_VIDEOS;
    }
  });
  _.main_kand9s$ = main;
  PAGE_SIZE = 100;
  MAX_VIDEOS = 50;
  main([]);
  Kotlin.defineModule('vk-backup', _);
  return _;
}(module.exports, require('kotlin'), require('kotlin-extensions'), require('node-vk-sdk'), require('dotenv'), require('kotlinx-html-js'), require('fs')));
