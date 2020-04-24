console.log(15 + 3);
console.log('Morvai Máté');


let PrintNumbers = (n) => {

for (let i = 0; i < n; i++) {
    console.log(i); 
}

};
console.log(PrintNumbers(20));

let greet = (name) => {
    return "Hello " + name;
  };

  console.log(greet('Mate'));

  let printValues = (array) => {
    for(let i = 0; i < array.length; i++) {
      console.log(array[i]);
    }
  };

  let numbs = [3, 6, 9 ,12 ,15];
  console.log(printValues(numbs));



  let printValues2 = (array) =>{
      array.forEach(value => {
          console.log(value);
      });
  };

  let numbs2 =[(10-6), 10, 15, 20];
  console.log(printValues2(numbs2));
