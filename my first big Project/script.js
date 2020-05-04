let auroraStats = {
    photo: 'aurora.png',
    title: 'Aurora',
    text: 'Ez egy kép az Aurora jelenségről, elég menő cucc, élőben jobb lenne,de háttérnek sem utolsó!',
    thumbnail: 'Aurora'
};
$('#photo').attr('src', auroraStats.photo);
$('#title').text(auroraStats.title);
$('#description').text(auroraStats.text);


let birdStats = {
    photo: 'bird.png',
    title: 'Bird',
    text: 'Ezen a képen egy madár látható,amint kajázik valami fa termését.',
    thumbnail: "Bird"
};
$('#photo').attr(birdStats.photo);
$('#title').text(birdStats.title);
$('#description').text(birdStats.text);


let butterflyStats = {
    photo: 'butterfly.png',
    title: "Butterfly's",
    text: 'Íme egy fenomenális kép az éjszakában,amint pillangók csoportos garázdaságra készülnek...',
    thumbnail: "Butterfly's"
};
$('#photo').attr('src', butterflyStats.photo);
$('#title').text(butterflyStats.title);
$('#description').text(butterflyStats.text);



let castleWomanStats = {
    photo: 'castle-woman.png',
    title: 'Fantasy',
    text: 'Ki is nem szeretné a Fantasyket? A képen egy hercegnő látható amint lebegő kastélyát kémleli.',
    thumbnail: 'Fantasy'
};
$('#photo').attr('src', castleWomanStats.photo);
$('#title').text(castleWomanStats.title);
$('#description').text(castleWomanStats.text);



let frogStats = {
    photo: 'frog.png',
    title: "Mr. Frog",
    text: 'Mr. Frog lazít a wasserban, miközben Mrs. Butterfly épp a haját fonja',
    thumbnail: 'Mr.Frog'
};
$('#photo').attr('src', frogStats.photo);
$('#title').text(frogStats.title);
$('#description').text(frogStats.text);



let jellyFishStats= {
    photo: 'jellyfish.png',
    title: "Jellyfish",
    text: 'Isteni fényben tündököl a medkó,akinek foggalma sincs holvan és senkitől nem tud útbaigazítást kérni.',
    thumbnail: 'JellyFish'
};
$('#photo').attr('src', jellyFishStats.photo);
$('#title').text(jellyFishStats.title);
$('#description').text(jellyFishStats.text);



let treeStats = {
    photo: 'tree.png',
    title: "Tree's",
    text: 'Felkelő nap hátterében néhány öreg fa fent a dombon...Nem tom mit csinál a fotós, szerintem ott hugyozott.',
    thumbnail: "Tree's"
};
$('#photo').attr('src', treeStats.photo);
$('#title').text(treeStats.title);
$('#description').text(treeStats.text);



let currentPhoto = 0;
let gallery = [auroraStats, birdStats, butterflyStats, castleWomanStats, frogStats, jellyFishStats, treeStats];

$('#photo').attr('src', gallery[currentPhoto].photo);
$('#title').text(gallery[currentPhoto].title);
$('#description').text(gallery[currentPhoto].text);

let borderCss = 'red ridge';
let borderdefault = 'ridge';


$('#0').click (() => {
    $('#photo').attr('src',gallery[0].photo);
    currentPhoto = 0;
    $('#0').css('border', borderCss);
    $('#1, #2, #3, #4, #5, #6').css('border', borderdefault);
});
$('#1').click (() => {
    $('#photo').attr('src',gallery[1].photo);
    currentPhoto = 1;
    $('#1').css('border', borderCss);
    $('#0, #2, #3, #4, #5, #6').css('border', borderdefault);
});
$('#2').click (() => {
    $('#photo').attr('src',gallery[2].photo);
    currentPhoto = 2;
    $('#2').css('border', borderCss);
    $('#1, #0, #3, #4, #5, #6').css('border', borderdefault);
});
$('#3').click (() => {
    $('#photo').attr('src',gallery[3].photo);
    currentPhoto = 3;
    $('#3').css('border', borderCss);
    $('#1, #2, #0, #4, #5, #6').css('border', borderdefault);
});
$('#4').click (() => {
    $('#photo').attr('src',gallery[4].photo);
    currentPhoto = 4;
    $('#4').css('border', borderCss);
    $('#1, #2, #3, #0, #5, #6').css('border', borderdefault);
});
$('#5').click (() => {
    $('#photo').attr('src',gallery[5].photo);
    currentPhoto = 5;
    $('#5').css('border', borderCss);
    $('#1, #2, #3, #4, #0, #6').css('border', borderdefault);
});
$('#6').click (() => {
    $('#photo').attr('src',gallery[6].photo);
    currentPhoto = 6;
    $('#6').css('border', borderCss);
    $('#1, #2, #3, #4, #5, #0').css('border', borderdefault);
});

let loadPhoto = (photoNumber) => {
    $('#photo').attr('src', gallery[photoNumber].photo);
    $('#title').text(gallery[photoNumber].title);
    $('#description').text(gallery[photoNumber].text);
    $('.pictures').css('border', 'ridge');
    let picturesBorder =  document.getElementById([currentPhoto]);
    $(picturesBorder).css('border-color', 'red');
};

loadPhoto(currentPhoto);

$('#right').click(() => {
    if(currentPhoto < 6) {
        currentPhoto++;
        loadPhoto(currentPhoto);
        console.log(currentPhoto);
    };
});

$('#left').click(() =>{
    if(currentPhoto > 0) {
        currentPhoto--;
        loadPhoto(currentPhoto);
        console.log(currentPhoto);
    };
});




