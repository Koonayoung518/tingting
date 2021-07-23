$(window).on('load', function ()
{
	$('.selectpicker').selectpicker(
	{
		'selectedText': 'cat'
 	});
});
var main = {
    init : function() {
     var _this = this;
     $('#btn_p').on('click',function(){_this.plus();});
     $('#btn_m').on('click',function(){_this.minus();});
    },
    plus : function() {
         var count =document.getElementById("var1").value;
         if(count<5){
             document.getElementById("var1").value = parseInt(count)+1;
                $('#ran_table').append("<tr id=\"ran_userid"+count+"\"><td colspan=\"3\"><input class=\"form-control form-control-5 justify-content-center\" type=\"text\"></td></tr>");

         }

    },
    minus : function() {
            var count =document.getElementById("var1").value;
            if(count>1){
             document.getElementById("var1").value = parseInt(count)-1;
                        $('#ran_userid'+(count-1)).remove();
            }

    }
};
main.init();