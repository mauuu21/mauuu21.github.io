let auroraStats = {
    photo: 'aurora.png',
    title: 'Aurora',
    text: 'Ez egy kép az Aurora jelenségről, elég menő cucc, élőben jobb lenne,de háttérnek sem utolsó!',
};
$('#photo').attr('src', auroraStats.photo);
$('#h1').attr('<h1></h1>', auroraStats.title);
$('#p').attr('<p></p>', auroraStats.text);

let birdStats = {
    photo: 'bird.png',
    title: 'Bird',
    text: 'Ezen a képen egy madár látható,amint kajázik valami fa termését.'
};
$('#photo').attr('src',birdStats.photo);
$('#h1').attr('<h1></h1>', birdStats.title);
$('#p').attr('<p></p>', birdStats.text);

let butterflyStats = {
    photo: 'butterfly.png',
    title: "Butterfly's",
    text: 'Íme egy fenomenális kép az éjszakában,amint pillangók csoportos garázdaságra készülnek...'
};
$('#photo').attr('src', butterflyStats.photo);
$('#h1').attr('<h1></h1>', butterflyStats.title);
$('#p').attr('<p></p>', butterflyStats.text);

let castleWomanStats = {
    photo: 'castle-woman.png',
    title: 'Fantasy',
    text: 'Ki is nem szeretné a Fantasyket? A képen egy hercegnő látható amint lebegő kastélyát kémleli.'
};
$('#photo').attr('src', castleWomanStats.photo);
$('#h1').attr('<h1></h1>', castleWomanStats.title);
$('#p').attr('<p></p>', castleWomanStats.text);

let frogStats = {
    photo: 'frog.png',
    title: "Mr. Frog",
    text: 'Mr. Frog lazít a wasserban, miközben Mrs. Butterfly épp a haját fonja'
};
$('#photo').attr('src', frogStats.photo);
$('#h1').attr('<h1></h1>', frogStats.title);
$('#p').attr('<p></p>', frogStats.text);

let jellyFishStats= {
    photo: 'jellyfish.png',
    title: "Jellyfish",
    text: 'Isteni fényben tündököl a medkó,akinek foggalma sincs holvan és senkitől nem tud útbaigazítást kérni.'
};
$('#photo').attr('src', jellyFishStats.photo);
$('#h1').attr('<h1></h1>', jellyFishStats.title);
$('#p').attr('<p></p>', jellyFishStats.text);

let treeStats = {
    photo: 'tree.png',
    title: "Tree's",
    text: 'Felkelő nap hátterében néhány öreg fa fent a dombon...Nem tom mit csinál a fotós, szerintem ott hugyozott.'
};
$('#photo').attr('src', treeStats.photo);
$('#h1').attr('<h1></h1>', treeStats.title);
$('#p').attr('<p></p>', treeStats.text);

let currentPhoto = 0;
let gallery = [auroraStats, birdStats, butterflyStats, castleWomanStats, frogStats, jellyFishStats, treeStats];

$('#photo').attr('src', gallery[currentPhoto].photo);
$('#h1').attr('<h1></h1>', gallery[currentPhoto].title);
$('#p').attr('<p></p>', gallery[currentPhoto].text);

let loadPhoto = (photoNumber) => {
    $('#photo').attr('src', gallery[photoNumber].photo);
    $('#h1').attr('<h1></h1>', gallery[photoNumber].title);
    $('#p').attr('<p></p>', gallery[photoNumber].text);
}

loadPhoto(currentPhoto);

$('#right').click(() => {
    if(currentPhoto < 7) {
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

