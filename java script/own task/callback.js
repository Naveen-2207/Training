function nav(name, callback){
            const greet = `hello ${name}`;
            callback(greet);
        }
        function dis(greet){
            console.log("we are using callback", greet);
        }
        nav("naveen", dis);

function nav(name) {
    return new Promise((a, b) => {
        const greet = `hello ${name}`;
        if (greet) {
            a(greet);
        } else {
            b("rejected");
        }
    });
}
nav("naveen")
.then(a => 
console.log("nav: ", a))
.catch(b =>
console.log("nav: ", b));