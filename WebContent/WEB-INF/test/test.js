$(document).ready(function(){
	
	$("#lprice").on('blur',function(){
		var lp = $("#lprice").val();
		if(isNaN(lp)){
			
			var a = "应嘲辉<yzh>";
			a = a.match(/\<(.+?)\>/);
			//a = a.substring(1,a.length-1);
			alert("|"+a+"|");
			alert("请输入数字");
			$("#lprice").val($("#hprice").val());
		}else{
			$("#hprice").val($("#lprice").val());
			format();
			$("#uprice").val(smalltoBIG($("#lprice").val()));
		}
	});
	
	$('p').click(function(){
		var data = "  wqe    qwe qwe qwe ";
		data = data.replace(/(^\s+)|(\s+$)/,"");  //去掉前后空格
		//data = data.replace(/(\s)/g,"");        //去掉所有空格
		alert(data);
		//alert($(this).innerHTML);
		//alert($(this).text());
		alert($('p').eq(0).text());
		$(this).text("把你变成红色。");
		$(this).css("background","red");
		}) 
	
	$(".ex .hide").click(function(){
		$(this).parents(".ex").hide("slow");
	})
	
	$("h3").eq(0).click(function(){
		$(".ex").eq(0).show("slow");
	})
	
	$("h3").eq(1).click(function(){
		$(".ex").eq(1).show("slow");
	})
	
});

function check(){
	var date = new Date();
	var year = date.getYear()%1900+1900;
	var month = date.getMonth()+1;
	month = month>=10 ? month:0+month;
	var result = "tjbh"+ year + month;
	$("#phone").val(result);
	   
	};

function test(){
		var a = document.getElementById("a").value;
		var b = document.getElementById("b").value;
		
	    if(a && b){
	    	alert("两个都有值");     //0，null，undefined，false   会被处理成false 其他视为true
	    	
	    }else{
	    	alert("至少有一个没有值");
	    }
};
//$(".ex").eq(0).is(':hidden')


function overShow(){
	if($(".ex:eq(0)").is(":hidden")){
		//document.getElementById("h31").style.cursor="hand";
		$("#h31").css("cursor","hand");
		//$("#h31").css({cursor:"url('https://g.alicdn.com/browser/uc123_no/0.5.3/index/img/weather/01.png?v=1.0')"});
		$("#h31").attr("title","点击展开");
	}else{
		$("#h31").css("cursor","default");
		$("#h31").attr("title","");
	}
}

/** 数字金额大写转换(可以处理整数,小数,负数) */    
function smalltoBIG(n)     
{    
	n = n.replace(/,/g,"");
    var fraction = ['角', '分'];    
    var digit = ['零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'];    
    var unit = [ ['元', '万', '亿'], ['', '拾', '佰', '仟']  ];    
    var head = n < 0? '负': '';    
    n = Math.abs(n);    
  
    var s = '';    
  
    for (var i = 0; i < fraction.length; i++)     
    {    
        s += (digit[Math.floor(n * 10 * Math.pow(10, i)) % 10] + fraction[i]).replace(/零./, '');    
    }    
    s = s || '整';    
    n = Math.floor(n);    
  
    for (var i = 0; i < unit[0].length && n > 0; i++)     
    {    
        var p = '';    
        for (var j = 0; j < unit[1].length && n > 0; j++)     
        {    
            p = digit[n % 10] + unit[1][j] + p;    
            n = Math.floor(n / 10);    
        }    
        s = p.replace(/(零.)*零$/, '').replace(/^$/, '零')  + unit[0][i] + s;    
    }    
    return head + s.replace(/(零.)*零元/, '元').replace(/(零.)+/g, '零').replace(/^整$/, '零元整');    
}  


function format(){
	var formatV = $("#lprice").val().replace(/,/g,"");
	var array = new Array();
	array = formatV.split(".");
	var re = /(-?\d+)(\d{3})/;
	while(re.test(array[0])){
		array[0] = array[0].replace(re,"$1,$2");
	}
    var returnV = array[0];
    for(var i=1;i<array.length;i++){
    	returnV +="." + array[i];
    }
    $("#lprice").val(returnV);
}


function chouqian(){        //用于列表勾选 判断列表某属性是否相同  来判断是否可以一起审批
	
	var a = "123<yzh>应朝晖;90";
	
	var a = a.match(/<(.+?)>/);  //正则匹配  <>  的内容
    alert(a);
    alert(a[1]);
	
	var num = 0;
	var dateList = new Array();
	$("input:checkbox[name='checkselect']:checked").each(function(){
		dateList[num] =  $(this).val();
		num++;
	});
	
	for(var i =0;i<dateList.length;i++){
		if(!(dateList[0] ==dateList[i])){   //很妙的判断方法
			alert("日期必须为同一天");
			return false;
		}
	}
}

function clearSelect(){ 
	
	var s = "png;jpg;gif";
	var b =s.split(";");
	if(b.indexOf("j")== -1){     //js字符串数组有indexOf方法   java没有
		alert("请上传图片格式");
	}else{
		alert("123")
	}
	
	var a="平件";
	a=encodeURI(a);
	b=decodeURI(a);
	alert(a);
	alert(b);
	$("#select").find("option").eq(0).prop("selected",true);
     
} 

