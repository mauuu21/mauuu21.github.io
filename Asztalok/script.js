let color = ["red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",
"red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow","red","blue","green", "yellow",];
    let a = 0;
    let b = 0;
    let c = 0;
    let d = 0;
    let e = 0;
    let f = 0;
    let g = 0;
    let h = 0;
    let i = 0;
    let j = 0;
    let k = 0;
    let l = 0;
    let m = 0;
    let n = 0;
    let p = 0;
    let q = 0;

    
    $('.item1').click (() => {
        $('.item1').css('background', color[a]);
        a++;
    });
    $('.item2').click (() => {
        $('.item2').css('background', color[b]);
        b++;
    });
    $('.item3').click (() => {
        $('.item3').css('background', color[c]);
        c++;
    });
    $('.item4').click (() => {
        $('.item4').css('background', color[d]);
        d++;
    });
    $('.item5').click (() => {
        $('.item5').css('background', color[e]);
        e++;
    });
    $('.item6').click (() => {
        $('.item6').css('background', color[f]);
        f++;
    });
    $('.item7').click (() => {
        $('.item7').css('background', color[g]);
        g++;
    });
    $('.item8').click (() => {
        $('.item8').css('background', color[h]);
        h++;
    });
    $('.item9').click (() => {
        $('.item9').css('background', color[i]);
        i++;
    });
    $('.item10').click (() => {
        $('.item10').css('background', color[j]);
        j++;
    });
    $('.item11').click (() => {
        $('.item11').css('background', color[k]);
        k++;
    });
    $('.item12').click (() => {
        $('.item12').css('background', color[l]);
        l++;
    });
    $('.item13').click (() => {
        $('.item13').css('background', color[m]);
        m++;
    });
    $('.item14').click (() => {
        $('.item14').css('background', color[n]);
        n++;
    });
    $('.item15').click (() => {
        $('.item15').css('background', color[p]);
        p++;
    });
    $('.item16').click (() => {
        $('.item16').css('background', color[q]);
        q++;
    });
    $('#todo').click(() => {
        let toDoList = document.getElementById("input").value;
        $('#listBox').append('<li class= "list">' + toDoList + '<img src="bin.png" alt="">' + '<button id= "push"></button></li>');
        $('#push:last-child').click(() => {
            $('.list:last-child').remove('');
          });
          $('input').val('');
        });
    
    
    