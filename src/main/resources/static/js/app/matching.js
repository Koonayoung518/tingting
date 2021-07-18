var main = {
    init : function() {
     var _this = this;
     $('#btn_p').on('click',function(){_this.plus();});
     $('#btn_m').on('click',function(){_this.minus();});
    },
    plus : function() {

         var count =document.getElementById("var1").value;
         if(count!=5)
         document.getElementById("var1").value = parseInt(count)+1;
    },
    minus : function() {
            var count =document.getElementById("var1").value;
            if(count!=1)
            document.getElementById("var1").value = parseInt(count)-1;
    }
};
main.init();