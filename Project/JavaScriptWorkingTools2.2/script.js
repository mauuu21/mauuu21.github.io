

$('body').append('<ul>Names</ul>');
$('ul').append('<li></li>');

let valueNames (array) => {
    array.forEach(value => {
console.log(value);
    });
};
let names = [1, 2,];
console.log(valueNames(names));