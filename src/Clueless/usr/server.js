var express  = require('express');
var http     = require('http');
var path     = require('path');
var socketIO = require('socket.io');
var fs       = require('fs');

var app    = express();
var server = http.Server(app);
var io     = socketIO(server);

app.set('port', 8080);
app.use('/usr', express.static(__dirname + '/usr'));

// Gets the html page
app.get('/', function(request, response) {
  response.sendFile(path.join(__dirname, 'GameBoard.html'));
});

// Starts the server
server.listen(8080, function() {
  console.log('Starting server on port 8080');
});

// WebSocket handlers
io.on('connection', function(socket) {});

// FOR TESTING ONLY
setInterval(function() {
  io.sockets.emit('message', 'it works!');
}, 1000);

// Create a server object
http.createServer(function (req, res) {
  res.write("It Works!"); // response to client
  res.end();
}).listen(8080);

fs.readFile('GameBoard.html', function (err, html) {
  if (err) {
    throw err;
  }
  http.createServer(function (request, response) {
    response.writeHeader(200, {"Content-Type": "text/html"});
    response.write(html);
    response.end();
  }).listen(8080);
});
