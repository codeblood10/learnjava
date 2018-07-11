// objects in javascript are like key value pairs 
// general syntax for defining the objects is  
//let user = new object();  // let scope is nearest block  
 var user = {  
   name :"john", 
   age : 30
 };  

  console.log(user.name); 
  delete  user.age ; 
  var  hobby  = {  
   "type words" :  true  // multiwords propeties must be quoted 
 };  
 // for access the multiword properties we have tu use the square 
 // notation 
 console.log(hobby["type words"]); 
 // computed properties  
  var a = "book";
   var lib = { 
    [a] : "javascript" 
    };  
    console.log(lib.book); 

    // reserved are also allowed in object 
    var obj = {
  for: 1,
  let: 2,
  return: 3
}

console.log( obj.for + obj.let + obj.return );  // 6   
var obj = {
};  
obj._proto_  = 5 ;
console.log(obj._proto_); //object prototype use is not much clear 
function makeUser(name,age ) {
  
  return {
    name: name, // return properties 
    age: age     // return name ,age ;
  };
}

var  use = makeUser("John", 30);
console.log(use.name); // John  
 
var  uid = { 
 //  name ,  not possible 
   age : 30 , 
   nature : undefined 
 };   
   uid = makeUser("ankit");  

console.log(uid.name); 
console .log(uid.i === undefined); // to check if property exist for a  object or not 
// or we can use 
console.log("id" in  uid) ;  
var key = "age" ; 
console.log("key" in user);   
// if an property value is undefined then property does not exist for the objects 
console.log("nature" in uid) ; 
 //for in loop for objects 
 for (var key in uid) 
 { 
    console.log(user[key]); 
 }   
  // as objects are refrence variable when we copy them only reference is copied 
  var t = uid ; 
  t.age = 82 ;  
  console.log(uid.age); 
  const  u = {} ; // this u can be assigned again or given some other refrence  
  //object.assign to merge two objects 
  var  op =  { 
      can : true   
    };  
  var lp = { 
   canv : false  

  }; 
  Object.assign(uid,op,lp); 
  Object.assign(uid , { age: "Pete", isAdmin: true }); 
  for (var key in uid) 
  	{ 
     console.log(key); 
  	}
