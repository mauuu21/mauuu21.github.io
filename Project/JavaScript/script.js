let name = "Mate";

name + " 's apples";

console.log(name + " 's apple");
console.log("hello World");

$('h1').text('We are having a 10 minutes break');
$('p').html('Stay at home, Likes:<strong>13</span>')
$('strong').css('background', 'lime');
$('h2').toggleClass('blue');
$('ul').append('<li>My name is' + name + '</li>');
$('ul').append('<li>My name is' + name + '</li>');
$('ul').append('<li id= "special-list-item">Removable' + name + '</li>');

$('#special-list-item').remove();



/*$('li').remove();*/

$('#addButton').click(() => {
    $('ul').append('<li>My name is' + name + '</li>');
});
$('#removeButton').click(() => {
    $('li:last-child').remove('');
});



