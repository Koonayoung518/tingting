var main = {
    var n =1;
    init : function() {
     var _this = this;
     $('#btn_p').on('click',function(){_this.plus();});
     $('#btn_m').on('click',function(){_this.minus();});
    },
    plus : function() {

         var i =document.getElementById("var1");
                if(n==5)
                    return;
                i.innerHTML = ++n;
    },
    minus : function() {
            var i =document.getElementById("var1");
            if(n==1)
                return;
            i.innerHTML= --n;
    }
};
main.init();