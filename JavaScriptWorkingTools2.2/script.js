

let additionalBlock = {
    title: "Added with javascript",
    text: "This block was added using JavaScript,s Jquery libery. How awesome!"
};

$('#object').append('<h1>' + additionalBlock.title + '</h1>',
'<p>' + additionalBlock.text + '</p>');


let names = ['Tomi', 'Csilla', 'Ildi', 'Zoli', 'Gergely'];
names.push('Mate');
console.log (names);

names.forEach((names) =>{
    if(names === 'Mate'){
        $('#list').append('<li class= "names"><b>' + names +'</b></li>');
    
}else{
    $('#list').append('<li class= "names">' + names +'</li>');
};
});

$('#button1').click(() => {
    console.log('Yea,you clicked me');
});
$('#button2').click(() => {
    $('#button1').text('nope');
});
let color = ['blue'];

/*color.forEach((color) => {
    $('#button3').click(() => {
        $('#button1').css('background', color); 
        $('#button2').css('background', color);
     });
});*/

var i = 0; 


    $('#button3').click(() => {
        i++;
        if(i <= 1) {
            var inputColor = document.getElementById("input1").value;
    $('#button3').css('background', inputColor ); 
    
    console.log(i + ' ' + inputColor);
        } else {
            $('#button3').click(() => {
                console.log('stop pushing ME!!')
            });
        };
    
});



    
  
       
     
    



