let counter = 0;


$('#button1').click(() => {
    counter++;
    $('h2').text(counter);
});

$('#button2').click(() => {
    counter--;
    $('h2').text(counter);
});