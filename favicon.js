const sharp = require("sharp")

sharp('public/solidarity.svg')
  .toFile('public/favicon.ico')
