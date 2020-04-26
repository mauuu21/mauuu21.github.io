let name = "Mate";

name + " 's apples";

console.log(name + " 's apple");
console.log("hello World");

let color = 'blue';

$('h1').text('We are having a 10 minutes break');
$('p').html('Stay at home, Likes:<strong>13</span>')
$('strong').css('background', 'lime');
$('h2').toggleClass(color);
/*$('h2').toggleClass('blue');   ha duplázzuk törli a parancsot*/
$('ul').append('<li>My name is' + name + '</li>');
$('ul').append('<li>My name is' + name + '</li>');
$('ul').append('<li id= "special-list-item">Removable' + name + '</li>');

/*$('#special-list-item').remove(); ---> ezzel törlünk



/*$('li').remove(); ---> mindent töröl ami list(li)*/

let addButtonHandler = () => {
    if ($('li').length < 5) {
    $('ul').append('<li>My name is' + name + '</li>');
    }
};

$('#addButton').click(addButtonHandler);
$('#removeButton').click(() => {
    $('li:last-child').remove('');
});

let age = 29;

console.log('Starting the if');
console.log('This is a Sentence'.toLowerCase());/*.toLowerCase -->  csak kisbetűvel írja ki*/
if (age < 18) {
console.log('not old enough to drink');
} else {
console.log('Old enough to drink');
}

console.log(' Closing the if');

let colors = ['orange', 'lime', 'magenta', 'yellow', 'blue'];
$('#box-container').append('<div class= "box"></div>');
$('.box:last-child').css('background', colors[0]);
$('#box-container').append('<div class= "box"></div>');
$('.box:last-child').css('background', colors[1]);
$('#box-container').append('<div class= "box"></div>');
$('.box:last-child').css('background', colors[2]);
$('#box-container').append('<div class= "box"></div>');
$('.box:last-child').css('background', colors[3]);
$('#box-container').append('<div class= "box"></div>');
$('.box:last-child').css('background', colors[4]);

/*egyik megoldás,hogy hogyan adjunk hozzá elemet js.-ben + css,+html elemekkel együtt*/

colors.push('purple');

colors.forEach((color) => {
    $('#box-container').append('<div class= "box"></div>');
    $('.box:last-child').css('background', color);
});
/*másik megoldás-- > ez a praktikus*/

for (i = 0; i < 100; i = i++) {
console.log(i);
};