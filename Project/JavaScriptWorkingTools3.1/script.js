


$('#todo').click(() => {
    let toDoList = document.getElementById("input").value;
    $('#listBox').append('<li class= "li">' + toDoList + '<img src="bin.png" alt="">' + '<button id= "push"></button></li>');
    $('#push:last-child').click(() => {
        $('li:last-child').remove('');
      });
      $('input').val('');
    });

