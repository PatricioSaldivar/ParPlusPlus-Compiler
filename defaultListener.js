
const {ParPlusPlusListener} = require('./ParPlusPlusListener');

class DefaultListener extends ParPlusPlusListener {
    // Override any method needed.
    enterProgram(ctx) {
        console.log(ctx.ID().getText());
        console.log('hello ');
    };
    
    exitProgram(ctx) {
        console.log('on exit ');
        console.log(ctx.ID().getText());
    };
    
   
}


module.exports = DefaultListener;