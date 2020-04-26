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